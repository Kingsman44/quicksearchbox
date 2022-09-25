package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bk */
/* compiled from: PG */
public final /* synthetic */ class C111873bk implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f310868a;

    /* renamed from: b */
    public final /* synthetic */ C58490gz f310869b;

    public /* synthetic */ C111873bk(C58490gz gzVar, C58490gz gzVar2) {
        this.f310868a = gzVar;
        this.f310869b = gzVar2;
    }

    public final void accept(Object obj, Object obj2) {
        C58490gz gzVar = this.f310868a;
        C58490gz gzVar2 = this.f310869b;
        Integer num = (Integer) obj;
        C59496bt btVar = (C59496bt) obj2;
        C121537f fVar = C111877bo.f310873a;
        if (!btVar.f157865d.isEmpty()) {
            if ((btVar.f157862a & 2) == 0) {
                C59494br brVar = (C59494br) btVar.toBuilder();
                int size = btVar.f157865d.size();
                brVar.copyOnWrite();
                C59496bt btVar2 = (C59496bt) brVar.instance;
                btVar2.f157862a |= 2;
                btVar2.f157864c = size;
                btVar = (C59496bt) brVar.build();
            }
            gzVar2.mo55429h(num, btVar);
            return;
        }
        gzVar.mo55429h(num, btVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
