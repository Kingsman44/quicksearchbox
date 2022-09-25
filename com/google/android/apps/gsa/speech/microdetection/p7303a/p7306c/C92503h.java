package com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c;

import android.content.Context;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92507a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92508b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92510d;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.c.h */
/* compiled from: PG */
final class C92503h implements C22869e {

    /* renamed from: a */
    public final String f258146a;

    /* renamed from: b */
    public final String f258147b;

    /* renamed from: c */
    public final C90584f f258148c;

    /* renamed from: d */
    public volatile boolean f258149d = false;

    /* renamed from: e */
    final /* synthetic */ C92504i f258150e;

    public C92503h(C92504i iVar, String str, C90584f fVar) {
        this.f258150e = iVar;
        int i = fVar.f253255d;
        this.f258146a = "MicroDataManager - loadResources: " + str + "  modelType: " + i;
        this.f258147b = str;
        this.f258148c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo87260a(String str, String str2, C90584f fVar) {
        if (str == null) {
            C59104x d = C92504i.f258151a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroDataManager");
            ((C59052c) ((C59052c) d).mo56372aa(12708)).mo56354G("MicroDataManager found null model location, so returning null hotword model for locale: %s, type: %s", str2, fVar.name());
            C92507a aVar = (C92507a) C92508b.f258180d.createBuilder();
            aVar.copyOnWrite();
            C92508b bVar = (C92508b) aVar.instance;
            bVar.f258182a |= 2;
            bVar.f258184c = "Model location is null!";
            return C60856cj.m92900i((C92508b) aVar.build());
        } else if (this.f258150e.f258169p.mo79746e(C90082eg.f250020cd)) {
            C29409fd fdVar = (C29409fd) this.f258150e.f258170q.mo27525b();
            C42813k kVar = (C42813k) this.f258150e.f258171r.mo27525b();
            C92504i iVar = this.f258150e;
            Context context = iVar.f258155b;
            C60887da daVar = iVar.f258172s;
            C59104x b = C92513g.f258190a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) b).mo56372aa(12749)).mo56354G("#getHotwordModel [locale: %s, modelType: %s]", str2, fVar);
            if (C92513g.f258191b.containsKey(str)) {
                C92507a aVar2 = (C92507a) C92508b.f258180d.createBuilder();
                C63088z A = C63088z.m96139A((byte[]) C92513g.f258191b.get(str));
                aVar2.copyOnWrite();
                C92508b bVar2 = (C92508b) aVar2.instance;
                bVar2.f258182a |= 1;
                bVar2.f258183b = A;
                return C60856cj.m92900i((C92508b) aVar2.build());
            } else if (URLUtil.isValidUrl(str)) {
                return C60922j.m93044g(C92513g.m152173b(str2, fVar, fdVar), C47810es.m84963c(new C92510d(kVar)), daVar);
            } else {
                byte[] h = C92513g.m152179h(context, str);
                if (h == null || h.length == 0) {
                    C92507a aVar3 = (C92507a) C92508b.f258180d.createBuilder();
                    aVar3.copyOnWrite();
                    C92508b bVar3 = (C92508b) aVar3.instance;
                    bVar3.f258182a |= 2;
                    bVar3.f258184c = "Model location is not a valid url and the model from asset file is null or empty!";
                    return C60856cj.m92900i((C92508b) aVar3.build());
                }
                C92507a aVar4 = (C92507a) C92508b.f258180d.createBuilder();
                C63088z A2 = C63088z.m96139A(h);
                aVar4.copyOnWrite();
                C92508b bVar4 = (C92508b) aVar4.instance;
                bVar4.f258182a |= 1;
                bVar4.f258183b = A2;
                return C60856cj.m92900i((C92508b) aVar4.build());
            }
        } else {
            byte[] f = C92513g.m152177f(this.f258150e.f258155b, str, str2, fVar);
            if (f == null || f.length == 0) {
                C92507a aVar5 = (C92507a) C92508b.f258180d.createBuilder();
                aVar5.copyOnWrite();
                C92508b bVar5 = (C92508b) aVar5.instance;
                bVar5.f258182a |= 2;
                bVar5.f258184c = "Legacy downloaded model is null!";
                return C60856cj.m92900i((C92508b) aVar5.build());
            }
            C92507a aVar6 = (C92507a) C92508b.f258180d.createBuilder();
            C63088z A3 = C63088z.m96139A(f);
            aVar6.copyOnWrite();
            C92508b bVar6 = (C92508b) aVar6.instance;
            bVar6.f258182a |= 1;
            bVar6.f258183b = A3;
            return C60856cj.m92900i((C92508b) aVar6.build());
        }
    }

    public final void run() {
        byte[] h;
        byte[] h2;
        String e = this.f258150e.mo87264e(this.f258147b, this.f258148c);
        this.f258150e.f258166m = false;
        C60870cx h3 = C60922j.m93045h(mo87260a(e, this.f258147b, this.f258148c), new C92501f(this), this.f258150e.f258173t);
        byte[] h4 = C92513g.m152179h(this.f258150e.f258155b, "endpointer.data");
        synchronized (this.f258150e) {
            C92504i iVar = this.f258150e;
            byte[] bArr = iVar.f258162i;
            h = bArr == null ? C92513g.m152179h(iVar.f258155b, "echo_canceller_config.data") : bArr;
            C92504i iVar2 = this.f258150e;
            byte[] bArr2 = iVar2.f258163j;
            h2 = bArr2 == null ? C92513g.m152179h(iVar2.f258155b, "echo_nuller_config.data") : bArr2;
        }
        C60856cj.m92911t(h3, new C92502g(this, e, h4, h, h2), this.f258150e.f258173t);
    }
}
