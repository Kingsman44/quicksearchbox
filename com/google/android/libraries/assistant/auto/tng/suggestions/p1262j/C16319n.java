package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.apps.auto.p450a.p451a.C8873ar;
import com.google.android.apps.auto.p450a.p451a.C8874as;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.n */
/* compiled from: PG */
public final /* synthetic */ class C16319n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f48010a;

    public /* synthetic */ C16319n(long j) {
        this.f48010a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f48010a;
        C8874as asVar = (C8874as) obj;
        C8873ar arVar = (C8873ar) asVar.toBuilder();
        long j2 = asVar.f30811b;
        arVar.copyOnWrite();
        C8874as asVar2 = (C8874as) arVar.instance;
        asVar2.f30810a |= 4;
        asVar2.f30812c = j + j2;
        return (C8874as) arVar.build();
    }
}
