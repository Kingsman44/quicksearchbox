package com.google.android.apps.gsa.staticplugins.p8793w.p8827i;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.i.a */
/* compiled from: PG */
public final class C118082a extends C118083b {

    /* renamed from: a */
    private final C58833ax f327707a;

    /* renamed from: b */
    private final C60870cx f327708b;

    /* renamed from: c */
    private final C58833ax f327709c;

    public C118082a(C58833ax axVar, C60870cx cxVar, C58833ax axVar2) {
        if (axVar != null) {
            this.f327707a = axVar;
            if (cxVar != null) {
                this.f327708b = cxVar;
                if (axVar2 != null) {
                    this.f327709c = axVar2;
                    return;
                }
                throw new NullPointerException("Null clientLogs");
            }
            throw new NullPointerException("Null ttsResult");
        }
        throw new NullPointerException("Null searchResult");
    }

    /* renamed from: a */
    public final C58833ax mo103507a() {
        return this.f327709c;
    }

    /* renamed from: b */
    public final C58833ax mo103508b() {
        return this.f327707a;
    }

    /* renamed from: c */
    public final C60870cx mo103509c() {
        return this.f327708b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C118083b) {
            C118083b bVar = (C118083b) obj;
            return this.f327707a.equals(bVar.mo103508b()) && this.f327708b.equals(bVar.mo103509c()) && this.f327709c.equals(bVar.mo103507a());
        }
    }

    public final int hashCode() {
        return ((((this.f327707a.hashCode() ^ 1000003) * 1000003) ^ this.f327708b.hashCode()) * 1000003) ^ this.f327709c.hashCode();
    }

    public final String toString() {
        String obj = this.f327707a.toString();
        String obj2 = this.f327708b.toString();
        String obj3 = this.f327709c.toString();
        return "FulfillmentResult{searchResult=" + obj + ", ttsResult=" + obj2 + ", clientLogs=" + obj3 + "}";
    }
}
