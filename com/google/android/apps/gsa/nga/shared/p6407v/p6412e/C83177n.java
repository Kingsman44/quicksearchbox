package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.n */
/* compiled from: PG */
public final /* synthetic */ class C83177n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226793a;

    public /* synthetic */ C83177n(C82822bs bsVar) {
        this.f226793a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226793a;
        C82988hw hwVar = (C82988hw) obj;
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        hwVar.getClass();
        btVar.f225683b = hwVar;
        btVar.f225682a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
