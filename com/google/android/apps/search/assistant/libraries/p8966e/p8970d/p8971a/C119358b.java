package com.google.android.apps.search.assistant.libraries.p8966e.p8970d.p8971a;

import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17478an;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17479ao;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17482ar;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17497bf;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17499bh;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1448d.C17587a;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3929l.p3930a.C52795w;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5205f.p5206a.C66501b;
import com.google.speech.p5205f.p5206a.C66502c;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5226l.p5227a.C67250b;
import com.google.speech.p5230n.p5232b.C67402ar;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.d.a.b */
/* compiled from: PG */
public final class C119358b {

    /* renamed from: a */
    public static final C119358b f332780a = new C119358b();

    private C119358b() {
    }

    /* renamed from: a */
    public final C17360b mo104304a(C71422aw awVar, C17362b bVar, C17508k kVar, C52230ka kaVar) {
        C17499bh bhVar;
        C17484at atVar;
        Object obj;
        C67402ar arVar;
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(bVar, "ttsClientFactory");
        C69664n.m101061g(kVar, "clientInfo");
        C69664n.m101061g(kaVar, "structuredTtsProtobuf");
        C17361a a = bVar.mo23309a(kVar);
        String str = kaVar.f137060b;
        int hashCode = str.hashCode();
        if (hashCode != -1384193013) {
            if (hashCode == -668249787 && str.equals("com.google.android.libraries.assistant.apa.tts.proto.TtsRequest")) {
                bhVar = (C17499bh) C62942bv.parseFrom((C62942bv) C17499bh.f50509e, kaVar.f137061c, C62921ba.m95368a());
                C69664n.m101060f(bhVar, "parseFrom(\n          str…ratedRegistry()\n        )");
            }
            throw new C119357a("Wrong protobufType in SpeechOutputArgs.structuredTts: ".concat(String.valueOf(kaVar.f137060b)));
        }
        if (str.equals("speech.s3.TtsServiceRequest")) {
            C67190ah ahVar = (C67190ah) C62942bv.parseFrom((C62942bv) C67190ah.f182619q, kaVar.f137061c, C62921ba.m95368a());
            C69664n.m101060f(ahVar, "parseFrom(\n            s…tedRegistry()\n          )");
            C17497bf bfVar = (C17497bf) C17499bh.f50509e.createBuilder();
            bfVar.copyOnWrite();
            C17499bh bhVar2 = (C17499bh) bfVar.instance;
            bhVar2.f50511a |= 8;
            bhVar2.f50514d = true;
            C17478an anVar = (C17478an) C17479ao.f50468d.createBuilder();
            C17482ar arVar2 = (C17482ar) C17485au.f50481h.createBuilder();
            int i = ahVar.f182622a;
            if ((i & 1) == 0 && (i & 2) == 0) {
                C67250b bVar2 = ahVar.f182627f;
                if (bVar2 == null) {
                    bVar2 = C67250b.f182809a;
                }
                C62940bt r3 = C62942bv.checkIsLite(C66502c.f180870a);
                bVar2.mo58887l(r3);
                Object l = bVar2.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj = r3.f169969b;
                } else {
                    obj = r3.mo58889c(l);
                }
                C66501b bVar3 = (C66501b) obj;
                if (bVar3.f180867a == 4) {
                    arVar = (C67402ar) bVar3.f180868b;
                } else {
                    arVar = C67402ar.f183192d;
                }
                if (!C17587a.m34878a(arVar)) {
                    atVar = C17484at.SERVER;
                    arVar2.copyOnWrite();
                    C17485au auVar = (C17485au) arVar2.instance;
                    auVar.f50486d = atVar.f50480d;
                    auVar.f50483a |= 8;
                    arVar2.copyOnWrite();
                    C17485au auVar2 = (C17485au) arVar2.instance;
                    ahVar.getClass();
                    auVar2.f50485c = ahVar;
                    auVar2.f50484b = 3;
                    C52795w wVar = (C52795w) C52796x.f138517c.createBuilder();
                    wVar.mo53910a(ahVar.f182632k);
                    arVar2.copyOnWrite();
                    C17485au auVar3 = (C17485au) arVar2.instance;
                    C52796x xVar = (C52796x) wVar.build();
                    xVar.getClass();
                    auVar3.f50487e = xVar;
                    auVar3.f50483a |= 16;
                    anVar.copyOnWrite();
                    C17479ao aoVar = (C17479ao) anVar.instance;
                    C17485au auVar4 = (C17485au) arVar2.build();
                    auVar4.getClass();
                    aoVar.f50471b = auVar4;
                    aoVar.f50470a = 1 | aoVar.f50470a;
                    bfVar.copyOnWrite();
                    C17499bh bhVar3 = (C17499bh) bfVar.instance;
                    C17479ao aoVar2 = (C17479ao) anVar.build();
                    aoVar2.getClass();
                    bhVar3.f50513c = aoVar2;
                    bhVar3.f50512b = 3;
                    C62942bv build = bfVar.build();
                    C69664n.m101060f(build, "newBuilder()\n      .setD… )\n      )\n      .build()");
                    bhVar = (C17499bh) build;
                }
            }
            atVar = C17484at.CLIENT;
            arVar2.copyOnWrite();
            C17485au auVar5 = (C17485au) arVar2.instance;
            auVar5.f50486d = atVar.f50480d;
            auVar5.f50483a |= 8;
            arVar2.copyOnWrite();
            C17485au auVar22 = (C17485au) arVar2.instance;
            ahVar.getClass();
            auVar22.f50485c = ahVar;
            auVar22.f50484b = 3;
            C52795w wVar2 = (C52795w) C52796x.f138517c.createBuilder();
            wVar2.mo53910a(ahVar.f182632k);
            arVar2.copyOnWrite();
            C17485au auVar32 = (C17485au) arVar2.instance;
            C52796x xVar2 = (C52796x) wVar2.build();
            xVar2.getClass();
            auVar32.f50487e = xVar2;
            auVar32.f50483a |= 16;
            anVar.copyOnWrite();
            C17479ao aoVar3 = (C17479ao) anVar.instance;
            C17485au auVar42 = (C17485au) arVar2.build();
            auVar42.getClass();
            aoVar3.f50471b = auVar42;
            aoVar3.f50470a = 1 | aoVar3.f50470a;
            bfVar.copyOnWrite();
            C17499bh bhVar32 = (C17499bh) bfVar.instance;
            C17479ao aoVar22 = (C17479ao) anVar.build();
            aoVar22.getClass();
            bhVar32.f50513c = aoVar22;
            bhVar32.f50512b = 3;
            C62942bv build2 = bfVar.build();
            C69664n.m101060f(build2, "newBuilder()\n      .setD… )\n      )\n      .build()");
            bhVar = (C17499bh) build2;
        }
        throw new C119357a("Wrong protobufType in SpeechOutputArgs.structuredTts: ".concat(String.valueOf(kaVar.f137060b)));
        C17360b a2 = a.mo23306a(bhVar);
        C69664n.m101060f(a2, "ttsClientFactory.create(…f(structuredTtsProtobuf))");
        return a2;
    }
}
