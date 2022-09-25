package com.google.android.apps.search.assistant.surfaces.voice.p9590e;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119846cn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119847co;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.e.a */
/* compiled from: PG */
public final class C127404a {

    /* renamed from: a */
    public static final C33476a f350819a = new C33476a("assistant.api.client_input.TextInputParam", C51682amp.f135384d);

    /* renamed from: a */
    public static C119847co m208356a(C51682amp amp) {
        C119846cn cnVar = (C119846cn) C119847co.f333794b.createBuilder();
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "text.QUERY";
        dsVar.mo53729a("text_input_params", f350819a.mo38879a(amp));
        C51805du duVar2 = (C51805du) dsVar.build();
        cnVar.copyOnWrite();
        duVar2.getClass();
        ((C119847co) cnVar.instance).f333796a = duVar2;
        return (C119847co) cnVar.build();
    }
}
