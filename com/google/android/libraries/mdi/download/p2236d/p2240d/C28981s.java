package com.google.android.libraries.mdi.download.p2236d.p2240d;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.d.s */
/* compiled from: PG */
public final /* synthetic */ class C28981s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28983u f78690a;

    public /* synthetic */ C28981s(C28983u uVar) {
        this.f78690a = uVar;
    }

    public final C60870cx apply(Object obj) {
        C28983u uVar = this.f78690a;
        Map map = (Map) obj;
        C58733pz pzVar = C58733pz.f156496a;
        C58490gz j = C58495hd.m89896j(map.size());
        for (Long h : map.keySet()) {
            j.mo55429h(h, pzVar);
        }
        return uVar.mo34526d(j.mo55427f(true));
    }
}
