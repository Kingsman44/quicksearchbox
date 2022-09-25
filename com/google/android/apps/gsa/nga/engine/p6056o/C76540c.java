package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.android.apps.gsa.nga.engine.p5913am.p5945z.C74980b;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c */
/* compiled from: PG */
public final class C76540c extends C77420n {

    /* renamed from: a */
    public final C63490p f211762a;

    /* renamed from: b */
    public final C74980b f211763b;

    public C76540c(C63490p pVar, C74980b bVar) {
        if (pVar != null) {
            this.f211762a = pVar;
            if (bVar != null) {
                this.f211763b = bVar;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null deviceSetting");
    }

    /* renamed from: a */
    public final C74980b mo72237a() {
        return this.f211763b;
    }

    /* renamed from: b */
    public final C63490p mo72238b() {
        return this.f211762a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77420n) {
            C77420n nVar = (C77420n) obj;
            return this.f211762a.equals(nVar.mo72238b()) && this.f211763b.equals(nVar.mo72237a());
        }
    }

    public final int hashCode() {
        return ((this.f211762a.hashCode() ^ 1000003) * 1000003) ^ this.f211763b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f211762a.getNumber());
        String obj = this.f211763b.toString();
        return "DeviceSettingWithValue{deviceSetting=" + num + ", value=" + obj + "}";
    }
}
