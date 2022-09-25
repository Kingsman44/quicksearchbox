package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.C21942ah;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65819cw;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.f.m */
/* compiled from: PG */
public final /* synthetic */ class C21863m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60335a;

    /* renamed from: b */
    public final /* synthetic */ Set f60336b;

    public /* synthetic */ C21863m(C21875y yVar, Set set) {
        this.f60335a = yVar;
        this.f60336b = set;
    }

    public final Object call() {
        C65819cw cwVar;
        C65819cw cwVar2;
        C21875y yVar = this.f60335a;
        Set set = this.f60336b;
        C21942ah ahVar = yVar.f60362f;
        C65744ab b = yVar.f60359c.mo27116b();
        HashMap hashMap = new HashMap();
        for (C65743aa aaVar : b.f178607a) {
            if (aaVar.f178599a == 2) {
                C65753ak b2 = C65753ak.m96797b(aaVar.f178601c);
                if (b2 == null) {
                    b2 = C65753ak.UNKNOWN;
                }
                if (aaVar.f178599a == 2) {
                    cwVar2 = (C65819cw) aaVar.f178600b;
                } else {
                    cwVar2 = C65819cw.f178926i;
                }
                hashMap.put(b2, cwVar2.f178932e);
            }
        }
        ahVar.mo27220d(set, hashMap);
        C21942ah ahVar2 = yVar.f60362f;
        C65744ab b3 = yVar.f60359c.mo27116b();
        HashMap hashMap2 = new HashMap();
        for (C65743aa aaVar2 : b3.f178607a) {
            if (aaVar2.f178599a == 2) {
                C65753ak b4 = C65753ak.m96797b(aaVar2.f178601c);
                if (b4 == null) {
                    b4 = C65753ak.UNKNOWN;
                }
                if (aaVar2.f178599a == 2) {
                    cwVar = (C65819cw) aaVar2.f178600b;
                } else {
                    cwVar = C65819cw.f178926i;
                }
                hashMap2.put(b4, cwVar.f178933f);
            }
        }
        ahVar2.mo27217a(set, hashMap2);
        return null;
    }
}
