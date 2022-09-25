package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139043a;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46719bc;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bt */
/* compiled from: PG */
public final class C139095bt extends C139087bl implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139099bx f378297a;

    /* renamed from: c */
    private Context f378298c;

    /* renamed from: d */
    private final C2393x f378299d = new C2393x(this);

    /* renamed from: e */
    private boolean f378300e;

    @Deprecated
    public C139095bt() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114713b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378298c == null) {
            this.f378298c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378298c;
    }

    /* renamed from: f */
    public final C139099bx mo17754z() {
        C139099bx bxVar = this.f378297a;
        if (bxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378300e) {
            return bxVar;
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
        return this.f378299d;
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
            C139094bs.m225940a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139099bx f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_widget_customization_fragment, viewGroup, false);
            C28306ab abVar = f.f378306d;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(147863)));
            C46801dp dpVar = f.f378307e;
            C139045c cVar = f.f378308f;
            cVar.f378171d = cVar.f378170c.mo103996b();
            dpVar.mo50707a(new C46719bc(cVar.f378168a, new C139043a(cVar), "widget_customization_data_source_key"), new C139097bv(f));
            C0154a aVar = new C0154a(f.f378304b.getChildFragmentManager());
            AccountId accountId = f.f378309g;
            C139052ad adVar = new C139052ad();
            C68324h.m98669f(adVar);
            C47247a.m84047b(adVar, accountId);
            aVar.mo689v(R.id.googleapp_main_menu_container, adVar, "top_level_menu_fragment_tag");
            aVar.mo509f();
            ((MaterialToolbar) inflate.findViewById(R.id.googleapp_action_bar)).mo2419t(new C47591co(f.f378310h, "Back arrow clicked.", new C139096bu(f)));
            View findViewById = inflate.findViewById(R.id.googleapp_search_widget_google_logo);
            View findViewById2 = inflate.findViewById(R.id.googleapp_search_widget_google_logo_full);
            View findViewById3 = inflate.findViewById(R.id.googleapp_search_widget_voice_btn);
            View findViewById4 = inflate.findViewById(R.id.googleapp_search_widget_lens_btn);
            C139099bx.m225951b(findViewById);
            C139099bx.m225951b(findViewById2);
            C139099bx.m225951b(findViewById3);
            C139099bx.m225951b(findViewById4);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C139094bs.m225940a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378300e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139094bs.m225940a(th, th);
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
            C139094bs.m225940a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C139099bx f = mo17754z();
            C47393f.m84233d(this, C32214c.class, new C139100by(f));
            C47393f.m84233d(this, C139062an.class, new C139101bz(f));
            C47393f.m84233d(this, C139061am.class, new C139103ca(f));
            C47393f.m84233d(this, C139088bm.class, new C139104cb(f));
            a.f123128b.findViewById(R.id.googleapp_done_button).setTag(R.id.tiktok_event_internal_trace, "Done button tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_done_button), new C139105cc(f));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139094bs.m225940a(th, th);
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
            if (!this.f378300e) {
                super.onAttach(context);
                if (this.f378297a == null) {
                    Object jN = mo114712a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139095bt) {
                        C139095bt btVar = (C139095bt) fragment;
                        C68225k.m98532d(btVar);
                        this.f378297a = new C139099bx(btVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C139045c) ((C74176nj) jN).f206730b.f198027a.f199498gE.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).f206677a.b.mo67308bS(), ((C74176nj) jN).f206662L, ((C74176nj) jN).f206664N, ((C74176nj) jN).f206730b.mo66123cP());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378299d));
                    } else {
                        String obj = C139099bx.class.toString();
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
                C139094bs.m225940a(th, th2);
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
