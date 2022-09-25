package com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.e.d */
/* compiled from: PG */
public final /* synthetic */ class C92510d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C42813k f258186a;

    public /* synthetic */ C92510d(C42813k kVar) {
        this.f258186a = kVar;
    }

    public final Object apply(Object obj) {
        C42813k kVar = this.f258186a;
        String str = (String) obj;
        if (str != null) {
            byte[] g = C92513g.m152178g(kVar, Uri.parse(str));
            if (g == null || g.length == 0) {
                C59104x b = C92513g.f258190a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
                ((C59052c) ((C59052c) b).mo56372aa(12748)).mo56386p("Returning null hotword model or zero byte count!");
                C92507a aVar = (C92507a) C92508b.f258180d.createBuilder();
                aVar.copyOnWrite();
                C92508b bVar = (C92508b) aVar.instance;
                bVar.f258182a |= 2;
                bVar.f258184c = "Mdd downloaded model is null or empty!";
                return (C92508b) aVar.build();
            }
            C92507a aVar2 = (C92507a) C92508b.f258180d.createBuilder();
            C63088z A = C63088z.m96139A(g);
            aVar2.copyOnWrite();
            C92508b bVar2 = (C92508b) aVar2.instance;
            bVar2.f258182a |= 1;
            bVar2.f258183b = A;
            return (C92508b) aVar2.build();
        }
        C59104x d = C92513g.f258190a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
        ((C59052c) ((C59052c) d).mo56372aa(12747)).mo56386p("Returning null hotword model because MDD did not contain a valid URI. This can indicate that the model download did not finish or that it was not downloaded at all.");
        C92507a aVar3 = (C92507a) C92508b.f258180d.createBuilder();
        aVar3.copyOnWrite();
        C92508b bVar3 = (C92508b) aVar3.instance;
        bVar3.f258182a |= 2;
        bVar3.f258184c = "Mobstore Uri is null!";
        return (C92508b) aVar3.build();
    }
}
