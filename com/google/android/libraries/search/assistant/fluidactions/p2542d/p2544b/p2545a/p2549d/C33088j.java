package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.fluidactions.fulfillment.impl.features.productivity.AlarmFeatureFormInputProcessor$progressCreateAlarmDialog$confirmationResponse$1", mo61344c = "AlarmFeatureFormInputProcessor.kt", mo61345d = "invokeSuspend", mo61346e = {155})
/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.j */
/* compiled from: PG */
final class C33088j extends C69572j implements C69626l {

    /* renamed from: a */
    int f88596a;

    /* renamed from: b */
    final /* synthetic */ C33092n f88597b;

    /* renamed from: c */
    final /* synthetic */ C33080b f88598c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33088j(C33092n nVar, C33080b bVar, C69577g gVar) {
        super(1, gVar);
        this.f88597b = nVar;
        this.f88598c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33088j(this.f88597b, this.f88598c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f88596a
            if (r1 == 0) goto L_0x000b
            p5462h.C69714l.m101134b(r7)
            goto L_0x0077
        L_0x000b:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.n r7 = r6.f88597b
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b r1 = r6.f88598c
            r2 = 1
            r6.f88596a = r2
            com.google.assistant.e.j.tr r3 = r1.f88559a
            int r4 = r3.f137797a
            r2 = r2 & r4
            r4 = 0
            if (r2 == 0) goto L_0x0073
            int r2 = r3.f137798b
            r5 = 9
            if (r2 != r5) goto L_0x0028
            java.lang.Object r2 = r3.f137799c
            com.google.assistant.e.j.tc r2 = (com.google.assistant.p3897e.p3921j.C52475tc) r2
            goto L_0x002a
        L_0x0028:
            com.google.assistant.e.j.tc r2 = com.google.assistant.p3897e.p3921j.C52475tc.f137744c
        L_0x002a:
            boolean r2 = r2.f137747b
            if (r2 != 0) goto L_0x002f
            goto L_0x0073
        L_0x002f:
            java.lang.String r2 = r3.f137800d
            com.google.assistant.e.j.e.ff r3 = r1.f88560b
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r2, r3)
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r3 = r2.f136277e
            r5 = 17
            if (r3 != r5) goto L_0x004e
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.ah r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r2
            goto L_0x0050
        L_0x004e:
            com.google.assistant.e.c.c.ah r2 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0050:
            int r2 = r2.f132602h
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r2)
            if (r2 != 0) goto L_0x005a
            com.google.assistant.e.c.c.ac r2 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x005a:
            com.google.assistant.e.c.c.ac r3 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.CONFIRM
            if (r2 == r3) goto L_0x005f
            goto L_0x0073
        L_0x005f:
            com.google.assistant.e.j.ex r2 = r1.f88563e
            com.google.assistant.e.j.ex r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61465a(r2)
            java.lang.String r3 = "updatedConversationParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.b r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33092n.m61386h(r1, r2)
            java.lang.Object r7 = r7.mo38516c(r1, r6)
            goto L_0x0074
        L_0x0073:
            r7 = r4
        L_0x0074:
            if (r7 != r0) goto L_0x0077
            return r0
        L_0x0077:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33088j.mo5193b(java.lang.Object):java.lang.Object");
    }
}
