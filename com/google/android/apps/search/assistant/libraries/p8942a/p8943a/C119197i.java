package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.content.LocusId;
import android.view.contentcapture.DataShareWriteAdapter;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.i */
/* compiled from: PG */
final class C119197i implements DataShareWriteAdapter {

    /* renamed from: a */
    final /* synthetic */ LocusId f332412a;

    /* renamed from: b */
    final /* synthetic */ MessageLite f332413b;

    /* renamed from: c */
    final /* synthetic */ C2164c f332414c;

    public C119197i(LocusId locusId, MessageLite messageLite, C2164c cVar) {
        this.f332412a = locusId;
        this.f332413b = messageLite;
        this.f332414c = cVar;
    }

    public final void onRejected() {
        ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34334)).mo56389s("#shareData request rejected: %s", this.f332412a.getId());
        this.f332414c.mo5437b(C119207d.FAILED_DATA_SHARE_REQUEST_REJECTED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWrite(android.os.ParcelFileDescriptor r7) {
        /*
            r6 = this;
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ IOException -> 0x0080, RuntimeException -> 0x0051 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0080, RuntimeException -> 0x0051 }
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.libraries.p8942a.p8943a.C119202n.f332431a     // Catch:{ all -> 0x0031 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x0031 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0031 }
            r1 = 34335(0x861f, float:4.8114E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r1)     // Catch:{ all -> 0x0031 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "#shareData onWrite success: %s"
            android.content.LocusId r2 = r6.f332412a     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.getId()     // Catch:{ all -> 0x0031 }
            r7.mo56389s(r1, r2)     // Catch:{ all -> 0x0031 }
            com.google.protobuf.MessageLite r7 = r6.f332413b     // Catch:{ all -> 0x0031 }
            r7.writeTo((java.io.OutputStream) r0)     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x0080, RuntimeException -> 0x0051 }
            androidx.d.a.c r7 = r6.f332414c
            com.google.android.apps.search.assistant.libraries.a.d r0 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.SUCCESS
        L_0x002d:
            r7.mo5437b(r0)
            return
        L_0x0031:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x0036 }
            goto L_0x004e
        L_0x0036:
            r0 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004e }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x004e }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x004e }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004e }
            r1[r4] = r0     // Catch:{ Exception -> 0x004e }
            r2.invoke(r7, r1)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            throw r7     // Catch:{ IOException -> 0x0080, RuntimeException -> 0x0051 }
        L_0x004f:
            r7 = move-exception
            goto L_0x00b0
        L_0x0051:
            r7 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.libraries.p8942a.p8943a.C119202n.f332431a     // Catch:{ all -> 0x004f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x004f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x004f }
            com.google.common.f.x r7 = r0.mo56382g(r7)     // Catch:{ all -> 0x004f }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x004f }
            r0 = 34337(0x8621, float:4.8116E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x004f }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "#shareData onWrite failed with unknown error: %s"
            android.content.LocusId r1 = r6.f332412a     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r1.getId()     // Catch:{ all -> 0x004f }
            r7.mo56389s(r0, r1)     // Catch:{ all -> 0x004f }
            androidx.d.a.c r7 = r6.f332414c     // Catch:{ all -> 0x004f }
            com.google.android.apps.search.assistant.libraries.a.d r0 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.FAILED_UNKNOWN_EXCEPTION_ON_WRITE     // Catch:{ all -> 0x004f }
            r7.mo5437b(r0)     // Catch:{ all -> 0x004f }
            androidx.d.a.c r7 = r6.f332414c
            com.google.android.apps.search.assistant.libraries.a.d r0 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.SUCCESS
            goto L_0x002d
        L_0x0080:
            r7 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.libraries.p8942a.p8943a.C119202n.f332431a     // Catch:{ all -> 0x004f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x004f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x004f }
            com.google.common.f.x r7 = r0.mo56382g(r7)     // Catch:{ all -> 0x004f }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x004f }
            r0 = 34336(0x8620, float:4.8115E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)     // Catch:{ all -> 0x004f }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "#shareData onWrite failed with IO error: %s"
            android.content.LocusId r1 = r6.f332412a     // Catch:{ all -> 0x004f }
            java.lang.String r1 = r1.getId()     // Catch:{ all -> 0x004f }
            r7.mo56389s(r0, r1)     // Catch:{ all -> 0x004f }
            androidx.d.a.c r7 = r6.f332414c     // Catch:{ all -> 0x004f }
            com.google.android.apps.search.assistant.libraries.a.d r0 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.FAILED_IO_EXCEPTION_ON_WRITE     // Catch:{ all -> 0x004f }
            r7.mo5437b(r0)     // Catch:{ all -> 0x004f }
            androidx.d.a.c r7 = r6.f332414c
            com.google.android.apps.search.assistant.libraries.a.d r0 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.SUCCESS
            goto L_0x002d
        L_0x00b0:
            androidx.d.a.c r0 = r6.f332414c
            com.google.android.apps.search.assistant.libraries.a.d r1 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.SUCCESS
            r0.mo5437b(r1)
            goto L_0x00b9
        L_0x00b8:
            throw r7
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8942a.p8943a.C119197i.onWrite(android.os.ParcelFileDescriptor):void");
    }

    public final void onError(int i) {
        if (i == 1) {
            ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34331)).mo56389s("#shareData onError with DATA_SHARE_ERROR_UNKNOWN: %s", this.f332412a.getId());
            this.f332414c.mo5437b(C119207d.FAILED_DATA_SHARE_ERROR_UNKNOWN);
        } else if (i == 2) {
            ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34332)).mo56389s("#shareData onError with DATA_SHARE_ERROR_CONCURRENT_REQUEST: %s", this.f332412a.getId());
            this.f332414c.mo5437b(C119207d.FAILED_DATA_SHARE_ERROR_CONCURRENT_REQUEST);
        } else if (i != 3) {
            ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34330)).mo56389s("#shareData onError with unknown error: %s", this.f332412a.getId());
            C2164c cVar = this.f332414c;
            cVar.mo5439d(new RuntimeException("Data share failed with unknown error code: " + i));
        } else {
            ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56372aa(34333)).mo56389s("#shareData onError with DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED: %s", this.f332412a.getId());
            this.f332414c.mo5437b(C119207d.FAILED_DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED);
        }
    }
}
