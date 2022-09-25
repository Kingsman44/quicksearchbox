package com.google.p386ak.p388b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* renamed from: com.google.ak.b.ac */
/* compiled from: PG */
public final class C8329ac extends Number {

    /* renamed from: a */
    private final String f29145a;

    public C8329ac(String str) {
        this.f29145a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f29145a);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f29145a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8329ac)) {
            return false;
        }
        String str = this.f29145a;
        String str2 = ((C8329ac) obj).f29145a;
        return str == str2 || str.equals(str2);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f29145a);
    }

    public final int hashCode() {
        return this.f29145a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f29145a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f29145a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f29145a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f29145a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f29145a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.C8329ac.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f29145a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f29145a).longValue();
        }
    }

    public final String toString() {
        return this.f29145a;
    }
}
