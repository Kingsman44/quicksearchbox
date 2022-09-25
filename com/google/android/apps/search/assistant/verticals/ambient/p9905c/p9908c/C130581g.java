package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c;

import android.view.contentcapture.DataShareWriteAdapter;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c.g */
/* compiled from: PG */
final class C130581g implements DataShareWriteAdapter {

    /* renamed from: a */
    final /* synthetic */ MessageLite f357659a;

    /* renamed from: b */
    final /* synthetic */ String f357660b;

    /* renamed from: c */
    final /* synthetic */ Consumer f357661c;

    /* renamed from: d */
    final /* synthetic */ C2164c f357662d;

    /* renamed from: e */
    final /* synthetic */ C130582h f357663e;

    public C130581g(C130582h hVar, MessageLite messageLite, String str, Consumer consumer, C2164c cVar) {
        this.f357663e = hVar;
        this.f357659a = messageLite;
        this.f357660b = str;
        this.f357661c = consumer;
        this.f357662d = cVar;
    }

    public final void onError(int i) {
        ((C58970a) ((C58970a) this.f357663e.f357664a.mo56225c()).mo56372aa(38921)).mo56395y("Data share request error: %d, locusId: %s", i, this.f357660b);
        if (i == 1) {
            this.f357661c.accept(C131177b.DATA_SHARE_ERROR_UNKNOWN);
        } else if (i == 2) {
            this.f357661c.accept(C131177b.DATA_SHARE_ERROR_CONCURRENT_REQUEST);
        } else if (i != 3) {
            this.f357661c.accept(C131177b.SHARE_REQUEST_ERROR);
        } else {
            this.f357661c.accept(C131177b.DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED);
        }
        C2164c cVar = this.f357662d;
        cVar.mo5439d(new RuntimeException("Data share error: " + i));
    }

    public final void onRejected() {
        ((C58970a) ((C58970a) this.f357663e.f357664a.mo56225c()).mo56372aa(38922)).mo56389s("Data share request rejected, locusId: %s.", this.f357660b);
        this.f357661c.accept(C131177b.SHARE_REQUEST_REJECTED);
        this.f357662d.mo5439d(new RuntimeException("Data share rejected."));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWrite(android.os.ParcelFileDescriptor r8) {
        /*
            r7 = this;
            r0 = 0
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r1 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ IOException -> 0x0083, RuntimeException -> 0x0055 }
            r1.<init>(r8)     // Catch:{ IOException -> 0x0083, RuntimeException -> 0x0055 }
            com.google.protobuf.MessageLite r8 = r7.f357659a     // Catch:{ all -> 0x0035 }
            r8.writeTo((java.io.OutputStream) r1)     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.verticals.ambient.c.c.h r8 = r7.f357663e     // Catch:{ all -> 0x0035 }
            com.google.common.f.a.d r8 = r8.f357664a     // Catch:{ all -> 0x0035 }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x0035 }
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8     // Catch:{ all -> 0x0035 }
            r2 = 38923(0x980b, float:5.4543E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r2)     // Catch:{ all -> 0x0035 }
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "Update sent successfully. locusId: %s"
            java.lang.String r3 = r7.f357660b     // Catch:{ all -> 0x0035 }
            r8.mo56389s(r2, r3)     // Catch:{ all -> 0x0035 }
            j$.util.function.Consumer r8 = r7.f357661c     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.verticals.ambient.q.a.b r2 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b.SUCCESS     // Catch:{ all -> 0x0035 }
            r8.accept(r2)     // Catch:{ all -> 0x0035 }
            r1.close()     // Catch:{ IOException -> 0x0083, RuntimeException -> 0x0055 }
            androidx.d.a.c r8 = r7.f357662d
        L_0x0031:
            r8.mo5437b(r0)
            return
        L_0x0035:
            r8 = move-exception
            r1.close()     // Catch:{ all -> 0x003a }
            goto L_0x0052
        L_0x003a:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0052 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0052 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0052 }
            r2[r5] = r1     // Catch:{ Exception -> 0x0052 }
            r3.invoke(r8, r2)     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            throw r8     // Catch:{ IOException -> 0x0083, RuntimeException -> 0x0055 }
        L_0x0053:
            r8 = move-exception
            goto L_0x00b1
        L_0x0055:
            r8 = move-exception
            com.google.android.apps.search.assistant.verticals.ambient.c.c.h r1 = r7.f357663e     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.d r1 = r1.f357664a     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r1 = r1.mo56382g(r8)     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0053 }
            r2 = 38926(0x980e, float:5.4547E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Sending failed with RuntimeException"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0053 }
            j$.util.function.Consumer r1 = r7.f357661c     // Catch:{ all -> 0x0053 }
            com.google.android.apps.search.assistant.verticals.ambient.q.a.b r2 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b.UNKNOWN_EXCEPTION_ON_WRITE     // Catch:{ all -> 0x0053 }
            r1.accept(r2)     // Catch:{ all -> 0x0053 }
            androidx.d.a.c r1 = r7.f357662d     // Catch:{ all -> 0x0053 }
            r1.mo5439d(r8)     // Catch:{ all -> 0x0053 }
            androidx.d.a.c r8 = r7.f357662d
            goto L_0x0031
        L_0x0083:
            r8 = move-exception
            com.google.android.apps.search.assistant.verticals.ambient.c.c.h r1 = r7.f357663e     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.d r1 = r1.f357664a     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r1 = r1.mo56382g(r8)     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0053 }
            r2 = 38925(0x980d, float:5.4546E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0053 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Sending failed with IOException"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0053 }
            j$.util.function.Consumer r1 = r7.f357661c     // Catch:{ all -> 0x0053 }
            com.google.android.apps.search.assistant.verticals.ambient.q.a.b r2 = com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b.IO_EXCEPTION_ON_WRITE     // Catch:{ all -> 0x0053 }
            r1.accept(r2)     // Catch:{ all -> 0x0053 }
            androidx.d.a.c r1 = r7.f357662d     // Catch:{ all -> 0x0053 }
            r1.mo5439d(r8)     // Catch:{ all -> 0x0053 }
            androidx.d.a.c r8 = r7.f357662d
            goto L_0x0031
        L_0x00b1:
            androidx.d.a.c r1 = r7.f357662d
            r1.mo5437b(r0)
            goto L_0x00b8
        L_0x00b7:
            throw r8
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c.C130581g.onWrite(android.os.ParcelFileDescriptor):void");
    }
}
