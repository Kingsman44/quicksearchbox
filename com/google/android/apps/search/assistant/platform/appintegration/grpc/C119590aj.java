package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17918t;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.aj */
/* compiled from: PG */
public final /* synthetic */ class C119590aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119591ak f333301a;

    /* renamed from: b */
    public final /* synthetic */ C17881ak f333302b;

    public /* synthetic */ C119590aj(C119591ak akVar, C17881ak akVar2) {
        this.f333301a = akVar;
        this.f333302b = akVar2;
    }

    public final void run() {
        C119591ak akVar = this.f333301a;
        C17881ak akVar2 = this.f333302b;
        akVar.f333306c.mo104464g();
        boolean z = false;
        if (akVar2.f51239g.size() != 0) {
            akVar.f333309f.clear();
            for (int i = 0; i < akVar2.f51239g.size(); i++) {
                Set set = akVar.f333309f;
                C17918t a = C17918t.m35111a(akVar2.f51239g.mo58914d(i));
                if (a == null) {
                    a = C17918t.UNSPECIFIED;
                }
                set.add(a);
                akVar2.f51239g.mo58914d(i);
            }
        }
        C17914p pVar = (C17914p) C17881ak.f51231h.createBuilder(akVar2);
        if ((akVar2.f51233a & 2) != 0) {
            C17880aj ajVar = akVar2.f51235c;
            if (ajVar == null) {
                ajVar = C17880aj.f51221i;
            }
            if ((ajVar.f51223a & 4) != 0) {
                C17873ac acVar = akVar.f333310g;
                acVar.copyOnWrite();
                C17880aj ajVar2 = (C17880aj) acVar.instance;
                ajVar2.f51226d = null;
                ajVar2.f51223a &= -5;
            }
            if ((ajVar.f51223a & 64) != 0) {
                C17873ac acVar2 = akVar.f333310g;
                acVar2.copyOnWrite();
                C17880aj ajVar3 = (C17880aj) acVar2.instance;
                ajVar3.f51230h = null;
                ajVar3.f51223a &= -65;
            }
            akVar.f333310g.mergeFrom(ajVar);
            C17873ac acVar3 = akVar.f333310g;
            pVar.copyOnWrite();
            C17881ak akVar3 = (C17881ak) pVar.instance;
            C17880aj ajVar4 = (C17880aj) acVar3.build();
            ajVar4.getClass();
            akVar3.f51235c = ajVar4;
            akVar3.f51233a |= 2;
        }
        if ((akVar2.f51233a & 1) != 0) {
            C17873ac acVar4 = akVar.f333310g;
            pVar.copyOnWrite();
            C17881ak akVar4 = (C17881ak) pVar.instance;
            C17880aj ajVar5 = (C17880aj) acVar4.build();
            ajVar5.getClass();
            akVar4.f51235c = ajVar5;
            akVar4.f51233a |= 2;
            C119533b bVar = akVar.f333307d;
            C119532a aVar = C119532a.KARAJAN_V1;
            String str = akVar.f333304a;
            C17920v vVar = akVar2.f51234b;
            if (vVar == null) {
                vVar = C17920v.f51335j;
            }
            if (1 == (vVar.f51337a & 1)) {
                z = true;
            }
            bVar.mo104419b(aVar, str, z);
        } else if (!akVar.f333308e) {
            pVar.copyOnWrite();
            C17881ak akVar5 = (C17881ak) pVar.instance;
            akVar5.f51235c = null;
            akVar5.f51233a &= -3;
        }
        C119603aw awVar = akVar.f333305b;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        C17881ak akVar6 = (C17881ak) pVar.build();
        akVar6.getClass();
        amVar.f51246c = akVar6;
        amVar.f51245b = 3;
        String str2 = akVar.f333304a;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str2.getClass();
        amVar2.f51244a |= 1;
        amVar2.f51247d = str2;
        awVar.mo104452a((C17883am) alVar.build());
    }
}
