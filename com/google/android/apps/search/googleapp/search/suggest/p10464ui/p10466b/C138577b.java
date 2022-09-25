package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import android.content.Intent;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.b */
/* compiled from: PG */
public final class C138577b implements C47388b {

    /* renamed from: a */
    public final Intent f376906a;

    /* renamed from: b */
    public final C138030av f376907b;

    public C138577b(Intent intent, C138030av avVar) {
        C69664n.m101061g(avVar, "suggestion");
        this.f376906a = intent;
        this.f376907b = avVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138577b)) {
            return false;
        }
        C138577b bVar = (C138577b) obj;
        return C69664n.m101066l(this.f376906a, bVar.f376906a) && C69664n.m101066l(this.f376907b, bVar.f376907b);
    }

    public final int hashCode() {
        Intent intent = this.f376906a;
        return ((intent == null ? 0 : intent.hashCode()) * 31) + this.f376907b.hashCode();
    }

    public final String toString() {
        Intent intent = this.f376906a;
        C138030av avVar = this.f376907b;
        return "AppSuggestionClickEvent(intent=" + intent + ", suggestion=" + avVar + ")";
    }
}
