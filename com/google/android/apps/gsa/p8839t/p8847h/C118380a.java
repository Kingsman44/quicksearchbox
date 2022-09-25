package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.t.h.a */
/* compiled from: PG */
final class C118380a extends C118448x {

    /* renamed from: a */
    private final C58833ax f328591a;

    /* renamed from: b */
    private final C58833ax f328592b;

    /* renamed from: c */
    private final C58833ax f328593c;

    /* renamed from: d */
    private final C58833ax f328594d;

    /* renamed from: e */
    private final C58833ax f328595e;

    /* renamed from: f */
    private final C58833ax f328596f;

    /* renamed from: g */
    private final C58833ax f328597g;

    /* renamed from: h */
    private final C58833ax f328598h;

    /* renamed from: i */
    private final C58833ax f328599i;

    /* renamed from: j */
    private final C58833ax f328600j;

    /* renamed from: k */
    private final C58833ax f328601k;

    public C118380a(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9, C58833ax axVar10, C58833ax axVar11) {
        this.f328591a = axVar;
        this.f328592b = axVar2;
        this.f328593c = axVar3;
        this.f328594d = axVar4;
        this.f328595e = axVar5;
        this.f328596f = axVar6;
        this.f328597g = axVar7;
        this.f328598h = axVar8;
        this.f328599i = axVar9;
        this.f328600j = axVar10;
        this.f328601k = axVar11;
    }

    /* renamed from: a */
    public final C58833ax mo22558a() {
        return this.f328593c;
    }

    /* renamed from: b */
    public final C58833ax mo22559b() {
        return this.f328598h;
    }

    /* renamed from: c */
    public final C58833ax mo22560c() {
        return this.f328594d;
    }

    /* renamed from: d */
    public final C58833ax mo22561d() {
        return this.f328592b;
    }

    /* renamed from: e */
    public final C58833ax mo22562e() {
        return this.f328591a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C118448x) {
            C118448x xVar = (C118448x) obj;
            return this.f328591a.equals(xVar.mo22562e()) && this.f328592b.equals(xVar.mo22561d()) && this.f328593c.equals(xVar.mo22558a()) && this.f328594d.equals(xVar.mo22560c()) && this.f328595e.equals(xVar.mo22565h()) && this.f328596f.equals(xVar.mo22566i()) && this.f328597g.equals(xVar.mo22568k()) && this.f328598h.equals(xVar.mo22559b()) && this.f328599i.equals(xVar.mo22567j()) && this.f328600j.equals(xVar.mo22564g()) && this.f328601k.equals(xVar.mo22563f());
        }
    }

    /* renamed from: f */
    public final C58833ax mo22563f() {
        return this.f328601k;
    }

    /* renamed from: g */
    public final C58833ax mo22564g() {
        return this.f328600j;
    }

    /* renamed from: h */
    public final C58833ax mo22565h() {
        return this.f328595e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f328591a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f328597g.hashCode()) * 1000003) ^ this.f328598h.hashCode()) * 1000003) ^ this.f328599i.hashCode()) * 1000003) ^ this.f328600j.hashCode()) * 1000003) ^ 2040732332;
    }

    /* renamed from: i */
    public final C58833ax mo22566i() {
        return this.f328596f;
    }

    /* renamed from: j */
    public final C58833ax mo22567j() {
        return this.f328599i;
    }

    /* renamed from: k */
    public final C58833ax mo22568k() {
        return this.f328597g;
    }

    public final String toString() {
        String obj = this.f328591a.toString();
        String obj2 = this.f328597g.toString();
        String obj3 = this.f328598h.toString();
        String obj4 = this.f328599i.toString();
        String obj5 = this.f328600j.toString();
        return "TriggerContext{currentTime=" + obj + ", currentLocation=Optional.absent(), autoDrivingStatus=Optional.absent(), connectedPhoneStatus=Optional.absent(), gmmNavigationStatus=Optional.absent(), networkStatus=Optional.absent(), wiredHeadphoneStatus=" + obj2 + ", bluetoothA2DPStatus=" + obj3 + ", phoneLockState=" + obj4 + ", foregroundApp=" + obj5 + ", customDeviceContext=Optional.absent()}";
    }
}
