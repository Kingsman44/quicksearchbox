package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.g */
/* compiled from: PG */
final class C16163g extends C16106be {

    /* renamed from: a */
    private final String f47678a;

    /* renamed from: b */
    private final long f47679b;

    /* renamed from: c */
    private final int f47680c;

    public C16163g(String str, int i, long j) {
        this.f47678a = str;
        this.f47680c = i;
        this.f47679b = j;
    }

    /* renamed from: a */
    public final long mo22757a() {
        return this.f47679b;
    }

    /* renamed from: b */
    public final String mo22758b() {
        return this.f47678a;
    }

    /* renamed from: c */
    public final int mo22759c() {
        return this.f47680c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16106be) {
            C16106be beVar = (C16106be) obj;
            return this.f47678a.equals(beVar.mo22758b()) && this.f47680c == beVar.mo22759c() && this.f47679b == beVar.mo22757a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f47678a.hashCode();
        int i = this.f47680c;
        long j = this.f47679b;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f47678a;
        String str2 = this.f47680c != 1 ? "SMART_CHIP" : "HOME_SCREEN";
        long j = this.f47679b;
        return "PartnerAppSignal{signalValue=" + str + ", signalType=" + str2 + ", generationTimestamp=" + j + "}";
    }
}
