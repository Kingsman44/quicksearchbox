package com.google.android.libraries.p11012aj.p11015c;

import com.google.android.libraries.p11012aj.C147605d;
import com.google.android.libraries.p11012aj.C147607f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import java.util.Map;

/* renamed from: com.google.android.libraries.aj.c.c */
/* compiled from: PG */
public final /* synthetic */ class C147603c implements C147607f {

    /* renamed from: a */
    public final /* synthetic */ C147605d f398408a;

    /* renamed from: b */
    public final /* synthetic */ Map f398409b;

    /* renamed from: c */
    public final /* synthetic */ Map f398410c;

    public /* synthetic */ C147603c(C147605d dVar, Map map, Map map2) {
        this.f398408a = dVar;
        this.f398409b = map;
        this.f398410c = map2;
    }

    /* renamed from: a */
    public final void mo41448a() {
        C147605d dVar = this.f398408a;
        Map map = this.f398409b;
        Map map2 = this.f398410c;
        C47558bi a = C47831fm.m85006a("Startup Listeners");
        try {
            if (!dVar.mo124374a()) {
                C147604d.m240679a(map);
            } else if (Math.random() < 0.5d) {
                C147604d.m240679a(map);
                C147604d.m240679a(map2);
            } else {
                C147604d.m240679a(map2);
                C147604d.m240679a(map);
            }
            a.close();
            return;
        } catch (Throwable th) {
            C147602b.m240677a(th, th);
        }
        throw th;
    }
}
