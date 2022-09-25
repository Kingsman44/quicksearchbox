package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.C131856e;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10025c.C131857f;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131860c;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131861d;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.e */
/* compiled from: PG */
public final /* synthetic */ class C131884e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131893n f360139a;

    /* renamed from: b */
    public final /* synthetic */ C131861d f360140b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f360141c;

    /* renamed from: d */
    public final /* synthetic */ String f360142d;

    public /* synthetic */ C131884e(C131893n nVar, C131861d dVar, C60870cx cxVar, String str) {
        this.f360139a = nVar;
        this.f360140b = dVar;
        this.f360141c = cxVar;
        this.f360142d = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        boolean z;
        Optional optional;
        C131893n nVar = this.f360139a;
        C131861d dVar = this.f360140b;
        C60870cx cxVar = this.f360141c;
        String str = this.f360142d;
        C131860c cVar = dVar.f360096c;
        if (cVar == null) {
            cVar = C131860c.f360088c;
        }
        try {
            C131857f.m214332a(cVar);
            z = true;
        } catch (RuntimeException unused) {
            z = false;
        }
        String str2 = (String) C60856cj.m92909r(cxVar);
        if (z) {
            optional = Optional.m71637of(cVar);
        } else {
            optional = Optional.empty();
        }
        return C47633f.m84733g(nVar.f360165f.f360081a.mo41568b(C58485gu.m89846n(C131856e.m214331a(str2, str, optional)), C39226b.TAG_ASSISTANT_ROUTINES)).mo51515h(new C131883d(str), nVar.f360163d);
    }
}
