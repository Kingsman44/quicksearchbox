package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.y */
/* compiled from: PG */
final class C77278y extends C77185bk {

    /* renamed from: a */
    private final C77188bn f213141a;

    /* renamed from: b */
    private final boolean f213142b;

    /* renamed from: c */
    private final C77183bi f213143c;

    /* renamed from: d */
    private final C77186bl f213144d;

    /* renamed from: e */
    private final boolean f213145e;

    /* renamed from: f */
    private final Optional f213146f;

    /* renamed from: g */
    private final C83216f f213147g;

    public C77278y(C77188bn bnVar, boolean z, C77183bi biVar, C77186bl blVar, boolean z2, Optional optional, C83216f fVar) {
        this.f213141a = bnVar;
        this.f213142b = z;
        this.f213143c = biVar;
        this.f213144d = blVar;
        this.f213145e = z2;
        this.f213146f = optional;
        this.f213147g = fVar;
    }

    /* renamed from: a */
    public final C77183bi mo72473a() {
        return this.f213143c;
    }

    /* renamed from: b */
    public final C77186bl mo72474b() {
        return this.f213144d;
    }

    /* renamed from: c */
    public final C77188bn mo72475c() {
        return this.f213141a;
    }

    /* renamed from: d */
    public final C83216f mo72476d() {
        return this.f213147g;
    }

    /* renamed from: e */
    public final Optional mo72477e() {
        return this.f213146f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77185bk) {
            C77185bk bkVar = (C77185bk) obj;
            return this.f213141a.equals(bkVar.mo72475c()) && this.f213142b == bkVar.mo72478f() && this.f213143c.equals(bkVar.mo72473a()) && this.f213144d.equals(bkVar.mo72474b()) && this.f213145e == bkVar.mo72479g() && this.f213146f.equals(bkVar.mo72477e()) && this.f213147g.equals(bkVar.mo72476d());
        }
    }

    /* renamed from: f */
    public final boolean mo72478f() {
        return this.f213142b;
    }

    /* renamed from: g */
    public final boolean mo72479g() {
        return this.f213145e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f213141a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f213142b ? 1237 : 1231)) * 1000003) ^ this.f213143c.hashCode()) * 1000003) ^ this.f213144d.hashCode()) * 1000003;
        if (true == this.f213145e) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f213146f.hashCode()) * 1000003) ^ this.f213147g.hashCode();
    }

    public final String toString() {
        String obj = this.f213141a.toString();
        boolean z = this.f213142b;
        String obj2 = this.f213143c.toString();
        String obj3 = this.f213144d.toString();
        boolean z2 = this.f213145e;
        String valueOf = String.valueOf(this.f213146f);
        String obj4 = this.f213147g.toString();
        return "GenericAlarmFulfillmentConfig{genericAlarmFulfiller=" + obj + ", allowedWhenAlarmIsRinging=" + z + ", filter=" + obj2 + ", onMatch=" + obj3 + ", onDeviceExecutionRequired=" + z2 + ", noAccessFulfiller=" + valueOf + ", fulfillerLogger=" + obj4 + "}";
    }
}
