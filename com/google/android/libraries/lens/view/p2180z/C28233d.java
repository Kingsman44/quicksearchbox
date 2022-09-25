package com.google.android.libraries.lens.view.p2180z;

import com.google.android.libraries.lens.view.p2067ak.C25275n;
import com.google.android.libraries.lens.view.p2067ak.C25277p;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.lens.view.z.d */
/* compiled from: PG */
public final /* synthetic */ class C28233d implements BiConsumer {

    /* renamed from: a */
    public static final /* synthetic */ C28233d f76883a = new C28233d();

    private /* synthetic */ C28233d() {
    }

    public final void accept(Object obj, Object obj2) {
        C25275n nVar = (C25275n) obj;
        C63042fg fgVar = (C63042fg) obj2;
        int i = C28229ad.f76850c;
        nVar.copyOnWrite();
        C25277p pVar = (C25277p) nVar.instance;
        C25277p pVar2 = C25277p.f68762g;
        fgVar.getClass();
        C62971cq cqVar = pVar.f68767d;
        if (!cqVar.mo58948c()) {
            pVar.f68767d = C62942bv.mutableCopy(cqVar);
        }
        pVar.f68767d.add(fgVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
