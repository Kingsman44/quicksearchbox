package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p031v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15132b;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15135e;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.d */
/* compiled from: PG */
public final class C15142d extends C15159u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C15146h f45431a;

    /* renamed from: c */
    private Context f45432c;

    /* renamed from: d */
    private final C2393x f45433d = new C2393x(this);

    /* renamed from: e */
    private boolean f45434e;

    @Deprecated
    public C15142d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C15146h mo17754z() {
        C15146h hVar = this.f45431a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f45434e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo22015b() {
        return C47244m.m84042d(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f45432c == null) {
            this.f45432c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f45432c;
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
        return this.f45433d;
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
            C15141c.m31714a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C15146h a = mo17754z();
            a.f45445g = new ContextThemeWrapper(a.f45439a, R.style.MorrisTheme);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C15141c.m31714a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C15146h a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C15143e eVar = (C15143e) a.f45440b.getHost();
            eVar.getClass();
            Window window = eVar.f122878z;
            C15130a aVar = a.f45442d;
            ViewGroup viewGroup2 = (ViewGroup) window.getDecorView();
            ContextThemeWrapper contextThemeWrapper = a.f45445g;
            contextThemeWrapper.getClass();
            aVar.f45413b = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.bubble_action_bar, viewGroup2, false);
            a.f45447i = aVar.f45413b;
            WindowManager windowManager = window.getWindowManager();
            View view = a.f45447i;
            view.getClass();
            IBinder windowToken = window.getDecorView().getWindowToken();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 1224802568, 1);
            layoutParams.gravity = 80;
            layoutParams.token = windowToken;
            windowManager.addView(view, layoutParams);
            C15149k kVar = a.f45441c;
            ViewGroup viewGroup3 = (ViewGroup) window.getDecorView();
            ContextThemeWrapper contextThemeWrapper2 = a.f45445g;
            contextThemeWrapper2.getClass();
            kVar.f45452d = (ViewGroup) LayoutInflater.from(contextThemeWrapper2).inflate(R.layout.bubble_icon_container, viewGroup3, false);
            ViewGroup viewGroup4 = kVar.f45452d;
            viewGroup4.getClass();
            a.f45446h = viewGroup4;
            a.f45446h.setOnApplyWindowInsetsListener(new C15145g(a));
            WindowManager windowManager2 = window.getWindowManager();
            View view2 = a.f45446h;
            view2.getClass();
            IBinder windowToken2 = window.getDecorView().getWindowToken();
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, 2038, 1224802568, 1);
            layoutParams2.gravity = 8388659;
            layoutParams2.token = windowToken2;
            windowManager2.addView(view2, layoutParams2);
            FrameLayout frameLayout = new FrameLayout(a.f45439a);
            C47831fm.m85019n();
            return frameLayout;
        } catch (Throwable th) {
            C15141c.m31714a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C15146h a = mo17754z();
            a.f45443e.f45471e.mo22006c();
            a.f45444f.f45464h = 2;
            b.close();
            return;
        } catch (Throwable th) {
            C15141c.m31714a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C15146h a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C15143e eVar = (C15143e) a.f45440b.getHost();
            eVar.getClass();
            WindowManager windowManager = eVar.f122878z.getWindowManager();
            View view = a.f45446h;
            view.getClass();
            windowManager.removeView(view);
            a.f45446h = null;
            View view2 = a.f45447i;
            view2.getClass();
            windowManager.removeView(view2);
            a.f45447i = null;
            c.close();
            return;
        } catch (Throwable th) {
            C15141c.m31714a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f45434e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C15141c.m31714a(th, th);
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
            C15141c.m31714a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C15146h a = mo17754z();
            C15154p pVar = a.f45443e;
            View view2 = a.f45446h;
            view2.getClass();
            C15130a aVar = a.f45442d;
            Objects.requireNonNull(aVar);
            C15144f fVar = new C15144f(aVar);
            pVar.f45473g = view2;
            pVar.f45473g.setOnTouchListener(new C15153o(pVar));
            pVar.f45475i = fVar;
            C15152n nVar = a.f45444f;
            View view3 = a.f45446h;
            view3.getClass();
            nVar.f45463g = view3;
            view3.addOnLayoutChangeListener(new C15135e(new C15150l(nVar), view3));
            C15132b bVar = nVar.f45461e;
            bVar.f45415a.add(new C15151m(nVar));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C15141c.m31714a(th, th);
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
            if (!this.f45434e) {
                super.onAttach(context);
                if (this.f45431a == null) {
                    this.f45431a = ((C15147i) mo22030d().mo17653jN()).mo22019O();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f45433d));
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
                C15141c.m31714a(th, th2);
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
