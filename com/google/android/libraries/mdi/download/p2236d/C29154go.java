package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.go */
/* compiled from: PG */
public final /* synthetic */ class C29154go implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29170hd f79065a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f79066b;

    public /* synthetic */ C29154go(C29170hd hdVar, Boolean bool) {
        this.f79065a = hdVar;
        this.f79066b = bool;
    }

    public final C60870cx apply(Object obj) {
        C29170hd hdVar = this.f79065a;
        Boolean bool = this.f79066b;
        List<C29398ev> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (C29398ev e : list) {
            arrayList.add(hdVar.f79095b.mo34620e(e));
        }
        return C29672d.m54726a(arrayList).mo34824b(new C29165gz(hdVar, list, arrayList, bool), hdVar.f79097d);
    }
}
