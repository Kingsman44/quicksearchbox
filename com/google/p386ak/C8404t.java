package com.google.p386ak;

import com.google.p386ak.p388b.C8329ac;
import java.math.BigInteger;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.t */
/* compiled from: PG */
public final class C8404t extends C8398n {

    /* renamed from: a */
    public final Object f29256a;

    public C8404t(Boolean bool) {
        this.f29256a = Objects.requireNonNull(bool);
    }

    /* renamed from: c */
    private static boolean m23254c(C8404t tVar) {
        Object obj = tVar.f29256a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Number mo17173a() {
        Object obj = this.f29256a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new C8329ac((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: b */
    public final long mo17152b() {
        return this.f29256a instanceof Number ? mo17173a().longValue() : Long.parseLong(mo17154d());
    }

    /* renamed from: d */
    public final String mo17154d() {
        Object obj = this.f29256a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return mo17173a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    /* renamed from: e */
    public final boolean mo17155e() {
        Object obj = this.f29256a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(mo17154d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8404t tVar = (C8404t) obj;
        if (this.f29256a == null) {
            return tVar.f29256a == null;
        }
        if (m23254c(this) && m23254c(tVar)) {
            return mo17173a().longValue() == tVar.mo17173a().longValue();
        }
        Object obj2 = this.f29256a;
        if (!(obj2 instanceof Number) || !(tVar.f29256a instanceof Number)) {
            return obj2.equals(tVar.f29256a);
        }
        double doubleValue = mo17173a().doubleValue();
        double doubleValue2 = tVar.mo17173a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f29256a == null) {
            return 31;
        }
        if (m23254c(this)) {
            doubleToLongBits = mo17173a().longValue();
        } else {
            Object obj = this.f29256a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo17173a().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public C8404t(Number number) {
        this.f29256a = Objects.requireNonNull(number);
    }

    public C8404t(String str) {
        this.f29256a = Objects.requireNonNull(str);
    }
}
