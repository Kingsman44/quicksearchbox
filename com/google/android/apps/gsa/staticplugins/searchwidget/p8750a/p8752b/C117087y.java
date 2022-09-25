package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7090i.C90245a;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117095g;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.y */
/* compiled from: PG */
public final class C117087y extends C23056g {

    /* renamed from: a */
    public final Context f325093a;

    /* renamed from: b */
    public C117062aj f325094b;

    /* renamed from: c */
    public C117064b f325095c;

    /* renamed from: d */
    public final C87290c f325096d;

    /* renamed from: e */
    private final C117095g f325097e;

    public C117087y(C23052c cVar, C117095g gVar, C87290c cVar2, Context context) {
        super(cVar);
        this.f325093a = context;
        this.f325097e = gVar;
        this.f325096d = cVar2;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        if (((C117074l) this.f325097e).f325048b.mo28635p(xVar)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C117074l) this.f325097e).f325048b.mo28634o(xVar);
        }
        if (((C117074l) this.f325097e).f325047a.mo28635p(xVar)) {
            C58976aa aaVar2 = C58975e.f156826a;
            ((C117074l) this.f325097e).f325047a.mo28634o(xVar);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C117074l) this.f325097e).f325048b.mo28623d(C90245a.f252096c, protoParcelable);
        ((C117074l) this.f325097e).f325047a.mo28623d(C90245a.f252101h, ProtoParcelable.f63423a);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C23056g a = ((C117074l) this.f325097e).f325048b.mo28620a();
        a.getClass();
        this.f325094b = (C117062aj) a;
        C23056g a2 = ((C117074l) this.f325097e).f325047a.mo28620a();
        a2.getClass();
        C117064b bVar = (C117064b) a2;
        this.f325095c = bVar;
        bVar.f325017a = new C117086x(this);
    }
}
