package com.google.android.apps.search.googleapp.homescreen.searchbox;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2043bi;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4837ao;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p246g.C4958c;
import com.google.android.apps.search.googleapp.compliance.p10145b.C133612j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.searchbox.g */
/* compiled from: PG */
public final class C136204g {

    /* renamed from: a */
    public final C28443m f370940a;

    /* renamed from: b */
    private final SearchboxView f370941b;

    /* renamed from: c */
    private final String f370942c;

    /* renamed from: d */
    private final boolean f370943d;

    /* renamed from: e */
    private final C133612j f370944e;

    public C136204g(SearchboxView searchboxView, C47274n nVar, C28306ab abVar, String str, boolean z, C133612j jVar, C47400m mVar, C28443m mVar2) {
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "events");
        C69664n.m101061g(mVar2, "interactionLogger");
        this.f370941b = searchboxView;
        this.f370942c = str;
        this.f370943d = z;
        this.f370944e = jVar;
        this.f370940a = mVar2;
        LayoutInflater.from(nVar).inflate(R.layout.googleapp_facade_search_box, searchboxView);
        View r = C2043bi.m5589r(searchboxView, R.id.googleapp_facade_search_box);
        C69664n.m101060f(r, "requireViewById<View>(ro…gleapp_facade_search_box)");
        abVar.mo33801b(r, abVar.f76990a.mo33805a(C28427h.m53115a(78513)));
        abVar.mo33801b(mo112833b(), abVar.f76990a.mo33805a(C28427h.m53115a(78512)));
        abVar.mo33801b(mo112832a(), abVar.f76990a.mo33805a(C28427h.m53115a(99068)));
        mVar.mo51253b(r, new C136201d(this, r));
        mVar.mo51253b(mo112833b(), new C136202e(this));
        mVar.mo51253b(mo112832a(), new C136203f(this));
        if (str.length() > 0) {
            mo112834c(str);
        }
        if (z) {
            C2043bi.m5589r(searchboxView, R.id.googleapp_search_icon).setVisibility(8);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C2043bi.m5589r(searchboxView, R.id.googleapp_magnilock_icon);
            lottieAnimationView.f15138d.mo9756a(new C4890e("**"), C4829ag.f15366E, new C4958c(new C4837ao(C1878d.m5128a(lottieAnimationView.getContext(), R.color.agsa_color_dark_icon_interactive))));
            if (!Boolean.valueOf(jVar.f363976d).booleanValue()) {
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.mo9695f();
                jVar.f363976d = true;
            }
        }
    }

    /* renamed from: a */
    public final View mo112832a() {
        View r = C2043bi.m5589r(this.f370941b, R.id.googleapp_lens_icon);
        C69664n.m101060f(r, "requireViewById(root, R.id.googleapp_lens_icon)");
        return r;
    }

    /* renamed from: b */
    public final View mo112833b() {
        View r = C2043bi.m5589r(this.f370941b, R.id.googleapp_mic_icon);
        C69664n.m101060f(r, "requireViewById(root, R.id.googleapp_mic_icon)");
        return r;
    }

    /* renamed from: c */
    public final void mo112834c(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "value");
        ((TextView) C2043bi.m5589r(this.f370941b, R.id.googleapp_hint_text)).setText(charSequence);
    }
}
