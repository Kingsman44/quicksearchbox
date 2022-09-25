package com.google.android.apps.gsa.staticplugins.p7714cv.p7715a;

import android.text.TextUtils;
import com.google.speech.recognizer.p5233a.C67432aa;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67439ah;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67467o;
import com.google.speech.recognizer.p5233a.C67468p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.a.a */
/* compiled from: PG */
public final class C98708a {

    /* renamed from: a */
    private final List f275704a = new ArrayList();

    /* renamed from: a */
    public final C67438ag mo91273a() {
        if (this.f275704a.isEmpty()) {
            return null;
        }
        int i = 0;
        if (this.f275704a.size() == 1) {
            C67438ag agVar = (C67438ag) this.f275704a.get(0);
            if ((agVar.f183258a & 4) == 0) {
                return agVar;
            }
            C67432aa aaVar = (C67432aa) agVar.toBuilder();
            C67442ak akVar = agVar.f183261d;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            aaVar.copyOnWrite();
            C67438ag agVar2 = (C67438ag) aaVar.instance;
            akVar.getClass();
            agVar2.f183263f = akVar;
            agVar2.f183258a |= 16;
            return (C67438ag) aaVar.build();
        }
        StringBuilder sb = new StringBuilder();
        float f = Float.MAX_VALUE;
        for (C67438ag agVar3 : this.f275704a) {
            if ((agVar3.f183258a & 4) != 0) {
                C67442ak akVar2 = agVar3.f183261d;
                if (akVar2 == null) {
                    akVar2 = C67442ak.f183276i;
                }
                if (akVar2.f183281d.size() > 0) {
                    C67468p pVar = (C67468p) akVar2.f183281d.get(0);
                    sb.append(pVar.f183367b);
                    f = Math.min(f, pVar.f183368c);
                }
            }
        }
        List list = this.f275704a;
        C67438ag agVar4 = (C67438ag) list.get(list.size() - 1);
        C67432aa aaVar2 = (C67432aa) agVar4.toBuilder();
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(sb2)) {
            C67439ah ahVar = (C67439ah) C67442ak.f183276i.createBuilder();
            if ((agVar4.f183258a & 4) != 0) {
                C67442ak akVar3 = agVar4.f183261d;
                if (akVar3 == null) {
                    akVar3 = C67442ak.f183276i;
                }
                long j = akVar3.f183280c;
                ahVar.copyOnWrite();
                C67442ak akVar4 = (C67442ak) ahVar.instance;
                akVar4.f183278a |= 4;
                akVar4.f183280c = j;
                C67442ak akVar5 = agVar4.f183261d;
                if (akVar5 == null) {
                    akVar5 = C67442ak.f183276i;
                }
                if (akVar5.f183281d.size() > 0) {
                    C67442ak akVar6 = agVar4.f183261d;
                    if (akVar6 == null) {
                        akVar6 = C67442ak.f183276i;
                    }
                    i = ((C67468p) akVar6.f183281d.get(0)).f183370e;
                }
            }
            C67467o oVar = (C67467o) C67468p.f183364g.createBuilder();
            oVar.copyOnWrite();
            C67468p pVar2 = (C67468p) oVar.instance;
            pVar2.f183366a |= 8;
            pVar2.f183368c = f;
            oVar.copyOnWrite();
            C67468p pVar3 = (C67468p) oVar.instance;
            pVar3.f183366a = 1 | pVar3.f183366a;
            pVar3.f183367b = sb2;
            oVar.copyOnWrite();
            C67468p pVar4 = (C67468p) oVar.instance;
            pVar4.f183366a |= 8192;
            pVar4.f183370e = i;
            ahVar.mo59869b((C67468p) oVar.build());
            aaVar2.copyOnWrite();
            C67438ag agVar5 = (C67438ag) aaVar2.instance;
            C67442ak akVar7 = (C67442ak) ahVar.build();
            akVar7.getClass();
            agVar5.f183263f = akVar7;
            agVar5.f183258a |= 16;
        }
        return (C67438ag) aaVar2.build();
    }

    /* renamed from: b */
    public final void mo91274b(C67438ag agVar) {
        this.f275704a.add(agVar);
    }
}
