package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.aa */
/* compiled from: PG */
public final /* synthetic */ class C96515aa implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96525ak f270031a;

    /* renamed from: b */
    public final /* synthetic */ C124629av f270032b;

    /* renamed from: c */
    public final /* synthetic */ C124721s f270033c;

    /* renamed from: d */
    public final /* synthetic */ C95355bf f270034d;

    /* renamed from: e */
    public final /* synthetic */ C96618u f270035e;

    public /* synthetic */ C96515aa(C96525ak akVar, C124629av avVar, C124721s sVar, C95355bf bfVar, C96618u uVar) {
        this.f270031a = akVar;
        this.f270032b = avVar;
        this.f270033c = sVar;
        this.f270034d = bfVar;
        this.f270035e = uVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        boolean z;
        C96525ak akVar = this.f270031a;
        C124629av avVar = this.f270032b;
        C124721s sVar = this.f270033c;
        C95355bf bfVar = this.f270034d;
        C96618u uVar = this.f270035e;
        Map map = (Map) obj;
        for (C124650bp bpVar : avVar.f343828o) {
            int i = bpVar.f343893b;
            C142468gl glVar = (C142468gl) map.get(Integer.valueOf(i));
            if (glVar == null) {
                C59104x c = C96525ak.f270048a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaRunner");
                ((C59052c) ((C59052c) c).mo56372aa(16586)).mo56387q("State not found for requested device: %d", i);
            } else {
                C142467gk a = C142467gk.m231089a(glVar.f386623b);
                if (a == null) {
                    a = C142467gk.OTA_UNKNOWN;
                }
                int ordinal = a.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 5) {
                        C59104x c2 = C96525ak.f270048a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "OtaRunner");
                        ((C59052c) ((C59052c) c2).mo56372aa(16584)).mo56389s("Unexpected state: %s", a);
                    } else if ((2 & glVar.f386622a) == 0 || !C96533as.m159941b(bpVar.f343894c, glVar.f386624c, sVar)) {
                        C59104x c3 = C96525ak.f270048a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "OtaRunner");
                        ((C59052c) ((C59052c) c3).mo56372aa(16585)).mo56360M("%d %s. Current: %s, to apply: %s", Integer.valueOf(a.f386619k), a, glVar.f386624c, bpVar.f343894c);
                    }
                }
            }
            C59104x c4 = C96525ak.f270048a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "OtaRunner");
            ((C59052c) ((C59052c) c4).mo56372aa(16583)).mo56386p("Bad state on device");
            akVar.f270051d.mo57357o(new C96584cp("Bad state on device while preparing to upload"));
            return;
        }
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C142467gk a2 = C142467gk.m231089a(((C142468gl) it.next()).f386623b);
            if (a2 == null) {
                a2 = C142467gk.OTA_UNKNOWN;
            }
            if (a2.equals(C142467gk.OTA_IDLE)) {
                synchronized (akVar) {
                    akVar.f270053f.mo90267b(akVar.f270050c.mo90273a(bfVar, sVar, avVar), C96524aj.f270047a, new C96620w(akVar));
                }
                z = true;
                break;
            }
        }
        for (C124650bp bpVar2 : avVar.f343828o) {
            C142468gl glVar2 = (C142468gl) map.get(Integer.valueOf(bpVar2.f343893b));
            glVar2.getClass();
            C142467gk a3 = C142467gk.m231089a(glVar2.f386623b);
            if (a3 == null) {
                a3 = C142467gk.OTA_UNKNOWN;
            }
            if (!a3.equals(C142467gk.OTA_RECEIVED) && (bpVar2.f343892a & 8) != 0) {
                int i2 = z ? 0 : glVar2.f386625d;
                C142467gk a4 = C142467gk.m231089a(glVar2.f386623b);
                if (a4 == null) {
                    a4 = C142467gk.OTA_UNKNOWN;
                }
                akVar.mo90211g(uVar, bfVar, sVar, avVar, bpVar2, a4, i2);
            }
        }
        C142467gk gkVar = C142467gk.OTA_RECEIVED;
        C96623z zVar = new C96623z(akVar);
        SettableFuture settableFuture = akVar.f270051d;
        Objects.requireNonNull(settableFuture);
        akVar.mo90210f(bfVar, sVar, avVar, gkVar, zVar, new C96520af(settableFuture));
    }
}
