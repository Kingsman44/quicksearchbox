package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aso */
/* compiled from: PG */
final class aso extends arx {

    /* renamed from: a */
    final transient Object f21501a;

    /* renamed from: b */
    private transient int f21502b;

    public aso(Object obj) {
        aqd.m19282j(obj);
        this.f21501a = obj;
    }

    /* renamed from: a */
    public final asp iterator() {
        return new arz(this.f21501a);
    }

    public final boolean contains(Object obj) {
        return this.f21501a.equals(obj);
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return false;
    }

    /* renamed from: g */
    public final int mo15279g(Object[] objArr) {
        objArr[0] = this.f21501a;
        return 1;
    }

    public final int hashCode() {
        int i = this.f21502b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f21501a.hashCode();
        this.f21502b = hashCode;
        return hashCode;
    }

    /* renamed from: l */
    public final boolean mo15336l() {
        return this.f21502b != 0;
    }

    /* renamed from: m */
    public final arn mo15337m() {
        return arn.m19403j(this.f21501a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f21501a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public aso(Object obj, int i) {
        this.f21501a = obj;
        this.f21502b = i;
    }
}
