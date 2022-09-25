package com.google.android.libraries.storage.p3315b;

import android.os.CancellationSignal;

/* renamed from: com.google.android.libraries.storage.b.aj */
/* compiled from: PG */
public final class C42824aj extends C42826al implements CancellationSignal.OnCancelListener {

    /* renamed from: b */
    private final CancellationSignal f112105b = new CancellationSignal();

    public C42824aj(C42825ak akVar) {
        super(akVar);
    }

    public final boolean cancel(boolean z) {
        this.f112105b.cancel();
        return super.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45906e(com.google.android.libraries.storage.p3315b.C42825ak r3) {
        /*
            r2 = this;
            android.os.CancellationSignal r0 = r2.f112105b     // Catch:{ OperationCanceledException -> 0x003a }
            r0.setOnCancelListener(r2)     // Catch:{ OperationCanceledException -> 0x003a }
            android.os.CancellationSignal r0 = r2.f112105b     // Catch:{ OperationCanceledException -> 0x003a }
            android.database.Cursor r3 = r3.mo45908a(r0)     // Catch:{ OperationCanceledException -> 0x003a }
            java.lang.Object r0 = r2.value     // Catch:{ all -> 0x0020 }
            boolean r0 = r0 instanceof com.google.common.util.concurrent.C60873d.C60875b     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0016
            if (r3 == 0) goto L_0x0016
            r3.getCount()     // Catch:{ all -> 0x0020 }
        L_0x0016:
            boolean r0 = r2.mo57356n(r3)     // Catch:{ OperationCanceledException -> 0x003a }
            if (r0 != 0) goto L_0x002d
            com.google.android.libraries.p1623at.p1632e.C19554b.m37295a(r3)     // Catch:{ OperationCanceledException -> 0x003a }
            return
        L_0x0020:
            r0 = move-exception
            r2.mo57357o(r0)     // Catch:{ all -> 0x002e }
            boolean r0 = r2.mo57356n(r3)     // Catch:{ OperationCanceledException -> 0x003a }
            if (r0 != 0) goto L_0x002d
            com.google.android.libraries.p1623at.p1632e.C19554b.m37295a(r3)     // Catch:{ OperationCanceledException -> 0x003a }
        L_0x002d:
            return
        L_0x002e:
            r0 = move-exception
            boolean r1 = r2.mo57356n(r3)     // Catch:{ OperationCanceledException -> 0x003a }
            if (r1 == 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            com.google.android.libraries.p1623at.p1632e.C19554b.m37295a(r3)     // Catch:{ OperationCanceledException -> 0x003a }
        L_0x0039:
            throw r0     // Catch:{ OperationCanceledException -> 0x003a }
        L_0x003a:
            r3 = 1
            super.cancel(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3315b.C42824aj.mo45906e(com.google.android.libraries.storage.b.ak):void");
    }

    public final void onCancel() {
        super.cancel(true);
    }
}
