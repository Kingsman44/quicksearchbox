package com.google.android.libraries.elements.p1727f;

import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protos.youtube.elements.p5166b.C66115t;

/* renamed from: com.google.android.libraries.elements.f.c */
/* compiled from: PG */
public final /* synthetic */ class C21154c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21160i f59339a;

    public /* synthetic */ C21154c(C21160i iVar) {
        this.f59339a = iVar;
    }

    public final void run() {
        C21160i iVar = this.f59339a;
        C66115t e = iVar.mo26180e();
        if (e != null) {
            ((DebuggerClient) iVar.f59351c.mo17428b()).traverseViewHierarchyResponse(e.toByteArray());
        }
    }
}
