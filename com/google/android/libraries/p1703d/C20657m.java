package com.google.android.libraries.p1703d;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.libraries.d.m */
/* compiled from: PG */
final class C20657m extends C20645ai {

    /* renamed from: a */
    private final Uri f57923a;

    /* renamed from: b */
    private final List f57924b;

    /* renamed from: c */
    private final Bundle f57925c;

    /* renamed from: d */
    private final boolean f57926d;

    /* renamed from: e */
    private final boolean f57927e;

    public C20657m(Uri uri, List list, Bundle bundle, boolean z, boolean z2) {
        this.f57923a = uri;
        this.f57924b = list;
        this.f57925c = bundle;
        this.f57926d = z;
        this.f57927e = z2;
    }

    /* renamed from: a */
    public final Uri mo25597a() {
        return this.f57923a;
    }

    /* renamed from: b */
    public final Bundle mo25598b() {
        return this.f57925c;
    }

    /* renamed from: c */
    public final List mo25599c() {
        return this.f57924b;
    }

    /* renamed from: d */
    public final boolean mo25600d() {
        return this.f57926d;
    }

    /* renamed from: e */
    public final boolean mo25601e() {
        return this.f57927e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20645ai) {
            C20645ai aiVar = (C20645ai) obj;
            Uri uri = this.f57923a;
            if (uri != null ? uri.equals(aiVar.mo25597a()) : aiVar.mo25597a() == null) {
                List list = this.f57924b;
                if (list != null ? list.equals(aiVar.mo25599c()) : aiVar.mo25599c() == null) {
                    return this.f57925c.equals(aiVar.mo25598b()) && this.f57926d == aiVar.mo25600d() && this.f57927e == aiVar.mo25601e();
                }
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f57923a);
        String valueOf2 = String.valueOf(this.f57924b);
        String obj = this.f57925c.toString();
        boolean z = this.f57926d;
        boolean z2 = this.f57927e;
        return "PrerenderParams{highConfidenceUrl=" + valueOf + ", lowConfidenceUrls=" + valueOf2 + ", extras=" + obj + ", ignoreFragmentInPrerenderUrl=" + z + ", prerenderOnCellular=" + z2 + "}";
    }

    public final int hashCode() {
        int i;
        Uri uri = this.f57923a;
        int i2 = 0;
        if (uri == null) {
            i = 0;
        } else {
            i = uri.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        List list = this.f57924b;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i4 = 1237;
        int hashCode = (((((i3 ^ i2) * 1000003) ^ this.f57925c.hashCode()) * 1000003) ^ (true != this.f57926d ? 1237 : 1231)) * 1000003;
        if (true == this.f57927e) {
            i4 = 1231;
        }
        return hashCode ^ i4;
    }
}
