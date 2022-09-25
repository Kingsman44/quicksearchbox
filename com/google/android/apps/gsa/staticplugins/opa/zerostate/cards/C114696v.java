package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.v */
/* compiled from: PG */
public final class C114696v implements C114750d {

    /* renamed from: a */
    public final ZeroStateMediaController f318255a;

    /* renamed from: b */
    private final C58881cr f318256b = C58886cw.m90973a(new C114695u(this));

    public C114696v(C58833ax axVar, C108226ax axVar2, boolean z, C91097g gVar, C114656bm bmVar) {
        C114656bm bmVar2 = bmVar;
        Activity activity = (Activity) bmVar2.f318077a.mo17428b();
        activity.getClass();
        Context context = (Context) bmVar2.f318078b.mo17428b();
        context.getClass();
        C22871g gVar2 = (C22871g) bmVar2.f318079c.mo17428b();
        gVar2.getClass();
        C22871g gVar3 = (C22871g) bmVar2.f318080d.mo17428b();
        gVar3.getClass();
        C86124t tVar = (C86124t) bmVar2.f318081e.mo17428b();
        tVar.getClass();
        C2391v vVar = (C2391v) bmVar2.f318082f.mo17428b();
        vVar.getClass();
        C91189au auVar = (C91189au) bmVar2.f318083g.mo17428b();
        auVar.getClass();
        l lVar = (l) bmVar2.f318084h.mo17428b();
        lVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) bmVar2.f318085i).f184585a);
        a.getClass();
        C58833ax axVar3 = (C58833ax) bmVar2.f318086j.mo17428b();
        axVar3.getClass();
        this.f318255a = new ZeroStateMediaController(z, axVar, axVar2, gVar, activity, context, gVar2, gVar3, tVar, vVar, auVar, lVar, a, axVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f318256b.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        return this.f318255a.f317941j;
    }

    /* renamed from: d */
    public final /* synthetic */ C53420nf mo101466d() {
        return null;
    }

    /* renamed from: e */
    public final void mo101467e() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        animatorSet.start();
    }
}
