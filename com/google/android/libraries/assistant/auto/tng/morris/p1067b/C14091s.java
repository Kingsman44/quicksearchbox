package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.s */
/* compiled from: PG */
public final /* synthetic */ class C14091s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ boolean f42758a;

    public /* synthetic */ C14091s(boolean z) {
        this.f42758a = z;
    }

    public final C60870cx apply(Object obj) {
        boolean z = this.f42758a;
        C14075c cVar = (C14075c) ((C14077e) obj).toBuilder();
        cVar.copyOnWrite();
        C14077e eVar = (C14077e) cVar.instance;
        eVar.f42733a |= 128;
        eVar.f42742j = z;
        return C60856cj.m92900i((C14077e) cVar.build());
    }
}
