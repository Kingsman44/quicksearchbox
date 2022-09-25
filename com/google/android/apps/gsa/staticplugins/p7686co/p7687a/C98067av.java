package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.av */
/* compiled from: PG */
public final class C98067av extends C91953ad {

    /* renamed from: a */
    private static final C59071e f273833a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.a.av");

    /* renamed from: b */
    private final C58495hd f273834b;

    public C98067av(C58485gu guVar) {
        C58495hd hdVar = C58729pv.f156485a;
        try {
            hdVar = C58662ni.m90345d(guVar, C98066au.f273832a);
        } catch (IllegalArgumentException unused) {
            C59104x d = f273833a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EntryTreeMutator");
            ((C59052c) ((C59052c) d).mo56372aa(30536)).mo56386p("EntrySwapper: shared content ID");
            int i = C90755l.f253831a;
        }
        this.f273834b = hdVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        C58495hd hdVar = this.f273834b;
        C7669fo foVar = hjVar.f26968i;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        C7718hj hjVar2 = (C7718hj) hdVar.get(foVar);
        return (hjVar2 == null || !hjVar2.f26950V) ? hjVar : hjVar2;
    }
}
