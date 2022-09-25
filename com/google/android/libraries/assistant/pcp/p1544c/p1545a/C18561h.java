package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C18561h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18571r f52573a;

    public /* synthetic */ C18561h(C18571r rVar) {
        this.f52573a = rVar;
    }

    public final C60870cx apply(Object obj) {
        C18571r rVar = this.f52573a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map.EL.forEach((C58495hd) obj, new C18568o(rVar, arrayList, arrayList2));
        return C47638k.m84750a(arrayList2).mo51520a(new C18569p(arrayList2, arrayList), rVar.f52590c);
    }
}
