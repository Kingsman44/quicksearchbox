package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28814a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.mdi.download.d.lt */
/* compiled from: PG */
public final /* synthetic */ class C29294lt implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ List f79397a;

    /* renamed from: b */
    public final /* synthetic */ List f79398b;

    public /* synthetic */ C29294lt(List list, List list2) {
        this.f79397a = list;
        this.f79398b = list2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        List list = this.f79397a;
        List list2 = this.f79398b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C29392ep epVar = (C29392ep) list.get(i);
            C29334dr drVar = (C29334dr) C60856cj.m92909r((Future) list2.get(i));
            if (drVar != null) {
                arrayList.add(new C28814a(epVar, drVar));
            }
        }
        return C60856cj.m92900i(arrayList);
    }
}
