package com.google.android.libraries.storage.protostore;

import com.google.common.base.C58817ah;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.ar */
/* compiled from: PG */
public final /* synthetic */ class C42892ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112213a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f112214b;

    public /* synthetic */ C42892ar(C42905ba baVar, AtomicBoolean atomicBoolean) {
        this.f112213a = baVar;
        this.f112214b = atomicBoolean;
    }

    public final Object apply(Object obj) {
        C42905ba baVar = this.f112213a;
        Void voidR = (Void) obj;
        if (this.f112214b.get()) {
            return null;
        }
        baVar.mo45992h();
        return null;
    }
}
