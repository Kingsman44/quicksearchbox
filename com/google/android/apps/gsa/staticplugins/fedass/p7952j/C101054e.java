package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.e */
/* compiled from: PG */
public final /* synthetic */ class C101054e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ List f282192a;

    /* renamed from: b */
    public final /* synthetic */ C84235h f282193b;

    public /* synthetic */ C101054e(List list, C84235h hVar) {
        this.f282192a = list;
        this.f282193b = hVar;
    }

    public final C60870cx apply(Object obj) {
        List list = this.f282192a;
        C84235h hVar = this.f282193b;
        ArrayList arrayList = new ArrayList();
        for (String str : (List) obj) {
            if (!list.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return C60866ct.f164955a;
        }
        return hVar.mo77716f(arrayList);
    }
}
