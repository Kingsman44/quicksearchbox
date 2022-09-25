package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import com.google.assistant.p3897e.p3917i.p3918a.C51373fh;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.a */
/* compiled from: PG */
public final class C19043a {

    /* renamed from: a */
    private static final C59071e f53444a = C59071e.m91332i("com.google.android.libraries.assistant.portable.a.a.a");

    /* renamed from: a */
    public static C52091ex m36478a(C52091ex exVar, C51373fh fhVar) {
        C63088z byteString = fhVar.toByteString();
        C52090ew ewVar = (C52090ew) exVar.toBuilder();
        int size = ((C52091ex) ewVar.instance).f136712a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if ("asst.dialog.state.params".equals(ewVar.mo53789b(i).f137065b)) {
                ewVar.mo53793f(i);
                break;
            } else {
                i++;
            }
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.dialog.state.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.DialogStateParams";
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
        ewVar.mo53791d(kbVar);
        return (C52091ex) ewVar.build();
    }

    /* renamed from: b */
    public static C58833ax m36479b(C52091ex exVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.dialog.state.params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.DialogStateParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k((C51373fh) C62942bv.parseFrom((C62942bv) C51373fh.f133802b, kaVar2.f137061c));
                    } catch (C62974ct unused) {
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public static MessageLite m36480c(C52091ex exVar, C63010eb ebVar) {
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.dialog.state.params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.DialogStateParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return (MessageLite) ebVar.mo59008g(kaVar2.f137061c);
                    } catch (C62974ct e) {
                        C59104x b = f53444a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "AccessorsConvParamsUtl");
                        ((C59052c) ((C59052c) ((C59052c) b).mo56382g(e)).mo56372aa(47532)).mo56354G("Failed to parse invalid proto for key: %s and proto type: %s", "asst.dialog.state.params", "assistant.api.params.DialogStateParams");
                        return (MessageLite) ebVar.mo59010i(new byte[0]);
                    }
                }
            }
        }
        return (MessageLite) ebVar.mo59010i(new byte[0]);
    }
}
