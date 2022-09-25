package com.google.android.libraries.lens.view.imageviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.imageviewer.C26944h;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.d */
/* compiled from: PG */
public final class C26940d extends C26958u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26944h f73433a;

    /* renamed from: b */
    private Context f73434b;

    /* renamed from: c */
    private final C2393x f73435c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f73436d = new C47515ab(this);

    /* renamed from: e */
    private boolean f73437e;

    @Deprecated
    public C26940d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26944h mo17754z() {
        C26944h hVar = this.f73433a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f73437e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32335b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f73434b == null) {
            this.f73434b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f73434b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f73436d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f73435c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f73436d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f73436d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f73436d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f73436d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f73436d.mo51381i();
        try {
            super.onCreate(bundle);
            C26944h a = mo17754z();
            a.f73450j.mo33143a(a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f73436d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageButton imageButton;
        this.f73436d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26944h a = mo17754z();
            int i = 0;
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.image_viewer, viewGroup, false);
            C28306ab abVar = a.f73448h;
            a.f73454n = abVar.mo33801b(linearLayout, abVar.f76990a.mo33805a(C28427h.m53115a(137516)));
            Context requireContext = a.f73442b.requireContext();
            Toolbar toolbar = (Toolbar) linearLayout.findViewById(R.id.image_viewer_toolbar);
            Drawable b = C28110al.m52390b(requireContext, R.drawable.quantum_ic_close_vd_theme_24, C1878d.m5128a(requireContext, R.color.text_color_primary));
            toolbar.mo2415p(R.string.lens_close);
            toolbar.mo2418s(b);
            C28306ab abVar2 = a.f73448h;
            ViewGroup viewGroup2 = (ViewGroup) linearLayout.findViewById(R.id.image_viewer_toolbar);
            while (true) {
                if (i >= viewGroup2.getChildCount()) {
                    imageButton = null;
                    break;
                } else if (viewGroup2.getChildAt(i) instanceof ImageButton) {
                    imageButton = (ImageButton) viewGroup2.getChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            imageButton.getClass();
            abVar2.mo33801b(imageButton, a.f73448h.f76990a.mo33805a(C28427h.m53115a(139647)));
            toolbar.mo2419t(new C26941e(a));
            toolbar.f1961u = new C26942f(a);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) linearLayout.findViewById(R.id.image_viewer_ghost_animation);
            lottieAnimationView.mo9698i(true != C28110al.m52391c(requireContext) ? R.raw.iv_loading_animation_light : R.raw.iv_loading_animation_dark);
            lottieAnimationView.mo9695f();
            if (a.f73442b.getChildFragmentManager().f634a.mo671c("image-viewer-web-fragment-tag") == null) {
                C43861g b2 = C43864j.m77436b(a.f73443c);
                C0154a aVar = new C0154a(a.f73442b.getChildFragmentManager());
                aVar.mo689v(R.id.image_viewer_web_fragment_container, b2, "image-viewer-web-fragment-tag");
                aVar.mo509f();
                Uri.Builder appendQueryParameter = Uri.parse(a.f73445e).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).appendQueryParameter("ctzn", Uri.encode(TimeZone.getDefault().getID()));
                String str = "1";
                if (true != C28110al.m52391c(a.f73442b.requireContext())) {
                    str = "0";
                }
                C43255f m = C43257h.m76306m(appendQueryParameter.appendQueryParameter("cs", str).build().toString());
                C58833ax a2 = a.f73451k.mo30585a();
                if (a2.mo56113h()) {
                    ((String) a2.mo56107c()).length();
                    m.f113051b.mo55429h("X-Client-Data", (String) a2.mo56107c());
                }
                a.f73452l = m.mo46365k();
                a.f73444d.mo46333b(a.f73452l);
            }
            a.f73446f.mo50707a(a.f73447g.mo46469b(), new C26944h.C26945a());
            if (linearLayout != null) {
                C47831fm.m85019n();
                return linearLayout;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f73436d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f73436d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f73436d.mo51376d();
        try {
            super.onDetach();
            this.f73437e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f73436d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f73436d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f73436d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f73436d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f73436d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f73436d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f73436d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f73436d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C26957t.class, new C26946i(mo17754z()));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26939c.m49906a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f73436d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f73436d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f73436d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f73436d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f73436d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f73436d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f73436d.mo51381i();
        try {
            if (!this.f73437e) {
                super.onAttach(context);
                if (this.f73433a == null) {
                    Object jN = mo32345d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26940d) {
                        C26940d dVar = (C26940d) fragment;
                        C68225k.m98532d(dVar);
                        C43251d fx = ((C74176nj) jN).mo69766fx();
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f73433a = new C26944h(dVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), fx, b, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69736fT(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C27655b) ((C74176nj) jN).f206836d.f205260ab.mo17428b(), ((C74176nj) jN).mo69679eP());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f73436d, this.f73435c));
                    } else {
                        String obj = C26944h.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f73436d;
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
                C26939c.m49906a(th, th2);
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
