package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114830c;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.s */
/* compiled from: PG */
public final class C114693s implements C114750d {

    /* renamed from: a */
    public static final C114830c f318245a = new C114830c();

    /* renamed from: b */
    public final C53350kq f318246b;

    /* renamed from: c */
    public final Context f318247c;

    /* renamed from: d */
    public final LayoutInflater f318248d;

    /* renamed from: e */
    public final List f318249e = new ArrayList();

    /* renamed from: f */
    public C58833ax f318250f = C58836b.f156633a;

    /* renamed from: g */
    public C28293k f318251g;

    /* renamed from: h */
    private final C58881cr f318252h;

    public C114693s(Context context, C53350kq kqVar) {
        this.f318246b = kqVar;
        this.f318248d = LayoutInflater.from(context);
        this.f318247c = context;
        this.f318252h = C58886cw.m90973a(new C114692r(this));
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return (View) this.f318252h.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        if (this.f318251g == null) {
            View view = (View) this.f318252h.mo6453a();
        }
        return this.f318251g;
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
