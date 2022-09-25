package com.google.android.libraries.geller.p1817e;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.p5238v.p5239a.p5259m.C67882l;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65774be;
import com.google.protos.p5129p.p5131b.C65775bf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.e.f */
/* compiled from: PG */
public final /* synthetic */ class C21781f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f60089a;

    public /* synthetic */ C21781f(List list) {
        this.f60089a = list;
    }

    public final Object apply(Object obj) {
        List<C65768az> list = this.f60089a;
        C21777b bVar = (C21777b) ((C58833ax) obj).mo56111f();
        if (bVar == null) {
            ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56372aa(47970)).mo56386p("Failed to fetch encryption key to encrypt Elements.");
            return C58485gu.m89845m();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C65768az azVar : list) {
            if ((azVar.f178795a & 8) != 0) {
                C65774be beVar = (C65774be) C65775bf.f178813d.createBuilder();
                try {
                    C63070h hVar = azVar.f178799e;
                    if (hVar == null) {
                        hVar = C63070h.f170215c;
                    }
                    C63088z A = C63088z.m96139A(new C67882l(bVar.mo27109b()).mo59878b(hVar.toByteArray(), C21782g.f60091b));
                    beVar.copyOnWrite();
                    C65775bf bfVar = (C65775bf) beVar.instance;
                    bfVar.f178815a |= 1;
                    bfVar.f178816b = A;
                    int a = bVar.mo27108a();
                    beVar.copyOnWrite();
                    C65775bf bfVar2 = (C65775bf) beVar.instance;
                    bfVar2.f178815a |= 2;
                    bfVar2.f178817c = a;
                    C65767ay ayVar = (C65767ay) azVar.toBuilder();
                    C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                    gVar.copyOnWrite();
                    ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.GellerE2eeElement";
                    C63088z byteString = ((C65775bf) beVar.build()).toByteString();
                    gVar.copyOnWrite();
                    byteString.getClass();
                    ((C63070h) gVar.instance).f170218b = byteString;
                    ayVar.copyOnWrite();
                    C65768az azVar2 = (C65768az) ayVar.instance;
                    C63070h hVar2 = (C63070h) gVar.build();
                    hVar2.getClass();
                    azVar2.f178799e = hVar2;
                    azVar2.f178795a |= 8;
                    arrayList.add((C65768az) ayVar.build());
                } catch (Exception e) {
                    ((C59052c) ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56382g(e)).mo56372aa(47968)).mo56386p("Unexpected error when trying to encrypt element.");
                }
            } else {
                ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56372aa(47969)).mo56386p("Element to encrypt is missing data field.");
            }
        }
        return C58485gu.m89842j(arrayList);
    }
}
