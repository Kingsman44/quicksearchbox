package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.p */
/* compiled from: PG */
public final /* synthetic */ class C83179p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226795a;

    public /* synthetic */ C83179p(C82822bs bsVar) {
        this.f226795a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226795a;
        C80513b bVar = (C80513b) obj;
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        bVar.getClass();
        btVar.f225684c = bVar;
        btVar.f225682a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
