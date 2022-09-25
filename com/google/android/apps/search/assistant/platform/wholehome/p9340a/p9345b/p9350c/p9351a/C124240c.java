package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C124240c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124248k f343039a;

    /* renamed from: b */
    public final /* synthetic */ String f343040b;

    public /* synthetic */ C124240c(C124248k kVar, String str) {
        this.f343039a = kVar;
        this.f343040b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124248k kVar = this.f343039a;
        String str = this.f343040b;
        if (!kVar.f343061e.containsKey(str)) {
            ((C59052c) ((C59052c) C124248k.f343057a.mo56226d()).mo56372aa(36133)).mo56389s("Context and its access session for id: %s are already disconnected.", str);
            return C60866ct.f164955a;
        }
        ((C32603b) kVar.f343061e.get(str)).close();
        kVar.f343061e.remove(str);
        return C60866ct.f164955a;
    }
}
