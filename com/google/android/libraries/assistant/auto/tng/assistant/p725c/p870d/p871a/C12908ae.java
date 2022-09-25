package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12171c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13078x;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13079y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.common.p903e.p904a.C13236a;
import com.google.android.libraries.assistant.auto.tng.common.p903e.p904a.C13246b;
import com.google.android.libraries.assistant.auto.tng.common.p903e.p908b.C13247a;
import com.google.android.libraries.assistant.auto.tng.common.p916g.p917a.C13264a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16713aa;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16716ad;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16772v;
import com.google.apps.tiktok.concurrent.C46415ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C12908ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12914ak f40177a;

    /* renamed from: b */
    public final /* synthetic */ C12986d f40178b;

    /* renamed from: c */
    public final /* synthetic */ C16772v f40179c;

    public /* synthetic */ C12908ae(C12914ak akVar, C12986d dVar, C16772v vVar) {
        this.f40177a = akVar;
        this.f40178b = dVar;
        this.f40179c = vVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        Object obj2;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C12914ak akVar = this.f40177a;
        C12986d dVar = this.f40178b;
        C16772v vVar = this.f40179c;
        if (((Boolean) obj).booleanValue()) {
            C57987f fVar = akVar.f40190b;
            C13078x xVar = (C13078x) C13079y.f40577f.createBuilder();
            C16713aa aaVar = (C16713aa) C16716ad.f48880c.createBuilder();
            aaVar.copyOnWrite();
            C16716ad adVar = (C16716ad) aaVar.instance;
            adVar.f48883b = 1;
            adVar.f48882a = 1 | adVar.f48882a;
            C16716ad adVar2 = (C16716ad) aaVar.build();
            xVar.copyOnWrite();
            C13079y yVar = (C13079y) xVar.instance;
            adVar2.getClass();
            yVar.f40583e = adVar2;
            yVar.f40579a |= 8;
            fVar.f155056f.mo54591h((C13079y) xVar.build());
            C12940j jVar = akVar.f40201m;
            if (!C12940j.m29184a(dVar) || jVar.f40273b.isEmpty()) {
                return C60866ct.f164955a;
            }
            String string = ((C13264a) jVar.f40273b.get()).f40955a.getString(R.string.tng_no_subscription_tts);
            C12093d dVar2 = jVar.f40272a;
            return C60922j.m93045h(jVar.f40275d.mo23063b(), C47810es.m84966f(new C12939i(jVar, string)), jVar.f40276e);
        } else if (vVar.f49084b) {
            C57987f fVar2 = akVar.f40190b;
            C13078x xVar2 = (C13078x) C13079y.f40577f.createBuilder();
            xVar2.copyOnWrite();
            C13079y yVar2 = (C13079y) xVar2.instance;
            vVar.getClass();
            yVar2.f40582d = vVar;
            yVar2.f40579a |= 4;
            fVar2.f155056f.mo54591h((C13079y) xVar2.build());
            C12935e eVar = akVar.f40199k;
            if (!C12935e.m29179b(dVar) || !vVar.f49084b || !eVar.mo20854c() || eVar.f40258d.isEmpty()) {
                return C60866ct.f164955a;
            }
            if (vVar.f49085c) {
                C12093d dVar3 = eVar.f40256b;
                cxVar2 = ((C13247a) eVar.f40258d.get()).mo20993c();
            } else {
                C12093d dVar4 = eVar.f40256b;
                cxVar2 = ((C13247a) eVar.f40258d.get()).mo20994d();
            }
            if (vVar.f49085c) {
                C60856cj.m92911t(((C13247a) eVar.f40258d.get()).mo20992b(), C47810es.m84974n(new C12933c(eVar)), eVar.f40262h);
            }
            if (eVar.f40260f.isEmpty() || eVar.f40259e.isEmpty() || !eVar.mo20854c()) {
                cxVar3 = C60866ct.f164955a;
            } else {
                C13246b bVar = (C13246b) eVar.f40260f.get();
                if (dVar.f40370d == null) {
                    C12991i iVar = C12991i.f40380k;
                }
                cxVar3 = C47638k.m84751b(bVar.mo20990a(), ((C13236a) eVar.f40259e.get()).mo20989a()).mo51521b(new C12903a(eVar, cxVar2), eVar.f40262h);
            }
            C60856cj.m92911t(cxVar3, C47810es.m84974n(new C12934d()), eVar.f40262h);
            return cxVar2;
        } else {
            C12929az azVar = akVar.f40202n;
            C12991i iVar2 = dVar.f40370d;
            if (iVar2 == null) {
                iVar2 = C12991i.f40380k;
            }
            if (((Boolean) azVar.f40248d.mo17428b()).booleanValue() && !azVar.f40249e) {
                C12989g a = C12989g.m29225a(iVar2.f40385d);
                if (a == null) {
                    a = C12989g.UNKNOWN;
                }
                if (a.equals(C12989g.AUTO_PROJECTED) && iVar2.f40384c) {
                    C62940bt r5 = C62942bv.checkIsLite(C13042d.f40481n);
                    iVar2.mo58887l(r5);
                    if (iVar2.f169962ag.mo58857o(r5.f169971d)) {
                        C62940bt r52 = C62942bv.checkIsLite(C13042d.f40481n);
                        iVar2.mo58887l(r52);
                        Object l = iVar2.f169962ag.mo58854l(r52.f169971d);
                        if (l == null) {
                            obj2 = r52.f169969b;
                        } else {
                            obj2 = r52.mo58889c(l);
                        }
                        if (((C13042d) obj2).f40491i) {
                            C58976aa aaVar2 = C58975e.f156826a;
                            C12154a aVar = azVar.f40246b;
                            C12171c cVar = (C12171c) C12174f.f38872d.createBuilder();
                            C67190ah ahVar = C12929az.f40245a;
                            cVar.copyOnWrite();
                            C12174f fVar3 = (C12174f) cVar.instance;
                            ahVar.getClass();
                            fVar3.f38875b = ahVar;
                            fVar3.f38874a |= 1;
                            cVar.copyOnWrite();
                            C12174f fVar4 = (C12174f) cVar.instance;
                            fVar4.f38876c = 1;
                            fVar4.f38874a |= 2;
                            cxVar = C60922j.m93044g(aVar.mo20461b((C12174f) cVar.build(), C70967n.SUGGESTION).mo20381a(), C47810es.m84963c(new C12928ay(azVar)), azVar.f40247c);
                            return C46415ab.m82768b(cxVar, C47810es.m84965e(new C12907ad(akVar, dVar)), akVar.f40195g);
                        }
                    }
                }
            }
            cxVar = C60866ct.f164955a;
            return C46415ab.m82768b(cxVar, C47810es.m84965e(new C12907ad(akVar, dVar)), akVar.f40195g);
        }
    }
}
