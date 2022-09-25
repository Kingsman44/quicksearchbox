package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c;

import androidx.media.C2449z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.f */
/* compiled from: PG */
final class C14034f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C2449z f42650a;

    /* renamed from: b */
    final /* synthetic */ C14035g f42651b;

    public C14034f(C14035g gVar, C2449z zVar) {
        this.f42651b = gVar;
        this.f42650a = zVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C14035g.f42652a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NewsBrowserCntPrvdr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(45301)).mo56386p("Failed to get news content.");
        this.f42650a.mo5863c((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if (p3186j$.util.Collection.EL.stream(r9.f136914b).anyMatch(new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c.C14029a(r0)) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r8.f42650a.mo5863c(r8.f42651b.mo21390b(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if ((r4.f137526b + (r2 * 60)) < r0) goto L_0x003a;
     */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17911gm(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.assistant.e.j.ia r9 = (com.google.assistant.p3897e.p3921j.C52176ia) r9
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g r0 = r8.f42651b
            com.google.android.libraries.f.a r0 = r0.f42655d
            long r0 = r0.mo26870b()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            com.google.protobuf.cq r2 = r9.f136914b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0058
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g r2 = r8.f42651b
            g.a.a r2 = r2.f42656e
            java.lang.Object r2 = r2.mo17428b()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r4 = r9.f136913a
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x003a
            com.google.assistant.e.j.qp r4 = r9.f136921i
            if (r4 != 0) goto L_0x002f
            com.google.assistant.e.j.qp r4 = com.google.assistant.p3897e.p3921j.C52407qp.f137523d
        L_0x002f:
            long r4 = r4.f137526b
            r6 = 60
            long r2 = r2 * r6
            long r4 = r4 + r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x004c
        L_0x003a:
            com.google.protobuf.cq r2 = r9.f136914b
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.a r3 = new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.a
            r3.<init>(r0)
            boolean r0 = r2.anyMatch(r3)
            if (r0 == 0) goto L_0x004c
            goto L_0x0058
        L_0x004c:
            androidx.media.z r0 = r8.f42650a
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g r1 = r8.f42651b
            com.google.common.b.gu r9 = r1.mo21390b(r9)
            r0.mo5863c(r9)
            return
        L_0x0058:
            com.google.protobuf.cq r9 = r9.f136914b
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0063
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0065
        L_0x0063:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0065:
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g r9 = r8.f42651b
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.a r9 = r9.f42654c
            com.google.common.util.concurrent.cx r9 = r9.mo21385a()
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.e r0 = new com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.e
            r0.<init>(r8)
            com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.g r1 = r8.f42651b
            java.util.concurrent.Executor r1 = r1.f42653b
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r9, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c.C14034f.mo17911gm(java.lang.Object):void");
    }
}
