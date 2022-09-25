package com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a;

import com.google.p343ac.p344a.p345a.C6621a;
import com.google.p343ac.p346b.C6637b;
import com.google.p343ac.p346b.C6641c;
import com.google.p343ac.p346b.C6642d;
import com.google.p343ac.p346b.C6645g;
import com.google.p343ac.p346b.C6646h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.a.f */
/* compiled from: PG */
public final /* synthetic */ class C32033f implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            C6646h hVar = (C6646h) C62942bv.parseFrom((C62942bv) C6646h.f19877c, (C63088z) obj);
            int i = hVar.f19879a;
            int a = C6645g.m18009a(i);
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 3) {
                int a2 = C6645g.m18009a(i);
                throw new IllegalArgumentException("Unsupported token format version: ".concat((a2 == 0 || a2 == 1) ? "UNKNOWN" : a2 != 2 ? a2 != 3 ? "VERSION_3" : "VERSION_2" : "VERSION_1"));
            }
            byte[] N = hVar.f19880b.mo59174N();
            for (int i2 = 0; i2 < N.length; i2++) {
                N[i2] = (byte) (N[i2] ^ 7);
            }
            try {
                C6637b bVar = (C6637b) C62942bv.parseFrom((C62942bv) C6637b.f19857e, N);
                C6641c cVar = (C6641c) C6642d.f19870e.createBuilder();
                List a3 = C6621a.m18003a(bVar.f19859a);
                cVar.copyOnWrite();
                C6642d dVar = (C6642d) cVar.instance;
                C62961ch chVar = dVar.f19872a;
                if (!chVar.mo58948c()) {
                    dVar.f19872a = C62942bv.mutableCopy(chVar);
                }
                C62947c.addAll((Iterable) a3, (List) dVar.f19872a);
                List a4 = C6621a.m18003a(bVar.f19860b);
                cVar.copyOnWrite();
                C6642d dVar2 = (C6642d) cVar.instance;
                C62961ch chVar2 = dVar2.f19873b;
                if (!chVar2.mo58948c()) {
                    dVar2.f19873b = C62942bv.mutableCopy(chVar2);
                }
                C62947c.addAll((Iterable) a4, (List) dVar2.f19873b);
                List a5 = C6621a.m18003a(bVar.f19861c);
                cVar.copyOnWrite();
                C6642d dVar3 = (C6642d) cVar.instance;
                C62961ch chVar3 = dVar3.f19874c;
                if (!chVar3.mo58948c()) {
                    dVar3.f19874c = C62942bv.mutableCopy(chVar3);
                }
                C62947c.addAll((Iterable) a5, (List) dVar3.f19874c);
                List a6 = C6621a.m18003a(bVar.f19862d);
                cVar.copyOnWrite();
                C6642d dVar4 = (C6642d) cVar.instance;
                C62961ch chVar4 = dVar4.f19875d;
                if (!chVar4.mo58948c()) {
                    dVar4.f19875d = C62942bv.mutableCopy(chVar4);
                }
                C62947c.addAll((Iterable) a6, (List) dVar4.f19875d);
                return (C6642d) cVar.build();
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Unable to decode the v2 device experiment token", e);
            }
        } catch (C62974ct unused) {
            throw new IllegalArgumentException("Unable to parse the given token.");
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
