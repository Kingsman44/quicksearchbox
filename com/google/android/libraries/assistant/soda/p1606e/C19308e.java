package com.google.android.libraries.assistant.soda.p1606e;

import com.google.android.libraries.assistant.soda.p1606e.p1610d.C19306a;
import com.google.android.libraries.assistant.soda.p1606e.p1610d.C19307b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.soda.e.e */
/* compiled from: PG */
public final /* synthetic */ class C19308e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f54037a;

    public /* synthetic */ C19308e(String str) {
        this.f54037a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f54037a;
        C19306a aVar = (C19306a) ((C19307b) obj).toBuilder();
        aVar.copyOnWrite();
        C19307b bVar = (C19307b) aVar.instance;
        str.getClass();
        bVar.f54035a |= 1;
        bVar.f54036b = str;
        return (C19307b) aVar.build();
    }
}
