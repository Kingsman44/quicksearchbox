package com.google.android.apps.search.googleapp.launcher.minusone;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136469e;
import com.google.android.apps.search.googleapp.p10115a.p10116a.C133074a;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.l */
/* compiled from: PG */
final class C136657l implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C136652i f372012a;

    public C136657l(C136652i iVar) {
        this.f372012a = iVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C133074a aVar = (C133074a) obj;
        C69664n.m101061g(aVar, "it");
        if ((this.f372012a.f371987f.f371547a & 1) != 0) {
            C136469e eVar = C136469e.TNG_MINUS_ONE;
        }
        aVar.mo110969a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
