package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.aq */
/* compiled from: PG */
final class C123309aq extends C123295ac {

    /* renamed from: a */
    public final C58528ij f341050a;

    /* renamed from: b */
    public final C58528ij f341051b;

    public C123309aq(C58528ij ijVar, C58528ij ijVar2) {
        if (ijVar != null) {
            this.f341050a = ijVar;
            if (ijVar2 != null) {
                this.f341051b = ijVar2;
                return;
            }
            throw new NullPointerException("Null supportedUrls");
        }
        throw new NullPointerException("Null supportedPackages");
    }

    /* renamed from: a */
    public final C58528ij mo105915a() {
        return this.f341050a;
    }

    /* renamed from: b */
    public final C58528ij mo105916b() {
        return this.f341051b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123295ac) {
            C123295ac acVar = (C123295ac) obj;
            return this.f341050a.equals(acVar.mo105915a()) && this.f341051b.equals(acVar.mo105916b());
        }
    }

    public final int hashCode() {
        return ((this.f341050a.hashCode() ^ 1000003) * 1000003) ^ this.f341051b.hashCode();
    }

    public final String toString() {
        String obj = this.f341050a.toString();
        String obj2 = this.f341051b.toString();
        return "AssistedBrowseSearchUnderstandingResources{supportedPackages=" + obj + ", supportedUrls=" + obj2 + "}";
    }
}
