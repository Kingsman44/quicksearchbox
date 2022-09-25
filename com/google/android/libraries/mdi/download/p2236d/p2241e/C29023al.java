package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29395es;
import com.google.android.libraries.mdi.download.C29396et;
import com.google.common.base.C58817ah;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.e.al */
/* compiled from: PG */
public final /* synthetic */ class C29023al implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f78784a;

    public /* synthetic */ C29023al(AtomicReference atomicReference) {
        this.f78784a = atomicReference;
    }

    public final Object apply(Object obj) {
        AtomicReference atomicReference = this.f78784a;
        C29396et etVar = (C29396et) obj;
        int i = C29025an.f78785e;
        atomicReference.set(etVar.f79695c);
        C29395es esVar = (C29395es) etVar.toBuilder();
        esVar.copyOnWrite();
        ((C29396et) esVar.instance).f79695c = C29396et.emptyProtobufList();
        return (C29396et) esVar.build();
    }
}
