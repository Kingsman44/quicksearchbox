package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.g */
/* compiled from: PG */
public final class C114681g implements C114750d {

    /* renamed from: a */
    public final C53350kq f318194a;

    /* renamed from: b */
    public final Context f318195b;

    /* renamed from: c */
    public final LayoutInflater f318196c;

    /* renamed from: d */
    public final C91097g f318197d;

    /* renamed from: e */
    public final Activity f318198e;

    /* renamed from: f */
    public final C58833ax f318199f;

    /* renamed from: g */
    public final List f318200g = new ArrayList();

    /* renamed from: h */
    public C58833ax f318201h = C58836b.f156633a;

    /* renamed from: i */
    public C28293k f318202i;

    /* renamed from: j */
    private final C58881cr f318203j;

    public C114681g(Context context, Activity activity, C58833ax axVar, C53350kq kqVar, C91097g gVar) {
        this.f318198e = activity;
        this.f318194a = kqVar;
        this.f318196c = LayoutInflater.from(activity);
        this.f318195b = context;
        this.f318197d = gVar;
        this.f318203j = C58886cw.m90973a(new C114680f(this));
        this.f318199f = axVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f318203j.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        if (this.f318202i == null) {
            View view = (View) this.f318203j.mo6453a();
        }
        return this.f318202i;
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
