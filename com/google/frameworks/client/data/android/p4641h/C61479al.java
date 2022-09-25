package com.google.frameworks.client.data.android.p4641h;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70851i;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.al */
/* compiled from: PG */
public final class C61479al {

    /* renamed from: a */
    public static final C61479al f166225a = new C61479al(1, (C61474ag) null, (C60870cx) null, (C70851i) null);

    /* renamed from: b */
    public static final C61479al f166226b = new C61479al(5, (C61474ag) null, (C60870cx) null, (C70851i) null);

    /* renamed from: c */
    public final C61478ak f166227c = null;

    /* renamed from: d */
    public final C61474ag f166228d;

    /* renamed from: e */
    public final C70851i f166229e;

    /* renamed from: f */
    public final int f166230f;

    /* renamed from: g */
    private final C60870cx f166231g;

    private C61479al(int i, C61474ag agVar, C60870cx cxVar, C70851i iVar) {
        this.f166230f = i;
        this.f166228d = agVar;
        this.f166231g = cxVar;
        this.f166229e = iVar;
    }

    /* renamed from: c */
    public static C61479al m94190c(C60870cx cxVar) {
        cxVar.getClass();
        return new C61479al(4, (C61474ag) null, cxVar, (C70851i) null);
    }

    /* renamed from: d */
    public static C61479al m94191d(C70851i iVar) {
        return new C61479al(1, (C61474ag) null, (C60870cx) null, iVar);
    }

    /* renamed from: a */
    public final C60870cx mo58078a() {
        C58838bb.m90883r(this.f166230f == 4);
        return this.f166231g;
    }

    /* renamed from: b */
    public static C61479al m94189b(Status status, C70334de deVar) {
        status.getClass();
        C58838bb.m90884s(!status.mo61679g(), "Error status must not be ok");
        return new C61479al(2, new C61474ag(status, deVar), (C60870cx) null, (C70851i) null);
    }
}
