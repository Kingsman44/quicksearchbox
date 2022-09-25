package com.google.common.p4523c;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58699os;
import com.google.common.p4575r.C60755l;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.common.c.ac */
/* compiled from: PG */
public abstract class C58920ac {
    /* renamed from: d */
    public static C58920ac m91064d(Iterable iterable, C58817ah ahVar) {
        C58919ab abVar;
        C58918aa aaVar = new C58918aa(ahVar);
        Iterator it = iterable.iterator();
        loop0:
        while (true) {
            abVar = null;
            if (!it.hasNext()) {
                break;
            }
            C60755l lVar = (C60755l) ahVar.apply(it.next());
            int i = 0;
            while (true) {
                if (i < lVar.f164798c) {
                    if ((lVar.mo57181a(i) & -128) != 0) {
                        aaVar = null;
                        break loop0;
                    }
                    i++;
                }
            }
        }
        if (aaVar != null) {
            return aaVar;
        }
        int[] iArr = new int[256];
        iArr[0] = 1;
        Iterator it2 = iterable.iterator();
        loop2:
        while (true) {
            if (!it2.hasNext()) {
                abVar = new C58919ab(iArr, ahVar);
                break;
            }
            C60755l lVar2 = (C60755l) ahVar.apply(it2.next());
            int i2 = 0;
            while (true) {
                if (i2 < lVar2.f164798c) {
                    int a = lVar2.mo57181a(i2);
                    int i3 = a & PrivateKeyType.INVALID;
                    int i4 = iArr[i3];
                    if (i4 != a) {
                        if ((i4 & PrivateKeyType.INVALID) == i3) {
                            break loop2;
                        }
                        iArr[i3] = a;
                    }
                    i2++;
                }
            }
        }
        if (abVar != null) {
            return abVar;
        }
        C58947v vVar = new C58947v(ahVar);
        C58461fx fxVar = new C58461fx();
        C58948w wVar = new C58948w(fxVar);
        for (Object a2 : iterable) {
            vVar.mo56212a(a2, wVar);
        }
        return new C58950y(new C58699os(fxVar), vVar);
    }

    /* renamed from: a */
    public abstract int mo56199a();

    /* renamed from: b */
    public abstract C60755l mo56201b(Object obj);
}
