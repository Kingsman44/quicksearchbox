package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ez */
/* compiled from: PG */
public final /* synthetic */ class C79297ez implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79326x f217787a;

    /* renamed from: b */
    public final /* synthetic */ String f217788b;

    /* renamed from: c */
    public final /* synthetic */ C80053ag f217789c;

    public /* synthetic */ C79297ez(C79326x xVar, String str, C80053ag agVar) {
        this.f217787a = xVar;
        this.f217788b = str;
        this.f217789c = agVar;
    }

    public final void accept(Object obj) {
        this.f217787a.mo73900a(String.format("RETURNING - app: %s, deeplink: %s, mid: %s", new Object[]{this.f217788b, (C61752n) obj, this.f217789c.f219677a}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
