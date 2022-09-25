package com.google.android.libraries.elements.p1729h;

/* renamed from: com.google.android.libraries.elements.h.a */
/* compiled from: PG */
final class C21197a extends C21227y {

    /* renamed from: a */
    public Long f59464a;

    /* renamed from: b */
    public Long f59465b;

    /* renamed from: c */
    public Long f59466c;

    /* renamed from: d */
    public C21198aa f59467d;

    /* renamed from: e */
    private String f59468e;

    /* renamed from: f */
    private Integer f59469f;

    /* renamed from: a */
    public final C21200ac mo26219a() {
        String str = this.f59468e;
        if (str != null) {
            return new C21204b(str, this.f59464a, this.f59465b, this.f59466c, this.f59469f, this.f59467d);
        }
        throw new IllegalStateException("Missing required properties: name");
    }

    /* renamed from: b */
    public final void mo26220b(String str) {
        if (str != null) {
            this.f59468e = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: c */
    public final void mo26221c(Integer num) {
        this.f59469f = num;
    }
}
