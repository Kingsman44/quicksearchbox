package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import android.net.Uri;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.f */
/* compiled from: PG */
public final class C138581f implements C47388b {

    /* renamed from: a */
    public final Uri f376911a;

    public C138581f(Uri uri) {
        C69664n.m101061g(uri, "uri");
        this.f376911a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C138581f) && C69664n.m101066l(this.f376911a, ((C138581f) obj).f376911a);
    }

    public final int hashCode() {
        return this.f376911a.hashCode();
    }

    public final String toString() {
        Uri uri = this.f376911a;
        return "ManageActivityButtonClickEvent(uri=" + uri + ")";
    }
}
