package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.i */
/* compiled from: PG */
public final class C114540i {

    /* renamed from: a */
    public final C42876ab f317634a;

    /* renamed from: b */
    public final Executor f317635b;

    public C114540i(C42876ab abVar, C90851k kVar) {
        this.f317634a = abVar;
        this.f317635b = kVar.mo85208a("GrowthPDSExecutor");
    }

    /* renamed from: a */
    public final C60870cx mo101391a(String str, Boolean bool) {
        return C60922j.m93044g(this.f317634a.mo46042d(), new C114539h(str, bool), this.f317635b);
    }

    /* renamed from: b */
    public final C60870cx mo101392b(String str, Integer num) {
        return C60922j.m93044g(this.f317634a.mo46042d(), new C114533b(str, num), this.f317635b);
    }

    /* renamed from: c */
    public final C60870cx mo101393c(String str, Boolean bool) {
        return this.f317634a.mo46040b(new C114537f(str, bool), this.f317635b);
    }

    /* renamed from: d */
    public final C60870cx mo101394d(String str, Integer num) {
        return this.f317634a.mo46040b(new C114534c(str, num), this.f317635b);
    }

    /* renamed from: e */
    public final C60870cx mo101395e() {
        return C60922j.m93044g(this.f317634a.mo46042d(), new C114536e(), this.f317635b);
    }
}
