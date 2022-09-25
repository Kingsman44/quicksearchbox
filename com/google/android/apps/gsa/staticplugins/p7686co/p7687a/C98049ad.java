package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91348d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58759qy;
import com.google.p375ai.p378b.C7718hj;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C98049ad implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f273781a;

    /* renamed from: b */
    public final /* synthetic */ Collection f273782b;

    /* renamed from: c */
    public final /* synthetic */ C7718hj f273783c;

    public /* synthetic */ C98049ad(C98064as asVar, Collection collection, C7718hj hjVar) {
        this.f273781a = asVar;
        this.f273782b = collection;
        this.f273783c = hjVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98064as asVar = this.f273781a;
        Collection collection = this.f273782b;
        C7718hj hjVar = this.f273783c;
        C118826c cVar = (C118826c) obj;
        asVar.f273820p.mo85270f("internalRemoveGroupChildEntries", C90996e.f254198a);
        HashSet g = C58758qx.m90649g(1);
        C58565jt jtVar = new C58565jt(((C58759qy) collection).f156534a);
        while (jtVar.hasNext()) {
            C7718hj hjVar2 = (C7718hj) jtVar.next();
            if (hjVar2 != null) {
                g.add(hjVar2);
            }
        }
        C91307al alVar = (C91307al) asVar.f273818n.mo17428b();
        return asVar.mo90923r("removeGroupChildEntries", asVar.mo90921p(new C91348d(alVar, hjVar, g), true), alVar);
    }
}
