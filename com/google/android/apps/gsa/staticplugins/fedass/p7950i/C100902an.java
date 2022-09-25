package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.an */
/* compiled from: PG */
public final /* synthetic */ class C100902an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100908at f281916a;

    /* renamed from: b */
    public final /* synthetic */ String f281917b;

    public /* synthetic */ C100902an(C100908at atVar, String str) {
        this.f281916a = atVar;
        this.f281917b = str;
    }

    public final C60870cx apply(Object obj) {
        C100908at atVar = this.f281916a;
        String str = this.f281917b;
        C132797e eVar = ((C132798f) obj).f362325i;
        if (eVar == null) {
            eVar = C132797e.f362307g;
        }
        String str2 = eVar.f362313e;
        if (!str2.isEmpty()) {
            C100908at.m167136f(new File(str2));
        }
        return atVar.f281925b.mo92025i(str, C100905aq.f281923a);
    }
}
