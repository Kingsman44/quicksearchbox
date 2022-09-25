package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9514c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.c.d */
/* compiled from: PG */
public final class C126918d implements C119908e {

    /* renamed from: a */
    public static final C59071e f349434a = C59071e.m91331h();

    /* renamed from: b */
    public final C51809dy f349435b;

    /* renamed from: c */
    public final C119793ao f349436c;

    /* renamed from: d */
    private final C119908e f349437d;

    public C126918d(C119908e eVar, C51809dy dyVar, C119793ao aoVar) {
        this.f349437d = eVar;
        this.f349435b = dyVar;
        this.f349436c = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo104299a() {
        C59052c cVar = (C59052c) f349434a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
        C119834cb cbVar = this.f349436c.f333672a;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        String str = cbVar.f333767a;
        String str2 = this.f349435b.f135936b;
        cVar.mo56379ah(new C59094n(37243));
        cVar.mo56354G("[%s] commit: %s", str, str2);
        C60870cx a = this.f349437d.mo104299a();
        C126917c cVar2 = new C126917c(this);
        C60856cj.m92911t(a, C47810es.m84974n(cVar2), C60826bg.f164896a);
        C69664n.m101060f(a, "result");
        return a;
    }

    /* renamed from: b */
    public final void mo104300b() {
        C59052c cVar = (C59052c) f349434a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
        C119834cb cbVar = this.f349436c.f333672a;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        String str = cbVar.f333767a;
        String str2 = this.f349435b.f135936b;
        cVar.mo56379ah(new C59094n(37244));
        cVar.mo56354G("[%s] abort: %s", str, str2);
        this.f349437d.mo104300b();
    }
}
