package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.b.g */
/* compiled from: PG */
public final /* synthetic */ class C18536g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f52522a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52523b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f52524c;

    /* renamed from: d */
    public final /* synthetic */ C18579g f52525d;

    public /* synthetic */ C18536g(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C18579g gVar) {
        this.f52522a = cxVar;
        this.f52523b = cxVar2;
        this.f52524c = cxVar3;
        this.f52525d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f52522a;
        C60870cx cxVar2 = this.f52523b;
        C60870cx cxVar3 = this.f52524c;
        C18579g gVar = this.f52525d;
        return (C60870cx) ((Optional) C60856cj.m92909r(cxVar3)).map(new C18533d(gVar, (Optional) C60856cj.m92909r(cxVar), (Optional) C60856cj.m92909r(cxVar2))).orElse(C60856cj.m92899h(new IllegalArgumentException(String.format("FeatureType with id [%s] has no FeatureConfig associated.", new Object[]{gVar}))));
    }
}
