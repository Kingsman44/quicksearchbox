package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2182b.C28279j;
import com.google.android.libraries.logging.p2182b.C28282m;
import com.google.android.libraries.logging.p2182b.p2183a.p2184a.C28266e;
import com.google.android.libraries.logging.p2185ve.C28445o;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28348a;
import com.google.android.libraries.logging.p2185ve.p2192d.C28352e;
import com.google.android.libraries.logging.p2185ve.p2193e.p2194a.C28354a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63000ds;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.e.b.r */
/* compiled from: PG */
public final class C28397r implements C28279j {

    /* renamed from: a */
    public final C28354a f77159a;

    /* renamed from: b */
    public final C28266e f77160b;

    /* renamed from: c */
    private final C28374aj f77161c;

    public C28397r(C28354a aVar, C28266e eVar, C28374aj ajVar) {
        this.f77159a = aVar;
        this.f77160b = eVar;
        this.f77161c = ajVar;
    }

    /* renamed from: a */
    public final C60870cx mo33778a(C28282m mVar) {
        C28481u uVar;
        C58833ax axVar;
        Object obj;
        C28352e eVar = (C28352e) mVar.f76963a;
        String e = this.f77159a.mo33873e(eVar);
        if (e.isEmpty()) {
            return C60866ct.f164955a;
        }
        C60870cx c = this.f77159a.mo33871c(eVar, mVar.f76964b);
        C28354a aVar = this.f77159a;
        C60870cx cxVar = mVar.f76964b;
        C60870cx g = aVar.mo33875g();
        C60870cx d = this.f77159a.mo33872d(eVar, mVar.f76964b);
        C28374aj ajVar = this.f77161c;
        List list = eVar.f77075b;
        C60870cx cxVar2 = C60866ct.f164955a;
        C28445o oVar = eVar.f77076c.f77225a;
        ArrayList arrayList = new ArrayList();
        ajVar.f77107a.mo33876a(oVar, oVar.f77230c, (C63000ds) null, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ajVar.f77108b.mo33876a(oVar, oVar.f77230c, (C63000ds) null, arrayList2);
        C60870cx a = C60856cj.m92894c(C58431eu.m89653c(arrayList, arrayList2)).mo57334a(new C28373ai(eVar, oVar, arrayList, arrayList2, cxVar2), C60826bg.f164896a);
        if (eVar.f77078e) {
            uVar = C28348a.m53029b(eVar);
        } else {
            uVar = C28348a.m53028a(eVar);
        }
        C62940bt r2 = C62942bv.checkIsLite(C28384e.f77126a);
        uVar.mo58887l(r2);
        if (uVar.f169962ag.mo58857o(r2.f169971d)) {
            C62940bt r22 = C62942bv.checkIsLite(C28384e.f77126a);
            uVar.mo58887l(r22);
            Object l = uVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            axVar = C58833ax.m90834k(Integer.valueOf(((C28383d) obj).f77125b));
        } else {
            axVar = this.f77159a.mo33869a(eVar).mo56106b(C28395p.f77149a);
        }
        C58833ax axVar2 = axVar;
        return C60856cj.m92895d(c, a, g, d).mo57335b(C47810es.m84965e(new C28396q(this, e, c, a, axVar2, g, eVar, d, mVar)), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final Set mo33779b() {
        return new C58759qy(C28352e.class);
    }
}
