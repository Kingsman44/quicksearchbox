package com.google.android.apps.gsa.staticplugins.bisto;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95298d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.a */
/* compiled from: PG */
public final class C94635a extends C95454h {

    /* renamed from: a */
    private final C95298d f264702a;

    /* renamed from: b */
    private final C124548d f264703b;

    public C94635a(C95298d dVar, C124548d dVar2) {
        if (dVar != null) {
            this.f264702a = dVar;
            if (dVar2 != null) {
                this.f264703b = dVar2;
                return;
            }
            throw new NullPointerException("Null deviceInfo");
        }
        throw new NullPointerException("Null bistoL1ArbitrationLogger");
    }

    /* renamed from: a */
    public final C95298d mo88562a() {
        return this.f264702a;
    }

    /* renamed from: b */
    public final C124548d mo88563b() {
        return this.f264703b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95454h) {
            C95454h hVar = (C95454h) obj;
            return this.f264702a.equals(hVar.mo88562a()) && this.f264703b.equals(hVar.mo88563b());
        }
    }

    public final int hashCode() {
        return ((this.f264702a.hashCode() ^ 1000003) * 1000003) ^ this.f264703b.hashCode();
    }

    public final String toString() {
        String obj = this.f264702a.toString();
        String obj2 = this.f264703b.toString();
        return "GacsLoggingInfo{bistoL1ArbitrationLogger=" + obj + ", deviceInfo=" + obj2 + "}";
    }
}
