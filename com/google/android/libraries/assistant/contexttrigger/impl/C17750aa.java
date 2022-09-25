package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.aa */
/* compiled from: PG */
public final /* synthetic */ class C17750aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C48919u f50978a;

    public /* synthetic */ C17750aa(C48919u uVar) {
        this.f50978a = uVar;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C48918t tVar = (C48918t) this.f50978a.toBuilder();
        str.getClass();
        tVar.copyOnWrite();
        C48919u uVar = (C48919u) tVar.instance;
        uVar.f126588a |= 2;
        uVar.f126590c = str;
        return (C48919u) tVar.build();
    }
}
