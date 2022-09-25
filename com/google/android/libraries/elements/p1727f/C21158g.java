package com.google.android.libraries.elements.p1727f;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protos.youtube.elements.p5166b.C66115t;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.elements.f.g */
/* compiled from: PG */
public final /* synthetic */ class C21158g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21159h f59344a;

    public /* synthetic */ C21158g(C21159h hVar) {
        this.f59344a = hVar;
    }

    public final void run() {
        byte[] bArr;
        C21159h hVar = this.f59344a;
        C66115t e = hVar.f59347c.mo26180e();
        if (e == null) {
            bArr = null;
        } else {
            bArr = e.toByteArray();
        }
        if (bArr != null && !Arrays.equals(bArr, hVar.f59346b)) {
            ((DebuggerClient) hVar.f59347c.f59351c.mo17428b()).traverseViewHierarchyResponse(bArr);
            hVar.f59346b = bArr;
        }
        if (hVar.f59345a.get()) {
            hVar.f59347c.f59349a.postDelayed(new C21158g(hVar), 1000);
        }
    }
}
