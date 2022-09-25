package com.google.android.libraries.cast.usonia.adapter.service;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p427am.p438d.p439a.C8726b;
import com.google.p427am.p438d.p439a.C8763cj;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.o */
/* compiled from: PG */
final class C19727o implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C19710ab f54774a;

    public C19727o(C19710ab abVar) {
        this.f54774a = abVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        for (C8763cj cjVar : ((C8726b) obj).f30063a) {
            int i = cjVar.f30123c;
            int i2 = 1;
            if (i != 0) {
                i2 = i == 1 ? 2 : i == 2 ? 3 : i == 4 ? 5 : i == 8 ? 9 : 0;
            }
            if (i2 == 0) {
                C59052c cVar = (C59052c) C19710ab.f54740a.mo56226d();
                int i3 = cjVar.f30123c;
                cVar.mo56379ah(new C59094n(47919));
                cVar.mo56387q("Unknown auth tier %s", i3);
            } else {
                this.f54774a.f54743d.mo122756l(cjVar.f30121a, cjVar.f30122b, i2);
            }
        }
        return C69788q.f186170a;
    }
}
