package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.C21947am;
import com.google.android.libraries.geller.portable.C21952d;
import com.google.common.base.C58817ah;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65854w;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.geller.f.r */
/* compiled from: PG */
public final /* synthetic */ class C21868r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60346a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60347b;

    /* renamed from: c */
    public final /* synthetic */ C65854w f60348c;

    public /* synthetic */ C21868r(C21875y yVar, C65753ak akVar, C65854w wVar) {
        this.f60346a = yVar;
        this.f60347b = akVar;
        this.f60348c = wVar;
    }

    public final Object apply(Object obj) {
        C21875y yVar = this.f60346a;
        C65753ak akVar = this.f60347b;
        C65854w wVar = this.f60348c;
        Void voidR = (Void) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C65768az azVar : wVar.f179017e) {
            String str = azVar.f178798d;
            C65139d dVar = azVar.f178796b;
            if (dVar == null) {
                dVar = C65139d.f176307e;
            }
            arrayList.add(C21952d.m41118c(str, dVar.f176310b));
            arrayList2.add(azVar.f178798d);
        }
        yVar.f60361e.mo27209t(yVar.f60363g, akVar, C21875y.m40977b(C21947am.SYNCED, arrayList));
        C65753ak b = C65753ak.m96797b(wVar.f179014b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        b.name();
        return arrayList2;
    }
}
