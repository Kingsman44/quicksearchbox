package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.app.KeyguardManager;
import android.os.PowerManager;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.binaries.satin.app.C74170nc;
import com.google.android.apps.gsa.binaries.satin.app.C74171nd;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127116h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127105w;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129567ai;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129684r;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129664b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129669g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129675m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9830a.C129570a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129579a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129612d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129622f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129624h;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128624c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130353c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.invocation.assistdata.p2595a.C33517a;
import com.google.android.libraries.search.assistant.invocation.assistdata.p2596b.C33547u;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.o */
/* compiled from: PG */
public final class C129636o implements C129622f, C129570a {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f355778a;

    /* renamed from: b */
    public static final C59071e f355779b = C59071e.m91331h();

    /* renamed from: A */
    private final C69684c f355780A;

    /* renamed from: B */
    private final C74171nd f355781B;

    /* renamed from: C */
    private final C33517a f355782C;

    /* renamed from: c */
    public final C129578c f355783c;

    /* renamed from: d */
    public final C129644w f355784d;

    /* renamed from: e */
    public final C129624h f355785e;

    /* renamed from: f */
    public final C127118j f355786f;

    /* renamed from: g */
    public final C129540c f355787g;

    /* renamed from: h */
    public final C58833ax f355788h;

    /* renamed from: i */
    public final C129575ae f355789i;

    /* renamed from: j */
    public final C129024a f355790j;

    /* renamed from: k */
    public final PowerManager f355791k;

    /* renamed from: l */
    public final C130353c f355792l;

    /* renamed from: m */
    public final C71422aw f355793m;

    /* renamed from: n */
    public final boolean f355794n;

    /* renamed from: o */
    public boolean f355795o;

    /* renamed from: p */
    public boolean f355796p;

    /* renamed from: q */
    public final C69613f f355797q;

    /* renamed from: r */
    public final C69684c f355798r;

    /* renamed from: s */
    public final C127105w f355799s;

    /* renamed from: t */
    public final C74170nc f355800t;

    /* renamed from: u */
    public final C33547u f355801u;

    /* renamed from: v */
    public final C129571aa f355802v;

    /* renamed from: w */
    private final C129579a f355803w;

    /* renamed from: x */
    private final KeyguardManager f355804x;

    /* renamed from: y */
    private final C69684c f355805y = new C128624c();

    /* renamed from: z */
    private final C69684c f355806z = new C128624c();

    static {
        Class<C129636o> cls = C129636o.class;
        C69669s sVar = new C69669s(cls, "currentTransition", "getCurrentTransition()Lkotlinx/coroutines/Job;");
        int i = C69649af.f186028a;
        f355778a = new C69713k[]{sVar, new C69669s(cls, "currentLastExitTransition", "getCurrentLastExitTransition()Lkotlinx/coroutines/Job;"), new C69669s(cls, "currentDestination", "getCurrentDestination()Lcom/google/android/apps/search/assistant/surfaces/voice/ui/host/intent/NavigatorArgs;"), new C69669s(cls, "sourceBinderProxy", "getSourceBinderProxy()Lcom/google/android/apps/search/assistant/surfaces/voice/ui/host/intent/SourceBinderProxy;")};
    }

    public C129636o(C129578c cVar, C129644w wVar, C129669g gVar, C127105w wVar2, C129579a aVar, C129624h hVar, C74170nc ncVar, C74171nd ndVar, C127118j jVar, C129540c cVar2, C129571aa aaVar, C58833ax axVar, C129575ae aeVar, C129024a aVar2, PowerManager powerManager, C33517a aVar3, C130353c cVar3, KeyguardManager keyguardManager, C71422aw awVar) {
        C129579a aVar4 = aVar;
        C74170nc ncVar2 = ncVar;
        C74171nd ndVar2 = ndVar;
        C129571aa aaVar2 = aaVar;
        PowerManager powerManager2 = powerManager;
        C33517a aVar5 = aVar3;
        C130353c cVar4 = cVar3;
        KeyguardManager keyguardManager2 = keyguardManager;
        C71422aw awVar2 = awVar;
        C69664n.m101061g(aVar4, "transitionManager");
        C69664n.m101061g(ncVar2, "transitionTemplate");
        C69664n.m101061g(ndVar2, "sameHostCommands");
        C69664n.m101061g(aaVar2, "startActivityTracker");
        C69664n.m101061g(powerManager2, "powerManager");
        C69664n.m101061g(aVar5, "assistDataAccessorFactory");
        C69664n.m101061g(cVar4, "appDataAccessor");
        C69664n.m101061g(keyguardManager2, "keyguardManager");
        C69664n.m101061g(awVar2, "fragmentScope");
        this.f355783c = cVar;
        this.f355784d = wVar;
        this.f355799s = wVar2;
        this.f355803w = aVar4;
        this.f355785e = hVar;
        this.f355800t = ncVar2;
        this.f355781B = ndVar2;
        this.f355786f = jVar;
        this.f355787g = cVar2;
        this.f355802v = aaVar2;
        this.f355788h = axVar;
        this.f355789i = aeVar;
        this.f355790j = aVar2;
        this.f355791k = powerManager2;
        this.f355782C = aVar5;
        this.f355792l = cVar4;
        this.f355804x = keyguardManager2;
        this.f355793m = awVar2;
        boolean isKeyguardLocked = keyguardManager.isKeyguardLocked();
        this.f355794n = isKeyguardLocked;
        this.f355795o = powerManager.isInteractive();
        this.f355780A = new C129631j(gVar, this);
        this.f355797q = new C69747m(new C129626e(this));
        this.f355798r = new C129632k();
        C34053bp bpVar = gVar.f355880d;
        C33547u uVar = null;
        if (bpVar != null && !C69664n.m101066l(bpVar, C34053bp.f90753a)) {
            uVar = aVar5.mo38956a(bpVar);
        }
        this.f355801u = uVar;
        C59052c cVar5 = (C59052c) f355779b.mo56224b();
        String f = mo109140f();
        Boolean valueOf = Boolean.valueOf(this.f355795o);
        Boolean valueOf2 = Boolean.valueOf(isKeyguardLocked);
        cVar5.mo56379ah(new C59094n(38312));
        cVar5.mo56359L("Fragment [%s] isScreenOnInitially:%s, isKeyguardLockedInitially:%s", f, valueOf, valueOf2);
    }

    /* renamed from: s */
    public static final View m211665s(View view) {
        View childAt = ((ViewGroup) C2043bi.m5589r(view.getRootView(), R.id.assistant_fragment_host_container)).getChildAt(0);
        C69664n.m101060f(childAt, "requireViewById<ViewGrou…_container).getChildAt(0)");
        return childAt;
    }

    /* renamed from: a */
    public final Fragment mo109136a(C129676j jVar) {
        Object obj;
        C129644w wVar = this.f355784d;
        C69664n.m101061g(jVar, "content");
        C129684r a = wVar.mo109155a(jVar);
        AccountId accountId = wVar.f355818a;
        C62917ay d = a.mo109195d();
        if (d != null) {
            C62940bt r2 = C62942bv.checkIsLite(d);
            jVar.mo58887l(r2);
            Object l = jVar.f169962ag.mo58854l(r2.f169971d);
            obj = l == null ? r2.f169969b : r2.mo58889c(l);
        } else {
            obj = null;
        }
        Fragment a2 = a.mo109192a(accountId, obj);
        C129664b.m211716b(a2, mo109137c().f355877a, jVar);
        return a2;
    }

    /* renamed from: b */
    public final C129612d mo109133b() {
        return this.f355803w;
    }

    /* renamed from: c */
    public final C129669g mo109137c() {
        return (C129669g) this.f355780A.mo42046c(f355778a[2]);
    }

    /* renamed from: d */
    public final C129675m mo109138d() {
        return (C129675m) this.f355798r.mo42046c(f355778a[3]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109139e(android.support.p031v4.app.Fragment r7, android.support.p031v4.app.Fragment r8, com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f r9, p5462h.p5466c.C69577g r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129633l
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.l r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129633l) r0
            int r1 = r0.f355769d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355769d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.l r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.l
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f355767b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355769d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f355766a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0084
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r10)
            r6.mo109140f()
            java.lang.Class r10 = r8.getClass()
            r10.getName()
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c r10 = r6.f355783c
            android.support.v4.app.FragmentManager r10 = r10.getChildFragmentManager()
            android.support.v4.app.a r2 = new android.support.v4.app.a
            r2.<init>((android.support.p031v4.app.FragmentManager) r10)
            r10 = 2131428447(0x7f0b045f, float:1.8478539E38)
            java.lang.String r4 = "ROOT_FRAGMENT"
            r2.mo511h(r10, r8, r4, r3)
            r2.mo515l(r8)
            r2.mo509f()
            com.google.android.apps.gsa.binaries.satin.app.nc r10 = r6.f355800t
            com.google.android.apps.gsa.binaries.satin.app.nd r2 = r6.f355781B
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.c.c r4 = new com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.c.c
            com.google.android.apps.gsa.binaries.satin.app.ni r5 = r2.f206646a
            com.google.android.apps.gsa.binaries.satin.app.nj r5 = r5.c
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.h r5 = r5.mo69496as()
            com.google.android.apps.gsa.binaries.satin.app.ni r2 = r2.f206646a
            com.google.android.apps.gsa.binaries.satin.app.nj r2 = r2.c
            g.a.a r2 = r2.f206889e
            dagger.a.g r2 = (dagger.p5294a.C68221g) r2
            java.lang.Object r2 = r2.f184583a
            android.support.v4.app.Fragment r2 = (android.support.p031v4.app.Fragment) r2
            r4.<init>(r5, r2, r7, r9)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.c.f r7 = r10.mo69423a(r4)
            r0.f355766a = r6
            r0.f355769d = r3
            java.lang.Object r7 = r7.mo109130a(r8, r9, r0)
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r7 = r6
        L_0x0084:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.o r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o) r7
            r7.mo109140f()
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.mo109139e(android.support.v4.app.Fragment, android.support.v4.app.Fragment, com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.f, h.c.g):java.lang.Object");
    }

    /* renamed from: f */
    public final String mo109140f() {
        String format = String.format(Locale.US, "%s_%s_%d", Arrays.copyOf(new Object[]{C129567ai.m211555b(mo109137c().f355877a), C129567ai.m211554a(mo109137c().f355878b), Integer.valueOf(System.identityHashCode(this.f355783c) % 1000)}, 3));
        C69664n.m101060f(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: g */
    public final C71643cp mo109141g() {
        return (C71643cp) this.f355805y.mo42046c(f355778a[0]);
    }

    /* renamed from: h */
    public final void mo109142h(Fragment fragment, boolean z) {
        Class<?> cls;
        Fragment c = this.f355783c.getChildFragmentManager().f634a.mo671c("ROOT_FRAGMENT");
        mo109140f();
        if (!(c == null || (cls = c.getClass()) == null)) {
            cls.getName();
        }
        fragment.getClass().getName();
        if (fragment.getClass().isInstance(c)) {
            mo109140f();
        } else {
            mo109145m(fragment, z);
        }
    }

    /* renamed from: i */
    public final void mo109108i() {
        mo109140f();
        View view = this.f355783c.getView();
        if (view != null) {
            view.setImportantForAccessibility(4);
        }
    }

    /* renamed from: j */
    public final void mo109109j() {
        mo109140f();
        View view = this.f355783c.getView();
        if (view != null) {
            view.setImportantForAccessibility(2);
        }
    }

    /* renamed from: k */
    public final void mo109143k() {
        mo109140f();
        this.f355796p = true;
    }

    /* renamed from: l */
    public final void mo109144l(Runnable runnable) {
        C71643cp g = mo109141g();
        if (g != null) {
            g.mo62723u((CancellationException) null);
        }
        C69684c cVar = this.f355806z;
        C69713k[] kVarArr = f355778a;
        C71643cp cpVar = (C71643cp) cVar.mo42046c(kVarArr[1]);
        if (cpVar == null || !cpVar.mo62867mj()) {
            mo109140f();
            this.f355806z.mo42045b(kVarArr[1], C71803m.m105043d(this.f355793m, (C69585o) null, (C71424ay) null, new C129628g(this, runnable, (C69577g) null), 3));
            return;
        }
        mo109140f();
    }

    /* renamed from: m */
    public final void mo109145m(Fragment fragment, boolean z) {
        mo109140f();
        fragment.getClass().getName();
        C0154a aVar = new C0154a(this.f355783c.getChildFragmentManager());
        aVar.mo689v(R.id.assistant_fragment_host_container, fragment, "ROOT_FRAGMENT");
        if (z) {
            aVar.mo515l(fragment);
        }
        aVar.mo509f();
        mo109140f();
    }

    /* renamed from: n */
    public final void mo109146n(C129669g gVar) {
        this.f355780A.mo42045b(f355778a[2], gVar);
    }

    /* renamed from: o */
    public final void mo109147o(C71643cp cpVar) {
        this.f355805y.mo42045b(f355778a[0], cpVar);
    }

    /* renamed from: p */
    public final void mo109148p() {
        C127118j jVar = this.f355786f;
        C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        C127116h a = C69664n.m101061g(eVar, "builder");
        a.mo107939b(C127050h.ASSISTANT_DISMISSED);
        C46459k.m82829b(jVar.mo107932h(a.mo107938a()), "Failed to stop interaction.", new Object[0]);
    }

    /* renamed from: q */
    public final void mo109149q(Fragment fragment) {
        mo109147o(C71803m.m105043d(this.f355793m, (C69585o) null, (C71424ay) null, new C129634m(this, fragment, (C69577g) null), 3));
    }

    /* renamed from: r */
    public final void mo109150r(C129669g gVar) {
        Fragment a = mo109136a(gVar.f355878b);
        mo109140f();
        mo109142h(a, true);
        mo109149q(a);
    }
}
