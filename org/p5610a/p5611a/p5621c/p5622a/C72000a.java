package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: org.a.a.c.a.a */
/* compiled from: PG */
public final class C72000a extends C72001b {

    /* renamed from: b */
    private final List f191724b = new ArrayList();

    public C72000a(C72001b... bVarArr) {
        for (C72001b bVar : bVarArr) {
            if (bVar != null) {
                this.f191724b.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public final int mo63213a(CharSequence charSequence, int i, Writer writer) {
        for (C72001b a : this.f191724b) {
            int a2 = a.mo63213a(charSequence, i, writer);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }
}
