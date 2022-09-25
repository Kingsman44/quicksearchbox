package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gl */
/* compiled from: PG */
public final /* synthetic */ class C108377gl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f301439a;

    /* renamed from: b */
    public final /* synthetic */ a f301440b;

    public /* synthetic */ C108377gl(SettableFuture settableFuture, a aVar) {
        this.f301439a = settableFuture;
        this.f301440b = aVar;
    }

    public final void run() {
        SettableFuture settableFuture = this.f301439a;
        a aVar = this.f301440b;
        c createBuilder = f.d.createBuilder();
        createBuilder.copyOnWrite();
        f fVar = createBuilder.instance;
        b build = aVar.build();
        build.getClass();
        fVar.b = build;
        fVar.a |= 1;
        settableFuture.mo57356n(createBuilder.build());
    }
}
