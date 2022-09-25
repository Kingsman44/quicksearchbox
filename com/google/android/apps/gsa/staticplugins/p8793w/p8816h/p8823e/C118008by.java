package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117678a;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117688b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.by */
/* compiled from: PG */
public final /* synthetic */ class C118008by implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C118024cn f327512a;

    public /* synthetic */ C118008by(C118024cn cnVar) {
        this.f327512a = cnVar;
    }

    public final C60870cx apply(Object obj) {
        C118024cn cnVar = this.f327512a;
        C117688b bVar = new C117688b(cnVar.f327557p, cnVar.f327551j, cnVar.f327559r);
        byte[] bArr = ((a) obj).c;
        if (bArr == null || bArr.length == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty audio, skipping."));
        }
        return bVar.f326663c.mo28201a("Dump audio file", new C117678a(bVar, bArr));
    }
}
