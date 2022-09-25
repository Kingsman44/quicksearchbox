package com.google.android.libraries.web.p3408h.p3414b;

import android.net.Uri;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.b.c */
/* compiled from: PG */
final class C43789c {

    /* renamed from: a */
    private final Uri f114177a;

    public C43789c(Uri uri) {
        C69664n.m101061g(uri, "url");
        this.f114177a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43789c) && C69664n.m101066l(this.f114177a, ((C43789c) obj).f114177a);
    }

    public final int hashCode() {
        return this.f114177a.hashCode();
    }

    public final String toString() {
        Uri uri = this.f114177a;
        return "WebDocumentSnapshotImpl(url=" + uri + ")";
    }
}
