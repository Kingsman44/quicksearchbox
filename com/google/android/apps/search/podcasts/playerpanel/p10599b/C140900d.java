package com.google.android.apps.search.podcasts.playerpanel.p10599b;

import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.widgets.valueselector.C141287e;
import com.google.android.material.chip.Chip;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.b.d */
/* compiled from: PG */
final class C140900d implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C140906j f382591a;

    public C140900d(C140906j jVar) {
        this.f382591a = jVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C140787e eVar = (C140787e) obj;
        C69664n.m101061g(eVar, "it");
        C140906j jVar = this.f382591a;
        if (!jVar.f382608k) {
            jVar.mo116005b().f116095f = null;
            this.f382591a.mo116005b().setChecked(eVar.f382283d.f382276b);
            Chip b = this.f382591a.mo116005b();
            C140906j jVar2 = this.f382591a;
            b.f116095f = jVar2.f382609l;
            jVar2.mo116004a().mo116315c(new C141287e(eVar.f382283d.f382275a), false);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
