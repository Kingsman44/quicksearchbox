package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

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
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.apps.search.googleapp.saves.savefeature.C137281b;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137308f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137309g;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137310h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137311i;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137312j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.protobuf.C62921ba;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.ab */
/* compiled from: PG */
public final class C137314ab extends C137350ba implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137316ad f373519a;

    /* renamed from: c */
    private Context f373520c;

    /* renamed from: d */
    private final C2393x f373521d = new C2393x(this);

    /* renamed from: e */
    private boolean f373522e;

    @Deprecated
    public C137314ab() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137316ad mo17754z() {
        C137316ad adVar = this.f373519a;
        if (adVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f373522e) {
            return adVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113638b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f373520c == null) {
            this.f373520c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f373520c;
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
        return this.f373521d;
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
            C137313aa.m223076a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137316ad a = mo17754z();
            a.mo113648i(C137281b.f373475c);
            a.f373527d.mo50429i(a.f373535l);
            a.f373527d.mo50429i(a.f373536m);
            a.f373527d.mo50429i(a.f373537n);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137313aa.m223076a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137316ad a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_save_fragment, viewGroup, false);
            inflate.setOnTouchListener(new C47586cj(a.f373532i, new C137315ac(a), "SaveRootView onTouch"));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C137313aa.m223076a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f373522e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137313aa.m223076a(th, th);
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
            C137313aa.m223076a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C137316ad a = mo17754z();
            C47393f.m84233d(this, C137311i.class, new C137321af(a));
            C47393f.m84233d(this, C137308f.class, new C137322ag(a));
            C47393f.m84233d(this, C137310h.class, new C137323ah(a));
            C47393f.m84233d(this, C137312j.class, new C137324ai(a));
            C47393f.m84233d(this, C137309g.class, new C137325aj(a));
            C47393f.m84233d(this, C32214c.class, new C137326ak(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137313aa.m223076a(th, th);
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
            if (!this.f373522e) {
                super.onAttach(context);
                if (this.f373519a == null) {
                    Object jN = mo113678d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137314ab) {
                        C137314ab abVar = (C137314ab) fragment;
                        C68225k.m98532d(abVar);
                        this.f373519a = new C137316ad(accountId, abVar, ((C74176nj) jN).mo69641de(), (C137230y) ((C74176nj) jN).f206730b.f198172cm.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206681aD.mo17428b(), (InstanceStateStoreFactory) ((C74176nj) jN).f206682aE.mo17428b(), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b(), (a) ((C74176nj) jN).f206665O.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), (C136247a) ((C74176nj) jN).f206662L.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f373521d));
                    } else {
                        String obj = C137316ad.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C137313aa.m223076a(th2, th3);
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
