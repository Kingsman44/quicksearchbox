package com.google.android.libraries.geller.p1817e;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.p5238v.p5239a.p5259m.C67882l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65775bf;

/* renamed from: com.google.android.libraries.geller.e.d */
/* compiled from: PG */
public final /* synthetic */ class C21779d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C65775bf f60086a;

    /* renamed from: b */
    public final /* synthetic */ C65768az f60087b;

    public /* synthetic */ C21779d(C65775bf bfVar, C65768az azVar) {
        this.f60086a = bfVar;
        this.f60087b = azVar;
    }

    public final Object apply(Object obj) {
        C65775bf bfVar = this.f60086a;
        C65768az azVar = this.f60087b;
        try {
            C21777b bVar = (C21777b) ((C58833ax) obj).mo56111f();
            if (bVar == null) {
                ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56372aa(47967)).mo56386p("Failed to find matching encryption key to decrypt Element.");
                return C58836b.f156633a;
            }
            C63070h hVar = (C63070h) C62942bv.parseFrom((C62942bv) C63070h.f170215c, new C67882l(bVar.mo27109b()).mo59877a(bfVar.f178816b.mo59174N(), C21782g.f60091b), C62921ba.m95368a());
            C65767ay ayVar = (C65767ay) azVar.toBuilder();
            ayVar.copyOnWrite();
            C65768az azVar2 = (C65768az) ayVar.instance;
            hVar.getClass();
            azVar2.f178799e = hVar;
            azVar2.f178795a |= 8;
            return C58833ax.m90834k((C65768az) ayVar.build());
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C21782g.f60090a.mo56225c()).mo56382g(e)).mo56372aa(47966)).mo56386p("Unexpected error when trying to decrypt encrypted element.");
            return C58836b.f156633a;
        }
    }
}
