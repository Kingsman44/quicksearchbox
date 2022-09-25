package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65853v;
import com.google.protos.p5129p.p5131b.C65854w;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.f.be */
/* compiled from: PG */
public final /* synthetic */ class C21822be implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C21822be f60212a = new C21822be();

    private /* synthetic */ C21822be() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C58490gz gzVar = new C58490gz(4);
        long j = 0;
        for (C21858h hVar : (List) obj) {
            C65753ak c = hVar.mo27123c();
            C58485gu<C65768az> b = hVar.mo27122b();
            C58485gu<C65768az> a = hVar.mo27121a();
            ((C59052c) ((C59052c) C21826bi.f60217a.mo56224b()).mo56372aa(47992)).mo56395y("There are %d elements to be updated on the server for corpus %s.", b.size(), c.name());
            C58597ky.m90217h(b, C21813aw.f60178a);
            ((C59052c) ((C59052c) C21826bi.f60217a.mo56224b()).mo56372aa(47994)).mo56395y("There are %d elements to delete from the server for corpus %s.", a.size(), c.name());
            if (!a.isEmpty() || !b.isEmpty()) {
                C65853v vVar = (C65853v) C65854w.f179011g.createBuilder();
                long j2 = j;
                for (C65768az azVar : a) {
                    if (((double) (((long) azVar.getSerializedSize()) + j2)) <= 3670016.0d) {
                        vVar.copyOnWrite();
                        C65854w wVar = (C65854w) vVar.instance;
                        azVar.getClass();
                        C62971cq cqVar = wVar.f179018f;
                        if (!cqVar.mo58948c()) {
                            wVar.f179018f = C62942bv.mutableCopy(cqVar);
                        }
                        wVar.f179018f.add(azVar);
                        j2 += (long) azVar.getSerializedSize();
                    } else {
                        ((C59052c) ((C59052c) C21826bi.f60217a.mo56224b()).mo56372aa(47991)).mo56389s("Unable to fit deleted element into current page for corpus %s", c.name());
                    }
                }
                for (C65768az azVar2 : b) {
                    if (((double) (((long) azVar2.getSerializedSize()) + j2)) <= 3670016.0d) {
                        vVar.copyOnWrite();
                        C65854w wVar2 = (C65854w) vVar.instance;
                        azVar2.getClass();
                        C62971cq cqVar2 = wVar2.f179017e;
                        if (!cqVar2.mo58948c()) {
                            wVar2.f179017e = C62942bv.mutableCopy(cqVar2);
                        }
                        wVar2.f179017e.add(azVar2);
                        j2 += (long) azVar2.getSerializedSize();
                    } else {
                        ((C59052c) ((C59052c) C21826bi.f60217a.mo56224b()).mo56372aa(47990)).mo56389s("Unable to fit element into current page for corpus %s", c.name());
                    }
                }
                vVar.copyOnWrite();
                C65854w wVar3 = (C65854w) vVar.instance;
                wVar3.f179014b = c.f178757bE;
                wVar3.f179013a = 1 | wVar3.f179013a;
                axVar = C58833ax.m90834k((C65854w) vVar.build());
            } else {
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                gzVar.mo55429h(c, (C65854w) axVar.mo56107c());
                j += (long) ((C65854w) axVar.mo56107c()).getSerializedSize();
            }
        }
        return gzVar.mo55427f(true);
    }
}
