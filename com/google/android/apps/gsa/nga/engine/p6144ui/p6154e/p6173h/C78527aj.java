package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80791fl;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import com.google.assistant.p3775ac.p3779d.C48462b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.aj */
/* compiled from: PG */
public final /* synthetic */ class C78527aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80791fl f216268a;

    public /* synthetic */ C78527aj(C80791fl flVar) {
        this.f216268a = flVar;
    }

    public final void accept(Object obj) {
        C80791fl flVar = this.f216268a;
        C48462b bVar = (C48462b) obj;
        flVar.copyOnWrite();
        C80792fm fmVar = C80792fm.f221696l;
        bVar.getClass();
        ((C80792fm) flVar.instance).f221704g = bVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
