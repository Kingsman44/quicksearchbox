package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114869dl;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53097bg;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ah */
/* compiled from: PG */
public final class C114623ah implements C114750d {

    /* renamed from: a */
    public final Context f317980a;

    /* renamed from: b */
    public final C68214a f317981b;

    /* renamed from: c */
    public final C114839ci f317982c;

    /* renamed from: d */
    public final C114869dl f317983d;

    /* renamed from: e */
    public final C53097bg f317984e;

    /* renamed from: f */
    public final C91097g f317985f;

    /* renamed from: g */
    public final LayoutInflater f317986g;

    /* renamed from: h */
    public final C114628am f317987h;

    /* renamed from: i */
    public ViewGroup f317988i;

    /* renamed from: j */
    private final C58881cr f317989j = C58886cw.m90973a(new C114619ad(this));

    public C114623ah(Context context, C68214a aVar, C114839ci ciVar, C114869dl dlVar, C114628am amVar, C53097bg bgVar, C91097g gVar) {
        this.f317980a = context;
        this.f317981b = aVar;
        this.f317982c = ciVar;
        this.f317983d = dlVar;
        this.f317987h = amVar;
        this.f317984e = bgVar;
        this.f317985f = gVar;
        this.f317986g = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        return (View) this.f317989j.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ C53420nf mo101466d() {
        return null;
    }

    /* renamed from: e */
    public final void mo101467e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101468f(C53287ih ihVar, AnimatorSet animatorSet) {
        animatorSet.start();
    }

    /* renamed from: g */
    public final C114632ap mo101473g(String str, String str2) {
        return new C114632ap(this.f317980a, str, R.drawable.quantum_ic_phone_callback_grey600_48, new C114621af(this, str2));
    }

    /* renamed from: h */
    public final C114632ap mo101474h(String str, String str2) {
        return new C114632ap(this.f317980a, str, R.drawable.quantum_ic_textsms_grey600_48, new C114622ag(this, str2));
    }
}
