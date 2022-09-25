package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.CanStartDictationMonitor$buildResponse$2", mo61344c = "CanStartDictationMonitor.kt", mo61345d = "invokeSuspend", mo61346e = {103, 107})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.g */
/* compiled from: PG */
final class C125866g extends C69572j implements C69630p {

    /* renamed from: a */
    Object f346897a;

    /* renamed from: b */
    Object f346898b;

    /* renamed from: c */
    Object f346899c;

    /* renamed from: d */
    Object f346900d;

    /* renamed from: e */
    int f346901e;

    /* renamed from: f */
    final /* synthetic */ C125934w f346902f;

    /* renamed from: g */
    final /* synthetic */ C125876q f346903g;

    /* renamed from: h */
    private /* synthetic */ Object f346904h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125866g(C125934w wVar, C125876q qVar, C69577g gVar) {
        super(2, gVar);
        this.f346902f = wVar;
        this.f346903g = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125866g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r9 != r0) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f346901e
            r2 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r2) goto L_0x001a
            java.lang.Object r0 = r8.f346900d
            java.lang.Object r1 = r8.f346899c
            java.lang.Object r3 = r8.f346898b
            java.lang.Object r4 = r8.f346897a
            java.lang.Object r5 = r8.f346904h
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r5 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i) r5
            p5462h.C69714l.m101134b(r9)
            goto L_0x008c
        L_0x001a:
            java.lang.Object r1 = r8.f346904h
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x0052
        L_0x0022:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f346904h
            kotlinx.coroutines.aw r9 = (kotlinx.coroutines.C71422aw) r9
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.f r1 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.f
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.q r3 = r8.f346903g
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r4 = r8.f346902f
            r5 = 0
            r1.<init>(r3, r4, r5)
            r3 = 3
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r9, r5, r5, r1, r3)
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r9 = r8.f346902f
            boolean r3 = r9.f347147b
            if (r3 != 0) goto L_0x0042
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r9 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.UNKNOWN
        L_0x0040:
            r5 = r9
            goto L_0x0055
        L_0x0042:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.q r3 = r8.f346903g
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r3 = r3.f346937d
            com.google.android.apps.gsa.nga.api.a.af r9 = r9.f347148c
            r8.f346904h = r1
            r8.f346901e = r2
            java.lang.Object r9 = r3.mo107178m(r9, r8)
            if (r9 == r0) goto L_0x00d1
        L_0x0052:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r9 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i) r9
            goto L_0x0040
        L_0x0055:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r9 = r8.f346902f
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.q r4 = r8.f346903g
            com.google.android.apps.search.assistant.libraries.dictation.b.d r3 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d.f332631e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.libraries.dictation.b.c r3 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119281c) r3
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)
            com.google.android.apps.search.assistant.libraries.dictation.b.f r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            boolean r9 = r9.f347147b
            com.google.android.apps.search.assistant.libraries.dictation.b.c r6 = r3.f332637a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.search.assistant.libraries.dictation.b.d r6 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d) r6
            r6.f332635c = r9
            r8.f346904h = r5
            r8.f346897a = r4
            r8.f346898b = r3
            r8.f346899c = r3
            r8.f346900d = r3
            r9 = 2
            r8.f346901e = r9
            java.lang.Object r9 = r1.mo62825a(r8)
            if (r9 == r0) goto L_0x00d1
            r0 = r3
            r1 = r0
        L_0x008c:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r6 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE
            r7 = 0
            if (r9 != r6) goto L_0x0093
            r9 = 1
            goto L_0x0094
        L_0x0093:
            r9 = 0
        L_0x0094:
            com.google.android.apps.search.assistant.libraries.dictation.b.f r0 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119284f) r0
            com.google.android.apps.search.assistant.libraries.dictation.b.c r0 = r0.f332637a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.apps.search.assistant.libraries.dictation.b.d r0 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d) r0
            com.google.android.apps.search.assistant.libraries.dictation.b.d r6 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d.f332631e
            r0.f332634b = r9
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r9 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE
            if (r5 != r9) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            com.google.android.apps.search.assistant.libraries.dictation.b.f r1 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119284f) r1
            com.google.android.apps.search.assistant.libraries.dictation.b.c r9 = r1.f332637a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.android.apps.search.assistant.libraries.dictation.b.d r9 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d) r9
            r9.f332633a = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.q r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125876q) r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.l.b.h r9 = r4.f346936c
            j$.time.Instant r9 = r9.mo107156a()
            com.google.protobuf.fg r9 = com.google.protobuf.p4750c.C62950b.m95472c(r9)
            java.lang.String r0 = "toProtoTimestamp(keyboar…ate.lastKeyboardOpenTime)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r0)
            r1.mo104269b(r9)
            com.google.android.apps.search.assistant.libraries.dictation.b.f r3 = (com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119284f) r3
            com.google.android.apps.search.assistant.libraries.dictation.b.d r9 = r3.mo104268a()
            return r9
        L_0x00d1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125866g.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125866g gVar2 = new C125866g(this.f346902f, this.f346903g, gVar);
        gVar2.f346904h = obj;
        return gVar2;
    }
}
