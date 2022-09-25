package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9202b.p9203a;

import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9197f.C121338d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C121345a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121338d f336957a;

    /* renamed from: b */
    public final /* synthetic */ String f336958b;

    public /* synthetic */ C121345a(C121338d dVar, String str) {
        this.f336957a = dVar;
        this.f336958b = str;
    }

    public final Object apply(Object obj) {
        C121338d dVar = this.f336957a;
        String str = this.f336958b;
        ArrayList arrayList = new ArrayList();
        for (List list : (List) obj) {
            if (list != null) {
                arrayList.addAll(dVar.mo105112a(str, C58485gu.m89842j(list)));
            }
        }
        arrayList.size();
        return C58485gu.m89842j(arrayList);
    }
}
