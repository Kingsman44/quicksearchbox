package com.google.android.apps.search.googleapp.stampviewer.p10490d.p10492b;

import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139362a;
import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139378d;
import com.google.common.base.C58817ah;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53897i;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53901m;
import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53903o;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.d.b.i */
/* compiled from: PG */
public final /* synthetic */ class C139373i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f378993a;

    public /* synthetic */ C139373i(String str) {
        this.f378993a = str;
    }

    public final Object apply(Object obj) {
        C53897i iVar;
        String str = this.f378993a;
        C139362a aVar = new C139362a();
        aVar.mo114930c(str);
        Optional findFirst = Collection.EL.stream(((C53901m) obj).f141436a).filter(new C139378d(str)).findFirst();
        boolean z = false;
        if (!findFirst.isPresent()) {
            aVar.mo114929b(false);
            return aVar.mo114928a();
        }
        C53903o oVar = (C53903o) findFirst.get();
        if (oVar.f141439a == 100) {
            iVar = (C53897i) oVar.f141440b;
        } else {
            iVar = C53897i.f141427b;
        }
        int i = iVar.f141429a;
        char c = 2;
        if (i != 0) {
            c = i != 1 ? i != 2 ? (char) 0 : 4 : 3;
        }
        if (c != 0 && c == 4) {
            z = true;
        }
        aVar.mo114929b(z);
        return aVar.mo114928a();
    }
}
