package com.google.android.libraries.assistant.gallium.framework;

import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65661ap;
import com.google.protos.p5127o.C65663ar;
import com.google.protos.p5127o.C65665at;
import com.google.protos.p5127o.C65667av;
import com.google.protos.p5127o.C65672b;
import com.google.protos.p5127o.C65679e;
import com.google.protos.p5127o.C65680f;
import com.google.protos.p5127o.C65681g;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65687m;
import com.google.protos.p5127o.C65688n;
import com.google.protos.p5127o.C65690p;
import com.google.protos.p5127o.C65691q;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.al */
/* compiled from: PG */
public final class C18208al {

    /* renamed from: a */
    private final C58495hd f51731a;

    /* renamed from: b */
    private final C58528ij f51732b;

    /* renamed from: c */
    private final C58528ij f51733c;

    private C18208al(C58495hd hdVar, C58528ij ijVar, C58528ij ijVar2) {
        this.f51731a = hdVar;
        this.f51732b = ijVar;
        this.f51733c = ijVar2;
    }

    /* renamed from: a */
    public static C18208al m35461a(C65663ar arVar, C65665at atVar) {
        int i;
        C58490gz gzVar = new C58490gz(4);
        C58486gv gvVar = new C58486gv();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arVar.f178419b);
        arrayList.addAll(arVar.f178420c);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C65661ap apVar = (C65661ap) arrayList.get(i2);
            Iterator it = apVar.f178414b.iterator();
            while (true) {
                i = i2 + 1;
                if (!it.hasNext()) {
                    break;
                }
                C65667av avVar = (C65667av) it.next();
                if (avVar.f178432c) {
                    if ((avVar.f178430a & 4) != 0) {
                        C65686l lVar = avVar.f178433d;
                        if (lVar == null) {
                            lVar = C65686l.f178470d;
                        }
                        C65686l lVar2 = avVar.f178431b;
                        if (apVar.f178413a == null) {
                            C65672b bVar = C65672b.f178440a;
                        }
                        gvVar.mo55419c(lVar, new C18205ai());
                    } else {
                        C65686l lVar3 = avVar.f178431b;
                        if (lVar3 == null) {
                            lVar3 = C65686l.f178470d;
                        }
                        C65672b bVar2 = apVar.f178413a;
                        if (bVar2 == null) {
                            bVar2 = C65672b.f178440a;
                        }
                        gzVar.mo55429h(lVar3, bVar2);
                    }
                }
            }
            i2 = i;
        }
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(atVar.f178426c);
        C58528ij f = ihVar.mo55486f();
        C58526ih ihVar2 = new C58526ih();
        C65665at atVar2 = arVar.f178418a;
        if (atVar2 == null) {
            atVar2 = C65665at.f178422e;
        }
        for (C65686l lVar4 : atVar2.f178426c) {
            if (!f.contains(lVar4)) {
                ihVar2.mo55373c(lVar4);
            }
        }
        C58495hd f2 = gzVar.mo55427f(false);
        C58528ij f3 = ihVar2.mo55486f();
        gvVar.mo55417a();
        return new C18208al(f2, f, f3);
    }

    /* renamed from: b */
    public final MessageLite mo23693b(C18204ah ahVar) {
        C65682h hVar;
        C65686l c = ahVar.mo23685c();
        C65681g gVar = (C65681g) C65682h.f178459f.createBuilder();
        gVar.copyOnWrite();
        C65682h hVar2 = (C65682h) gVar.instance;
        c.getClass();
        hVar2.f178462b = c;
        hVar2.f178461a |= 1;
        if (((C65672b) this.f51731a.get(c)) != null) {
            hVar = (C65682h) gVar.build();
        } else if (this.f51733c.contains(c)) {
            hVar = (C65682h) gVar.build();
        } else if (this.f51732b.contains(c)) {
            C65690p pVar = (C65690p) C65691q.f178480e.createBuilder();
            C65679e eVar = (C65679e) C65680f.f178455c.createBuilder();
            String str = c.f178473b;
            eVar.copyOnWrite();
            C65680f fVar = (C65680f) eVar.instance;
            fVar.f178457a |= 1;
            fVar.f178458b = "provider:".concat(String.valueOf(str));
            pVar.copyOnWrite();
            C65691q qVar = (C65691q) pVar.instance;
            C65680f fVar2 = (C65680f) eVar.build();
            fVar2.getClass();
            qVar.f178484c = fVar2;
            qVar.f178483b = 2;
            C65687m mVar = (C65687m) C65688n.f178475c.createBuilder();
            mVar.copyOnWrite();
            C65688n nVar = (C65688n) mVar.instance;
            nVar.f178478b = 2;
            nVar.f178477a |= 1;
            pVar.copyOnWrite();
            C65691q qVar2 = (C65691q) pVar.instance;
            C65688n nVar2 = (C65688n) mVar.build();
            nVar2.getClass();
            qVar2.f178485d = nVar2;
            qVar2.f178482a |= 4;
            C65691q qVar3 = (C65691q) pVar.build();
            gVar.copyOnWrite();
            C65682h hVar3 = (C65682h) gVar.instance;
            qVar3.getClass();
            hVar3.f178463c = qVar3;
            hVar3.f178461a |= 2;
            hVar = (C65682h) gVar.build();
        } else {
            throw C18218av.m35478a(5, "Failed to resolve interface '" + C18214ar.m35471d(c) + "'. No provider was found.\nSee http://go/gallium-interface-satisfiability for details.");
        }
        return ahVar.mo23684b(hVar);
    }
}
