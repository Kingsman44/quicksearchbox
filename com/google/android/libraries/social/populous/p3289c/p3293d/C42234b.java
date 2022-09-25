package com.google.android.libraries.social.populous.p3289c.p3293d;

import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.p3289c.p3290a.C42210b;

/* renamed from: com.google.android.libraries.social.populous.c.d.b */
/* compiled from: PG */
final class C42234b extends C42243k {

    /* renamed from: a */
    private final C42352m f110572a;

    /* renamed from: b */
    private final ClientVersion f110573b;

    /* renamed from: c */
    private final ClientConfigInternal f110574c;

    /* renamed from: d */
    private final C42210b f110575d;

    public C42234b(C42210b bVar, C42352m mVar, ClientVersion clientVersion, ClientConfigInternal clientConfigInternal) {
        this.f110575d = bVar;
        this.f110572a = mVar;
        this.f110573b = clientVersion;
        this.f110574c = clientConfigInternal;
    }

    /* renamed from: a */
    public final C42352m mo44919a() {
        return this.f110572a;
    }

    /* renamed from: b */
    public final ClientConfigInternal mo44920b() {
        return this.f110574c;
    }

    /* renamed from: c */
    public final ClientVersion mo44921c() {
        return this.f110573b;
    }

    /* renamed from: d */
    public final C42210b mo44922d() {
        return this.f110575d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42243k) {
            C42243k kVar = (C42243k) obj;
            C42210b bVar = this.f110575d;
            if (bVar != null ? bVar.equals(kVar.mo44922d()) : kVar.mo44922d() == null) {
                return this.f110572a.equals(kVar.mo44919a()) && this.f110573b.equals(kVar.mo44921c()) && this.f110574c.equals(kVar.mo44920b());
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f110575d);
        String obj = this.f110572a.toString();
        String obj2 = this.f110573b.toString();
        String obj3 = this.f110574c.toString();
        return "RequestMetadata{authenticator=" + valueOf + ", accountData=" + obj + ", clientVersion=" + obj2 + ", clientConfig=" + obj3 + "}";
    }

    public final int hashCode() {
        int i;
        C42210b bVar = this.f110575d;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        return ((((((i ^ 1000003) * 1000003) ^ this.f110572a.hashCode()) * 1000003) ^ this.f110573b.hashCode()) * 1000003) ^ this.f110574c.hashCode();
    }
}
