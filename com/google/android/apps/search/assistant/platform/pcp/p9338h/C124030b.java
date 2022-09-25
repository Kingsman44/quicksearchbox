package com.google.android.apps.search.assistant.platform.pcp.p9338h;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.h.b */
/* compiled from: PG */
public final class C124030b extends C124042n {

    /* renamed from: a */
    private final C58833ax f342580a;

    /* renamed from: b */
    private final C58833ax f342581b;

    /* renamed from: c */
    private final C58833ax f342582c;

    /* renamed from: d */
    private final C58833ax f342583d;

    /* renamed from: e */
    private final C58833ax f342584e;

    /* renamed from: f */
    private final C58833ax f342585f;

    /* renamed from: g */
    private final C58833ax f342586g;

    /* renamed from: h */
    private final C58833ax f342587h;

    /* renamed from: i */
    private final C58833ax f342588i;

    /* renamed from: j */
    private final C58833ax f342589j;

    /* renamed from: k */
    private final C58833ax f342590k;

    public C124030b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9, C58833ax axVar10, C58833ax axVar11) {
        this.f342580a = axVar;
        this.f342581b = axVar2;
        this.f342582c = axVar3;
        this.f342583d = axVar4;
        this.f342584e = axVar5;
        this.f342585f = axVar6;
        this.f342586g = axVar7;
        this.f342587h = axVar8;
        this.f342588i = axVar9;
        this.f342589j = axVar10;
        this.f342590k = axVar11;
    }

    /* renamed from: a */
    public final C58833ax mo22558a() {
        return this.f342582c;
    }

    /* renamed from: b */
    public final C58833ax mo22559b() {
        return this.f342587h;
    }

    /* renamed from: c */
    public final C58833ax mo22560c() {
        return this.f342583d;
    }

    /* renamed from: d */
    public final C58833ax mo22561d() {
        return this.f342581b;
    }

    /* renamed from: e */
    public final C58833ax mo22562e() {
        return this.f342580a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124042n) {
            C124042n nVar = (C124042n) obj;
            return this.f342580a.equals(nVar.mo22562e()) && this.f342581b.equals(nVar.mo22561d()) && this.f342582c.equals(nVar.mo22558a()) && this.f342583d.equals(nVar.mo22560c()) && this.f342584e.equals(nVar.mo22565h()) && this.f342585f.equals(nVar.mo22566i()) && this.f342586g.equals(nVar.mo22568k()) && this.f342587h.equals(nVar.mo22559b()) && this.f342588i.equals(nVar.mo22567j()) && this.f342589j.equals(nVar.mo22564g()) && this.f342590k.equals(nVar.mo22563f());
        }
    }

    /* renamed from: f */
    public final C58833ax mo22563f() {
        return this.f342590k;
    }

    /* renamed from: g */
    public final C58833ax mo22564g() {
        return this.f342589j;
    }

    /* renamed from: h */
    public final C58833ax mo22565h() {
        return this.f342584e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f342580a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f342586g.hashCode()) * 1000003) ^ this.f342587h.hashCode()) * 1000003) ^ this.f342588i.hashCode()) * 1000003) ^ this.f342589j.hashCode()) * 1000003) ^ 2040732332;
    }

    /* renamed from: i */
    public final C58833ax mo22566i() {
        return this.f342585f;
    }

    /* renamed from: j */
    public final C58833ax mo22567j() {
        return this.f342588i;
    }

    /* renamed from: k */
    public final C58833ax mo22568k() {
        return this.f342586g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f342580a);
        String valueOf2 = String.valueOf(this.f342586g);
        String valueOf3 = String.valueOf(this.f342587h);
        String valueOf4 = String.valueOf(this.f342588i);
        String valueOf5 = String.valueOf(this.f342589j);
        return "TriggerContext{currentTime=" + valueOf + ", currentLocation=Optional.absent(), autoDrivingStatus=Optional.absent(), connectedPhoneStatus=Optional.absent(), gmmNavigationStatus=Optional.absent(), networkStatus=Optional.absent(), wiredHeadphoneStatus=" + valueOf2 + ", bluetoothA2DPStatus=" + valueOf3 + ", phoneLockState=" + valueOf4 + ", foregroundApp=" + valueOf5 + ", customDeviceContext=Optional.absent()}";
    }
}
