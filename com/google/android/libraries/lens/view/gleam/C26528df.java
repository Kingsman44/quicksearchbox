package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.render.C27670l;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.gleam.df */
/* compiled from: PG */
public final /* synthetic */ class C26528df implements C27670l {

    /* renamed from: a */
    public final /* synthetic */ C26540dr f72318a;

    public /* synthetic */ C26528df(C26540dr drVar) {
        this.f72318a = drVar;
    }

    /* renamed from: a */
    public final void mo31807a() {
        C26540dr drVar = this.f72318a;
        if (drVar.f72359z.mo56113h()) {
            drVar.mo31813f((C28097c) drVar.f72359z.mo56107c());
            drVar.f72359z = C58836b.f156633a;
            return;
        }
        ((C58970a) ((C58970a) C26540dr.f72331a.mo56226d()).mo56372aa(49447)).mo56386p("Imp onRenderingComplete while pending frame absent.");
    }
}
