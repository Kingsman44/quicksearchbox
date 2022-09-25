package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gn */
/* compiled from: PG */
public final class C82474gn extends C82704pa {

    /* renamed from: a */
    private final String f225350a = "NGA_WARM_ACTIONS_TRIGGER_MEAN_AUDIO_LEVEL_SINCE_FINAL";

    /* renamed from: b */
    private final Double f225351b;

    /* renamed from: c */
    private final int f225352c;

    /* renamed from: d */
    private final String f225353d;

    public C82474gn(String str, Double d, int i, String str2) {
        this.f225351b = d;
        this.f225352c = i;
        this.f225353d = str2;
    }

    /* renamed from: b */
    public final int mo76382b() {
        return this.f225352c;
    }

    /* renamed from: c */
    public final Double mo76383c() {
        return this.f225351b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225350a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82704pa) {
            C82704pa paVar = (C82704pa) obj;
            return this.f225350a.equals(paVar.mo75583d()) && this.f225351b.equals(paVar.mo76383c()) && this.f225352c == paVar.mo76382b() && this.f225353d.equals(paVar.mo76385f());
        }
    }

    /* renamed from: f */
    public final String mo76385f() {
        return this.f225353d;
    }

    public final int hashCode() {
        return ((((((this.f225350a.hashCode() ^ 1000003) * 1000003) ^ this.f225351b.hashCode()) * 1000003) ^ this.f225352c) * 1000003) ^ this.f225353d.hashCode();
    }

    public final String toString() {
        String str = this.f225350a;
        Double d = this.f225351b;
        int i = this.f225352c;
        String str2 = this.f225353d;
        return "NgaWarmActionsTriggerMeanAudioLevelSinceFinalEvent{token=" + str + ", value=" + d + ", contextType=" + i + ", command=" + str2 + "}";
    }
}
