package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.TreeMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.k */
/* compiled from: PG */
public final class C114491k implements C114484d {

    /* renamed from: a */
    public final C3925ah f317461a;

    /* renamed from: b */
    public final C3966s f317462b;

    /* renamed from: c */
    public final C3933ap f317463c;

    public C114491k(C3925ah ahVar) {
        this.f317461a = ahVar;
        this.f317462b = new C114485e(ahVar);
        this.f317463c = new C114486f(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo101347a() {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM opa_delayed_notification", 0);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f317461a, new C114490j(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo101348b(String str, long j) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM opa_delayed_notification WHERE groupingKey = ?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        C60870cx b = C3917e.m11217b(this.f317461a, new C114489i(this, a, cancellationSignal), a, cancellationSignal);
        return C47638k.m84751b(b).mo51520a(new C114483c(this, b, j, str), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo101349c(String str) {
        C3925ah ahVar = this.f317461a;
        C3917e.m11216a(ahVar.mo8172P(), new C114488h(this, str));
    }

    /* renamed from: d */
    public final void mo101350d(C114493m... mVarArr) {
        C3925ah ahVar = this.f317461a;
        C3917e.m11216a(ahVar.mo8172P(), new C114487g(this, mVarArr));
    }
}
