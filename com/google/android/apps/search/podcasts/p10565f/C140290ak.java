package com.google.android.apps.search.podcasts.p10565f;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ak */
/* compiled from: PG */
public final class C140290ak implements C47388b {

    /* renamed from: a */
    public final String f381142a;

    public C140290ak(String str) {
        C69664n.m101061g(str, "url");
        this.f381142a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140290ak) && C69664n.m101066l(this.f381142a, ((C140290ak) obj).f381142a);
    }

    public final int hashCode() {
        return this.f381142a.hashCode();
    }

    public final String toString() {
        String str = this.f381142a;
        return "OpenUrlEvent(url=" + str + ")";
    }
}
