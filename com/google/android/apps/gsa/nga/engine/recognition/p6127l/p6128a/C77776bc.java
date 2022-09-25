package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bc */
/* compiled from: PG */
public final /* synthetic */ class C77776bc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C91006f f214249a;

    public /* synthetic */ C77776bc(C91006f fVar) {
        this.f214249a = fVar;
    }

    public final void accept(Object obj) {
        C8476as asVar = (C8476as) obj;
        C91005e b = this.f214249a.mo85278b("Soda language pack version");
        String str = asVar.f29417b;
        int i = asVar.f29419d;
        b.mo85276a(C90752i.m148229c(str + " v" + i));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
