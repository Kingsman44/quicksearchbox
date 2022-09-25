package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.e */
/* compiled from: PG */
final class C97282e implements C118549h {

    /* renamed from: a */
    final /* synthetic */ C97290m f271695a;

    /* renamed from: b */
    private final Callable f271696b;

    public C97282e(C97290m mVar, Callable callable) {
        this.f271695a = mVar;
        this.f271696b = callable;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        try {
            if (this.f271695a.f271710d.mo79746e(C89995ba.f246764l)) {
                return (C60870cx) this.f271696b.call();
            }
            return this.f271695a.f271711e.mo28205e(C90877ak.m148471e((C60870cx) this.f271696b.call(), 50, TimeUnit.SECONDS, this.f271695a.f271711e), "MDH background task timeout", TimeoutException.class, C97281d.f271694a);
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }
}
