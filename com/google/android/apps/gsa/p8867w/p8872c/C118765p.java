package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.p */
/* compiled from: PG */
public final /* synthetic */ class C118765p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C86337q f331277a;

    /* renamed from: b */
    public final /* synthetic */ String f331278b;

    /* renamed from: c */
    public final /* synthetic */ C16868c f331279c;

    /* renamed from: d */
    public final /* synthetic */ C84533ar f331280d;

    public /* synthetic */ C118765p(C86337q qVar, String str, C16868c cVar, C84533ar arVar) {
        this.f331277a = qVar;
        this.f331278b = str;
        this.f331279c = cVar;
        this.f331280d = arVar;
    }

    public final void accept(Object obj) {
        C86337q qVar = this.f331277a;
        String str = this.f331278b;
        C16868c cVar = this.f331279c;
        C84533ar arVar = this.f331280d;
        C118750ah ahVar = (C118750ah) obj;
        qVar.mo80067b(ahVar.mo103945a(str), !cVar.f49353c);
        arVar.mo78237c(ahVar.mo103945a(str), !cVar.f49353c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
