package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.n */
/* compiled from: PG */
public final /* synthetic */ class C118763n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331269a;

    /* renamed from: b */
    public final /* synthetic */ C16867b f331270b;

    /* renamed from: c */
    public final /* synthetic */ String f331271c;

    /* renamed from: d */
    public final /* synthetic */ String f331272d;

    public /* synthetic */ C118763n(C118744ab abVar, C16867b bVar, String str, String str2) {
        this.f331269a = abVar;
        this.f331270b = bVar;
        this.f331271c = str;
        this.f331272d = str2;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331269a;
        C16867b bVar = this.f331270b;
        String d = abVar.mo103948d(this.f331271c, ((C86338r) abVar.f331220b.mo17428b()).getBoolean(((C118750ah) obj).mo103945a(this.f331272d), false));
        bVar.copyOnWrite();
        C16868c cVar = (C16868c) bVar.instance;
        C16868c cVar2 = C16868c.f49349j;
        d.getClass();
        cVar.f49351a |= 1;
        cVar.f49352b = d;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
