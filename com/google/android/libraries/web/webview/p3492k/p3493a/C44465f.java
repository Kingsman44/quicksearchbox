package com.google.android.libraries.web.webview.p3492k.p3493a;

import android.net.Uri;
import com.google.android.libraries.web.p3353c.C43363h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.k.a.f */
/* compiled from: PG */
final class C44465f {

    /* renamed from: a */
    public final Uri f115576a;

    /* renamed from: b */
    public final C43363h f115577b;

    /* renamed from: c */
    public final boolean f115578c;

    /* renamed from: d */
    public final boolean f115579d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44465f(Uri uri, C43363h hVar, boolean z, int i) {
        this(uri, (i & 2) != 0 ? null : hVar, z & ((i & 4) == 0), false);
    }

    public C44465f(Uri uri, C43363h hVar, boolean z, boolean z2) {
        C69664n.m101061g(uri, "url");
        this.f115576a = uri;
        this.f115577b = hVar;
        this.f115578c = z;
        this.f115579d = z2;
    }

    /* renamed from: a */
    public static /* synthetic */ C44465f m78544a(C44465f fVar, Uri uri, C43363h hVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            uri = fVar.f115576a;
        }
        if ((i & 2) != 0) {
            hVar = fVar.f115577b;
        }
        if ((i & 4) != 0) {
            z = fVar.f115578c;
        }
        if ((i & 8) != 0) {
            z2 = fVar.f115579d;
        }
        C69664n.m101061g(uri, "url");
        return new C44465f(uri, hVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44465f)) {
            return false;
        }
        C44465f fVar = (C44465f) obj;
        return C69664n.m101066l(this.f115576a, fVar.f115576a) && C69664n.m101066l(this.f115577b, fVar.f115577b) && this.f115578c == fVar.f115578c && this.f115579d == fVar.f115579d;
    }

    public final int hashCode() {
        int hashCode = this.f115576a.hashCode() * 31;
        C43363h hVar = this.f115577b;
        return ((((hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + (this.f115578c ? 1 : 0)) * 31) + (this.f115579d ? 1 : 0);
    }

    public final String toString() {
        Uri uri = this.f115576a;
        C43363h hVar = this.f115577b;
        boolean z = this.f115578c;
        boolean z2 = this.f115579d;
        return "Navigation(url=" + uri + ", error=" + hVar + ", waitingForReplacementRequest=" + z + ", isGuaranteedToCommit=" + z2 + ")";
    }
}
