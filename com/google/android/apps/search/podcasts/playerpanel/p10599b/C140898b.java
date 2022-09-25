package com.google.android.apps.search.podcasts.playerpanel.p10599b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.playerpanel.C140853a;
import com.google.android.apps.search.podcasts.widgets.valueselector.C141287e;
import com.google.android.apps.search.podcasts.widgets.valueselector.C141288f;
import com.google.android.apps.search.podcasts.widgets.valueselector.HorizontalValueSelector;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.b.b */
/* compiled from: PG */
public final class C140898b extends C140911m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140906j f382585a;

    /* renamed from: c */
    private Context f382586c;

    /* renamed from: d */
    private final C2393x f382587d = new C2393x(this);

    /* renamed from: e */
    private boolean f382588e;

    @Deprecated
    public C140898b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140906j mo17754z() {
        C140906j jVar = this.f382585a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382588e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115999b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382586c == null) {
            this.f382586c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382586c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f382587d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140897a.m228811a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C140906j a = mo17754z();
            a.f382603f.mo50429i(a.f382611n);
            a.f382603f.mo50429i(a.f382612o);
            a.f382604g.mo50828h(R.id.podcasts_player_state_subscription_speed, a.f382601d.mo115880b(), a.f382610m);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140897a.m228811a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140906j a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_speed_setting, viewGroup, false);
            C140997s sVar = a.f382607j;
            View findViewById = inflate.findViewById(R.id.podcasts_close_speed_setting);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…asts_close_speed_setting)");
            sVar.mo116064c(findViewById, new C140853a(), "ClosePlayerPanelEvent", true);
            for (Number floatValue : C69540x.m100947e(Float.valueOf(0.8f), Float.valueOf(1.0f), Float.valueOf(1.2f), Float.valueOf(1.5f), Float.valueOf(2.0f))) {
                float floatValue2 = floatValue.floatValue();
                View findViewById2 = inflate.findViewById(R.id.podcasts_playback_speed_suggestion_container);
                C69664n.m101059e(findViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) findViewById2;
                View inflate2 = layoutInflater.inflate(R.layout.podcasts_speed_suggestion, viewGroup2, false);
                C69664n.m101059e(inflate2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate2;
                Context context = a.f382600c;
                Float valueOf = Float.valueOf(floatValue2);
                textView.setText(context.getString(R.string.podcasts_playback_speed_suggestion, new Object[]{valueOf}));
                textView.setContentDescription(a.f382600c.getString(R.string.podcasts_content_description_playback_speed_suggestion, new Object[]{valueOf}));
                textView.setOnClickListener(new C47591co(a.f382602e, "playback speed click", new C140899c(a, floatValue2)));
                viewGroup2.addView(textView);
            }
            C69664n.m101060f(inflate, "rootView");
            HorizontalValueSelector a2 = C140910l.m228833a(inflate);
            int round = Math.round(25.0f) + 1;
            C58480gp e = C58485gu.m89837e();
            for (int i = 0; i < round; i++) {
                e.mo55395g(new C141287e((((float) i) * 0.1f) + 0.5f));
            }
            a2.mo116314b(e.mo55394f());
            HorizontalValueSelector a3 = C140910l.m228833a(inflate);
            C140904h hVar = new C140904h(a);
            a3.f383578f = hVar;
            C141288f fVar = a3.f383575c;
            if (fVar != null) {
                hVar.mo116002a(fVar);
            }
            C140910l.m228834b(inflate).f116095f = new C47754cs(a.f382602e, new C140905i(a), "trim silence change");
            a.f382606i.mo33801b(inflate.findViewById(R.id.podcasts_content_panel_speed_setting), a.f382606i.f76990a.mo33805a(C28427h.m53115a(70846)));
            a.f382606i.mo33801b(C140910l.m228833a(inflate), a.f382606i.f76990a.mo33805a(C28427h.m53115a(42190)));
            a.f382606i.mo33801b(inflate.findViewById(R.id.podcasts_close_speed_setting), a.f382606i.f76990a.mo33805a(C28427h.m53115a(42191)));
            a.f382606i.mo33801b(C140910l.m228834b(inflate), a.f382606i.f76990a.mo33805a(C28427h.m53115a(53674)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140897a.m228811a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382588e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140897a.m228811a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C140897a.m228811a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f382588e) {
                super.onAttach(context);
                if (this.f382585a == null) {
                    Object jN = mo116007d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C140898b) {
                        C140898b bVar = (C140898b) fragment;
                        C68225k.m98532d(bVar);
                        this.f382585a = new C140906j(bVar, (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C140997s) ((C74176nj) jN).f206757ba.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382587d));
                    } else {
                        String obj = C140906j.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C140897a.m228811a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
