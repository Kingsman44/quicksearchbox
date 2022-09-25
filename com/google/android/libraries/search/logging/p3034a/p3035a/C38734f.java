package com.google.android.libraries.search.logging.p3034a.p3035a;

import android.text.TextUtils;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.libraries.search.logging.p3034a.p3036b.C38753b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.logging.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C38734f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C38737i f102259a;

    /* renamed from: b */
    public final /* synthetic */ C38753b f102260b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f102261c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f102262d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f102263e;

    public /* synthetic */ C38734f(C38737i iVar, C38753b bVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f102259a = iVar;
        this.f102260b = bVar;
        this.f102261c = cxVar;
        this.f102262d = cxVar2;
        this.f102263e = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C38737i iVar = this.f102259a;
        C38753b bVar = this.f102260b;
        C60870cx cxVar = this.f102261c;
        C60870cx cxVar2 = this.f102262d;
        C60870cx cxVar3 = this.f102263e;
        C143657j jVar = (C143657j) C60856cj.m92909r(cxVar);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        String str = (String) C60856cj.m92909r(cxVar3);
        bVar.mo41587a(jVar);
        if (booleanValue) {
            C58976aa aaVar = C58975e.f156826a;
            jVar.hashCode();
            iVar.f102266a.add(jVar);
            if (!TextUtils.isEmpty(str)) {
                C60870cx g = iVar.f102270e.mo38007g(str);
                C38730b bVar2 = C38730b.f102253a;
                return C60922j.m93044g(g, C47810es.m84963c(bVar2), C60826bg.f164896a);
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            jVar.mo118992a();
        }
        return C60856cj.m92900i(false);
    }
}
