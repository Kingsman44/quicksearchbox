package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66647dn;
import com.google.speech.p5208h.C66648do;
import com.google.speech.p5208h.C66649dp;
import com.google.speech.p5208h.C66650dq;
import com.google.speech.p5208h.C66686t;
import com.google.speech.p5218j.C67033io;
import com.google.speech.p5218j.C67034ip;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67070jy;
import com.google.speech.p5218j.C67091ks;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.o */
/* compiled from: PG */
final class C120166o implements C17235c {

    /* renamed from: a */
    final /* synthetic */ Optional f334436a;

    /* renamed from: b */
    final /* synthetic */ Optional f334437b;

    public C120166o(Optional optional, Optional optional2) {
        this.f334436a = optional;
        this.f334437b = optional2;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        C66686t tVar;
        if (!this.f334436a.isPresent()) {
            C59104x b = C120167p.f334438a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SpeakerIdInfoS3RequestProducer");
            ((C59052c) ((C59052c) b).mo56372aa(34665)).mo56389s("Get speaker info from device: %s", this.f334437b);
            if (this.f334437b.isPresent()) {
                C51334dw dwVar = (C51334dw) this.f334437b.get();
                C51331dt a = C51331dt.m86135a(dwVar.f133665F);
                if (a == null) {
                    a = C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL;
                }
                if (a != C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL) {
                    C51331dt a2 = C51331dt.m86135a(dwVar.f133665F);
                    if (a2 == null) {
                        a2 = C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL;
                    }
                    if (a2 != C51331dt.UNTRUSTED) {
                        return;
                    }
                }
                C120167p.m199098b(cdVar);
            }
        } else if ((((C67050je) this.f334436a.get()).f182264a & 4) != 0) {
            C59104x b2 = C120167p.f334438a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SpeakerIdInfoS3RequestProducer");
            ((C59052c) ((C59052c) b2).mo56372aa(34667)).mo56386p("Get speaker info from voice matched hotword");
            C67091ks ksVar = ((C67050je) this.f334436a.get()).f182267d;
            if (ksVar == null) {
                ksVar = C67091ks.f182386h;
            }
            C66647dn dnVar = (C66647dn) C66648do.f181316e.createBuilder();
            if ((ksVar.f182388a & 1) != 0) {
                boolean z = ksVar.f182389b;
                dnVar.copyOnWrite();
                C66648do doVar = (C66648do) dnVar.instance;
                doVar.f181318a |= 2;
                doVar.f181320c = z;
            }
            if (ksVar.f182393f.size() == 1) {
                for (C67034ip ipVar : ((C67070jy) ((Map.Entry) Collections.unmodifiableMap(ksVar.f182393f).entrySet().iterator().next()).getValue()).f182317a) {
                    if (ipVar.f182212c) {
                        C67033io a3 = C67033io.m97411a(ipVar.f182211b);
                        if (a3 == null) {
                            a3 = C67033io.GH_INTERVAL_GUEST;
                        }
                        int ordinal = a3.ordinal();
                        if (ordinal == 0) {
                            tVar = C66686t.DEFAULT_INTERVAL_GUEST;
                        } else if (ordinal == 1) {
                            tVar = C66686t.INTERVAL_UNLIKELY_USER;
                        } else if (ordinal == 2) {
                            tVar = C66686t.INTERVAL_USER;
                        } else if (ordinal != 3) {
                            tVar = C66686t.DEFAULT_INTERVAL_GUEST;
                        } else {
                            tVar = C66686t.INTERVAL_TRUSTED_USER;
                        }
                        dnVar.copyOnWrite();
                        C66648do doVar2 = (C66648do) dnVar.instance;
                        tVar.getClass();
                        C62961ch chVar = doVar2.f181321d;
                        if (!chVar.mo58948c()) {
                            doVar2.f181321d = C62942bv.mutableCopy(chVar);
                        }
                        doVar2.f181321d.mo58916g(tVar.f181416e);
                    }
                }
            }
            float f = ksVar.f182391d;
            dnVar.copyOnWrite();
            C66648do doVar3 = (C66648do) dnVar.instance;
            doVar3.f181318a = 1 | doVar3.f181318a;
            doVar3.f181319b = f;
            C62940bt btVar = C66650dq.f181324e;
            C66649dp dpVar = (C66649dp) C66650dq.f181323d.createBuilder();
            C66648do doVar4 = (C66648do) dnVar.build();
            dpVar.copyOnWrite();
            C66650dq dqVar = (C66650dq) dpVar.instance;
            doVar4.getClass();
            C62971cq cqVar = dqVar.f181327b;
            if (!cqVar.mo58948c()) {
                dqVar.f181327b = C62942bv.mutableCopy(cqVar);
            }
            dqVar.f181327b.add(doVar4);
            cdVar.mo58885m(btVar, (C66650dq) dpVar.build());
        } else {
            C59104x b3 = C120167p.f334438a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SpeakerIdInfoS3RequestProducer");
            ((C59052c) ((C59052c) b3).mo56372aa(34666)).mo56386p("Get speaker info from non voice matched hotword");
            C120167p.m199098b(cdVar);
        }
    }
}
