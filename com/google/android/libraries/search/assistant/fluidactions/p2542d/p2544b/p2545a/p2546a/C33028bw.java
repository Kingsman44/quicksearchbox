package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C51044eh;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51047ek;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52500ua;
import com.google.assistant.p3897e.p3921j.C52501ub;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.afa;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bw */
/* compiled from: PG */
public final class C33028bw implements C33110f {

    /* renamed from: a */
    private static final C59071e f88446a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bw");

    /* renamed from: a */
    public final C60870cx mo38501a(Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar) {
        Optional optional2;
        C52501ub ubVar;
        C51047ek ekVar;
        if (uhVar.f137840a.size() == 1) {
            char c = 0;
            if (((C52490tr) uhVar.f137840a.get(0)).f137798b == 18) {
                if ((((C52490tr) uhVar.f137840a.get(0)).f137797a & 1) != 0) {
                    C52490tr trVar = (C52490tr) uhVar.f137840a.get(0);
                    C52091ex c2 = dVar.mo38534c();
                    Optional g = C33136x.m61490g(trVar.f137800d, ffVar);
                    if (g.isEmpty() || ((C51941eu) g.get()).f136277e != 37) {
                        C59104x c3 = f88446a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "ReadMessageFeatureProc");
                        ((C59052c) ((C59052c) c3).mo56372aa(50865)).mo56386p("#readMessageFeature: FormField can not be found or is of invalid type");
                        optional2 = Optional.empty();
                    } else {
                        C51941eu euVar = (C51941eu) g.get();
                        if (trVar.f137798b == 18) {
                            ubVar = (C52501ub) trVar.f137799c;
                        } else {
                            ubVar = C52501ub.f137826c;
                        }
                        C52500ua uaVar = ubVar.f137829b;
                        if (uaVar == null) {
                            uaVar = C52500ua.f137822c;
                        }
                        if (euVar.f136277e == 37) {
                            ekVar = (C51047ek) euVar.f136278f;
                        } else {
                            ekVar = C51047ek.f132921d;
                        }
                        C51045ei eiVar = (C51045ei) ekVar.f132924b.get(uaVar.f137825b);
                        if (eiVar.f132915b == 5) {
                            int i = eiVar.f132917d;
                            String str = ((C51044eh) eiVar.f132916c).f132910c;
                            afa afa = (afa) afb.f134984e.createBuilder();
                            afa.copyOnWrite();
                            afb afb = (afb) afa.instance;
                            afb.f134986a |= 1;
                            afb.f134987b = i;
                            afa.copyOnWrite();
                            afb afb2 = (afb) afa.instance;
                            str.getClass();
                            afb2.f134986a |= 2;
                            afb2.f134988c = str;
                            afa.copyOnWrite();
                            afb afb3 = (afb) afa.instance;
                            afb3.f134986a |= 4;
                            afb3.f134989d = true;
                            C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
                            dxVar.copyOnWrite();
                            C51809dy dyVar = (C51809dy) dxVar.instance;
                            dyVar.f135935a |= 1;
                            dyVar.f135936b = "notification.REPLY";
                            C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
                            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                            kbVar.copyOnWrite();
                            C52232kc kcVar = (C52232kc) kbVar.instance;
                            kcVar.f137064a |= 1;
                            kcVar.f137065b = "notification_reply_args";
                            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                            jzVar.copyOnWrite();
                            C52230ka kaVar = (C52230ka) jzVar.instance;
                            kaVar.f137059a = 1 | kaVar.f137059a;
                            kaVar.f137060b = "assistant.api.client_op.NotificationReplyArgs";
                            C63088z byteString = ((afb) afa.build()).toByteString();
                            jzVar.copyOnWrite();
                            C52230ka kaVar2 = (C52230ka) jzVar.instance;
                            byteString.getClass();
                            kaVar2.f137059a |= 2;
                            kaVar2.f137061c = byteString;
                            kbVar.copyOnWrite();
                            C52232kc kcVar2 = (C52232kc) kbVar.instance;
                            C52230ka kaVar3 = (C52230ka) jzVar.build();
                            kaVar3.getClass();
                            kcVar2.f137066c = kaVar3;
                            kcVar2.f137064a |= 2;
                            dvVar.mo53733c((C52232kc) kbVar.build());
                            dxVar.copyOnWrite();
                            C51809dy dyVar2 = (C51809dy) dxVar.instance;
                            C51807dw dwVar = (C51807dw) dvVar.build();
                            dwVar.getClass();
                            dyVar2.f135938d = dwVar;
                            dyVar2.f135935a |= 4;
                            optional2 = Optional.m71637of(C33118f.m61461b(C58485gu.m89846n((C51809dy) dxVar.build()), C58733pz.f156496a, c2));
                        } else {
                            C59104x c4 = f88446a.mo56225c();
                            c4.mo56378ag(C58975e.f156826a, "ReadMessageFeatureProc");
                            C59052c cVar = (C59052c) ((C59052c) c4).mo56372aa(50866);
                            int i2 = eiVar.f132915b;
                            if (i2 == 0) {
                                c = 1;
                            } else if (i2 == 4) {
                                c = 5;
                            } else if (i2 == 5) {
                                c = 6;
                            } else if (i2 == 6) {
                                c = 7;
                            }
                            String str2 = c != 1 ? c != 5 ? c != 6 ? c != 7 ? "null" : "CONFIRMATION_CARD" : "REPLY_CARD" : "PREVIEW_CARD" : "CARD_NOT_SET";
                            if (c != 0) {
                                cVar.mo56389s("#readMessageFeature: Expect the message to be a reply card, actual type %s", str2);
                                optional2 = Optional.empty();
                            } else {
                                throw null;
                            }
                        }
                    }
                    return C60856cj.m92900i(optional2);
                }
                C59104x c5 = f88446a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "ReadMessageFeatureProc");
                ((C59052c) ((C59052c) c5).mo56372aa(50864)).mo56386p("#readMessageFeature: Missing FormField id");
                return C60856cj.m92900i(Optional.empty());
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(Optional.empty());
    }
}
