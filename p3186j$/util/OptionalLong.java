package p3186j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.OptionalLong */
public final class OptionalLong {

    /* renamed from: c */
    private static final OptionalLong f107522c = new OptionalLong();

    /* renamed from: a */
    private final boolean f107523a;

    /* renamed from: b */
    private final long f107524b;

    private OptionalLong() {
        this.f107523a = false;
        this.f107524b = 0;
    }

    private OptionalLong(long j) {
        this.f107523a = true;
        this.f107524b = j;
    }

    public static OptionalLong empty() {
        return f107522c;
    }

    /* renamed from: of */
    public static OptionalLong m71641of(long j) {
        return new OptionalLong(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        boolean z = this.f107523a;
        if (!z || !optionalLong.f107523a) {
            if (z == optionalLong.f107523a) {
                return true;
            }
        } else if (this.f107524b == optionalLong.f107524b) {
            return true;
        }
        return false;
    }

    public long getAsLong() {
        if (this.f107523a) {
            return this.f107524b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (!this.f107523a) {
            return 0;
        }
        long j = this.f107524b;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isEmpty() {
        return !this.f107523a;
    }

    public boolean isPresent() {
        return this.f107523a;
    }

    public long orElse(long j) {
        return this.f107523a ? this.f107524b : j;
    }

    public final String toString() {
        if (!this.f107523a) {
            return "OptionalLong.empty";
        }
        return String.format("OptionalLong[%s]", new Object[]{Long.valueOf(this.f107524b)});
    }
}
