package com.google.android.apps.gsa.assistant.settings.p526e;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ViewFlipper;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.base.C9510l;
import com.google.android.apps.gsa.assistant.settings.base.C9511m;
import com.google.android.apps.gsa.assistant.settings.features.as.b.c;
import com.google.android.apps.gsa.assistant.settings.features.as.b.j;
import com.google.android.apps.gsa.assistant.settings.features.as.b.s;
import com.google.android.apps.gsa.assistant.settings.features.as.b.u;
import com.google.android.apps.gsa.assistant.settings.features.bb.b;
import com.google.android.apps.gsa.assistant.settings.features.commute.web.DrivingModeJavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b.C10091a;
import com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b.C10092b;
import com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b.C10094d;
import com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b.C10095e;
import com.google.android.apps.gsa.assistant.settings.features.p563ap.C10184b;
import com.google.android.apps.gsa.assistant.settings.features.p5737k.C73188b;
import com.google.android.apps.gsa.assistant.settings.features.payments.C73295ae;
import com.google.android.apps.gsa.assistant.settings.features.payments.bv;
import com.google.android.apps.gsa.assistant.settings.p526e.p527a.C9735a;
import com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9739b;
import com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9741d;
import com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9743f;
import com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9745h;
import com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9749l;
import com.google.android.apps.gsa.assistant.settings.p526e.p528b.C9750m;
import com.google.android.apps.gsa.assistant.settings.shared.g.d;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7037e.C89720f;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.helper.crossprofile.C92331p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.v */
/* compiled from: PG */
public final class C9770v extends C9734a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C9772x f33728a;

    /* renamed from: c */
    private Context f33729c;

    /* renamed from: d */
    private final C2393x f33730d = new C2393x(this);

    /* renamed from: e */
    private boolean f33731e;

    @Deprecated
    public C9770v() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18000b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f33729c == null) {
            this.f33729c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f33729c;
    }

    /* renamed from: f */
    public final C9772x mo17754z() {
        C9772x xVar = this.f33728a;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f33731e) {
            return xVar;
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
        return this.f33730d;
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
            C9769u.m24516a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        Throwable th;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C9772x f = mo17754z();
            f.f33739g.mo83702b(C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_ONCREATE);
            C9762n nVar = f.f33734b;
            C9770v vVar = f.f33733a;
            Objects.requireNonNull(vVar);
            C9771w wVar = new C9771w(vVar);
            String str = f.f33741i.f33667b;
            Executor executor = (Executor) nVar.f33699a.mo17428b();
            executor.getClass();
            ((d) nVar.f33700b.mo17428b()).getClass();
            C86054o oVar = (C86054o) nVar.f33701c.mo17428b();
            oVar.getClass();
            h hVar = (h) nVar.f33702d.mo17428b();
            hVar.getClass();
            C9768t tVar = (C9768t) nVar.f33703e.mo17428b();
            tVar.getClass();
            C85757cq cqVar = (C85757cq) nVar.f33704f.mo17428b();
            cqVar.getClass();
            C22871g gVar = (C22871g) nVar.f33705g.mo17428b();
            gVar.getClass();
            C86124t tVar2 = (C86124t) nVar.f33706h.mo17428b();
            tVar2.getClass();
            C68214a a = C68219e.m98518a(((C68226l) nVar.f33707i).f184585a);
            a.getClass();
            C89859i iVar = (C89859i) nVar.f33708j.mo17428b();
            iVar.getClass();
            C9735a aVar = (C9735a) nVar.f33709k.mo17428b();
            aVar.getClass();
            Bundle bundle2 = (Bundle) nVar.f33710l.mo17428b();
            bundle2.getClass();
            str.getClass();
            C9761m mVar = r4;
            C9761m mVar2 = new C9761m(executor, oVar, hVar, tVar, cqVar, gVar, tVar2, a, iVar, aVar, bundle2, wVar, "WebFragmentPeerController", str);
            f.f33742j = mVar;
            for (C73740a aVar2 : f.f33738f) {
                C9761m mVar3 = f.f33742j;
                mVar3.f33684g.put(aVar2.mo18002a(), aVar2);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th2) {
            C9769u.m24516a(th, th2);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C9772x f = mo17754z();
            if (f.f33735c.mo79746e(C90059dk.f249101bK)) {
                C73778a.m108339b(f.f33733a);
            } else {
                C73778a.m108338a(f.f33733a);
            }
            C9761m mVar = f.f33742j;
            View inflate = layoutInflater.inflate(R.layout.controller_web_feature, viewGroup, false);
            mVar.f33685h = (ViewFlipper) inflate.findViewById(R.id.controller_web_feature_view_flipper);
            mVar.f33686i = (WebView) inflate.findViewById(R.id.controller_web_feature_web_view);
            mVar.f33686i.getSettings().setJavaScriptEnabled(true);
            for (Map.Entry entry : mVar.f33684g.entrySet()) {
                C73740a aVar = (C73740a) entry.getValue();
                WebView webView = mVar.f33686i;
                aVar.mo18003b();
                mVar.f33686i.addJavascriptInterface(aVar, (String) entry.getKey());
            }
            mVar.f33686i.getSettings().setUserAgentString(mVar.f33680c.mo6453a());
            mVar.f33686i.setBackgroundColor(0);
            WebView webView2 = mVar.f33686i;
            C9768t tVar = mVar.f33679b;
            C9758j jVar = new C9758j(mVar);
            String str = mVar.f33681d;
            C86124t tVar2 = (C86124t) tVar.f33726a.mo17428b();
            tVar2.getClass();
            C91090a aVar2 = (C91090a) tVar.f33727b.mo17428b();
            aVar2.getClass();
            str.getClass();
            webView2.setWebViewClient(new C9767s(tVar2, aVar2, jVar, str));
            mVar.f33686i.setWebChromeClient(new C9760l(mVar));
            if (mVar.mo18023e()) {
                mVar.mo18022d();
            } else {
                mVar.mo18021c();
            }
            f.f33737e.f33662a = f.f33742j.f33686i;
            int i = f.f33736d.mo18025a(f.f33741i.f33667b).f33715b;
            if (i != 0) {
                f.f33740h.f76997b.mo33800a(C28427h.m53115a(i)).mo33809b(inflate);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C9769u.m24516a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f33731e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C9769u.m24516a(th, th);
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
            C9769u.m24516a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C0167am activity = mo17754z().f33742j.f33687j.f33732a.getActivity();
            if (activity instanceof C9511m) {
                ((C9511m) activity).mo17822A();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C9769u.m24516a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C9761m mVar = mo17754z().f33742j;
            C0167am activity = mVar.f33687j.f33732a.getActivity();
            if (activity instanceof C9511m) {
                C9511m mVar2 = (C9511m) activity;
                mVar2.mo17824D(new C90892az("WebFeatureController#onBackPressedListener", new C9755g(mVar, mVar2)));
            }
            e.close();
            return;
        } catch (Throwable th) {
            C9769u.m24516a(th, th);
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
        C9770v vVar;
        Iterable iterable;
        Iterable iterable2;
        this.f122869b.mo51381i();
        try {
            if (!this.f33731e) {
                super.onAttach(context);
                if (this.f33728a == null) {
                    try {
                        Object jN = mo17999a().mo17653jN();
                        Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                        if (fragment instanceof C9770v) {
                            C9770v vVar2 = (C9770v) fragment;
                            C68225k.m98532d(vVar2);
                            Bundle a = ((C74178nm) jN).mo70044a();
                            C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            C9753e eVar = (C9753e) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C9753e.f33664d, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                            C68225k.m98532d(eVar);
                            aqy aqy = ((C74178nm) jN).f207130a;
                            C69464a aVar = aqy.j;
                            C69464a aVar2 = ((C74178nm) jN).f207136c.f205800j;
                            asp asp = aqy.a;
                            C69464a aVar3 = asp.f202324I;
                            C69464a aVar4 = asp.f202853es;
                            C69464a aVar5 = ((C74178nm) jN).f207108E;
                            C69464a aVar6 = asp.f202729ca;
                            C69464a aVar7 = aqy.aT;
                            C69464a aVar8 = asp.f202006C;
                            C69464a a2 = C68226l.m98533a(asp.f203285n);
                            C69464a aVar9 = ((C74178nm) jN).f207130a.a.f202586Q;
                            C73964bv bvVar = ((C74178nm) jN).f207136c;
                            C9762n nVar = new C9762n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, a2, aVar9, bvVar.f205654cx, bvVar.f205805o);
                            C86124t tVar = (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                            C9766r rVar = new C9766r(((C74178nm) jN).f207136c.mo69210cd());
                            C9751c cVar = (C9751c) ((C74178nm) jN).f207136c.f205655cy.mo17428b();
                            C58526ih C = C58528ij.m90003C(16);
                            C73964bv bvVar2 = ((C74178nm) jN).f207136c;
                            C73188b bVar = new C73188b((C90021c) bvVar2.f205604c.a.f202006C.mo17428b(), (C9751c) bvVar2.f205655cy.mo17428b(), bvVar2.mo69382n());
                            if (((C90021c) bvVar2.f205604c.a.f202006C.mo17428b()).mo79746e(C90059dk.f249017G)) {
                                iterable = new C58759qy(bVar);
                            } else {
                                iterable = C58733pz.f156496a;
                            }
                            C68225k.m98532d(iterable);
                            C.mo55489i(iterable);
                            C73964bv bvVar3 = ((C74178nm) jN).f207136c;
                            Context context2 = (Context) bvVar3.f205604c.g.mo17428b();
                            C.mo55489i(new C58759qy(new C73295ae((C91097g) bvVar3.f205799i.mo17428b(), (C9751c) bvVar3.f205655cy.mo17428b(), (C84516aa) bvVar3.f205604c.cK.mo17428b(), (h) bvVar3.f205604c.a.f202853es.mo17428b(), (bv) bvVar3.f205604c.b.f200243fs.mo17428b(), (C87677ae) bvVar3.f205604c.a.f202634al.mo17428b())));
                            C73964bv bvVar4 = ((C74178nm) jN).f207136c;
                            C90021c cVar2 = (C90021c) bvVar4.f205604c.a.f202006C.mo17428b();
                            aso aso = bvVar4.f205604c.d;
                            C.mo55489i(new C58759qy(new C10184b((C90021c) bvVar4.f205604c.a.f202006C.mo17428b(), (C9751c) bvVar4.f205655cy.mo17428b(), bvVar4.mo69382n(), (C91097g) bvVar4.f205799i.mo17428b(), new C92331p((Context) aso.f201488a.g.mo17428b(), C68219e.m98518a(aso.f201488a.ng)), (C86054o) bvVar4.f205604c.a.f202324I.mo17428b(), bvVar4.f205604c.a.mo68669x(), (C39141kp) bvVar4.f205604c.v.mo17428b())));
                            C73964bv bvVar5 = ((C74178nm) jN).f207136c;
                            C9510l lVar = (C9510l) ((Activity) bvVar5.f205710e.mo17428b());
                            C68225k.m98532d(lVar);
                            C9739b bVar2 = new C9739b((Activity) bvVar5.f205710e.mo17428b(), lVar, (C22871g) bvVar5.f205604c.aT.mo17428b());
                            if (((C90021c) bvVar5.f205604c.a.f202006C.mo17428b()).mo79746e(C90059dk.f249101bK)) {
                                iterable2 = C58733pz.f156496a;
                            } else {
                                iterable2 = new C58759qy(bVar2);
                            }
                            C68225k.m98532d(iterable2);
                            C.mo55489i(iterable2);
                            C73964bv bvVar6 = ((C74178nm) jN).f207136c;
                            C90476a aVar10 = (C90476a) bvVar6.f205604c.r.mo17428b();
                            C.mo55489i(new C58759qy(new b((Context) bvVar6.f205604c.g.mo17428b(), (C91097g) bvVar6.f205799i.mo17428b())));
                            C73964bv bvVar7 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new DrivingModeJavascriptInterface((Context) bvVar7.f205604c.g.mo17428b(), (C91097g) bvVar7.f205799i.mo17428b(), (C90851k) bvVar7.f205604c.s.mo17428b(), (C9751c) bvVar7.f205655cy.mo17428b(), bvVar7.mo69132bE(), (C86034c) bvVar7.f205604c.a.f202653bD.mo17428b(), (C86054o) bvVar7.f205604c.a.f202324I.mo17428b()));
                            C73964bv bvVar8 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C10091a((Context) bvVar8.f205604c.g.mo17428b(), (C87568k) bvVar8.f205604c.a.f202812eD.mo17428b()));
                            C.mo55373c(new C10095e((C36275ad) ((C74178nm) jN).f207136c.f205604c.gW.mo17428b()));
                            C73964bv bvVar9 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C10094d((C36275ad) bvVar9.f205604c.gW.mo17428b(), (C58833ax) bvVar9.f205656cz.mo17428b()));
                            C.mo55373c(new C10092b(((C74178nm) jN).f207136c.f205604c.cD()));
                            C73964bv bvVar10 = ((C74178nm) jN).f207136c;
                            aso aso2 = bvVar10.f205604c.d;
                            C.mo55373c(new s((C91097g) bvVar10.f205799i.mo17428b(), (NotificationManager) bvVar10.f205604c.ah.mo17428b(), (Activity) bvVar10.f205710e.mo17428b(), (C9751c) bvVar10.f205655cy.mo17428b(), (C22871g) bvVar10.f205604c.aU.mo17428b(), (C47449e) bvVar10.f205604c.gH.mo17428b(), (C89720f) bvVar10.f205604c.b.f200116dX.mo17428b(), new j(new c((C86034c) aso2.f201488a.a.f202653bD.mo17428b(), (Context) aso2.f201488a.g.mo17428b(), (Executor) aso2.f201488a.n.mo17428b()), new u((C86034c) bvVar10.f205604c.a.f202653bD.mo17428b(), (Context) bvVar10.f205604c.g.mo17428b(), (Executor) bvVar10.f205604c.n.mo17428b()), (Executor) bvVar10.f205604c.n.mo17428b()), (C60887da) bvVar10.f205604c.j.mo17428b(), (C86034c) bvVar10.f205604c.a.f202653bD.mo17428b(), (C90479a) bvVar10.f205604c.t.mo17428b()));
                            C73964bv bvVar11 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C9745h((h) bvVar11.f205604c.a.f202853es.mo17428b(), (C91097g) bvVar11.f205799i.mo17428b(), (C9751c) bvVar11.f205655cy.mo17428b()));
                            C73964bv bvVar12 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C9750m((Context) bvVar12.f205604c.g.mo17428b(), (C87568k) bvVar12.f205604c.a.f202812eD.mo17428b()));
                            C73964bv bvVar13 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C9741d((h) bvVar13.f205604c.a.f202853es.mo17428b(), (C91097g) bvVar13.f205799i.mo17428b(), (Context) bvVar13.f205604c.g.mo17428b(), (C9751c) bvVar13.f205655cy.mo17428b()));
                            C73964bv bvVar14 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C9743f((C91097g) bvVar14.f205799i.mo17428b(), (C9751c) bvVar14.f205655cy.mo17428b(), (ContentResolver) bvVar14.f205604c.h.mo17428b(), (m) bvVar14.f205604c.a.f202851eq.mo17428b()));
                            C73964bv bvVar15 = ((C74178nm) jN).f207136c;
                            C.mo55373c(new C9749l((C22871g) bvVar15.f205604c.aU.mo17428b(), (C91189au) bvVar15.f205604c.a.f202737ci.mo17428b(), (C89720f) bvVar15.f205604c.b.f200116dX.mo17428b(), (C9751c) bvVar15.f205655cy.mo17428b()));
                            vVar = this;
                            vVar.f33728a = new C9772x(vVar2, eVar, nVar, tVar, rVar, cVar, C.mo55486f(), (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b(), (C28310af) ((C74178nm) jN).f207130a.a.f202878fQ.mo17428b());
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(vVar.f122869b, vVar.f33730d));
                        } else {
                            String obj = C9772x.class.toString();
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
                    vVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = vVar.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
