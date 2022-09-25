package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9863c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129901aj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9865g.C129986a;
import com.google.assistant.p3897e.p3921j.p3925d.C51776b;
import com.google.assistant.p3897e.p3921j.p3925d.C51780f;
import com.google.assistant.p3897e.p3921j.p3925d.C51782h;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.c.f */
/* compiled from: PG */
public final class C129950f {

    /* renamed from: a */
    public static final C59071e f356417a = C59071e.m91331h();

    /* renamed from: a */
    public static final String m212137a(C129901aj ajVar, String str) {
        String str2;
        String a = C129986a.m212186a(str);
        C51910dq dqVar = ajVar.f356349b;
        if (dqVar == null) {
            dqVar = C51910dq.f136159t;
        }
        String str3 = dqVar.f136163c;
        C69664n.m101060f(str3, "clientOp.sourceLanguage");
        if (C69664n.m101066l(a, C129986a.m212186a(str3))) {
            C51910dq dqVar2 = ajVar.f356349b;
            if (dqVar2 == null) {
                dqVar2 = C51910dq.f136159t;
            }
            C51776b bVar = dqVar2.f136165e;
            if (bVar == null) {
                bVar = C51776b.f135842e;
            }
            C51780f fVar = bVar.f135845b;
            if (fVar == null) {
                fVar = C51780f.f135862d;
            }
            C51782h hVar = fVar.f135865b;
            if (hVar == null) {
                hVar = C51782h.f135867c;
            }
            str2 = hVar.f135870b;
        } else {
            C51910dq dqVar3 = ajVar.f356349b;
            if (dqVar3 == null) {
                dqVar3 = C51910dq.f136159t;
            }
            String str4 = dqVar3.f136164d;
            C69664n.m101060f(str4, "clientOp.targetLanguage");
            if (C69664n.m101066l(a, C129986a.m212186a(str4))) {
                C51910dq dqVar4 = ajVar.f356349b;
                if (dqVar4 == null) {
                    dqVar4 = C51910dq.f136159t;
                }
                C51776b bVar2 = dqVar4.f136165e;
                if (bVar2 == null) {
                    bVar2 = C51776b.f135842e;
                }
                C51780f fVar2 = bVar2.f135846c;
                if (fVar2 == null) {
                    fVar2 = C51780f.f135862d;
                }
                C51782h hVar2 = fVar2.f135865b;
                if (hVar2 == null) {
                    hVar2 = C51782h.f135867c;
                }
                str2 = hVar2.f135870b;
            } else {
                C59052c cVar = (C59052c) f356417a.mo56225c();
                C51910dq dqVar5 = ajVar.f356349b;
                String str5 = (dqVar5 == null ? C51910dq.f136159t : dqVar5).f136163c;
                if (dqVar5 == null) {
                    dqVar5 = C51910dq.f136159t;
                }
                String str6 = dqVar5.f136164d;
                cVar.mo56379ah(new C59094n(38647));
                cVar.mo56359L("Unrecognized language: %s, sourceLangCode: %s, targetLangCode: %s", str, str5, str6);
                str2 = BuildConfig.FLAVOR;
            }
        }
        C69664n.m101060f(str2, "when (getLanguageSubcode…\n        \"\"\n      }\n    }");
        return str2;
    }
}
