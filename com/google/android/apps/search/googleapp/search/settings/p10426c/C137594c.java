package com.google.android.apps.search.googleapp.search.settings.p10426c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.errorpage.C43514b;
import com.google.android.libraries.web.contrib.errorpage.C43529q;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.c.c */
/* compiled from: PG */
public final class C137594c extends C137592a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137596e f374256a;

    /* renamed from: c */
    private Context f374257c;

    /* renamed from: d */
    private final C2393x f374258d = new C2393x(this);

    /* renamed from: e */
    private boolean f374259e;

    @Deprecated
    public C137594c() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C137594c m223545f(AccountId accountId) {
        C137594c cVar = new C137594c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113843b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374257c == null) {
            this.f374257c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374257c;
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
        return this.f374258d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C137596e mo17754z() {
        C137596e eVar = this.f374256a;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374259e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137593b.m223544a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137596e j = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_setting_error_card, viewGroup, false);
            C28306ab abVar = j.f374265d;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(152888)));
            View findViewById = inflate.findViewById(R.id.googleapp_setting_error_card_retry_button);
            C28306ab abVar2 = j.f374265d;
            abVar2.mo33801b(findViewById, abVar2.f76990a.mo33805a(C28427h.m53115a(152911)));
            findViewById.setOnClickListener(new C47591co(j.f374264c, "clicked on retry button", new C137595d(j, findViewById)));
            C43529q qVar = new C43529q(j.f374262a);
            qVar.f113656a.mo55488h(C43514b.CONNECTIVITY, C43514b.RENDERER_GONE);
            qVar.mo46586a();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C137593b.m223544a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374259e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137593b.m223544a(th, th);
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
            C137593b.m223544a(th, th);
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
            if (!this.f374259e) {
                super.onAttach(context);
                if (this.f374256a == null) {
                    Object jN = mo113842a().mo17653jN();
                    this.f374256a = new C137596e(((C74176nj) jN).mo69720fD(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69766fx());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374258d));
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
                C137593b.m223544a(th, th2);
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
