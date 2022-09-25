package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14203an;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14207ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14210au;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14526mm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14528mo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14532ms;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14621q;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14628r;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.d */
/* compiled from: PG */
public final /* synthetic */ class C14959d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14749d f44922a;

    /* renamed from: b */
    public final /* synthetic */ C14621q f44923b;

    public /* synthetic */ C14959d(C14749d dVar, C14621q qVar) {
        this.f44922a = dVar;
        this.f44923b = qVar;
    }

    public final void accept(Object obj) {
        C14532ms msVar;
        C14210au auVar;
        C14203an anVar;
        C14210au auVar2;
        C14207ar arVar;
        C14749d dVar = this.f44922a;
        C14621q qVar = this.f44923b;
        C14221be beVar = (C14221be) obj;
        C59071e eVar = C14962g.f44926a;
        if (beVar.f43043a == 11) {
            msVar = (C14532ms) beVar.f43044b;
        } else {
            msVar = C14532ms.f43919b;
        }
        for (C14528mo moVar : msVar.f43921a) {
            Optional a = dVar.mo21714a(C14984b.m31507e(moVar.f43911a));
            if (a.isPresent()) {
                C14526mm mmVar = (C14526mm) C14528mo.f43909f.createBuilder(moVar);
                C14221be beVar2 = (C14221be) a.get();
                if (beVar2.f43043a == 15) {
                    auVar2 = (C14210au) beVar2.f43044b;
                } else {
                    auVar2 = C14210au.f42993c;
                }
                if (auVar2.f42995a == 2) {
                    arVar = (C14207ar) auVar2.f42996b;
                } else {
                    arVar = C14207ar.f42988b;
                }
                C14361gj gjVar = arVar.f42990a;
                if (gjVar == null) {
                    gjVar = C14361gj.f43456e;
                }
                mmVar.copyOnWrite();
                gjVar.getClass();
                ((C14528mo) mmVar.instance).f43915e = gjVar;
                moVar = (C14528mo) mmVar.build();
            }
            if (moVar.f43912b.isEmpty()) {
                Optional a2 = dVar.mo21714a(C14984b.m31505c(moVar.f43911a));
                if (a2.isPresent()) {
                    C14526mm mmVar2 = (C14526mm) C14528mo.f43909f.createBuilder(moVar);
                    C14221be beVar3 = (C14221be) a2.get();
                    if (beVar3.f43043a == 15) {
                        auVar = (C14210au) beVar3.f43044b;
                    } else {
                        auVar = C14210au.f42993c;
                    }
                    if (auVar.f42995a == 1) {
                        anVar = (C14203an) auVar.f42996b;
                    } else {
                        anVar = C14203an.f42982b;
                    }
                    String str = anVar.f42984a;
                    mmVar2.copyOnWrite();
                    str.getClass();
                    ((C14528mo) mmVar2.instance).f43912b = str;
                    moVar = (C14528mo) mmVar2.build();
                }
            }
            qVar.copyOnWrite();
            C14628r rVar = (C14628r) qVar.instance;
            C14628r rVar2 = C14628r.f44209d;
            moVar.getClass();
            C62971cq cqVar = rVar.f44212b;
            if (!cqVar.mo58948c()) {
                rVar.f44212b = C62942bv.mutableCopy(cqVar);
            }
            rVar.f44212b.add(moVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
