package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82822bs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82823bt;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.g */
/* compiled from: PG */
public final /* synthetic */ class C83170g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82822bs f226786a;

    public /* synthetic */ C83170g(C82822bs bsVar) {
        this.f226786a = bsVar;
    }

    public final void accept(Object obj) {
        C82822bs bsVar = this.f226786a;
        String str = (String) obj;
        bsVar.copyOnWrite();
        C82823bt btVar = (C82823bt) bsVar.instance;
        C82823bt btVar2 = C82823bt.f225680i;
        str.getClass();
        btVar.f225682a |= 8;
        btVar.f225686e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
