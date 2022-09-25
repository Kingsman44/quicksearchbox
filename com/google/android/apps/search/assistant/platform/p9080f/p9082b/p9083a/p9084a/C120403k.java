package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C120403k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C120406n f334910a;

    public /* synthetic */ C120403k(C120406n nVar) {
        this.f334910a = nVar;
    }

    public final Object apply(Object obj) {
        C120406n nVar = this.f334910a;
        C37348am amVar = (C37348am) obj;
        C37344ai a = C37344ai.m66353a(amVar.f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        if (a != C37344ai.RELEASED) {
            throw new C120405m(amVar);
        } else if (nVar.f334913b.get()) {
            return null;
        } else {
            throw new C120404l();
        }
    }
}
