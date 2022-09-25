package com.google.android.libraries.notifications.p2268e.p2275d.p2276a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.internal.periodic.impl.ChimePeriodicTaskManagerImpl$scheduleGnpJob$1", mo61344c = "ChimePeriodicTaskManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {42, 48})
/* renamed from: com.google.android.libraries.notifications.e.d.a.c */
/* compiled from: PG */
public final class C29843c extends C69572j implements C69630p {

    /* renamed from: a */
    int f80910a;

    /* renamed from: b */
    final /* synthetic */ C29844d f80911b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29843c(C29844d dVar, C69577g gVar) {
        super(2, gVar);
        this.f80911b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C29843c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071 A[SYNTHETIC, Splitter:B:16:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f80910a
            r2 = 1
            r3 = 0
            java.lang.String r4 = "ChimePeriodicTaskManagerImpl"
            if (r1 == 0) goto L_0x0014
            if (r1 == r2) goto L_0x0010
            p5462h.C69714l.m101134b(r12)
            goto L_0x0069
        L_0x0010:
            p5462h.C69714l.m101134b(r12)
            goto L_0x0031
        L_0x0014:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.notifications.e.d.a.d r12 = r11.f80911b
            dagger.a r12 = r12.f80913b
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.libraries.notifications.platform.f.b.b r12 = (com.google.android.libraries.notifications.platform.p2318f.p2322b.C30123b) r12
            com.google.android.libraries.notifications.e.d.a.d r1 = r11.f80911b
            com.google.android.libraries.notifications.k.a.c r1 = r1.f80915d
            int r1 = r1.mo35373a()
            r11.f80910a = r2
            java.lang.Object r12 = r12.mo35520b(r1, r11)
            if (r12 == r0) goto L_0x008e
        L_0x0031:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0043
            java.lang.String r12 = "Periodic job is already scheduled."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r4, r12, r0)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x0043:
            com.google.android.libraries.notifications.e.d.a.d r12 = r11.f80911b
            dagger.a r12 = r12.f80913b
            java.lang.Object r12 = r12.mo27525b()
            java.lang.String r1 = "gnpJobSchedulingApi.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            r5 = r12
            com.google.android.libraries.notifications.platform.f.b.b r5 = (com.google.android.libraries.notifications.platform.p2318f.p2322b.C30123b) r5
            com.google.android.libraries.notifications.e.d.a.d r12 = r11.f80911b
            com.google.android.libraries.notifications.k.a.c r6 = r12.f80915d
            r12 = 2
            r11.f80910a = r12
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r7 = 0
            r9 = 0
            r10 = r11
            java.lang.Object r12 = r5.mo35521c(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L_0x0069
            return r0
        L_0x0069:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0084
            com.google.android.libraries.notifications.e.d.a.d r12 = r11.f80911b     // Catch:{ Exception -> 0x007b }
            com.google.android.libraries.notifications.k.e r12 = r12.f80912a     // Catch:{ Exception -> 0x007b }
            r0 = 0
            r1 = 7
            r12.mo35369a(r0, r1)     // Catch:{ Exception -> 0x007b }
            goto L_0x008b
        L_0x007b:
            r12 = move-exception
            java.lang.String r0 = "Failed to cancel existing Chime periodic job."
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r4, r12, r0, r1)
            goto L_0x008b
        L_0x0084:
            java.lang.String r12 = "Failed to schedule periodic task."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55796h(r4, r12, r0)
        L_0x008b:
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2275d.p2276a.C29843c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C29843c(this.f80911b, gVar);
    }
}
