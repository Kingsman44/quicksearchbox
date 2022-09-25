package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.grammar.C76143u;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58495hd;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.b */
/* compiled from: PG */
public final class C79049b implements C76143u {

    /* renamed from: a */
    public final C58495hd f217378a;

    public C79049b(String str) {
        HashMap hashMap = new HashMap();
        for (String i : C58869cf.m90938d(",").mo56152f(C58911u.f156751b).mo56151a().mo56153g(str)) {
            List i2 = C58869cf.m90938d("=").mo56152f(C58911u.f156751b).mo56156j().mo56155i(i);
            if (i2.size() == 1) {
                hashMap.put((String) i2.get(0), "1");
            } else {
                hashMap.put((String) i2.get(0), (String) i2.get(1));
            }
        }
        this.f217378a = C58495hd.m89898l(hashMap);
    }

    /* renamed from: a */
    public final C58495hd mo72083a() {
        throw null;
    }
}
