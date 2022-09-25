package com.google.android.libraries.mdi.download.p2236d.p2242f;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.d.f.e */
/* compiled from: PG */
public final /* synthetic */ class C29091e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29097k f78940a;

    /* renamed from: b */
    public final /* synthetic */ String f78941b;

    public /* synthetic */ C29091e(C29097k kVar, String str) {
        this.f78940a = kVar;
        this.f78941b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29097k kVar = this.f78940a;
        String str = this.f78941b;
        try {
            kVar.f78950b.remove(str);
            kVar.f78949a.mo34564b(str, kVar.f78950b.size());
            return C60866ct.f164955a;
        } catch (Exception e) {
            C29045l.m53938j(e, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", str);
            return C60856cj.m92899h(e);
        }
    }
}
