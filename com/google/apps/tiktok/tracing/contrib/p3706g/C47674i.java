package com.google.apps.tiktok.tracing.contrib.p3706g;

import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.tracing.contrib.g.i */
/* compiled from: PG */
public final class C47674i extends C30282k {

    /* renamed from: a */
    final /* synthetic */ C30282k f123625a;

    /* renamed from: b */
    final /* synthetic */ C47675j f123626b;

    public C47674i(C47675j jVar, C30282k kVar) {
        this.f123626b = jVar;
        this.f123625a = kVar;
    }

    /* renamed from: d */
    private final void m84807d(Runnable runnable, String str) {
        if (C47831fm.m85027v()) {
            C47558bi a = C47831fm.m85006a(str);
            try {
                runnable.run();
                a.close();
                return;
            } catch (Throwable th) {
                C47669d.m84806a(th, th);
            }
        } else {
            C47538ax c = this.f123626b.f123627a.mo51613c(str);
            try {
                runnable.run();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C47669d.m84806a(th, th2);
            }
        }
        throw th;
        throw th;
    }

    /* renamed from: a */
    public final void mo18104a() {
        Objects.requireNonNull(this.f123625a);
        m84807d(new C47670e(), "onModelLoaded");
    }

    /* renamed from: c */
    public final void mo18106c(Object obj) {
        m84807d(new C47672g(this.f123625a, obj), "onSelectedAccountChanged");
    }

    /* renamed from: e */
    public final void mo35797e() {
        m84807d(new C47673h(), "onAvailableAccountsSet(deprecated)");
    }

    /* renamed from: f */
    public final void mo35784f(C58485gu guVar) {
        m84807d(new C47671f(), "onAvailableAccountsSet");
    }
}
