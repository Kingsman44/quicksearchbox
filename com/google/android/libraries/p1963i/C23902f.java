package com.google.android.libraries.p1963i;

import android.os.Binder;
import android.os.Build;
import com.google.android.libraries.p1963i.p1968d.C23896i;

/* renamed from: com.google.android.libraries.i.f */
/* compiled from: PG */
public final /* synthetic */ class C23902f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23896i f65382a;

    public /* synthetic */ C23902f(C23896i iVar) {
        this.f65382a = iVar;
    }

    public final void run() {
        C23896i iVar = this.f65382a;
        if (Build.VERSION.SDK_INT < 31) {
            Binder.flushPendingCommands();
        }
        iVar.mo29305a();
    }
}
