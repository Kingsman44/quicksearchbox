package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.common.p4552o.afh;
import com.google.common.p4552o.afi;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C79771bu implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ afh f218702a;

    public /* synthetic */ C79771bu(afh afh) {
        this.f218702a = afh;
    }

    public final void accept(Object obj) {
        afh afh = this.f218702a;
        afh.copyOnWrite();
        afi afi = (afi) afh.instance;
        afi afi2 = afi.f158536i;
        afi.f158545h = ((C80363t) obj).getNumber();
        afi.f158538a |= 64;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
