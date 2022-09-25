package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50704ap;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.v */
/* compiled from: PG */
public final /* synthetic */ class C106842v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297717a;

    public /* synthetic */ C106842v(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297717a = topLevelRendererHelper;
    }

    public final void accept(Object obj) {
        ((C58970a) ((C58970a) this.f297717a.f297684a.mo56224b()).mo56372aa(23323)).mo56389s("(pre-filter) returning child renderer %s", (C50704ap) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
