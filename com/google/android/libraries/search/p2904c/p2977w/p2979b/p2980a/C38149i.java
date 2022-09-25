package com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a;

import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;

/* renamed from: com.google.android.libraries.search.c.w.b.a.i */
/* compiled from: PG */
public final class C38149i {
    /* renamed from: a */
    public static final String m67347a(C37514du duVar) {
        C37512ds dsVar;
        String name;
        StringBuilder sb = new StringBuilder();
        int i = duVar.f99631a;
        if (i == 1) {
            C37516dw a = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
            if (a == null) {
                a = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            name = a.name();
        } else {
            if (i == 2) {
                dsVar = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
                if (dsVar == null) {
                    dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                }
            } else {
                dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            name = dsVar.name();
        }
        sb.append(name);
        return sb.toString();
    }
}
