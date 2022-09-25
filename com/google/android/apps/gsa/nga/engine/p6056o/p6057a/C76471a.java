package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.a */
/* compiled from: PG */
final class C76471a extends C76500bb {

    /* renamed from: a */
    public final C80401n f211642a;

    /* renamed from: b */
    public final C82835ce f211643b;

    public C76471a(C80401n nVar, C82835ce ceVar) {
        if (nVar != null) {
            this.f211642a = nVar;
            if (ceVar != null) {
                this.f211643b = ceVar;
                return;
            }
            throw new NullPointerException("Null fulfillmentAbortType");
        }
        throw new NullPointerException("Null onDeviceFulfillerResponse");
    }

    /* renamed from: a */
    public final C82835ce mo72206a() {
        return this.f211643b;
    }

    /* renamed from: b */
    public final C80401n mo72207b() {
        return this.f211642a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76500bb) {
            C76500bb bbVar = (C76500bb) obj;
            return this.f211642a.equals(bbVar.mo72207b()) && this.f211643b.equals(bbVar.mo72206a());
        }
    }

    public final int hashCode() {
        return ((this.f211642a.hashCode() ^ 1000003) * 1000003) ^ this.f211643b.hashCode();
    }

    public final String toString() {
        String obj = this.f211642a.toString();
        String num = Integer.toString(this.f211643b.f225873aj);
        return "Response{onDeviceFulfillerResponse=" + obj + ", fulfillmentAbortType=" + num + "}";
    }
}
