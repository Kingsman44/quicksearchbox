package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

import android.net.Uri;
import org.p5633c.p5634a.C72296t;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.a */
/* compiled from: PG */
final class C97050a extends C97061l {

    /* renamed from: a */
    public final long f271185a;

    /* renamed from: b */
    public final C72296t f271186b;

    /* renamed from: c */
    public final Uri f271187c;

    public C97050a(long j, C72296t tVar, Uri uri) {
        this.f271185a = j;
        this.f271186b = tVar;
        if (uri != null) {
            this.f271187c = uri;
            return;
        }
        throw new NullPointerException("Null requestUri");
    }

    /* renamed from: a */
    public final long mo90408a() {
        return this.f271185a;
    }

    /* renamed from: b */
    public final Uri mo90409b() {
        return this.f271187c;
    }

    /* renamed from: c */
    public final C72296t mo90410c() {
        return this.f271186b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97061l) {
            C97061l lVar = (C97061l) obj;
            return this.f271185a == lVar.mo90408a() && this.f271186b.equals(lVar.mo90410c()) && this.f271187c.equals(lVar.mo90409b());
        }
    }

    public final int hashCode() {
        long j = this.f271185a;
        return this.f271187c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f271186b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f271185a;
        String b = C72267x.f192324e.mo63596b(this.f271186b);
        String obj = this.f271187c.toString();
        return "FetchId{updateIndex=" + j + ", updateStartTime=" + b + ", requestUri=" + obj + "}";
    }
}
