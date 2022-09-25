package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.k */
/* compiled from: PG */
public final /* synthetic */ class C83174k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226790a;

    public /* synthetic */ C83174k(C82822bs bsVar) {
        this.f226790a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226790a;
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        btVar.f225688g = ((C82831ca) obj).f225800aL;
        btVar.f225682a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
