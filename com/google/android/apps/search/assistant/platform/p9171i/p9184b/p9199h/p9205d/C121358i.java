package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.i */
/* compiled from: PG */
public final /* synthetic */ class C121358i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f336983a;

    public /* synthetic */ C121358i(int i) {
        this.f336983a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f336983a;
        C58485gu guVar = (C58485gu) obj;
        Comparator comparator = C121365p.f336990a;
        if (i > 0 && i < guVar.size()) {
            ArrayList arrayList = new ArrayList(guVar);
            Collections.sort(arrayList, C121365p.f336990a);
            guVar = C58485gu.m89842j(arrayList.subList(0, i));
        }
        return C60856cj.m92900i(guVar);
    }
}
