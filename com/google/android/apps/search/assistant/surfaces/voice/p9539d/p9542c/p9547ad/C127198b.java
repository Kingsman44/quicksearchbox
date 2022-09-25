package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.topcontacts.DeviceContactsGuard$isContactAccessAllowed$2", mo61344c = "DeviceContactsGuard.kt", mo61345d = "invokeSuspend", mo61346e = {25, 27})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.b */
/* compiled from: PG */
final class C127198b extends C69572j implements C69630p {

    /* renamed from: a */
    int f350200a;

    /* renamed from: b */
    int f350201b;

    /* renamed from: c */
    final /* synthetic */ C127199c f350202c;

    /* renamed from: d */
    private /* synthetic */ Object f350203d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127198b(C127199c cVar, C69577g gVar) {
        super(2, gVar);
        this.f350202c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127198b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0049, code lost:
        if (r8 != r0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005b, code lost:
        r8 = com.google.android.libraries.search.udcdataservice.C41408g.m72395a(r8.f108147c);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f350201b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0019
            if (r1 == r3) goto L_0x0011
            int r0 = r7.f350200a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0077
        L_0x0011:
            java.lang.Object r1 = r7.f350203d
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            p5462h.C69714l.m101134b(r8)
            goto L_0x004b
        L_0x0019:
            p5462h.C69714l.m101134b(r8)
            java.lang.Object r8 = r7.f350203d
            kotlinx.coroutines.aw r8 = (kotlinx.coroutines.C71422aw) r8
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.a r1 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.a
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.c r5 = r7.f350202c
            r1.<init>(r5, r2)
            r5 = 3
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r8, r2, r2, r1, r5)
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.c r8 = r7.f350202c
            com.google.android.libraries.search.udcdataservice.h r8 = r8.f350204a
            com.google.android.libraries.search.udcdataservice.c[] r5 = new com.google.android.libraries.search.udcdataservice.C41387c[r3]
            com.google.android.libraries.search.udcdataservice.c r6 = com.google.android.libraries.search.udcdataservice.C41387c.DEVICE_CONTACTS
            r5[r4] = r6
            com.google.android.libraries.search.udcdataservice.a r6 = com.google.android.libraries.search.udcdataservice.C41385a.ASSISTANT
            com.google.common.util.concurrent.cx r8 = r8.mo43949b(r5, r6)
            java.lang.String r5 = "udcDataService.checkSett…, CallSiteName.ASSISTANT)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)
            r7.f350203d = r1
            r7.f350201b = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r7)
            if (r8 == r0) goto L_0x0088
        L_0x004b:
            java.util.List r8 = (java.util.List) r8
            java.lang.String r5 = "deviceContactsSettings"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)
            java.lang.Object r8 = p5462h.p5463a.C69540x.m100821C(r8)
            com.google.android.libraries.search.udcdataservice.e r8 = (com.google.android.libraries.search.udcdataservice.C41389e) r8
            r5 = 2
            if (r8 == 0) goto L_0x0068
            int r8 = r8.f108147c
            int r8 = com.google.android.libraries.search.udcdataservice.C41408g.m72395a(r8)
            if (r8 != 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            if (r8 != r5) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            r7.f350203d = r2
            r7.f350200a = r8
            r7.f350201b = r5
            java.lang.Object r1 = r1.mo62825a(r7)
            if (r1 == r0) goto L_0x0088
            r0 = r8
            r8 = r1
        L_0x0077:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127198b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C127198b bVar = new C127198b(this.f350202c, gVar);
        bVar.f350203d = obj;
        return bVar;
    }
}
