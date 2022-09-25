package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
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
import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a.o */
/* compiled from: PG */
public final class C128405o implements C127369n {

    /* renamed from: a */
    public static final C32836cd f353147a;

    /* renamed from: b */
    private static final C33476a f353148b = new C33476a("assistant.api.params.DisplayContextParams", C51379fn.f133814i);

    /* renamed from: c */
    private static final C51379fn f353149c;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.display.context.params");
        a.mo38319b(a2.mo38298a());
        f353147a = a.mo38318a();
        C51376fk fkVar = (C51376fk) C51379fn.f133814i.createBuilder();
        C61789ah ahVar = (C61789ah) C61790ai.f166898o.createBuilder();
        ahVar.copyOnWrite();
        C61790ai aiVar = (C61790ai) ahVar.instance;
        aiVar.f166900a |= C89885b.S3REQUEST_VALUE;
        aiVar.f166911l = true;
        fkVar.copyOnWrite();
        C51379fn fnVar = (C51379fn) fkVar.instance;
        C61790ai aiVar2 = (C61790ai) ahVar.build();
        aiVar2.getClass();
        fnVar.f133817b = aiVar2;
        fnVar.f133816a |= 1;
        C62942bv build = fkVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…d(true))\n        .build()");
        f353149c = (C51379fn) build;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a2 = C69664n.m101061g(azVar, "builder");
        C52230ka a3 = f353148b.mo38879a(f353149c);
        C69664n.m101060f(a3, "DISPLAY_CONTEXT_PARAMS_K…(CLIENT_RESTARTED_PARAMS)");
        a2.mo38306b(a3);
        a.mo38303b(a2.mo38305a());
        return C60856cj.m92900i(a.mo38302a());
    }
}
