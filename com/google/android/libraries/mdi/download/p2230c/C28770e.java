package com.google.android.libraries.mdi.download.p2230c;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.mdi.download.c.e */
/* compiled from: PG */
final class C28770e extends C28779n {

    /* renamed from: d */
    private final boolean f78212d;

    /* renamed from: e */
    private final C58528ij f78213e;

    public C28770e(boolean z, C58528ij ijVar) {
        this.f78212d = z;
        this.f78213e = ijVar;
    }

    /* renamed from: a */
    public final C58528ij mo34383a() {
        return this.f78213e;
    }

    /* renamed from: b */
    public final boolean mo34384b() {
        return this.f78212d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28779n) {
            C28779n nVar = (C28779n) obj;
            return this.f78212d == nVar.mo34384b() && this.f78213e.equals(nVar.mo34383a());
        }
    }

    public final int hashCode() {
        return (((true != this.f78212d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f78213e.hashCode();
    }

    public final String toString() {
        boolean z = this.f78212d;
        String valueOf = String.valueOf(this.f78213e);
        return "DownloadConstraints{requireUnmeteredNetwork=" + z + ", requiredNetworkTypes=" + valueOf + "}";
    }
}
