package com.google.android.apps.search.podcasts.language;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.u */
/* compiled from: PG */
public final class C140556u implements C47388b {

    /* renamed from: a */
    public final String f381726a;

    public C140556u(String str) {
        C69664n.m101061g(str, "languageCode");
        this.f381726a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140556u) && C69664n.m101066l(this.f381726a, ((C140556u) obj).f381726a);
    }

    public final int hashCode() {
        return this.f381726a.hashCode();
    }

    public final String toString() {
        String str = this.f381726a;
        return "LanguageToggleEvent(languageCode=" + str + ")";
    }
}
