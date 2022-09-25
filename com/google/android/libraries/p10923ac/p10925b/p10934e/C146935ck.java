package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97255k;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147084g;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63964aa;
import com.google.protos.p4895aw.p4902b.C63971ah;
import com.google.protos.p4895aw.p4902b.C63984au;
import com.google.protos.p4895aw.p4902b.C63985av;
import com.google.protos.p4895aw.p4902b.C63987ax;
import com.google.protos.p4895aw.p4902b.C64044d;
import com.google.protos.p4895aw.p4902b.C64089g;
import com.google.protos.p4895aw.p4902b.C64091i;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.ck */
/* compiled from: PG */
public final class C146935ck extends C68247h {

    /* renamed from: a */
    private final C68283d f396651a;

    /* renamed from: c */
    private final C68283d f396652c;

    /* renamed from: d */
    private final C68283d f396653d;

    public C146935ck(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146935ck.class), aVar);
        this.f396651a = C68236af.m98549d(dVar);
        this.f396652c = C68236af.m98549d(dVar2);
        this.f396653d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C63987ax axVar;
        List list = (List) obj;
        C147084g gVar = (C147084g) list.get(0);
        C64091i iVar = (C64091i) list.get(1);
        ArrayList arrayList = new ArrayList();
        C97255k kVar = ((C147266a) list.get(2)).f397502a;
        if (!((Boolean) ((C58885cv) C97255k.m160960a()).f156729a).booleanValue()) {
            C58801sm G = gVar.f397128a.listIterator(0);
            while (G.hasNext()) {
                C63985av avVar = (C63985av) G.next();
                C63964aa aaVar = (C63964aa) C63971ah.f173003f.createBuilder();
                C63088z zVar = avVar.f173043c;
                aaVar.copyOnWrite();
                C63971ah ahVar = (C63971ah) aaVar.instance;
                zVar.getClass();
                ahVar.f173005a |= 4;
                ahVar.f173008d = zVar;
                if ((avVar.f173041a & 4) != 0) {
                    C63088z zVar2 = avVar.f173044d;
                    aaVar.copyOnWrite();
                    C63971ah ahVar2 = (C63971ah) aaVar.instance;
                    zVar2.getClass();
                    ahVar2.f173005a |= 2;
                    ahVar2.f173007c = zVar2;
                }
                C64044d dVar = (C64044d) C64089g.f173264e.createBuilder();
                int a = C63984au.m96331a(avVar.f173042b);
                if (a == 0) {
                    a = 1;
                }
                C146931cg.m239503a(a);
                dVar.copyOnWrite();
                C64089g gVar2 = (C64089g) dVar.instance;
                gVar2.f173269d = 4;
                gVar2.f173266a |= 1;
                C63971ah ahVar3 = (C63971ah) aaVar.build();
                dVar.copyOnWrite();
                C64089g gVar3 = (C64089g) dVar.instance;
                ahVar3.getClass();
                gVar3.f173268c = ahVar3;
                gVar3.f173267b = 4;
                arrayList.add((C64089g) dVar.build());
            }
        } else {
            C58331bb bbVar = new C58331bb();
            C58801sm G2 = gVar.f397128a.listIterator(0);
            while (G2.hasNext()) {
                C63985av avVar2 = (C63985av) G2.next();
                C63964aa aaVar2 = (C63964aa) C63971ah.f173003f.createBuilder();
                C63088z zVar3 = avVar2.f173043c;
                aaVar2.copyOnWrite();
                C63971ah ahVar4 = (C63971ah) aaVar2.instance;
                zVar3.getClass();
                ahVar4.f173005a |= 4;
                ahVar4.f173008d = zVar3;
                if ((avVar2.f173041a & 4) != 0) {
                    C63088z zVar4 = avVar2.f173044d;
                    aaVar2.copyOnWrite();
                    C63971ah ahVar5 = (C63971ah) aaVar2.instance;
                    zVar4.getClass();
                    ahVar5.f173005a |= 2;
                    ahVar5.f173007c = zVar4;
                }
                List g = bbVar.mo55277g(avVar2.f173044d);
                C64044d dVar2 = (C64044d) C64089g.f173264e.createBuilder();
                int a2 = C63984au.m96331a(avVar2.f173042b);
                if (a2 == 0) {
                    a2 = 1;
                }
                C146931cg.m239503a(a2);
                dVar2.copyOnWrite();
                C64089g gVar4 = (C64089g) dVar2.instance;
                gVar4.f173269d = 4;
                gVar4.f173266a |= 1;
                C63971ah ahVar6 = (C63971ah) aaVar2.build();
                dVar2.copyOnWrite();
                C64089g gVar5 = (C64089g) dVar2.instance;
                ahVar6.getClass();
                gVar5.f173268c = ahVar6;
                gVar5.f173267b = 4;
                g.add((C64089g) dVar2.build());
            }
            if (iVar.f173273b == 4) {
                axVar = (C63987ax) iVar.f173274c;
            } else {
                axVar = C63987ax.f173047d;
            }
            int i = axVar.f173051c;
            for (C63088z g2 : bbVar.mo54951D()) {
                List g3 = bbVar.mo55277g(g2);
                for (int max = Math.max(0, g3.size() - i); max < g3.size(); max++) {
                    arrayList.add((C64089g) g3.get(max));
                }
            }
        }
        return C60856cj.m92900i(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396651a.mo60297gq(), this.f396652c.mo60297gq(), this.f396653d.mo60297gq());
    }
}
