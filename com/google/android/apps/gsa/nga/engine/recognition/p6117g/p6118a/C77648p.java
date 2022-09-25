package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.p */
/* compiled from: PG */
public final /* synthetic */ class C77648p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80562g f213867a;

    public /* synthetic */ C77648p(C80562g gVar) {
        this.f213867a = gVar;
    }

    public final void accept(Object obj) {
        C80562g gVar = this.f213867a;
        gVar.copyOnWrite();
        C80563h hVar = (C80563h) gVar.instance;
        C80563h hVar2 = C80563h.f221128r;
        hVar.f221134e = ((C80471b) obj).f220865d;
        hVar.f221130a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
