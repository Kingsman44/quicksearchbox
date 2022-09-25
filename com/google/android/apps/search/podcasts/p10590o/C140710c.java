package com.google.android.apps.search.podcasts.p10590o;

import android.util.Pair;
import com.google.common.base.C58817ah;
import com.google.p4017at.p4082j.p4083a.C54378cd;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.p4017at.p4082j.p4083a.C54396cv;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.p4017at.p4082j.p4083a.C54427dz;
import com.google.p4017at.p4082j.p4083a.C54430eb;
import com.google.p4017at.p4082j.p4083a.C54432ed;
import com.google.p4017at.p4082j.p4083a.C54440el;
import com.google.p4017at.p4082j.p4083a.C54455t;
import com.google.p4017at.p4082j.p4083a.C54457v;
import com.google.p4017at.p4082j.p4083a.C54458w;
import com.google.protobuf.C63042fg;
import java.util.Collections;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.podcasts.o.c */
/* compiled from: PG */
public final /* synthetic */ class C140710c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Pair f382125a;

    public /* synthetic */ C140710c(Pair pair) {
        this.f382125a = pair;
    }

    public final Object apply(Object obj) {
        Pair pair = this.f382125a;
        C54427dz dzVar = (C54427dz) pair.first;
        C54430eb ebVar = (C54430eb) pair.second;
        C140731x xVar = (C140731x) ((C140732y) obj).toBuilder();
        C63042fg fgVar = ebVar.f142942a;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        xVar.copyOnWrite();
        C140732y yVar = (C140732y) xVar.instance;
        fgVar.getClass();
        yVar.f382168c = fgVar;
        C140730w wVar = yVar.f382167b;
        if (wVar == null) {
            wVar = C140730w.f382160c;
        }
        C140729v vVar = (C140729v) wVar.toBuilder();
        for (int i = 0; i < dzVar.f142938b.size(); i++) {
            vVar.copyOnWrite();
            C140730w wVar2 = (C140730w) vVar.instance;
            wVar2.mo115844a();
            wVar2.f382162a.remove(0);
        }
        for (int i2 = 0; i2 < dzVar.f142939c.size(); i2++) {
            vVar.copyOnWrite();
            C140730w wVar3 = (C140730w) vVar.instance;
            wVar3.mo115845b();
            wVar3.f382163b.remove(0);
        }
        xVar.copyOnWrite();
        C140730w wVar4 = (C140730w) vVar.build();
        wVar4.getClass();
        ((C140732y) xVar.instance).f382167b = wVar4;
        if (ebVar.f142943b != null) {
            C140702ac acVar = (C140702ac) C140704ae.f382118b.createBuilder();
            C54378cd cdVar = ebVar.f142943b;
            if (cdVar == null) {
                cdVar = C54378cd.f142835c;
            }
            for (C54396cv cvVar : cdVar.f142837a) {
                C54394ct ctVar = cvVar.f142872a;
                if (ctVar == null) {
                    ctVar = C54394ct.f142866c;
                }
                String str = ctVar.f142869b;
                C140733z zVar = (C140733z) ((C140701ab) Map.EL.getOrDefault(Collections.unmodifiableMap(Collections.unmodifiableMap(((C140704ae) acVar.instance).f382120a)), str, C140701ab.f382113c)).toBuilder();
                C140705af afVar = (C140705af) C140706ag.f382121c.createBuilder();
                C54394ct ctVar2 = cvVar.f142872a;
                if (ctVar2 == null) {
                    ctVar2 = C54394ct.f142866c;
                }
                afVar.copyOnWrite();
                ctVar2.getClass();
                ((C140706ag) afVar.instance).f382123a = ctVar2;
                C54397cw a = C54397cw.m87374a(cvVar.f142873b);
                if (a == null) {
                    a = C54397cw.UNRECOGNIZED;
                }
                afVar.copyOnWrite();
                ((C140706ag) afVar.instance).f382124b = a.getNumber();
                C140706ag agVar = (C140706ag) afVar.build();
                zVar.copyOnWrite();
                agVar.getClass();
                ((C140701ab) zVar.instance).f382115a = agVar;
                acVar.mo115837a(str, (C140701ab) zVar.build());
            }
            C54378cd cdVar2 = ebVar.f142943b;
            if (cdVar2 == null) {
                cdVar2 = C54378cd.f142835c;
            }
            for (C54457v vVar2 : cdVar2.f142838b) {
                C54455t tVar = vVar2.f142994a;
                if (tVar == null) {
                    tVar = C54455t.f142988c;
                }
                C54394ct ctVar3 = tVar.f142990a;
                if (ctVar3 == null) {
                    ctVar3 = C54394ct.f142866c;
                }
                String str2 = ctVar3.f142869b;
                C140733z zVar2 = (C140733z) ((C140701ab) Map.EL.getOrDefault(Collections.unmodifiableMap(Collections.unmodifiableMap(((C140704ae) acVar.instance).f382120a)), str2, C140701ab.f382113c)).toBuilder();
                C54455t tVar2 = vVar2.f142994a;
                if (tVar2 == null) {
                    tVar2 = C54455t.f142988c;
                }
                String str3 = tVar2.f142991b;
                C140727t tVar3 = (C140727t) C140728u.f382156c.createBuilder();
                C54455t tVar4 = vVar2.f142994a;
                if (tVar4 == null) {
                    tVar4 = C54455t.f142988c;
                }
                tVar3.copyOnWrite();
                tVar4.getClass();
                ((C140728u) tVar3.instance).f382158a = tVar4;
                C54458w a2 = C54458w.m87383a(vVar2.f142995b);
                if (a2 == null) {
                    a2 = C54458w.UNRECOGNIZED;
                }
                tVar3.copyOnWrite();
                ((C140728u) tVar3.instance).f382159b = a2.getNumber();
                zVar2.mo115846a(str3, (C140728u) tVar3.build());
                acVar.mo115837a(str2, (C140701ab) zVar2.build());
            }
            for (C54440el elVar : Collections.unmodifiableList(((C140730w) vVar.instance).f382162a)) {
                C140705af afVar2 = (C140705af) C140706ag.f382121c.createBuilder();
                C54394ct ctVar4 = elVar.f142963a;
                if (ctVar4 == null) {
                    ctVar4 = C54394ct.f142866c;
                }
                afVar2.copyOnWrite();
                ctVar4.getClass();
                ((C140706ag) afVar2.instance).f382123a = ctVar4;
                C54397cw a3 = C54397cw.m87374a(elVar.f142964b);
                if (a3 == null) {
                    a3 = C54397cw.UNRECOGNIZED;
                }
                afVar2.copyOnWrite();
                ((C140706ag) afVar2.instance).f382124b = a3.getNumber();
                C140708ai.m228498a(acVar, (C140706ag) afVar2.build());
            }
            for (C54432ed edVar : Collections.unmodifiableList(((C140730w) vVar.instance).f382163b)) {
                C140727t tVar5 = (C140727t) C140728u.f382156c.createBuilder();
                C54455t tVar6 = edVar.f142946a;
                if (tVar6 == null) {
                    tVar6 = C54455t.f142988c;
                }
                tVar5.copyOnWrite();
                tVar6.getClass();
                ((C140728u) tVar5.instance).f382158a = tVar6;
                C54458w a4 = C54458w.m87383a(edVar.f142947b);
                if (a4 == null) {
                    a4 = C54458w.UNRECOGNIZED;
                }
                tVar5.copyOnWrite();
                ((C140728u) tVar5.instance).f382159b = a4.getNumber();
                C140708ai.m228499b(acVar, (C140728u) tVar5.build());
            }
            xVar.copyOnWrite();
            C140704ae aeVar = (C140704ae) acVar.build();
            aeVar.getClass();
            ((C140732y) xVar.instance).f382166a = aeVar;
        }
        return (C140732y) xVar.build();
    }
}
