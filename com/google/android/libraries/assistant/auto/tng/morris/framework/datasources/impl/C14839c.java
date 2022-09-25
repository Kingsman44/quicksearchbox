package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.c */
/* compiled from: PG */
public final /* synthetic */ class C14839c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14878h f44675a;

    /* renamed from: b */
    public final /* synthetic */ long f44676b;

    public /* synthetic */ C14839c(C14878h hVar, long j) {
        this.f44675a = hVar;
        this.f44676b = j;
    }

    public final Object apply(Object obj) {
        C14878h hVar = this.f44675a;
        long j = this.f44676b;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            C59104x d = C14878h.f44766a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(45495)).mo56386p("No phone numbers found for contact ID.");
            return C14782b.SUCCESS;
        }
        hVar.f44771f.put(Long.valueOf(j), guVar);
        return C14782b.SUCCESS;
    }
}
