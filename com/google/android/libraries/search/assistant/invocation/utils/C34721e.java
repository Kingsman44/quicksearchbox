package com.google.android.libraries.search.assistant.invocation.utils;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.BiFunction;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.invocation.utils.e */
/* compiled from: PG */
final class C34721e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ BiFunction f92144a;

    /* renamed from: b */
    final /* synthetic */ C70148al f92145b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f92146c;

    /* renamed from: d */
    final /* synthetic */ String f92147d;

    public C34721e(BiFunction biFunction, C70148al alVar, C70862aj ajVar, String str) {
        this.f92144a = biFunction;
        this.f92145b = alVar;
        this.f92146c = ajVar;
        this.f92147d = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f92146c.mo20122b(C34722f.m63458a(th, this.f92147d));
        ((C59052c) ((C59052c) ((C59052c) C34722f.f92148a.mo56226d()).mo56382g(th)).mo56372aa(51425)).mo56389s("%s failed.", this.f92147d);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f92146c.mo20123c(this.f92144a.apply(this.f92145b, obj));
        this.f92146c.mo20121a();
        ((C59052c) ((C59052c) C34722f.f92148a.mo56224b()).mo56372aa(51426)).mo56389s("%s completed successfully.", this.f92147d);
    }
}
