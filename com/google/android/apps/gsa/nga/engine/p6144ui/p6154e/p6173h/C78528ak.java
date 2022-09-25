package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80719cu;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80791fl;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.ak */
/* compiled from: PG */
public final /* synthetic */ class C78528ak implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80791fl f216269a;

    public /* synthetic */ C78528ak(C80791fl flVar) {
        this.f216269a = flVar;
    }

    public final void accept(Object obj) {
        C80791fl flVar = this.f216269a;
        C80719cu cuVar = (C80719cu) obj;
        String b = cuVar.mo74512b();
        flVar.copyOnWrite();
        C80792fm fmVar = C80792fm.f221696l;
        b.getClass();
        ((C80792fm) flVar.instance).f221702e = b;
        C80578l lVar = (C80578l) cuVar.mo74511a().get();
        flVar.copyOnWrite();
        lVar.getClass();
        ((C80792fm) flVar.instance).f221703f = lVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
