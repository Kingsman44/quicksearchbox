package com.google.android.libraries.assistant.auto.tng.common.p901d;

import com.google.android.libraries.assistant.auto.tng.common.p901d.p902a.C13223a;
import com.google.android.libraries.assistant.auto.tng.common.p901d.p902a.C13224b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.d.e */
/* compiled from: PG */
public final /* synthetic */ class C13228e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f40879a;

    public /* synthetic */ C13228e(String str) {
        this.f40879a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f40879a;
        C13224b bVar = (C13224b) obj;
        if (bVar == null) {
            return C13224b.f40871c;
        }
        C13223a aVar = (C13223a) bVar.toBuilder();
        aVar.copyOnWrite();
        C13224b bVar2 = (C13224b) aVar.instance;
        bVar2.f40873a |= 1;
        bVar2.f40874b = str;
        return (C13224b) aVar.build();
    }
}
