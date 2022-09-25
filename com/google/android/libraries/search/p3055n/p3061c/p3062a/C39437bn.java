package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39499d;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.bn */
/* compiled from: PG */
public final /* synthetic */ class C39437bn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103823a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103824b;

    /* renamed from: c */
    public final /* synthetic */ HotwordInformation f103825c;

    public /* synthetic */ C39437bn(C39479cu cuVar, C39411b bVar, HotwordInformation hotwordInformation) {
        this.f103823a = cuVar;
        this.f103824b = bVar;
        this.f103825c = hotwordInformation;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103823a;
        C39411b bVar = this.f103824b;
        HotwordInformation hotwordInformation = this.f103825c;
        C39499d dVar = (C39499d) obj;
        cuVar.f103970u.mo41870d(C37176a.f97235hi.mo40779c(), bVar);
        cuVar.f103943E = C58833ax.m90834k(true);
        if (dVar == null) {
            throw new NullPointerException("Null hotwordConfigResponse");
        } else if (hotwordInformation != null) {
            return C60856cj.m92900i(new C39643y(hotwordInformation, dVar));
        } else {
            throw new NullPointerException("Null hotwordInformation");
        }
    }
}
