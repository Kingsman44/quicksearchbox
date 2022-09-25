package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9151c.C121031a;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9151c.C121032b;
import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.b.d */
/* compiled from: PG */
public final /* synthetic */ class C121020d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C34807b f336393a;

    public /* synthetic */ C121020d(C34807b bVar) {
        this.f336393a = bVar;
    }

    public final Object apply(Object obj) {
        C34807b bVar = this.f336393a;
        C121031a aVar = (C121031a) ((C121032b) obj).toBuilder();
        boolean z = bVar != C34807b.NOT_ELIGIBLE;
        aVar.copyOnWrite();
        C121032b bVar2 = (C121032b) aVar.instance;
        bVar2.f336410a = 1 | bVar2.f336410a;
        bVar2.f336411b = z;
        aVar.copyOnWrite();
        C121032b bVar3 = (C121032b) aVar.instance;
        bVar3.f336412c = bVar.f92345g;
        bVar3.f336410a |= 2;
        return (C121032b) aVar.build();
    }
}
