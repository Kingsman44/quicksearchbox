package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.protos.p4895aw.p4902b.C64049de;
import com.google.protos.p4895aw.p4902b.C64051dg;
import com.google.protos.p4895aw.p4902b.C64053di;
import com.google.protos.p4895aw.p4902b.C64054dj;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.k.al */
/* compiled from: PG */
public final class C147137al {
    /* renamed from: a */
    public static final Integer m239934a(C64054dj djVar, List list, boolean z, Integer num) {
        int a = C64053di.m96342a(djVar.f173190b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i != 2) {
                return num;
            }
            C64051dg c = m239936c(list, z);
            if (c.f173184c) {
                return Integer.valueOf(c.f173185d);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m239935b(C64054dj djVar, List list, boolean z) {
        int a = C64053di.m96342a(djVar.f173190b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return true;
        }
        return m239936c(list, z).f173184c;
    }

    /* renamed from: c */
    private static C64051dg m239936c(List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C64051dg dgVar = (C64051dg) it.next();
            Iterator it2 = dgVar.f173183b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    return dgVar;
                }
                C64049de deVar = (C64049de) it2.next();
                int i = deVar.f173178a;
                boolean z2 = false;
                int i2 = i != 0 ? i != 1 ? 0 : 1 : 2;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (i == 1) {
                        z2 = ((Boolean) deVar.f173179b).booleanValue();
                    }
                    if (z2 != z) {
                    }
                }
            }
        }
        return C64051dg.f173180e;
    }
}
