package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9549af;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51616oh;
import com.google.assistant.p3897e.p3917i.p3918a.C51618oj;
import com.google.assistant.p3897e.p3917i.p3918a.C51619ok;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.af.a */
/* compiled from: PG */
public final class C127205a implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350232a;

    /* renamed from: b */
    private static final C33476a f350233b = new C33476a("assistant.api.params.TriggerParams", C51619ok.f134530c);

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.request.trigger");
        a.mo38319b(a2.mo38298a());
        f350232a = a.mo38318a();
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C51618oj ojVar;
        int ordinal;
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C51616oh ohVar = (C51616oh) C51619ok.f134530c.createBuilder();
        C69664n.m101060f(ohVar, "newBuilder()");
        C69664n.m101061g(ohVar, "builder");
        e a = e.a(iVar.f350569g);
        if (a != null && ((ordinal = a.ordinal()) == 98 || ordinal == 110 || ordinal == 122)) {
            ojVar = C51618oj.HOTWORD;
        } else {
            ojVar = C51618oj.UNKNOWN_TRIGGER_TYPE;
        }
        C69664n.m101061g(ojVar, "value");
        ohVar.copyOnWrite();
        C51619ok okVar = (C51619ok) ohVar.instance;
        okVar.f134533b = ojVar.f134529h;
        okVar.f134532a |= 1;
        C62942bv build = ohVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a2 = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a3 = C69664n.m101061g(azVar, "builder");
        C52230ka a4 = f350233b.mo38879a((C51619ok) build);
        C69664n.m101060f(a4, "PARAMS_KEY.pack(triggerParams)");
        a3.mo38306b(a4);
        a2.mo38303b(a3.mo38305a());
        return C60856cj.m92900i(a2.mo38302a());
    }
}
