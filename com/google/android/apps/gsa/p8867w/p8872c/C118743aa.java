package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;

/* renamed from: com.google.android.apps.gsa.w.c.aa */
/* compiled from: PG */
public final /* synthetic */ class C118743aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331216a;

    /* renamed from: b */
    public final /* synthetic */ C16868c f331217b;

    /* renamed from: c */
    public final /* synthetic */ String f331218c;

    public /* synthetic */ C118743aa(C118744ab abVar, C16868c cVar, String str) {
        this.f331216a = abVar;
        this.f331217b = cVar;
        this.f331218c = str;
    }

    public final void run() {
        C118744ab abVar = this.f331216a;
        C16868c cVar = this.f331217b;
        String str = this.f331218c;
        C86337q b = ((C86338r) abVar.f331220b.mo17428b()).mo80076b();
        C84533ar a = ((C84534as) abVar.f331221c.mo17428b()).mo78241a();
        if ((cVar.f49351a & 1) != 0) {
            abVar.mo103949e("primary-language", new C118764o(b, str, cVar, a));
        }
        if ((cVar.f49351a & 2) != 0) {
            abVar.mo103949e("user-picked-assistant-locale", new C118765p(b, str, cVar, a));
        }
        if ((cVar.f49351a & 8) != 0) {
            abVar.mo103949e("preferred_assistant_voice_id", new C118766q(b, str, cVar));
        }
        if ((cVar.f49351a & 16) != 0) {
            abVar.mo103949e("has_assistant_voice_preference", new C118767r(b, str, cVar));
        }
        a.mo78235a();
        b.apply();
    }
}
