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
import com.google.android.apps.gsa.binaries.satin.app.C74175nh;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.accounts.C133149a;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139697a;
import com.google.android.apps.search.googleapp.search.p10406c.C137401b;
import com.google.android.apps.search.googleapp.search.p10412h.C137469b;
import com.google.android.apps.search.googleapp.search.p10412h.C137473d;
import com.google.android.apps.search.googleapp.search.p10415i.C137485ae;
import com.google.android.apps.search.googleapp.search.p10415i.C137493b;
import com.google.android.apps.search.googleapp.search.p10415i.p10416a.C137479c;
import com.google.android.apps.search.googleapp.search.p10418j.C137534h;
import com.google.android.apps.search.googleapp.search.p10418j.C137536j;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.C137546e;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.C137711an;
import com.google.android.apps.search.googleapp.search.srp.error.C137822u;
import com.google.android.apps.search.googleapp.search.srp.external.C137830c;
import com.google.android.apps.search.googleapp.search.srp.external.C137835h;
import com.google.android.apps.search.googleapp.search.srp.interceptor.C137876a;
import com.google.android.apps.search.googleapp.search.srp.p10434d.C137747a;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137764ao;
import com.google.android.apps.search.googleapp.search.srp.p10436f.C137837a;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137853b;
import com.google.android.apps.search.googleapp.search.srp.p10438h.C137871g;
import com.google.android.apps.search.googleapp.search.srp.p10438h.p10440b.p10441a.C137866d;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138772i;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2476a.p2482d.C32212a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43511c;
import com.google.android.libraries.web.contrib.p3360c.C43403a;
import com.google.android.libraries.web.contrib.p3384g.C43582c;
import com.google.android.libraries.web.contrib.p3384g.p3385a.C43562a;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.lifecycle.flow.C47421a;
import com.google.apps.tiktok.lifecycle.flow.C47422b;
import com.google.apps.tiktok.lifecycle.flow.C47424d;
import com.google.apps.tiktok.lifecycle.flow.C47428h;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Objects;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ab */
/* compiled from: PG */
public final class C137699ab extends C137725ax implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137711an f374530a;

    /* renamed from: c */
    private Context f374531c;

    /* renamed from: d */
    private final C2393x f374532d = new C2393x(this);

    /* renamed from: e */
    private boolean f374533e;

    @Deprecated
    public C137699ab() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137711an mo17754z() {
        C137711an anVar = this.f374530a;
        if (anVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374533e) {
            return anVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113912b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374531c == null) {
            this.f374531c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374531c;
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
        return this.f374532d;
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
            C137698aa.m223802a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C137711an a = mo17754z();
            a.f374590i.mo50429i(a.f374562Q);
            RequestBlockMixin requestBlockMixin = a.f374598q;
            C137876a aVar = a.f374604w;
            Objects.requireNonNull(aVar);
            requestBlockMixin.mo46748c(R.id.googleapp_google_search_requests, new C137704ag(aVar), new C137705ah(a));
            C137876a aVar2 = a.f374604w;
            Objects.requireNonNull(aVar2);
            requestBlockMixin.mo46748c(R.id.googleapp_silk_pane_request, new C137706ai(aVar2), new C137707aj(a));
            C137876a aVar3 = a.f374604w;
            Objects.requireNonNull(aVar3);
            requestBlockMixin.mo46748c(R.id.googleapp_redirected_google_search_requests, new C137708ak(aVar3), new C137709al(a));
            if (a.f374553H) {
                C47422b a2 = a.f374606y.mo51262a(((C137536j) a.f374549D.mo5768a()).f374079c);
                C137710am amVar = new C137710am(a);
                C69664n.m101061g(a2, "<this>");
                new C47421a(new C47428h(a2, new C69648ae(), amVar)).mo51260a(new C47424d());
            }
            if (a.f374548C.mo46339h() && bundle != null && bundle.containsKey("SEARCH_QUERY_STATE")) {
                a.f374597p.mo114036b((C137542d) ProtoParsers.m95520c(bundle, "SEARCH_QUERY_STATE", C137542d.f374085g, C62921ba.m95368a()));
            }
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) C137711an.f374545a.mo56226d()).mo56382g(e)).mo56372aa(41030)).mo56386p("Failed to parse initial query from savedInstanceState bundle");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C137698aa.m223802a(th, th2);
            }
            throw th;
        }
        C47831fm.m85019n();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C47558bi a;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137711an a2 = mo17754z();
            C47558bi a3 = C47831fm.m85006a("SearchResultsFragmentPeer#onCreateView");
            try {
                ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_search_result_fragment, viewGroup, false);
                View findViewById = viewGroup2.findViewById(R.id.googleapp_srp_web_container);
                C28306ab abVar = a2.f374547B;
                abVar.mo33801b(viewGroup2, abVar.f76990a.mo33805a(C28427h.m53115a(92741)));
                C28306ab abVar2 = a2.f374547B;
                abVar2.mo33801b(findViewById, abVar2.f76990a.mo33805a(C28427h.m53115a(137206)));
                if (a2.f374601t.getChildFragmentManager().f634a.mo670b(R.id.googleapp_header_container) == null) {
                    a = C47831fm.m85006a("SearchResultsFragmentPeer#attachHeaderFragment");
                    C0154a aVar = new C0154a(a2.f374601t.getChildFragmentManager());
                    aVar.mo511h(R.id.googleapp_header_container, C137886r.m224179a(a2.f374583b, C137890u.f375180d), "HEADER_FRAGMENT", 1);
                    aVar.mo509f();
                    a.close();
                }
                C43861g d = a2.mo113915d();
                if (d != null) {
                    a2.mo113919i(d);
                } else if (a2.f374564S == 1) {
                    a2.mo113917f();
                }
                C137723av avVar = a2.f374558M;
                if (avVar.f374625b == 2) {
                    avVar.mo113926b();
                }
                a2.f374607z.mo50707a(a2.f374551F.mo46469b(), a2.f374561P);
                if (a2.f374553H) {
                    ((C137536j) a2.f374549D.mo5768a()).mo113802a();
                } else {
                    a2.f374607z.mo50707a(a2.f374599r.mo113800a(), a2.f374560O);
                }
                a2.f374594m.mo113942a();
                if (a2.f374546A.mo112951a()) {
                    a2.f374607z.mo50707a(a2.f374556K.mo114523b(), new C137711an.C137715a(a2, a2.f374563R));
                }
                C2043bi.m5555ai(findViewById, new C137702ae(a2, findViewById));
                a2.f374587f.mo115167b(new C137703af(a2));
                a3.close();
                if (viewGroup2 != null) {
                    C47831fm.m85019n();
                    return viewGroup2;
                }
                throw new NullPointerException("Fragment cannot use Event annotations with null view!");
            } catch (Throwable th) {
                a3.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C137698aa.m223802a(th2, th3);
            }
            throw th2;
        }
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374533e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137698aa.m223802a(th, th);
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
            C137698aa.m223802a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C137711an a = mo17754z();
            if (C137830c.m224075c(a.f374557L)) {
                C137830c.m224074b(a.f374557L);
                a.f374584c.mo113908a();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C137698aa.m223802a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C137542d a = mo17754z().mo113913a();
            if (!a.equals(C137542d.f374085g)) {
                bundle.putParcelable("SEARCH_QUERY_STATE", new ProtoParsers.InternalDontUse((byte[]) null, a));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137698aa.m223802a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r3.f373775g.isEmpty() == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51117r()     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.srp.an r0 = r5.mo17754z()     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.k.a.d r1 = r0.mo113913a()     // Catch:{ all -> 0x0068 }
            android.content.Context r2 = r0.f374585d     // Catch:{ all -> 0x0068 }
            boolean r2 = com.google.android.apps.search.googleapp.p10165d.C133933a.m217248a(r2)     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.e.g r3 = r1.f374092f     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x001c
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x0068 }
        L_0x001c:
            java.lang.String r3 = r3.f373770b     // Catch:{ all -> 0x0068 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0032
            com.google.android.apps.search.googleapp.search.e.g r3 = r1.f374092f     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x002a
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x0068 }
        L_0x002a:
            java.lang.String r3 = r3.f373775g     // Catch:{ all -> 0x0068 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0064
        L_0x0032:
            boolean r3 = r1.f374090d     // Catch:{ all -> 0x0068 }
            if (r3 == r2) goto L_0x0064
            com.google.protobuf.bn r1 = r1.toBuilder()     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.k.a.c r1 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137541c) r1     // Catch:{ all -> 0x0068 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0068 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.k.a.d r3 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r3     // Catch:{ all -> 0x0068 }
            r4 = 5
            r3.f374088b = r4     // Catch:{ all -> 0x0068 }
            int r4 = r3.f374087a     // Catch:{ all -> 0x0068 }
            r4 = r4 | 1
            r3.f374087a = r4     // Catch:{ all -> 0x0068 }
            r1.copyOnWrite()     // Catch:{ all -> 0x0068 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.k.a.d r3 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r3     // Catch:{ all -> 0x0068 }
            int r4 = r3.f374087a     // Catch:{ all -> 0x0068 }
            r4 = r4 | 4
            r3.f374087a = r4     // Catch:{ all -> 0x0068 }
            r3.f374090d = r2     // Catch:{ all -> 0x0068 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x0068 }
            com.google.android.apps.search.googleapp.search.k.a.d r1 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r1     // Catch:{ all -> 0x0068 }
            r0.mo113921k(r1)     // Catch:{ all -> 0x0068 }
        L_0x0064:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x0068:
            r0 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r1 = move-exception
            com.google.android.apps.search.googleapp.search.srp.C137698aa.m223802a(r0, r1)
        L_0x0071:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137699ab.onStart():void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C137711an a = mo17754z();
            C47393f.m84233d(this, C32212a.class, new C137717ap(a));
            C47393f.m84233d(this, C133149a.class, new C137718aq(a));
            C47393f.m84233d(this, C137822u.class, new C137719ar(a));
            C47393f.m84233d(this, C137837a.class, new C137720as(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137698aa.m223802a(th, th);
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

    /* JADX WARNING: type inference failed for: r48v0, types: [com.google.android.apps.search.googleapp.search.suggest.a.ab, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r50v4, types: [com.google.android.apps.search.googleapp.search.suggest.a.ab, java.lang.Object] */
    public final void onAttach(Context context) {
        C137699ab abVar = this;
        abVar.f122869b.mo51381i();
        try {
            if (!abVar.f374533e) {
                super.onAttach(context);
                if (abVar.f374530a == null) {
                    Object jN = mo113930d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    boolean kn = ((C74176nj) jN).f206730b.f198027a.mo67126kn();
                    boolean a = ((C74176nj) jN).f206730b.f198027a.mo66952fS().mo60838a();
                    boolean b = ((C74176nj) jN).f206730b.f198027a.mo66952fS().mo60839b();
                    boolean lN = ((C74176nj) jN).f206730b.f198027a.mo67153lN();
                    boolean jI = ((C74176nj) jN).f206730b.f198027a.mo67068jI();
                    boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45379213").mo50907f();
                    boolean kx = ((C74176nj) jN).f206730b.f198027a.mo67136kx();
                    String e = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45358421").mo50906e();
                    C68225k.m98532d(e);
                    String e2 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 14").mo50906e();
                    C68225k.m98532d(e2);
                    C38802e a2 = C139697a.m227129a(((C74176nj) jN).f206730b.f198027a.mo66885eE());
                    AtomicReference atomicReference = (AtomicReference) ((C74176nj) jN).f206783c.f205455i.mo17428b();
                    long k = ((C74176nj) jN).f206730b.f198027a.mo67086k();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C137692a aVar = new C137692a((C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66785cK(), (C60950i) ((C74176nj) jN).f206677a.bC.mo17428b(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), ((C74176nj) jN).mo69797gb());
                    C21370a aVar2 = (C21370a) ((C74176nj) jN).f206677a.i.mo17428b();
                    C139680b bVar = (C139680b) ((C74176nj) jN).f206836d.f205429k.mo17428b();
                    C139684f eb = ((C74176nj) jN).mo69691eb();
                    C43511c fE = ((C74176nj) jN).mo69721fE();
                    C137835h di = ((C74176nj) jN).mo69645di();
                    C38553h hVar = (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b();
                    C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                    C137469b bVar2 = (C137469b) ((C74176nj) jN).f206659I.mo17428b();
                    C136832c cVar = (C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b();
                    InstanceStateStoreFactory instanceStateStoreFactory = (InstanceStateStoreFactory) ((C74176nj) jN).f206687aJ.mo17428b();
                    C137473d dVar = (C137473d) ((C74176nj) jN).f206658H.mo17428b();
                    C137750aa dk = ((C74176nj) jN).mo69647dk();
                    String str = "Attempt to inject a Fragment wrapper of type ";
                    C137747a aVar3 = new C137747a((Context) ((C74176nj) jN).f206677a.g.mo17428b());
                    C137852a aVar4 = (C137852a) ((C74176nj) jN).f206730b.f198027a.f199282cA.mo17428b();
                    C137764ao dl = ((C74176nj) jN).mo69648dl();
                    C137747a aVar5 = aVar3;
                    long k2 = ((C74176nj) jN).f206730b.f198027a.mo67086k();
                    C43251d fx = ((C74176nj) jN).mo69766fx();
                    C137750aa dk2 = ((C74176nj) jN).mo69647dk();
                    C43269t tVar = (C43269t) ((C74176nj) jN).f207085l.mo17428b();
                    ((C74176nj) jN).mo69649dm();
                    C137485ae aeVar = (C137485ae) ((C74176nj) jN).f206783c.f205461o.mo17428b();
                    ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45352319").mo50903b();
                    ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199285cD.mo17428b()).booleanValue();
                    C137900w wVar = new C137900w(k2, fx, dk2, tVar, aeVar, (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), (C137401b) ((C74176nj) jN).f206730b.f198027a.f199286cE.mo17428b(), ((C74176nj) jN).mo69733fQ().mo46771a(C137536j.class), ((C74176nj) jN).mo69798gc(), ((C74176nj) jN).mo69796ga(), ((C74176nj) jN).f206730b.mo66426iA(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), ((C74176nj) jN).mo69733fQ().mo46771a(C137543b.class), ((C74176nj) jN).f206730b.f198027a.mo67068jI());
                    RequestBlockMixin fJ = ((C74176nj) jN).mo69726fJ();
                    C46778cv cvVar = (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b();
                    C137900w wVar2 = wVar;
                    C137692a aVar6 = aVar;
                    String str2 = e2;
                    C137534h hVar2 = new C137534h((C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b(), ((C74176nj) jN).f206677a.a.mo68513j(), (C71422aw) ((C74176nj) jN).f206677a.cy.mo17428b(), (Context) ((C74176nj) jN).f206677a.g.mo17428b());
                    C137546e cM = ((C74176nj) jN).f206730b.f198027a.mo66787cM();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137699ab) {
                        C137699ab abVar2 = (C137699ab) fragment;
                        C68225k.m98532d(abVar2);
                        C137853b bVar3 = new C137853b((C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b());
                        C137479c cVar2 = new C137479c((C46407v) ((C74176nj) jN).f206730b.f198027a.f199495gB.mo17428b());
                        C137853b bVar4 = bVar3;
                        C137871g gVar = new C137871g(((C74176nj) jN).f206730b.f198027a.mo66952fS().mo60840c(), ((C74176nj) jN).f206730b.f198027a.mo66952fS().mo60838a(), ((C74176nj) jN).f206730b.f198027a.mo66952fS().mo60839b(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199285cD.mo17428b()).booleanValue(), (C137485ae) ((C74176nj) jN).f206783c.f205461o.mo17428b(), (C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b(), cVar2, ((C74176nj) jN).mo69736fT(), (C137493b) ((C74176nj) jN).f206730b.f198027a.f199284cC.mo17428b(), ((C74176nj) jN).f206730b.mo66139cf(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), ((C74176nj) jN).mo69649dm(), (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), (C137401b) ((C74176nj) jN).f206730b.f198027a.f199286cE.mo17428b(), new C137866d((Context) ((C74176nj) jN).f206677a.g.mo17428b()), ((C74176nj) jN).mo69733fQ().mo46771a(C137903z.class), (C137469b) ((C74176nj) jN).f206659I.mo17428b(), ((C74176nj) jN).mo69733fQ().mo46771a(C137543b.class), ((C74176nj) jN).f206730b.f198027a.mo67068jI());
                        C137876a dj = ((C74176nj) jN).mo69646dj();
                        String e3 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 18").mo50906e();
                        C68225k.m98532d(e3);
                        String e4 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 19").mo50906e();
                        C68225k.m98532d(e4);
                        long b2 = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45359353").mo50903b();
                        C74175nh nhVar = (C74175nh) ((C74176nj) jN).f206688aK.mo17428b();
                        C43269t tVar2 = (C43269t) ((C74176nj) jN).f207085l.mo17428b();
                        C69664n.m101061g(nhVar, "factory");
                        C69664n.m101061g(tVar2, "info");
                        C43403a a3 = nhVar.mo69424a(tVar2.mo46386d());
                        C43582c a4 = new C43562a(((C74176nj) jN).f206677a.d.mo67808ce()).mo46625a(((C43269t) ((C74176nj) jN).f207085l.mo17428b()).mo46385c());
                        C68225k.m98532d(a4);
                        String str3 = str2;
                        C137534h hVar3 = hVar2;
                        abVar = this;
                        abVar.f374530a = new C137711an(context2, kn, a, b, lN, jI, f, kx, e, str3, a2, atomicReference, k, accountId, aVar6, aVar2, bVar, eb, fE, di, hVar, eVar, bVar2, cVar, dVar, dk, aVar5, aVar4, dl, wVar2, fJ, cvVar, hVar3, cM, abVar2, bVar4, ((C74176nj) jN).mo69614dD(), (C137485ae) ((C74176nj) jN).f206783c.f205461o.mo17428b(), gVar, dj, new C137723av(e3, e4, b2, a3, a4, (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b()), ((C74176nj) jN).mo69793gX(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).f206730b.mo66426iA(), (C133118a) ((C74176nj) jN).f206730b.f198027a.f199877w.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66869dp(), ((C74176nj) jN).mo69693ed(), ((C74176nj) jN).f206730b.mo66139cf(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C138772i) ((C74176nj) jN).f206730b.f198027a.f199544gy.mo17428b(), ((C74176nj) jN).mo69766fx(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), ((C74176nj) jN).mo69742fZ(), ((C74176nj) jN).mo69796ga(), ((C74176nj) jN).mo69798gc(), ((C74176nj) jN).mo69733fQ().mo46771a(C137536j.class), ((C74176nj) jN).mo69733fQ().mo46771a(C137543b.class), ((C74176nj) jN).mo69733fQ().mo46771a(C137903z.class), ((C74176nj) jN).mo69736fT());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(abVar.f122869b, abVar.f374532d));
                    } else {
                        String obj = C137711an.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException(str + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar3 = abVar.f122869b;
                    if (abVar3.f123354b == null) {
                        abVar3.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e5);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
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
