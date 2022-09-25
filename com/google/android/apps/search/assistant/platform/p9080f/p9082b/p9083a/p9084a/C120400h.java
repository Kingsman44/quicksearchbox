package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C120400h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C120406n f334906a;

    public /* synthetic */ C120400h(C120406n nVar) {
        this.f334906a = nVar;
    }

    public final Object apply(Object obj) {
        C120406n nVar = this.f334906a;
        C37338ac acVar = (C37338ac) obj;
        C37341af a = C37341af.m66350a(acVar.f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        if (a == C37341af.ACQUIRED) {
            return nVar;
        }
        throw new C120401i(acVar);
    }
}
