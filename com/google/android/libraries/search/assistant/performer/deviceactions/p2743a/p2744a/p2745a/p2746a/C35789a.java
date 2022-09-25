package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a.p2746a;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.a.a */
/* compiled from: PG */
final class C35789a extends C35793e {

    /* renamed from: a */
    private final String f93761a;

    /* renamed from: b */
    private final Boolean f93762b;

    /* renamed from: c */
    private final Integer f93763c;

    public C35789a(String str, Boolean bool, Integer num) {
        if (str != null) {
            this.f93761a = str;
            this.f93762b = bool;
            this.f93763c = num;
            return;
        }
        throw new NullPointerException("Null cameraId");
    }

    /* renamed from: a */
    public final Boolean mo39839a() {
        return this.f93762b;
    }

    /* renamed from: b */
    public final Integer mo39840b() {
        return this.f93763c;
    }

    /* renamed from: c */
    public final String mo39841c() {
        return this.f93761a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35793e) {
            C35793e eVar = (C35793e) obj;
            return this.f93761a.equals(eVar.mo39841c()) && this.f93762b.equals(eVar.mo39839a()) && this.f93763c.equals(eVar.mo39840b());
        }
    }

    public final int hashCode() {
        return ((((this.f93761a.hashCode() ^ 1000003) * 1000003) ^ this.f93762b.hashCode()) * 1000003) ^ this.f93763c.hashCode();
    }

    public final String toString() {
        String str = this.f93761a;
        Boolean bool = this.f93762b;
        Integer num = this.f93763c;
        return "CameraDevice{cameraId=" + str + ", isFlashSupported=" + bool + ", lensFacing=" + num + "}";
    }
}
