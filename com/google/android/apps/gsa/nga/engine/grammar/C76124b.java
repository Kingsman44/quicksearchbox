package com.google.android.apps.gsa.nga.engine.grammar;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.b */
/* compiled from: PG */
public final class C76124b extends C76129g {

    /* renamed from: a */
    private final C76129g f211067a;

    /* renamed from: b */
    private final C76129g f211068b;

    public C76124b(C76129g gVar, C76129g gVar2) {
        this.f211067a = gVar;
        this.f211068b = gVar2;
    }

    /* renamed from: a */
    public final String mo72075a(C76143u uVar) {
        String a = this.f211067a.mo72075a(uVar);
        if (a.isEmpty()) {
            return a;
        }
        return this.f211068b.mo72075a(uVar);
    }

    public final String toString() {
        String obj = this.f211067a.toString();
        String obj2 = this.f211068b.toString();
        return "And(" + obj + "," + obj2 + ")";
    }
}
