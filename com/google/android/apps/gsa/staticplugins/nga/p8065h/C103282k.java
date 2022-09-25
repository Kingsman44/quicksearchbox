package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80460h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import com.google.common.p4522b.C58506ho;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.k */
/* compiled from: PG */
public final /* synthetic */ class C103282k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C103236bb f288076a;

    public /* synthetic */ C103282k(C103236bb bbVar) {
        this.f288076a = bbVar;
    }

    public final C60870cx apply(Object obj) {
        long days = TimeUnit.MILLISECONDS.toDays(this.f288076a.f288008a.mo26870b());
        C58506ho hoVar = new C58506ho();
        Iterator.EL.forEachRemaining(((C103244bj) obj).iterator(), new C103230aw(hoVar));
        C80460h hVar = (C80460h) C80465m.f220842e.createBuilder();
        HashMap hashMap = new HashMap();
        Collection.EL.stream(hoVar.mo55453g().mo54948A()).forEach(new C103231ax(hashMap, days - 90));
        Collection.EL.stream(hashMap.entrySet()).forEach(new C103233az(hVar, Math.max(Collection.EL.stream(hashMap.values()).mapToDouble(C103232ay.f288001a).sum(), 1.0d)));
        return C60856cj.m92900i((C80465m) hVar.build());
    }
}
