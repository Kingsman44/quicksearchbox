package com.google.assistant.p3838ao.p3839a.p3846f;

import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49528al;
import com.google.assistant.p3838ao.p3839a.p3845e.C49598da;
import com.google.assistant.p3838ao.p3839a.p3845e.C49615f;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.f.e */
/* compiled from: PG */
public final class C49641e {
    /* renamed from: a */
    public static Optional m85608a(C49692r rVar) {
        Optional optional;
        Object obj;
        C62940bt btVar = C49615f.f128031g;
        C49381a aVar = (C49381a) rVar;
        if (aVar.f127636b.isEmpty()) {
            optional = Optional.empty();
        } else {
            C49598da daVar = ((C49528al) aVar.f127636b.get()).f127796d;
            if (daVar == null) {
                daVar = C49598da.f127991a;
            }
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            daVar.mo58887l(r1);
            if (!daVar.f169962ag.mo58857o(r1.f169971d)) {
                optional = Optional.empty();
            } else {
                C62940bt r0 = C62942bv.checkIsLite(btVar);
                daVar.mo58887l(r0);
                Object l = daVar.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                optional = Optional.m71637of(obj);
            }
        }
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        C49615f fVar = (C49615f) optional.get();
        C63042fg fgVar = ((C49615f) optional.get()).f128034b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return Optional.m71637of(new C49640d(fVar, C62950b.m95474e(fgVar)));
    }
}
