package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9551c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51242al;
import com.google.assistant.p3897e.p3917i.p3918a.C51244an;
import com.google.assistant.p3897e.p3921j.C52230ka;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.c.a */
/* compiled from: PG */
final class C127209a implements Function {

    /* renamed from: a */
    public static final C127209a f350251a = new C127209a();

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a2 = C69664n.m101061g(azVar, "builder");
        C51242al alVar = (C51242al) C51244an.f133412b.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C52230ka a3 = new C33476a("assistant.api.params.BackgroundAppActionsContextParams", C69664n.m101061g(alVar, "builder").mo53560a()).mo38879a((C51244an) obj);
        C69664n.m101060f(a3, "ProtobufKey<BackgroundAp…            .pack(params)");
        a2.mo38306b(a3);
        a.mo38303b(a2.mo38305a());
        return a.mo38302a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
