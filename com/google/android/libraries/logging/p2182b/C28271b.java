package com.google.android.libraries.logging.p2182b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.logging.b.b */
/* compiled from: PG */
public final /* synthetic */ class C28271b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C28272c f76943a;

    /* renamed from: b */
    public final /* synthetic */ C28280k f76944b;

    public /* synthetic */ C28271b(C28272c cVar, C28280k kVar) {
        this.f76943a = cVar;
        this.f76944b = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C28272c cVar = this.f76943a;
        C28280k kVar = this.f76944b;
        ArrayList arrayList = new ArrayList(cVar.f76946b.size());
        for (C28273d a : cVar.f76946b) {
            arrayList.add(a.mo33773a(kVar));
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C28261a(arrayList), cVar.f76945a);
    }
}
