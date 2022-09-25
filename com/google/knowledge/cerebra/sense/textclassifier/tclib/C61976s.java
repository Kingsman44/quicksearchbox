package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.s */
/* compiled from: PG */
public final class C61976s extends C61954dj {

    /* renamed from: a */
    private final CharSequence f167497a;

    public C61976s(CharSequence charSequence) {
        if (charSequence != null) {
            this.f167497a = charSequence;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final CharSequence mo58416a() {
        return this.f167497a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61954dj) {
            return this.f167497a.equals(((C61954dj) obj).mo58416a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f167497a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f167497a.toString();
        return "Request{text=" + obj + "}";
    }
}
