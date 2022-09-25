package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33489a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33498b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.g */
/* compiled from: PG */
public final class C33496g implements C33489a {

    /* renamed from: a */
    public static final C59071e f89646a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f89647b;

    /* renamed from: c */
    public final List f89648c;

    /* renamed from: d */
    public final C69626l f89649d;

    /* renamed from: e */
    private final C47632e f89650e = new C47632e();

    public C33496g(C33498b bVar, Set set, C71422aw awVar) {
        C69664n.m101061g(set, "platformListeners");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f89647b = awVar;
        List M = C69540x.m100831M(C69540x.m100840V(set), bVar.f89652a);
        C59052c cVar = (C59052c) f89646a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "VIS.ServiceLifecycle");
        cVar.mo56379ah(new C59094n(51223));
        cVar.mo56389s("Registered (including disabled) VIS lifecycle listeners: %s.", M);
        this.f89648c = M;
        this.f89649d = new C59425c(new C33490a(this, (C69577g) null));
    }

    /* renamed from: c */
    private final void m62078c(String str, C69630p pVar) {
        C60870cx b = this.f89650e.mo51512b(new C33495f(this, new C33492c(this, str, pVar, (C69577g) null)), C60826bg.f164896a);
        C69664n.m101060f(b, "private fun withSequence…ifecycle callbacks.\")\n  }");
        C46459k.m82829b(b, "Failure in VIS (service) lifecycle callbacks.", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r6);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38902a(android.service.voice.VoiceInteractionService r6) {
        /*
            r5 = this;
            java.lang.String r0 = "VoiceInteractionServiceLifecycleCallbacks#onReady"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)
            com.google.common.f.e r1 = f89646a     // Catch:{ all -> 0x0039 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0039 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0039 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "VIS.ServiceLifecycle"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "#onReady(%s)"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0039 }
            r4 = 51224(0xc818, float:7.178E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0039 }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x0039 }
            r1.mo56389s(r2, r6)     // Catch:{ all -> 0x0039 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h r1 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h     // Catch:{ all -> 0x0039 }
            r1.<init>(r6)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = "onReady"
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.d r2 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.d     // Catch:{ all -> 0x0039 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0039 }
            r5.m62078c(r6, r2)     // Catch:{ all -> 0x0039 }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return
        L_0x0039:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33496g.mo38902a(android.service.voice.VoiceInteractionService):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38903b() {
        /*
            r5 = this;
            java.lang.String r0 = "VoiceInteractionServiceLifecycleCallbacks#onShutdown"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)
            com.google.common.f.e r1 = f89646a     // Catch:{ all -> 0x0034 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0034 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0034 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "VIS.ServiceLifecycle"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "#onShutdown()"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0034 }
            r4 = 51225(0xc819, float:7.1782E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0034 }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x0034 }
            r1.mo56386p(r2)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "onShutdown"
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.e r2 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.e     // Catch:{ all -> 0x0034 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ all -> 0x0034 }
            r5.m62078c(r1, r2)     // Catch:{ all -> 0x0034 }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return
        L_0x0034:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33496g.mo38903b():void");
    }
}
