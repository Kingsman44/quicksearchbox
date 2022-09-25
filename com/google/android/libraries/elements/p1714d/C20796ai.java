package com.google.android.libraries.elements.p1714d;

import android.widget.Toast;
import com.facebook.litho.C6411u;

/* renamed from: com.google.android.libraries.elements.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C20796ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6411u f58222a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f58223b;

    public /* synthetic */ C20796ai(C6411u uVar, Throwable th) {
        this.f58222a = uVar;
        this.f58223b = th;
    }

    public final void run() {
        C6411u uVar = this.f58222a;
        Throwable th = this.f58223b;
        C20920dp dpVar = C20799al.f58231a;
        Toast.makeText(uVar.f19009b.getApplicationContext(), "Elements Error (check settings):\n".concat(String.valueOf(th.getMessage())), 1).show();
    }
}
