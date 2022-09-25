package com.google.android.apps.search.assistant.libraries.p8975g.p8976a;

import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.g.a.g */
/* compiled from: PG */
public final class C119392g {

    /* renamed from: a */
    public final C119387b f332875a;

    /* renamed from: b */
    private final Executor f332876b;

    public C119392g(C119387b bVar, Executor executor) {
        C69664n.m101061g(bVar, "splitInstallHelper");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f332875a = bVar;
        this.f332876b = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104320a(java.util.List r7, com.google.android.apps.search.assistant.libraries.p8975g.C119402f r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119388c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.libraries.g.a.c r0 = (com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119388c) r0
            int r1 = r0.f332864e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332864e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.g.a.c r0 = new com.google.android.apps.search.assistant.libraries.g.a.c
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f332862c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332864e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r9)
            goto L_0x00c4
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            java.lang.Object r8 = r0.f332861b
            java.lang.Object r7 = r0.f332860a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0069
        L_0x003b:
            p5462h.C69714l.m101134b(r9)
            com.google.android.play.core.g.ag r9 = new com.google.android.play.core.g.ag
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0047:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            r9.mo48957a(r2)
            goto L_0x0047
        L_0x0057:
            com.google.android.play.core.g.ah r7 = new com.google.android.play.core.g.ah
            r7.<init>(r9)
            r0.f332860a = r6
            r0.f332861b = r8
            r0.f332864e = r4
            java.lang.Object r9 = r6.mo104321b(r7, r8, r0)
            if (r9 == r1) goto L_0x00c7
            r7 = r6
        L_0x0069:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2 = 0
            r0.f332860a = r2
            r0.f332861b = r2
            r0.f332864e = r3
            if (r8 == 0) goto L_0x008d
            r2 = r8
            com.google.android.apps.search.assistant.libraries.g.f r2 = (com.google.android.apps.search.assistant.libraries.p8975g.C119402f) r2
            com.google.android.apps.search.assistant.platform.wholehome.shared.jni.e r2 = r2.f332891a
            if (r2 == 0) goto L_0x008d
            com.google.common.f.a.d r2 = com.google.android.apps.search.assistant.platform.wholehome.shared.jni.C124354f.f343253a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Whole home module install started"
            r5 = 36183(0x8d57, float:5.0703E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r5)).mo56386p(r3)
        L_0x008d:
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            h.c.g r0 = p5462h.p5466c.p5467a.C69555b.m100961b(r0)
            r2.<init>(r0, r4)
            r2.mo63041A()
            com.google.android.apps.search.assistant.libraries.g.a.e r0 = new com.google.android.apps.search.assistant.libraries.g.a.e
            com.google.android.apps.search.assistant.libraries.g.a.g r7 = (com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119392g) r7
            com.google.android.apps.search.assistant.libraries.g.f r8 = (com.google.android.apps.search.assistant.libraries.p8975g.C119402f) r8
            r0.<init>(r9, r7, r2, r8)
            com.google.android.apps.search.assistant.libraries.g.a.b r8 = r7.f332875a
            com.google.common.base.cr r8 = r8.f332859a
            java.lang.Object r8 = r8.mo6453a()
            com.google.android.play.core.g.v r8 = (com.google.android.play.core.p3538g.C45187v) r8
            r8.mo49001h(r0)
            com.google.android.apps.search.assistant.libraries.g.a.d r8 = new com.google.android.apps.search.assistant.libraries.g.a.d
            r8.<init>(r7, r0)
            r2.mo63035f(r8)
            java.lang.Object r7 = r2.mo63043n()
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r7 == r8) goto L_0x00c1
            h.q r7 = p5462h.C69788q.f186170a
        L_0x00c1:
            if (r7 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119392g.mo104320a(java.util.List, com.google.android.apps.search.assistant.libraries.g.f, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104321b(com.google.android.play.core.p3538g.C45122ah r5, com.google.android.apps.search.assistant.libraries.p8975g.C119402f r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119391f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.libraries.g.a.f r0 = (com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119391f) r0
            int r1 = r0.f332874d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332874d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.g.a.f r0 = new com.google.android.apps.search.assistant.libraries.g.a.f
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f332872b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332874d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f332871a
            p5462h.C69714l.m101134b(r7)     // Catch:{ n -> 0x0029 }
            goto L_0x0055
        L_0x0029:
            r5 = move-exception
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.libraries.g.a.b r7 = r4.f332875a     // Catch:{ n -> 0x0029 }
            com.google.common.base.cr r7 = r7.f332859a     // Catch:{ n -> 0x0029 }
            java.lang.Object r7 = r7.mo6453a()     // Catch:{ n -> 0x0029 }
            com.google.android.play.core.g.v r7 = (com.google.android.play.core.p3538g.C45187v) r7     // Catch:{ n -> 0x0029 }
            com.google.android.gms.tasks.ab r5 = r7.mo48998e(r5)     // Catch:{ n -> 0x0029 }
            java.lang.String r7 = "splitInstallHelper.startInstall(request)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)     // Catch:{ n -> 0x0029 }
            java.util.concurrent.Executor r7 = r4.f332876b     // Catch:{ n -> 0x0029 }
            r0.f332871a = r6     // Catch:{ n -> 0x0029 }
            r0.f332874d = r3     // Catch:{ n -> 0x0029 }
            java.lang.Object r7 = com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119397l.m198116a(r5, r7, r0)     // Catch:{ n -> 0x0029 }
            if (r7 == r1) goto L_0x0066
        L_0x0055:
            java.lang.String r5 = "{\n      splitInstallHelp…ightweightExecutor)\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r5)     // Catch:{ n -> 0x0029 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ n -> 0x0029 }
            int r5 = r7.intValue()     // Catch:{ n -> 0x0029 }
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L_0x0066:
            return r1
        L_0x0067:
            if (r6 == 0) goto L_0x006e
            com.google.android.apps.search.assistant.libraries.g.f r6 = (com.google.android.apps.search.assistant.libraries.p8975g.C119402f) r6
            r6.mo104325a()
        L_0x006e:
            com.google.android.apps.search.assistant.libraries.g.b r6 = new com.google.android.apps.search.assistant.libraries.g.b
            com.google.android.gms.common.api.Status r7 = r5.f389919a
            int r7 = r7.f389621g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FailedToStartWithErrorCode:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8975g.p8976a.C119392g.mo104321b(com.google.android.play.core.g.ah, com.google.android.apps.search.assistant.libraries.g.f, h.c.g):java.lang.Object");
    }
}
