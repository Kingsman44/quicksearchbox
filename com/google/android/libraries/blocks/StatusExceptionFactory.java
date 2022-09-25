package com.google.android.libraries.blocks;

import com.google.net.p4726a.p4727a.C62722b;
import com.google.net.p4726a.p4728b.C62723a;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4881ar.p4882a.C63771b;
import p5690r.p5691a.C72768b;

/* compiled from: PG */
public class StatusExceptionFactory {
    private StatusExceptionFactory() {
    }

    public static StatusException fromProto(byte[] bArr) {
        Object obj;
        try {
            C62724b bVar = (C62724b) C62942bv.parseFrom((C62942bv) C62724b.f169416g, bArr, C62921ba.m95368a());
            if (((bVar.f169418a & 8) != 0 ? C62722b.m94931a(bVar.f169422e) : null) == null) {
                C62722b bVar2 = C62722b.OK;
            }
            String str = bVar.f169421d.isEmpty() ? "unknown error" : bVar.f169421d;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            C63771b bVar3 = bVar.f169423f;
            if (bVar3 == null) {
                bVar3 = C63771b.f172510a;
            }
            C62940bt r2 = C62942bv.checkIsLite(C72768b.f193460c);
            bVar3.mo58887l(r2);
            if (bVar3.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r22 = C62942bv.checkIsLite(C72768b.f193460c);
                bVar3.mo58887l(r22);
                Object l = bVar3.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                C72768b bVar4 = (C72768b) obj;
                if (bVar4.f193462a.size() > 0) {
                    return new StatusException(str, stackTrace, bVar4);
                }
            }
            return new StatusException(str, stackTrace);
        } catch (C62974ct e) {
            C62722b bVar5 = C62722b.OK;
            return new StatusException("Proto parse failed:".concat(String.valueOf(e.getMessage())));
        }
    }

    public static byte[] toProto(Throwable th) {
        C62723a aVar = (C62723a) C62724b.f169416g.createBuilder();
        int i = C62722b.INTERNAL.f169415s;
        aVar.copyOnWrite();
        C62724b bVar = (C62724b) aVar.instance;
        bVar.f169418a |= 1;
        bVar.f169419b = i;
        int i2 = C62722b.INTERNAL.f169415s;
        aVar.copyOnWrite();
        C62724b bVar2 = (C62724b) aVar.instance;
        bVar2.f169418a |= 8;
        bVar2.f169422e = i2;
        aVar.copyOnWrite();
        C62724b bVar3 = (C62724b) aVar.instance;
        bVar3.f169418a |= 2;
        bVar3.f169420c = "generic";
        if (th.getMessage() != null) {
            String message = th.getMessage();
            aVar.copyOnWrite();
            C62724b bVar4 = (C62724b) aVar.instance;
            message.getClass();
            bVar4.f169418a |= 4;
            bVar4.f169421d = message;
        } else {
            aVar.copyOnWrite();
            C62724b bVar5 = (C62724b) aVar.instance;
            bVar5.f169418a |= 4;
            bVar5.f169421d = "[message unknown]";
        }
        return ((C62724b) aVar.build()).toByteArray();
    }
}
