package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57693i;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62885d;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64253b;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64255d;
import com.google.protos.youtube.elements.C66192df;
import com.google.protos.youtube.elements.C66198dl;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.r */
/* compiled from: PG */
public final class C40365r {
    /* renamed from: a */
    public static final C64253b m70032a(C64253b bVar, C21319z zVar) {
        C69664n.m101061g(bVar, "<this>");
        if (zVar == null) {
            return bVar;
        }
        C66198dl dlVar = null;
        String F = zVar.mo26845F((String) null);
        C66192df E = zVar.mo26844E();
        if (E != null && (dlVar = E.f179999b) == null) {
            dlVar = C66198dl.f180008b;
        }
        C62934bn builder = bVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C64255d a = C69664n.m101061g((C64252a) builder, "builder");
        if (F != null) {
            C64252a aVar = a.f173739a;
            aVar.copyOnWrite();
            C64253b bVar2 = (C64253b) aVar.instance;
            bVar2.f173733a |= 8;
            bVar2.f173737e = F;
        }
        if (dlVar != null) {
            C62940bt btVar = C57693i.f154081l;
            C69664n.m101060f(btVar, "veLoggingProperties");
            C69664n.m101061g(btVar, "extension");
            C62940bt r4 = C62942bv.checkIsLite(btVar);
            dlVar.mo58887l(r4);
            if (dlVar.f169962ag.mo58857o(r4.f169971d)) {
                C62940bt btVar2 = C57693i.f154081l;
                C69664n.m101060f(btVar2, "veLoggingProperties");
                int i = ((C57693i) C62885d.m94956a(dlVar, btVar2)).f154084b;
                C64252a aVar2 = a.f173739a;
                aVar2.copyOnWrite();
                C64253b bVar3 = (C64253b) aVar2.instance;
                bVar3.f173733a |= 16;
                bVar3.f173738f = i;
            }
        }
        return a.mo59264a();
    }
}
