package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C27861ar implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27877bg f75941a;

    public /* synthetic */ C27861ar(C27877bg bgVar) {
        this.f75941a = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C27877bg bgVar = this.f75941a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return C60856cj.m92899h(new C27894k());
        }
        C60870cx c = bgVar.f75978d.mo33333c(guVar, false, false);
        C27847ad adVar = C27847ad.f75917a;
        C60870cx g = C60922j.m93044g(c, C47810es.m84963c(adVar), C60826bg.f164896a);
        return C47638k.m84753d(g, C47633f.m84733g(g).mo51516i(new C27866aw(bgVar), C60826bg.f164896a)).mo51520a(new C27867ax(g), C60826bg.f164896a);
    }
}
