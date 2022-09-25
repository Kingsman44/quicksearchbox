package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9359a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
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
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.i */
/* compiled from: PG */
public final /* synthetic */ class C124281i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124204t f343106a;

    /* renamed from: b */
    public final /* synthetic */ Map f343107b;

    public /* synthetic */ C124281i(C124204t tVar, Map map) {
        this.f343106a = tVar;
        this.f343107b = map;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124204t tVar = this.f343106a;
        Map map = this.f343107b;
        C124205u uVar = (C124205u) C124206v.f342964c.createBuilder();
        String str = tVar.f342962a;
        uVar.copyOnWrite();
        str.getClass();
        ((C124206v) uVar.instance).f342966a = str;
        C48170e eVar = (C48170e) C48173h.f124650e.createBuilder();
        for (Map.Entry entry : map.entrySet()) {
            try {
                C48172g gVar = (C48172g) ((C48173h) C60856cj.m92909r((Future) entry.getValue())).f124654c.get(0);
                eVar.copyOnWrite();
                C48173h hVar = (C48173h) eVar.instance;
                gVar.getClass();
                hVar.mo53146a();
                hVar.f124654c.add(gVar);
            } catch (ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C124293u.f343122a.mo56226d()).mo56382g(e)).mo56372aa(36143)).mo56389s("Remote execution fails for device: %s", entry.getKey());
                C52235kf kfVar = C52235kf.UNAVAILABLE;
                int ordinal = Status.m102100d(e).getCode().ordinal();
                if (ordinal == 4) {
                    kfVar = C52235kf.DEADLINE_EXCEEDED;
                } else if (ordinal == 7) {
                    kfVar = C52235kf.PERMISSION_DENIED;
                }
                C48171f fVar = (C48171f) C48172g.f124643f.createBuilder();
                String str2 = (String) entry.getKey();
                fVar.copyOnWrite();
                C48172g gVar2 = (C48172g) fVar.instance;
                str2.getClass();
                gVar2.f124645a |= 1;
                gVar2.f124646b = str2;
                C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
                C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
                C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
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
            }
        }
        uVar.copyOnWrite();
        C48173h hVar2 = (C48173h) eVar.build();
        hVar2.getClass();
        ((C124206v) uVar.instance).f342967b = hVar2;
        return C60856cj.m92900i((C124206v) uVar.build());
    }
}
