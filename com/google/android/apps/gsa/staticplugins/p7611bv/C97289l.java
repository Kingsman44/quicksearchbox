package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.l */
/* compiled from: PG */
final class C97289l implements Callable {

    /* renamed from: a */
    final /* synthetic */ C97290m f271705a;

    /* renamed from: b */
    private final Callable f271706b;

    public C97289l(C97290m mVar, Callable callable) {
        this.f271705a = mVar;
        this.f271706b = callable;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (!this.f271705a.f271710d.mo79746e(C89995ba.f246770r)) {
            return ((C97285h) this.f271706b).call();
        }
        return C60922j.m93045h(((C97285h) this.f271706b).call(), new C97288k(this), C60826bg.f164896a);
    }
}
