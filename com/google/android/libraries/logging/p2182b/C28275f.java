package com.google.android.libraries.logging.p2182b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.logging.b.f */
/* compiled from: PG */
public final /* synthetic */ class C28275f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C28278i f76950a;

    /* renamed from: b */
    public final /* synthetic */ List f76951b;

    public /* synthetic */ C28275f(C28278i iVar, List list) {
        this.f76950a = iVar;
        this.f76951b = list;
    }

    public final Object call() {
        C28278i iVar = this.f76950a;
        List<C28280k> list = this.f76951b;
        ArrayList arrayList = new ArrayList(list.size());
        for (C28280k kVar : list) {
            arrayList.add(new C28282m(kVar, iVar.f76956b.mo33773a(kVar)));
        }
        return arrayList;
    }
}
