package com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b.f */
/* compiled from: PG */
public final /* synthetic */ class C9678f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C9684l f33459a;

    /* renamed from: b */
    public final /* synthetic */ C86054o f33460b;

    public /* synthetic */ C9678f(C9684l lVar, C86054o oVar) {
        this.f33459a = lVar;
        this.f33460b = oVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C9684l lVar = this.f33459a;
        C86054o oVar = this.f33460b;
        ArrayList arrayList = new ArrayList();
        for (String str : oVar.mo79685s()) {
            arrayList.add(lVar.f33472b.mo28209i(lVar.mo17953b(str), "initPersonalResponseAllowedForAccount", new C9673a(lVar, str)));
        }
        C60870cx g = C60922j.m93044g(C60856cj.m92906o(arrayList), C9674b.f33453a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
