package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.g.ac;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j */
/* compiled from: PG */
public final class C77674j extends C77891w {

    /* renamed from: a */
    public final C77889u f213954a;

    /* renamed from: b */
    private final ac f213955b;

    public C77674j(ac acVar, C77889u uVar) {
        if (acVar != null) {
            this.f213955b = acVar;
            if (uVar != null) {
                this.f213954a = uVar;
                return;
            }
            throw new NullPointerException("Null triggeringEngine");
        }
        throw new NullPointerException("Null utteranceIdentifier");
    }

    /* renamed from: a */
    public final ac mo72766a() {
        return this.f213955b;
    }

    /* renamed from: b */
    public final C77889u mo72767b() {
        return this.f213954a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77891w) {
            C77891w wVar = (C77891w) obj;
            return this.f213955b.equals(wVar.mo72766a()) && this.f213954a.equals(wVar.mo72767b());
        }
    }

    public final int hashCode() {
        return ((this.f213955b.hashCode() ^ 1000003) * 1000003) ^ this.f213954a.hashCode();
    }

    public final String toString() {
        String obj = this.f213955b.toString();
        String obj2 = this.f213954a.toString();
        return "InitialEventData{utteranceIdentifier=" + obj + ", triggeringEngine=" + obj2 + "}";
    }
}
