package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9080f.p9111h.C120704a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.b */
/* compiled from: PG */
public final class C120618b {

    /* renamed from: a */
    private final C120632p f335504a;

    /* renamed from: b */
    private final C120704a f335505b;

    /* renamed from: c */
    private final C119834cb f335506c;

    /* renamed from: d */
    private final long f335507d;

    public C120618b(C120632p pVar, C120704a aVar, C119834cb cbVar, long j) {
        C69664n.m101061g(pVar, "contextFetcher");
        C69664n.m101061g(aVar, "localeProvider");
        C69664n.m101061g(cbVar, "interactionId");
        this.f335504a = pVar;
        this.f335505b = aVar;
        this.f335506c = cbVar;
        this.f335507d = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104858a(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120611a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.f.f.d.a.a r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120611a) r0
            int r1 = r0.f335480g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335480g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.f.d.a.a r0 = new com.google.android.apps.search.assistant.platform.f.f.d.a.a
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f335478e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335480g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f335475b
            java.lang.Object r0 = r0.f335474a
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r0 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122421bm) r0
            p5462h.C69714l.m101134b(r10)
            goto L_0x00da
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0039:
            java.lang.Object r2 = r0.f335477d
            java.lang.Object r4 = r0.f335476c
            java.lang.Object r5 = r0.f335475b
            java.lang.Object r6 = r0.f335474a
            com.google.android.apps.search.assistant.platform.f.f.d.a.b r6 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120618b) r6
            p5462h.C69714l.m101134b(r10)
            r8 = r5
            r5 = r2
            r2 = r8
            goto L_0x008a
        L_0x004a:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r10 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk.f339392l
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bi r10 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122417bi) r10
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            long r5 = r9.f335507d
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bi r10 = r2.f339405a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r10 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk) r10
            int r6 = (int) r5
            r10.f339394a = r6
            com.google.android.apps.search.assistant.platform.f.h.a r10 = r9.f335505b
            com.google.common.util.concurrent.cx r10 = r10.mo104903b()
            java.lang.String r5 = "localeProvider.localeLanguageCode()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            r0.f335474a = r9
            r0.f335475b = r2
            r0.f335476c = r2
            r0.f335477d = r2
            r0.f335480g = r4
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)
            if (r10 == r1) goto L_0x00e8
            r6 = r9
            r4 = r2
            r5 = r4
        L_0x008a:
            java.lang.String r7 = "localeProvider.localeLanguageCode().await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r5 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122421bm) r5
            r5.mo105624c(r10)
            j$.time.ZoneId r10 = com.google.common.p4580v.C60951j.f165070a
            java.lang.String r10 = r10.getId()
            java.lang.String r5 = "googleZoneId().id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            r5 = r4
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r5 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122421bm) r5
            r5.mo105625d(r10)
            com.google.android.apps.search.assistant.platform.b.a.d.cb r10 = r6.f335506c
            java.lang.String r10 = r10.f333767a
            java.lang.String r7 = "interactionId.id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r7)
            java.lang.String r7 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r7)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bi r5 = r5.f339405a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r5 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk) r5
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r7 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk.f339392l
            r10.getClass()
            r5.f339397d = r10
            com.google.android.apps.search.assistant.platform.f.f.d.a.p r10 = r6.f335504a
            r0.f335474a = r2
            r0.f335475b = r4
            r5 = 0
            r0.f335476c = r5
            r0.f335477d = r5
            r0.f335480g = r3
            java.lang.Object r10 = r10.mo104860b(r0)
            if (r10 == r1) goto L_0x00e8
            r0 = r2
            r1 = r4
        L_0x00da:
            com.google.assistant.e.j.ex r10 = (com.google.assistant.p3897e.p3921j.C52091ex) r10
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r1 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122421bm) r1
            r1.mo105623b(r10)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bm r0 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122421bm) r0
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bk r10 = r0.mo105622a()
            return r10
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120618b.mo104858a(h.c.g):java.lang.Object");
    }
}
