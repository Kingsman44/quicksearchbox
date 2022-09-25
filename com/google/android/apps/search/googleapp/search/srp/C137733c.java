package com.google.android.apps.search.googleapp.search.srp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.h.a.b;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.srp.C137886r;
import com.google.android.apps.search.googleapp.search.srp.p10433c.C137735b;
import com.google.android.apps.search.googleapp.search.srp.p10436f.C137839c;
import com.google.android.apps.search.googleapp.search.srp.p10436f.C137843g;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32212a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.search.silk.web.signin.C40930h;
import com.google.android.libraries.search.silk.web.signin.SilkSignInMessageHandler;
import com.google.android.libraries.search.silk.web.uimodes.C40946j;
import com.google.android.libraries.search.silk.web.uimodes.SilkUiModesMessageHandler;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43509a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43511c;
import com.google.android.libraries.web.contrib.p3389i.C43630d;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c */
/* compiled from: PG */
public final class C137733c extends C137724aw implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137886r f374663a;

    /* renamed from: c */
    private Context f374664c;

    /* renamed from: d */
    private final C2393x f374665d = new C2393x(this);

    /* renamed from: e */
    private boolean f374666e;

    @Deprecated
    public C137733c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137886r mo17754z() {
        C137886r rVar = this.f374663a;
        if (rVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374666e) {
            return rVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113927b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374664c == null) {
            this.f374664c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374664c;
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
        return this.f374665d;
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
            C137726b.m223865a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137886r a = mo17754z();
            if (!a.f375162l.f375183b) {
                a.f375172v.mo46655a(new C137851g(a));
                a.f375160j.mo50829i(R.id.googleapp_error_mixin_subscription, new C43509a((C43511c) a.f375157g), new C137854h(a), C137875i.f375130a);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137726b.m223865a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        C47558bi a2;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137886r a3 = mo17754z();
            C47558bi a4 = C47831fm.m85006a("HeaderFragmentPeer#onCreateView");
            try {
                ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_header_fragment, viewGroup, false);
                C28306ab abVar = a3.f375166p;
                abVar.mo33801b(viewGroup2, abVar.f76990a.mo33805a(C28427h.m53115a(105746)));
                if (a3.f375158h.getChildFragmentManager().f634a.mo671c("SRP_SEARCH_BOX_FRAGMENT") == null) {
                    a2 = C47831fm.m85006a("HeaderFragmentPeer#attachSrpSearchBoxFragment");
                    C137839c d = C137843g.m224094d(a3.f375152b, a3.f375162l);
                    C0154a aVar = new C0154a(a3.f375158h.getChildFragmentManager());
                    aVar.mo511h(R.id.googleapp_srp_search_box_fragment, d, "SRP_SEARCH_BOX_FRAGMENT", 1);
                    aVar.mo509f();
                    a2.close();
                }
                if (a3.f375158h.getChildFragmentManager().f634a.mo670b(R.id.googleapp_doodle_fragment) == null) {
                    a = C47831fm.m85006a("HeaderFragmentPeer#attachDoodleFragment");
                    C0154a aVar2 = new C0154a(a3.f375158h.getChildFragmentManager());
                    AccountId accountId = a3.f375152b;
                    C69664n.m101061g(accountId, "accountId");
                    C137735b bVar = new C137735b();
                    C68324h.m98669f(bVar);
                    C47247a.m84047b(bVar, accountId);
                    aVar2.mo511h(R.id.googleapp_doodle_fragment, bVar, "DOODLE_FRAGMENT", 1);
                    aVar2.mo509f();
                    a.close();
                }
                ((C137735b) a3.f375158h.getChildFragmentManager().f634a.mo671c("DOODLE_FRAGMENT")).mo17754z().f374688q = new C137878j(a3);
                if (!a3.f375162l.f375183b) {
                    a3.f375165o.mo50707a(a3.f375169s.mo46469b(), new C137886r.C137887a(viewGroup2, a3.f375159i));
                    a3.f375164n.f107225a.mo42963h(new C137885q(a3));
                    int h = a3.mo114023h() - 1;
                    if (h == 1) {
                        viewGroup2.setTranslationY((float) (-(a3.f375155e.getResources().getDimensionPixelSize(R.dimen.googleapp_search_header_height) - a3.f375155e.getResources().getDimensionPixelSize(R.dimen.googleapp_srp_header_search_box_padding_top))));
                        View findViewById = viewGroup2.findViewById(R.id.googleapp_doodle_fragment);
                        findViewById.getClass();
                        findViewById.setVisibility(8);
                        View findViewById2 = viewGroup2.findViewById(R.id.googleapp_account_disc_fragment);
                        findViewById2.getClass();
                        findViewById2.setVisibility(8);
                    } else if (h == 2) {
                        viewGroup2.setTranslationY((float) (-viewGroup2.getBottom()));
                        viewGroup2.setVisibility(8);
                    }
                }
                a3.f375163m.f107190a.mo42933h(new C137884p(viewGroup2));
                C2043bi.m5555ai(viewGroup2, new C137879k(a3, viewGroup2));
                a3.f375174x = a3.f375158h.getResources().getColor(R.color.agsa_color_surface);
                a3.f375156f.mo115167b(new C137880l(a3));
                a4.close();
                if (viewGroup2 != null) {
                    C47831fm.m85019n();
                    return viewGroup2;
                }
                throw new NullPointerException("Fragment cannot use Event annotations with null view!");
                throw th;
                throw th;
            } catch (Throwable th) {
                a4.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C137726b.m223865a(th2, th3);
            }
            throw th2;
        }
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            View view = mo17754z().f375158h.getView();
            view.getClass();
            view.animate().cancel();
            c.close();
            return;
        } catch (Throwable th) {
            C137726b.m223865a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374666e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137726b.m223865a(th, th);
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
            C137726b.m223865a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C137886r a = mo17754z();
            int i = ((C137722au) a.f375168r.mo47045a()).f374623d;
            if (i > 0) {
                a.mo114022g(i);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137726b.m223865a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32212a.class, new C137888s(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137726b.m223865a(th, th);
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
            if (!this.f374666e) {
                super.onAttach(context);
                if (this.f374663a == null) {
                    Object jN = mo113928d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    C137890u dh = ((C74176nj) jN).mo69644dh();
                    boolean jI = ((C74176nj) jN).f206730b.f198027a.mo67068jI();
                    boolean kx = ((C74176nj) jN).f206730b.f198027a.mo67136kx();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    b d = ((C74176nj) jN).mo69610d();
                    C139695b bVar = (C139695b) ((C74176nj) jN).f206730b.f198027a.f199333cz.mo17428b();
                    C139684f eb = ((C74176nj) jN).mo69691eb();
                    C43511c fE = ((C74176nj) jN).mo69721fE();
                    C38553h hVar = (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137733c) {
                        C137733c cVar = (C137733c) fragment;
                        C68225k.m98532d(cVar);
                        C40930h hVar2 = new C40930h(new SilkSignInMessageHandler(((C74176nj) jN).mo69770gA(), ((C74176nj) jN).mo69753fk(), ((C74176nj) jN).mo69740fX(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), Optional.m71637of(Boolean.valueOf(((C74176nj) jN).f206677a.d.mo67903fr()))));
                        C40930h hVar3 = hVar2;
                        this.f374663a = new C137886r(context2, dh, jI, kx, accountId, d, bVar, eb, fE, hVar, cVar, (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C137852a) ((C74176nj) jN).f206730b.f198027a.f199282cA.mo17428b(), hVar3, new C40946j((SilkUiModesMessageHandler) ((C74176nj) jN).mo69825hC()), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69796ga(), ((C74176nj) jN).mo69733fQ().mo46771a(C137543b.class), (C44078b) ((C74176nj) jN).f207086m.mo17428b(), ((C74176nj) jN).mo69736fT(), new C43630d(((C74176nj) jN).mo69777gH()));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374665d));
                    } else {
                        String obj = C137886r.class.toString();
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
                C137726b.m223865a(th2, th3);
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
