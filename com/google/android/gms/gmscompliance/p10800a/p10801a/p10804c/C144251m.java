package com.google.android.gms.gmscompliance.p10800a.p10801a.p10804c;

import com.google.android.gms.gmscompliance.C144266b;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10803b.C144233a;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10803b.C144234b;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10805d.C144253a;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10806e.C144259e;
import com.google.android.gms.libs.p10830b.p10832b.C144835a;
import com.google.android.gms.libs.p10830b.p10832b.C144843d;
import com.google.android.gms.libs.p10830b.p10832b.C144848i;
import com.google.android.gms.libs.p10830b.p10832b.C144849j;
import com.google.android.gms.libs.p10830b.p10832b.p10833a.C144836a;
import com.google.android.gms.libs.p10830b.p10832b.p10833a.C144839d;
import com.google.android.gms.libs.p10830b.p10832b.p10833a.C144840e;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4046e.p4047a.p4048a.C53921b;
import com.google.p4017at.p4046e.p4047a.p4048a.C53925f;
import com.google.p4017at.p4046e.p4047a.p4048a.C53927h;
import com.google.p4017at.p4046e.p4047a.p4048a.C53928i;
import com.google.p4017at.p4046e.p4047a.p4048a.C53929j;
import com.google.p4017at.p4046e.p4047a.p4048a.C53931l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.gmscompliance.a.a.c.m */
/* compiled from: PG */
public final class C144251m {

    /* renamed from: a */
    public static final C144253a f390698a = new C144253a("UdevsVerdict");

    /* renamed from: b */
    public final Executor f390699b;

    /* renamed from: c */
    public final C144259e f390700c;

    /* renamed from: d */
    public final boolean f390701d = false;

    /* renamed from: e */
    public final boolean f390702e = false;

    /* renamed from: f */
    public final C144234b f390703f;

    /* renamed from: g */
    private final C144266b f390704g;

    public C144251m(Executor executor, C144234b bVar, C144266b bVar2, C144259e eVar, boolean z, boolean z2) {
        this.f390699b = executor;
        this.f390703f = bVar;
        this.f390704g = bVar2;
        this.f390700c = eVar;
    }

    /* renamed from: a */
    public static C144839d m234490a(C53929j jVar, C144849j jVar2, boolean z) {
        C58833ax axVar;
        C144848i c = jVar2.mo6453a();
        C144836a aVar = new C144836a();
        try {
            C53928i iVar = (C53928i) C62942bv.parseFrom((C62942bv) C53928i.f141500i, jVar.f141513b, C62921ba.m95368a());
            if ((1 & iVar.f141502a) != 0) {
                aVar.f391683c = C58833ax.m90834k(iVar.f141503b);
            }
            if (z) {
                long j = ((C144843d) c).f391697c;
                if ((iVar.f141502a & 4) != 0) {
                    C63042fg fgVar = iVar.f141505d;
                    if (fgVar == null) {
                        fgVar = C63042fg.f170152c;
                    }
                    if (C144840e.m235402a(fgVar, j, TimeUnit.DAYS.toMillis(-30), TimeUnit.DAYS.toMillis(3))) {
                        if ((iVar.f141502a & 8) != 0) {
                            C63042fg fgVar2 = iVar.f141506e;
                            if (fgVar2 == null) {
                                fgVar2 = C63042fg.f170152c;
                            }
                            if (C144840e.m235402a(fgVar2, j, TimeUnit.DAYS.toMillis(0), TimeUnit.DAYS.toMillis(30))) {
                                axVar = C58836b.f156633a;
                            }
                        }
                        axVar = C58833ax.m90834k(3);
                    }
                }
                axVar = C58833ax.m90834k(2);
            } else {
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                aVar.mo120259b(((Integer) axVar.mo56107c()).intValue());
                return aVar.mo120258a();
            }
            int i = iVar.f141502a;
            if (!((i & 32) == 0 || (i & 16) == 0)) {
                C53921b bVar = iVar.f141508g;
                if (bVar == null) {
                    bVar = C53921b.f141481i;
                }
                C53931l lVar = iVar.f141507f;
                if (lVar == null) {
                    lVar = C53931l.f141514d;
                }
                C144843d dVar = (C144843d) c;
                if (((C144835a) dVar.f391695a).f391673a.equals(bVar.f141483a) && ((C144835a) dVar.f391695a).f391674b.equals(bVar.f141484b) && ((C144835a) dVar.f391695a).f391675c.equals(bVar.f141485c) && ((C144835a) dVar.f391695a).f391676d.equals(bVar.f141486d) && ((C144835a) dVar.f391695a).f391677e.equals(bVar.f141488f) && ((C144835a) dVar.f391695a).f391678f.equals(bVar.f141487e) && ((C144835a) dVar.f391695a).f391679g.equals(bVar.f141489g) && ((C144835a) dVar.f391695a).f391680h.intValue() == bVar.f141490h && ((dVar.f391696b.mo120274b().mo56113h() && C63088z.m96139A((byte[]) dVar.f391696b.mo120274b().mo56107c()).equals(lVar.f141518c)) || (dVar.f391696b.mo120273a().mo56113h() && ((Long) dVar.f391696b.mo120273a().mo56107c()).longValue() == lVar.f141517b))) {
                    if ((iVar.f141502a & 128) != 0) {
                        C53927h hVar = iVar.f141509h;
                        if (hVar == null) {
                            hVar = C53927h.f141498a;
                        }
                        aVar.f391684d = C58833ax.m90834k(hVar);
                    }
                    C53925f a = C53925f.m87061a(iVar.f141504c);
                    if (a == null) {
                        a = C53925f.UNKNOWN;
                    }
                    aVar.f391681a = C58833ax.m90834k(a);
                    aVar.f391682b = C58833ax.m90834k(jVar);
                    return aVar.mo120258a();
                }
            }
            aVar.mo120259b(4);
            return aVar.mo120258a();
        } catch (C62974ct unused) {
            aVar.mo120259b(1);
            return aVar.mo120258a();
        }
    }

    /* renamed from: b */
    public static C58833ax m234491b(C53929j jVar) {
        return m234492c(C144239a.m234483b(jVar), C144244f.f390691a).mo56106b(C144245g.f390692a);
    }

    /* renamed from: c */
    public static C58833ax m234492c(C58833ax axVar, C58839bc bcVar) {
        return (!axVar.mo56113h() || !bcVar.mo5941a(axVar.mo56107c())) ? C58836b.f156633a : axVar;
    }

    /* renamed from: g */
    public static boolean m234493g(C53929j jVar, C144849j jVar2) {
        return m234490a(jVar, jVar2, true).mo120260a().mo56113h();
    }

    /* renamed from: d */
    public final C58833ax mo119784d(C58833ax axVar) {
        return m234492c(axVar, new C144247i(this.f390700c.mo119789a()));
    }

    /* renamed from: e */
    public final C60870cx mo119785e() {
        return C60922j.m93045h(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C43205e.m76192b(this.f390704g.mo119796a())), C144248j.f390695a, this.f390699b), Exception.class, C144249k.f390696a, this.f390699b), new C144250l(this), this.f390699b);
    }

    /* renamed from: f */
    public final C60870cx mo119786f(C53929j jVar) {
        C144234b bVar = this.f390703f;
        return C60922j.m93044g(C60838bs.m92859i(C60856cj.m92905n(new C144233a(bVar, jVar), bVar.f390678a)), new C144246h(jVar), this.f390699b);
    }
}
