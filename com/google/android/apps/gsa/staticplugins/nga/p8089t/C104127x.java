package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.android.C80952h;
import com.google.android.apps.gsa.shared.p7129r.C90461c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.x */
/* compiled from: PG */
public final /* synthetic */ class C104127x implements C80952h {

    /* renamed from: a */
    public final /* synthetic */ C103901aa f289664a;

    /* renamed from: b */
    public final /* synthetic */ String f289665b;

    public /* synthetic */ C104127x(C103901aa aaVar, String str) {
        this.f289664a = aaVar;
        this.f289665b = str;
    }

    /* renamed from: a */
    public final void mo73592a(Object obj, Intent intent) {
        C103901aa aaVar = this.f289664a;
        String str = this.f289665b;
        C103901aa aaVar2 = (C103901aa) obj;
        aaVar.f289214a.unregisterReceiver(aaVar.f289216c);
        C90461c cVar = new C90461c();
        cVar.f252693e = "SplitInstallFinished";
        cVar.mo84200d("message", str);
        aaVar.f289215b.mo84210a(aaVar.f289214a).mo84209b(cVar, 1);
    }
}
