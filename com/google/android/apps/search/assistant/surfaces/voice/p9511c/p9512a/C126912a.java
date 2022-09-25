package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9512a;

import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C126912a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f349427a;

    public /* synthetic */ C126912a(Map map) {
        this.f349427a = map;
    }

    public final Object call() {
        Map map = this.f349427a;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            gzVar.mo55429h(entry.getKey(), C60856cj.m92909r((Future) entry.getValue()));
        }
        return gzVar.mo55427f(false);
    }
}
