package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.c */
/* compiled from: PG */
public final class C33449c extends C33450d {

    /* renamed from: a */
    private final C33460n f89552a;

    public C33449c(C33460n nVar) {
        this.f89552a = nVar;
    }

    /* renamed from: a */
    public final int mo38842a() {
        return 1;
    }

    /* renamed from: c */
    public final C33460n mo38855c() {
        return this.f89552a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C33461o) {
            C33461o oVar = (C33461o) obj;
            if (oVar.mo38842a() != 1 || !this.f89552a.equals(oVar.mo38855c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f89552a.hashCode();
    }

    public final String toString() {
        String obj = this.f89552a.toString();
        return "UtteranceResult{success=" + obj + "}";
    }
}
