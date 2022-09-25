package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a.C124234t;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C124245h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124247j f343051a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f343052b;

    public /* synthetic */ C124245h(C124247j jVar, Throwable th) {
        this.f343051a = jVar;
        this.f343052b = th;
    }

    public final void run() {
        String str;
        C124247j jVar = this.f343051a;
        Throwable th = this.f343052b;
        C59052c cVar = (C59052c) ((C59052c) C124248k.f343057a.mo56226d()).mo56372aa(36130);
        if (th == null) {
            str = "Unknown";
        } else {
            str = th.getMessage();
        }
        cVar.mo56389s("Client is disconncted from Context framework due to Error: %s", str);
        if (!jVar.f343056b.f343061e.containsKey(jVar.f343055a)) {
            ((C59052c) ((C59052c) C124248k.f343057a.mo56226d()).mo56372aa(36131)).mo56389s("Context and its access session for id: %s are already disconnected.", jVar.f343055a);
            return;
        }
        ((C32603b) jVar.f343056b.f343061e.get(jVar.f343055a)).close();
        jVar.f343056b.f343061e.remove(jVar.f343055a);
        if (jVar.f343056b.f343062f != null) {
            ((C59052c) ((C59052c) C124234t.f343022a.mo56226d()).mo56372aa(36127)).mo56389s("Connection: %s context session disconnected.", jVar.f343055a);
            return;
        }
        throw new IllegalStateException("ContextManager callbacks is not set");
    }
}
