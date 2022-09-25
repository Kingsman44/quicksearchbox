package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p857b.p858a.p859a.C12886h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.e */
/* compiled from: PG */
public final class C16564e {

    /* renamed from: a */
    public static final /* synthetic */ int f48588a = 0;

    /* renamed from: b */
    private static final C59071e f48589b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.u.b.a.a.e");

    /* renamed from: c */
    private static final C52232kc f48590c;

    static {
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
        C63088z zVar = C63088z.f170246b;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = zVar;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        f48590c = (C52232kc) kbVar.build();
    }

    /* renamed from: a */
    static C60870cx m33602a(Set set, C52091ex exVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("asst.dialog.state.params", f48590c);
        Collection.EL.stream(exVar.f136712a).forEach(new C16463a(hashMap));
        Collection.EL.stream(set).filter(C16561b.f48585a).map(C16562c.f48586a).forEach(new C16563d(hashMap));
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        ewVar.mo53790c(hashMap.values());
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i((C52091ex) ewVar.build());
    }

    /* renamed from: b */
    static C60870cx m33603b(C12991i iVar, Map map) {
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (map.containsKey(a)) {
            return ((C12886h) map.get(a)).f40145a.mo46042d();
        }
        C59104x d = f48589b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvParamsProducer");
        ((C59052c) ((C59052c) d).mo56372aa(46310)).mo56389s("No ConversationParamsStore found for EntrySurface: %s", a.name());
        return C60856cj.m92900i(C52091ex.f136710b);
    }
}
