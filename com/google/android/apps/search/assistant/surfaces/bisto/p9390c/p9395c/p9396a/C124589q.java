package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C124589q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343696a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343697b;

    /* renamed from: c */
    public final /* synthetic */ String f343698c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f343699d;

    public /* synthetic */ C124589q(C124571aq aqVar, C60870cx cxVar, String str, C60870cx cxVar2) {
        this.f343696a = aqVar;
        this.f343697b = cxVar;
        this.f343698c = str;
        this.f343699d = cxVar2;
    }

    public final C60870cx apply(Object obj) {
        C124571aq aqVar = this.f343696a;
        C60870cx cxVar = this.f343697b;
        String str = this.f343698c;
        C60870cx cxVar2 = this.f343699d;
        List list = (List) obj;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        C58838bb.m90884s(optional.isPresent(), "Can not generate client instance id");
        C124550f fVar = aqVar.f343665g;
        String str2 = (String) C60856cj.m92909r(cxVar2);
        C58838bb.m90866a(str2, "The service is bound to a non-google account");
        fVar.mo83418x(str, str2, (String) optional.get());
        return C60866ct.f164955a;
    }
}
