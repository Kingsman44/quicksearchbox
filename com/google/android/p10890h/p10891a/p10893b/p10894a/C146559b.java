package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.net.Uri;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import com.google.android.p10890h.p10891a.p10893b.C146582m;

/* renamed from: com.google.android.h.a.b.a.b */
/* compiled from: PG */
public final class C146559b extends C146579j {

    /* renamed from: b */
    private final C146582m f395801b;

    /* renamed from: c */
    private int f395802c = 1;

    public C146559b(C146582m mVar) {
        this.f395801b = mVar;
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("seq");
        C146580k kVar = this.f395862a;
        int i = this.f395802c + 1;
        this.f395802c = i;
        kVar.mo123373c("seq", Uri.encode(Integer.toString(i), ",:"));
        this.f395862a.mo123374d("fexp");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95070d() {
        this.f395862a.mo123373c("event", Uri.encode("streamingstats", ",:"));
        this.f395862a.mo123373c("ns", Uri.encode(this.f395801b.mo95064b(), ",:"));
        this.f395862a.mo123373c("docid", Uri.encode(this.f395801b.mo95063a(), ",:"));
        this.f395862a.mo123373c("seq", Uri.encode(Integer.toString(this.f395802c), ",:"));
        for (Long l : this.f395801b.mo95065c()) {
            this.f395862a.mo123373c("fexp", Uri.encode(l.toString(), ",:"));
        }
    }
}
