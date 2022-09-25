package com.google.common.p4536h;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4541l.C59313aa;
import java.io.File;

/* renamed from: com.google.common.h.ai */
/* compiled from: PG */
public abstract class C59242ai {
    /* renamed from: a */
    public abstract C59241ah mo56704a();

    /* renamed from: b */
    public final Iterable mo56707b(Iterable iterable) {
        C58528ij E = C58528ij.m90005E(iterable);
        C58800sl lA = E.iterator();
        while (lA.hasNext()) {
            C59313aa.m92157a((File) lA.next());
        }
        return new C59238ae(this, E);
    }
}
