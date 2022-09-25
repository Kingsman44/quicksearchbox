package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95851b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60060ji;
import com.google.common.p4552o.C60061jj;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.e */
/* compiled from: PG */
public final /* synthetic */ class C95256e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ int f266504a;

    /* renamed from: b */
    public final /* synthetic */ Map f266505b;

    /* renamed from: c */
    public final /* synthetic */ C95260i f266506c;

    public /* synthetic */ C95256e(int i, Map map, C95260i iVar) {
        this.f266504a = i;
        this.f266505b = map;
        this.f266506c = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i = this.f266504a;
        Map map = this.f266505b;
        C95260i iVar = this.f266506c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            map.put(Integer.valueOf(i), (Integer) optional.get());
            if (i == 1) {
                int intValue = ((Integer) optional.get()).intValue();
                C58976aa aaVar = C58975e.f156826a;
                C60060ji jiVar = iVar.f266542d;
                jiVar.copyOnWrite();
                C60061jj jjVar = (C60061jj) jiVar.instance;
                C60061jj jjVar2 = C60061jj.f162338j;
                jjVar.f162340a |= 1;
                jjVar.f162341b = true;
                C60060ji jiVar2 = iVar.f266542d;
                jiVar2.copyOnWrite();
                C60061jj jjVar3 = (C60061jj) jiVar2.instance;
                jjVar3.f162340a = 2 | jjVar3.f162340a;
                jjVar3.f162342c = intValue;
            } else if (i == 2) {
                int intValue2 = ((Integer) optional.get()).intValue();
                C58976aa aaVar2 = C58975e.f156826a;
                C60060ji jiVar3 = iVar.f266542d;
                jiVar3.copyOnWrite();
                C60061jj jjVar4 = (C60061jj) jiVar3.instance;
                C60061jj jjVar5 = C60061jj.f162338j;
                jjVar4.f162340a |= 4;
                jjVar4.f162343d = true;
                C60060ji jiVar4 = iVar.f266542d;
                jiVar4.copyOnWrite();
                C60061jj jjVar6 = (C60061jj) jiVar4.instance;
                jjVar6.f162340a |= 8;
                jjVar6.f162344e = intValue2;
            }
        }
        C59104x b = C95260i.f266539a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AudioPathTestLogger");
        ((C59052c) ((C59052c) b).mo56372aa(14791)).mo56386p("endSession");
        if (iVar.f266541c == null) {
            C59104x c = C95260i.f266539a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AudioPathTestLogger");
            ((C59052c) ((C59052c) c).mo56372aa(14792)).mo56386p("Session ended already");
        } else {
            C95851b bVar = iVar.f266540b;
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            C60060ji jiVar5 = iVar.f266542d;
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60061jj jjVar7 = (C60061jj) jiVar5.build();
            jjVar7.getClass();
            nmVar.f163165s = jjVar7;
            nmVar.f163148b |= 1;
            bVar.mo89822a(nkVar);
            iVar.f266541c = null;
        }
        return map;
    }
}
