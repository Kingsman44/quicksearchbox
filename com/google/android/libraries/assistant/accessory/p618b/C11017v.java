package com.google.android.libraries.assistant.accessory.p618b;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.wearable.C146414i;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.assistant.p3739a.p3740a.C48112i;
import com.google.assistant.p3739a.p3740a.C48113j;
import com.google.assistant.p3739a.p3740a.C48114k;
import com.google.assistant.p3739a.p3740a.C48115l;
import com.google.assistant.p3739a.p3740a.C48120q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63088z;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.accessory.b.v */
/* compiled from: PG */
public final class C11017v {

    /* renamed from: a */
    public static final C59071e f36196a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.b.v");

    /* renamed from: a */
    public static C11003h m26072a(String str, int i, int i2, Integer num) {
        C10998c cVar = new C10998c();
        cVar.mo19379b(str);
        cVar.f36149a = 5;
        cVar.f36154f = Integer.valueOf(i);
        cVar.f36155g = Integer.valueOf(i2);
        if (num != null) {
            cVar.f36151c = Integer.valueOf(num.intValue());
        }
        return cVar.mo19378a();
    }

    /* renamed from: b */
    public static C48115l m26073b(C11003h hVar, String str) {
        C48113j jVar = (C48113j) C48115l.f124522j.createBuilder();
        int intValue = hVar.mo19386d().intValue();
        jVar.copyOnWrite();
        ((C48115l) jVar.instance).f124524a = C48112i.m85182a(C48112i.m85183b(intValue));
        C63088z E = C63088z.m96143E(hVar.mo19391h());
        jVar.copyOnWrite();
        ((C48115l) jVar.instance).f124525b = E;
        int intValue2 = hVar.mo19387e().intValue();
        jVar.copyOnWrite();
        ((C48115l) jVar.instance).f124531h = C48114k.m85184a(C48114k.m85185b(intValue2));
        int intValue3 = hVar.mo19385c().intValue();
        jVar.copyOnWrite();
        ((C48115l) jVar.instance).f124532i = intValue3;
        if (str != null && !str.isEmpty()) {
            C63088z E2 = C63088z.m96143E(str);
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124526c = E2;
        }
        if (hVar.mo19393i() != null && !hVar.mo19393i().isEmpty()) {
            C63088z E3 = C63088z.m96143E(hVar.mo19393i());
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124528e = E3;
        }
        if (hVar.mo19390g() != null && !hVar.mo19390g().isEmpty()) {
            C63088z E4 = C63088z.m96143E(hVar.mo19390g());
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124527d = E4;
        }
        if (hVar.mo19384b() != null) {
            int intValue4 = hVar.mo19384b().intValue();
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124529f = C48120q.m85186a(C48120q.m85187b(intValue4));
        }
        if (hVar.mo19389f() != null) {
            int intValue5 = hVar.mo19389f().intValue();
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124530g = intValue5;
        }
        return (C48115l) jVar.build();
    }

    /* renamed from: c */
    public static String m26074c(boolean z) {
        return "/assistant/connectivity/".concat(true != z ? "peripheral/" : "host/");
    }

    /* renamed from: d */
    public static String m26075d(int i) {
        switch (i) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "CONNECT_ASSISTANT";
            case 2:
                return "FAILED_TO_CONNECT_ASSISTANT";
            case 3:
                return "DISCONNECT_ASSISTANT";
            case 4:
                return "REQUEST_STATE";
            case 5:
                return "UPDATE_STATE";
            case 6:
                return "UPDATE_PEER_ADDRESS";
            default:
                return null;
        }
    }

    /* renamed from: e */
    public static String m26076e(int i) {
        switch (i) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "WAITING_FOR_CONNECTION";
            case 2:
                return "CONNECTED";
            case 3:
                return "WAITING_FOR_DISCONNECTION";
            case 4:
                return "DISCONNECTED";
            case 5:
                return "CONNECTION_FAILURE";
            case 6:
                return "BT_ON";
            case 7:
                return "BT_OFF";
            default:
                return null;
        }
    }

    /* renamed from: f */
    public static void m26077f(C48113j jVar, C146414i iVar, C11011p pVar, boolean z) {
        String str;
        Optional optional;
        if (iVar != null) {
            int a = pVar.mo19407a();
            jVar.copyOnWrite();
            C48115l lVar = C48115l.f124522j;
            ((C48115l) jVar.instance).f124532i = a;
            C48115l lVar2 = (C48115l) jVar.build();
            int b = C48112i.m85183b(lVar2.f124524a);
            if (b == 0) {
                b = 1;
            }
            switch (b) {
                case 2:
                    str = "ASSISTANT_UPDATE_ACTION_UNSPECIFIED";
                    break;
                case 3:
                    str = "CONNECT_ASSISTANT";
                    break;
                case 4:
                    str = "FAILED_TO_CONNECT_ASSISTANT";
                    break;
                case 5:
                    str = "DISCONNECT_ASSISTANT";
                    break;
                case 6:
                    str = "REQUEST_STATE";
                    break;
                case 7:
                    str = "UPDATE_STATE";
                    break;
                case 8:
                    str = "UPDATE_PEER_ADDRESS";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            String lowerCase = str.toLowerCase(Locale.getDefault());
            if (!lowerCase.isEmpty()) {
                lowerCase = m26074c(z).concat(String.valueOf(lowerCase));
            }
            if (lowerCase.isEmpty()) {
                C59104x d = f36196a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
                ((C59052c) ((C59052c) d).mo56372aa(42549)).mo56386p("Could not construct data item request path successfully.");
                optional = Optional.empty();
            } else {
                PutDataRequest a2 = PutDataRequest.m238328a(lowerCase);
                a2.f395482d = 0;
                a2.f395481c = lVar2.toByteArray();
                optional = Optional.m71637of(a2);
            }
            if (optional.isPresent()) {
                pVar.mo19421n(lVar2.f124531h);
                C146006ab a3 = iVar.mo123092a((PutDataRequest) optional.get());
                a3.mo122499r(C11013r.f36190a);
                a3.mo122498q(C11014s.f36191a);
                C59104x b2 = f36196a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
                ((C59052c) ((C59052c) b2).mo56372aa(42555)).mo56359L("Send data item, action : %d, state : %d, order : %d", Integer.valueOf(lVar2.f124524a), Integer.valueOf(lVar2.f124531h), Integer.valueOf(lVar2.f124532i));
                int i = lVar2.f124524a;
                int i2 = lVar2.f124531h;
                lVar2.f124525b.mo59170I(C62972cr.f170009a);
                int i3 = lVar2.f124532i;
                int b3 = C48112i.m85183b(lVar2.f124524a);
                if (b3 == 0) {
                    b3 = 1;
                }
                int i4 = b3 - 2;
                if (i4 == 1) {
                    C11015t tVar = new C11015t(jVar, iVar, pVar, z);
                    int incrementAndGet = pVar.f36177c.incrementAndGet();
                    int i5 = 60;
                    if (incrementAndGet >= 3) {
                        i5 = 60 + Math.min(240, (int) Math.pow(2.0d, (double) (incrementAndGet - 3)));
                    }
                    pVar.f36181g = pVar.f36180f.schedule(tVar, (long) i5, TimeUnit.SECONDS);
                } else if (i4 != 5) {
                    pVar.mo19418k();
                } else {
                    int b4 = C48114k.m85185b(lVar2.f124531h);
                    if (b4 == 0 || b4 != 3) {
                        pVar.mo19418k();
                    }
                }
            } else {
                C59104x b5 = f36196a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
                ((C59052c) ((C59052c) b5).mo56372aa(42557)).mo56386p("Could not create PutDataRequest.");
            }
        }
    }
}
