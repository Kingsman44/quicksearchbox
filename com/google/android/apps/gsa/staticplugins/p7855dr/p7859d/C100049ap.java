package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90248c;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23214k;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.ap */
/* compiled from: PG */
public final class C100049ap implements C23214k {

    /* renamed from: a */
    public final /* synthetic */ C100053at f279778a;

    /* renamed from: b */
    private final View f279779b;

    /* renamed from: c */
    private ChildStub f279780c;

    public C100049ap(C100053at atVar, View view) {
        this.f279778a = atVar;
        this.f279779b = view;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        View il = dVar.mo28297il();
        il.getClass();
        if (this.f279780c == null) {
            View view = this.f279779b;
            view.getClass();
            ChildStub childStub = (ChildStub) view.findViewById(R.id.logo_header);
            childStub.getClass();
            this.f279780c = childStub;
        }
        ChildStub childStub2 = this.f279780c;
        childStub2.f63703a = il.getVisibility();
        childStub2.mo28716a();
        this.f279780c.mo28718c(il);
        C90248c cVar = (C90248c) dVar;
        C100053at atVar = this.f279778a;
        atVar.f279817v = cVar;
        if (atVar.mo91731r()) {
            cVar.mo83964b(new C100047an(this));
        }
        cVar.mo83965c(new C100048ao(this));
        this.f279778a.mo91730q();
        this.f279778a.mo91725j();
    }

    /* renamed from: b */
    public final void mo28676b(C22939d dVar) {
        ChildStub childStub = this.f279780c;
        if (childStub != null) {
            childStub.mo28717b();
            ((C90248c) dVar).mo83965c((C100048ao) null);
            C100053at atVar = this.f279778a;
            atVar.f279817v = null;
            atVar.f279813r = 0;
            C90714z zVar = atVar.f279815t;
            if (zVar != null) {
                zVar.mo85044h(false, false);
            }
            this.f279778a.mo91730q();
            this.f279778a.mo91726k();
            return;
        }
        throw new IllegalStateException("childStub was null.");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo91720c(int i) {
        C100053at atVar = this.f279778a;
        atVar.f279813r = i;
        atVar.mo91726k();
    }
}
