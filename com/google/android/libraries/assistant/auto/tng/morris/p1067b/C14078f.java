package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.f */
/* compiled from: PG */
public final /* synthetic */ class C14078f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f42745a;

    public /* synthetic */ C14078f(int i) {
        this.f42745a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f42745a;
        C14075c cVar = (C14075c) ((C14077e) obj).toBuilder();
        cVar.copyOnWrite();
        C14077e eVar = (C14077e) cVar.instance;
        eVar.f42733a |= 1;
        eVar.f42735c = i;
        return C60856cj.m92900i((C14077e) cVar.build());
    }
}
