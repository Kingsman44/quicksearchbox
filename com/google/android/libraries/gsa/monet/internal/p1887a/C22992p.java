package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.p */
/* compiled from: PG */
public final class C22992p {

    /* renamed from: a */
    public final C22995s f63240a;

    /* renamed from: b */
    public final C23084ao f63241b;

    /* renamed from: c */
    public final C23128x f63242c;

    public C22992p(C22995s sVar, C23084ao aoVar, C23128x xVar) {
        this.f63240a = sVar;
        this.f63241b = aoVar;
        this.f63242c = xVar;
    }

    /* renamed from: b */
    static void m43057b(C22977at atVar, C22960ac acVar) {
        boolean equals = atVar.f63194b.f63391d.equals(acVar.f63143e);
        C23042g gVar = atVar.f63194b;
        C23067b.m43231d(equals, "The feature's type doesn't match the renderer's type (feature ID: %s, feature's type: %s, renderer's type: %s)", gVar.f63388a, gVar.f63391d, acVar.f63143e);
    }

    /* renamed from: a */
    public final C22977at mo28377a(String str) {
        C22977at a = this.f63240a.mo28386a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Unknown feature ID: ".concat(String.valueOf(str)));
    }
}
