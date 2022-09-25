package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18219aw;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18296p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protos.p5127o.C65673ba;
import com.google.protos.p5127o.C65674bb;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65695u;
import com.google.protos.p5127o.C65699y;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.c */
/* compiled from: PG */
public final /* synthetic */ class C18257c implements C18296p {

    /* renamed from: a */
    public final /* synthetic */ C70868g f51822a;

    public /* synthetic */ C18257c(C70868g gVar) {
        this.f51822a = gVar;
    }

    /* renamed from: a */
    public final void mo23740a(C65693s sVar) {
        Object obj;
        Object obj2;
        C70868g gVar = this.f51822a;
        C65695u uVar = sVar.f178490c;
        if (uVar == null) {
            uVar = C65695u.f178492a;
        }
        C62940bt r2 = C62942bv.checkIsLite(C65674bb.f178443d);
        uVar.mo58887l(r2);
        Object l = uVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        int a = C65673ba.m96777a(((C65674bb) obj).f178446b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 2) {
            gVar.mo20123c(sVar);
        } else if (i != 3) {
            C65695u uVar2 = sVar.f178490c;
            if (uVar2 == null) {
                uVar2 = C65695u.f178492a;
            }
            C62940bt r1 = C62942bv.checkIsLite(C65674bb.f178443d);
            uVar2.mo58887l(r1);
            Object l2 = uVar2.f169962ag.mo58854l(r1.f169971d);
            if (l2 == null) {
                obj2 = r1.f169969b;
            } else {
                obj2 = r1.mo58889c(l2);
            }
            int a2 = C65673ba.m96777a(((C65674bb) obj2).f178446b);
            C65699y c = C18219aw.m35485c(13, "Unhandled StreamContext.type ".concat((a2 == 0 || a2 == 1) ? "UNSPECIFIED" : a2 != 2 ? a2 != 3 ? "CLOSE" : "MESSAGE" : "INIT"));
            gVar.mo20122b(C18253ak.m35565d(c).asException());
            throw new C18218av(c);
        } else {
            try {
                C63070h hVar = sVar.f178489b;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                C65699y yVar = (C65699y) C62942bv.parseFrom((C62942bv) C65699y.f178500e, hVar.f170218b, C62921ba.f169869a);
                int i2 = yVar.f178503b;
                if (i2 != 0) {
                    Status fromCodeValue = Status.fromCodeValue(i2);
                    if (!yVar.f178504c.isEmpty()) {
                        fromCodeValue = fromCodeValue.withDescription(yVar.f178504c);
                    }
                    gVar.mo20122b(fromCodeValue.asException());
                    return;
                }
                gVar.mo20121a();
            } catch (C62974ct e) {
                C65699y c2 = C18219aw.m35485c(13, "Could not parse Status");
                gVar.mo20122b(C18253ak.m35565d(c2).mo61678e(e).asException());
                throw new C18218av(c2, e);
            }
        }
    }
}
