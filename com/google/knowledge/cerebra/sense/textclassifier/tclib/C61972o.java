package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.o */
/* compiled from: PG */
final class C61972o extends C61950df {
    /* renamed from: a */
    public final boolean mo58396a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo58397b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61950df) {
            C61950df dfVar = (C61950df) obj;
            return !dfVar.mo58396a() && !dfVar.mo58397b();
        }
    }

    public final int hashCode() {
        return 385622423;
    }

    public final String toString() {
        return "IntentGenerationOptions{addContactIntentEnabled=false, searchIntentEnabled=false}";
    }
}
