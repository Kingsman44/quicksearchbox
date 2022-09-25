package com.google.p4583d.p4584a;

import com.google.p4583d.p4584a.p4587c.C60970a;
import com.google.p4583d.p4584a.p4587c.C60972c;

/* renamed from: com.google.d.a.c */
/* compiled from: PG */
public final class C60969c {

    /* renamed from: a */
    public final C61010f f165085a;

    /* renamed from: b */
    public C61012g f165086b;

    /* renamed from: c */
    public final C60972c f165087c = new C60972c();

    /* renamed from: d */
    public final C60970a f165088d = new C60970a();

    public C60969c() {
        C61010f fVar = new C61010f();
        this.f165085a = fVar;
        this.f165086b = fVar.f165142b.mo57525a();
        fVar.f165144d.mo57450a("internal.registerCallback", new C60952a(this));
        fVar.f165144d.mo57450a("internal.eventLogger", new C60954b(this));
    }

    /* renamed from: a */
    public final boolean mo57453a() {
        return !this.f165087c.f165096c.isEmpty();
    }

    /* renamed from: b */
    public final boolean mo57454b() {
        C60972c cVar = this.f165087c;
        return !cVar.f165095b.equals(cVar.f165094a);
    }
}
