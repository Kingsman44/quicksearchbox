package com.google.android.apps.gsa.smartspace.p7258b;

import android.view.contentcapture.DataShareWriteAdapter;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.smartspace.b.l */
/* compiled from: PG */
final class C92069l implements DataShareWriteAdapter {

    /* renamed from: a */
    final /* synthetic */ MessageLite f256679a;

    /* renamed from: b */
    final /* synthetic */ String f256680b;

    /* renamed from: c */
    final /* synthetic */ Consumer f256681c;

    /* renamed from: d */
    final /* synthetic */ C2164c f256682d;

    /* renamed from: e */
    final /* synthetic */ C92070m f256683e;

    public C92069l(C92070m mVar, MessageLite messageLite, String str, Consumer consumer, C2164c cVar) {
        this.f256683e = mVar;
        this.f256679a = messageLite;
        this.f256680b = str;
        this.f256681c = consumer;
        this.f256682d = cVar;
    }

    public final void onError(int i) {
        ((C58970a) ((C58970a) this.f256683e.f256684a.mo56225c()).mo56372aa(11988)).mo56387q("data share request error: %d", i);
        if (i == 1) {
            this.f256681c.accept(C131177b.DATA_SHARE_ERROR_UNKNOWN);
        } else if (i == 2) {
            this.f256681c.accept(C131177b.DATA_SHARE_ERROR_CONCURRENT_REQUEST);
        } else if (i != 3) {
            this.f256681c.accept(C131177b.SHARE_REQUEST_ERROR);
        } else {
            this.f256681c.accept(C131177b.DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED);
        }
        C2164c cVar = this.f256682d;
        cVar.mo5439d(new RuntimeException("Data share error: " + i));
    }

    public final void onRejected() {
        ((C58970a) ((C58970a) this.f256683e.f256684a.mo56225c()).mo56372aa(11989)).mo56386p("data share request get rejected");
        this.f256681c.accept(C131177b.SHARE_REQUEST_REJECTED);
        this.f256682d.mo5439d(new RuntimeException("Data share rejected."));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r6.f256683e.f256689f.mo77082f() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r6.f256683e.f256689f.mo77079c();
        r6.f256683e.f256690g.mo86683d((com.google.assistant.p3886c.C50818do) r7.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d9, code lost:
        if (r6.f256683e.f256689f.mo77082f() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        if (r6.f256683e.f256689f.mo77082f() != false) goto L_0x005e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0097 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWrite(android.os.ParcelFileDescriptor r7) {
        /*
            r6 = this;
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ IOException -> 0x00dc, Exception -> 0x009b }
            r0.<init>(r7)     // Catch:{ IOException -> 0x00dc, Exception -> 0x009b }
            com.google.protobuf.MessageLite r7 = r6.f256679a     // Catch:{ all -> 0x007a }
            r7.writeTo((java.io.OutputStream) r0)     // Catch:{ all -> 0x007a }
            com.google.android.apps.gsa.smartspace.b.m r7 = r6.f256683e     // Catch:{ all -> 0x007a }
            com.google.common.f.a.d r7 = r7.f256684a     // Catch:{ all -> 0x007a }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x007a }
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7     // Catch:{ all -> 0x007a }
            r1 = 11991(0x2ed7, float:1.6803E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x007a }
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "Sending successful with locus ID %s"
            java.lang.String r2 = r6.f256680b     // Catch:{ all -> 0x007a }
            r7.mo56389s(r1, r2)     // Catch:{ all -> 0x007a }
            com.google.protobuf.MessageLite r7 = r6.f256679a     // Catch:{ all -> 0x007a }
            boolean r1 = r7 instanceof com.google.assistant.p3886c.C50819dp     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0030
            com.google.android.apps.gsa.smartspace.b.m r1 = r6.f256683e     // Catch:{ all -> 0x007a }
            com.google.assistant.c.dp r7 = (com.google.assistant.p3886c.C50819dp) r7     // Catch:{ all -> 0x007a }
            r1.mo86734g(r7)     // Catch:{ all -> 0x007a }
        L_0x0030:
            com.google.protobuf.MessageLite r7 = r6.f256679a     // Catch:{ all -> 0x007a }
            j$.util.Optional r7 = com.google.android.apps.gsa.smartspace.p7258b.C92070m.m151109e(r7)     // Catch:{ all -> 0x007a }
            com.google.android.apps.gsa.smartspace.b.k r1 = new com.google.android.apps.gsa.smartspace.b.k     // Catch:{ all -> 0x007a }
            r1.<init>(r6)     // Catch:{ all -> 0x007a }
            r7.ifPresent(r1)     // Catch:{ all -> 0x007a }
            j$.util.function.Consumer r7 = r6.f256681c     // Catch:{ all -> 0x007a }
            com.google.android.apps.search.assistant.verticals.ambient.q.a.b r1 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b.SUCCESS     // Catch:{ all -> 0x007a }
            r7.accept(r1)     // Catch:{ all -> 0x007a }
            r0.close()     // Catch:{ IOException -> 0x00dc, Exception -> 0x009b }
            com.google.protobuf.MessageLite r7 = r6.f256679a
            j$.util.Optional r7 = com.google.android.apps.gsa.smartspace.p7258b.C92070m.m151109e(r7)
            boolean r0 = r7.isPresent()
            if (r0 == 0) goto L_0x0072
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e
            com.google.android.apps.gsa.opa.smartspace.c.g r0 = r0.f256689f
            boolean r0 = r0.mo77082f()
            if (r0 == 0) goto L_0x0072
        L_0x005e:
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e
            com.google.android.apps.gsa.opa.smartspace.c.g r0 = r0.f256689f
            r0.mo77079c()
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e
            com.google.android.apps.gsa.smartspace.a.l r0 = r0.f256690g
            java.lang.Object r7 = r7.get()
            com.google.assistant.c.do r7 = (com.google.assistant.p3886c.C50818do) r7
            r0.mo86683d(r7)
        L_0x0072:
            androidx.d.a.c r7 = r6.f256682d
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            r7.mo5437b(r0)
            return
        L_0x007a:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x007f }
            goto L_0x0097
        L_0x007f:
            r0 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0097 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0097 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x0097 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0097 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0097 }
            r2.invoke(r7, r1)     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            throw r7     // Catch:{ IOException -> 0x00dc, Exception -> 0x009b }
        L_0x0098:
            r7 = move-exception
            goto L_0x011e
        L_0x009b:
            r7 = move-exception
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.d r0 = r0.f256684a     // Catch:{ all -> 0x0098 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0098 }
            com.google.common.f.x r0 = r0.mo56382g(r7)     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0098 }
            r1 = 11993(0x2ed9, float:1.6806E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "Sending failed"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0098 }
            j$.util.function.Consumer r0 = r6.f256681c     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.verticals.ambient.q.a.b r1 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b.UNKNOWN_EXCEPTION_ON_WRITE     // Catch:{ all -> 0x0098 }
            r0.accept(r1)     // Catch:{ all -> 0x0098 }
            androidx.d.a.c r0 = r6.f256682d     // Catch:{ all -> 0x0098 }
            r0.mo5439d(r7)     // Catch:{ all -> 0x0098 }
            com.google.protobuf.MessageLite r7 = r6.f256679a
            j$.util.Optional r7 = com.google.android.apps.gsa.smartspace.p7258b.C92070m.m151109e(r7)
            boolean r0 = r7.isPresent()
            if (r0 == 0) goto L_0x0072
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e
            com.google.android.apps.gsa.opa.smartspace.c.g r0 = r0.f256689f
            boolean r0 = r0.mo77082f()
            if (r0 == 0) goto L_0x0072
            goto L_0x005e
        L_0x00dc:
            r7 = move-exception
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.d r0 = r0.f256684a     // Catch:{ all -> 0x0098 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0098 }
            com.google.common.f.x r0 = r0.mo56382g(r7)     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0098 }
            r1 = 11992(0x2ed8, float:1.6804E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0098 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "Sending failed due to IO error"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0098 }
            j$.util.function.Consumer r0 = r6.f256681c     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.verticals.ambient.q.a.b r1 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b.IO_EXCEPTION_ON_WRITE     // Catch:{ all -> 0x0098 }
            r0.accept(r1)     // Catch:{ all -> 0x0098 }
            androidx.d.a.c r0 = r6.f256682d     // Catch:{ all -> 0x0098 }
            r0.mo5439d(r7)     // Catch:{ all -> 0x0098 }
            com.google.protobuf.MessageLite r7 = r6.f256679a
            j$.util.Optional r7 = com.google.android.apps.gsa.smartspace.p7258b.C92070m.m151109e(r7)
            boolean r0 = r7.isPresent()
            if (r0 == 0) goto L_0x0072
            com.google.android.apps.gsa.smartspace.b.m r0 = r6.f256683e
            com.google.android.apps.gsa.opa.smartspace.c.g r0 = r0.f256689f
            boolean r0 = r0.mo77082f()
            if (r0 == 0) goto L_0x0072
            goto L_0x005e
        L_0x011e:
            com.google.protobuf.MessageLite r0 = r6.f256679a
            j$.util.Optional r0 = com.google.android.apps.gsa.smartspace.p7258b.C92070m.m151109e(r0)
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0148
            com.google.android.apps.gsa.smartspace.b.m r1 = r6.f256683e
            com.google.android.apps.gsa.opa.smartspace.c.g r1 = r1.f256689f
            boolean r1 = r1.mo77082f()
            if (r1 == 0) goto L_0x0148
            com.google.android.apps.gsa.smartspace.b.m r1 = r6.f256683e
            com.google.android.apps.gsa.opa.smartspace.c.g r1 = r1.f256689f
            r1.mo77079c()
            com.google.android.apps.gsa.smartspace.b.m r1 = r6.f256683e
            com.google.android.apps.gsa.smartspace.a.l r1 = r1.f256690g
            java.lang.Object r0 = r0.get()
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            r1.mo86683d(r0)
        L_0x0148:
            androidx.d.a.c r0 = r6.f256682d
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            r0.mo5437b(r1)
            goto L_0x0151
        L_0x0150:
            throw r7
        L_0x0151:
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.smartspace.p7258b.C92069l.onWrite(android.os.ParcelFileDescriptor):void");
    }
}
