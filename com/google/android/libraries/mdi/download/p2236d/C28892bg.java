package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.libraries.mdi.download.d.bg */
/* compiled from: PG */
public final /* synthetic */ class C28892bg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78469a;

    /* renamed from: b */
    public final /* synthetic */ Set f78470b;

    public /* synthetic */ C28892bg(C29117fe feVar, Set set) {
        this.f78469a = feVar;
        this.f78470b = set;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78469a;
        Set<C29398ev> set = this.f78470b;
        C58528ij ijVar = (C58528ij) obj;
        ArrayList arrayList = new ArrayList();
        for (C29398ev evVar : set) {
            if (!ijVar.contains(evVar)) {
                arrayList.add(feVar.f78976e.mo34637a(evVar));
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(new C28895bj(arrayList), feVar.f78980i);
    }
}
