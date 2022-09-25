package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.lens.ondevice.f.b */
/* compiled from: PG */
public final class C24472b extends C24490s {

    /* renamed from: a */
    public final C58528ij f66985a;

    /* renamed from: b */
    public final C58512hu f66986b;

    public C24472b(C58528ij ijVar, C58512hu huVar) {
        if (ijVar != null) {
            this.f66985a = ijVar;
            if (huVar != null) {
                this.f66986b = huVar;
                return;
            }
            throw new NullPointerException("Null modelCriteriaToPrimitiveNames");
        }
        throw new NullPointerException("Null modelDataRequests");
    }

    /* renamed from: a */
    public final C58512hu mo29907a() {
        return this.f66986b;
    }

    /* renamed from: b */
    public final C58528ij mo29908b() {
        return this.f66985a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24490s) {
            C24490s sVar = (C24490s) obj;
            return this.f66985a.equals(sVar.mo29908b()) && this.f66986b.equals(sVar.mo29907a());
        }
    }

    public final int hashCode() {
        return ((this.f66985a.hashCode() ^ 1000003) * 1000003) ^ this.f66986b.hashCode();
    }

    public final String toString() {
        String obj = this.f66985a.toString();
        String obj2 = this.f66986b.toString();
        return "UniqueModelDataRequests{modelDataRequests=" + obj + ", modelCriteriaToPrimitiveNames=" + obj2 + "}";
    }
}
