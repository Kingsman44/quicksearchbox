package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9151c.C121033c;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9151c.C121034d;
import com.google.common.base.C58817ah;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.b.k */
/* compiled from: PG */
public final /* synthetic */ class C121027k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f336400a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f336401b;

    public /* synthetic */ C121027k(AtomicBoolean atomicBoolean, Boolean bool) {
        this.f336400a = atomicBoolean;
        this.f336401b = bool;
    }

    public final Object apply(Object obj) {
        AtomicBoolean atomicBoolean = this.f336400a;
        Boolean bool = this.f336401b;
        C121034d dVar = (C121034d) obj;
        atomicBoolean.set(dVar.f336416b != bool.booleanValue());
        C121033c cVar = (C121033c) dVar.toBuilder();
        boolean booleanValue = bool.booleanValue();
        cVar.copyOnWrite();
        C121034d dVar2 = (C121034d) cVar.instance;
        dVar2.f336415a |= 1;
        dVar2.f336416b = booleanValue;
        return (C121034d) cVar.build();
    }
}
