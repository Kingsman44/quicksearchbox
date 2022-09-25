package com.google.p5238v.p5239a.p5250f;

import com.google.p5238v.p5239a.C67531ab;
import com.google.p5238v.p5239a.C67533ad;
import com.google.p5238v.p5239a.C67901q;
import com.google.p5238v.p5239a.p5253h.C67638a;
import com.google.p5238v.p5239a.p5253h.C67639b;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.v.a.f.k */
/* compiled from: PG */
public final class C67604k {
    /* renamed from: a */
    public static void m97773a(C67533ad adVar) {
        C67901q qVar;
        ArrayList arrayList = new ArrayList();
        C67638a aVar = C67638a.f183586a;
        for (List it : adVar.mo59909a()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C67531ab abVar = (C67531ab) it2.next();
                    int i = abVar.f183447e - 2;
                    if (i == 1) {
                        qVar = C67901q.f184079a;
                    } else if (i == 2) {
                        qVar = C67901q.f184080b;
                    } else if (i == 3) {
                        qVar = C67901q.f184081c;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    arrayList.add(new C67639b(qVar, abVar.f183445c, abVar.f183446d.mo59940a()));
                }
            }
        }
        C67531ab abVar2 = adVar.f183450a;
        Integer valueOf = abVar2 != null ? Integer.valueOf(abVar2.f183445c) : null;
        if (valueOf != null) {
            try {
                int intValue = valueOf.intValue();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = ((C67639b) arrayList.get(i2)).f183588a;
                    i2++;
                    if (i3 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
