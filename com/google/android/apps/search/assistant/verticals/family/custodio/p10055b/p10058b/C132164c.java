package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10058b;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132201a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132209i;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C132164c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f360740a;

    public /* synthetic */ C132164c(String str) {
        this.f360740a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f360740a;
        C132209i iVar = (C132209i) obj;
        C132201a aVar = (C132201a) iVar.toBuilder();
        if (iVar.f360856b.containsKey(str)) {
            aVar.copyOnWrite();
            ((C132209i) aVar.instance).mo110538a().remove(str);
        }
        return (C132209i) aVar.build();
    }
}
