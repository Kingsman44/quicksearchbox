package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49074fm;
import com.google.assistant.p3803ag.p3809c.C49076fo;
import com.google.common.base.C58817ah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.af */
/* compiled from: PG */
public final /* synthetic */ class C36277af implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C36277af f94759a = new C36277af();

    private /* synthetic */ C36277af() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList(Collections.unmodifiableMap(((C49076fo) obj).f126936a).entrySet());
        Collections.sort(arrayList, new C36278ag());
        C49074fm fmVar = (C49074fm) C49076fo.f126934b.createBuilder();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            fmVar.mo53218a(((Integer) entry.getKey()).intValue(), ((Long) entry.getValue()).longValue());
            i2++;
            i++;
            if (i2 > 10) {
                break;
            }
        }
        return (C49076fo) fmVar.build();
    }
}
