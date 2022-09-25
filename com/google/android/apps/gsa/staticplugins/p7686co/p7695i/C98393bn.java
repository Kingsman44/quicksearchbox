package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.accounts.Account;
import android.location.Location;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91599f;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91611a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7626dz;
import com.google.p375ai.p378b.C7628ea;
import com.google.p375ai.p378b.C7720hl;
import com.google.p375ai.p378b.C7735i;
import com.google.p375ai.p378b.C7762j;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import com.google.p375ai.p378b.C7953qb;
import com.google.p375ai.p378b.C7955qd;
import com.google.p375ai.p378b.C7959qh;
import com.google.p375ai.p378b.C8161xu;
import com.google.p375ai.p378b.C8162xv;
import com.google.p375ai.p378b.C8166xz;
import com.google.p375ai.p378b.C8174yg;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bn */
/* compiled from: PG */
public final class C98393bn extends C68247h {

    /* renamed from: a */
    private final C98378az f274671a;

    /* renamed from: c */
    private final C68283d f274672c;

    /* renamed from: d */
    private final C68283d f274673d;

    /* renamed from: e */
    private final C68283d f274674e;

    /* renamed from: f */
    private final C68283d f274675f;

    /* renamed from: g */
    private final C68283d f274676g;

    /* renamed from: h */
    private final C68283d f274677h;

    public C98393bn(C98378az azVar, C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C98393bn.class), aVar);
        this.f274671a = azVar;
        this.f274672c = C68236af.m98549d(dVar);
        this.f274673d = C68236af.m98549d(dVar2);
        this.f274674e = C68236af.m98549d(dVar3);
        this.f274675f = C68236af.m98549d(dVar4);
        this.f274676g = C68236af.m98549d(dVar5);
        this.f274677h = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C98378az azVar = this.f274671a;
        C68282c cVar = (C68282c) list.get(0);
        Location location = (Location) list.get(1);
        C118826c cVar2 = (C118826c) list.get(2);
        Iterable iterable = (Iterable) list.get(3);
        C8166xz xzVar = (C8166xz) list.get(4);
        C7720hl hlVar = (C7720hl) list.get(5);
        C7950pz pzVar = (C7950pz) C7952qa.f27916z.createBuilder();
        C62961ch chVar = azVar.f274604c.f274740f;
        pzVar.copyOnWrite();
        C7952qa qaVar = (C7952qa) pzVar.instance;
        qaVar.mo16999e();
        C62947c.addAll((Iterable) chVar, (List) qaVar.f27936q);
        C62961ch chVar2 = azVar.f274604c.f274748o;
        pzVar.copyOnWrite();
        C7952qa qaVar2 = (C7952qa) pzVar.instance;
        C62961ch chVar3 = qaVar2.f27937r;
        if (!chVar3.mo58948c()) {
            qaVar2.f27937r = C62942bv.mutableCopy(chVar3);
        }
        C62947c.addAll((Iterable) chVar2, (List) qaVar2.f27937r);
        ArrayList arrayList = new ArrayList(azVar.f274604c.f274743j.size() + 1);
        if (azVar.f274604c.f274744k) {
            arrayList.add(C98380ba.f274608b);
        }
        for (C8174yg ygVar : azVar.f274604c.f274743j) {
            C7953qb qbVar = (C7953qb) C7955qd.f27946e.createBuilder();
            qbVar.copyOnWrite();
            C7955qd qdVar = (C7955qd) qbVar.instance;
            qdVar.f27949b = 2;
            qdVar.f27948a |= 1;
            qbVar.copyOnWrite();
            C7955qd qdVar2 = (C7955qd) qbVar.instance;
            ygVar.getClass();
            qdVar2.f27951d = ygVar;
            qdVar2.f27948a |= 4;
            arrayList.add((C7955qd) qbVar.build());
        }
        if (arrayList.isEmpty()) {
            arrayList.add(C98380ba.f274609c);
        }
        pzVar.copyOnWrite();
        C7952qa qaVar3 = (C7952qa) pzVar.instance;
        qaVar3.mo16997c();
        C62947c.addAll((Iterable) arrayList, (List) qaVar3.f27935p);
        C62971cq cqVar = azVar.f274604c.f274745l;
        pzVar.copyOnWrite();
        C7952qa qaVar4 = (C7952qa) pzVar.instance;
        C62971cq cqVar2 = qaVar4.f27938s;
        if (!cqVar2.mo58948c()) {
            qaVar4.f27938s = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) qaVar4.f27938s);
        C62971cq cqVar3 = azVar.f274604c.f274746m;
        pzVar.copyOnWrite();
        C7952qa qaVar5 = (C7952qa) pzVar.instance;
        C62971cq cqVar4 = qaVar5.f27939t;
        if (!cqVar4.mo58948c()) {
            qaVar5.f27939t = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) cqVar3, (List) qaVar5.f27939t);
        C59071e eVar = C98380ba.f274607a;
        C58976aa aaVar = C58975e.f156826a;
        C98414ch chVar4 = azVar.f274604c;
        if ((chVar4.f274735a & 128) != 0) {
            String str = chVar4.f274751r;
            pzVar.copyOnWrite();
            C7952qa qaVar6 = (C7952qa) pzVar.instance;
            str.getClass();
            qaVar6.f27920a |= C89885b.NOW_VALUE;
            qaVar6.f27944y = str;
        }
        pzVar.copyOnWrite();
        C7952qa qaVar7 = (C7952qa) pzVar.instance;
        hlVar.getClass();
        qaVar7.f27922c = hlVar;
        qaVar7.f27920a |= 4;
        if (azVar.f274603b != null) {
            try {
                byte[][] bArr = (byte[][]) cVar.mo60292a();
                if (bArr != null && (r3 = bArr.length) > 0) {
                    C7626dz dzVar = (C7626dz) C7628ea.f26347b.createBuilder();
                    for (byte[] A : bArr) {
                        C63088z A2 = C63088z.m96139A(A);
                        dzVar.copyOnWrite();
                        C7628ea eaVar = (C7628ea) dzVar.instance;
                        C62971cq cqVar5 = eaVar.f26349a;
                        if (!cqVar5.mo58948c()) {
                            eaVar.f26349a = C62942bv.mutableCopy(cqVar5);
                        }
                        eaVar.f26349a.add(A2);
                    }
                    pzVar.copyOnWrite();
                    C7952qa qaVar8 = (C7952qa) pzVar.instance;
                    C7628ea eaVar2 = (C7628ea) dzVar.build();
                    eaVar2.getClass();
                    qaVar8.f27926g = eaVar2;
                    qaVar8.f27920a |= 64;
                }
            } catch (ExecutionException e) {
                C59104x c = C98380ba.f274607a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "RequestManagerImpl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30652)).mo56386p("Retrieving context bytes failed.");
            }
        }
        if (iterable.iterator().hasNext()) {
            C7735i iVar = (C7735i) C7762j.f27177h.createBuilder();
            iVar.mo16954a(C91599f.m149844a(iterable));
            C7762j jVar = (C7762j) iVar.build();
            pzVar.copyOnWrite();
            C7952qa qaVar9 = (C7952qa) pzVar.instance;
            jVar.getClass();
            qaVar9.f27923d = jVar;
            qaVar9.f27920a |= 8;
        }
        C8161xu xuVar = (C8161xu) C8162xv.f28684c.createBuilder();
        if (xzVar == null) {
            xzVar = C8166xz.f28696e;
        }
        xuVar.copyOnWrite();
        C8162xv xvVar = (C8162xv) xuVar.instance;
        xzVar.getClass();
        xvVar.f28687b = xzVar;
        xvVar.f28686a |= 1;
        pzVar.copyOnWrite();
        C7952qa qaVar10 = (C7952qa) pzVar.instance;
        C8162xv xvVar2 = (C8162xv) xuVar.build();
        xvVar2.getClass();
        qaVar10.f27928i = xvVar2;
        qaVar10.f27920a |= 256;
        if (azVar.f274604c.f274739e) {
            C7959qh qhVar = C7959qh.f27962a;
            pzVar.copyOnWrite();
            C7952qa qaVar11 = (C7952qa) pzVar.instance;
            qhVar.getClass();
            qaVar11.f27930k = qhVar;
            qaVar11.f27920a |= 4096;
        }
        if (azVar.f274604c.f274738d) {
            pzVar.copyOnWrite();
            C7952qa qaVar12 = (C7952qa) pzVar.instance;
            qaVar12.f27920a |= 65536;
            qaVar12.f27933n = true;
        }
        Account account = azVar.f274603b;
        if (account != null) {
            C91611a.m149877a(azVar.f274605d.f274640r, account.name, pzVar);
        }
        boolean z = azVar.f274604c.f274744k;
        pzVar.copyOnWrite();
        C7952qa qaVar13 = (C7952qa) pzVar.instance;
        qaVar13.f27920a |= 1;
        qaVar13.f27921b = z;
        return C60856cj.m92900i((C7952qa) pzVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f274672c.mo60297gq()), this.f274673d.mo60297gq(), this.f274674e.mo60297gq(), this.f274675f.mo60297gq(), this.f274676g.mo60297gq(), this.f274677h.mo60297gq());
    }
}
