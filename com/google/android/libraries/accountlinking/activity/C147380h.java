package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.accountlinking.C147433k;
import com.google.android.libraries.accountlinking.C147434l;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10979b.C147409m;
import com.google.android.libraries.accountlinking.p10979b.C147410n;
import com.google.android.libraries.accountlinking.p10979b.C147412p;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p3562ao.p3563a.p3568d.C45558bb;
import com.google.p3562ao.p3563a.p3568d.C45568f;
import com.google.p3562ao.p3563a.p3568d.C45569g;
import com.google.p3562ao.p3563a.p3568d.C45570h;
import com.google.p3562ao.p3563a.p3568d.C45571i;
import com.google.p3562ao.p3563a.p3568d.C45580r;
import com.google.p3562ao.p3563a.p3568d.C45581s;
import com.google.p3562ao.p3563a.p3568d.C45586x;
import com.google.p3562ao.p3563a.p3568d.C45587y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;
import java.util.List;

/* renamed from: com.google.android.libraries.accountlinking.activity.h */
/* compiled from: PG */
public final /* synthetic */ class C147380h implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ AccountLinkingActivity f397839a;

    public /* synthetic */ C147380h(AccountLinkingActivity accountLinkingActivity) {
        this.f397839a = accountLinkingActivity;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C147366d dVar = (C147366d) obj;
        C147388p pVar = this.f397839a.f397831n;
        int i = dVar.f397809f;
        if (i == 1 && dVar.f397808e == 1) {
            pVar.f397856e.mo3842a();
            if (!dVar.f397806c.equals("continue_linking")) {
                pVar.f397864m = dVar.f397806c;
            }
            if (pVar.f397863l) {
                pVar.mo124148f(C65881e.STATE_APP_FLIP);
                pVar.mo124147e(C65879c.EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED);
                pVar.f397863l = false;
            }
            pVar.f397855d.mo5706i((C147434l) pVar.f397854c.f397900i.get(pVar.f397862k));
        } else if (i == 1 && dVar.f397808e == 3) {
            int i2 = dVar.f397807d;
            pVar.f397856e.mo3842a();
            pVar.mo124149g(dVar, "Linking failed: Received unrecoverable error during linking.");
        } else if (i == 2 && dVar.f397808e == 1) {
            pVar.f397854c.f397900i.get(pVar.f397862k);
            C147412p pVar2 = pVar.f397859h;
            String str = dVar.f397806c;
            C147434l lVar = C147434l.APP_FLIP;
            int ordinal = ((C147434l) pVar.f397854c.f397900i.get(pVar.f397862k)).ordinal();
            if (ordinal == 0) {
                pVar.f397858g.mo5706i(true);
                C147395w wVar = pVar.f397854c;
                int i3 = wVar.f397895d;
                Account account = wVar.f397893b;
                String str2 = wVar.f397899h;
                C58485gu u = wVar.f397892a.mo55229u();
                String str3 = pVar.f397864m;
                C45570h hVar = (C45570h) C45571i.f119099e.createBuilder();
                C45558bb d = pVar2.mo124158d(i3);
                hVar.copyOnWrite();
                d.getClass();
                ((C45571i) hVar.instance).f119101a = d;
                C45586x xVar = (C45586x) C45587y.f119133c.createBuilder();
                xVar.copyOnWrite();
                str2.getClass();
                ((C45587y) xVar.instance).f119135a = str2;
                hVar.copyOnWrite();
                C45587y yVar = (C45587y) xVar.build();
                yVar.getClass();
                ((C45571i) hVar.instance).f119102b = yVar;
                C45568f fVar = (C45568f) C45569g.f119095c.createBuilder();
                fVar.copyOnWrite();
                str.getClass();
                ((C45569g) fVar.instance).f119097a = str;
                hVar.copyOnWrite();
                C45569g gVar = (C45569g) fVar.build();
                gVar.getClass();
                ((C45571i) hVar.instance).f119103c = gVar;
                if (str3 != null) {
                    hVar.copyOnWrite();
                    ((C45571i) hVar.instance).f119104d = str3;
                } else {
                    C45568f fVar2 = (C45568f) C45569g.f119095c.createBuilder();
                    fVar2.copyOnWrite();
                    str.getClass();
                    ((C45569g) fVar2.instance).f119097a = str;
                    fVar2.copyOnWrite();
                    C45569g gVar2 = (C45569g) fVar2.instance;
                    C62971cq cqVar = gVar2.f119098b;
                    if (!cqVar.mo58948c()) {
                        gVar2.f119098b = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) u, (List) gVar2.f119098b);
                    hVar.copyOnWrite();
                    C45569g gVar3 = (C45569g) fVar2.build();
                    gVar3.getClass();
                    ((C45571i) hVar.instance).f119103c = gVar3;
                }
                C60856cj.m92911t(pVar2.mo124156b(account, new C147409m(hVar)), new C147383k(pVar), C60826bg.f164896a);
            } else if (ordinal == 1 || ordinal == 2) {
                if (pVar.f397854c.f397903l) {
                    pVar.mo124144a(str);
                    return;
                }
                pVar.mo124148f(C65881e.STATE_COMPLETE);
                pVar.mo124150h(C147381i.m240295b(str));
            } else if (ordinal == 3) {
                pVar.f397858g.mo5706i(true);
                C147395w wVar2 = pVar.f397854c;
                int i4 = wVar2.f397895d;
                Account account2 = wVar2.f397893b;
                String str4 = wVar2.f397899h;
                String str5 = pVar.f397864m;
                C45580r rVar = (C45580r) C45581s.f119121e.createBuilder();
                if (str5 != null) {
                    rVar.copyOnWrite();
                    ((C45581s) rVar.instance).f119126d = str5;
                }
                C45558bb d2 = pVar2.mo124158d(i4);
                rVar.copyOnWrite();
                d2.getClass();
                ((C45581s) rVar.instance).f119123a = d2;
                rVar.copyOnWrite();
                str4.getClass();
                ((C45581s) rVar.instance).f119124b = str4;
                rVar.copyOnWrite();
                str.getClass();
                ((C45581s) rVar.instance).f119125c = str;
                C60856cj.m92911t(pVar2.mo124156b(account2, new C147410n((C45581s) rVar.build())), new C147384l(pVar), C60826bg.f164896a);
            }
        } else if (i == 2 && dVar.f397808e == 3) {
            int i5 = dVar.f397807d;
            pVar.f397854c.f397900i.get(pVar.f397862k);
            pVar.mo124149g(dVar, "Linking failed: Received unrecoverable error during linking.");
        } else if (i == 2 && dVar.f397808e == 2) {
            int i6 = dVar.f397807d;
            pVar.f397854c.f397900i.get(pVar.f397862k);
            int i7 = pVar.f397862k + 1;
            pVar.f397862k = i7;
            if (i7 >= pVar.f397854c.f397900i.size()) {
                pVar.mo124149g(dVar, "Linking failed: All account linking flows were attempted");
            } else if (pVar.f397855d.mo3842a() != C147434l.STREAMLINED_LINK_ACCOUNT || !pVar.f397861j || pVar.f397860i != C65881e.STATE_ACCOUNT_SELECTION || !pVar.f397854c.f397905n.contains(C147433k.CAPABILITY_CONSENT)) {
                pVar.f397855d.mo5706i((C147434l) pVar.f397854c.f397900i.get(pVar.f397862k));
            } else {
                pVar.f397856e.mo5708l(C58485gu.m89846n(C147433k.CAPABILITY_CONSENT));
            }
        }
    }
}
