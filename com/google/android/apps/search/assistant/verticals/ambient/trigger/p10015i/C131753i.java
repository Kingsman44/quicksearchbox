package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i;

import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131834f;
import com.google.assistant.p4016z.C53676aa;
import com.google.assistant.p4016z.C53732q;
import com.google.assistant.p4016z.C53734s;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.i.i */
/* compiled from: PG */
public final /* synthetic */ class C131753i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131755k f359907a;

    /* renamed from: b */
    public final /* synthetic */ C53734s f359908b;

    /* renamed from: c */
    public final /* synthetic */ C53738w f359909c;

    /* renamed from: d */
    public final /* synthetic */ long f359910d;

    public /* synthetic */ C131753i(C131755k kVar, C53734s sVar, C53738w wVar, long j) {
        this.f359907a = kVar;
        this.f359908b = sVar;
        this.f359909c = wVar;
        this.f359910d = j;
    }

    public final C60870cx apply(Object obj) {
        C131755k kVar = this.f359907a;
        C53734s sVar = this.f359908b;
        C53738w wVar = this.f359909c;
        long j = this.f359910d;
        C58485gu guVar = (C58485gu) obj;
        C131834f fVar = kVar.f359915b;
        C53732q qVar = (C53732q) sVar.toBuilder();
        C63042fg fgVar = sVar.f141069b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C62910ar e = C62953e.m95480e(fgVar, C62953e.m95484i(fVar.f360044a.mo26870b()));
        qVar.copyOnWrite();
        C53734s sVar2 = (C53734s) qVar.instance;
        e.getClass();
        sVar2.f141070c = e;
        sVar2.f141068a |= 2;
        qVar.copyOnWrite();
        C53734s sVar3 = (C53734s) qVar.instance;
        sVar3.f141068a |= 4;
        sVar3.f141071d = true;
        qVar.copyOnWrite();
        C53734s sVar4 = (C53734s) qVar.instance;
        sVar4.mo54012a();
        C62947c.addAll((Iterable) guVar, (List) sVar4.f141074g);
        C58079k kVar2 = wVar.f141082b;
        if (kVar2 == null) {
            kVar2 = C58079k.f155250c;
        }
        qVar.copyOnWrite();
        C53734s sVar5 = (C53734s) qVar.instance;
        kVar2.getClass();
        sVar5.f141072e = kVar2;
        sVar5.f141068a |= 16;
        C53676aa aaVar = wVar.f141083c;
        if (aaVar == null) {
            aaVar = C53676aa.f140889i;
        }
        qVar.copyOnWrite();
        C53734s sVar6 = (C53734s) qVar.instance;
        aaVar.getClass();
        sVar6.f141073f = aaVar;
        sVar6.f141068a |= 32;
        fVar.mo110338e((C53734s) qVar.build(), j);
        return kVar.mo110298a(guVar, j);
    }
}
