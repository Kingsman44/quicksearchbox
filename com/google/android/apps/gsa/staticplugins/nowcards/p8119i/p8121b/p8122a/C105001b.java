package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.view.ViewGroup;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.p489g.p494d.C9215cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.b */
/* compiled from: PG */
final class C105001b extends C105009j {

    /* renamed from: a */
    public final ViewGroup f292543a;

    /* renamed from: b */
    public final C9215cx f292544b;

    /* renamed from: c */
    public final long f292545c;

    /* renamed from: d */
    public final C91890n f292546d;

    /* renamed from: e */
    public final Optional f292547e;

    /* renamed from: f */
    public final Optional f292548f;

    /* renamed from: g */
    public final boolean f292549g;

    public C105001b(ViewGroup viewGroup, C9215cx cxVar, long j, C91890n nVar, Optional optional, Optional optional2, boolean z) {
        this.f292543a = viewGroup;
        this.f292544b = cxVar;
        this.f292545c = j;
        this.f292546d = nVar;
        this.f292547e = optional;
        this.f292548f = optional2;
        this.f292549g = z;
    }

    /* renamed from: a */
    public final long mo94447a() {
        return this.f292545c;
    }

    /* renamed from: b */
    public final ViewGroup mo94448b() {
        return this.f292543a;
    }

    /* renamed from: c */
    public final C91890n mo94449c() {
        return this.f292546d;
    }

    /* renamed from: d */
    public final C105008i mo94450d() {
        return new C105000a(this);
    }

    /* renamed from: e */
    public final C9215cx mo94451e() {
        return this.f292544b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105009j) {
            C105009j jVar = (C105009j) obj;
            return this.f292543a.equals(jVar.mo94448b()) && this.f292544b.equals(jVar.mo94451e()) && this.f292545c == jVar.mo94447a() && this.f292546d.equals(jVar.mo94449c()) && this.f292547e.equals(jVar.mo94453f()) && this.f292548f.equals(jVar.mo94454g()) && this.f292549g == jVar.mo94455h();
        }
    }

    /* renamed from: f */
    public final Optional mo94453f() {
        return this.f292547e;
    }

    /* renamed from: g */
    public final Optional mo94454g() {
        return this.f292548f;
    }

    /* renamed from: h */
    public final boolean mo94455h() {
        return this.f292549g;
    }

    public final int hashCode() {
        int hashCode = this.f292543a.hashCode();
        int hashCode2 = this.f292544b.hashCode();
        long j = this.f292545c;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f292546d.hashCode()) * 1000003) ^ this.f292547e.hashCode()) * 1000003) ^ this.f292548f.hashCode()) * 1000003) ^ (true != this.f292549g ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f292543a.toString();
        String obj2 = this.f292544b.toString();
        long j = this.f292545c;
        String obj3 = this.f292546d.toString();
        String valueOf = String.valueOf(this.f292547e);
        String valueOf2 = String.valueOf(this.f292548f);
        boolean z = this.f292549g;
        return "VideoAutoplayInfo{videoContainer=" + obj + ", playVideoAction=" + obj2 + ", entryUpdateId=" + j + ", videoUiManager=" + obj3 + ", inlineVideoLogger=" + valueOf + ", videoAutoplayer=" + valueOf2 + ", impressionLogged=" + z + "}";
    }
}
