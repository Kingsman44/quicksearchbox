package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9527d;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.modeldownloadprompter.TemporaryModelDownloadPrompterImpl$maybeShowTemporaryModelDownloadPrompt$1", mo61344c = "TemporaryModelDownloadPrompterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {25, 26, 35})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.d.c */
/* compiled from: PG */
final class C127040c extends C69572j implements C69630p {

    /* renamed from: a */
    boolean f349823a;

    /* renamed from: b */
    int f349824b;

    /* renamed from: c */
    final /* synthetic */ C127041d f349825c;

    /* renamed from: d */
    final /* synthetic */ String f349826d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127040c(C127041d dVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f349825c = dVar;
        this.f349826d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127040c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1 A[Catch:{ Exception -> 0x001c }, RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f349824b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 == r4) goto L_0x0018
            if (r1 == r3) goto L_0x0012
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x001c }
            goto L_0x00b2
        L_0x0012:
            boolean r1 = r6.f349823a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x001c }
            goto L_0x0054
        L_0x0018:
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x001c }
            goto L_0x0033
        L_0x001c:
            r7 = move-exception
            goto L_0x00b8
        L_0x001f:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.d.d r7 = r6.f349825c     // Catch:{ Exception -> 0x001c }
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.d r7 = r7.f349830d     // Catch:{ Exception -> 0x001c }
            com.google.common.util.concurrent.cx r7 = r7.mo108264a()     // Catch:{ Exception -> 0x001c }
            r6.f349824b = r4     // Catch:{ Exception -> 0x001c }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)     // Catch:{ Exception -> 0x001c }
            if (r7 != r0) goto L_0x0033
            return r0
        L_0x0033:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r7     // Catch:{ Exception -> 0x001c }
            int r1 = r7.f352149a     // Catch:{ Exception -> 0x001c }
            if (r1 != r4) goto L_0x0043
            java.lang.Object r7 = r7.f352150b     // Catch:{ Exception -> 0x001c }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x001c }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x001c }
            r1 = r7
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.d.d r7 = r6.f349825c     // Catch:{ Exception -> 0x001c }
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.g r7 = r7.f349829c     // Catch:{ Exception -> 0x001c }
            java.lang.String r5 = r6.f349826d     // Catch:{ Exception -> 0x001c }
            r6.f349823a = r1     // Catch:{ Exception -> 0x001c }
            r6.f349824b = r3     // Catch:{ Exception -> 0x001c }
            java.lang.Object r7 = r7.mo108268b(r5, r6)     // Catch:{ Exception -> 0x001c }
            if (r7 == r0) goto L_0x00b7
        L_0x0054:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r7     // Catch:{ Exception -> 0x001c }
            int r3 = r7.f352149a     // Catch:{ Exception -> 0x001c }
            if (r3 != r4) goto L_0x0062
            java.lang.Object r7 = r7.f352150b     // Catch:{ Exception -> 0x001c }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x001c }
            boolean r2 = r7.booleanValue()     // Catch:{ Exception -> 0x001c }
        L_0x0062:
            if (r1 != 0) goto L_0x006a
            if (r2 == 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            h.q r7 = p5462h.C69788q.f186170a     // Catch:{ Exception -> 0x001c }
            return r7
        L_0x006a:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.d.d r7 = r6.f349825c     // Catch:{ Exception -> 0x001c }
            com.google.android.libraries.assistant.c.b.c.aw r7 = r7.f349828b     // Catch:{ Exception -> 0x001c }
            java.lang.String r1 = r6.f349826d     // Catch:{ Exception -> 0x001c }
            com.google.android.libraries.assistant.c.b.c.y r2 = com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17080y.f49722c     // Catch:{ Exception -> 0x001c }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x001c }
            com.google.android.libraries.assistant.c.b.c.x r2 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17079x) r2     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ Exception -> 0x001c }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x001c }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ Exception -> 0x001c }
            com.google.android.libraries.assistant.c.b.c.y r3 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17080y) r3     // Catch:{ Exception -> 0x001c }
            r1.getClass()     // Catch:{ Exception -> 0x001c }
            int r5 = r3.f49724a     // Catch:{ Exception -> 0x001c }
            r4 = r4 | r5
            r3.f49724a = r4     // Catch:{ Exception -> 0x001c }
            r3.f49725b = r1     // Catch:{ Exception -> 0x001c }
            com.google.protobuf.bv r1 = r2.build()     // Catch:{ Exception -> 0x001c }
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ Exception -> 0x001c }
            com.google.android.libraries.assistant.c.b.c.y r1 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17080y) r1     // Catch:{ Exception -> 0x001c }
            r2 = 3
            r6.f349824b = r2     // Catch:{ Exception -> 0x001c }
            io.grpc.de r2 = new io.grpc.de     // Catch:{ Exception -> 0x001c }
            r2.<init>()     // Catch:{ Exception -> 0x001c }
            java.lang.Object r7 = r7.mo23176b(r1, r2, r6)     // Catch:{ Exception -> 0x001c }
            if (r7 != r0) goto L_0x00b2
            return r0
        L_0x00b2:
            com.google.android.libraries.assistant.c.b.c.aa r7 = (com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17034aa) r7     // Catch:{ Exception -> 0x001c }
            boolean r7 = r7.f49639b     // Catch:{ Exception -> 0x001c }
            goto L_0x00d6
        L_0x00b7:
            return r0
        L_0x00b8:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9527d.C127041d.f349827a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r7 = r0.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37366(0x91f6, float:5.2361E-41)
            r0.<init>(r1)
            r7.mo56379ah(r0)
            java.lang.String r0 = "Showing initial data download prompt failed."
            r7.mo56386p(r0)
        L_0x00d6:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9527d.C127040c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127040c(this.f349825c, this.f349826d, gVar);
    }
}
