package p3186j$.util;

import java.util.NoSuchElementException;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.OptionalDouble */
public final class OptionalDouble {

    /* renamed from: c */
    private static final OptionalDouble f107516c = new OptionalDouble();

    /* renamed from: a */
    private final boolean f107517a;

    /* renamed from: b */
    private final double f107518b;

    private OptionalDouble() {
        this.f107517a = false;
        this.f107518b = Double.NaN;
    }

    private OptionalDouble(double d) {
        this.f107517a = true;
        this.f107518b = d;
    }

    public static OptionalDouble empty() {
        return f107516c;
    }

    /* renamed from: of */
    public static OptionalDouble m71639of(double d) {
        return new OptionalDouble(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalDouble)) {
            return false;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        boolean z = this.f107517a;
        if (!z || !optionalDouble.f107517a) {
            if (z == optionalDouble.f107517a) {
                return true;
            }
        } else if (Double.compare(this.f107518b, optionalDouble.f107518b) == 0) {
            return true;
        }
        return false;
    }

    public double getAsDouble() {
        if (this.f107517a) {
            return this.f107518b;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (!this.f107517a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f107518b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public void ifPresent(DoubleConsumer doubleConsumer) {
        if (this.f107517a) {
            doubleConsumer.accept(this.f107518b);
        }
    }

    public boolean isEmpty() {
        return !this.f107517a;
    }

    public boolean isPresent() {
        return this.f107517a;
    }

    public double orElse(double d) {
        return this.f107517a ? this.f107518b : d;
    }

    public final String toString() {
        if (!this.f107517a) {
            return "OptionalDouble.empty";
        }
        return String.format("OptionalDouble[%s]", new Object[]{Double.valueOf(this.f107518b)});
    }
}
