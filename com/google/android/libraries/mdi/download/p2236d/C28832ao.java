package com.google.android.libraries.mdi.download.p2236d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.mdi.download.d.ao */
/* compiled from: PG */
public final /* synthetic */ class C28832ao implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78327a;

    /* renamed from: b */
    public final /* synthetic */ Map f78328b;

    /* renamed from: c */
    public final /* synthetic */ Set f78329c;

    public /* synthetic */ C28832ao(C29117fe feVar, Map map, Set set) {
        this.f78327a = feVar;
        this.f78328b = map;
        this.f78329c = set;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78327a;
        Map map = this.f78328b;
        Set set = this.f78329c;
        Void voidR = (Void) obj;
        if (map.isEmpty()) {
            return C60866ct.f164955a;
        }
        C60870cx h = feVar.mo34585h();
        C28892bg bgVar = new C28892bg(feVar, set);
        return C60922j.m93045h(h, C47810es.m84966f(bgVar), feVar.f78980i);
    }
}
