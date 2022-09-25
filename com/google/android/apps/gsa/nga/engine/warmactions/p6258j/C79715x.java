package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.x */
/* compiled from: PG */
public final class C79715x {

    /* renamed from: a */
    public final Context f218613a;

    /* renamed from: b */
    public final C21370a f218614b;

    public C79715x(Context context, C21370a aVar) {
        this.f218613a = context;
        this.f218614b = aVar;
    }

    /* renamed from: a */
    public static C47868b m127811a(String str) {
        C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "text.QUERY";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.TextInputParam";
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        amp.f135386a |= 1;
        amp.f135387b = str;
        C63088z byteString = ((C51682amp) amm.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("text_input_params", (C52230ka) jzVar.build());
        aVar.copyOnWrite();
        C47868b bVar = (C47868b) aVar.instance;
        C51805du duVar2 = (C51805du) dsVar.build();
        duVar2.getClass();
        bVar.f123939b = duVar2;
        bVar.f123938a = 2;
        return (C47868b) aVar.build();
    }
}
