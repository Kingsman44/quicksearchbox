package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.C16213a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C16412ac implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48278a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f48279b;

    /* renamed from: c */
    public final /* synthetic */ boolean f48280c;

    public /* synthetic */ C16412ac(C16416ag agVar, C58485gu guVar, boolean z) {
        this.f48278a = agVar;
        this.f48279b = guVar;
        this.f48280c = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C16416ag agVar = this.f48278a;
        C58485gu guVar = this.f48279b;
        boolean z = this.f48280c;
        ArrayList arrayList = new ArrayList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(((C58833ax) C60856cj.m92909r((C60870cx) guVar.get(i))).mo56112g());
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(arrayList).map(C16413ad.f48281a).collect(C58370cn.f155946a);
        if (z && agVar.f48290e.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            C46459k.m82829b(((C16213a) agVar.f48290e.mo56107c()).mo22851b(arrayList), "Suggestions impression failed", new Object[0]);
        }
        return ((C16002a) agVar.f48287b.mo27525b()).mo22657n(guVar2);
    }
}
