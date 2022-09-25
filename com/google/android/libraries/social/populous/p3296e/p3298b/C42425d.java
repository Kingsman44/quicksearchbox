package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.core.C42299by;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.social.populous.e.b.d */
/* compiled from: PG */
final class C42425d extends C42442u {

    /* renamed from: a */
    private final C42299by f111279a;

    /* renamed from: b */
    private final String f111280b;

    /* renamed from: c */
    private final PersonFieldMetadata f111281c;

    /* renamed from: d */
    private final String f111282d;

    /* renamed from: e */
    private final C58485gu f111283e;

    /* renamed from: f */
    private final C42418ao f111284f;

    /* renamed from: g */
    private final String f111285g;

    public C42425d(C42299by byVar, String str, PersonFieldMetadata personFieldMetadata, String str2, C58485gu guVar, C42418ao aoVar, String str3) {
        this.f111279a = byVar;
        this.f111280b = str;
        this.f111281c = personFieldMetadata;
        this.f111282d = str2;
        this.f111283e = guVar;
        this.f111284f = aoVar;
        this.f111285g = str3;
    }

    /* renamed from: a */
    public final Email.ExtendedData mo45463a() {
        return null;
    }

    /* renamed from: b */
    public final C42299by mo45464b() {
        return this.f111279a;
    }

    /* renamed from: c */
    public final PersonFieldMetadata mo45465c() {
        return this.f111281c;
    }

    /* renamed from: d */
    public final C42418ao mo45466d() {
        return this.f111284f;
    }

    /* renamed from: e */
    public final C58485gu mo45467e() {
        return this.f111283e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42442u) {
            C42442u uVar = (C42442u) obj;
            return this.f111279a.equals(uVar.mo45464b()) && this.f111280b.equals(uVar.mo45471h()) && this.f111281c.equals(uVar.mo45465c()) && this.f111282d.equals(uVar.mo45469f()) && uVar.mo45463a() == null && C58597ky.m90218i(this.f111283e, uVar.mo45467e()) && this.f111284f.equals(uVar.mo45466d()) && this.f111285g.equals(uVar.mo45470g());
        }
    }

    /* renamed from: f */
    public final String mo45469f() {
        return this.f111282d;
    }

    /* renamed from: g */
    public final String mo45470g() {
        return this.f111285g;
    }

    /* renamed from: h */
    public final String mo45471h() {
        return this.f111280b;
    }

    public final int hashCode() {
        return ((((((((((((this.f111279a.hashCode() ^ 1000003) * 1000003) ^ this.f111280b.hashCode()) * 1000003) ^ this.f111281c.hashCode()) * 1000003) ^ this.f111282d.hashCode()) * -721379959) ^ this.f111283e.hashCode()) * 1000003) ^ this.f111284f.hashCode()) * 1000003) ^ this.f111285g.hashCode();
    }

    public final String toString() {
        String obj = this.f111279a.toString();
        String str = this.f111280b;
        String obj2 = this.f111281c.toString();
        String str2 = this.f111282d;
        String obj3 = this.f111283e.toString();
        String obj4 = this.f111284f.toString();
        String str3 = this.f111285g;
        return "LoaderField{fieldType=" + obj + ", value=" + str + ", metadata=" + obj2 + ", canonicalValue=" + str2 + ", emailExtendedData=null, certificates=" + obj3 + ", rankingFeatureSet=" + obj4 + ", key=" + str3 + "}";
    }
}
