package com.google.apps.p3589d.p3600k;

/* renamed from: com.google.apps.d.k.e */
/* compiled from: PG */
public abstract class C45940e extends C45941f {
    /* renamed from: a */
    public abstract int mo50035a();

    /* renamed from: b */
    public abstract int mo50036b();

    /* renamed from: c */
    public abstract int mo50037c();

    /* renamed from: d */
    public abstract int mo50038d();

    /* renamed from: h */
    public final String mo50054h() {
        StringBuilder sb = new StringBuilder("#");
        sb.append("0123456789ABCDEF".charAt((mo50038d() / 16) % 16));
        sb.append("0123456789ABCDEF".charAt(mo50038d() % 16));
        sb.append("0123456789ABCDEF".charAt((mo50037c() / 16) % 16));
        sb.append("0123456789ABCDEF".charAt(mo50037c() % 16));
        sb.append("0123456789ABCDEF".charAt((mo50036b() / 16) % 16));
        sb.append("0123456789ABCDEF".charAt(mo50036b() % 16));
        if (mo50035a() != 255) {
            sb.append("0123456789ABCDEF".charAt((mo50035a() / 16) % 16));
            sb.append("0123456789ABCDEF".charAt(mo50035a() % 16));
        }
        return sb.toString();
    }
}
