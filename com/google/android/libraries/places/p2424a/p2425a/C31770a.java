package com.google.android.libraries.places.p2424a.p2425a;

/* renamed from: com.google.android.libraries.places.a.a.a */
/* compiled from: PG */
public final class C31770a extends C31772c {

    /* renamed from: a */
    public String f85378a;

    /* renamed from: b */
    public int f85379b;

    /* renamed from: c */
    public byte f85380c;

    /* renamed from: d */
    public int f85381d;

    /* renamed from: a */
    public final C31773d mo37372a() {
        String str;
        int i;
        if (this.f85380c == 1 && (str = this.f85378a) != null && (i = this.f85381d) != 0) {
            return new C31771b(str, this.f85379b, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f85378a == null) {
            sb.append(" packageName");
        }
        if (this.f85380c == 0) {
            sb.append(" versionCode");
        }
        if (this.f85381d == 0) {
            sb.append(" requestSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
