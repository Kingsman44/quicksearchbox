package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.p8938a.p8939a.p8940a.C119184a;
import com.google.android.apps.search.assistant.p8938a.p8939a.p8940a.C119185b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.az */
/* compiled from: PG */
public final /* synthetic */ class C131786az implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131790bc f359970a;

    public /* synthetic */ C131786az(C131790bc bcVar) {
        this.f359970a = bcVar;
    }

    public final Object apply(Object obj) {
        C131790bc bcVar = this.f359970a;
        C119184a aVar = (C119184a) ((C119185b) obj).toBuilder();
        int a = bcVar.f359975b.mo50068a();
        aVar.copyOnWrite();
        C119185b bVar = (C119185b) aVar.instance;
        bVar.f332384a |= 1;
        bVar.f332385b = a;
        long a2 = bcVar.f359979f.mo26869a();
        aVar.copyOnWrite();
        C119185b bVar2 = (C119185b) aVar.instance;
        bVar2.f332384a |= 2;
        bVar2.f332386c = a2;
        return (C119185b) aVar.build();
    }
}
