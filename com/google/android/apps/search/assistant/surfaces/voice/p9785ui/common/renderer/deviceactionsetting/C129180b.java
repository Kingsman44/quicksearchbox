package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.b */
/* compiled from: PG */
public final class C129180b extends C129175ab implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129181c f354859a;

    /* renamed from: c */
    private Context f354860c;

    /* renamed from: d */
    private final C2393x f354861d = new C2393x(this);

    /* renamed from: e */
    private boolean f354862e;

    @Deprecated
    public C129180b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C129180b m210881a(AccountId accountId, C52131gj gjVar) {
        C129180b bVar = new C129180b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, gjVar);
        return bVar;
    }

    /* renamed from: b */
    public final C129181c mo17754z() {
        C129181c cVar = this.f354859a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f354862e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo108875d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f354860c == null) {
            this.f354860c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f354860c;
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
        return this.f354861d;
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
            C129170a.m210853a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129181c b = mo17754z();
            FragmentManager childFragmentManager = b.f354863a.getChildFragmentManager();
            C52131gj gjVar = b.f354865c;
            if ((gjVar.f136791a & 16) != 0) {
                if (!gjVar.f136796f.isEmpty()) {
                    C58976aa aaVar = C58975e.f156826a;
                    if (childFragmentManager.f634a.mo671c("SETTING_SLICE_FRAGMENT_TAG") == null) {
                        C0154a aVar = new C0154a(childFragmentManager);
                        AccountId accountId = b.f354864b;
                        C52131gj gjVar2 = b.f354865c;
                        C129225x xVar = new C129225x();
                        C68324h.m98669f(xVar);
                        C47247a.m84047b(xVar, accountId);
                        C47243l.m84039a(xVar, gjVar2);
                        aVar.mo689v(R.id.assistant_setting_card_ui, xVar, "SETTING_SLICE_FRAGMENT_TAG");
                        aVar.mo509f();
                    }
                    C47831fm.m85019n();
                    return;
                }
            }
            C58976aa aaVar2 = C58975e.f156826a;
            if (childFragmentManager.f634a.mo671c("SETTING_NATIVE_FRAGMENT_TAG") == null) {
                C0154a aVar2 = new C0154a(childFragmentManager);
                AccountId accountId2 = b.f354864b;
                C52131gj gjVar3 = b.f354865c;
                C129209h hVar = new C129209h();
                C68324h.m98669f(hVar);
                C47247a.m84047b(hVar, accountId2);
                C47243l.m84039a(hVar, gjVar3);
                aVar2.mo689v(R.id.assistant_setting_card_ui, hVar, "SETTING_NATIVE_FRAGMENT_TAG");
                aVar2.mo509f();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129170a.m210853a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View inflate = layoutInflater.inflate(R.layout.assistant_ma_settings_card, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C129170a.m210853a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f354862e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129170a.m210853a(th, th);
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
            C129170a.m210853a(th, th);
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
            if (!this.f354862e) {
                super.onAttach(context);
                if (this.f354859a == null) {
                    Object jN = mo108876f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C129180b) {
                        C129180b bVar = (C129180b) fragment;
                        C68225k.m98532d(bVar);
                        this.f354859a = new C129181c(bVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), ((C74176nj) jN).mo69848hf());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f354861d));
                    } else {
                        String obj = C129181c.class.toString();
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
                C129170a.m210853a(th, th2);
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
