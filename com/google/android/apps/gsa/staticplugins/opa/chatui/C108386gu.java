package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gu */
/* compiled from: PG */
final class C108386gu implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C60870cx f301459a;

    /* renamed from: b */
    final /* synthetic */ C108387gv f301460b;

    public C108386gu(C108387gv gvVar, C60870cx cxVar) {
        this.f301460b = gvVar;
        this.f301459a = cxVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C108387gv.f301461a.mo56225c()).mo56382g(th)).mo56372aa(24023)).mo56386p("Thumbnail loading failed");
        synchronized (this.f301460b.f301468J) {
            this.f301460b.f301467I.remove(this.f301459a);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        synchronized (this.f301460b.f301468J) {
            this.f301460b.f301467I.remove(this.f301459a);
        }
    }
}
