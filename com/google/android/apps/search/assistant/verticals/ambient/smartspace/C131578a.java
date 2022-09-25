package com.google.android.apps.search.assistant.verticals.ambient.smartspace;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b.C131213c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b.C131214d;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.base.C58817ah;
import com.google.common.p4580v.C60945d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.time.Instant;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a */
/* compiled from: PG */
final class C131578a implements C58817ah {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        StringBuilder sb = new StringBuilder();
        for (Object next : ((C65033ar) obj).f176113a) {
            C69664n.m101060f(next, "cardUpdateRecordList.getElementsList()");
            C65768az azVar = (C65768az) next;
            C65139d dVar = azVar.f178796b;
            if (dVar == null) {
                dVar = C65139d.f176307e;
            }
            LocalDateTime localDateTime = C60945d.m93099d(dVar.f176310b).atZone(ZoneId.systemDefault()).mo43202c();
            new StringBuilder("Update Time: ").append(localDateTime);
            sb.append("Update Time: ".concat(String.valueOf(localDateTime)));
            sb.append(10);
            C63070h hVar = azVar.f178799e;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            C131214d dVar2 = (C131214d) C62942bv.parseFrom((C62942bv) C131214d.f358826e, hVar.f170218b, C62921ba.m95368a());
            C69664n.m101060f(dVar2, "parseFrom(\n             …istry()\n                )");
            C50819dp dpVar = dVar2.f358829b;
            if (dpVar == null) {
                dpVar = C50819dp.f132330b;
            }
            C69664n.m101060f(dpVar, "record.update");
            for (Object next2 : dpVar.f132332a) {
                C69664n.m101060f(next2, "update.cardList");
                C50818do doVar = (C50818do) next2;
                LocalDateTime localDateTime2 = Instant.ofEpochMilli(doVar.f132317n).atZone(ZoneId.systemDefault()).mo43202c();
                C50796ct ctVar = doVar.f132320q;
                if (ctVar == null) {
                    ctVar = C50796ct.f132223c;
                }
                LocalDateTime localDateTime3 = Instant.ofEpochMilli(ctVar.f132226b).atZone(ZoneId.systemDefault()).mo43202c();
                C50794cr a = C50794cr.m85938a(doVar.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                String name = a.name();
                sb.append("Card type: " + name + ", update time: " + localDateTime2 + ", expire time: " + localDateTime3);
                sb.append(10);
            }
            int a2 = C131213c.m213712a(dVar2.f358830c);
            sb.append("Update status: ".concat((a2 == 0 || a2 == 1) ? "UNDEFINED" : a2 != 2 ? "FAILED" : "SUCCESS"));
            sb.append(10);
        }
        return sb.toString();
    }
}
