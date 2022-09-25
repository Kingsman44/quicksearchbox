package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import android.provider.Settings;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.aev;
import com.google.assistant.p3897e.p3921j.aex;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.b */
/* compiled from: PG */
public final /* synthetic */ class C128324b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C128325c f352925a;

    public /* synthetic */ C128324b(C128325c cVar) {
        this.f352925a = cVar;
    }

    public final Object apply(Object obj) {
        Optional empty;
        C128325c cVar = this.f352925a;
        C52070ec ecVar = (C52070ec) obj;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        if (a.equals(C52235kf.OK)) {
            C52069eb ebVar = ecVar.f136655c;
            if (ebVar == null) {
                ebVar = C52069eb.f136648b;
            }
            Iterator it = ebVar.f136650a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                C52232kc kcVar = (C52232kc) it.next();
                if (kcVar.f137065b.equals("notification_fetch_result")) {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    if ("assistant.api.client_op.NotificationFetchResult".equals(kaVar.f137060b)) {
                        try {
                            C52230ka kaVar2 = kcVar.f137066c;
                            if (kaVar2 == null) {
                                kaVar2 = C52230ka.f137057d;
                            }
                            empty = Optional.m71637of((aex) C62942bv.parseFrom((C62942bv) aex.f134969f, kaVar2.f137061c, C62921ba.m95368a()));
                        } catch (C62974ct e) {
                            C59104x c = C128325c.f352926a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "MaNotifFetchPerformer");
                            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37852)).mo56386p("Incompatible NotificationFetchResult proto implementations.");
                            empty = Optional.empty();
                        }
                    }
                }
            }
            if (empty.isPresent() && ((aex) empty.get()).f134972b.size() != 0) {
                aev aev = (aev) ((aex) empty.get()).toBuilder();
                int i = Settings.Secure.getInt(cVar.f352927b.getContentResolver(), "lock_screen_show_notifications", -1) > 0 ? 1 : 2;
                C58976aa aaVar = C58975e.f156826a;
                aev.copyOnWrite();
                aex aex = (aex) aev.instance;
                aex.f134973c = i - 1;
                aex.f134971a |= 1;
                boolean z = Settings.Secure.getInt(cVar.f352927b.getContentResolver(), "lock_screen_allow_private_notifications", -1) > 0;
                aev.copyOnWrite();
                aex aex2 = (aex) aev.instance;
                aex2.f134971a |= 2;
                aex2.f134974d = z;
                aex aex3 = (aex) aev.build();
                ArrayList arrayList = new ArrayList();
                C52069eb ebVar2 = ecVar.f136655c;
                if (ebVar2 == null) {
                    ebVar2 = C52069eb.f136648b;
                }
                for (C52232kc kcVar2 : ebVar2.f136650a) {
                    if (kcVar2.f137065b.equals("notification_fetch_result")) {
                        C52230ka kaVar3 = kcVar2.f137066c;
                        if (kaVar3 == null) {
                            kaVar3 = C52230ka.f137057d;
                        }
                        if ("assistant.api.client_op.NotificationFetchResult".equals(kaVar3.f137060b)) {
                            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                            kbVar.copyOnWrite();
                            C52232kc kcVar3 = (C52232kc) kbVar.instance;
                            kcVar3.f137064a |= 1;
                            kcVar3.f137065b = "notification_fetch_result";
                            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                            jzVar.copyOnWrite();
                            C52230ka kaVar4 = (C52230ka) jzVar.instance;
                            kaVar4.f137059a |= 1;
                            kaVar4.f137060b = "assistant.api.client_op.NotificationFetchResult";
                            C63088z byteString = aex3.toByteString();
                            jzVar.copyOnWrite();
                            C52230ka kaVar5 = (C52230ka) jzVar.instance;
                            byteString.getClass();
                            kaVar5.f137059a |= 2;
                            kaVar5.f137061c = byteString;
                            C52230ka kaVar6 = (C52230ka) jzVar.build();
                            kbVar.copyOnWrite();
                            C52232kc kcVar4 = (C52232kc) kbVar.instance;
                            kaVar6.getClass();
                            kcVar4.f137066c = kaVar6;
                            kcVar4.f137064a |= 2;
                            arrayList.add((C52232kc) kbVar.build());
                        }
                    }
                    arrayList.add(kcVar2);
                }
                C51810dz dzVar = (C51810dz) ecVar.toBuilder();
                C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
                eaVar.copyOnWrite();
                C52069eb ebVar3 = (C52069eb) eaVar.instance;
                ebVar3.mo53781a();
                C62947c.addAll((Iterable) arrayList, (List) ebVar3.f136650a);
                dzVar.copyOnWrite();
                C52070ec ecVar2 = (C52070ec) dzVar.instance;
                C52069eb ebVar4 = (C52069eb) eaVar.build();
                ebVar4.getClass();
                ecVar2.f136655c = ebVar4;
                ecVar2.f136653a |= 2;
                ecVar = (C52070ec) dzVar.build();
            }
        }
        cVar.f352928c.mo19974a(C37176a.f96818P.mo40805c(C128322a.m209417a(ecVar)));
        return ecVar;
    }
}
