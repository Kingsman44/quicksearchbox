package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import com.google.common.p4522b.C58506ho;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.h */
/* compiled from: PG */
public final /* synthetic */ class C103279h implements C60931s {
    public final C60870cx apply(Object obj) {
        C58506ho hoVar = new C58506ho();
        Iterator.EL.forEachRemaining(((C103244bj) obj).iterator(), new C103290s(hoVar));
        HashMap hashMap = new HashMap();
        Collection.EL.stream(hoVar.mo55453g().mo54948A()).filter(C103291t.f288091a).forEach(new C103292u(hashMap));
        double max = Math.max(Collection.EL.stream(hashMap.values()).mapToDouble(C103293v.f288093a).sum(), 1.0d);
        C80460h hVar = (C80460h) C80465m.f220842e.createBuilder();
        Collection.EL.stream(hashMap.entrySet()).forEach(new C103294w(max, hVar));
        return C60856cj.m92900i((C80465m) hVar.build());
    }
}
