package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.m */
/* compiled from: PG */
public final /* synthetic */ class C117591m implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117598t f326415a;

    public /* synthetic */ C117591m(C117598t tVar) {
        this.f326415a = tVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117598t tVar = this.f326415a;
        Integer num = (Integer) obj;
        if (tVar.f326435k != null) {
            tVar.mo103395e();
        }
        if (num.intValue() > 0) {
            tVar.f326435k = tVar.f326425a.mo28208h("Report an error if the vid hasn't finished buffering after a few seconds.", (long) num.intValue(), new C117589k(tVar));
        }
    }
}
