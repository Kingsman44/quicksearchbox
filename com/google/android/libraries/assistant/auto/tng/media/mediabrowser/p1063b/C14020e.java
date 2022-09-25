package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12582a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12610c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12611d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12612e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13018af;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13019ag;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C63088z;
import java.util.HashMap;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.e */
/* compiled from: PG */
public final /* synthetic */ class C14020e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14027l f42627a;

    /* renamed from: b */
    public final /* synthetic */ C12991i f42628b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f42629c;

    /* renamed from: d */
    public final /* synthetic */ C60887da f42630d;

    public /* synthetic */ C14020e(C14027l lVar, C12991i iVar, C60870cx cxVar, C60887da daVar) {
        this.f42627a = lVar;
        this.f42628b = iVar;
        this.f42629c = cxVar;
        this.f42630d = daVar;
    }

    public final Object apply(Object obj) {
        C14027l lVar = this.f42627a;
        C12991i iVar = this.f42628b;
        C60870cx cxVar = this.f42629c;
        C60887da daVar = this.f42630d;
        C12610c cVar = (C12610c) obj;
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        long j = yVar.f40416b;
        C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(new C14019d(j)), daVar), "Failed to add appflow log", new Object[0]);
        HashMap hashMap = new HashMap();
        hashMap.put("refresh_news", "refresh_news_in_player");
        C13018af afVar = (C13018af) C13023ak.f40447c.createBuilder();
        C13019ag agVar = (C13019ag) C13020ah.f40439c.createBuilder();
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "PlayNarrativeNews";
        Collection.EL.forEach(hashMap.keySet(), new C14017b(mVar, hashMap));
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = ((C61752n) mVar.build()).toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a |= 1;
        hdVar.f136853b = byteString;
        C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString2;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        agVar.copyOnWrite();
        C13020ah ahVar = (C13020ah) agVar.instance;
        duVar2.getClass();
        ahVar.f40442b = duVar2;
        ahVar.f40441a |= 1;
        C13020ah ahVar2 = (C13020ah) agVar.build();
        afVar.copyOnWrite();
        C13023ak akVar = (C13023ak) afVar.instance;
        ahVar2.getClass();
        akVar.f40450b = ahVar2;
        akVar.f40449a = 2;
        C12611d e = C12612e.m28814e();
        ((C12582a) e).f39538a = new C14025j();
        e.mo20665b(iVar);
        e.mo20666c((C13023ak) afVar.build());
        C60856cj.m92911t(cVar.mo20672a(e.mo20664a()).mo20592b(), C47810es.m84974n(new C14021f(lVar, cxVar, daVar, j)), daVar);
        return 0;
    }
}
