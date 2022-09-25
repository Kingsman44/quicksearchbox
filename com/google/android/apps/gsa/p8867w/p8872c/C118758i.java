package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.i */
/* compiled from: PG */
public final /* synthetic */ class C118758i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331254a;

    /* renamed from: b */
    public final /* synthetic */ String f331255b;

    /* renamed from: c */
    public final /* synthetic */ C16867b f331256c;

    public /* synthetic */ C118758i(C118744ab abVar, String str, C16867b bVar) {
        this.f331254a = abVar;
        this.f331255b = str;
        this.f331256c = bVar;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331254a;
        String str = this.f331255b;
        C16867b bVar = this.f331256c;
        String string = ((C86338r) abVar.f331220b.mo17428b()).getString(((C118750ah) obj).mo103945a(str), (String) null);
        if (!abVar.mo103949e("user-picked-assistant-locale", new C118763n(abVar, bVar, string, str))) {
            String d = abVar.mo103948d(string, false);
            bVar.copyOnWrite();
            C16868c cVar = (C16868c) bVar.instance;
            C16868c cVar2 = C16868c.f49349j;
            d.getClass();
            cVar.f49351a |= 1;
            cVar.f49352b = d;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
