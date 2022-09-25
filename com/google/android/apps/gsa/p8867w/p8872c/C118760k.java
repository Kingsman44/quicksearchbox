package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.k */
/* compiled from: PG */
public final /* synthetic */ class C118760k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331260a;

    /* renamed from: b */
    public final /* synthetic */ C16867b f331261b;

    /* renamed from: c */
    public final /* synthetic */ String f331262c;

    public /* synthetic */ C118760k(C118744ab abVar, C16867b bVar, String str) {
        this.f331260a = abVar;
        this.f331261b = bVar;
        this.f331262c = str;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331260a;
        C16867b bVar = this.f331261b;
        boolean z = ((C86338r) abVar.f331220b.mo17428b()).getBoolean(((C118750ah) obj).mo103945a(this.f331262c), false);
        bVar.copyOnWrite();
        C16868c cVar = (C16868c) bVar.instance;
        C16868c cVar2 = C16868c.f49349j;
        cVar.f49351a |= 2;
        cVar.f49353c = !z;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
