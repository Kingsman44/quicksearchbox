package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gv */
/* compiled from: PG */
public final class C6969gv {

    /* renamed from: a */
    public static final C6969gv f22231a = new C6969gv(-1, -1, -1);

    /* renamed from: b */
    public final int f22232b;

    /* renamed from: c */
    public final int f22233c;

    /* renamed from: d */
    public final int f22234d;

    /* renamed from: e */
    public final int f22235e;

    public C6969gv(int i, int i2, int i3) {
        this.f22232b = i;
        this.f22233c = i2;
        this.f22234d = i3;
        this.f22235e = aeu.m18506X(i3) ? aeu.m18510aa(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f22232b;
        int i2 = this.f22233c;
        int i3 = this.f22234d;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }
}
