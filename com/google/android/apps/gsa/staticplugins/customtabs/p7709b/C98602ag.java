package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.apps.gsa.h.h.c;
import com.google.android.apps.gsa.shared.exploreoncontent.ExplorePivotItem;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60852cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54084ah;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54103b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C98602ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98610ao f275388a;

    /* renamed from: b */
    public final /* synthetic */ c f275389b;

    public /* synthetic */ C98602ag(C98610ao aoVar, c cVar) {
        this.f275388a = aoVar;
        this.f275389b = cVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C28293k kVar;
        C58833ax axVar;
        C60870cx cxVar2;
        C98610ao aoVar = this.f275388a;
        c cVar = this.f275389b;
        C54120s sVar = (C54120s) obj;
        C98617av avVar = aoVar.f275409h;
        C98642y yVar = aoVar.f275408g;
        C54098av avVar2 = sVar.f142012c;
        if (avVar2 == null) {
            avVar2 = C54098av.f141935j;
        }
        if (avVar2.f141944h) {
            C54098av avVar3 = sVar.f142012c;
            if (((avVar3 == null ? C54098av.f141935j : avVar3).f141937a & 2) != 0) {
                if (avVar3 == null) {
                    avVar3 = C54098av.f141935j;
                }
                C54103b bVar = avVar3.f141940d;
                if (bVar == null) {
                    bVar = C54103b.f141956g;
                }
                if (bVar.f141959b * 100.0f > ((float) avVar.f275450b.mo79743a(C90110fh.f250581F))) {
                    long a = avVar.f275450b.mo79743a(C90110fh.f250579D);
                    if (C98617av.m163367e(a)) {
                        C54098av avVar4 = sVar.f142012c;
                        if (avVar4 == null) {
                            avVar4 = C54098av.f141935j;
                        }
                        if (avVar4.f141938b.size() == 0) {
                            C58976aa aaVar = C58975e.f156826a;
                            cxVar = C60856cj.m92900i(C58836b.f156633a);
                        } else {
                            C54098av avVar5 = sVar.f142012c;
                            if (avVar5 == null) {
                                avVar5 = C54098av.f141935j;
                            }
                            try {
                                axVar = C58833ax.m90834k(new ExplorePivotItem((C54084ah) avVar5.f141938b.get(0)));
                            } catch (RuntimeException e) {
                                C59104x c = ExplorePivotItem.f242884a.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "ExplorePivotItem");
                                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10580)).mo56386p("Invalid PivotItem");
                                axVar = C58836b.f156633a;
                            }
                            if (!axVar.mo56113h()) {
                                cxVar = C60856cj.m92900i(C58836b.f156633a);
                            } else {
                                ExplorePivotItem explorePivotItem = (ExplorePivotItem) axVar.mo56107c();
                                C60870cx c2 = avVar.mo91227c(explorePivotItem.f242886c);
                                if (C98617av.m163368f(avVar.f275450b.mo79743a(C90110fh.f250579D))) {
                                    cxVar2 = avVar.mo91227c(explorePivotItem.f242887d);
                                } else {
                                    cxVar2 = C60856cj.m92900i(C58836b.f156633a);
                                }
                                C60870cx cxVar3 = cxVar2;
                                C60852cf b = C60856cj.m92893b(c2, cxVar3);
                                C98615at atVar = r3;
                                C98615at atVar2 = new C98615at(avVar, sVar, yVar, explorePivotItem, c2, cxVar3);
                                cxVar = b.mo57334a(atVar, C60826bg.f164896a);
                            }
                        }
                    } else {
                        cxVar = C60856cj.m92900i(avVar.mo91226b(sVar, yVar));
                    }
                    if (C98617av.m163369g(a)) {
                        C28292j a2 = C98617av.m163365a();
                        C28292j jVar = new C28292j(79167);
                        jVar.mo33795i(5);
                        jVar.mo33794h(1);
                        kVar = C28293k.m52908e(a2, C28293k.m52908e(jVar, new C28293k[0]));
                    } else {
                        kVar = C28293k.m52908e(C98617av.m163365a(), new C28293k[0]);
                    }
                    return C60922j.m93044g(cxVar, new C98613ar(avVar, sVar, kVar, cVar), C60826bg.f164896a);
                }
            }
        }
        return C60866ct.f164955a;
    }
}
