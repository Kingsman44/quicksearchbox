package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.p5294a.C68221g;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.b */
/* compiled from: PG */
public final /* synthetic */ class C81990b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C82003k f224145a;

    public /* synthetic */ C81990b(C82003k kVar) {
        this.f224145a = kVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C82003k kVar = this.f224145a;
        View view = (View) obj;
        if (kVar.f224170d.mo75442e() == null && kVar.f224170d.mo75441d() == null) {
            kVar.f224170d.mo75443f();
            kVar.f224173g.mo76660b(Optional.m71637of(view));
            return;
        }
        C81976am amVar = kVar.f224171e;
        Optional ofNullable = Optional.ofNullable(kVar.f224170d.mo75442e());
        Optional ofNullable2 = Optional.ofNullable(kVar.f224170d.mo75441d());
        int a = kVar.f224170d.mo75440a();
        C81998f fVar = new C81998f(kVar, view);
        view.getClass();
        ofNullable.getClass();
        ofNullable2.getClass();
        C69464a aVar = amVar.f224118a;
        Context context = (Context) ((C68221g) amVar.f224119b).f184583a;
        context.getClass();
        C22871g gVar = (C22871g) ((C68221g) amVar.f224120c).f184583a;
        gVar.getClass();
        C22871g gVar2 = (C22871g) ((C68221g) amVar.f224121d).f184583a;
        gVar2.getClass();
        kVar.f224174h = new C81975al(view, ofNullable, ofNullable2, a, fVar, context, gVar, gVar2);
        kVar.f224174h.mo75424b();
    }
}
