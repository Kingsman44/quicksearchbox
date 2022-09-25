package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9718b;

import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.adu;
import com.google.assistant.p3897e.p3921j.aka;
import com.google.assistant.p3897e.p3921j.akc;
import com.google.assistant.p3897e.p3921j.alz;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.b.e */
/* compiled from: PG */
public final class C128424e {

    /* renamed from: a */
    public static final C51785da f353190a;

    /* renamed from: b */
    public static final C51785da f353191b;

    static {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        C69664n.m101060f(czVar, "newBuilder()");
        alz a = C69664n.m101061g(czVar, "builder");
        a.mo53699b("ui.HIGHLIGHT_USER_QUERY");
        C51773cz czVar2 = a.f135357a;
        czVar2.copyOnWrite();
        C51785da daVar = (C51785da) czVar2.instance;
        daVar.f135877a |= 2;
        daVar.f135879c = 1;
        f353190a = a.mo53698a();
        C51773cz czVar3 = (C51773cz) C51785da.f135875e.createBuilder();
        C69664n.m101060f(czVar3, "newBuilder()");
        alz a2 = C69664n.m101061g(czVar3, "builder");
        a2.mo53699b("ui.SHOW_SUGGESTIONS");
        C51773cz czVar4 = a2.f135357a;
        czVar4.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar4.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C69664n.m101060f(jzVar, "newBuilder()");
        adu a3 = C69664n.m101061g(jzVar, "builder");
        a3.mo53678c("assistant.api.client_op.ShowSuggestionsProperties");
        aka aka = (aka) akc.f135255b.createBuilder();
        aka.mo53689a();
        C63088z byteString = ((akc) aka.build()).toByteString();
        C69664n.m101060f(byteString, "newBuilder()\n           …          .toByteString()");
        a3.mo53677b(byteString);
        a2.mo53700c(a3.mo53676a());
        f353191b = a2.mo53698a();
    }

    /* renamed from: a */
    public static final C35472h m209567a() {
        return C128423d.f353189a;
    }
}
