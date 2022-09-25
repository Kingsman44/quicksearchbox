package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127678aa;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127679ab;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127681ad;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127683ae;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127686b;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127691g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127700p;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127701q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.C68214a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.w */
/* compiled from: PG */
public final class C127868w extends C127844ab implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C127869x f351925a;

    /* renamed from: c */
    private Context f351926c;

    /* renamed from: d */
    private final C2393x f351927d = new C2393x(this);

    /* renamed from: e */
    private boolean f351928e;

    @Deprecated
    public C127868w() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C127869x mo17754z() {
        C127869x xVar = this.f351925a;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f351928e) {
            return xVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo108242b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f351926c == null) {
            this.f351926c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f351926c;
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
        return this.f351927d;
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
            C127867v.m208942a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C127869x a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            a.f351937i.mo19974a(C37176a.f97059eR);
            boolean z = false;
            View inflate = layoutInflater.inflate(R.layout.assistant_learning_center_fragment, viewGroup, false);
            C28306ab abVar = a.f351935g;
            C0167am activity = a.f351943o.getActivity();
            activity.getClass();
            C28313c a2 = a.f351936h.mo33805a(C28427h.m53115a(140132));
            a2.mo33861i(C28439i.f77216b);
            a2.mo33859g(C28375ak.m53061c(142071));
            a2.mo33859g(C45954d.m82060a(a.f351930b));
            int i = C28485y.f77298f;
            C28439i b = abVar.mo33801b(activity.findViewById(16908290), a2);
            C127865t tVar = a.f351939k;
            tVar.getClass();
            tVar.mo108254b(b, C45954d.m82060a(a.f351930b));
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.assistant_learning_center_content);
            viewGroup2.getClass();
            RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.assistant_learning_center_recycler_view);
            a.f351938j = new LinearLayoutManager(a.f351934f);
            LinearLayoutManager linearLayoutManager = a.f351938j;
            linearLayoutManager.getClass();
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setLayerType(2, (Paint) null);
            C127865t tVar2 = a.f351939k;
            tVar2.getClass();
            a.f351940l = tVar2.mo108253a();
            recyclerView.setAdapter(a.f351940l);
            a.f351943o.requireActivity().f2707h.mo3339b(a.f351943o, a.f351945q);
            a.f351932d.mo50708b(a.f351931c.mo50244a(a.f351930b), C46788de.DONT_CARE, new C127872z());
            if (!a.f351933e.getBoolean("olc.use_grpc") && a.f351933e.getBoolean("olc.use_prefetched_data")) {
                z = true;
            }
            if (a.f351933e.getBoolean("olc.use_grpc_with_parallel_loading")) {
                a.f351937i.mo19974a(C37176a.f97113fS);
                a.f351946r = 2;
                C46801dp dpVar = a.f351932d;
                C127679ab abVar2 = a.f351947s;
                Bundle bundle2 = a.f351933e;
                Context context = a.f351934f;
                context.getClass();
                dpVar.mo50707a(new C127678aa(abVar2, bundle2, Duration.ofMillis(bundle2.getLong("olc.grpc_request_timeout_in_ms", abVar2.f351520c.longValue())), bundle2.getBoolean("olc.grpc_enable_response_compression", true), (context.getResources().getConfiguration().uiMode & 48) == 32 ? R.raw.assistant_learning_center_dark_mode_olc_card : R.raw.assistant_learning_center_olc_card), a.f351944p);
            } else if (a.f351933e.getBoolean("olc.use_grpc")) {
                a.f351937i.mo19974a(C37176a.f97113fS);
                a.f351946r = 2;
                C46801dp dpVar2 = a.f351932d;
                C127701q qVar = a.f351942n;
                Bundle bundle3 = a.f351933e;
                dpVar2.mo50707a(new C127700p(qVar, bundle3, Duration.ofMillis(bundle3.getLong("olc.grpc_request_timeout_in_ms", qVar.f351568d.longValue())), bundle3.getBoolean("olc.grpc_enable_response_compression", true)), a.f351944p);
            } else if (z) {
                a.f351937i.mo19974a(C37176a.f97060eS);
                a.f351946r = 1;
                C46801dp dpVar3 = a.f351932d;
                C127691g gVar = a.f351941m;
                dpVar3.mo50707a(new C46719bc(gVar.f351550b, new C127686b(gVar), "learning_center_content"), a.f351944p);
            } else {
                a.f351937i.mo19974a(C37176a.f97061eT);
                C46755l lVar = a.f351940l;
                lVar.getClass();
                lVar.mo50772a(a.mo108256a());
                a.f351937i.mo19974a(C37176a.f97066eY);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C127867v.m208942a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            mo17754z().f351937i.mo19974a(C37176a.f97121fa.mo40805c(C62722b.OK));
            b.close();
            return;
        } catch (Throwable th) {
            C127867v.m208942a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f351928e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C127867v.m208942a(th, th);
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
            C127867v.m208942a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f351937i.mo19974a(C37176a.f97143fw);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C127867v.m208942a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().f351937i.mo19974a(C37176a.f97122fb);
            e.close();
            return;
        } catch (Throwable th) {
            C127867v.m208942a(th, th);
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
        C127868w wVar;
        this.f122869b.mo51381i();
        try {
            if (!this.f351928e) {
                super.onAttach(context);
                if (this.f351925a == null) {
                    try {
                        Object jN = mo108243d().mo17653jN();
                        Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                        if (fragment instanceof C127868w) {
                            C127868w wVar2 = (C127868w) fragment;
                            C68225k.m98532d(wVar2);
                            AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                            C46175b bVar = (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b();
                            C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                            Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                            C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                            C28310af afVar = (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b();
                            C127865t v = ((C74176nj) jN).mo70012v();
                            C127691g u = ((C74176nj) jN).mo70011u();
                            C37215b bVar2 = (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b();
                            C127683ae aeVar = new C127683ae(((C74176nj) jN).f206730b.f198027a.mo66904eX(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Context) ((C74176nj) jN).f206677a.g.mo17428b());
                            C21370a aVar = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                            String c = ((C74176nj) jN).f206730b.f198027a.mo66938fE().mo60454c();
                            C68225k.m98532d(c);
                            C127701q qVar = new C127701q(aeVar, (C42876ab) ((C74176nj) jN).f206730b.f198027a.f199393eF.mo17428b(), new C127681ad(C68219e.m98518a(((C74176nj) jN).f206730b.f198077ax), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (Context) ((C74176nj) jN).f206677a.g.mo17428b(), c, ((C74176nj) jN).f206730b.f198027a.mo66938fE().mo60455d()), (C60888db) ((C74176nj) jN).f206677a.n.mo17428b(), Long.valueOf(((C74176nj) jN).f206730b.f198027a.mo66938fE().mo60452a()), Long.valueOf(((C74176nj) jN).f206730b.f198027a.mo66938fE().mo60453b()), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (C60950i) ((C74176nj) jN).f206677a.bC.mo17428b());
                            aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                            C127683ae aeVar2 = new C127683ae(aqe.mo66904eX(), (AccountId) aqe.f199228b.f198239e.mo17428b(), (Context) aqe.f199175a.g.mo17428b());
                            C68214a a = C68219e.m98518a(aqe.f199175a.dq);
                            String c2 = aqe.mo66938fE().mo60454c();
                            C68225k.m98532d(c2);
                            wVar = this;
                            wVar.f351925a = new C127869x(wVar2, accountId, bVar, dpVar, context2, abVar, afVar, v, u, bVar2, qVar, new C127679ab(aeVar2, (C42876ab) aqe.f199393eF.mo17428b(), a, new C127681ad(C68219e.m98518a(aqe.f199228b.f198077ax), (AccountId) aqe.f199228b.f198239e.mo17428b(), (Context) aqe.f199175a.g.mo17428b(), c2, aqe.mo66938fE().mo60455d()), (C60888db) aqe.f199175a.n.mo17428b(), (Context) aqe.f199175a.g.mo17428b(), Long.valueOf(aqe.mo66938fE().mo60452a()), Long.valueOf(aqe.mo66938fE().mo60453b()), (C37215b) aqe.f199228b.f198067an.mo17428b(), (C60950i) aqe.f199175a.bC.mo17428b()));
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(wVar.f122869b, wVar.f351927d));
                        } else {
                            String obj = C127869x.class.toString();
                            String valueOf = String.valueOf(fragment.getClass());
                            throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        C47831fm.m85019n();
                        throw th2;
                    }
                } else {
                    wVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = wVar.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            C47831fm.m85019n();
            throw th22;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
