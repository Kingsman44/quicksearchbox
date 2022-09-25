package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.p4272br.C56449r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ar */
/* compiled from: PG */
final class C123310ar extends C123320ba {

    /* renamed from: a */
    private final C56449r f341052a;

    /* renamed from: b */
    private final String f341053b;

    public C123310ar(C56449r rVar, String str) {
        this.f341052a = rVar;
        if (str != null) {
            this.f341053b = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* renamed from: a */
    public final C56449r mo105953a() {
        return this.f341052a;
    }

    /* renamed from: b */
    public final String mo105954b() {
        return this.f341053b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123320ba) {
            C123320ba baVar = (C123320ba) obj;
            return this.f341052a.equals(baVar.mo105953a()) && this.f341053b.equals(baVar.mo105954b());
        }
    }

    public final int hashCode() {
        return ((this.f341052a.hashCode() ^ 1000003) * 1000003) ^ this.f341053b.hashCode();
    }

    public final String toString() {
        String str = this.f341052a.f150776a;
        String str2 = this.f341053b;
        return "CanonicalUrl{pattern=" + str + ", url=" + str2 + "}";
    }
}
