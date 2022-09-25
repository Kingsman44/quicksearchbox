package com.google.android.apps.search.webglide.webcontent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.bumptech.glide.C6007z;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.apps.search.webglide.p10701d.C142201a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43656d;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.android.libraries.web.p3353c.p3355b.C43348q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.webglide.webcontent.h */
/* compiled from: PG */
public final class C142249h extends C142245d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C142255n f385908a;

    /* renamed from: c */
    private Context f385909c;

    /* renamed from: d */
    private final C2393x f385910d = new C2393x(this);

    /* renamed from: e */
    private boolean f385911e;

    @Deprecated
    public C142249h() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo117080b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385909c == null) {
            this.f385909c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385909c;
    }

    /* renamed from: f */
    public final C142255n mo17754z() {
        C142255n nVar = this.f385908a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385911e) {
            return nVar;
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
        return this.f385910d;
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
            C142248g.m230964a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C142255n f = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            C69664n.m101061g(viewGroup, "parent");
            View inflate = layoutInflater.inflate(R.layout.webglide_topbar_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "layoutInflater.inflate(R…* attachToRoot= */ false)");
            if (f.f385926d.getChildFragmentManager().f634a.mo671c("URL_BAR_FRAGMENT_TAG") == null) {
                C0154a aVar = new C0154a(f.f385926d.getChildFragmentManager());
                aVar.mo511h(R.id.webglide_topbar_urlbar, C43656d.m77029f(f.f385923a, C43664l.f113936f), "URL_BAR_FRAGMENT_TAG", 1);
                aVar.mo509f();
            }
            View findViewById = inflate.findViewById(R.id.webglide_topbar_button_close);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…lide_topbar_button_close)");
            ImageButton imageButton = (ImageButton) findViewById;
            C28306ab abVar = f.f385927e;
            abVar.mo33802c(imageButton, abVar.f76990a.mo33805a(C28427h.m53115a(126270)));
            imageButton.setOnClickListener(new C142250i(f, imageButton));
            View findViewById2 = inflate.findViewById(R.id.webglide_topbar_button_share);
            C69664n.m101060f(findViewById2, "rootView.findViewById(R.…lide_topbar_button_share)");
            ImageButton imageButton2 = (ImageButton) findViewById2;
            C28306ab abVar2 = f.f385927e;
            abVar2.mo33802c(imageButton2, abVar2.f76990a.mo33805a(C28427h.m53115a(144072)));
            imageButton2.setOnClickListener(new C47591co(f.f385929g, "Clicked share web content from WebGlide.", new C142251j(f, imageButton2)));
            View findViewById3 = inflate.findViewById(R.id.webglide_overflow_menu_icon);
            C69664n.m101060f(findViewById3, "rootView.findViewById(R.…glide_overflow_menu_icon)");
            ImageButton imageButton3 = (ImageButton) findViewById3;
            C28306ab abVar3 = f.f385927e;
            C28439i c = abVar3.mo33802c(imageButton3, abVar3.f76990a.mo33805a(C28427h.m53115a(153838)));
            if (f.f385933k.f385700i) {
                imageButton3.setOnClickListener(new C47591co(f.f385929g, "Clicked overflow menu icon from WebGlide.", new C142253l(f, imageButton3, c)));
            } else {
                imageButton3.setVisibility(8);
            }
            View findViewById4 = inflate.findViewById(R.id.webglide_open_in_app_container);
            C69664n.m101060f(findViewById4, "rootView.findViewById(R.…de_open_in_app_container)");
            C28306ab abVar4 = f.f385927e;
            abVar4.mo33802c(findViewById4, abVar4.f76990a.mo33805a(C28427h.m53115a(144071)));
            if (f.f385930h) {
                View findViewById5 = inflate.findViewById(R.id.webglide_publisher_app_icon);
                C69664n.m101060f(findViewById5, "rootView.findViewById(R.…glide_publisher_app_icon)");
                ImageView imageView = (ImageView) findViewById5;
                if ((f.f385931i.f385725a & 64) != 0) {
                    imageView.setVisibility(0);
                    C47449e eVar = f.f385932j;
                    ((C6007z) ((C6007z) eVar.mo51286a().mo11873k(f.f385931i.f385732h).mo11968U(1000)).mo11952E(R.drawable.webglide_ic_default_favicon)).mo12454r(imageView);
                } else {
                    imageView.setVisibility(8);
                }
                findViewById4.setOnClickListener(new C47591co(f.f385929g, "Clicked Open in App.", new C142252k(f, findViewById4)));
            } else {
                findViewById4.setVisibility(8);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C142248g.m230964a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385911e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C142248g.m230964a(th, th);
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
            C142248g.m230964a(th, th);
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
            if (!this.f385911e) {
                super.onAttach(context);
                if (this.f385908a == null) {
                    Object jN = mo117079a().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C43348q fT = ((C74176nj) jN).mo69736fT();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C142249h) {
                        C142249h hVar = (C142249h) fragment;
                        C68225k.m98532d(hVar);
                        C142255n nVar = r3;
                        C142255n nVar2 = new C142255n(accountId, fT, activity, hVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.apps.search.webglide.user 45358822").mo50907f(), ((C74176nj) jN).mo69669eF(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C142176g) ((C74176nj) jN).f206730b.f198027a.f199480fn.mo17428b(), new C142201a(((C74176nj) jN).mo69794gY(), ((C74176nj) jN).mo69736fT()));
                        this.f385908a = nVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385910d));
                    } else {
                        String obj = C142255n.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C142248g.m230964a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
