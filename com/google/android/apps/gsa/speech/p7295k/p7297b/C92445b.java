package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.speech.k.b.b */
/* compiled from: PG */
final class C92445b extends C92454k {

    /* renamed from: a */
    private final C92302a f257831a;

    /* renamed from: b */
    private final C89994f f257832b;

    /* renamed from: c */
    private final C58833ax f257833c;

    /* renamed from: d */
    private final C58833ax f257834d;

    /* renamed from: e */
    private final C58833ax f257835e;

    /* renamed from: f */
    private final C58833ax f257836f;

    /* renamed from: g */
    private final C58833ax f257837g;

    /* renamed from: h */
    private final C58833ax f257838h;

    /* renamed from: i */
    private final C58833ax f257839i;

    /* renamed from: j */
    private final C58833ax f257840j;

    /* renamed from: k */
    private final C58833ax f257841k;

    public C92445b(C92302a aVar, C89994f fVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9) {
        this.f257831a = aVar;
        this.f257832b = fVar;
        this.f257833c = axVar;
        this.f257834d = axVar2;
        this.f257835e = axVar3;
        this.f257836f = axVar4;
        this.f257837g = axVar5;
        this.f257838h = axVar6;
        this.f257839i = axVar7;
        this.f257840j = axVar8;
        this.f257841k = axVar9;
    }

    /* renamed from: a */
    public final C89994f mo87132a() {
        return this.f257832b;
    }

    /* renamed from: b */
    public final C92302a mo87133b() {
        return this.f257831a;
    }

    /* renamed from: c */
    public final C58833ax mo87134c() {
        return this.f257840j;
    }

    /* renamed from: d */
    public final C58833ax mo87135d() {
        return this.f257838h;
    }

    /* renamed from: e */
    public final C58833ax mo87136e() {
        return this.f257836f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92454k) {
            C92454k kVar = (C92454k) obj;
            return this.f257831a.equals(kVar.mo87133b()) && this.f257832b.equals(kVar.mo87132a()) && this.f257833c.equals(kVar.mo87142i()) && this.f257834d.equals(kVar.mo87139g()) && this.f257835e.equals(kVar.mo87144k()) && this.f257836f.equals(kVar.mo87136e()) && this.f257837g.equals(kVar.mo87143j()) && this.f257838h.equals(kVar.mo87135d()) && this.f257839i.equals(kVar.mo87140h()) && this.f257840j.equals(kVar.mo87134c()) && this.f257841k.equals(kVar.mo87138f());
        }
    }

    /* renamed from: f */
    public final C58833ax mo87138f() {
        return this.f257841k;
    }

    /* renamed from: g */
    public final C58833ax mo87139g() {
        return this.f257834d;
    }

    /* renamed from: h */
    public final C58833ax mo87140h() {
        return this.f257839i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f257831a.hashCode() ^ 1000003) * 1000003) ^ this.f257832b.hashCode()) * 1000003) ^ this.f257833c.hashCode()) * 1000003) ^ this.f257834d.hashCode()) * 1000003) ^ this.f257835e.hashCode()) * 1000003) ^ this.f257836f.hashCode()) * 1000003) ^ this.f257837g.hashCode()) * 1000003) ^ this.f257838h.hashCode()) * 1000003) ^ this.f257839i.hashCode()) * 1000003) ^ this.f257840j.hashCode()) * 1000003) ^ this.f257841k.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo87142i() {
        return this.f257833c;
    }

    /* renamed from: j */
    public final C58833ax mo87143j() {
        return this.f257837g;
    }

    /* renamed from: k */
    public final C58833ax mo87144k() {
        return this.f257835e;
    }

    public final String toString() {
        String obj = this.f257831a.toString();
        String obj2 = this.f257832b.toString();
        String valueOf = String.valueOf(this.f257833c);
        String valueOf2 = String.valueOf(this.f257834d);
        String valueOf3 = String.valueOf(this.f257835e);
        String valueOf4 = String.valueOf(this.f257836f);
        String valueOf5 = String.valueOf(this.f257837g);
        String valueOf6 = String.valueOf(this.f257838h);
        String valueOf7 = String.valueOf(this.f257839i);
        String valueOf8 = String.valueOf(this.f257840j);
        String valueOf9 = String.valueOf(this.f257841k);
        return "S3UserInfoContainer{authTokenHelper=" + obj + ", speechSettings=" + obj2 + ", speechLocationHelper=" + valueOf + ", s3UserInfo=" + valueOf2 + ", tokenType=" + valueOf3 + ", deviceLocale=" + valueOf4 + ", spokenLocale=" + valueOf5 + ", additionalLocales=" + valueOf6 + ", shouldSendAllAuthTokens=" + valueOf7 + ", account=" + valueOf8 + ", impersonatedUser=" + valueOf9 + "}";
    }
}
