package com.facebook.litho.p326e;

import com.facebook.litho.p322a.C6088u;
import java.util.ArrayList;

/* renamed from: com.facebook.litho.e.i */
/* compiled from: PG */
public final class C6220i {

    /* renamed from: a */
    public final C6217f f18389a;

    /* renamed from: b */
    public final C6219h f18390b = new C6219h();

    /* renamed from: c */
    public final ArrayList f18391c = new ArrayList();

    /* renamed from: d */
    public boolean f18392d = false;

    /* renamed from: e */
    public boolean f18393e = false;

    /* renamed from: f */
    public C6088u f18394f;

    private C6220i(C6217f fVar) {
        this.f18389a = fVar;
    }

    /* renamed from: a */
    public static C6220i m16478a() {
        C6217f fVar = C6217f.f18380a;
        if (fVar == null) {
            C6214c cVar = new C6214c();
            C6217f.f18380a = new C6217f(cVar);
            C6217f fVar2 = C6217f.f18380a;
            cVar.f18373c = fVar2;
            fVar = fVar2;
        }
        return new C6220i(fVar);
    }

    /* renamed from: b */
    public final void mo13181b(C6226o oVar, C6226o oVar2, String str) {
        if (!this.f18393e) {
            C6219h hVar = this.f18390b;
            hVar.f18386a.add(oVar);
            hVar.f18387b.add(oVar2);
            hVar.f18388c.add(str);
            this.f18391c.add(oVar);
            this.f18391c.add(oVar2);
            return;
        }
        throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
    }

    /* renamed from: c */
    public final void mo13182c() {
        if (this.f18392d) {
            this.f18392d = false;
            this.f18389a.mo13180c(this);
            C6219h hVar = this.f18390b;
            for (int i = 0; i < hVar.f18386a.size(); i++) {
                C6226o oVar = (C6226o) hVar.f18386a.get(i);
                C6226o oVar2 = (C6226o) hVar.f18387b.get(i);
                String str = (String) hVar.f18388c.get(i);
                if (oVar2.mo13187g(str) == oVar) {
                    oVar.mo13190j(oVar2);
                    oVar2.mo13189i(str);
                }
            }
        }
    }
}
