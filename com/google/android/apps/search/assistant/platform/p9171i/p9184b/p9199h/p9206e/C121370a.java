package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9206e;

import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f.C121338d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.e.a */
/* compiled from: PG */
public final /* synthetic */ class C121370a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f337000a;

    public /* synthetic */ C121370a(int i) {
        this.f337000a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f337000a;
        C58485gu guVar = (C58485gu) obj;
        if (i > 0 && i < guVar.size()) {
            ArrayList arrayList = new ArrayList(guVar);
            Collections.sort(arrayList, C121338d.f336946a);
            guVar = C58485gu.m89842j(arrayList.subList(0, i));
        }
        return C60856cj.m92900i(guVar);
    }
}
