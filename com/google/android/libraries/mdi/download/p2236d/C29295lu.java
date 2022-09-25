package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.lu */
/* compiled from: PG */
public final /* synthetic */ class C29295lu implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29296lv f79399a;

    public /* synthetic */ C29295lu(C29296lv lvVar) {
        this.f79399a = lvVar;
    }

    public final C60870cx apply(Object obj) {
        C29296lv lvVar = this.f79399a;
        List<C29392ep> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (C29392ep g : list) {
            arrayList.add(lvVar.mo34602g(g));
        }
        return C29672d.m54726a(arrayList).mo34824b(new C29294lt(list, arrayList), lvVar.f79400a);
    }
}
