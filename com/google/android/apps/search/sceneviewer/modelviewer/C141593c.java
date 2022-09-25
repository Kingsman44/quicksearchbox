package com.google.android.apps.search.sceneviewer.modelviewer;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.p579ar.sceneviewer.concurrent.CompletableFuture;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.c */
/* compiled from: PG */
public final /* synthetic */ class C141593c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384375a;

    /* renamed from: b */
    public final /* synthetic */ CompletableFuture f384376b;

    /* renamed from: c */
    public final /* synthetic */ int f384377c;

    /* renamed from: d */
    public final /* synthetic */ int f384378d;

    /* renamed from: e */
    public final /* synthetic */ String f384379e;

    public /* synthetic */ C141593c(C141584am amVar, CompletableFuture completableFuture, int i, int i2, String str) {
        this.f384375a = amVar;
        this.f384376b = completableFuture;
        this.f384377c = i;
        this.f384378d = i2;
        this.f384379e = str;
    }

    public final void accept(Object obj) {
        C141584am amVar = this.f384375a;
        CompletableFuture completableFuture = this.f384376b;
        int i = this.f384377c;
        int i2 = this.f384378d;
        String str = this.f384379e;
        Drawable drawable = (Drawable) obj;
        if (drawable == null) {
            ((C59052c) ((C59052c) C141584am.f384271b.mo56226d()).mo56372aa(41745)).mo56386p("Failed to create drawable from iconUrl, showing a blank button");
        }
        if (amVar.f384288P.contains(completableFuture)) {
            amVar.mo116571e(i, i2, drawable, str);
            amVar.f384288P.remove(completableFuture);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
