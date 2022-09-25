package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.g.i */
/* compiled from: PG */
public final /* synthetic */ class C22665i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C22665i f62433a = new C22665i();

    private /* synthetic */ C22665i() {
    }

    public final Object apply(Object obj) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C52076ei eiVar3;
        C22668l lVar = C22668l.f62437a;
        for (C52083ep epVar : (List) obj) {
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            if ((eiVar.f136666a & 32) != 0) {
                if (epVar.f136692b == 4) {
                    eiVar2 = (C52076ei) epVar.f136693c;
                } else {
                    eiVar2 = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar2.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if ("mic.UPDATE".equals(dyVar.f135936b)) {
                    if (epVar.f136692b == 4) {
                        eiVar3 = (C52076ei) epVar.f136693c;
                    } else {
                        eiVar3 = C52076ei.f136664f;
                    }
                    C51809dy dyVar2 = eiVar3.f136668c;
                    if (dyVar2 == null) {
                        dyVar2 = C51809dy.f135933f;
                    }
                    C51807dw dwVar = dyVar2.f135938d;
                    if (dwVar == null) {
                        dwVar = C51807dw.f135930b;
                    }
                    for (C52232kc kcVar : dwVar.f135932a) {
                        if ("mic_behavior_args".equals(kcVar.f137065b)) {
                            try {
                                C52230ka kaVar = kcVar.f137066c;
                                if (kaVar == null) {
                                    kaVar = C52230ka.f137057d;
                                }
                                return (C52654zt) C62942bv.parseFrom((C62942bv) C52654zt.f138233e, kaVar.f137061c, C62921ba.m95368a());
                            } catch (C62974ct unused) {
                                return C52654zt.f138233e;
                            }
                        }
                    }
                    return C52654zt.f138233e;
                }
            }
        }
        return C52654zt.f138233e;
    }
}
