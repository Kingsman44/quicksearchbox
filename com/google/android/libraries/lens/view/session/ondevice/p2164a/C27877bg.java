package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24275a;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.p2056af.C25059bd;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.session.ondevice.C28014w;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4172bg.p4174b.C55717f;
import com.google.p4172bg.p4174b.C55718g;
import com.google.p4172bg.p4174b.C55719h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.bg */
/* compiled from: PG */
public final class C27877bg implements C27879bi {

    /* renamed from: a */
    public static final C58974d f75975a = C58974d.m91135i("LensOnDeviceEngineClientImpl");

    /* renamed from: b */
    public final C24823o f75976b;

    /* renamed from: c */
    public final C37215b f75977c;

    /* renamed from: d */
    public final C27852ai f75978d;

    /* renamed from: e */
    public C58833ax f75979e;

    /* renamed from: f */
    public C58833ax f75980f;

    /* renamed from: g */
    public C28014w f75981g;

    /* renamed from: h */
    private final LensConnectivityManager f75982h;

    /* renamed from: i */
    private C58833ax f75983i;

    public C27877bg(C24823o oVar, C37215b bVar, C25059bd bdVar, C27852ai aiVar, LensConnectivityManager lensConnectivityManager) {
        C58836b bVar2 = C58836b.f156633a;
        this.f75983i = bVar2;
        this.f75979e = bVar2;
        this.f75980f = bVar2;
        this.f75976b = oVar;
        this.f75977c = bVar;
        this.f75978d = aiVar;
        oVar.f67846c.f67193a.add(bdVar);
        this.f75982h = lensConnectivityManager;
    }

    /* renamed from: b */
    static C55719h m51907b(C55719h hVar) {
        C55718g gVar = (C55718g) C55719h.f147013b.createBuilder();
        for (int i = 0; i < hVar.f147015a.size(); i++) {
            if (((C55717f) hVar.f147015a.get(i)).f147008a > 0.52f) {
                C55717f fVar = (C55717f) hVar.f147015a.get(i);
                gVar.copyOnWrite();
                C55719h hVar2 = (C55719h) gVar.instance;
                fVar.getClass();
                C62971cq cqVar = hVar2.f147015a;
                if (!cqVar.mo58948c()) {
                    hVar2.f147015a = C62942bv.mutableCopy(cqVar);
                }
                hVar2.f147015a.add(fVar);
            }
        }
        return (C55719h) gVar.build();
    }

    /* renamed from: g */
    public static boolean m51908g(C60870cx cxVar) {
        if (!cxVar.isDone()) {
            return false;
        }
        try {
            C60856cj.m92909r(cxVar);
            return true;
        } catch (IllegalStateException | ExecutionException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C27654a mo33352a() {
        return C27857an.f75935a;
    }

    /* renamed from: c */
    public final void mo33353c(C56244ay ayVar, C24201ad adVar) {
        C63088z b = adVar.mo29681d().mo29692b();
        Bitmap c = adVar.mo29678a().mo29707c();
        C56220aa b2 = adVar.mo29679b().mo29685b();
        if (!this.f75983i.mo56113h()) {
            ((C58970a) ((C58970a) f75975a.mo56226d()).mo56372aa(50037)).mo56386p("Attempting to call handleImage() before engine was started.");
            return;
        }
        C24275a aVar = new C24275a();
        aVar.f66317a = C58833ax.m90833j(c);
        aVar.f66319c = C58833ax.m90833j(b2);
        aVar.f66320d = C58833ax.m90833j((Object) null);
        aVar.f66321e = C58833ax.m90833j(b);
        C47633f i = C47633f.m84733g((C60870cx) this.f75983i.mo56107c()).mo51516i(new C27860aq(this, aVar), C60826bg.f164896a);
        C27868ay ayVar2 = new C27868ay(this, ayVar, c);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(ayVar2), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo33354d(C56280cg cgVar) {
        mo33355e(cgVar);
    }

    /* renamed from: e */
    public final void mo33355e(C56280cg cgVar) {
        ((C58970a) ((C58970a) f75975a.mo56224b()).mo56372aa(50043)).mo56386p("Starting Cascade");
        C27852ai aiVar = this.f75978d;
        C47633f i = C47633f.m84733g(aiVar.f75925f.mo33327b()).mo51515h(new C27909z(aiVar, new C27886c(cgVar, ((Boolean) this.f75982h.mo30903g().mo3842a()).booleanValue())), C60826bg.f164896a).mo51516i(new C27844aa(aiVar), C60826bg.f164896a);
        C27859ap apVar = new C27859ap(this);
        this.f75983i = C58833ax.m90834k(C60922j.m93045h(i, C47810es.m84966f(apVar), C60826bg.f164896a));
    }

    /* renamed from: f */
    public final void mo33356f() {
        if (this.f75983i.mo56113h()) {
            this.f75976b.mo30023e();
            C58836b bVar = C58836b.f156633a;
            this.f75983i = bVar;
            this.f75980f = bVar;
        }
    }

    /* renamed from: h */
    public final boolean mo33357h() {
        return this.f75983i.mo56113h();
    }

    /* renamed from: i */
    public final void mo33358i(C28014w wVar) {
        this.f75981g = wVar;
    }
}
