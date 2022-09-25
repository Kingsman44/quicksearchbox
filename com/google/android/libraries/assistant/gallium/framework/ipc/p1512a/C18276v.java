package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18296p;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protos.p5127o.C65673ba;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65695u;
import com.google.protos.p5127o.C65696v;
import com.google.protos.p5127o.C65697w;
import com.google.protos.p5127o.C65699y;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.v */
/* compiled from: PG */
final class C18276v implements C18296p {

    /* renamed from: a */
    final /* synthetic */ C70862aj f51863a;

    public C18276v(C70862aj ajVar) {
        this.f51863a = ajVar;
    }

    /* renamed from: a */
    public final void mo23740a(C65693s sVar) {
        Object obj;
        C65695u uVar = sVar.f178490c;
        if (uVar == null) {
            uVar = C65695u.f178492a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C65674bb.f178443d);
        uVar.mo58887l(r1);
        Object l = uVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        int a = C65673ba.m96777a(((C65674bb) obj).f178446b);
        if (a != 0 && a == 4) {
            C63070h hVar = sVar.f178489b;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            if (!hVar.f170217a.equals("type.googleapis.com/gallium.Status")) {
                C59052c cVar = (C59052c) ((C59052c) C18280z.f51872a.mo56225c()).mo56372aa(47076);
                C63070h hVar2 = sVar.f178489b;
                if (hVar2 == null) {
                    hVar2 = C63070h.f170215c;
                }
                cVar.mo56389s("Unexpected CLOSE message type: %s", hVar2.f170217a);
                this.f51863a.mo20121a();
                return;
            }
            try {
                C63070h hVar3 = sVar.f178489b;
                if (hVar3 == null) {
                    hVar3 = C63070h.f170215c;
                }
                C65699y yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, hVar3.f170218b, C62921ba.f169869a);
                int i = yVar.f178503b;
                if (i != 0) {
                    if (i != 11) {
                        this.f51863a.mo20122b(C18253ak.m35565d(yVar).asException());
                        return;
                    }
                }
                this.f51863a.mo20121a();
            } catch (C62974ct e) {
                C18218av b = C18218av.m35479b(13, "Status parse error", e);
                this.f51863a.mo20122b(b);
                throw b;
            }
        } else {
            C70862aj ajVar = this.f51863a;
            C65696v vVar = (C65696v) C65697w.f178495c.createBuilder();
            C63070h hVar4 = sVar.f178489b;
            if (hVar4 == null) {
                hVar4 = C63070h.f170215c;
            }
            vVar.copyOnWrite();
            C65697w wVar = (C65697w) vVar.instance;
            hVar4.getClass();
            wVar.f178498b = hVar4;
            wVar.f178497a = 1;
            ajVar.mo20123c((C65697w) vVar.build());
        }
    }
}
