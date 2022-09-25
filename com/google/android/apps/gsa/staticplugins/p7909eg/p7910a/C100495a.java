package com.google.android.apps.gsa.staticplugins.p7909eg.p7910a;

import android.text.TextUtils;
import com.google.android.apps.gsa.p6487s3.producers.C84311j;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.speech.p5205f.p5206a.C66500a;
import com.google.speech.p5205f.p5206a.C66501b;
import com.google.speech.p5205f.p5206a.C66502c;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5226l.p5227a.C67249a;
import com.google.speech.p5226l.p5227a.C67250b;
import com.google.speech.p5230n.p5232b.C67395ak;
import com.google.speech.p5230n.p5232b.C67396al;
import com.google.speech.p5230n.p5232b.C67397am;
import com.google.speech.p5230n.p5232b.C67398an;
import com.google.speech.p5230n.p5232b.C67399ao;
import com.google.speech.p5230n.p5232b.C67400ap;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.a.a */
/* compiled from: PG */
public final class C100495a extends C84311j {

    /* renamed from: a */
    private final C67190ah f280948a;

    public C100495a(TtsRequest ttsRequest, String str, C86124t tVar) {
        C67187ae aeVar;
        C67190ah ahVar = ttsRequest.f236280d;
        if (C58833ax.m90833j(ahVar).mo56113h()) {
            aeVar = (C67187ae) ((C67190ah) C58833ax.m90833j(ahVar).mo56107c()).toBuilder();
        } else {
            C66500a aVar = (C66500a) C66501b.f180865c.createBuilder();
            C67402ar arVar = ttsRequest.f236278b;
            if (arVar != null) {
                aVar.copyOnWrite();
                C66501b bVar = (C66501b) aVar.instance;
                bVar.f180868b = arVar;
                bVar.f180867a = 4;
            } else {
                ArrayList arrayList = new ArrayList();
                C67397am amVar = (C67397am) C67398an.f183181d.createBuilder();
                amVar.copyOnWrite();
                C67398an anVar = (C67398an) amVar.instance;
                anVar.f183183a = 21;
                anVar.f183184b = Float.valueOf(0.6f);
                C67398an anVar2 = (C67398an) amVar.build();
                boolean z = true;
                for (String str2 : ttsRequest.mo81450a()) {
                    if (z) {
                        C67397am amVar2 = (C67397am) C67398an.f183181d.createBuilder();
                        amVar2.copyOnWrite();
                        C67398an anVar3 = (C67398an) amVar2.instance;
                        str2.getClass();
                        anVar3.f183183a = 1;
                        anVar3.f183184b = str2;
                        String x = tVar.mo79758x(C90120fr.f250768H);
                        if (x != null && !x.isEmpty()) {
                            C67395ak akVar = (C67395ak) C67396al.f183177c.createBuilder();
                            akVar.copyOnWrite();
                            C67396al alVar = (C67396al) akVar.instance;
                            alVar.f183179a |= 1;
                            alVar.f183180b = x;
                            amVar2.copyOnWrite();
                            C67398an anVar4 = (C67398an) amVar2.instance;
                            C67396al alVar2 = (C67396al) akVar.build();
                            alVar2.getClass();
                            anVar4.mo59846a();
                            anVar4.f183185c.add(alVar2);
                        }
                        arrayList.add((C67398an) amVar2.build());
                    } else {
                        arrayList.add(anVar2);
                        C67397am amVar3 = (C67397am) C67398an.f183181d.createBuilder();
                        amVar3.copyOnWrite();
                        C67398an anVar5 = (C67398an) amVar3.instance;
                        str2.getClass();
                        anVar5.f183183a = 1;
                        anVar5.f183184b = str2;
                        arrayList.add((C67398an) amVar3.build());
                    }
                    z = false;
                }
                C67399ao aoVar = (C67399ao) C67400ap.f183187c.createBuilder();
                aoVar.copyOnWrite();
                C67400ap apVar = (C67400ap) aoVar.instance;
                apVar.mo59847a();
                C62947c.addAll((Iterable) arrayList, (List) apVar.f183189a);
                C67400ap apVar2 = (C67400ap) aoVar.build();
                aVar.copyOnWrite();
                C66501b bVar2 = (C66501b) aVar.instance;
                apVar2.getClass();
                bVar2.f180868b = apVar2;
                bVar2.f180867a = 2;
            }
            C67249a aVar2 = (C67249a) C67250b.f182809a.createBuilder();
            aVar2.mo58885m(C66502c.f180870a, (C66501b) aVar.build());
            C67250b bVar3 = (C67250b) aVar2.build();
            C67187ae aeVar2 = (C67187ae) C67190ah.f182619q.createBuilder();
            aeVar2.copyOnWrite();
            C67190ah ahVar2 = (C67190ah) aeVar2.instance;
            ahVar2.f182622a |= 8192;
            ahVar2.f182632k = str;
            aeVar2.copyOnWrite();
            C67190ah ahVar3 = (C67190ah) aeVar2.instance;
            ahVar3.f182628g = 4;
            ahVar3.f182622a |= 128;
            aeVar2.copyOnWrite();
            C67190ah ahVar4 = (C67190ah) aeVar2.instance;
            bVar3.getClass();
            ahVar4.f182627f = bVar3;
            ahVar4.f182622a |= 4;
            aeVar2.copyOnWrite();
            C67190ah ahVar5 = (C67190ah) aeVar2.instance;
            ahVar5.f182622a |= 512;
            ahVar5.f182629h = true;
            aeVar = aeVar2;
        }
        if (ttsRequest.f236282f) {
            String str3 = ttsRequest.f236286j;
            String str4 = ttsRequest.f236284h;
            if (!TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str3)) {
                String str5 = ttsRequest.f236285i;
                if (!TextUtils.isEmpty(str5)) {
                    aeVar.copyOnWrite();
                    C67190ah ahVar6 = (C67190ah) aeVar.instance;
                    str5.getClass();
                    ahVar6.f182622a |= 8192;
                    ahVar6.f182632k = str5;
                }
                if (!TextUtils.isEmpty(str4)) {
                    aeVar.copyOnWrite();
                    C67190ah ahVar7 = (C67190ah) aeVar.instance;
                    str4.getClass();
                    ahVar7.f182622a |= C89885b.S3REQUEST_VALUE;
                    ahVar7.f182635n = str4;
                }
                if (!TextUtils.isEmpty(str3)) {
                    aeVar.copyOnWrite();
                    C67190ah ahVar8 = (C67190ah) aeVar.instance;
                    str3.getClass();
                    ahVar8.f182622a |= 16384;
                    ahVar8.f182633l = str3;
                }
            } else {
                aeVar.copyOnWrite();
                C67190ah ahVar9 = (C67190ah) aeVar.instance;
                ahVar9.f182622a |= 1024;
                ahVar9.f182630i = true;
            }
        }
        if (ttsRequest.f236283g) {
            aeVar.copyOnWrite();
            C67190ah ahVar10 = (C67190ah) aeVar.instance;
            C62961ch chVar = ahVar10.f182631j;
            if (!chVar.mo58948c()) {
                ahVar10.f182631j = C62942bv.mutableCopy(chVar);
            }
            ahVar10.f182631j.mo58916g(1);
        }
        this.f280948a = (C67190ah) aeVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C66606cd mo77837a() {
        C66606cd a = C118919a.m197403a();
        a.mo58885m(C67190ah.f182620r, this.f280948a);
        return a;
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }
}
