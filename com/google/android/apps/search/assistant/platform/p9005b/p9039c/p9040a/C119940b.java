package com.google.android.apps.search.assistant.platform.p9005b.p9039c.p9040a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.libraries.p8946b.C119247j;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119941b;
import com.google.android.libraries.assistant.portable.p1586b.C19065ai;
import com.google.android.libraries.assistant.portable.p1586b.C19066aj;
import com.google.android.libraries.assistant.portable.p1586b.C19080l;
import com.google.android.libraries.assistant.portable.p1586b.C19081m;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.logging.C28260b;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.assistant.p3745ab.p3771w.C48421h;
import com.google.assistant.p3745ab.p3771w.C48422i;
import com.google.assistant.p3897e.p3915h.p3916a.C51226a;
import com.google.assistant.p3897e.p3915h.p3916a.C51227b;
import com.google.assistant.p3897e.p3915h.p3916a.C51229d;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5030q.C65163dx;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.b.c.a.b */
/* compiled from: PG */
public final class C119940b implements C119941b {

    /* renamed from: a */
    private static final C59071e f334015a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.c.a.b");

    /* renamed from: b */
    private Optional f334016b = Optional.empty();

    /* renamed from: c */
    private Optional f334017c = Optional.empty();

    /* renamed from: d */
    private Optional f334018d = Optional.empty();

    /* renamed from: e */
    private Optional f334019e = Optional.empty();

    /* renamed from: f */
    private final C38750am f334020f;

    /* renamed from: g */
    private final C119247j f334021g;

    /* renamed from: h */
    private final boolean f334022h;

    /* renamed from: i */
    private final C119834cb f334023i;

    /* renamed from: j */
    private final C119939a f334024j;

    /* renamed from: k */
    private final long f334025k;

    public C119940b(C38750am amVar, C119247j jVar, C119939a aVar, C119834cb cbVar, boolean z, long j) {
        this.f334020f = amVar;
        this.f334021g = jVar;
        this.f334024j = aVar;
        this.f334022h = z;
        this.f334023i = cbVar;
        this.f334025k = j;
    }

    /* renamed from: a */
    public final C51227b mo104577a(C19088t tVar) {
        C51226a aVar = (C51226a) C51227b.f133373f.createBuilder();
        C119939a aVar2 = this.f334024j;
        C60218r a = C28260b.m52825a();
        C60217q qVar = (C60217q) a.toBuilder();
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        long b = aVar2.f334014a.mo26870b();
        long j = a.f162929c;
        sVar.copyOnWrite();
        C60220t tVar2 = (C60220t) sVar.instance;
        tVar2.f162933a |= 1;
        tVar2.f162934b = (b * 1000) + (j % 1000);
        sVar.copyOnWrite();
        C60220t tVar3 = (C60220t) sVar.instance;
        tVar3.f162933a |= 4;
        tVar3.f162936d = 0;
        sVar.copyOnWrite();
        C60220t tVar4 = (C60220t) sVar.instance;
        tVar4.f162933a |= 2;
        tVar4.f162935c = 0;
        qVar.copyOnWrite();
        C60218r rVar = (C60218r) qVar.instance;
        C60220t tVar5 = (C60220t) sVar.build();
        tVar5.getClass();
        rVar.f162928b = tVar5;
        rVar.f162927a |= 1;
        C60218r rVar2 = (C60218r) qVar.build();
        aVar.copyOnWrite();
        C51227b bVar = (C51227b) aVar.instance;
        rVar2.getClass();
        bVar.f133378d = rVar2;
        bVar.f133375a |= 4;
        int a2 = C51229d.m86090a((int) this.f334025k);
        if (a2 != 0) {
            aVar.copyOnWrite();
            C51227b bVar2 = (C51227b) aVar.instance;
            bVar2.f133379e = a2 - 1;
            bVar2.f133375a |= 8;
        } else {
            aVar.copyOnWrite();
            C51227b bVar3 = (C51227b) aVar.instance;
            bVar3.f133379e = 0;
            bVar3.f133375a |= 8;
        }
        C19087s sVar2 = (C19087s) C19088t.f53533p.createBuilder(tVar);
        if (this.f334017c.isPresent()) {
            C48422i iVar = (C48422i) this.f334017c.get();
            aVar.copyOnWrite();
            C51227b bVar4 = (C51227b) aVar.instance;
            iVar.getClass();
            bVar4.f133377c = iVar;
            bVar4.f133375a |= 2;
        } else {
            C48421h hVar = (C48421h) C48422i.f125135e.createBuilder();
            e eVar = e.a;
            hVar.copyOnWrite();
            C48422i iVar2 = (C48422i) hVar.instance;
            iVar2.f125138b = eVar.ca;
            iVar2.f125137a |= 1;
            C48422i iVar3 = (C48422i) hVar.build();
            aVar.copyOnWrite();
            C51227b bVar5 = (C51227b) aVar.instance;
            iVar3.getClass();
            bVar5.f133377c = iVar3;
            bVar5.f133375a |= 2;
        }
        C19081m mVar = tVar.f53542h;
        if (mVar == null) {
            mVar = C19081m.f53515g;
        }
        C19080l lVar = (C19080l) C19081m.f53515g.createBuilder(mVar);
        if (this.f334019e.isPresent()) {
            String str = (String) this.f334019e.get();
            lVar.copyOnWrite();
            C19081m mVar2 = (C19081m) lVar.instance;
            str.getClass();
            mVar2.f53517a |= 64;
            mVar2.f53522f = str;
        }
        if (this.f334018d.isPresent()) {
            C19065ai aiVar = (C19065ai) C19066aj.f53483e.createBuilder();
            C52431rm a3 = C52431rm.m86627a(((C51715bm) this.f334018d.get()).f135666c);
            aiVar.copyOnWrite();
            C19066aj ajVar = (C19066aj) aiVar.instance;
            ajVar.f53486b = a3.f137633ah;
            ajVar.f53485a |= 1;
            lVar.copyOnWrite();
            C19081m mVar3 = (C19081m) lVar.instance;
            C19066aj ajVar2 = (C19066aj) aiVar.build();
            ajVar2.getClass();
            mVar3.f53519c = ajVar2;
            mVar3.f53517a |= 8;
        }
        C19081m mVar4 = (C19081m) lVar.build();
        sVar2.copyOnWrite();
        C19088t tVar6 = (C19088t) sVar2.instance;
        mVar4.getClass();
        tVar6.f53542h = mVar4;
        tVar6.f53535a |= 128;
        C19088t tVar7 = (C19088t) sVar2.build();
        aVar.copyOnWrite();
        C51227b bVar6 = (C51227b) aVar.instance;
        tVar7.getClass();
        bVar6.f133376b = tVar7;
        bVar6.f133375a |= 1;
        return (C51227b) aVar.build();
    }

    /* renamed from: b */
    public final void mo104578b(C122392ak akVar) {
        C51227b bVar;
        C59104x b = f334015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OnDeviceQueryLoggerImpl");
        ((C59052c) ((C59052c) b).mo56372aa(34602)).mo56386p("#onDeviceFulfillmentCommitted");
        C65196fc fcVar = akVar.f339311a;
        if (fcVar == null) {
            fcVar = C65196fc.f176453l;
        }
        if (fcVar.f176462h != null) {
            C65196fc fcVar2 = akVar.f339311a;
            if (fcVar2 == null) {
                fcVar2 = C65196fc.f176453l;
            }
            C19088t tVar = fcVar2.f176462h;
            if (tVar == null) {
                tVar = C19088t.f53533p;
            }
            this.f334016b = Optional.m71637of(tVar);
        }
        C65196fc fcVar3 = akVar.f339311a;
        if (((fcVar3 == null ? C65196fc.f176453l : fcVar3).f176455a & 1) != 0) {
            C119247j jVar = this.f334021g;
            if (fcVar3 == null) {
                fcVar3 = C65196fc.f176453l;
            }
            C65163dx dxVar = fcVar3.f176464j;
            if (dxVar == null) {
                dxVar = C65163dx.f176352b;
            }
            jVar.mo104259a(dxVar);
        }
        if (this.f334016b.isPresent()) {
            bVar = mo104577a((C19088t) this.f334016b.get());
        } else {
            bVar = C51227b.f133373f;
        }
        mo104581e(bVar);
    }

    /* renamed from: c */
    public final void mo104579c(C52091ex exVar) {
        C59104x b = f334015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OnDeviceQueryLoggerImpl");
        ((C59052c) ((C59052c) b).mo56372aa(34604)).mo56386p("#onInitialConversationParams");
        for (C52232kc kcVar : exVar.f136712a) {
            if ((kcVar.f137064a & 1) != 0 && kcVar.f137065b.equals("asst.request.logging.params")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    C51536li liVar = (C51536li) C62942bv.parseFrom((C62942bv) C51536li.f134316k, kaVar.f137061c, C62921ba.m95368a());
                    if ((liVar.f134318a & 256) != 0) {
                        C52230ka kaVar2 = liVar.f134323f;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        this.f334017c = Optional.m71637of((C48422i) C62942bv.parseFrom((C62942bv) C48422i.f125135e, kaVar2.f137061c, C62921ba.m95368a()));
                        C59104x b2 = f334015a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "OnDeviceQueryLoggerImpl");
                        ((C59052c) ((C59052c) b2).mo56372aa(34606)).mo56386p("Successfully get OpaAndroidInfo from ConversationParams.");
                    }
                } catch (C62974ct e) {
                    C59104x d = f334015a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "OnDeviceQueryLoggerImpl");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(34607)).mo56386p("Failed to get OpaAndroidInfo from ConversationParams.");
                }
            } else if ((kcVar.f137064a & 1) != 0 && kcVar.f137065b.equals("asst.device.capabilities")) {
                try {
                    C52230ka kaVar3 = kcVar.f137066c;
                    if (kaVar3 == null) {
                        kaVar3 = C52230ka.f137057d;
                    }
                    this.f334018d = Optional.m71637of((C51715bm) C62942bv.parseFrom((C62942bv) C51715bm.f135662t, kaVar3.f137061c, C62921ba.m95368a()));
                } catch (C62974ct e2) {
                    C59104x d2 = f334015a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "OnDeviceQueryLoggerImpl");
                    ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(34605)).mo56386p("Failed to get DeviceCapabilities from ConversationParams.");
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo104580d(Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        this.f334019e = optional;
    }

    /* renamed from: e */
    public final void mo104581e(C51227b bVar) {
        this.f334020f.mo41597i(bVar, this.f334023i.f333767a);
        C19088t tVar = bVar.f133376b;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        if ((tVar.f53535a & 16) != 0 && this.f334022h) {
            C119247j jVar = this.f334021g;
            C19088t tVar2 = bVar.f133376b;
            if (tVar2 == null) {
                tVar2 = C19088t.f53533p;
            }
            C60218r rVar = bVar.f133378d;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            jVar.mo104260b(tVar2, rVar);
        }
    }
}
