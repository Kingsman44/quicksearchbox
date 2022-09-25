package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.a */
/* compiled from: PG */
final class C105669a extends C105713z {

    /* renamed from: a */
    private final C23056g f294798a;

    /* renamed from: b */
    private final C7718hj f294799b;

    /* renamed from: c */
    private final C7726hr f294800c;

    public C105669a(C23056g gVar, C7718hj hjVar, C7726hr hrVar) {
        if (gVar != null) {
            this.f294798a = gVar;
            if (hjVar != null) {
                this.f294799b = hjVar;
                this.f294800c = hrVar;
                return;
            }
            throw new NullPointerException("Null entry");
        }
        throw new NullPointerException("Null featureController");
    }

    /* renamed from: a */
    public final C23056g mo94956a() {
        return this.f294798a;
    }

    /* renamed from: b */
    public final C7718hj mo94957b() {
        return this.f294799b;
    }

    /* renamed from: c */
    public final C7726hr mo94958c() {
        return this.f294800c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C105713z) {
            C105713z zVar = (C105713z) obj;
            return this.f294798a.equals(zVar.mo94956a()) && this.f294799b.equals(zVar.mo94957b()) && this.f294800c.equals(zVar.mo94958c());
        }
    }

    public final int hashCode() {
        return ((((this.f294798a.hashCode() ^ 1000003) * 1000003) ^ this.f294799b.hashCode()) * 1000003) ^ this.f294800c.hashCode();
    }

    public final String toString() {
        String obj = this.f294798a.toString();
        String obj2 = this.f294799b.toString();
        String obj3 = this.f294800c.toString();
        return "ExpiredEntity{featureController=" + obj + ", entry=" + obj2 + ", entryTreeNode=" + obj3 + "}";
    }
}
