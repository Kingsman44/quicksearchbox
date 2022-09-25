package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import androidx.p186q.p187a.C4057l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.h */
/* compiled from: PG */
final class C114488h implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f317453a;

    /* renamed from: b */
    final /* synthetic */ C114491k f317454b;

    public C114488h(C114491k kVar, String str) {
        this.f317454b = kVar;
        this.f317453a = str;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        C4057l d = this.f317454b.f317463c.mo8212d();
        String str = this.f317453a;
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f317454b.f317461a.mo8181p();
        try {
            d.mo8256a();
            this.f317454b.f317461a.mo8188w();
            this.f317454b.f317461a.mo8183r();
            this.f317454b.f317463c.mo8215g(d);
            return null;
        } catch (Throwable th) {
            this.f317454b.f317461a.mo8183r();
            this.f317454b.f317463c.mo8215g(d);
            throw th;
        }
    }
}
