package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64136e;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64137f;
import java.io.IOException;
import p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a.C71858c;
import p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a.C71859d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.n */
/* compiled from: PG */
public final /* synthetic */ class C40454n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C64137f f106176a;

    public /* synthetic */ C40454n(C64137f fVar) {
        this.f106176a = fVar;
    }

    public final Object apply(Object obj) {
        String str;
        C64137f fVar = this.f106176a;
        C40450j jVar = (C40450j) obj;
        int i = C40456p.f106179b;
        C63088z b = jVar.mo42443b();
        if (b == null || !jVar.mo42448f()) {
            if (b == null) {
                str = "Empty response.";
            } else {
                str = "Request failed: ".concat(String.valueOf(String.valueOf(jVar.mo42445d())));
            }
            throw new IllegalArgumentException(str);
        }
        int a = C64136e.m96365a(fVar.f173413j);
        if (a != 0 && a == 2) {
            try {
                C71858c cVar = (C71858c) C71859d.f191403c.createBuilder();
                C63088z A = C63088z.m96139A(b.mo59040l().mo58664G());
                cVar.copyOnWrite();
                C71859d dVar = (C71859d) cVar.instance;
                dVar.f191405a |= 1;
                dVar.f191406b = A;
                return (C71859d) cVar.build();
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            C71858c cVar2 = (C71858c) C71859d.f191403c.createBuilder();
            cVar2.copyOnWrite();
            C71859d dVar2 = (C71859d) cVar2.instance;
            dVar2.f191405a |= 1;
            dVar2.f191406b = b;
            return (C71859d) cVar2.build();
        }
    }
}
