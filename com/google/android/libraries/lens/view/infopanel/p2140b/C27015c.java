package com.google.android.libraries.lens.view.infopanel.p2140b;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.elements.interfaces.C21300g;
import com.google.android.libraries.elements.interfaces.C21301h;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40062d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40066f;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.p5168d.p5169a.C66184b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.c */
/* compiled from: PG */
public final class C27015c implements C27014b {

    /* renamed from: a */
    private static final C58974d f73647a = C58974d.m91135i("ElementsCardRenderer");

    /* renamed from: b */
    private final Context f73648b;

    /* renamed from: c */
    private final C40305b f73649c;

    public C27015c(Context context, C40305b bVar) {
        this.f73648b = context;
        this.f73649c = bVar;
    }

    /* renamed from: a */
    public final View mo32469a(byte[] bArr) {
        C21255ay g = this.f73649c.mo32548g();
        g.mo26715c("ElementsCardRenderer");
        g.mo26718f(false);
        g.mo26716d(false);
        C21300g gVar = new C21300g();
        gVar.f59667a = 4;
        gVar.f59670d = (byte) (gVar.f59670d | 1);
        gVar.mo26760a(0.45f);
        gVar.f59669c = 0.5f;
        gVar.f59670d = (byte) (gVar.f59670d | 60);
        gVar.mo26760a(4.0f);
        if (gVar.f59670d != 63) {
            StringBuilder sb = new StringBuilder();
            if ((gVar.f59670d & 1) == 0) {
                sb.append(" initRangeSize");
            }
            if ((gVar.f59670d & 2) == 0) {
                sb.append(" collectionRangeRatio");
            }
            if ((gVar.f59670d & 4) == 0) {
                sb.append(" binderRangeRatio");
            }
            if ((gVar.f59670d & 8) == 0) {
                sb.append(" recyclerViewItemPrefetch");
            }
            if ((gVar.f59670d & 16) == 0) {
                sb.append(" useLegacyVisible");
            }
            if ((gVar.f59670d & 32) == 0) {
                sb.append(" cleanupOnDetach");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        g.mo26717e(new C21301h(gVar.f59667a, gVar.f59668b, gVar.f59669c));
        C21196h hVar = new C21196h(this.f73648b, g.mo26713a());
        hVar.mo26215b(bArr);
        return hVar;
    }

    /* renamed from: b */
    public final View mo32470b(C54201r rVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C54192i.f142222b);
        rVar.mo58887l(r0);
        Object l = rVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return mo32471c((C57784p) obj);
    }

    /* renamed from: c */
    public final View mo32471c(C57784p pVar) {
        if ((pVar.f154384a & 1) != 0) {
            C40066f j = this.f73649c.mo32551j();
            C66184b bVar = pVar.f154386c;
            if (bVar == null) {
                bVar = C66184b.f179967b;
            }
            j.mo42169b(bVar);
            C40062d i = this.f73649c.mo32550i();
            C57776h hVar = pVar.f154387d;
            if (hVar == null) {
                hVar = C57776h.f154365b;
            }
            i.mo42164a(hVar);
            C63070h hVar2 = pVar.f154385b;
            if (hVar2 == null) {
                hVar2 = C63070h.f170215c;
            }
            return mo32469a(hVar2.f170218b.mo59174N());
        }
        ((C58970a) ((C58970a) f73647a.mo56226d()).mo56372aa(49567)).mo56386p("renderElementsCard(): no element tree found");
        return null;
    }
}
