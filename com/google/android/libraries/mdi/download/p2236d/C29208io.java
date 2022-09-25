package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58662ni;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.io */
/* compiled from: PG */
public final /* synthetic */ class C29208io implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79187a;

    /* renamed from: b */
    public final /* synthetic */ List f79188b;

    public /* synthetic */ C29208io(C29211ir irVar, List list) {
        this.f79187a = irVar;
        this.f79188b = list;
    }

    public final C60870cx apply(Object obj) {
        C29211ir irVar = this.f79187a;
        List list = this.f79188b;
        Void voidR = (Void) obj;
        C29117fe feVar = irVar.f79194d;
        HashMap j = C58662ni.m90351j(list.size());
        HashMap j2 = C58662ni.m90351j(list.size());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(list.size());
        C28829al alVar = new C28829al(feVar, list, j, hashSet);
        return C29670b.m54719g(C60856cj.m92905n(C47810es.m84965e(alVar), feVar.f78980i)).mo34822i(new C28830am(feVar, list, j2, arrayList), feVar.f78980i).mo34822i(new C28831an(feVar, j2, arrayList), feVar.f78980i).mo34822i(new C28832ao(feVar, j, hashSet), feVar.f78980i);
    }
}
