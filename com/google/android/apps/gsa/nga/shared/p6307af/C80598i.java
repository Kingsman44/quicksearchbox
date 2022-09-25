package com.google.android.apps.gsa.nga.shared.p6307af;

import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.p3926e.C51987gm;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.i */
/* compiled from: PG */
public final /* synthetic */ class C80598i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51987gm f221272a;

    public /* synthetic */ C80598i(C51987gm gmVar) {
        this.f221272a = gmVar;
    }

    public final void accept(Object obj) {
        C51987gm gmVar = this.f221272a;
        C51012dc dcVar = (C51012dc) obj;
        gmVar.copyOnWrite();
        C51992gr grVar = (C51992gr) gmVar.instance;
        C51992gr grVar2 = C51992gr.f136445r;
        dcVar.getClass();
        grVar.f136452f = dcVar;
        grVar.f136447a |= 16;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
