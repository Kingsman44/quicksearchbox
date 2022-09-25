package com.google.android.apps.gsa.search.shared.service;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.e */
/* compiled from: PG */
public final class C88484e extends C87686an {

    /* renamed from: a */
    public final String f239197a;

    /* renamed from: b */
    public final C88431bb f239198b;

    public C88484e(String str, C88431bb bbVar) {
        this.f239197a = str;
        this.f239198b = bbVar;
    }

    /* renamed from: a */
    public final C88431bb mo81967a() {
        return this.f239198b;
    }

    /* renamed from: b */
    public final String mo81968b() {
        return this.f239197a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C87686an) {
            C87686an anVar = (C87686an) obj;
            return this.f239197a.equals(anVar.mo81968b()) && this.f239198b.equals(anVar.mo81967a());
        }
    }

    public final int hashCode() {
        return ((this.f239197a.hashCode() ^ 1000003) * 1000003) ^ this.f239198b.hashCode();
    }

    public final String toString() {
        String str = this.f239197a;
        String obj = this.f239198b.toString();
        return "SessionStartingData{sessionType=" + str + ", sessionContext=" + obj + "}";
    }
}
