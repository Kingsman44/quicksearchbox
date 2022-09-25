package com.google.android.apps.search.assistant.platform.wholehome.shared.jni;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124205u;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import com.google.assistant.p3741aa.C48170e;
import com.google.assistant.p3741aa.C48171f;
import com.google.assistant.p3741aa.C48172g;
import com.google.assistant.p3741aa.C48173h;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.jni.m */
/* compiled from: PG */
public final /* synthetic */ class C124361m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124362n f343268a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f343269b;

    public /* synthetic */ C124361m(C124362n nVar, Throwable th) {
        this.f343268a = nVar;
        this.f343269b = th;
    }

    public final void run() {
        C124362n nVar = this.f343268a;
        ((C59052c) ((C59052c) ((C59052c) WholeHomeJniNative.f343240a.mo56225c()).mo56382g(this.f343269b)).mo56372aa(36191)).mo56389s("Torus on target device fails to handle remote execution response for id: %s", nVar.f343270a);
        WholeHomeJniNative wholeHomeJniNative = nVar.f343271b;
        long j = wholeHomeJniNative.f343242c;
        C124205u uVar = (C124205u) C124206v.f342964c.createBuilder();
        String str = nVar.f343270a;
        uVar.copyOnWrite();
        str.getClass();
        ((C124206v) uVar.instance).f342966a = str;
        C48170e eVar = (C48170e) C48173h.f124650e.createBuilder();
        C48171f fVar = (C48171f) C48172g.f124643f.createBuilder();
        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.UNAVAILABLE;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        C52070ec ecVar2 = (C52070ec) dzVar.build();
        ecVar2.getClass();
        ekVar.f136675c = ecVar2;
        ekVar.f136674b = 3;
        eoVar.copyOnWrite();
        C52083ep epVar = (C52083ep) eoVar.instance;
        C52078ek ekVar2 = (C52078ek) ejVar.build();
        ekVar2.getClass();
        epVar.f136693c = ekVar2;
        epVar.f136692b = 3;
        fVar.mo53144a(eoVar);
        eVar.mo53143a(fVar);
        uVar.copyOnWrite();
        C48173h hVar = (C48173h) eVar.build();
        hVar.getClass();
        ((C124206v) uVar.instance).f342967b = hVar;
        wholeHomeJniNative.nativeHandleOnRemoteExecutionResponse(j, ((C124206v) uVar.build()).toByteArray());
    }
}
