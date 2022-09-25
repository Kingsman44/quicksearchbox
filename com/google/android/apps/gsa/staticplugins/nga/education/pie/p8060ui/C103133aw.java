package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80221bo;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.common.p4526f.p4527a.C58970a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.aw */
/* compiled from: PG */
public final class C103133aw extends C103126ap implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C103135ay f287823a;

    /* renamed from: c */
    private Context f287824c;

    /* renamed from: d */
    private final C2393x f287825d = new C2393x(this);

    /* renamed from: e */
    private boolean f287826e;

    @Deprecated
    public C103133aw() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo93639b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f287824c == null) {
            this.f287824c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f287824c;
    }

    /* renamed from: f */
    public final C103135ay mo17754z() {
        C103135ay ayVar = this.f287823a;
        if (ayVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f287826e) {
            return ayVar;
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
        return this.f287825d;
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
            C103132av.m171013a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        String x;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C103135ay f = mo17754z();
            f.f287831d.mo93660e();
            String x2 = f.f287832e.mo79758x(C90126fx.f251595ll);
            int a = C80221bo.m128096a(f.f287829b.f220142d);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 0:
                    ((C58970a) ((C58970a) C103135ay.f287828a.mo56225c()).mo56372aa(21455)).mo56386p("No suggested invocation set");
                    view = null;
                    break;
                case 1:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_invocation_fragment, viewGroup, false);
                    ((TextView) view.findViewById(R.id.nga_pie_lightweight_invocation_message)).setText(R.string.nga_pie_lightweight_invocation_message_corner_swipe_only);
                    break;
                case 2:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_invocation_fragment, viewGroup, false);
                    ((TextView) view.findViewById(R.id.nga_pie_lightweight_invocation_message)).setText(R.string.nga_pie_lightweight_invocation_message_hotword_and_corner_swipe);
                    break;
                case 3:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_failure_fragment, viewGroup, false);
                    ((TextView) view.findViewById(R.id.nga_pie_lightweight_invocation_message)).setText(R.string.nga_pie_lightweight_invocation_message_corner_swipe_only);
                    break;
                case 4:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_trysaying_fragment, viewGroup, false);
                    ((TextView) view.findViewById(R.id.nga_pie_lightweight_trysaying_message)).setText(Html.fromHtml(view.getContext().getString(R.string.nga_pie_hotword_invocation_trysaying_message, new Object[]{f.f287829b.f220141c})));
                    break;
                case 5:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_invocation_fragment, viewGroup, false);
                    TextView textView = (TextView) view.findViewById(R.id.nga_pie_lightweight_invocation_message);
                    textView.setText(R.string.nga_pie_lightweight_invocation_message_long_press_home_only);
                    if (!x2.isEmpty()) {
                        textView.setText(x2);
                    }
                    view.findViewById(R.id.nga_pie_swipe_invocation_animation).setVisibility(8);
                    C103143bf.m171039f(view);
                    x = f.f287832e.mo79758x(C90126fx.f251616mF);
                    break;
                case 6:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_invocation_fragment, viewGroup, false);
                    TextView textView2 = (TextView) view.findViewById(R.id.nga_pie_lightweight_invocation_message);
                    textView2.setText(R.string.nga_pie_lightweight_invocation_message_hotword_and_long_press_home);
                    if (!x2.isEmpty()) {
                        textView2.setText(x2);
                    }
                    view.findViewById(R.id.nga_pie_swipe_invocation_animation).setVisibility(8);
                    C103143bf.m171039f(view);
                    x = f.f287832e.mo79758x(C90126fx.f251616mF);
                    break;
                default:
                    view = layoutInflater.inflate(R.layout.nga_pie_lightweight_failure_fragment, viewGroup, false);
                    TextView textView3 = (TextView) view.findViewById(R.id.nga_pie_lightweight_invocation_message);
                    textView3.setText(R.string.nga_pie_lightweight_invocation_message_long_press_home_only);
                    if (!x2.isEmpty()) {
                        textView3.setText(x2);
                    }
                    ((TextView) view.findViewById(R.id.nga_pie_lightweight_failure_title)).setText(R.string.nga_pie_practice_interrupted_message);
                    view.findViewById(R.id.nga_pie_swipe_invocation_animation).setVisibility(8);
                    C103143bf.m171039f(view);
                    x = f.f287832e.mo79758x(C90126fx.f251617mG);
                    break;
            }
            f.mo93653a(view, x);
            if (view == null) {
                view = layoutInflater.inflate(R.layout.nga_pie_lightweight_invocation_fragment, viewGroup, false);
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.nga_pie_swipe_invocation_animation);
            if (lottieAnimationView != null) {
                lottieAnimationView.mo9698i(R.raw.nga_pie_swipe_invocation_anim);
            }
            view.findViewById(R.id.nga_pie_exit_button).setOnClickListener(new C103134ax(f));
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C103132av.m171013a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f287826e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C103132av.m171013a(th, th);
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
            C103132av.m171013a(th, th);
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
            if (!this.f287826e) {
                super.onAttach(context);
                if (this.f287823a == null) {
                    Object jN = mo93638a().mo17653jN();
                    C80244ck s = ((C74178nm) jN).mo70077s();
                    Context context2 = (Context) ((C74178nm) jN).f207130a.g.mo17428b();
                    C103032a aVar = (C103032a) ((C74178nm) jN).f207130a.b.f200011bY.mo17428b();
                    C86124t tVar = (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C103133aw) {
                        C103133aw awVar = (C103133aw) fragment;
                        C68225k.m98532d(awVar);
                        this.f287823a = new C103135ay(s, context2, aVar, tVar, awVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f287825d));
                    } else {
                        String obj = C103135ay.class.toString();
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
                C103132av.m171013a(th, th2);
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
