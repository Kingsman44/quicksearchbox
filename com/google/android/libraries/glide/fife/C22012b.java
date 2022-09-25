package com.google.android.libraries.glide.fife;

import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.google.android.libraries.glide.fife.b */
/* compiled from: PG */
public final class C22012b {

    /* renamed from: a */
    public final FifeUrl f60723a;

    /* renamed from: b */
    public final C22017g f60724b;

    /* renamed from: c */
    private final C22011a f60725c;

    static {
        int i = C22017g.f60730f;
    }

    public C22012b(FifeUrl fifeUrl, C22017g gVar, C22011a aVar) {
        this.f60723a = fifeUrl;
        this.f60724b = gVar;
        this.f60725c = aVar;
    }

    public C22012b(String str, C22017g gVar) {
        this(new ProvidedFifeUrl(str), gVar, new C22011a());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22012b) {
            C22012b bVar = (C22012b) obj;
            if (!this.f60723a.equals(bVar.f60723a) || !this.f60724b.equals(bVar.f60724b) || !this.f60725c.equals(bVar.f60725c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C5632s.m14612e(this.f60723a, C5632s.m14612e(this.f60724b, this.f60725c.hashCode()));
    }

    public final String toString() {
        String obj = this.f60723a.toString();
        String obj2 = this.f60724b.toString();
        String obj3 = this.f60725c.toString();
        return "FifeModel{fifeUrl='" + obj + "', fifeUrlOptions='" + obj2 + "', accountInfo='" + obj3 + "'}";
    }
}
