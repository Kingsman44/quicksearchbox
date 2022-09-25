package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g;

import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.g.b */
/* compiled from: PG */
public final class C115485b {
    /* renamed from: a */
    public static C58833ax m191567a(C52174hz hzVar) {
        if ((hzVar.f136894a & 1) == 0) {
            return C58836b.f156633a;
        }
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52567wn b = C52567wn.m86649b(woVar.f138003j);
        if (b == null) {
            b = C52567wn.UNKNOWN;
        }
        String name = b.name();
        String str = hzVar.f136895b;
        return C58833ax.m90834k(name + "||" + str);
    }

    /* renamed from: b */
    public static C58833ax m191568b(String str) {
        int indexOf = str.indexOf("||");
        if (indexOf <= 0) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(C52567wn.m86648a(str.substring(0, indexOf)));
    }

    /* renamed from: c */
    public static C58833ax m191569c(String str) {
        int indexOf = str.indexOf("||");
        if (indexOf <= 0) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(str.substring(indexOf + 2));
    }
}
