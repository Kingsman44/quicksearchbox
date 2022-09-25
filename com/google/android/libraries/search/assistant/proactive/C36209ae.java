package com.google.android.libraries.search.assistant.proactive;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49097gi;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.proactive.ae */
/* compiled from: PG */
public final /* synthetic */ class C36209ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36219ao f94596a;

    /* renamed from: b */
    public final /* synthetic */ aas f94597b;

    /* renamed from: c */
    public final /* synthetic */ int f94598c;

    public /* synthetic */ C36209ae(C36219ao aoVar, aas aas, int i) {
        this.f94596a = aoVar;
        this.f94597b = aas;
        this.f94598c = i;
    }

    public final C60870cx apply(Object obj) {
        Object obj2;
        Object obj3;
        List<C49097gi> list;
        List<C49097gi> list2;
        C36219ao aoVar = this.f94596a;
        aas aas = this.f94597b;
        int i = this.f94598c;
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = C36219ao.f94617a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationThrottlingManager");
            ((C59052c) ((C59052c) d).mo56372aa(52238)).mo56386p("Unexpected initialization problem happened.");
            return C60856cj.m92900i(new C36207ac(1, 0));
        }
        C62940bt r13 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r13);
        Object l = aas.f169962ag.mo58854l(r13.f169971d);
        if (l == null) {
            obj2 = r13.f169969b;
        } else {
            obj2 = r13.mo58889c(l);
        }
        abc abc = (abc) obj2;
        int i2 = abc.f134700g;
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        int i3 = aap.f134655d;
        ArrayList arrayList = new ArrayList();
        Map map = aoVar.f94623g;
        Integer valueOf = Integer.valueOf(i2);
        if (map.containsKey(valueOf) || aoVar.f94624h.containsKey(Integer.valueOf(i3))) {
            C36218an anVar = (C36218an) aoVar.f94623g.get(valueOf);
            if (anVar != null) {
                for (C49097gi giVar : anVar.f94615b) {
                    if (aoVar.mo40027j(abc, giVar) && !giVar.f126981j.contains(Integer.valueOf(i3))) {
                        arrayList.add(giVar);
                    }
                }
                Map map2 = anVar.f94616c;
                Integer valueOf2 = Integer.valueOf(i3);
                if (map2.containsKey(valueOf2) && (list2 = (List) anVar.f94616c.get(valueOf2)) != null) {
                    for (C49097gi giVar2 : list2) {
                        if (aoVar.mo40027j(abc, giVar2)) {
                            arrayList.add(giVar2);
                        }
                    }
                }
            }
            C36218an anVar2 = (C36218an) aoVar.f94624h.get(Integer.valueOf(i3));
            if (anVar2 != null) {
                for (C49097gi giVar3 : anVar2.f94615b) {
                    if (aoVar.mo40027j(abc, giVar3) && !giVar3.f126981j.contains(Integer.valueOf(i3))) {
                        arrayList.add(giVar3);
                    }
                }
                Map map3 = anVar2.f94616c;
                Integer valueOf3 = Integer.valueOf(i3);
                if (map3.containsKey(valueOf3) && (list = (List) anVar2.f94616c.get(valueOf3)) != null) {
                    for (C49097gi giVar4 : list) {
                        if (aoVar.mo40027j(abc, giVar4)) {
                            arrayList.add(giVar4);
                        }
                    }
                }
            }
            Collections.sort(arrayList, C36212ah.f94601a);
        }
        if (arrayList.isEmpty()) {
            return C60856cj.m92900i(new C36207ac(1, 0));
        }
        C62940bt r132 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r132);
        Object l2 = aas.f169962ag.mo58854l(r132.f169971d);
        if (l2 == null) {
            obj3 = r132.f169969b;
        } else {
            obj3 = r132.mo58889c(l2);
        }
        if (!((abc) obj3).f134703j && C36206ab.m64610f(aoVar.f94619c, i)) {
            return C60856cj.m92900i(new C36207ac(1, 0));
        }
        C60870cx a = aoVar.f94621e.mo40095a();
        C36214aj ajVar = new C36214aj(aoVar, aas, arrayList);
        return C60922j.m93044g(a, C47810es.m84963c(ajVar), aoVar.f94622f);
    }
}
