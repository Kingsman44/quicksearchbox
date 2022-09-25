package com.google.android.gms.phenotype;

import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10778a.C143698a;
import com.google.android.gms.phenotype.p10859a.C145716p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.phenotype.ae */
/* compiled from: PG */
public class C145721ae {

    /* renamed from: a */
    protected final C145748z f394048a;

    /* renamed from: b */
    protected final String f394049b;

    public C145721ae(C145748z zVar, String str) {
        this.f394048a = zVar;
        this.f394049b = str;
        if (C145716p.f394036a == -1) {
            synchronized (C143698a.f389595a) {
            }
        }
        Math.max(C145716p.f394036a, 2000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo121882a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo121883b(String str, Executor executor, C145720ad adVar) {
        C143919bh.m233958a(str);
        mo121884c(str, executor, adVar, 3);
    }

    /* renamed from: c */
    public final void mo121884c(String str, Executor executor, C145720ad adVar, int i) {
        this.f394048a.mo121903c(this.f394049b, str, mo121882a()).mo122493l(executor, new C145718ab(this, adVar, executor, i, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo121885d(Configurations configurations) {
        throw null;
    }
}
