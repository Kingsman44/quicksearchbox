package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88156rf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88157rg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ay */
/* compiled from: PG */
public final class C91974ay {
    /* renamed from: a */
    public static final ClientEventData m150930a(C7891nu nuVar) {
        C88489j jVar = new C88489j(C87739bu.OPT_IN_REQUEST);
        C62940bt btVar = C88156rf.f238317a;
        C88157rg rgVar = (C88157rg) C88158rh.f238318f.createBuilder();
        rgVar.copyOnWrite();
        C88158rh rhVar = (C88158rh) rgVar.instance;
        rhVar.f238321b = nuVar.f27730O;
        rhVar.f238320a |= 1;
        rgVar.copyOnWrite();
        C88158rh rhVar2 = (C88158rh) rgVar.instance;
        rhVar2.f238320a |= 2;
        rhVar2.f238322c = true;
        rgVar.copyOnWrite();
        C88158rh rhVar3 = (C88158rh) rgVar.instance;
        rhVar3.f238320a |= 8;
        rhVar3.f238324e = false;
        jVar.mo82014b(btVar, (C88158rh) rgVar.build());
        return jVar.mo82013a();
    }
}
