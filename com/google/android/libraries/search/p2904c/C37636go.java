package com.google.android.libraries.search.p2904c;

/* renamed from: com.google.android.libraries.search.c.go */
/* compiled from: PG */
public final class C37636go extends C37405bj {

    /* renamed from: a */
    public final C37402bg f100002a;

    /* renamed from: b */
    private final C37404bi f100003b;

    public C37636go(C37404bi biVar, C37402bg bgVar) {
        if (biVar != null) {
            this.f100003b = biVar;
            if (bgVar != null) {
                this.f100002a = bgVar;
                return;
            }
            throw new NullPointerException("Null audioRequestListeningSession");
        }
        throw new NullPointerException("Null audioRequestClient");
    }

    /* renamed from: a */
    public final C37402bg mo40940a() {
        return this.f100002a;
    }

    /* renamed from: b */
    public final C37404bi mo40941b() {
        return this.f100003b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37405bj) {
            C37405bj bjVar = (C37405bj) obj;
            return this.f100003b.equals(bjVar.mo40941b()) && this.f100002a.equals(bjVar.mo40940a());
        }
    }

    public final int hashCode() {
        return ((this.f100003b.hashCode() ^ 1000003) * 1000003) ^ this.f100002a.hashCode();
    }

    public final String toString() {
        String obj = this.f100003b.toString();
        String obj2 = this.f100002a.toString();
        return "AudioRequestClientListeningData{audioRequestClient=" + obj + ", audioRequestListeningSession=" + obj2 + "}";
    }
}
