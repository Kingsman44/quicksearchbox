package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80372b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.m */
/* compiled from: PG */
public final /* synthetic */ class C77400m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77402o f213417a;

    /* renamed from: b */
    public final /* synthetic */ C80372b f213418b;

    public /* synthetic */ C77400m(C77402o oVar, C80372b bVar) {
        this.f213417a = oVar;
        this.f213418b = bVar;
    }

    public final void accept(Object obj) {
        C77402o oVar = this.f213417a;
        C80372b bVar = this.f213418b;
        String str = (String) obj;
        if (oVar.f213424b.mo71340o().equals(Optional.m71637of(str))) {
            bVar.copyOnWrite();
            C80373c cVar = C80373c.f220529m;
            ((C80373c) bVar.instance).f220532b = true;
        } else {
            bVar.copyOnWrite();
            C80373c cVar2 = C80373c.f220529m;
            ((C80373c) bVar.instance).f220533c = true;
        }
        if (oVar.f213423a.mo74732b(str)) {
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220534d = true;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
