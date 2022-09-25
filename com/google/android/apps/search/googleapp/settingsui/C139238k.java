package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.preference.ListPreference;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10536x.C139867c;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139870f;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
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

/* renamed from: com.google.android.apps.search.googleapp.settingsui.k */
/* compiled from: PG */
public final class C139238k extends C139202by implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139241n f378698a;

    /* renamed from: c */
    private Context f378699c;

    /* renamed from: d */
    private final C2393x f378700d = new C2393x(this);

    /* renamed from: e */
    private boolean f378701e;

    @Deprecated
    public C139238k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C139238k m226267a(AccountId accountId, String str) {
        C139238k kVar = new C139238k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        C47243l.m84040b(kVar, str);
        return kVar;
    }

    /* renamed from: b */
    public final C139241n mo17754z() {
        C139241n nVar = this.f378698a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378701e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo114821d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378699c == null) {
            this.f378699c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378699c;
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
        return this.f378700d;
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
            C139237j.m226266a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139241n b = mo17754z();
            if (b.f378710g != null) {
                b.f378716m = new ListPreference(b.f378709f);
                if (b.f378710g instanceof C139869e) {
                    b.f378716m.mo8339F(false);
                }
                if (b.f378710g instanceof C139871g) {
                    b.f378716m.mo8348O(false);
                }
                ListPreference listPreference = b.f378716m;
                listPreference.f12751w = false;
                listPreference.mo8343J(b.f378711h);
                b.f378716m.mo8347N(b.f378710g.mo111460j());
                b.f378716m.f12693a = b.f378710g.mo111460j();
                b.f378716m.mo8342I(false);
                if (TextUtils.isEmpty(b.f378710g.mo111457g())) {
                    b.f378716m.mo8329n("%s");
                } else {
                    b.f378716m.mo8329n(b.f378710g.mo111457g());
                }
                CharSequence[] charSequenceArr = (CharSequence[]) b.f378710g.mo111873c().toArray(new CharSequence[0]);
                ListPreference listPreference2 = b.f378716m;
                listPreference2.f12707g = charSequenceArr;
                listPreference2.f12708h = charSequenceArr;
                C47713d dVar = b.f378714k;
                listPreference2.f12743o = new C47712c(dVar, "Choice setting clicked", new C139239l(b));
                listPreference2.f12742n = new C47711b(dVar, "Choice setting changed", new C139240m(b));
            }
            b.f378713j.mo50429i(b.f378708e);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139237j.m226266a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139241n b = mo17754z();
            C139867c cVar = b.f378710g;
            if (cVar != null) {
                b.f378712i.mo50707a(cVar.mo111872b(), b.f378704a);
                C139867c cVar2 = b.f378710g;
                if (cVar2 instanceof C139869e) {
                    b.f378712i.mo50707a(((C139869e) cVar2).mo111464n(), b.f378705b);
                }
                C139867c cVar3 = b.f378710g;
                if (cVar3 instanceof C139870f) {
                    b.f378712i.mo50707a(((C139870f) cVar3).mo111454d(), b.f378707d);
                }
            }
            C139867c cVar4 = b.f378710g;
            if (cVar4 instanceof C139871g) {
                b.f378712i.mo50707a(((C139871g) cVar4).mo111455e(), b.f378706c);
            }
            C47831fm.m85019n();
            return null;
        } catch (Throwable th) {
            C139237j.m226266a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378701e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139237j.m226266a(th, th);
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
            C139237j.m226266a(th, th);
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
            if (!this.f378701e) {
                super.onAttach(context);
                if (this.f378698a == null) {
                    Object jN = mo114822f().mo17653jN();
                    Map hG = ((C74176nj) jN).mo69829hG();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    this.f378698a = new C139241n((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), hG, b, (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69847he(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378700d));
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
                C139237j.m226266a(th, th2);
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
