package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122384ac;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.i.g */
/* compiled from: PG */
public final /* synthetic */ class C76747g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76757q f212100a;

    /* renamed from: b */
    public final /* synthetic */ C83320io f212101b;

    public /* synthetic */ C76747g(C76757q qVar, C83320io ioVar) {
        this.f212100a = qVar;
        this.f212101b = ioVar;
    }

    public final void accept(Object obj) {
        C76757q qVar = this.f212100a;
        C83320io ioVar = this.f212101b;
        C122384ac acVar = (C122384ac) obj;
        C122106o oVar = acVar.f339298a;
        if (oVar == null) {
            oVar = C122106o.f338758c;
        }
        qVar.mo72322g("iContext", C76757q.m123369d(oVar), ioVar, acVar.f339299b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
