package com.google.android.libraries.assistant.auto.tng.p1008j.p1009a;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b.C13640a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b.C13641b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13636a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f41674a;

    public /* synthetic */ C13636a(boolean z) {
        this.f41674a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f41674a;
        C13640a aVar = (C13640a) ((C13641b) obj).toBuilder();
        aVar.copyOnWrite();
        C13641b bVar = (C13641b) aVar.instance;
        bVar.f41680a |= 2;
        bVar.f41682c = z;
        return (C13641b) aVar.build();
    }
}
