package com.google.android.libraries.lens.view.p2088az;

import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.android.libraries.search.udcdataservice.C41408g;
import com.google.common.base.C58817ah;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.az.c */
/* compiled from: PG */
public final /* synthetic */ class C25668c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C25668c f69805a = new C25668c();

    private /* synthetic */ C25668c() {
    }

    public final Object apply(Object obj) {
        int a;
        Iterator it = ((List) obj).iterator();
        boolean z = false;
        if (it.hasNext()) {
            C41389e eVar = (C41389e) it.next();
            C41387c a2 = C41387c.m72380a(eVar.f108146b);
            if (a2 == null) {
                a2 = C41387c.DEFAULT;
            }
            if (a2 == C41387c.WEB_HISTORY && (a = C41408g.m72395a(eVar.f108147c)) != 0 && a == 2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
