package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28480t;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28315b;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.aqr;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.libraries.logging.ve.c.b.k */
/* compiled from: PG */
final class C28328k implements C28315b {

    /* renamed from: a */
    final /* synthetic */ C28329l f77018a;

    /* renamed from: b */
    private int f77019b = -1;

    public C28328k(C28329l lVar) {
        this.f77018a = lVar;
    }

    /* renamed from: a */
    public final void mo33799b(C28439i iVar) {
        C58838bb.m90883r(iVar.mo33888e());
        C28480t tVar = iVar.f77217c;
        C60214n nVar = ((C28481u) tVar.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        C58838bb.m90883r((nVar.f162916a & 2048) != 0);
        int b = aqr.m92462b(((C28481u) tVar.instance).f77291d);
        if (b == 0 || b == 1) {
            int size = this.f77018a.f77024e.size();
            this.f77018a.f77024e.add(iVar.mo33884a());
            this.f77018a.f77025f.put(size, this.f77019b);
            int i = this.f77019b;
            this.f77019b = size;
            iVar.f77220f.mo33828l(this);
            this.f77019b = i;
        }
    }
}
