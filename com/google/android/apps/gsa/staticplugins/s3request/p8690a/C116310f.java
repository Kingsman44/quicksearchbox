package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66660e;
import com.google.speech.p5208h.C66672f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.f */
/* compiled from: PG */
public final class C116310f extends C68247h {

    /* renamed from: a */
    private final C68283d f322457a;

    /* renamed from: c */
    private final C68283d f322458c;

    public C116310f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C116310f.class), aVar);
        this.f322457a = C68236af.m98549d(dVar);
        this.f322458c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        Query query = (Query) list.get(1);
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        C58833ax j = C58833ax.m90833j(query.mo84440dU("bisto-device-properties"));
        if (j.mo56113h()) {
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.DeviceProperties";
            C63088z A = C63088z.m96139A((byte[]) j.mo56107c());
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = A;
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "bisto_device_properties";
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
            kaVar3.getClass();
            kcVar2.f137066c = kaVar3;
            kcVar2.f137064a |= 2;
            ewVar.mo53792e((C52232kc) kbVar.build());
        }
        if (tVar.mo79746e(C90014bt.f247088aZ) && query.mo84327bL()) {
            C58833ax j2 = C58833ax.m90833j(query.mo84440dU("android.opa.extra.STORYBOOKS_PARAMS"));
            if (j2.mo56113h()) {
                C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar2.copyOnWrite();
                C52230ka kaVar4 = (C52230ka) jzVar2.instance;
                kaVar4.f137059a |= 1;
                kaVar4.f137060b = "assistant.api.params.StorybooksParams";
                C63088z A2 = C63088z.m96139A((byte[]) j2.mo56107c());
                jzVar2.copyOnWrite();
                C52230ka kaVar5 = (C52230ka) jzVar2.instance;
                kaVar5.f137059a |= 2;
                kaVar5.f137061c = A2;
                C52230ka kaVar6 = (C52230ka) jzVar2.build();
                C52231kb kbVar2 = (C52231kb) C52232kc.f137062d.createBuilder();
                kbVar2.copyOnWrite();
                C52232kc kcVar3 = (C52232kc) kbVar2.instance;
                kcVar3.f137064a = 1 | kcVar3.f137064a;
                kcVar3.f137065b = "storybooks";
                kbVar2.copyOnWrite();
                C52232kc kcVar4 = (C52232kc) kbVar2.instance;
                kaVar6.getClass();
                kcVar4.f137066c = kaVar6;
                kcVar4.f137064a |= 2;
                ewVar.mo53792e((C52232kc) kbVar2.build());
            } else {
                throw new C90523o("Missing required storybooks params for Continuous Match Mode query.", (int) C89885b.S3REQUEST_BUILD_ASSISTANT_INPUT_PARAMS_FAILED_VALUE);
            }
        }
        if (((C52091ex) ewVar.instance).f136712a.size() > 0) {
            C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
            C52091ex exVar = (C52091ex) ewVar.build();
            elVar.copyOnWrite();
            C52081en enVar = (C52081en) elVar.instance;
            exVar.getClass();
            enVar.f136685e = exVar;
            enVar.f136681a |= 16;
            C52081en enVar2 = (C52081en) elVar.build();
            C66660e eVar = (C66660e) C66672f.f181366c.createBuilder();
            eVar.copyOnWrite();
            C66672f fVar = (C66672f) eVar.instance;
            enVar2.getClass();
            fVar.f181370b = enVar2;
            fVar.f181369a |= 2;
            kVar = new C118928k(C58833ax.m90834k((C66672f) eVar.build()), C66672f.f181367d);
        } else {
            kVar = new C118928k(C58836b.f156633a, C66672f.f181367d);
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322457a.mo60297gq(), this.f322458c.mo60297gq());
    }
}
