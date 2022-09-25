package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.android.libraries.search.udcdataservice.C41408g;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C136906h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C41387c f372612a;

    public /* synthetic */ C136906h(C41387c cVar) {
        this.f372612a = cVar;
    }

    public final Object apply(Object obj) {
        int a;
        C41387c cVar = this.f372612a;
        List list = (List) obj;
        boolean z = false;
        if (list != null && list.size() == 1) {
            C41387c a2 = C41387c.m72380a(((C41389e) list.get(0)).f108146b);
            if (a2 == null) {
                a2 = C41387c.DEFAULT;
            }
            if (a2 == cVar && (a = C41408g.m72395a(((C41389e) list.get(0)).f108147c)) != 0 && a == 2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
