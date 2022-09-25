package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7089h.C90244b;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.apps.gsa.shared.p7148ui.header.C90692e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.am */
/* compiled from: PG */
public final class C100046am extends C23243a {

    /* renamed from: a */
    final /* synthetic */ C100053at f279774a;

    /* renamed from: b */
    private boolean f279775b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100046am(C100053at atVar, View view) {
        super(R.id.corpus_bar, view);
        this.f279774a = atVar;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        super.mo28675a(dVar);
        C100053at atVar = this.f279774a;
        atVar.f279816u = (C90244b) dVar;
        atVar.f279816u.mo83952e(new C100045al(this));
        this.f279774a.mo91725j();
    }

    /* renamed from: b */
    public final void mo28676b(C22939d dVar) {
        super.mo28676b(dVar);
        C90244b bVar = this.f279774a.f279816u;
        if (bVar != null) {
            bVar.mo83952e((C100045al) null);
        }
        C100053at atVar = this.f279774a;
        atVar.f279816u = null;
        C90714z zVar = atVar.f279814s;
        if (zVar != null) {
            zVar.mo85044h(false, false);
        }
        this.f279774a.mo91726k();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo91719c(boolean z) {
        if (z != this.f279775b) {
            this.f279775b = z;
            this.f279774a.mo91726k();
        }
        C90692e eVar = this.f279774a.f279809n;
        if (eVar != null && z) {
            eVar.mo85010c(true);
        }
    }
}
