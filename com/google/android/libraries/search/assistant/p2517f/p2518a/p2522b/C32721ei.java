package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71643cp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ei */
/* compiled from: PG */
public final class C32721ei implements C32682cx {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f87700a = C59071e.m91331h();

    /* renamed from: b */
    public final C71604be f87701b;

    /* renamed from: c */
    public final AtomicInteger f87702c = new AtomicInteger(1);

    /* renamed from: d */
    private final C71643cp f87703d;

    public C32721ei(List list, C71604be beVar, C71643cp cpVar) {
        this.f87701b = beVar;
        this.f87703d = cpVar;
        mo38269e(list, cpVar);
    }

    /* renamed from: a */
    public final Object mo38242a() {
        return this.f87701b.mo62826f();
    }

    /* renamed from: b */
    public final String mo38243b() {
        return C32692dg.m60596b(this.f87701b);
    }

    /* renamed from: c */
    public final void mo38244c() {
        this.f87701b.mo62723u((CancellationException) null);
    }

    /* renamed from: d */
    public final boolean mo38245d() {
        return this.f87701b.mo62868mk();
    }

    /* renamed from: e */
    public final void mo38269e(List list, C71643cp cpVar) {
        this.f87701b.mo62873s(new C32719eg(cpVar.mo62873s(new C32720eh(this, list))));
    }

    /* renamed from: f */
    public final boolean mo38270f(C71643cp cpVar) {
        C69664n.m101061g(cpVar, "owner");
        return cpVar == this.f87703d;
    }
}
