package com.google.android.libraries.silk.p3240c;

import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.silk.c.i */
/* compiled from: PG */
public final /* synthetic */ class C41813i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C41871q f109189a;

    /* renamed from: b */
    public final /* synthetic */ C56848d f109190b;

    public /* synthetic */ C41813i(C41871q qVar, C56848d dVar) {
        this.f109189a = qVar;
        this.f109190b = dVar;
    }

    public final void accept(Object obj) {
        C41871q qVar = this.f109189a;
        C56848d dVar = this.f109190b;
        qVar.f109264b.mo26140c((String) obj, dVar.toByteArray());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
