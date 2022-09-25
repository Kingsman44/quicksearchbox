package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9204c;

import android.util.ArrayMap;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121281a;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121282b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.c.a */
/* compiled from: PG */
public final /* synthetic */ class C121348a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C121282b f336964a;

    /* renamed from: b */
    public final /* synthetic */ String f336965b;

    public /* synthetic */ C121348a(C121282b bVar, String str) {
        this.f336964a = bVar;
        this.f336965b = str;
    }

    public final Object call() {
        List<C121281a> a = this.f336964a.mo105107a(this.f336965b);
        ArrayMap arrayMap = new ArrayMap();
        for (C121281a aVar : a) {
            C48708bp bpVar = (C48708bp) aVar.f336855a;
            C48672ag b = C48672ag.m85259b(bpVar.f126013b);
            if (b == null) {
                b = C48672ag.UNKNOWN;
            }
            Map.EL.putIfAbsent(arrayMap, b, new ArrayList());
            ((List) arrayMap.get(b)).add(bpVar);
        }
        ArrayMap arrayMap2 = new ArrayMap();
        for (Map.Entry entry : arrayMap.entrySet()) {
            arrayMap2.put((C48672ag) entry.getKey(), C58485gu.m89842j((Collection) entry.getValue()));
        }
        return arrayMap2;
    }
}
