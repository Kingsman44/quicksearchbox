package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.g */
/* compiled from: PG */
final class C114487g implements Callable {

    /* renamed from: a */
    final /* synthetic */ C114493m[] f317451a;

    /* renamed from: b */
    final /* synthetic */ C114491k f317452b;

    public C114487g(C114491k kVar, C114493m[] mVarArr) {
        this.f317452b = kVar;
        this.f317451a = mVarArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C3966s sVar;
        C4057l d;
        this.f317452b.f317461a.mo8181p();
        try {
            sVar = this.f317452b.f317462b;
            C114493m[] mVarArr = this.f317451a;
            d = sVar.mo8212d();
            for (int i = 0; i <= 0; i++) {
                sVar.mo8306a(d, mVarArr[i]);
                d.mo8257b();
            }
            sVar.mo8215g(d);
            this.f317452b.f317461a.mo8188w();
            this.f317452b.f317461a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f317452b.f317461a.mo8183r();
            throw th;
        }
    }
}
