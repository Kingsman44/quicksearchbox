package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.n */
/* compiled from: PG */
final class C128444n extends C128418am {

    /* renamed from: a */
    public final C119748c f353273a;

    /* renamed from: b */
    public final C128414ai f353274b;

    public C128444n(C119748c cVar, C128414ai aiVar) {
        this.f353273a = cVar;
        if (aiVar != null) {
            this.f353274b = aiVar;
            return;
        }
        throw new NullPointerException("Null callbacks");
    }

    /* renamed from: a */
    public final C119748c mo108419a() {
        return this.f353273a;
    }

    /* renamed from: b */
    public final C128414ai mo108420b() {
        return this.f353274b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128418am) {
            C128418am amVar = (C128418am) obj;
            return this.f353273a.equals(amVar.mo108419a()) && this.f353274b.equals(amVar.mo108420b());
        }
    }

    public final int hashCode() {
        return ((this.f353273a.hashCode() ^ 1000003) * 1000003) ^ this.f353274b.hashCode();
    }

    public final String toString() {
        String obj = this.f353273a.toString();
        String obj2 = this.f353274b.toString();
        return "VoiceSearchSession{connection=" + obj + ", callbacks=" + obj2 + "}";
    }
}
