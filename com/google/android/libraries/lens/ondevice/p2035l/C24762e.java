package com.google.android.libraries.lens.ondevice.p2035l;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2024d.C24423q;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2034k.C24650eg;
import com.google.android.libraries.lens.ondevice.p2034k.C24651eh;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.lens.p4701g.C62331d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.ondevice.l.e */
/* compiled from: PG */
public final class C24762e {

    /* renamed from: a */
    public static final C58974d f67658a = C58974d.m91135i("PrimitiveLoader");

    /* renamed from: b */
    final Map f67659b = new HashMap();

    /* renamed from: c */
    public final Context f67660c;

    /* renamed from: d */
    public final C24530h f67661d;

    /* renamed from: e */
    private final C24651eh f67662e;

    /* renamed from: f */
    private final C60887da f67663f;

    public C24762e(Context context, C24651eh ehVar, C24530h hVar, C60887da daVar) {
        this.f67660c = context;
        this.f67662e = ehVar;
        this.f67661d = hVar;
        this.f67663f = daVar;
    }

    /* renamed from: f */
    private final C60870cx m45916f(String str, C24650eg egVar, C24803n nVar, LodeResourceHolder lodeResourceHolder, C24795f fVar) {
        C60870cx b = this.f67663f.mo19399b(new C24760c(this, str, egVar, lodeResourceHolder, nVar, fVar));
        this.f67659b.put(str, new C24758a(egVar, b));
        return b;
    }

    /* renamed from: a */
    public final C58495hd mo29997a(C58528ij ijVar) {
        HashMap hashMap = new HashMap();
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            C24650eg a = this.f67662e.mo29977a(str);
            a.getClass();
            hashMap.put(str, a);
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: b */
    public final C60870cx mo29998b(Set set, C58495hd hdVar, LodeResourceHolder lodeResourceHolder, C24795f fVar) {
        ((C58970a) ((C58970a) f67658a.mo56224b()).mo56372aa(48857)).mo56389s("All known primitives: %s", new String[]{"BarcodeEngine", "DetectionReconciliationEngine", "EmbeddingEngine", "InpaintingEngine", "LineBoxFilteringPrimitive", "OcrDetectionEngine", "OcrEngine", "OcrParagraphingPrimitive", "OcrRecognitionEngine", "PageLayoutMutatorDeepParagraphs", "PageLayoutMutatorLayoutAnalysis", "PageLayoutMutatorLineDetection", "PageLayoutMutatorLineRecognition", "PageLayoutMutatorScriptDetection", "PageLayoutToTranslateRequestConverter", "ParticleExtractorEngine", "RegionDetectionEngine", "SalientRegionDetectionEngine", "ScriptLanguageStatsPrimitive", "SensitivityClassificationEngine", "ServerQueryPrimitive", "ServerTranslateEngine", "ShoppingClassificationEngine", "ShoppingIntentDetectionConverter", "TextPipelineEngine", "TextShoppingFilterEngine", "TranslateEngine"});
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C24761d dVar = (C24761d) this.f67659b.get(str);
            C24803n nVar = (C24803n) hdVar.getOrDefault(str, C24803n.f67770c);
            if (dVar == null) {
                C24650eg a = this.f67662e.mo29977a(str);
                if (a == null) {
                    return C60856cj.m92899h(new IllegalStateException(String.format("Unknown primitive %s", new Object[]{str})));
                }
                arrayList.add(m45916f(str, a, nVar, lodeResourceHolder, fVar));
            } else {
                C24650eg a2 = dVar.mo29990a();
                C60870cx b = dVar.mo29991b();
                if (b == null) {
                    return C60856cj.m92899h(new IllegalStateException(String.format("Primitive %s is tracked but has no loading future", new Object[]{str})));
                } else if (!a2.mo29952d(fVar)) {
                    arrayList.add(b);
                } else if (!b.isDone()) {
                    return C60856cj.m92899h(new IllegalStateException("Cannot support simultaneous reloads"));
                } else {
                    arrayList.add(m45916f(str, a2, nVar, lodeResourceHolder, fVar));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return C47638k.m84752c(arrayList).mo51520a(C24759b.f67651a, C60826bg.f164896a);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final List mo29999c(C62331d dVar) {
        return C58485gu.m89842j(mo29997a(C24423q.m45484a(dVar).mo29872a()).values());
    }

    /* renamed from: d */
    public final void mo30000d() {
        for (C24761d dVar : this.f67659b.values()) {
            C60870cx b = dVar.mo29991b();
            if (b != null && !b.isDone()) {
                b.cancel(false);
            }
            dVar.mo29990a().mo29951c();
        }
        this.f67659b.clear();
    }

    /* renamed from: e */
    public final void mo30001e(String str, int i) {
        C24530h hVar = this.f67661d;
        C24805p pVar = C24805p.PRIMITIVE_LOAD_ERROR;
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        str.getClass();
        sVar.f67806a |= 1;
        sVar.f67807b = str;
        rVar.copyOnWrite();
        C24808s sVar2 = (C24808s) rVar.instance;
        sVar2.f67808c = i - 1;
        sVar2.f67806a |= 2;
        hVar.mo29947f(pVar, (C24808s) rVar.build());
    }
}
