package com.facebook.litho;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.litho.n */
/* compiled from: PG */
public final class C6404n {
    /* renamed from: a */
    public static List m17222a(List list, Object obj) {
        if (list == null) {
            list = new LinkedList();
        }
        list.add(obj);
        return list;
    }

    /* renamed from: b */
    public static boolean m17223b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m17224c(C6142bw bwVar, C6142bw bwVar2) {
        if (bwVar == bwVar2) {
            return true;
        }
        if (bwVar == null || bwVar2 == null) {
            return false;
        }
        return bwVar.mo13057a(bwVar2);
    }
}
