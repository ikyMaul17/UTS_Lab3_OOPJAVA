public class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImag = this.imag - other.imag;
        return new Complex(newReal, newImag);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.real;
        return new Complex(newReal, newImag);
    }

    public Complex divide(Complex other) {
        double denom = other.real * other.real + other.imag * other.imag;
        double newReal = (this.real * other.real + this.imag * other.imag) / denom;
        double newImag = (this.imag * other.real - this.real * other.imag) / denom;
        return new Complex(newReal, newImag);
    }

    public String toString() {
        return real + " + " + imag + "i";
    }
}