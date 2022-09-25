package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.b */
/* compiled from: PG */
final class C19398b extends C19408l {

    /* renamed from: a */
    private final String f54271a;

    /* renamed from: b */
    private final String f54272b;

    /* renamed from: c */
    private final int f54273c;

    public C19398b(String str, String str2, int i) {
        this.f54271a = str;
        this.f54272b = str2;
        this.f54273c = i;
    }

    /* renamed from: a */
    public final int mo24547a() {
        return this.f54273c;
    }

    /* renamed from: b */
    public final String mo24548b() {
        return this.f54271a;
    }

    /* renamed from: c */
    public final String mo24549c() {
        return this.f54272b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19408l) {
            C19408l lVar = (C19408l) obj;
            return this.f54271a.equals(lVar.mo24548b()) && this.f54272b.equals(lVar.mo24549c()) && this.f54273c == lVar.mo24547a();
        }
    }

    public final int hashCode() {
        return ((((this.f54271a.hashCode() ^ 1000003) * 1000003) ^ this.f54272b.hashCode()) * 1000003) ^ this.f54273c;
    }

    public final String toString() {
        String str = this.f54271a;
        String str2 = this.f54272b;
        int i = this.f54273c;
        return "FedoraFlTrainerOptions{population=" + str + ", sessionName=" + str2 + ", sessionJobId=" + i + "}";
    }
}
