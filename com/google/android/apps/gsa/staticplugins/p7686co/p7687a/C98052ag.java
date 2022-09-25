package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91317av;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58758qx;
import com.google.p375ai.p378b.C7718hj;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C98052ag implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f273789a;

    /* renamed from: b */
    public final /* synthetic */ Collection f273790b;

    public /* synthetic */ C98052ag(C98064as asVar, Collection collection) {
        this.f273789a = asVar;
        this.f273790b = collection;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98064as asVar = this.f273789a;
        Collection<C7718hj> collection = this.f273790b;
        C118826c cVar = (C118826c) obj;
        asVar.f273820p.mo85270f("internalHandleDismissedEntries", C90996e.f254198a);
        if (collection.isEmpty()) {
            return C118826c.f331423b;
        }
        HashSet g = C58758qx.m90649g(collection.size());
        for (C7718hj hjVar : collection) {
            if (hjVar != null) {
                g.add(hjVar);
            }
        }
        C91307al alVar = (C91307al) asVar.f273818n.mo17428b();
        return asVar.mo90923r("handleDismissedEntries", asVar.mo90921p(new C91317av(alVar, g, true), true), alVar);
    }
}
