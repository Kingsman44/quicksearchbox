package com.google.p4172bg.p4173a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.protos.p5132q.C65869l;
import com.google.protos.p5132q.C65873p;
import com.google.protos.p5132q.C65874q;
import com.google.protos.p5132q.C65876s;
import java.util.IdentityHashMap;

/* renamed from: com.google.bg.a.c */
/* compiled from: PG */
public final class C55692c {

    /* renamed from: c */
    private static final C65874q f146925c;

    /* renamed from: a */
    public final C65876s f146926a;

    /* renamed from: b */
    public final C58487gw f146927b;

    /* renamed from: d */
    private final IdentityHashMap f146928d;

    static {
        C65869l lVar = (C65869l) C65874q.f179080k.createBuilder();
        lVar.copyOnWrite();
        C65874q qVar = (C65874q) lVar.instance;
        qVar.f179082a |= 1;
        qVar.f179083b = -1;
        f146925c = (C65874q) lVar.build();
    }

    public C55692c(C65876s sVar) {
        C65874q qVar;
        int i;
        this.f146926a = sVar;
        C58486gv gvVar = new C58486gv();
        C58486gv gvVar2 = new C58486gv();
        for (int i2 = 0; i2 < sVar.f179095a.size(); i2++) {
            C65874q qVar2 = (C65874q) sVar.f179095a.get(i2);
            C65873p a = C65873p.m96817a(qVar2.f179085d);
            gvVar2.mo55419c(a == null ? C65873p.LINE : a, qVar2);
            if ((qVar2.f179082a & 1) == 0 || (i = qVar2.f179083b) < 0) {
                gvVar.mo55419c(-1, qVar2);
            } else if (i < sVar.f179095a.size()) {
                int i3 = qVar2.f179083b;
                if (i2 != i3) {
                    gvVar.mo55419c(Integer.valueOf(i3), qVar2);
                } else {
                    throw new IllegalArgumentException("Loop detected. Entity with id=" + i2 + " is its own parent.");
                }
            } else {
                int i4 = qVar2.f179083b;
                int size = sVar.f179095a.size();
                StringBuilder sb = new StringBuilder("ParentEntityId=");
                sb.append(i4);
                sb.append(" must either be -1 or in {0, ..., entitiesCount - 1}={0, ..., ");
                sb.append(size - 1);
                sb.append("}");
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
        C58487gw a2 = gvVar.mo55417a();
        this.f146928d = new IdentityHashMap();
        int i5 = -1;
        while (i5 < sVar.f179095a.size()) {
            IdentityHashMap identityHashMap = this.f146928d;
            if (i5 == -1) {
                qVar = f146925c;
                i5 = -1;
            } else {
                qVar = (C65874q) sVar.f179095a.get(i5);
            }
            identityHashMap.put(qVar, new C55690a(i5, a2.mo55277g(Integer.valueOf(i5))));
            i5++;
        }
        this.f146927b = gvVar2.mo55417a();
    }

    /* renamed from: a */
    public final int mo54269a(C65874q qVar) {
        if (qVar == null) {
            return -1;
        }
        return ((C55691b) this.f146928d.get(qVar)).mo54264a();
    }

    /* renamed from: b */
    public final C58485gu mo54270b(C65874q qVar) {
        IdentityHashMap identityHashMap = this.f146928d;
        if (qVar == null) {
            qVar = f146925c;
        }
        return ((C55691b) identityHashMap.get(qVar)).mo54265b();
    }
}
