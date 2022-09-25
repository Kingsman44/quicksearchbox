package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.aw */
/* compiled from: PG */
final class C100144aw {

    /* renamed from: a */
    public static final C59071e f280031a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.b.aw");

    /* renamed from: a */
    static boolean m165969a(C118327r rVar) {
        C58485gu guVar = rVar.f328453a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C118336y yVar = (C118336y) guVar.get(i);
            int c = yVar.mo103659c();
            if (c == 12 || c == 14 || c == 16 || c == 15 || c == 13) {
                return true;
            }
            if (c == 17 && m165969a((C118327r) yVar)) {
                return true;
            }
        }
        return false;
    }
}
