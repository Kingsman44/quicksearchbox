package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.dw */
/* compiled from: PG */
public final class C120295dw extends C68247h {

    /* renamed from: a */
    private final C68283d f334690a;

    public C120295dw(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C120295dw.class), aVar);
        this.f334690a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Optional empty;
        Iterator it = ((C119937f) obj).mo104571a().f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if (kcVar.f137065b.equals("asst.device.properties")) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if (kaVar.f137060b.equals("assistant.api.params.DeviceProperties")) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        empty = Optional.m71637of((C51334dw) C62942bv.parseFrom((C62942bv) C51334dw.f133658ab, kaVar2.f137061c, C62921ba.m95368a()));
                    } catch (C62974ct e) {
                        C59104x c = C120294dv.f334689a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34692)).mo56386p("#produceDeviceProperties: failed to parse DeviceCapabilities");
                    }
                } else {
                    continue;
                }
            }
        }
        return C60856cj.m92900i(empty);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f334690a.mo60297gq();
    }
}
