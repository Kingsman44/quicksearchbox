package p3186j$.util;

import java.util.NoSuchElementException;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.OptionalInt */
public final class OptionalInt {

    /* renamed from: c */
    private static final OptionalInt f107519c = new OptionalInt();

    /* renamed from: a */
    private final boolean f107520a;

    /* renamed from: b */
    private final int f107521b;

    private OptionalInt() {
        this.f107520a = false;
        this.f107521b = 0;
    }

    private OptionalInt(int i) {
        this.f107520a = true;
        this.f107521b = i;
    }

    public static OptionalInt empty() {
        return f107519c;
    }

    /* renamed from: of */
    public static OptionalInt m71640of(int i) {
        return new OptionalInt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalInt)) {
            return false;
        }
        OptionalInt optionalInt = (OptionalInt) obj;
        boolean z = this.f107520a;
        if (!z || !optionalInt.f107520a) {
            if (z == optionalInt.f107520a) {
                return true;
            }
        } else if (this.f107521b == optionalInt.f107521b) {
            return true;
        }
        return false;
    }

    public int getAsInt() {
        if (this.f107520a) {
            return this.f107521b;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        if (this.f107520a) {
            return this.f107521b;
        }
        return 0;
    }

    public void ifPresent(IntConsumer intConsumer) {
        if (this.f107520a) {
            intConsumer.accept(this.f107521b);
        }
    }

    public boolean isPresent() {
        return this.f107520a;
    }

    public int orElse(int i) {
        return this.f107520a ? this.f107521b : i;
    }

    public final String toString() {
        if (!this.f107520a) {
            return "OptionalInt.empty";
        }
        return String.format("OptionalInt[%s]", new Object[]{Integer.valueOf(this.f107521b)});
    }
}
