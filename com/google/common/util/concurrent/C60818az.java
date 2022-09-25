package com.google.common.util.concurrent;

import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.util.concurrent.az */
/* compiled from: PG */
final class C60818az extends C60821bb {
    public C60818az(C58471gg ggVar, boolean z) {
        super(ggVar, z);
        mo57425r();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ Object mo57283t(List list) {
        ArrayList d = C58597ky.m90213d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C60820ba baVar = (C60820ba) it.next();
            d.add(baVar != null ? baVar.f164887a : null);
        }
        return Collections.unmodifiableList(d);
    }
}
