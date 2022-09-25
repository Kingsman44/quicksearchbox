package com.google.android.libraries.assistant.contexttrigger.p1454a;

import com.google.assistant.p3803ag.p3807b.p3808a.C48887ab;
import com.google.assistant.p3803ag.p3807b.p3808a.C48888ac;
import com.google.assistant.p3803ag.p3807b.p3808a.C48892ag;
import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62995dn;
import java.util.Collections;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.b */
/* compiled from: PG */
public final /* synthetic */ class C17605b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C17605b f50717a = new C17605b();

    private /* synthetic */ C17605b() {
    }

    public final Object apply(Object obj) {
        C48892ag agVar = (C48892ag) obj;
        C58480gp e = C58485gu.m89837e();
        for (C48888ac acVar : Collections.unmodifiableMap(agVar.f126521b).values()) {
            int b = C48887ab.m85291b(acVar.f126515g);
            if (b != 0 && b == 2) {
                if (Collections.unmodifiableMap(agVar.f126520a).containsKey(acVar.f126511c)) {
                    String str = acVar.f126511c;
                    str.getClass();
                    C62995dn dnVar = agVar.f126520a;
                    if (dnVar.containsKey(str)) {
                        C48917s sVar = ((C48899an) dnVar.get(str)).f126535b;
                        if (sVar == null) {
                            sVar = C48917s.f126578f;
                        }
                        C48919u uVar = sVar.f126581b;
                        if (uVar == null) {
                            uVar = C48919u.f126586g;
                        }
                        e.mo55395g(new C17604a(uVar, acVar));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    ((C59052c) ((C59052c) C17611h.f50723a.mo56226d()).mo56372aa(46933)).mo56386p("Awareness node has invalid trigger key");
                }
            }
        }
        return e.mo55394f();
    }
}
