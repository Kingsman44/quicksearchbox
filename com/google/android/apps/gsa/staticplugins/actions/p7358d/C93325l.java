package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.p6931i.C87572a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.p4152bb.p4153a.C55122gr;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55354pg;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55360pm;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.l */
/* compiled from: PG */
public final class C93325l extends C93326m {

    /* renamed from: f */
    private static final C58528ij f260282f = C58528ij.m90011K("android.intent.action.SENDTO", "com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS");

    public C93325l(Context context, PackageManager packageManager, C87449m mVar, boolean z, C93327n nVar, C68214a aVar, C87572a aVar2) {
        super(context, packageManager, mVar, z, nVar, aVar, aVar2);
    }

    /* renamed from: d */
    public final MatchingProviderInfo mo87630d(C87448l lVar, C55240la laVar) {
        C55208jw jwVar;
        Object obj;
        Object obj2;
        MatchingProviderInfo d = super.mo87630d(lVar, laVar);
        if (!d.mo81435e()) {
            return d;
        }
        C62940bt r0 = C62942bv.checkIsLite(C55208jw.f145313A);
        laVar.mo58887l(r0);
        if (laVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C55208jw.f145313A);
            laVar.mo58887l(r02);
            Object l = laVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj2 = r02.f169969b;
            } else {
                obj2 = r02.mo58889c(l);
            }
            jwVar = (C55208jw) obj2;
        } else {
            C62940bt r03 = C62942bv.checkIsLite(C55208jw.f145316z);
            laVar.mo58887l(r03);
            if (laVar.f169962ag.mo58857o(r03.f169971d)) {
                C62940bt r04 = C62942bv.checkIsLite(C55208jw.f145316z);
                laVar.mo58887l(r04);
                Object l2 = laVar.f169962ag.mo58854l(r04.f169971d);
                if (l2 == null) {
                    obj = r04.f169969b;
                } else {
                    obj = r04.mo58889c(l2);
                }
                jwVar = (C55208jw) obj;
            } else {
                jwVar = null;
            }
        }
        if (jwVar == null || !f260282f.contains(jwVar.f145319b)) {
            return d;
        }
        C55360pm pmVar = (C55360pm) C55361pn.f145866g.createBuilder();
        C55122gr grVar = C55122gr.COMPANION;
        pmVar.copyOnWrite();
        C55361pn pnVar = (C55361pn) pmVar.instance;
        pnVar.f145873f = grVar.f145060e;
        pnVar.f145868a |= 16;
        if ((jwVar.f145318a & 8) != 0) {
            C55354pg pgVar = (C55354pg) C55355ph.f145852e.createBuilder();
            C55136he heVar = jwVar.f145322e;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            String str = heVar.f145133b;
            pgVar.copyOnWrite();
            C55355ph phVar = (C55355ph) pgVar.instance;
            str.getClass();
            phVar.f145855a |= 1;
            phVar.f145856b = str;
            if ((jwVar.f145318a & 32) != 0) {
                C55136he heVar2 = jwVar.f145325h;
                if (heVar2 == null) {
                    heVar2 = C55136he.f145130j;
                }
                String str2 = heVar2.f145133b;
                pgVar.copyOnWrite();
                C55355ph phVar2 = (C55355ph) pgVar.instance;
                str2.getClass();
                phVar2.f145855a |= 2;
                phVar2.f145857c = str2;
            }
            pmVar.mo58885m(C55355ph.f145853f, (C55355ph) pgVar.build());
        }
        return new MatchingProviderInfo(C58597ky.m90212c((C55361pn) pmVar.build()), (C55361pn) pmVar.build(), false);
    }
}
