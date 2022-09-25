package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.C125522a;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.ZoneId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.i */
/* compiled from: PG */
public final class C125702i implements C125522a {

    /* renamed from: a */
    public static final C59071e f346453a = C59071e.m91331h();

    /* renamed from: b */
    public final Locale f346454b;

    /* renamed from: c */
    public final C71422aw f346455c;

    /* renamed from: d */
    public final C125696c f346456d;

    /* renamed from: e */
    public final long f346457e;

    /* renamed from: f */
    public final String f346458f;

    /* renamed from: g */
    public final C122549e f346459g;

    /* renamed from: h */
    private final C122472a f346460h;

    public C125702i(Locale locale, C122472a aVar, C71422aw awVar, C125696c cVar, long j) {
        C69664n.m101061g(locale, "locale");
        C69664n.m101061g(aVar, "onDeviceNluFulfillmentService");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f346454b = locale;
        this.f346460h = aVar;
        this.f346455c = awVar;
        this.f346456d = cVar;
        this.f346457e = j;
        String zoneId = ZoneId.systemDefault().toString();
        C69664n.m101060f(zoneId, "systemDefault().toString()");
        this.f346458f = zoneId;
        C122549e a = aVar.mo105629a();
        C69664n.m101060f(a, "onDeviceNluFulfillmentService.createConnection()");
        this.f346459g = a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r9 == r1) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107087a(com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p r7, com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125699f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.f r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125699f) r0
            int r1 = r0.f346447e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346447e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.f r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.f
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f346445c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346447e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r9)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.f346444b
            java.lang.Object r8 = r0.f346443a
            p5462h.C69714l.m101134b(r9)
            goto L_0x004c
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.b r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125696c.f346432a
            r0.f346443a = r6
            r0.f346444b = r7
            r0.f346447e = r4
            java.lang.Object r9 = r9.mo107086a(r8, r0)
            if (r9 == r1) goto L_0x00c9
            r8 = r6
        L_0x004c:
            com.google.assistant.e.j.ex r9 = (com.google.assistant.p3897e.p3921j.C52091ex) r9
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.g r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125700g.f346448a
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.h r4 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.h
            r5 = r8
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.i r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i) r5
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p r7 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p) r7
            r4.<init>(r5, r7, r9, r2)
            com.google.common.util.concurrent.cx r7 = com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17592b.m34885d(r4)
            r0.f346443a = r8
            r8 = 0
            r0.f346444b = r8
            r0.f346447e = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r9 == r1) goto L_0x00c9
        L_0x006b:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ak r9 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak) r9
            com.google.protos.f.q.fc r7 = r9.f339311a
            if (r7 != 0) goto L_0x0073
            com.google.protos.f.q.fc r7 = com.google.protos.p4985f.p5030q.C65196fc.f176453l
        L_0x0073:
            java.lang.String r8 = "fulfillmentPart.popResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            int r8 = r7.f176458d
            com.google.protos.f.q.fb r8 = com.google.protos.p4985f.p5030q.C65195fb.NO_ERROR
            com.google.protos.an.a.a.h r8 = r7.f176460f
            if (r8 != 0) goto L_0x0082
            com.google.protos.an.a.a.h r8 = com.google.protos.p4850an.p4851a.p4852a.C63324h.f171148d
        L_0x0082:
            com.google.knowledge.a.a.n r8 = r8.f171151b
            if (r8 != 0) goto L_0x0088
            com.google.knowledge.a.a.n r8 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0088:
            java.lang.String r8 = r8.f166811b
            com.google.assistant.e.j.en r7 = r7.f176461g
            if (r7 != 0) goto L_0x0090
            com.google.assistant.e.j.en r7 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
        L_0x0090:
            com.google.protobuf.cq r7 = r7.f136684d
            java.lang.String r8 = "popResponse.conversationDelta.interactionDeltaList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = p5462h.p5463a.C69540x.m100804k(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00a6:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00c8
            java.lang.Object r9 = r7.next()
            com.google.assistant.e.j.ep r9 = (com.google.assistant.p3897e.p3921j.C52083ep) r9
            int r0 = r9.f136692b
            r1 = 4
            if (r0 != r1) goto L_0x00bc
            java.lang.Object r9 = r9.f136693c
            com.google.assistant.e.j.ei r9 = (com.google.assistant.p3897e.p3921j.C52076ei) r9
            goto L_0x00be
        L_0x00bc:
            com.google.assistant.e.j.ei r9 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x00be:
            com.google.assistant.e.j.dy r9 = r9.f136668c
            if (r9 != 0) goto L_0x00c4
            com.google.assistant.e.j.dy r9 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x00c4:
            r8.add(r9)
            goto L_0x00a6
        L_0x00c8:
            return r8
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i.mo107087a(com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.p, com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c, h.c.g):java.lang.Object");
    }
}
