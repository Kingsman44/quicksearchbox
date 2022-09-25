package com.google.android.gms.learning.p10825e.p10826a;

import com.google.protobuf.C63070h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.learning.e.a.c */
/* compiled from: PG */
public final class C144740c {

    /* renamed from: a */
    private final List f391543a = new ArrayList();

    /* renamed from: a */
    public final synchronized C144739b mo120177a(String str, C63070h hVar) {
        C144739b bVar;
        bVar = new C144739b(str, hVar);
        this.f391543a.add(bVar);
        return bVar;
    }

    /* renamed from: b */
    public final synchronized List mo120178b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C144739b a : this.f391543a) {
            arrayList.add(a.mo120175a());
        }
        return arrayList;
    }
}
