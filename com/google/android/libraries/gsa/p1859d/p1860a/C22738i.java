package com.google.android.libraries.gsa.p1859d.p1860a;

import android.util.Log;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.libraries.gsa.d.a.i */
/* compiled from: PG */
final class C22738i implements C22870f {

    /* renamed from: a */
    final /* synthetic */ C22739j f62562a;

    /* renamed from: b */
    final /* synthetic */ C22744o f62563b;

    public C22738i(C22744o oVar, C22739j jVar) {
        this.f62563b = oVar;
        this.f62562a = jVar;
    }

    public final void run() {
        C22744o oVar = this.f62563b;
        C22739j jVar = this.f62562a;
        synchronized (oVar.f62573a) {
            if (oVar.f62575c == jVar) {
                Log.w("PomoConnector", "Time is out after 10000 milliseconds.");
                Exception exc = new Exception("Time is out after 10000 milliseconds.");
                oVar.mo27891c();
                jVar.f62564d.mo57357o(exc);
                oVar.mo27892d();
            }
        }
    }
}
