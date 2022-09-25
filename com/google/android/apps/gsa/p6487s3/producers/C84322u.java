package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.s3.producers.u */
/* compiled from: PG */
final class C84322u extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C86159h f229477a;

    /* renamed from: b */
    final /* synthetic */ C9318f f229478b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f229479c;

    /* renamed from: d */
    final /* synthetic */ C90021c f229480d;

    /* renamed from: e */
    final /* synthetic */ C68214a f229481e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84322u(String str, C86159h hVar, C9318f fVar, SettableFuture settableFuture, C90021c cVar, C68214a aVar) {
        super(str, 1, 0);
        this.f229477a = hVar;
        this.f229478b = fVar;
        this.f229479c = settableFuture;
        this.f229480d = cVar;
        this.f229481e = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.apps.gsa.search.core.l.h r0 = r7.f229477a
            com.google.android.apps.gsa.assist.a.f r1 = r7.f229478b
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r0.f232834c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r0 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r0
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.android.apps.gsa.assist.a.i r2 = r0.f236453o
            boolean r2 = r2.mo17531h(r1)
            r3 = 0
            if (r2 != 0) goto L_0x001c
            r0 = r3
            goto L_0x0022
        L_0x001c:
            com.google.android.apps.gsa.assist.a.i r0 = r0.f236453o
            com.google.android.apps.gsa.assist.h r0 = r0.mo17524a(r1)
        L_0x0022:
            if (r0 == 0) goto L_0x0042
            com.google.knowledge.b.k r1 = com.google.knowledge.p4671b.C61818k.f166999r
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.knowledge.b.j r1 = (com.google.knowledge.p4671b.C61817j) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.knowledge.b.k r2 = (com.google.knowledge.p4671b.C61818k) r2
            r2.f167012l = r0
            int r0 = r2.f167001a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.f167001a = r0
            com.google.protobuf.bv r0 = r1.build()
            r3 = r0
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3
        L_0x0042:
            r0 = 0
            if (r3 != 0) goto L_0x004b
            com.google.common.util.concurrent.SettableFuture r1 = r7.f229479c
            r1.cancel(r0)
            return
        L_0x004b:
            com.google.android.apps.gsa.shared.m.c r1 = r7.f229480d
            com.google.android.apps.gsa.assist.a.f r2 = r7.f229478b
            com.google.android.apps.gsa.assist.a.f r4 = com.google.android.apps.gsa.assist.p501a.C9318f.VOICE
            if (r2 != r4) goto L_0x0055
            goto L_0x00d1
        L_0x0055:
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250813ae
            boolean r1 = r1.mo79746e(r2)
            if (r1 != 0) goto L_0x00d1
            com.google.common.util.concurrent.SettableFuture r1 = r7.f229479c
            com.google.protobuf.bn r2 = r3.toBuilder()
            com.google.knowledge.b.j r2 = (com.google.knowledge.p4671b.C61817j) r2
            com.google.android.apps.gsa.assist.h r3 = r3.f167012l
            if (r3 != 0) goto L_0x006b
            com.google.android.apps.gsa.assist.h r3 = com.google.android.apps.gsa.assist.C9418h.f32714k
        L_0x006b:
            r3.getClass()
            int r4 = r3.f32716a
            r5 = 1
            r4 = r4 & r5
            r4 = r4 ^ r5
            if (r5 == r4) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            com.google.common.base.C58838bb.m90868c(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00ca }
            r0.<init>()     // Catch:{ IOException -> 0x00ca }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x00ca }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00ca }
            r3.writeTo(r4)     // Catch:{ IOException -> 0x00ca }
            r4.close()     // Catch:{ IOException -> 0x00ca }
            com.google.android.apps.gsa.assist.h r3 = com.google.android.apps.gsa.assist.C9418h.f32714k     // Catch:{ IOException -> 0x00ca }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x00ca }
            com.google.android.apps.gsa.assist.g r3 = (com.google.android.apps.gsa.assist.C9417g) r3     // Catch:{ IOException -> 0x00ca }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x00ca }
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)     // Catch:{ IOException -> 0x00ca }
            r3.copyOnWrite()     // Catch:{ IOException -> 0x00ca }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ IOException -> 0x00ca }
            com.google.android.apps.gsa.assist.h r4 = (com.google.android.apps.gsa.assist.C9418h) r4     // Catch:{ IOException -> 0x00ca }
            int r6 = r4.f32716a     // Catch:{ IOException -> 0x00ca }
            r5 = r5 | r6
            r4.f32716a = r5     // Catch:{ IOException -> 0x00ca }
            r4.f32718c = r0     // Catch:{ IOException -> 0x00ca }
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ IOException -> 0x00ca }
            com.google.android.apps.gsa.assist.h r0 = (com.google.android.apps.gsa.assist.C9418h) r0     // Catch:{ IOException -> 0x00ca }
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3
            r0.getClass()
            r3.f167012l = r0
            int r0 = r3.f167001a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r3.f167001a = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.knowledge.b.k r0 = (com.google.knowledge.p4671b.C61818k) r0
            r1.mo57356n(r0)
            goto L_0x00d6
        L_0x00ca:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00d1:
            com.google.common.util.concurrent.SettableFuture r0 = r7.f229479c
            r0.mo57356n(r3)
        L_0x00d6:
            dagger.a r0 = r7.f229481e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSIST_DATA_SENT_TO_S3
            com.google.android.apps.gsa.assist.a.f r2 = r7.f229478b
            com.google.android.apps.gsa.shared.logger.b.g r1 = com.google.android.apps.gsa.assist.p501a.C9324l.m23779a(r1, r2)
            r0.mo74236a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.producers.C84322u.run():void");
    }
}
