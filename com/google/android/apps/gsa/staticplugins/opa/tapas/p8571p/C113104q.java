package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.assistant.p3781ad.p3787c.p3788a.C48501at;
import com.google.assistant.p3781ad.p3787c.p3788a.C48502au;
import com.google.assistant.p3781ad.p3787c.p3788a.C48521bm;
import com.google.assistant.p3781ad.p3787c.p3788a.C48522bn;
import com.google.assistant.p3781ad.p3787c.p3788a.C48528h;
import com.google.assistant.p3781ad.p3789d.C48580an;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.q */
/* compiled from: PG */
public final class C113104q {

    /* renamed from: a */
    public static final C48522bn f313381a;

    static {
        C48521bm bmVar = (C48521bm) C48522bn.f125342f.createBuilder();
        bmVar.copyOnWrite();
        C48522bn bnVar = (C48522bn) bmVar.instance;
        bnVar.f125344a |= 1;
        bnVar.f125345b = 0;
        bmVar.copyOnWrite();
        C48522bn bnVar2 = (C48522bn) bmVar.instance;
        bnVar2.f125344a |= 2;
        bnVar2.f125346c = 0;
        bmVar.copyOnWrite();
        C48522bn bnVar3 = (C48522bn) bmVar.instance;
        bnVar3.f125344a |= 4;
        bnVar3.f125347d = 0;
        bmVar.copyOnWrite();
        C48522bn bnVar4 = (C48522bn) bmVar.instance;
        bnVar4.f125344a |= 8;
        bnVar4.f125348e = 0;
        f313381a = (C48522bn) bmVar.build();
    }

    /* renamed from: a */
    public static C48522bn m187090a(C48501at atVar, C113101n nVar, C113045at atVar2) {
        String str;
        if (nVar.f313368b.size() == 0) {
            return f313381a;
        }
        C48521bm bmVar = (C48521bm) f313381a.toBuilder();
        Map unmodifiableMap = Collections.unmodifiableMap(nVar.f313370d);
        C48580an b = C48580an.m85241b(((C48502au) atVar.instance).f125301i);
        if (b == null) {
            b = C48580an.UNKNOWN;
        }
        if (b == C48580an.ICON_SHORTCUT || ((C48502au) atVar.instance).f125295c.isEmpty()) {
            str = ((C48502au) atVar.instance).f125294b;
        } else {
            C48502au auVar = (C48502au) atVar.instance;
            str = auVar.f125294b + "," + auVar.f125295c;
        }
        if (unmodifiableMap.containsKey(str)) {
            C113103p pVar = (C113103p) unmodifiableMap.get(str);
            pVar.getClass();
            int i = C113048aw.m187028a(pVar).f313354b;
            bmVar.copyOnWrite();
            C48522bn bnVar = (C48522bn) bmVar.instance;
            bnVar.f125344a |= 1;
            bnVar.f125345b = i;
            Optional d = C113048aw.m187030d(atVar2, pVar);
            if (d.isPresent()) {
                int i2 = ((C113091d) d.get()).f313354b;
                bmVar.copyOnWrite();
                C48522bn bnVar2 = (C48522bn) bmVar.instance;
                bnVar2.f125344a |= 2;
                bnVar2.f125346c = i2;
            }
        }
        if ((((C48502au) atVar.instance).f125293a & 4) != 0) {
            Map unmodifiableMap2 = Collections.unmodifiableMap(nVar.f313376j);
            String str2 = ((C48502au) atVar.instance).f125296d;
            if (unmodifiableMap2.containsKey(str2)) {
                C113103p pVar2 = (C113103p) unmodifiableMap2.get(str2);
                pVar2.getClass();
                int i3 = C113048aw.m187028a(pVar2).f313354b;
                bmVar.copyOnWrite();
                C48522bn bnVar3 = (C48522bn) bmVar.instance;
                bnVar3.f125344a |= 4;
                bnVar3.f125347d = i3;
            }
        }
        C48528h hVar = ((C48502au) atVar.instance).f125299g;
        if (hVar == null) {
            hVar = C48528h.f125358c;
        }
        if ((hVar.f125360a & 1) != 0) {
            C48528h hVar2 = ((C48502au) atVar.instance).f125299g;
            if (hVar2 == null) {
                hVar2 = C48528h.f125358c;
            }
            String str3 = hVar2.f125361b;
            Map unmodifiableMap3 = Collections.unmodifiableMap(nVar.f313377k);
            if (unmodifiableMap3.containsKey(str3)) {
                C113103p pVar3 = (C113103p) unmodifiableMap3.get(str3);
                pVar3.getClass();
                int i4 = C113048aw.m187028a(pVar3).f313354b;
                bmVar.copyOnWrite();
                C48522bn bnVar4 = (C48522bn) bmVar.instance;
                bnVar4.f125344a |= 8;
                bnVar4.f125348e = i4;
            }
        }
        return (C48522bn) bmVar.build();
    }
}
