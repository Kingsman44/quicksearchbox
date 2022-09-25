package com.google.android.libraries.mdi.download.p2230c.p2231a;

import com.google.android.libraries.mdi.download.p2230c.C28782q;
import com.google.android.libraries.mdi.download.p2230c.C28784s;
import com.google.android.libraries.mdi.download.p2230c.C28785t;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58495hd;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C28751a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Map f78166a;

    public /* synthetic */ C28751a(Map map) {
        this.f78166a = map;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Map map = this.f78166a;
        C28784s sVar = new C28784s();
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            String str = (String) entry.getKey();
            C28782q qVar = (C28782q) ((C58881cr) entry.getValue()).mo6453a();
            Map map2 = sVar.f78237a;
            str.getClass();
            qVar.getClass();
            map2.put(str, qVar);
        }
        return new C28785t(sVar);
    }
}
