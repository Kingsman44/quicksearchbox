package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21546c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52463sr;
import com.google.assistant.p3897e.p3921j.C52465st;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.w */
/* compiled from: PG */
public final /* synthetic */ class C92974w implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C92974w f259343a = new C92974w();

    private /* synthetic */ C92974w() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i;
        Exception exc = (Exception) obj;
        C59104x c = C92977z.f259349a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FetchCarrierPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(13252)).mo56386p("Couldn't fetch carrier plan information");
        int i2 = 4;
        if (exc instanceof C21546c) {
            i = 4;
            i2 = 3;
        } else if (exc instanceof TimeoutException) {
            i = 3;
            i2 = 2;
        } else {
            i = 5;
        }
        C52463sr srVar = (C52463sr) C52465st.f137722h.createBuilder();
        srVar.copyOnWrite();
        C52465st stVar = (C52465st) srVar.instance;
        stVar.f137728e = i2 - 1;
        stVar.f137724a |= 8;
        String valueOf = String.valueOf(exc.getMessage());
        srVar.copyOnWrite();
        C52465st stVar2 = (C52465st) srVar.instance;
        valueOf.getClass();
        stVar2.f137724a |= 16;
        stVar2.f137729f = valueOf;
        C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
        usVar.copyOnWrite();
        C52522uw uwVar = (C52522uw) usVar.instance;
        uwVar.f137867b = i - 1;
        uwVar.f137866a |= 1;
        String valueOf2 = String.valueOf(exc.getMessage());
        usVar.copyOnWrite();
        C52522uw uwVar2 = (C52522uw) usVar.instance;
        valueOf2.getClass();
        uwVar2.f137866a = 2 | uwVar2.f137866a;
        uwVar2.f137868c = valueOf2;
        C52522uw uwVar3 = (C52522uw) usVar.build();
        srVar.copyOnWrite();
        C52465st stVar3 = (C52465st) srVar.instance;
        uwVar3.getClass();
        stVar3.f137730g = uwVar3;
        stVar3.f137724a |= 32;
        return (C52465st) srVar.build();
    }
}
