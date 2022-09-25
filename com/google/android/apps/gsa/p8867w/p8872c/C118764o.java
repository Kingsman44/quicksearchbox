package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.o */
/* compiled from: PG */
public final /* synthetic */ class C118764o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C86337q f331273a;

    /* renamed from: b */
    public final /* synthetic */ String f331274b;

    /* renamed from: c */
    public final /* synthetic */ C16868c f331275c;

    /* renamed from: d */
    public final /* synthetic */ C84533ar f331276d;

    public /* synthetic */ C118764o(C86337q qVar, String str, C16868c cVar, C84533ar arVar) {
        this.f331273a = qVar;
        this.f331274b = str;
        this.f331275c = cVar;
        this.f331276d = arVar;
    }

    public final void accept(Object obj) {
        C86337q qVar = this.f331273a;
        String str = this.f331274b;
        C16868c cVar = this.f331275c;
        C84533ar arVar = this.f331276d;
        C118750ah ahVar = (C118750ah) obj;
        qVar.mo80073h(ahVar.mo103945a(str), cVar.f49352b);
        arVar.mo78239e(ahVar.mo103945a(str), cVar.f49352b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
