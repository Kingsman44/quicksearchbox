package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50704ap;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.t */
/* compiled from: PG */
public final /* synthetic */ class C106840t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297715a;

    public /* synthetic */ C106840t(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297715a = topLevelRendererHelper;
    }

    public final void accept(Object obj) {
        ((C58970a) ((C58970a) this.f297715a.f297684a.mo56224b()).mo56372aa(23324)).mo56389s("returning child use case %s", (C50704ap) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
