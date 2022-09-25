package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82968hc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82969hd;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C77780bg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82968hc f214259a;

    public /* synthetic */ C77780bg(C82968hc hcVar) {
        this.f214259a = hcVar;
    }

    public final void accept(Object obj) {
        C82968hc hcVar = this.f214259a;
        C8476as asVar = (C8476as) obj;
        int i = asVar.f29416a;
        if ((i & 1) != 0 && (i & 4) != 0) {
            int i2 = asVar.f29419d;
            hcVar.copyOnWrite();
            C82969hd hdVar = (C82969hd) hcVar.instance;
            C82969hd hdVar2 = C82969hd.f226361e;
            hdVar.f226363a |= 2;
            hdVar.f226365c = i2;
            String str = asVar.f29417b;
            hcVar.copyOnWrite();
            C82969hd hdVar3 = (C82969hd) hcVar.instance;
            str.getClass();
            hdVar3.f226363a |= 4;
            hdVar3.f226366d = str;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
