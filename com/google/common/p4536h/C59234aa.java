package com.google.common.p4536h;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.common.h.aa */
/* compiled from: PG */
public final class C59234aa extends C59235ab implements C59243aj {

    /* renamed from: c */
    private final C59259p f157343c;

    public C59234aa(C59246c cVar) {
        super(cVar);
        this.f157343c = cVar.f157353b;
    }

    /* renamed from: g */
    public final C59257n mo56697g(Object obj) {
        ArrayList arrayList;
        C59259p pVar = this.f157343c;
        C59258o oVar = C59258o.UNORDERED;
        int ordinal = pVar.f157370a.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            arrayList = null;
        } else if (ordinal == 1) {
            arrayList = new ArrayList();
        } else {
            throw new AssertionError(pVar.f157370a);
        }
        C59257n nVar = new C59257n(new HashMap(4, 1.0f), arrayList);
        if (this.f157344a.mo56739c(obj, nVar) != null) {
            z = false;
        }
        C58838bb.m90883r(z);
        return nVar;
    }
}
