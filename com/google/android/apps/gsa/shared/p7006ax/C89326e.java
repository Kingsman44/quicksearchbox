package com.google.android.apps.gsa.shared.p7006ax;

import com.google.assistant.p3861at.C49875cf;

/* renamed from: com.google.android.apps.gsa.shared.ax.e */
/* compiled from: PG */
final class C89326e extends C89328g {

    /* renamed from: b */
    private final String f242180b;

    /* renamed from: c */
    private final String f242181c;

    /* renamed from: d */
    private final String f242182d;

    /* renamed from: e */
    private final String f242183e;

    /* renamed from: f */
    private final String f242184f;

    /* renamed from: g */
    private final boolean f242185g;

    /* renamed from: h */
    private final String f242186h;

    /* renamed from: i */
    private final int f242187i;

    /* renamed from: j */
    private final C49875cf f242188j;

    public C89326e(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, C49875cf cfVar) {
        this.f242180b = str;
        this.f242181c = str2;
        this.f242182d = str3;
        this.f242183e = str4;
        this.f242184f = str5;
        this.f242185g = z;
        this.f242186h = str6;
        this.f242187i = i;
        this.f242188j = cfVar;
    }

    /* renamed from: a */
    public final int mo83263a() {
        return this.f242187i;
    }

    /* renamed from: b */
    public final C49875cf mo83264b() {
        return this.f242188j;
    }

    /* renamed from: c */
    public final String mo83265c() {
        return this.f242184f;
    }

    /* renamed from: d */
    public final String mo83266d() {
        return this.f242182d;
    }

    /* renamed from: e */
    public final String mo83267e() {
        return this.f242183e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89328g) {
            C89328g gVar = (C89328g) obj;
            return this.f242180b.equals(gVar.mo83270g()) && this.f242181c.equals(gVar.mo83269f()) && this.f242182d.equals(gVar.mo83266d()) && this.f242183e.equals(gVar.mo83267e()) && this.f242184f.equals(gVar.mo83265c()) && this.f242185g == gVar.mo83273i() && this.f242186h.equals(gVar.mo83271h()) && this.f242187i == gVar.mo83263a() && this.f242188j.equals(gVar.mo83264b());
        }
    }

    /* renamed from: f */
    public final String mo83269f() {
        return this.f242181c;
    }

    /* renamed from: g */
    public final String mo83270g() {
        return this.f242180b;
    }

    /* renamed from: h */
    public final String mo83271h() {
        return this.f242186h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f242180b.hashCode() ^ 1000003) * 1000003) ^ this.f242181c.hashCode()) * 1000003) ^ this.f242182d.hashCode()) * 1000003) ^ this.f242183e.hashCode()) * 1000003) ^ this.f242184f.hashCode()) * 1000003) ^ (true != this.f242185g ? 1237 : 1231)) * 1000003) ^ this.f242186h.hashCode()) * 1000003) ^ this.f242187i) * 1000003) ^ this.f242188j.hashCode();
    }

    /* renamed from: i */
    public final boolean mo83273i() {
        return this.f242185g;
    }

    public final String toString() {
        String str = this.f242180b;
        String str2 = this.f242181c;
        String str3 = this.f242182d;
        String str4 = this.f242183e;
        String str5 = this.f242184f;
        boolean z = this.f242185g;
        String str6 = this.f242186h;
        int i = this.f242187i;
        String num = Integer.toString(this.f242188j.f129621v);
        return "StandaloneLibAssistantDevice{libassistantId=" + str + ", deviceName=" + str2 + ", clientId=" + str3 + ", deviceModelId=" + str4 + ", certificate=" + str5 + ", voiceMatchSupported=" + z + ", locale=" + str6 + ", numSignedInUsers=" + i + ", assistantDeviceType=" + num + "}";
    }
}
