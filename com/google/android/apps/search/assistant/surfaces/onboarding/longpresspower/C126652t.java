package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.p096h.C1951d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.p3558f.C45310d;
import com.google.android.setupdesign.p3558f.C45311e;
import com.google.android.setupdesign.view.FillContentLayout;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.t */
/* compiled from: PG */
public final class C126652t extends C126638f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126656x f348777a;

    /* renamed from: c */
    private Context f348778c;

    /* renamed from: d */
    private final C2393x f348779d = new C2393x(this);

    /* renamed from: e */
    private boolean f348780e;

    @Deprecated
    public C126652t() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo107648b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f348778c == null) {
            this.f348778c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f348778c;
    }

    /* renamed from: f */
    public final C126656x mo17754z() {
        C126656x xVar = this.f348777a;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f348780e) {
            return xVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f348779d;
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
            C126651s.m207099a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C126656x f = mo17754z();
            GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.assistant_long_press_power_fragment, viewGroup, false);
            Bundle extras = f.f348788c.getActivity().getIntent().getExtras();
            boolean z = extras != null && extras.getLong("intent_extra_power_off_animation") == 1;
            if (extras != null && extras.getBoolean("intent_extra_description_no_query", false)) {
                Context context = f.f348787b;
                glifLayout.mo49195q(C1951d.m5280a(context.getString(R.string.assistant_long_press_power_custom_description_no_query, new Object[]{C45311e.m80759c(context, R.string.assistant_long_press_power_subtitle_description), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_action_description), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_button_1), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_button_2)}), 63));
            } else if (z) {
                glifLayout.mo49197s(C1951d.m5280a(f.f348787b.getString(R.string.assistant_long_press_power_title_with_lpp_animation), 63));
                if (Build.BRAND.toLowerCase(Locale.ENGLISH).equals("google")) {
                    glifLayout.mo49195q(C1951d.m5280a(f.f348787b.getString(R.string.assistant_long_press_power_description_with_lpp_animation), 63));
                } else if (Integer.parseInt(C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_first_time_edu_string_config_id)) == 2) {
                    Context context2 = f.f348787b;
                    glifLayout.mo49195q(C1951d.m5280a(context2.getString(R.string.assistant_long_press_power_custom_description_with_lpp_animation, new Object[]{context2.getString(R.string.assistant_long_press_power_body_description_2)}), 63));
                } else {
                    Context context3 = f.f348787b;
                    glifLayout.mo49195q(C1951d.m5280a(context3.getString(R.string.assistant_long_press_power_custom_description_with_lpp_animation, new Object[]{context3.getString(R.string.assistant_long_press_power_body_description_1)}), 63));
                }
            } else {
                Context context4 = f.f348787b;
                glifLayout.mo49195q(C1951d.m5280a(context4.getString(R.string.assistant_long_press_power_custom_description, new Object[]{C45311e.m80759c(context4, R.string.assistant_long_press_power_subtitle_description), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_action_description), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_button_1), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_button_2), C45311e.m80759c(f.f348787b, R.string.assistant_long_press_power_power_off_query)}), 63));
            }
            ImageView imageView = (ImageView) glifLayout.findViewById(R.id.assistant_long_press_power_image);
            FillContentLayout fillContentLayout = (FillContentLayout) glifLayout.findViewById(R.id.assistant_long_press_power_image_layout);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) glifLayout.findViewById(R.id.assistant_long_press_power_animation);
            lottieAnimationView.setVisibility(8);
            if (!C45311e.m80760d(f.f348787b, R.bool.assistant_long_press_power_show_first_time_edu_screen_image)) {
                imageView.setVisibility(8);
                fillContentLayout.setVisibility(8);
            } else if (C45311e.m80757a(f.f348787b, R.drawable.assistant_long_press_power_first_time_edu).f118364c) {
                C45310d a = C45311e.m80757a(f.f348787b, R.drawable.assistant_long_press_power_first_time_edu);
                imageView.setImageDrawable(a.f118362a.getDrawable(a.f118363b));
            } else if (z) {
                lottieAnimationView.mo9698i(R.raw.assistant_lpp_introduction_poweroff_animation);
                lottieAnimationView.setVisibility(0);
                imageView.setVisibility(8);
                fillContentLayout.setVisibility(8);
            }
            C45275b bVar = (C45275b) glifLayout.mo49129j(C45275b.class);
            C45276c cVar = new C45276c(f.f348787b);
            cVar.mo49181b(R.string.assistant_long_press_power_action_button_text);
            cVar.f118281b = new C126653u(f);
            cVar.f118282c = 5;
            cVar.f118283d = R.style.AssistantOnboardingButtonPrimary;
            bVar.mo49175f(cVar.mo49180a());
            String str = null;
            if (extras != null && extras.containsKey("intent_extra_learn_more_url")) {
                str = extras.getString("intent_extra_learn_more_url");
            }
            boolean z2 = !TextUtils.isEmpty(str);
            if (extras == null || !extras.containsKey("intent_extra_show_settings_button") || !extras.getBoolean("intent_extra_show_settings_button")) {
                if (z2) {
                    z2 = true;
                }
                View findViewById = glifLayout.findViewById(R.id.assistant_long_press_power_empty_skip_button);
                View findViewById2 = glifLayout.findViewById(R.id.assistant_long_press_power_empty_action_button);
                f.f348789d.mo33802c(findViewById, f.f348790e.mo33805a(C28427h.m53115a(156661)));
                f.f348789d.mo33802c(findViewById2, f.f348790e.mo33805a(C28427h.m53115a(156662)));
                f.f348789d.mo33802c(glifLayout, f.f348790e.mo33805a(C28427h.m53115a(156660)));
                C47831fm.m85019n();
                return glifLayout;
            }
            C45276c cVar2 = new C45276c(f.f348787b);
            cVar2.mo49181b(true != z2 ? R.string.assistant_long_press_power_settings_button_text : R.string.assistant_long_press_power_cancel_button_text);
            cVar2.f118281b = new C126654v(f, z2);
            cVar2.f118282c = 7;
            bVar.mo49176g(cVar2.mo49180a(), false);
            View findViewById3 = glifLayout.findViewById(R.id.assistant_long_press_power_empty_skip_button);
            View findViewById22 = glifLayout.findViewById(R.id.assistant_long_press_power_empty_action_button);
            f.f348789d.mo33802c(findViewById3, f.f348790e.mo33805a(C28427h.m53115a(156661)));
            f.f348789d.mo33802c(findViewById22, f.f348790e.mo33805a(C28427h.m53115a(156662)));
            f.f348789d.mo33802c(glifLayout, f.f348790e.mo33805a(C28427h.m53115a(156660)));
            C47831fm.m85019n();
            return glifLayout;
        } catch (Throwable th2) {
            C126651s.m207099a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f348780e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126651s.m207099a(th, th);
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
            C126651s.m207099a(th, th);
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
            if (!this.f348780e) {
                super.onAttach(context);
                if (this.f348777a == null) {
                    Object jN = mo107647a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C126652t) {
                        C126652t tVar = (C126652t) fragment;
                        C68225k.m98532d(tVar);
                        this.f348777a = new C126656x(tVar, (C28306ab) ((C74178nm) jN).f207130a.a.f202880fS.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f348779d));
                    } else {
                        String obj = C126656x.class.toString();
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
                C126651s.m207099a(th, th2);
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
