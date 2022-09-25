package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9192d.p9195c;

import android.util.ArrayMap;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121281a;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121282b;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9192d.p9193a.C121325a;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9229b.C121487e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.d.c.b */
/* compiled from: PG */
public final class C121333b implements C121325a, C121282b {

    /* renamed from: a */
    private static final C59071e f336939a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.b.d.c.b");

    /* renamed from: b */
    private C121332a f336940b = new C121332a();

    public C121333b(Executor executor) {
        new C60904dr(executor);
    }

    /* renamed from: c */
    private final Map m200591c(List list, int i, Map map) {
        if (i < 0 || i >= list.size()) {
            return map;
        }
        String str = (String) list.get(i);
        if (str.isEmpty()) {
            ((C59052c) ((C59052c) f336939a.mo56226d()).mo56372aa(35778)).mo56387q("#queryInternal - splitIndex: %d - split is empty.", i);
            return new ArrayMap();
        }
        Map arrayMap = new ArrayMap();
        C121332a aVar = this.f336940b;
        if (aVar == null) {
            return new ArrayMap();
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            aVar = (C121332a) aVar.f336937a.get(Character.valueOf(str.charAt(i2)));
            if (aVar == null) {
                return new ArrayMap();
            }
            if (i2 == str.length() - 1) {
                if (i == 0) {
                    arrayMap = aVar.f336938b;
                } else {
                    for (Map.Entry entry : aVar.f336938b.entrySet()) {
                        String str2 = (String) entry.getKey();
                        if (map.containsKey(str2)) {
                            arrayMap.put(str2, entry.getValue());
                        }
                    }
                }
            }
        }
        return m200591c(list, i + 1, arrayMap);
    }

    /* renamed from: a */
    public final List mo105107a(String str) {
        ArrayList arrayList = new ArrayList(C121487e.f337161a.mo56155i(C121487e.m200741a(str)));
        Collections.sort(arrayList, C121487e.f337162b);
        Map c = m200591c(arrayList, 0, new ArrayMap());
        ArrayList arrayList2 = new ArrayList(c.size());
        for (Map.Entry value : c.entrySet()) {
            arrayList2.add(new C121281a(value.getValue()));
        }
        return arrayList2;
    }

    /* renamed from: b */
    public final C60870cx mo105111b() {
        this.f336940b = new C121332a();
        return C60856cj.m92900i(true);
    }
}
