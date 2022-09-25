package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15767c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1210c.p1211a.C15948d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.suggestion.C53473c;
import com.google.assistant.suggestion.RegisterDisplayParams;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.l */
/* compiled from: PG */
public final /* synthetic */ class C16317l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16325t f48007a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f48008b;

    public /* synthetic */ C16317l(C16325t tVar, Boolean bool) {
        this.f48007a = tVar;
        this.f48008b = bool;
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C16325t tVar = this.f48007a;
        Boolean bool = this.f48008b;
        Boolean bool2 = (Boolean) obj;
        C15948d dVar = tVar.f48029i;
        boolean z = false;
        if (!((Boolean) dVar.f47322d.mo17428b()).booleanValue()) {
            cxVar = C60856cj.m92900i(false);
        } else {
            C53473c a = C53473c.m86820a();
            a.f140342d = 8;
            a.f140339a = 3;
            a.f140340b = 30;
            cxVar = dVar.f47320b.mo22920f("voiceplate_immersive_display_id", new RegisterDisplayParams(a), C15767c.f46972a, 3);
        }
        C46459k.m82829b(cxVar, "Failed to register discovery manager", new Object[0]);
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
