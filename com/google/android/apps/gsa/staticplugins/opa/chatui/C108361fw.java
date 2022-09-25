package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.util.SizeF;
import android.widget.RemoteViews;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120931b;
import com.google.assistant.p3931f.p3940d.p3941a.C52860aj;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fw */
/* compiled from: PG */
final class C108361fw implements Consumer {

    /* renamed from: a */
    final /* synthetic */ RemoteViews f301408a;

    /* renamed from: b */
    final /* synthetic */ C52860aj f301409b;

    public C108361fw(RemoteViews remoteViews, C52860aj ajVar) {
        this.f301408a = remoteViews;
        this.f301409b = ajVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C120931b bVar = (C120931b) obj;
        C69664n.m101061g(bVar, "it");
        RemoteViews remoteViews = this.f301408a;
        C52860aj ajVar = this.f301409b;
        float f = 0.0f;
        float floatValue = ajVar.f138688a == 1 ? ((Float) ajVar.f138689b).floatValue() : 0.0f;
        C52860aj ajVar2 = this.f301409b;
        if (ajVar2.f138690c == 2) {
            f = ((Float) ajVar2.f138691d).floatValue();
        }
        bVar.mo96547d(remoteViews, new SizeF(floatValue, f));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
