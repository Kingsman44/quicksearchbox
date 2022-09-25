package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.l */
/* compiled from: PG */
final class C61969l extends C61948dd {

    /* renamed from: a */
    private final int f167464a;

    public C61969l(int i) {
        this.f167464a = i;
    }

    /* renamed from: a */
    public final int mo58392a() {
        return this.f167464a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C61948dd) && this.f167464a == ((C61948dd) obj).mo58392a();
    }

    public final int hashCode() {
        return this.f167464a ^ 1000003;
    }

    public final String toString() {
        int i = this.f167464a;
        return "Permissions{readContacts=" + i + "}";
    }
}
