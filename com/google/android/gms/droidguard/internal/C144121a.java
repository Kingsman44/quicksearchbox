package com.google.android.gms.droidguard.internal;

import com.google.android.gms.droidguard.C144112b;
import com.google.android.gms.droidguard.p10791b.C144113a;

/* renamed from: com.google.android.gms.droidguard.internal.a */
/* compiled from: PG */
public abstract class C144121a extends C144133m {

    /* renamed from: a */
    public final C144113a f390404a = new C144113a();

    public C144121a() {
        super("hallmonitor");
    }

    /* renamed from: a */
    public abstract Object mo119672a(String str, Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo119673b(C144112b bVar) {
        try {
            this.f390404a.mo119662b(bVar);
        } catch (RuntimeException e) {
            this.f390404a.mo119662b(mo119672a("deliverHandle", e));
        }
    }
}
