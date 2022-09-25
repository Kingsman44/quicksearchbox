package com.google.android.apps.gsa.p8867w.p8872c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.l */
/* compiled from: PG */
public final /* synthetic */ class C118761l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331263a;

    /* renamed from: b */
    public final /* synthetic */ C16867b f331264b;

    /* renamed from: c */
    public final /* synthetic */ String f331265c;

    public /* synthetic */ C118761l(C118744ab abVar, C16867b bVar, String str) {
        this.f331263a = abVar;
        this.f331264b = bVar;
        this.f331265c = str;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331263a;
        C16867b bVar = this.f331264b;
        String string = ((C86338r) abVar.f331220b.mo17428b()).getString(((C118750ah) obj).mo103945a(this.f331265c), BuildConfig.FLAVOR);
        bVar.copyOnWrite();
        C16868c cVar = (C16868c) bVar.instance;
        C16868c cVar2 = C16868c.f49349j;
        string.getClass();
        cVar.f49351a |= 8;
        cVar.f49358h = string;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
