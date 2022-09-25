package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.m */
/* compiled from: PG */
public final /* synthetic */ class C118762m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331266a;

    /* renamed from: b */
    public final /* synthetic */ C16867b f331267b;

    /* renamed from: c */
    public final /* synthetic */ String f331268c;

    public /* synthetic */ C118762m(C118744ab abVar, C16867b bVar, String str) {
        this.f331266a = abVar;
        this.f331267b = bVar;
        this.f331268c = str;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331266a;
        C16867b bVar = this.f331267b;
        boolean z = ((C86338r) abVar.f331220b.mo17428b()).getBoolean(((C118750ah) obj).mo103945a(this.f331268c), false);
        bVar.copyOnWrite();
        C16868c cVar = (C16868c) bVar.instance;
        C16868c cVar2 = C16868c.f49349j;
        cVar.f49351a |= 16;
        cVar.f49359i = z;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
