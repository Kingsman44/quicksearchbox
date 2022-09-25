package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.DirectAction;
import android.os.Build;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.binaries.satin.app.aqh;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33506c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.C33512a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33731b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33732c;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cp */
/* compiled from: PG */
public final class C121616cp implements C121663t, C121669z {

    /* renamed from: a */
    public static final C59071e f337444a = C59071e.m91331h();

    /* renamed from: b */
    public final Optional f337445b;

    /* renamed from: c */
    public final C21370a f337446c;

    /* renamed from: d */
    public final AtomicReference f337447d = new AtomicReference();

    /* renamed from: e */
    public final C33731b f337448e;

    /* renamed from: f */
    public final AtomicReference f337449f;

    /* renamed from: g */
    public final ConcurrentSkipListSet f337450g;

    /* renamed from: h */
    public final C71788b f337451h;

    /* renamed from: i */
    public final C33512a f337452i;

    /* renamed from: j */
    public final C121668y f337453j;

    /* renamed from: k */
    private final C33732c f337454k;

    /* renamed from: l */
    private final C71422aw f337455l;

    /* renamed from: m */
    private final AtomicReference f337456m = new AtomicReference();

    /* renamed from: n */
    private final aqh f337457n;

    public C121616cp(Optional optional, C121668y yVar, C33512a aVar, C33732c cVar, aqh aqh, C21370a aVar2, C71422aw awVar) {
        C69664n.m101061g(optional, "sessionStarter");
        C69664n.m101061g(aVar, "activityIdMapper");
        C69664n.m101061g(aqh, "visibleActivitiesTrackerFactory");
        C69664n.m101061g(aVar2, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f337445b = optional;
        this.f337453j = yVar;
        this.f337452i = aVar;
        this.f337454k = cVar;
        this.f337457n = aqh;
        this.f337446c = aVar2;
        this.f337455l = awVar;
        this.f337448e = cVar.mo39053a(1);
        this.f337449f = new AtomicReference();
        this.f337450g = new ConcurrentSkipListSet(Comparator.CC.comparingInt(C121609ci.f337416a));
        this.f337451h = new C71799m();
    }

    /* renamed from: i */
    public static final String m200931i(DirectAction directAction) {
        String id = directAction.getId();
        C69664n.m101060f(id, "action.id");
        return id;
    }

    /* renamed from: j */
    private final void m200932j(C60870cx cxVar, String str) {
        C71803m.m105043d(this.f337455l, (C69585o) null, (C71424ay) null, new C121603cc(cxVar, str, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final C60870cx mo105264a(C34053bp bpVar, C34037b bVar) {
        C69664n.m101061g(bpVar, "token");
        C69664n.m101061g(bVar, "clientId");
        C60870cx j = C60856cj.m92901j(C71663i.m104692e(this.f337455l, (C71424ay) null, new C121602cb(this, bVar, (C69577g) null), 3));
        C69664n.m101060f(j, "override fun getForegrou…vityId)\n      }\n    )\n  }");
        return j;
    }

    /* renamed from: b */
    public final C60870cx mo105265b(C33883a aVar) {
        return C71663i.m104692e(this.f337455l, (C71424ay) null, new C121607cg(aVar, this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo105266c(C33884b bVar) {
        if (Build.VERSION.SDK_INT < 32) {
            return C60856cj.m92899h(new UnsupportedOperationException());
        }
        C121647dt dtVar = (C121647dt) this.f337449f.get();
        if (dtVar == null) {
            return C60856cj.m92899h(new IllegalStateException());
        }
        C58976aa aaVar = C58975e.f156826a;
        return C32561x.m60381a(dtVar.f337506c, new C121642do(bVar, dtVar, (C69577g) null));
    }

    /* renamed from: d */
    public final C60870cx mo105267d(DirectAction directAction, Bundle bundle) {
        C69664n.m101061g(directAction, "action");
        C69664n.m101061g(bundle, "extras");
        C60870cx j = C60856cj.m92901j(C71663i.m104692e(this.f337455l, (C71424ay) null, new C121614cn(this, directAction, bundle, (C69577g) null), 3));
        C69664n.m101060f(j, "override fun performDire… result\n      }\n    )\n  }");
        return j;
    }

    /* renamed from: e */
    public final C60870cx mo105268e(String str) {
        C69664n.m101061g(str, "requestActivityId");
        C60870cx j = C60856cj.m92901j(C71663i.m104692e(this.f337455l, (C71424ay) null, new C121615co(this, str, (C69577g) null), 3));
        C69664n.m101060f(j, "override fun requestDire…rectActions\n      }\n    )");
        return j;
    }

    /* renamed from: f */
    public final void mo74753f(int i) {
        if ((i & 1) != 0) {
            m200932j(C32561x.m60381a(this.f337455l, new C121613cm(this, (C69577g) null)), "onShow");
        }
    }

    /* renamed from: g */
    public final C33504b mo105269g() {
        Object obj = this.f337456m.get();
        if (obj != null) {
            return (C33504b) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105270h(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121601ca
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.j.a.ca r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121601ca) r0
            int r1 = r0.f337392e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337392e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.a.ca r0 = new com.google.android.apps.search.assistant.platform.j.a.ca
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f337390c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337392e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f337388a
            p5462h.C69714l.m101134b(r7)
            goto L_0x006e
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            java.lang.Object r2 = r0.f337389b
            java.lang.Object r4 = r0.f337388a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004f
        L_0x003d:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r2 = r6.f337451h
            r0.f337388a = r6
            r0.f337389b = r2
            r0.f337392e = r4
            java.lang.Object r7 = r2.mo63025b(r5, r0)
            if (r7 == r1) goto L_0x0083
            r4 = r6
        L_0x004f:
            r7 = r4
            com.google.android.apps.search.assistant.platform.j.a.cp r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r7     // Catch:{ all -> 0x007e }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r7 = r7.f337448e     // Catch:{ all -> 0x007e }
            com.google.common.util.concurrent.cx r7 = r7.mo39049a()     // Catch:{ all -> 0x007e }
            r2.mo63026c(r5)
            java.lang.String r2 = "sequentialMutex.withLock…dCache.resourceFuture() }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r0.f337388a = r4
            r0.f337389b = r5
            r0.f337392e = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r0 = r4
        L_0x006e:
            java.lang.String r1 = "sequentialMutex.withLock…esourceFuture() }.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            android.service.voice.VoiceInteractionSession$ActivityId r7 = (android.service.voice.VoiceInteractionSession.ActivityId) r7
            com.google.android.apps.search.assistant.platform.j.a.cp r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp) r0
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.a r0 = r0.f337452i
            java.lang.String r7 = r0.mo38947a(r7)
            return r7
        L_0x007e:
            r7 = move-exception
            r2.mo63026c(r5)
            throw r7
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.mo105270h(h.c.g):java.lang.Object");
    }

    /* renamed from: k */
    public final void mo74754k(C33504b bVar) {
        DesugarAtomicReference.getAndUpdate(this.f337456m, new C121604cd(bVar, this));
        if (Build.VERSION.SDK_INT >= 32 && (bVar instanceof C33506c)) {
            AtomicReference atomicReference = this.f337449f;
            aqh aqh = this.f337457n;
            C121647dt dtVar = new C121647dt((C33506c) bVar, (C33512a) aqh.f199882a.a.ka.mo17428b(), (C69585o) aqh.f199882a.a.G.mo17428b(), (C71422aw) aqh.f199882a.a.H.mo17428b(), (Executor) aqh.f199882a.a.n.mo17428b());
            while (!atomicReference.compareAndSet((Object) null, dtVar)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo74755l() {
        DesugarAtomicReference.getAndUpdate(this.f337456m, new C121605ce(this));
        C121647dt dtVar = (C121647dt) this.f337449f.getAndSet((Object) null);
        if (dtVar != null) {
            C71423ax.m104198c(dtVar.f337509f, (CancellationException) null);
        }
    }

    /* renamed from: m */
    public final void mo74756m(VoiceInteractionSession.ActivityId activityId) {
        C69664n.m101061g(activityId, "value");
        m200932j(C32561x.m60381a(this.f337455l, new C121608ch(this, activityId, (C69577g) null)), "onDirectActionsInvalidated");
    }

    /* renamed from: n */
    public final void mo74757n(Optional optional) {
        C69664n.m101061g(optional, "activityIdOptional");
        m200932j(C32561x.m60381a(this.f337455l, new C121611ck(this, optional, (C69577g) null)), "onForegroundActivityAssistStateReceived");
    }

    /* renamed from: o */
    public final void mo74758o() {
        m200932j(C32561x.m60381a(this.f337455l, new C121612cl(this, (C69577g) null)), "onHide");
    }
}
