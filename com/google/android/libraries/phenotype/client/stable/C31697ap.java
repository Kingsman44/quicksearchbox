package com.google.android.libraries.phenotype.client.stable;

import com.google.android.libraries.phenotype.client.C31655ak;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ap */
/* compiled from: PG */
public final /* synthetic */ class C31697ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f85231a;

    public /* synthetic */ C31697ap(String str) {
        this.f85231a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f85231a;
        C31655ak akVar = C31700as.f85236a;
        C31740g gVar = (C31740g) C31741h.f85325b.createBuilder();
        for (Map.Entry entry : Collections.unmodifiableMap(((C31741h) obj).f85327a).entrySet()) {
            C31708b bVar = (C31708b) entry.getValue();
            C31681a aVar = (C31681a) C31708b.f85249d.createBuilder();
            if (!bVar.f85253c.equals(str)) {
                String str2 = bVar.f85253c;
                aVar.copyOnWrite();
                C31708b bVar2 = (C31708b) aVar.instance;
                str2.getClass();
                bVar2.f85251a |= 1;
                bVar2.f85253c = str2;
            }
            for (String str3 : bVar.f85252b) {
                if (!str3.equals(str)) {
                    aVar.mo37319a(str3);
                }
            }
            gVar.mo37351a((String) entry.getKey(), (C31708b) aVar.build());
        }
        return (C31741h) gVar.build();
    }
}
