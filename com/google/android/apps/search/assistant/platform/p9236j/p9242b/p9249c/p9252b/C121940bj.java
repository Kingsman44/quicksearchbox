package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p033v7.app.C0401v;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.p098j.C2069cc;
import androidx.p043a.p044a.C0782b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33561b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.bj */
/* compiled from: PG */
public final class C121940bj {

    /* renamed from: a */
    public static final C59071e f338366a = C59071e.m91331h();

    /* renamed from: b */
    public final C33504b f338367b;

    /* renamed from: c */
    public final AccountId f338368c;

    /* renamed from: d */
    public final C28310af f338369d;

    /* renamed from: e */
    public final C28306ab f338370e;

    /* renamed from: f */
    public final AtomicReference f338371f = new AtomicReference((Object) null);

    /* renamed from: g */
    public final AtomicReference f338372g = new AtomicReference((Object) null);

    /* renamed from: h */
    public final AtomicReference f338373h = new AtomicReference((Object) null);

    /* renamed from: i */
    public final AtomicBoolean f338374i = new AtomicBoolean(false);

    /* renamed from: j */
    private final long f338375j;

    /* renamed from: k */
    private final Executor f338376k;

    /* renamed from: l */
    private final C121965z f338377l;

    /* renamed from: m */
    private final C121906ac f338378m;

    /* renamed from: n */
    private final C69613f f338379n = new C69747m(new C121939bi(this));

    public C121940bj(C33504b bVar, long j, AccountId accountId, Executor executor, C28310af afVar, C28306ab abVar, C121965z zVar, C121906ac acVar) {
        C69664n.m101061g(bVar, "apaVoiceInteractionSession");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(executor, "uiExecutor");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(zVar, "assistLayerSessionIdGenerator");
        C69664n.m101061g(acVar, "assistLayerTracker");
        this.f338367b = bVar;
        this.f338375j = j;
        this.f338368c = accountId;
        this.f338376k = executor;
        this.f338369d = afVar;
        this.f338370e = abVar;
        this.f338377l = zVar;
        this.f338378m = acVar;
    }

    /* renamed from: e */
    public static final Context m201416e(Context context, C33563d dVar) {
        Context c = C44534d.m78716c(new C0782b(context, dVar.f89746b.intValue()));
        C69664n.m101060f(c, "wrapContextIfAvailable(themedContext)");
        return c;
    }

    /* renamed from: f */
    public static final void m201417f(Context context) {
        Window window = new Dialog(context).getWindow();
        if (window == null) {
            C59052c cVar = (C59052c) f338366a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            cVar.mo56379ah(new C59094n(36086));
            cVar.mo56386p("Couldn't create stub window, skipping app compat installation");
            return;
        }
        C0401v.m1328z(context, window).mo1179h();
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: h */
    private final ViewGroup m201418h(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C69664n.m101060f(childAt, "viewGroup.getChildAt(i)");
            if (childAt.getId() == 16908290) {
                return m201418h(childAt);
            }
        }
        return viewGroup;
    }

    /* renamed from: a */
    public final ViewGroup mo105463a(Window window) {
        View findViewById = window.findViewById(16908290);
        C69664n.m101060f(findViewById, "window.findViewById(android.R.id.content)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        ViewGroup h = m201418h(viewGroup);
        return h == null ? viewGroup : h;
    }

    /* renamed from: b */
    public final Window mo105464b() {
        return (Window) this.f338379n.mo5768a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105465c(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b r5, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121935be
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.j.b.c.b.be r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121935be) r0
            int r1 = r0.f338353d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338353d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.b.be r0 = new com.google.android.apps.search.assistant.platform.j.b.c.b.be
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f338351b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338353d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f338350a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.search.assistant.platform.j.b.c.b.bf r7 = new com.google.android.apps.search.assistant.platform.j.b.c.b.bf
            r7.<init>(r4, r5, r6)
            java.util.concurrent.Executor r5 = r4.f338376k
            java.util.concurrent.Callable r6 = com.google.apps.tiktok.tracing.C47810es.m84978r(r7)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92904m(r6, r5)
            r0.f338350a = r4
            r0.f338353d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r5 = r4
        L_0x0051:
            java.lang.String r6 = "suspend fun showFragment…ntVisUiHost.set(host)\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.android.apps.search.assistant.platform.j.b.c.b.av r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121925av) r7
            com.google.android.apps.search.assistant.platform.j.b.c.b.bj r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121940bj) r5
            java.util.concurrent.atomic.AtomicReference r5 = r5.f338373h
            r5.set(r7)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121940bj.mo105465c(com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b, com.google.android.libraries.search.assistant.invocation.o.a.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105466d(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b r5, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121937bg
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.j.b.c.b.bg r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121937bg) r0
            int r1 = r0.f338360d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338360d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.b.bg r0 = new com.google.android.apps.search.assistant.platform.j.b.c.b.bg
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f338358b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338360d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f338357a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0057
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r7 = r4.f338367b
            r2 = 2132148307(0x7f160053, float:1.9938588E38)
            r7.setTheme(r2)
            com.google.android.apps.search.assistant.platform.j.b.c.b.bh r2 = new com.google.android.apps.search.assistant.platform.j.b.c.b.bh
            r2.<init>(r7, r4, r5, r6)
            java.util.concurrent.Executor r5 = r4.f338376k
            java.util.concurrent.Callable r6 = com.google.apps.tiktok.tracing.C47810es.m84978r(r2)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92904m(r6, r5)
            r0.f338357a = r4
            r0.f338360d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r5 = r4
        L_0x0057:
            java.lang.String r6 = "suspend fun showInitialF…ntVisUiHost.set(host)\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.android.apps.search.assistant.platform.j.b.c.b.av r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121925av) r7
            com.google.android.apps.search.assistant.platform.j.b.c.b.bj r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121940bj) r5
            java.util.concurrent.atomic.AtomicReference r5 = r5.f338373h
            r5.set(r7)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121940bj.mo105466d(com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b, com.google.android.libraries.search.assistant.invocation.o.a.b, h.c.g):java.lang.Object");
    }

    /* renamed from: g */
    public final C121925av mo105467g(FrameLayout frameLayout, Context context, C33561b bVar, C34037b bVar2) {
        FrameLayout frameLayout2 = frameLayout;
        Context context2 = context;
        C33561b bVar3 = bVar;
        C59071e eVar = f338366a;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
        cVar.mo56379ah(new C59094n(36081));
        cVar.mo56386p("showFragment: showing new host");
        Window b = mo105464b();
        C69664n.m101061g(b, "window");
        b.clearFlags(134217728);
        b.setNavigationBarColor(0);
        b.setNavigationBarContrastEnforced(false);
        b.clearFlags(67108864);
        b.setStatusBarColor(0);
        b.getDecorView().setBackgroundColor(0);
        C2069cc.m5650a(b, false);
        C69664n.m101061g(mo105464b(), "window");
        long incrementAndGet = this.f338377l.f338478a.incrementAndGet();
        this.f338378m.mo105432c(incrementAndGet, this.f338375j, bVar2);
        C121934bd bdVar = new C121934bd(incrementAndGet, this.f338378m, this.f338367b, this.f338376k);
        Window b2 = mo105464b();
        Executor executor = this.f338376k;
        C69664n.m101061g(b2, "window");
        C69664n.m101061g(frameLayout2, "hostRootView");
        C69664n.m101061g(context2, "context");
        C69664n.m101061g(executor, "uiExecutor");
        C121925av avVar = new C121925av();
        avVar.mo51130t(b2, frameLayout2, context2);
        avVar.f338330c = frameLayout2;
        avVar.f338329b = bdVar;
        avVar.f338331d = executor;
        bdVar.f338348d = avVar;
        avVar.mo19987jP((Bundle) null);
        avVar.mo51128g();
        avVar.mo51127f();
        C0154a aVar = new C0154a(avVar.mo51122q());
        aVar.mo511h(frameLayout.getId(), bVar3.f89743a, (String) null, 1);
        aVar.mo509f();
        C59052c cVar2 = (C59052c) eVar.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
        String c = C33914a.m62568c(bVar3.f89743a);
        cVar2.mo56379ah(new C59094n(36082));
        cVar2.mo56389s("adding fragment: %s", c);
        return avVar;
    }
}
