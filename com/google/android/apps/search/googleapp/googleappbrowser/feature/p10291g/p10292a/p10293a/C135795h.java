package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.appactions.serviceengine.api.C147874g;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C135795h implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C135798k f369882a;

    /* renamed from: b */
    public final /* synthetic */ String f369883b;

    public /* synthetic */ C135795h(C135798k kVar, String str) {
        this.f369882a = kVar;
        this.f369883b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C135798k kVar = this.f369882a;
        String str = this.f369883b;
        C37252a c = C37182a.f98142hC.mo40779c();
        C147874g gVar = kVar.f369894e;
        if (gVar != null) {
            gVar.mo111401c(c, "aga_gab");
        }
        C60870cx a = kVar.f369891b.mo46275a(new C135796i(kVar, cVar, str));
        C135797j jVar = new C135797j(kVar, cVar);
        C60856cj.m92911t(a, C47810es.m84974n(jVar), kVar.f369893d);
        return "extractRecipeModelFromJavascript";
    }
}
