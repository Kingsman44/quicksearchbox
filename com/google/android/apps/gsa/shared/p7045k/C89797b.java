package com.google.android.apps.gsa.shared.p7045k;

import com.google.assistant.p3861at.C49875cf;
import java.net.InetAddress;

/* renamed from: com.google.android.apps.gsa.shared.k.b */
/* compiled from: PG */
final class C89797b extends C89809e {

    /* renamed from: a */
    public final String f243059a;

    /* renamed from: b */
    public final InetAddress f243060b;

    /* renamed from: c */
    public final String f243061c;

    /* renamed from: d */
    public final String f243062d;

    /* renamed from: e */
    public final C49875cf f243063e;

    /* renamed from: f */
    public final boolean f243064f;

    /* renamed from: g */
    public final boolean f243065g;

    /* renamed from: h */
    public final boolean f243066h;

    /* renamed from: i */
    public final int f243067i;

    /* renamed from: j */
    public final int f243068j;

    public C89797b(String str, InetAddress inetAddress, String str2, String str3, int i, C49875cf cfVar, boolean z, boolean z2, boolean z3, int i2) {
        this.f243059a = str;
        this.f243060b = inetAddress;
        this.f243061c = str2;
        this.f243062d = str3;
        this.f243068j = i;
        this.f243063e = cfVar;
        this.f243064f = z;
        this.f243065g = z2;
        this.f243066h = z3;
        this.f243067i = i2;
    }

    /* renamed from: a */
    public final int mo83645a() {
        return this.f243067i;
    }

    /* renamed from: b */
    public final C89808d mo83646b() {
        return new C89787a(this);
    }

    /* renamed from: c */
    public final C49875cf mo83647c() {
        return this.f243063e;
    }

    /* renamed from: d */
    public final String mo83648d() {
        return this.f243059a;
    }

    /* renamed from: e */
    public final String mo83649e() {
        return this.f243062d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89809e) {
            C89809e eVar = (C89809e) obj;
            return this.f243059a.equals(eVar.mo83648d()) && this.f243060b.equals(eVar.mo83652g()) && this.f243061c.equals(eVar.mo83651f()) && this.f243062d.equals(eVar.mo83649e()) && this.f243068j == eVar.mo83657k() && this.f243063e.equals(eVar.mo83647c()) && this.f243064f == eVar.mo83653h() && this.f243065g == eVar.mo83656j() && this.f243066h == eVar.mo83655i() && this.f243067i == eVar.mo83645a();
        }
    }

    /* renamed from: f */
    public final String mo83651f() {
        return this.f243061c;
    }

    /* renamed from: g */
    public final InetAddress mo83652g() {
        return this.f243060b;
    }

    /* renamed from: h */
    public final boolean mo83653h() {
        return this.f243064f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.f243059a.hashCode() ^ 1000003) * 1000003) ^ this.f243060b.hashCode()) * 1000003) ^ this.f243061c.hashCode()) * 1000003) ^ this.f243062d.hashCode()) * 1000003) ^ this.f243068j) * 1000003) ^ this.f243063e.hashCode()) * 1000003) ^ (true != this.f243064f ? 1237 : 1231)) * 1000003) ^ (true != this.f243065g ? 1237 : 1231)) * 1000003;
        if (true == this.f243066h) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f243067i;
    }

    /* renamed from: i */
    public final boolean mo83655i() {
        return this.f243066h;
    }

    /* renamed from: j */
    public final boolean mo83656j() {
        return this.f243065g;
    }

    @Deprecated
    /* renamed from: k */
    public final int mo83657k() {
        return this.f243068j;
    }

    public final String toString() {
        String str = this.f243059a;
        String obj = this.f243060b.toString();
        String str2 = this.f243061c;
        String str3 = this.f243062d;
        int i = this.f243068j;
        String str4 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "SMART_DISPLAY" : "GOOGLE_HOME" : "AUDIOGROUP" : "AUDIOCAST" : "CHROMECAST" : "UNKNOWN";
        String num = Integer.toString(this.f243063e.f129621v);
        boolean z = this.f243064f;
        boolean z2 = this.f243065g;
        boolean z3 = this.f243066h;
        int i2 = this.f243067i;
        return "CastDeviceInfo{deviceId=" + str + ", ipAddress=" + obj + ", modelName=" + str2 + ", friendlyName=" + str3 + ", type=" + str4 + ", deviceType=" + num + ", avocadoCapable=" + z + ", useHttps=" + z2 + ", isMultiZoneGroup=" + z3 + ", version=" + i2 + "}";
    }
}
