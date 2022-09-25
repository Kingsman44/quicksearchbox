package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a;

import com.google.assistant.p3886c.C50836h;
import com.google.assistant.p3886c.C50837i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C106850c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50836h f297726a;

    public /* synthetic */ C106850c(C50836h hVar) {
        this.f297726a = hVar;
    }

    public final void accept(Object obj) {
        C50836h hVar = this.f297726a;
        float floatValue = ((Float) obj).floatValue();
        hVar.copyOnWrite();
        C50837i iVar = (C50837i) hVar.instance;
        C50837i iVar2 = C50837i.f132363f;
        iVar.f132365a |= 8;
        iVar.f132369e = floatValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
