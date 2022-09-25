package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a;

import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3886c.C50803d;
import com.google.assistant.p3886c.C50836h;
import com.google.assistant.p3886c.C50837i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C106849b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50836h f297725a;

    public /* synthetic */ C106849b(C50836h hVar) {
        this.f297725a = hVar;
    }

    public final void accept(Object obj) {
        C50836h hVar = this.f297725a;
        C50803d dVar = (C50803d) C106855h.f297731a.get((C49794h) obj);
        if (dVar != null) {
            hVar.copyOnWrite();
            C50837i iVar = (C50837i) hVar.instance;
            C50837i iVar2 = C50837i.f132363f;
            iVar.f132367c = dVar.f132250f;
            iVar.f132365a |= 2;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
