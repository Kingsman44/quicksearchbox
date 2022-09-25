package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121123a;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.o */
/* compiled from: PG */
public final /* synthetic */ class C121137o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f336584a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f336585b;

    public /* synthetic */ C121137o(AtomicBoolean atomicBoolean, Boolean bool) {
        this.f336584a = atomicBoolean;
        this.f336585b = bool;
    }

    public final Object apply(Object obj) {
        AtomicBoolean atomicBoolean = this.f336584a;
        Boolean bool = this.f336585b;
        C121124b bVar = (C121124b) obj;
        C59071e eVar = C121140r.f336590a;
        atomicBoolean.set(bVar.f336566b != bool.booleanValue());
        C121123a aVar = (C121123a) bVar.toBuilder();
        boolean booleanValue = bool.booleanValue();
        aVar.copyOnWrite();
        C121124b bVar2 = (C121124b) aVar.instance;
        bVar2.f336565a |= 1;
        bVar2.f336566b = booleanValue;
        return (C121124b) aVar.build();
    }
}
