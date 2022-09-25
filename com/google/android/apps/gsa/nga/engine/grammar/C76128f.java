package com.google.android.apps.gsa.nga.engine.grammar;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.f */
/* compiled from: PG */
public final class C76128f extends C76129g {

    /* renamed from: a */
    private final C76129g f211073a;

    /* renamed from: b */
    private final C76129g f211074b;

    public C76128f(C76129g gVar, C76129g gVar2) {
        this.f211073a = gVar;
        this.f211074b = gVar2;
    }

    /* renamed from: a */
    public final String mo72075a(C76143u uVar) {
        String a = this.f211073a.mo72075a(uVar);
        if (!a.isEmpty()) {
            return a;
        }
        return this.f211074b.mo72075a(uVar);
    }

    public final String toString() {
        String obj = this.f211073a.toString();
        String obj2 = this.f211074b.toString();
        return "Or(" + obj + "," + obj2 + ")";
    }
}
