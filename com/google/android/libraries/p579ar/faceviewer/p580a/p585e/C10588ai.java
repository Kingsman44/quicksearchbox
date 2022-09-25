package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.research.xeno.effect.C66412o;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.ai */
/* compiled from: PG */
public final /* synthetic */ class C10588ai implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C10600au f35414a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f35415b;

    /* renamed from: c */
    public final /* synthetic */ List f35416c;

    public /* synthetic */ C10588ai(C10600au auVar, C60870cx cxVar, List list) {
        this.f35414a = auVar;
        this.f35415b = cxVar;
        this.f35416c = list;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C10600au auVar = this.f35414a;
        C60870cx cxVar = this.f35415b;
        List list = this.f35416c;
        if (((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            return C2169h.m6027a(new C10620u((C10622w) C60856cj.m92909r(auVar.f35433c), list, (C66412o) C60856cj.m92909r(auVar.f35434d)));
        }
        return C60856cj.m92899h(new RuntimeException("GPU not supported."));
    }
}
