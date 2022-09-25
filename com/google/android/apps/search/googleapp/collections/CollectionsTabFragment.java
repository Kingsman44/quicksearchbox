package com.google.android.apps.search.googleapp.collections;

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
import com.google.android.apps.search.googleapp.accounts.p10125c.C133162b;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.config.webfeature.AutoValue_UserAgentListenerFeature;
import com.google.android.apps.search.googleapp.incognito.p10333i.C136353h;
import com.google.android.apps.search.googleapp.p10527u.C139776q;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139888f;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.search.silk.web.collections.SilkCollectionsV2Feature;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.search.silk.web.share.C40907c;
import com.google.android.libraries.search.silk.web.share.SilkShareFeature;
import com.google.android.libraries.search.silk.web.signin.SilkSignInFeature;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43266q;
import com.google.android.libraries.web.webview.contrib.setup.WebViewSetupFeature;
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
import com.google.common.p4552o.apk;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.Locale;

/* compiled from: PG */
public final class CollectionsTabFragment extends C133498ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133527x f363727a;

    /* renamed from: c */
    private Context f363728c;

    /* renamed from: d */
    private final C2393x f363729d = new C2393x(this);

    /* renamed from: e */
    private boolean f363730e;

    @Deprecated
    public CollectionsTabFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133527x mo17754z() {
        C133527x xVar = this.f363727a;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363730e) {
            return xVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111195b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363728c == null) {
            this.f363728c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363728c;
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
        return this.f363729d;
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
            C133526w.m216740a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C133527x a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_collections_tab_fragment, viewGroup, false);
            a.f363819d.f76997b.mo33800a(C28427h.m53115a(114692)).mo33809b(inflate);
            if (!a.f363822g.f101930a) {
                if (a.mo111218a() == null) {
                    C43264o a2 = C43265p.m76349a(a.f363816a, a.f363821f);
                    C0154a aVar = new C0154a(a.f363818c.getChildFragmentManager());
                    aVar.mo689v(R.id.googleapp_collections_tab_fragment, a2, "web-coordinator");
                    aVar.mo509f();
                    C43266q f = a2.mo17754z();
                    AccountId accountId = a.f363816a;
                    C133514l lVar = a.f363817b;
                    C133512j jVar = new C133512j();
                    C68324h.m98669f(jVar);
                    C47247a.m84047b(jVar, accountId);
                    C47243l.m84039a(jVar, lVar);
                    f.mo46380b(jVar);
                }
            } else if (((C136353h) a.f363818c.getChildFragmentManager().f634a.mo671c("collections_incongito")) == null) {
                AccountId accountId2 = a.f363816a;
                C139776q qVar = (C139776q) C139777r.f379893c.createBuilder();
                C139779t tVar = C139779t.COLLECTIONS;
                qVar.copyOnWrite();
                C139777r rVar = (C139777r) qVar.instance;
                rVar.f379896b = tVar.f379907i;
                rVar.f379895a |= 1;
                C136353h a3 = C136353h.m221535a(accountId2, (C139777r) qVar.build());
                C0154a aVar2 = new C0154a(a.f363818c.getChildFragmentManager());
                aVar2.mo511h(R.id.googleapp_collections_tab_fragment, a3, "collections_incongito", 1);
                aVar2.mo509f();
            }
            a.f363820e.mo115163a();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C133526w.m216740a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f363730e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133526w.m216740a(th, th);
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
            C133526w.m216740a(th, th);
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
            if (!this.f363730e) {
                super.onAttach(context);
                if (this.f363727a == null) {
                    Object jN = mo111202d().mo17653jN();
                    C40758l fl = ((C74176nj) jN).mo69754fl();
                    C43259j jVar = new C43259j();
                    jVar.mo46375e(((C133665d) ((C74176nj) jN).f206730b.f198021U.mo17428b()).mo111322c());
                    C40756j jVar2 = (C40756j) C40757k.f106857c.createBuilder();
                    apk apk = apk.TNG_COLLECTIONS;
                    jVar2.copyOnWrite();
                    C40757k kVar = (C40757k) jVar2.instance;
                    kVar.f106860b = apk.f159677E;
                    kVar.f106859a |= 1;
                    jVar.mo46372b(fl.mo42702a((C40757k) jVar2.build()), SilkShareFeature.m70984e(new C40907c()), SilkSignInFeature.m71017e(new C133162b()), SilkCollectionsV2Feature.m70594e(new C139888f()), new AutoValue_UserAgentListenerFeature(), WebViewSetupFeature.m78387d(C133528y.class));
                    this.f363727a = new C133527x((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), ((C74176nj) jN).mo69554bx(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b(), jVar.mo46371a());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f363729d));
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
                C133526w.m216740a(th, th2);
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
