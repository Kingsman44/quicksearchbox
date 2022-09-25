package com.google.android.libraries.assistant.contexttrigger.p1457c.p1458a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.a.f */
/* compiled from: PG */
final class C17634f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f50751a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f50752b;

    /* renamed from: c */
    final /* synthetic */ Function f50753c;

    public C17634f(String str, C70862aj ajVar, Function function) {
        this.f50751a = str;
        this.f50752b = ajVar;
        this.f50753c = function;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C17635g.f50754a.mo56226d()).mo56382g(th)).mo56372aa(46939)).mo56389s("%s failed.", this.f50751a);
        this.f50752b.mo20122b(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        ((C59052c) ((C59052c) C17635g.f50754a.mo56224b()).mo56372aa(46940)).mo56389s("%s successful.", this.f50751a);
        this.f50752b.mo20123c(this.f50753c.apply(obj));
        this.f50752b.mo20121a();
    }
}
