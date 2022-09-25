package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.b */
/* compiled from: PG */
public final class C33448b extends C33450d {

    /* renamed from: a */
    private final C33458l f89551a;

    public C33448b(C33458l lVar) {
        this.f89551a = lVar;
    }

    /* renamed from: a */
    public final int mo38842a() {
        return 2;
    }

    /* renamed from: b */
    public final C33458l mo38851b() {
        return this.f89551a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C33461o) {
            C33461o oVar = (C33461o) obj;
            if (oVar.mo38842a() != 2 || !this.f89551a.equals(oVar.mo38851b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f89551a.hashCode();
    }

    public final String toString() {
        String obj = this.f89551a.toString();
        return "UtteranceResult{failure=" + obj + "}";
    }
}
