package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.assistant.p3741aa.C48174i;
import com.google.assistant.p3741aa.C48175j;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.o */
/* compiled from: PG */
public final /* synthetic */ class C124229o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343015a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f343016b;

    public /* synthetic */ C124229o(C124234t tVar, C58485gu guVar) {
        this.f343015a = tVar;
        this.f343016b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C32806ba baVar;
        C124234t tVar = this.f343015a;
        C58485gu guVar = this.f343016b;
        List list = (List) obj;
        C48174i iVar = (C48174i) C48175j.f124656b.createBuilder();
        C58724pq pqVar = (C58724pq) guVar;
        C58838bb.m90883r(pqVar.f156474d == list.size());
        for (int i = 0; i < pqVar.f156474d; i++) {
            Optional optional = (Optional) list.get(i);
            if (optional.isPresent()) {
                C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                String str = (String) guVar.get(i);
                kbVar.copyOnWrite();
                C52232kc kcVar = (C52232kc) kbVar.instance;
                str.getClass();
                kcVar.f137064a |= 1;
                kcVar.f137065b = str;
                C32801aw awVar = (C32801aw) optional.get();
                if (awVar.f87980a == 1) {
                    baVar = (C32806ba) awVar.f87981b;
                } else {
                    baVar = C32806ba.f87988c;
                }
                C52230ka kaVar = baVar.f87991b;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                kbVar.copyOnWrite();
                C52232kc kcVar2 = (C52232kc) kbVar.instance;
                kaVar.getClass();
                kcVar2.f137066c = kaVar;
                kcVar2.f137064a |= 2;
                iVar.copyOnWrite();
                C48175j jVar = (C48175j) iVar.instance;
                C52232kc kcVar3 = (C52232kc) kbVar.build();
                kcVar3.getClass();
                C62971cq cqVar = jVar.f124658a;
                if (!cqVar.mo58948c()) {
                    jVar.f124658a = C62942bv.mutableCopy(cqVar);
                }
                jVar.f124658a.add(kcVar3);
            }
        }
        return tVar.f343024c.mo106364e((C48175j) iVar.build());
    }
}
