package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.shared.aa.l */
/* compiled from: PG */
final class C89056l implements C60931s {
    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C89021as asVar = (C89021as) obj;
        if (asVar instanceof C89057m) {
            return C60856cj.m92900i((C89057m) asVar);
        }
        try {
            C89022at g = asVar.mo82999g();
            C89068x b = asVar.mo82997b();
            SettableFuture settableFuture = new SettableFuture();
            C60856cj.m92911t(b.mo27472b(), new C89054j(settableFuture, g, b), C60826bg.f164896a);
            settableFuture.mo4106b(new C89055k(settableFuture, b), C60826bg.f164896a);
            return settableFuture;
        } catch (C89013ak | C90457d e) {
            throw new RuntimeException("Unexpected exception", e);
        }
    }
}
