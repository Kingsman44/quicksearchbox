package com.google.android.libraries.onegoogle.accountmenu.cards;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.g */
/* compiled from: PG */
public final class C30439g extends C30354ai {

    /* renamed from: a */
    private final C30353ah f82239a;

    public C30439g(C30353ah ahVar) {
        if (ahVar != null) {
            this.f82239a = ahVar;
            return;
        }
        throw new NullPointerException("Null cardRetriever");
    }

    /* renamed from: a */
    public final C30353ah mo35931a() {
        return this.f82239a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30354ai) {
            return this.f82239a.equals(((C30354ai) obj).mo35931a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f82239a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f82239a.toString();
        return "CardRetrieverWrapper{cardRetriever=" + obj + "}";
    }
}
