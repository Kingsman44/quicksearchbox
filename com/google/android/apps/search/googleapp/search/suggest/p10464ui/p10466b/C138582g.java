package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.g */
/* compiled from: PG */
public final class C138582g implements C47388b {

    /* renamed from: a */
    public final Uri f376912a;

    /* renamed from: b */
    public final C138030av f376913b;

    public C138582g(Uri uri, C138030av avVar) {
        C69664n.m101061g(uri, "uri");
        C69664n.m101061g(avVar, "suggestion");
        this.f376912a = uri;
        this.f376913b = avVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138582g)) {
            return false;
        }
        C138582g gVar = (C138582g) obj;
        return C69664n.m101066l(this.f376912a, gVar.f376912a) && C69664n.m101066l(this.f376913b, gVar.f376913b);
    }

    public final int hashCode() {
        return (this.f376912a.hashCode() * 31) + this.f376913b.hashCode();
    }

    public final String toString() {
        Uri uri = this.f376912a;
        C138030av avVar = this.f376913b;
        return "NavSuggestionClickEvent(uri=" + uri + ", suggestion=" + avVar + ")";
    }
}
