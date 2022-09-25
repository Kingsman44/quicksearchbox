package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.ondevice.p2018b.C24274b;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62331d;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.s */
/* compiled from: PG */
public final /* synthetic */ class C27902s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27852ai f76009a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f76010b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f76011c;

    /* renamed from: d */
    public final /* synthetic */ boolean f76012d;

    /* renamed from: e */
    public final /* synthetic */ boolean f76013e;

    public /* synthetic */ C27902s(C27852ai aiVar, C58495hd hdVar, C58485gu guVar, boolean z, boolean z2) {
        this.f76009a = aiVar;
        this.f76010b = hdVar;
        this.f76011c = guVar;
        this.f76012d = z;
        this.f76013e = z2;
    }

    public final Object call() {
        Object obj;
        C27852ai aiVar = this.f76009a;
        C58495hd hdVar = this.f76010b;
        C58485gu guVar = this.f76011c;
        boolean z = this.f76012d;
        boolean z2 = this.f76013e;
        if (hdVar.isEmpty()) {
            ((C58970a) ((C58970a) C27852ai.f75920a.mo56226d()).mo56372aa(50019)).mo56386p("No dependency results returned");
            return C27851ah.m51869c();
        }
        int i = 0;
        C27891h hVar = (C27891h) guVar.get(0);
        C60870cx cxVar = (C60870cx) hdVar.get(hVar);
        cxVar.getClass();
        if (z && !((C24274b) C60856cj.m92909r(cxVar)).mo29804b()) {
            C24823o oVar = aiVar.f75922c;
            C62331d d = hVar.mo33347d();
            C24795f b = hVar.mo33345b();
            oVar.f67848e.mo29921j();
            oVar.f67848e.mo29917f(oVar.f67848e.mo29916d(oVar.f67847d.mo29999c(d)), b, false);
        }
        C27896m mVar = aiVar.f75926g;
        C27899p pVar = new C27899p(hdVar);
        if (guVar.isEmpty()) {
            obj = C27851ah.m51869c();
        } else {
            Stream stream = Collection.EL.stream(guVar);
            Objects.requireNonNull(pVar);
            C58833ax j = C58833ax.m90833j((C27891h) stream.filter(new C27895l(pVar)).findFirst().orElse(null));
            if (!j.mo56113h()) {
                obj = C27851ah.m51869c();
            } else {
                C58833ax axVar = C58836b.f156633a;
                if (z2 && mVar.f76005a != C62331d.UNKNOWN) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= guVar.size()) {
                            break;
                        } else if (((C27891h) guVar.get(i2)).mo33347d() == mVar.f76005a) {
                            i = i2 + 1;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                while (true) {
                    if (i >= guVar.size()) {
                        break;
                    }
                    C27891h hVar2 = (C27891h) guVar.get(i);
                    if (pVar.mo5941a(hVar2)) {
                        axVar = C58833ax.m90834k(hVar2);
                        break;
                    }
                    i++;
                }
                obj = new C27887d(j, axVar);
            }
        }
        C27887d dVar = (C27887d) obj;
        if (!dVar.f75996b.mo56113h()) {
            ((C58970a) ((C58970a) C27852ai.f75920a.mo56224b()).mo56372aa(50018)).mo56386p("Cannot find a cascade with satisfied dependencies");
        }
        C58833ax axVar2 = dVar.f75995a;
        if (!axVar2.mo56113h()) {
            return obj;
        }
        C27891h hVar3 = (C27891h) axVar2.mo56107c();
        C60870cx cxVar2 = (C60870cx) hdVar.get(hVar3);
        cxVar2.getClass();
        C63240m e = C24473a.m45546e((C24803n) ((C24274b) C60856cj.m92909r(cxVar2)).mo29803a().mo56107c());
        C27890g c = hVar3.mo33346c();
        c.mo33312d(e);
        return new C27887d(C58833ax.m90834k(c.mo33309a()), dVar.f75996b);
    }
}
