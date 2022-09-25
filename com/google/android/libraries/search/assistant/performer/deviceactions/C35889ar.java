package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.os.Build;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35824am;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35825an;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58890d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ar */
/* compiled from: PG */
public final /* synthetic */ class C35889ar implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35894aw f94016a;

    /* renamed from: b */
    public final /* synthetic */ C52115fu f94017b;

    /* renamed from: c */
    public final /* synthetic */ Optional f94018c;

    public /* synthetic */ C35889ar(C35894aw awVar, C52115fu fuVar, Optional optional) {
        this.f94016a = awVar;
        this.f94017b = fuVar;
        this.f94018c = optional;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C35894aw awVar = this.f94016a;
        C52115fu fuVar = this.f94017b;
        Optional optional = this.f94018c;
        C52070ec ecVar = (C52070ec) obj;
        if (C35894aw.m64288b(ecVar)) {
            return C60856cj.m92900i(ecVar);
        }
        C35845bg.m64246f(fuVar);
        if ((fuVar.f136755a & 1) == 0 || fuVar.f136756b.isEmpty() || !C58890d.m90990e(Build.MANUFACTURER, "google") || (!Build.MODEL.contains("Pixel") && !Build.MODEL.contains("Nexus"))) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.UNAVAILABLE, String.format("Setting %s not supported by Phone Buddy API.", new Object[]{C35845bg.m64246f(fuVar)})));
        }
        C35825an anVar = awVar.f94027c;
        String str = fuVar.f136756b;
        C35932a.m64316a(anVar.f93879e, C35845bg.m64246f(fuVar));
        C60870cx a = anVar.f93877c.mo39872a(anVar.f93876b.mo39871a(str), fuVar);
        if (!optional.isPresent() || ((C52115fu) optional.get()).f136756b.isEmpty()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = anVar.f93877c.mo39872a(anVar.f93876b.mo39871a(((C52115fu) optional.get()).f136756b), (C52115fu) optional.get());
        }
        return C47638k.m84751b(cxVar, a).mo51520a(C47810es.m84978r(new C35824am(anVar, cxVar, a, fuVar, str)), anVar.f93878d);
    }
}
