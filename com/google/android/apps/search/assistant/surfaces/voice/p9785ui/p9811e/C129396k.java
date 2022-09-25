package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9811e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127117i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129337y;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129297a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129300d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129302f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129304h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129308l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9811e.C129389e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e;
import java.util.Iterator;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.e.k */
/* compiled from: PG */
final /* synthetic */ class C129396k extends C69663m implements C69626l {
    public C129396k(Object obj) {
        super(1, obj, C129389e.class, "onSuggestionClick", "onSuggestionClick(Lcom/google/protos/com/google/android/apps/search/assistant/surfaces/voice/shared/ui/chips/proto/AssistantChips$ChipGroup$Chip;)V", 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Object obj2;
        C60870cx cxVar;
        C129300d dVar;
        C65496e eVar = (C65496e) obj;
        C69664n.m101061g(eVar, "p0");
        C129389e eVar2 = (C129389e) this.f186034c;
        C69664n.m101061g(eVar, "chip");
        C46439e eVar3 = eVar2.f355309c;
        Iterator it = eVar2.f355318l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C129308l lVar = ((C129304h) obj2).f355142a;
            if (lVar == null) {
                lVar = C129308l.f355150g;
            }
            if (C69664n.m101066l(lVar.f355153b, eVar.f178053b)) {
                break;
            }
        }
        C129304h hVar = (C129304h) obj2;
        int i = 0;
        if (hVar != null) {
            C129302f fVar = hVar.f355143b;
            if (fVar == null) {
                fVar = C129302f.f355133f;
            }
            if (fVar != null) {
                i = C129297a.m211112a(fVar.f355135a);
            }
        }
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                C127118j jVar = eVar2.f355310d;
                C127454b bVar = C127454b.SUGGESTION_CHIP;
                amm amm = (amm) C51682amp.f135384d.createBuilder();
                C129302f fVar2 = hVar.f355143b;
                if (fVar2 == null) {
                    fVar2 = C129302f.f355133f;
                }
                String str = fVar2.f355135a == 2 ? (String) fVar2.f355136b : BuildConfig.FLAVOR;
                amm.copyOnWrite();
                C51682amp amp = (C51682amp) amm.instance;
                str.getClass();
                amp.f135386a = 1 | amp.f135386a;
                amp.f135387b = str;
                amo amo = amo.TRUSTED;
                amm.copyOnWrite();
                C51682amp amp2 = (C51682amp) amm.instance;
                amp2.f135388c = amo.f135383d;
                amp2.f135386a |= 2;
                cxVar = jVar.mo107931g(C127407d.m208363c(bVar, (C51682amp) amm.build()));
            } else if (i2 == 1) {
                C129302f fVar3 = hVar.f355143b;
                if (fVar3 == null) {
                    fVar3 = C129302f.f355133f;
                }
                if (fVar3.f355135a == 3) {
                    dVar = (C129300d) fVar3.f355136b;
                } else {
                    dVar = C129300d.f355128d;
                }
                cxVar = C129337y.m211156b(dVar, eVar2.f355311e);
            }
            C127117i.m207897a(eVar2.f355310d);
            C69664n.m101060f(cxVar, "future");
            eVar3.mo50445g(C46438d.m82810b(cxVar), new C46436b("onSuggestionClick"), C129389e.C129390a.f355319a);
            return C69788q.f186170a;
        }
        C59052c cVar = (C59052c) C129389e.f355307a.mo56226d();
        cVar.mo56379ah(new C59094n(38297));
        cVar.mo56386p("Suggestion does not have an action set.");
        cxVar = C60866ct.f164955a;
        C127117i.m207897a(eVar2.f355310d);
        C69664n.m101060f(cxVar, "future");
        eVar3.mo50445g(C46438d.m82810b(cxVar), new C46436b("onSuggestionClick"), C129389e.C129390a.f355319a);
        return C69788q.f186170a;
    }
}
