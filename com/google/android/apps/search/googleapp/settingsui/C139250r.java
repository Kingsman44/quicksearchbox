package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.preference.MultiSelectListPreference;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139870f;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139877m;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47711b;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47712c;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.r */
/* compiled from: PG */
public final class C139250r extends C139203bz implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139256u f378727a;

    /* renamed from: c */
    private Context f378728c;

    /* renamed from: d */
    private final C2393x f378729d = new C2393x(this);

    /* renamed from: e */
    private boolean f378730e;

    @Deprecated
    public C139250r() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C139250r m226299a(AccountId accountId, String str) {
        C139250r rVar = new C139250r();
        C68324h.m98669f(rVar);
        C47247a.m84047b(rVar, accountId);
        C47243l.m84040b(rVar, str);
        return rVar;
    }

    /* renamed from: b */
    public final C139256u mo17754z() {
        C139256u uVar = this.f378727a;
        if (uVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378730e) {
            return uVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo114824d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378728c == null) {
            this.f378728c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378728c;
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
        return this.f378729d;
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
            C139249q.m226298a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139256u b = mo17754z();
            if (b.f378753i != null) {
                b.f378759o = new MultiSelectListPreference(b.f378752h, (AttributeSet) null);
                if (b.f378753i instanceof C139869e) {
                    b.f378759o.mo8339F(false);
                }
                if (b.f378753i instanceof C139871g) {
                    b.f378759o.mo8348O(false);
                }
                MultiSelectListPreference multiSelectListPreference = b.f378759o;
                multiSelectListPreference.f12751w = false;
                multiSelectListPreference.mo8343J(b.f378754j);
                b.f378759o.mo8347N(b.f378753i.mo111460j());
                b.f378759o.f12693a = b.f378753i.mo111460j();
                b.f378759o.f12696d = b.f378753i.mo115325e();
                b.f378759o.f12697e = b.f378753i.mo115324d();
                b.f378759o.mo8342I(false);
                b.f378759o.mo8329n(b.f378753i.mo111457g());
                MultiSelectListPreference multiSelectListPreference2 = b.f378759o;
                C47713d dVar = b.f378757m;
                multiSelectListPreference2.f12743o = new C47712c(dVar, "Multi-choice setting clicked", new C139251s(b));
                multiSelectListPreference2.f12742n = new C47711b(dVar, "Multi-choice setting changed", new C139255t(b));
            }
            b.f378756l.mo50429i(b.f378751g);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139249q.m226298a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139256u b = mo17754z();
            C139877m mVar = b.f378753i;
            if (mVar != null) {
                b.f378755k.mo50707a(mVar.mo115323c(), b.f378746b);
                b.f378755k.mo50707a(b.f378753i.mo115322b(), b.f378747c);
                C139877m mVar2 = b.f378753i;
                if (mVar2 instanceof C139869e) {
                    b.f378755k.mo50707a(((C139869e) mVar2).mo111464n(), b.f378748d);
                }
                C139877m mVar3 = b.f378753i;
                if (mVar3 instanceof C139870f) {
                    b.f378755k.mo50707a(((C139870f) mVar3).mo111454d(), b.f378750f);
                }
            }
            C139877m mVar4 = b.f378753i;
            if (mVar4 instanceof C139871g) {
                b.f378755k.mo50707a(((C139871g) mVar4).mo111455e(), b.f378749e);
            }
            C47831fm.m85019n();
            return null;
        } catch (Throwable th) {
            C139249q.m226298a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378730e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139249q.m226298a(th, th);
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
            C139249q.m226298a(th, th);
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
            if (!this.f378730e) {
                super.onAttach(context);
                if (this.f378727a == null) {
                    Object jN = mo114825f().mo17653jN();
                    Map hG = ((C74176nj) jN).mo69829hG();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    C47713d he = ((C74176nj) jN).mo69847he();
                    C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                    Executor executor = (Executor) ((C74176nj) jN).f206677a.n.mo17428b();
                    this.f378727a = new C139256u((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), hG, b, (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), he, (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378729d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C139249q.m226298a(th, th2);
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
