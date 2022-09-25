package com.google.android.libraries.p11024al.p11025a;

import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.al.a.e */
/* compiled from: PG */
public final class C147749e implements Callable {

    /* renamed from: a */
    final /* synthetic */ Map f398694a;

    public C147749e(Map map) {
        this.f398694a = map;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f398694a.entrySet()) {
            if (!((Status) ((C60870cx) entry.getValue()).get()).mo119097c()) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }
}
