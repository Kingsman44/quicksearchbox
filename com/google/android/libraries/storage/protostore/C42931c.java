package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.storage.protostore.c */
/* compiled from: PG */
final class C42931c extends C42878ad {

    /* renamed from: a */
    public final Uri f112309a;

    /* renamed from: b */
    public final MessageLite f112310b;

    /* renamed from: c */
    public final C43007j f112311c;

    /* renamed from: d */
    public final C58485gu f112312d;

    /* renamed from: e */
    public final C42985du f112313e;

    /* renamed from: f */
    public final boolean f112314f;

    public C42931c(Uri uri, MessageLite messageLite, C43007j jVar, C58485gu guVar, C42985du duVar, boolean z) {
        this.f112309a = uri;
        this.f112310b = messageLite;
        this.f112311c = jVar;
        this.f112312d = guVar;
        this.f112313e = duVar;
        this.f112314f = z;
    }

    /* renamed from: a */
    public final Uri mo45971a() {
        return this.f112309a;
    }

    /* renamed from: b */
    public final C43007j mo45972b() {
        return this.f112311c;
    }

    /* renamed from: c */
    public final C42877ac mo45973c() {
        return new C42901b(this);
    }

    /* renamed from: d */
    public final C42985du mo45974d() {
        return this.f112313e;
    }

    /* renamed from: e */
    public final C58485gu mo45975e() {
        return this.f112312d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42878ad) {
            C42878ad adVar = (C42878ad) obj;
            return this.f112309a.equals(adVar.mo45971a()) && this.f112310b.equals(adVar.mo45976f()) && this.f112311c.equals(adVar.mo45972b()) && C58597ky.m90218i(this.f112312d, adVar.mo45975e()) && this.f112313e.equals(adVar.mo45974d()) && this.f112314f == adVar.mo45978h() && !adVar.mo45977g();
        }
    }

    /* renamed from: f */
    public final MessageLite mo45976f() {
        return this.f112310b;
    }

    /* renamed from: g */
    public final boolean mo45977g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo45978h() {
        return this.f112314f;
    }

    public final int hashCode() {
        return ((((((((((((this.f112309a.hashCode() ^ 1000003) * 1000003) ^ this.f112310b.hashCode()) * 1000003) ^ this.f112311c.hashCode()) * 1000003) ^ this.f112312d.hashCode()) * 1000003) ^ this.f112313e.hashCode()) * 1000003) ^ (true != this.f112314f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.f112309a.toString();
        String obj2 = this.f112310b.toString();
        String obj3 = this.f112311c.toString();
        String valueOf = String.valueOf(this.f112312d);
        String obj4 = this.f112313e.toString();
        boolean z = this.f112314f;
        return "ProtoDataStoreConfig{uri=" + obj + ", schema=" + obj2 + ", handler=" + obj3 + ", migrations=" + valueOf + ", variantConfig=" + obj4 + ", useGeneratedExtensionRegistry=" + z + ", enableTracing=false}";
    }
}
