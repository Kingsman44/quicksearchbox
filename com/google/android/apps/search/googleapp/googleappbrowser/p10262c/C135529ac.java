package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.firstrundataservice.FirstRunDataService$setDefaultValuesForSettingsBySwaaInternal$2$1", mo61344c = "FirstRunDataService.kt", mo61345d = "invokeSuspend", mo61346e = {115, 139, 146})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.ac */
/* compiled from: PG */
final class C135529ac extends C69572j implements C69630p {

    /* renamed from: a */
    int f369201a;

    /* renamed from: b */
    final /* synthetic */ C135531ae f369202b;

    /* renamed from: c */
    private /* synthetic */ Object f369203c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135529ac(C135531ae aeVar, C69577g gVar) {
        super(2, gVar);
        this.f369202b = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135529ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0096, code lost:
        if (kotlinx.coroutines.C71760h.m104951c(r6, r11) != r0) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f369201a
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 == r2) goto L_0x0013
            p5462h.C69714l.m101134b(r12)
            goto L_0x00c5
        L_0x0013:
            java.lang.Object r1 = r11.f369203c
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r12)
            goto L_0x0098
        L_0x001c:
            java.lang.Object r1 = r11.f369203c
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r12)
            goto L_0x0040
        L_0x0024:
            p5462h.C69714l.m101134b(r12)
            java.lang.Object r12 = r11.f369203c
            kotlinx.coroutines.aw r12 = (kotlinx.coroutines.C71422aw) r12
            com.google.android.apps.search.googleapp.googleappbrowser.c.ae r1 = r11.f369202b
            com.google.android.apps.search.googleapp.googleappbrowser.c.n r6 = com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135554n.f369248a
            com.google.common.util.concurrent.cx r1 = r1.mo112387d(r6)
            r11.f369203c = r12
            r11.f369201a = r3
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r11)
            if (r1 == r0) goto L_0x00c6
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x0040:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0049
            return r5
        L_0x0049:
            com.google.android.apps.search.googleapp.googleappbrowser.c.aa r12 = new com.google.android.apps.search.googleapp.googleappbrowser.c.aa
            com.google.android.apps.search.googleapp.googleappbrowser.c.ae r6 = r11.f369202b
            r12.<init>(r6, r5)
            kotlinx.coroutines.be r12 = kotlinx.coroutines.C71803m.m105042c(r1, r5, r5, r12, r4)
            com.google.android.apps.search.googleapp.googleappbrowser.c.v r6 = new com.google.android.apps.search.googleapp.googleappbrowser.c.v
            com.google.android.apps.search.googleapp.googleappbrowser.c.ae r7 = r11.f369202b
            r6.<init>(r7, r5)
            kotlinx.coroutines.be r6 = kotlinx.coroutines.C71803m.m105042c(r1, r5, r5, r6, r4)
            com.google.android.apps.search.googleapp.googleappbrowser.c.w r7 = new com.google.android.apps.search.googleapp.googleappbrowser.c.w
            com.google.android.apps.search.googleapp.googleappbrowser.c.ae r8 = r11.f369202b
            r7.<init>(r8, r6, r5)
            kotlinx.coroutines.be r6 = kotlinx.coroutines.C71803m.m105042c(r1, r5, r5, r7, r4)
            com.google.android.apps.search.googleapp.googleappbrowser.c.y r7 = new com.google.android.apps.search.googleapp.googleappbrowser.c.y
            r7.<init>(r6, r12, r5)
            kotlinx.coroutines.cp r7 = kotlinx.coroutines.C71803m.m105043d(r1, r5, r5, r7, r4)
            com.google.android.apps.search.googleapp.googleappbrowser.c.x r8 = new com.google.android.apps.search.googleapp.googleappbrowser.c.x
            r8.<init>(r6, r12, r5)
            kotlinx.coroutines.cp r8 = kotlinx.coroutines.C71803m.m105043d(r1, r5, r5, r8, r4)
            com.google.android.apps.search.googleapp.googleappbrowser.c.ab r9 = new com.google.android.apps.search.googleapp.googleappbrowser.c.ab
            r9.<init>(r6, r12, r5)
            kotlinx.coroutines.cp r12 = kotlinx.coroutines.C71803m.m105043d(r1, r5, r5, r9, r4)
            kotlinx.coroutines.cp[] r6 = new kotlinx.coroutines.C71643cp[r4]
            r9 = 0
            r6[r9] = r7
            r6[r3] = r8
            r6[r2] = r12
            r11.f369203c = r1
            r11.f369201a = r2
            java.lang.Object r12 = kotlinx.coroutines.C71760h.m104951c(r6, r11)
            if (r12 == r0) goto L_0x00c6
        L_0x0098:
            com.google.android.apps.search.googleapp.googleappbrowser.c.ae r12 = r11.f369202b
            com.google.android.libraries.storage.protostore.ab r12 = r12.f369207b
            com.google.android.apps.search.googleapp.googleappbrowser.c.z r2 = com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135566z.f369273a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r12 = r12.mo46039a(r2, r3)
            java.lang.String r2 = "setDefaultsUpdateFuture"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            com.google.android.apps.search.googleapp.googleappbrowser.c.t r2 = new com.google.android.apps.search.googleapp.googleappbrowser.c.t
            r2.<init>(r12, r5)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r1, r5, r5, r2, r4)
            com.google.android.apps.search.googleapp.googleappbrowser.c.u r2 = new com.google.android.apps.search.googleapp.googleappbrowser.c.u
            r2.<init>(r12)
            r1.mo62873s(r2)
            r11.f369203c = r5
            r11.f369201a = r4
            java.lang.Object r12 = r1.mo62825a(r11)
            if (r12 != r0) goto L_0x00c5
            return r0
        L_0x00c5:
            return r12
        L_0x00c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135529ac.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135529ac acVar = new C135529ac(this.f369202b, gVar);
        acVar.f369203c = obj;
        return acVar;
    }
}
