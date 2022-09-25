package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7073ab.C90175a;
import com.google.android.apps.gsa.shared.p7148ui.C90632ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.as */
/* compiled from: PG */
final class C100052as extends C23243a {

    /* renamed from: a */
    final /* synthetic */ C100053at f279783a;

    /* renamed from: b */
    private final C90632ah f279784b = new C100051ar(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100052as(C100053at atVar, View view) {
        super(R.id.srp_content, view);
        this.f279783a = atVar;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        super.mo28675a(dVar);
        C100053at atVar = this.f279783a;
        atVar.f279818w = dVar;
        ((C90175a) atVar.f279818w).mo83923a().mo84822r(this.f279784b);
        this.f279783a.mo91730q();
        this.f279783a.mo91725j();
    }

    /* renamed from: b */
    public final void mo28676b(C22939d dVar) {
        C22939d dVar2 = this.f279783a.f279818w;
        if (dVar2 != null) {
            ((C90175a) dVar2).mo83923a().mo84825s(this.f279784b);
        }
        super.mo28676b(dVar);
        this.f279783a.f279818w = null;
    }
}
