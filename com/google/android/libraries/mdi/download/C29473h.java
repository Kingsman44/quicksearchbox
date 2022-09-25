package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.h */
/* compiled from: PG */
final class C29473h extends C28740br {

    /* renamed from: a */
    public final String f79888a;

    /* renamed from: b */
    public final C58833ax f79889b;

    /* renamed from: c */
    public final C58833ax f79890c;

    /* renamed from: d */
    public final C58833ax f79891d;

    /* renamed from: e */
    public final C58833ax f79892e;

    /* renamed from: f */
    public final C58833ax f79893f;

    /* renamed from: g */
    public final C58833ax f79894g;

    /* renamed from: h */
    public final int f79895h;

    /* renamed from: i */
    public final boolean f79896i;

    /* renamed from: j */
    public final boolean f79897j;

    /* renamed from: k */
    public final int f79898k;

    public C29473h(String str, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, int i, int i2, boolean z, boolean z2) {
        this.f79888a = str;
        this.f79889b = axVar;
        this.f79890c = axVar2;
        this.f79891d = axVar3;
        this.f79892e = axVar4;
        this.f79893f = axVar5;
        this.f79894g = axVar6;
        this.f79895h = i;
        this.f79898k = i2;
        this.f79896i = z;
        this.f79897j = z2;
    }

    /* renamed from: a */
    public final int mo34342a() {
        return this.f79895h;
    }

    /* renamed from: b */
    public final C28739bq mo34343b() {
        return new C29436g(this);
    }

    /* renamed from: c */
    public final C58833ax mo34344c() {
        return this.f79889b;
    }

    /* renamed from: d */
    public final C58833ax mo34345d() {
        return this.f79892e;
    }

    /* renamed from: e */
    public final C58833ax mo34346e() {
        return this.f79891d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28740br) {
            C28740br brVar = (C28740br) obj;
            return this.f79888a.equals(brVar.mo34350i()) && this.f79889b.equals(brVar.mo34344c()) && this.f79890c.equals(brVar.mo34349h()) && this.f79891d.equals(brVar.mo34346e()) && this.f79892e.equals(brVar.mo34345d()) && this.f79893f.equals(brVar.mo34347f()) && this.f79894g.equals(brVar.mo34348g()) && this.f79895h == brVar.mo34342a() && this.f79898k == brVar.mo34353l() && this.f79896i == brVar.mo34351j() && this.f79897j == brVar.mo34352k();
        }
    }

    /* renamed from: f */
    public final C58833ax mo34347f() {
        return this.f79893f;
    }

    /* renamed from: g */
    public final C58833ax mo34348g() {
        return this.f79894g;
    }

    /* renamed from: h */
    public final C58833ax mo34349h() {
        return this.f79890c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((this.f79888a.hashCode() ^ 1000003) * 1000003) ^ this.f79889b.hashCode()) * 1000003) ^ this.f79890c.hashCode()) * 1000003) ^ this.f79891d.hashCode()) * 1000003) ^ this.f79892e.hashCode()) * 1000003) ^ this.f79893f.hashCode()) * 1000003) ^ this.f79894g.hashCode()) * 1000003) ^ this.f79895h) * 1000003) ^ this.f79898k) * 1000003) ^ (true != this.f79896i ? 1237 : 1231)) * 1000003;
        if (true == this.f79897j) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final String mo34350i() {
        return this.f79888a;
    }

    /* renamed from: j */
    public final boolean mo34351j() {
        return this.f79896i;
    }

    /* renamed from: k */
    public final boolean mo34352k() {
        return this.f79897j;
    }

    /* renamed from: l */
    public final int mo34353l() {
        return this.f79898k;
    }

    public final String toString() {
        String str = this.f79888a;
        String valueOf = String.valueOf(this.f79889b);
        String valueOf2 = String.valueOf(this.f79890c);
        String valueOf3 = String.valueOf(this.f79891d);
        String valueOf4 = String.valueOf(this.f79892e);
        String valueOf5 = String.valueOf(this.f79893f);
        String valueOf6 = String.valueOf(this.f79894g);
        int i = this.f79895h;
        String str2 = this.f79898k != 1 ? "ALL" : "NONE";
        boolean z = this.f79896i;
        boolean z2 = this.f79897j;
        return "DownloadFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + ", contentTitleOptional=" + valueOf3 + ", contentTextOptional=" + valueOf4 + ", downloadConditionsOptional=" + valueOf5 + ", listenerOptional=" + valueOf6 + ", groupSizeBytes=" + i + ", showNotifications=" + str2 + ", preserveZipDirectories=" + z + ", verifyIsolatedStructure=" + z2 + "}";
    }
}
