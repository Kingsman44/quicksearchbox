package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.libraries.search.p2904c.C37354as;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C77511ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C37357av f213575a;

    public /* synthetic */ C77511ab(C37357av avVar) {
        this.f213575a = avVar;
    }

    public final void accept(Object obj) {
        C37357av avVar = this.f213575a;
        C37354as asVar = (C37354as) obj;
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        C37360ay ayVar2 = C37360ay.f99224l;
        asVar.getClass();
        ayVar.f99232g = asVar;
        ayVar.f99226a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
