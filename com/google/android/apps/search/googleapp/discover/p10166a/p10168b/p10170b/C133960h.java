package com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b;

import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import java.util.List;
import p5462h.C69788q;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b.h */
/* compiled from: PG */
public final class C133960h implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ List f364879a;

    public C133960h(List list) {
        this.f364879a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45922a(C42847bf bfVar) {
        for (Number intValue : this.f364879a) {
            int intValue2 = intValue.intValue();
            C42840az azVar = new C42840az();
            azVar.f112130a.append("\n              UPDATE action_table\n              SET upload_attempt_count = upload_attempt_count + 1\n              WHERE id = ?\n            ");
            azVar.f112131b.add(Long.valueOf((long) intValue2));
            bfVar.mo45934h(azVar.mo45920a());
        }
        return C69788q.f186170a;
    }
}
