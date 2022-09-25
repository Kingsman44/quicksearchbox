package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8434i.C110186h;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110400d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110416m;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.l */
/* compiled from: PG */
public final class C114686l implements C114750d {

    /* renamed from: a */
    public final Context f318211a;

    /* renamed from: b */
    public final C2391v f318212b;

    /* renamed from: c */
    public final LayoutInflater f318213c;

    /* renamed from: d */
    public final C110416m f318214d;

    /* renamed from: e */
    public final C110186h f318215e;

    /* renamed from: f */
    public final C110400d f318216f;

    /* renamed from: g */
    public C28293k f318217g;

    /* renamed from: h */
    private final C58881cr f318218h = C58886cw.m90973a(new C114683i(this));

    public C114686l(Context context, Activity activity, C2391v vVar, C110416m mVar, C110186h hVar, C110400d dVar) {
        this.f318213c = LayoutInflater.from(activity);
        this.f318211a = context;
        this.f318212b = vVar;
        this.f318214d = mVar;
        this.f318215e = hVar;
        this.f318216f = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo101463a() {
        return 0;
    }

    /* renamed from: b */
    public final View mo101464b() {
        C58976aa aaVar = C58975e.f156826a;
        return (View) this.f318218h.mo6453a();
    }

    /* renamed from: c */
    public final C28293k mo101465c() {
        if (this.f318217g == null) {
            View view = (View) this.f318218h.mo6453a();
        }
        return this.f318217g;
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

    /* renamed from: g */
    public final void mo101520g(TextView textView, List list) {
        if (list.isEmpty()) {
            textView.setText(R.string.ambient_no_notification_summary);
            return;
        }
        int size = list.size();
        textView.setText(this.f318211a.getResources().getQuantityString(R.plurals.ambient_notification_summary, size, new Object[]{Integer.valueOf(size)}));
    }
}
