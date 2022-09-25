package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.d */
/* compiled from: PG */
public final /* synthetic */ class C124903d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124914k f344618a;

    /* renamed from: b */
    public final /* synthetic */ String f344619b;

    /* renamed from: c */
    public final /* synthetic */ String f344620c;

    /* renamed from: d */
    public final /* synthetic */ C124825a f344621d;

    public /* synthetic */ C124903d(C124914k kVar, String str, String str2, C124825a aVar) {
        this.f344618a = kVar;
        this.f344619b = str;
        this.f344620c = str2;
        this.f344621d = aVar;
    }

    public final C60870cx apply(Object obj) {
        C124914k kVar = this.f344618a;
        String str = this.f344619b;
        String str2 = this.f344620c;
        C124825a aVar = this.f344621d;
        if (!((C124679cr) obj).f343963f) {
            return C60866ct.f164955a;
        }
        str2.getClass();
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        if (!kVar.f344650d) {
            cnVar.copyOnWrite();
            C49891cv cvVar = (C49891cv) cnVar.instance;
            cvVar.f129666d = 1;
            cvVar.f129663a |= 2;
        }
        return kVar.f344651e.mo41441a().mo51516i(new C124910g(kVar, str2, cnVar, aVar), kVar.f344648b).mo51516i(new C124911h(kVar, str, cnVar), kVar.f344648b).mo51516i(C124912i.f344645a, C60826bg.f164896a);
    }
}
