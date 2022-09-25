package com.google.fcp.client.http;

import com.google.fcp.client.C61090c;
import com.google.p4280bt.C56487c;
import com.google.p4280bt.C56488d;
import java.util.ArrayList;

/* renamed from: com.google.fcp.client.http.a */
/* compiled from: PG */
public final /* synthetic */ class C61092a implements C61090c {

    /* renamed from: a */
    public final /* synthetic */ Object[] f165388a;

    public /* synthetic */ C61092a(Object[] objArr) {
        this.f165388a = objArr;
    }

    public final Object call() {
        ArrayList arrayList = new ArrayList(r2);
        for (Object obj : this.f165388a) {
            C61104m mVar = (C61104m) obj;
            arrayList.add(mVar);
            mVar.mo57665i();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C61104m) arrayList.get(i)).mo57666j();
        }
        C56487c cVar = (C56487c) C56488d.f150876d.createBuilder();
        cVar.copyOnWrite();
        ((C56488d) cVar.instance).f150878a = 0;
        return ((C56488d) cVar.build()).toByteArray();
    }
}
