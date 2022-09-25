package com.facebook.litho.p329g;

import com.facebook.litho.C6231ee;
import com.facebook.litho.C6261fd;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.p1729h.C21215m;

/* renamed from: com.facebook.litho.g.aa */
/* compiled from: PG */
public final class C6297aa {
    /* renamed from: a */
    public static C6261fd m16881a(C6411u uVar, int i, C6335n nVar, C6335n nVar2) {
        String str;
        C21215m m = uVar.mo13475m();
        if (m == null) {
            return null;
        }
        C6261fd a = C6231ee.m16500a(uVar, m, m.mo26269a(uVar, i));
        if (a != null) {
            String str2 = "null";
            if (nVar == null) {
                str = str2;
            } else {
                str = nVar.f18735f;
            }
            a.mo13235a("section_current", str);
            if (nVar2 != null) {
                str2 = nVar2.f18735f;
            }
            a.mo13235a("section_next", str2);
        }
        return a;
    }

    /* renamed from: b */
    public static String m16882b(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "updateStateAsync" : "updateState" : "setRootAsync" : "setRoot" : "none";
    }
}
