package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58832aw;
import java.util.Comparator;

/* renamed from: com.google.e.a.d.f */
/* compiled from: PG */
final class C61052f implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (C58832aw.m90831a(str, str2)) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
