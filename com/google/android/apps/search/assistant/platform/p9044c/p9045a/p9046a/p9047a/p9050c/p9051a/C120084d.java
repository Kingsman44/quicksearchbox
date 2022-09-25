package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a;

import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120057c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.d */
/* compiled from: PG */
public final class C120084d {

    /* renamed from: a */
    private final C120057c f334290a;

    /* renamed from: b */
    private final C81016b f334291b;

    public C120084d(C81016b bVar, C120057c cVar) {
        C69664n.m101061g(bVar, "assistInteractionSessionStarter");
        C69664n.m101061g(cVar, "voiceInteractionSessionConformity");
        this.f334291b = bVar;
        this.f334290a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104658a(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r8, com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33516b r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120083c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.c r0 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120083c) r0
            int r1 = r0.f334289e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f334289e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.c r0 = new com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.c
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f334287c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f334289e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.f334286b
            java.lang.Object r9 = r0.f334285a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0091
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.gsa.nga.shared.b.a r10 = new com.google.android.apps.gsa.nga.shared.b.a
            r10.<init>()
            boolean r2 = r9.f89678b
            if (r2 == 0) goto L_0x0045
            r10.mo74795c()
            r10.mo74798f()
        L_0x0045:
            boolean r2 = r9.f89677a
            if (r2 == 0) goto L_0x004c
            r10.mo74795c()
        L_0x004c:
            com.google.android.libraries.search.assistant.invocation.o.a.db r9 = r9.f89679c
            boolean r9 = r9.f90831b
            if (r9 == 0) goto L_0x0055
            r10.mo74796d()
        L_0x0055:
            android.os.Bundle r9 = r10.mo74793a()
            java.lang.String r10 = "voice_intent"
            android.os.Parcelable r2 = r9.getParcelable(r10)
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto L_0x009e
            java.lang.String r4 = "APA_SESSION_ID"
            long r5 = r8.f89676a
            android.content.Intent r8 = r2.putExtra(r4, r5)
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r2 = com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o.APA
            java.lang.String r2 = r2.name()
            java.lang.String r4 = "REQUIRE_SESSION_VARIANCE"
            android.content.Intent r8 = r8.putExtra(r4, r2)
            java.lang.String r2 = "bundle.getParcelable<Int…sicFlowVariance.APA.name)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            r9.putParcelable(r10, r8)
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.c r8 = r7.f334290a
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r10 = com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o.APA
            r0.f334285a = r7
            r0.f334286b = r9
            r0.f334289e = r3
            java.lang.Object r8 = r8.mo104654a(r10, r0)
            if (r8 == r1) goto L_0x009d
            r8 = r9
            r9 = r7
        L_0x0091:
            com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.d r9 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120084d) r9
            com.google.android.apps.gsa.nga.shared.b.b r9 = r9.f334291b
            android.os.Bundle r8 = (android.os.Bundle) r8
            r9.mo74800a(r8)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x009d:
            return r1
        L_0x009e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Voice interaction bundle is missing AGSA voice intent."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120084d.mo104658a(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b, h.c.g):java.lang.Object");
    }
}
