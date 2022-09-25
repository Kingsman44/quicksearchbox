package com.google.android.libraries.search.assistant.p2828y.p2850k;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.k.b */
/* compiled from: PG */
public final class C36983b {

    /* renamed from: a */
    public final C51313db f96301a;

    /* renamed from: b */
    public final C51333dv f96302b;

    /* renamed from: c */
    public final C51300cp f96303c;

    /* renamed from: d */
    public final C51319dh f96304d;

    /* renamed from: e */
    public final C51331dt f96305e;

    /* renamed from: f */
    public final boolean f96306f;

    /* renamed from: g */
    public final C39226b f96307g;

    /* renamed from: h */
    private final boolean f96308h;

    public /* synthetic */ C36983b(C51313db dbVar, C51333dv dvVar, C51300cp cpVar, C51319dh dhVar, C51331dt dtVar, C39226b bVar, int i) {
        boolean z = (i & 64) != 0;
        bVar = (i & 128) != 0 ? null : bVar;
        C69664n.m101061g(dbVar, "entrySource");
        C69664n.m101061g(dvVar, "userCredentialStatus");
        C69664n.m101061g(cpVar, "assistantOnLockscreen");
        C69664n.m101061g(dhVar, "lockscreenPuntDecision");
        C69664n.m101061g(dtVar, "triggerTrustLevel");
        this.f96301a = dbVar;
        this.f96302b = dvVar;
        this.f96303c = cpVar;
        this.f96304d = dhVar;
        this.f96305e = dtVar;
        this.f96308h = false;
        this.f96306f = z;
        this.f96307g = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36983b)) {
            return false;
        }
        C36983b bVar = (C36983b) obj;
        if (this.f96301a != bVar.f96301a || this.f96302b != bVar.f96302b || this.f96303c != bVar.f96303c || this.f96304d != bVar.f96304d || this.f96305e != bVar.f96305e) {
            return false;
        }
        boolean z = bVar.f96308h;
        return this.f96306f == bVar.f96306f && this.f96307g == bVar.f96307g;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.f96301a.hashCode() * 31) + this.f96302b.hashCode()) * 31) + this.f96303c.hashCode()) * 31) + this.f96304d.hashCode()) * 31) + this.f96305e.hashCode()) * 961) + (this.f96306f ? 1 : 0)) * 31;
        C39226b bVar = this.f96307g;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        C51313db dbVar = this.f96301a;
        C51333dv dvVar = this.f96302b;
        C51300cp cpVar = this.f96303c;
        C51319dh dhVar = this.f96304d;
        C51331dt dtVar = this.f96305e;
        boolean z = this.f96306f;
        C39226b bVar = this.f96307g;
        return "DevicePropertiesConfiguration(entrySource=" + dbVar + ", userCredentialStatus=" + dvVar + ", assistantOnLockscreen=" + cpVar + ", lockscreenPuntDecision=" + dhVar + ", triggerTrustLevel=" + dtVar + ", personalResponseOnLockscreen=false, fetchLocation=" + z + ", attributionId=" + bVar + ")";
    }
}
