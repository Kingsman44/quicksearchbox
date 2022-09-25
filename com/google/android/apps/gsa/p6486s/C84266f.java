package com.google.android.apps.gsa.p6486s;

import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.s.f */
/* compiled from: PG */
final class C84266f extends C84278r {

    /* renamed from: a */
    private final C52176ia f229330a;

    /* renamed from: b */
    private final boolean f229331b;

    /* renamed from: c */
    private final boolean f229332c;

    /* renamed from: d */
    private final C58833ax f229333d;

    /* renamed from: e */
    private final C58833ax f229334e;

    /* renamed from: f */
    private final C58833ax f229335f;

    public C84266f(C52176ia iaVar, boolean z, boolean z2, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f229330a = iaVar;
        this.f229331b = z;
        this.f229332c = z2;
        this.f229333d = axVar;
        this.f229334e = axVar2;
        this.f229335f = axVar3;
    }

    /* renamed from: a */
    public final C52176ia mo77769a() {
        return this.f229330a;
    }

    /* renamed from: b */
    public final C58833ax mo77770b() {
        return this.f229334e;
    }

    /* renamed from: c */
    public final C58833ax mo77771c() {
        return this.f229335f;
    }

    /* renamed from: d */
    public final C58833ax mo77772d() {
        return this.f229333d;
    }

    /* renamed from: e */
    public final boolean mo77773e() {
        return this.f229331b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84278r) {
            C84278r rVar = (C84278r) obj;
            return this.f229330a.equals(rVar.mo77769a()) && this.f229331b == rVar.mo77773e() && this.f229332c == rVar.mo77775f() && this.f229333d.equals(rVar.mo77772d()) && this.f229334e.equals(rVar.mo77770b()) && this.f229335f.equals(rVar.mo77771c());
        }
    }

    /* renamed from: f */
    public final boolean mo77775f() {
        return this.f229332c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f229330a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f229331b ? 1237 : 1231)) * 1000003;
        if (true == this.f229332c) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f229333d.hashCode()) * 1000003) ^ this.f229334e.hashCode()) * 1000003) ^ this.f229335f.hashCode();
    }

    public final String toString() {
        String obj = this.f229330a.toString();
        boolean z = this.f229331b;
        boolean z2 = this.f229332c;
        String valueOf = String.valueOf(this.f229333d);
        String valueOf2 = String.valueOf(this.f229334e);
        String valueOf3 = String.valueOf(this.f229335f);
        return "PlayerConfig{mediaData=" + obj + ", autoPlay=" + z + ", autoPlayNext=" + z2 + ", uiSessionData=" + valueOf + ", intentStarter=" + valueOf2 + ", mediaSessionType=" + valueOf3 + "}";
    }
}
