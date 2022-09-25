package com.google.android.apps.search.podcasts.p10590o;

import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.p4017at.p4082j.p4083a.C54458w;
import java.util.Collections;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.podcasts.o.ai */
/* compiled from: PG */
final class C140708ai {
    /* renamed from: a */
    public static void m228498a(C140702ac acVar, C140706ag agVar) {
        C54394ct ctVar = agVar.f382123a;
        if (ctVar == null) {
            ctVar = C54394ct.f142866c;
        }
        String str = ctVar.f142869b;
        C140733z zVar = (C140733z) ((C140701ab) Map.EL.getOrDefault(Collections.unmodifiableMap(Collections.unmodifiableMap(((C140704ae) acVar.instance).f382120a)), str, C140701ab.f382113c)).toBuilder();
        C54397cw a = C54397cw.m87374a(agVar.f382124b);
        if (a == null) {
            a = C54397cw.UNRECOGNIZED;
        }
        if (a == C54397cw.SHOW_CLEAR && Collections.unmodifiableMap(((C140701ab) zVar.instance).f382116b).size() == 0) {
            str.getClass();
            acVar.copyOnWrite();
            ((C140704ae) acVar.instance).mo115838a().remove(str);
            return;
        }
        zVar.copyOnWrite();
        agVar.getClass();
        ((C140701ab) zVar.instance).f382115a = agVar;
        acVar.mo115837a(str, (C140701ab) zVar.build());
    }

    /* renamed from: b */
    public static void m228499b(C140702ac acVar, C140728u uVar) {
        C54455t tVar = uVar.f382158a;
        if (tVar == null) {
            tVar = C54455t.f142988c;
        }
        C54394ct ctVar = tVar.f142990a;
        if (ctVar == null) {
            ctVar = C54394ct.f142866c;
        }
        String str = ctVar.f142869b;
        C54455t tVar2 = uVar.f382158a;
        if (tVar2 == null) {
            tVar2 = C54455t.f142988c;
        }
        String str2 = tVar2.f142991b;
        C140733z zVar = (C140733z) ((C140701ab) Map.EL.getOrDefault(Collections.unmodifiableMap(Collections.unmodifiableMap(((C140704ae) acVar.instance).f382120a)), str, C140701ab.f382113c)).toBuilder();
        C54458w a = C54458w.m87383a(uVar.f382159b);
        if (a == null) {
            a = C54458w.UNRECOGNIZED;
        }
        if (a == C54458w.EPISODE_CLEAR) {
            str2.getClass();
            zVar.copyOnWrite();
            ((C140701ab) zVar.instance).mo115836a().remove(str2);
        } else {
            zVar.mo115846a(str2, uVar);
        }
        acVar.mo115837a(str, (C140701ab) zVar.build());
    }
}
