package com.google.android.libraries.mdi.download.p2236d.p2242f;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.d.f.g */
/* compiled from: PG */
public final /* synthetic */ class C29093g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29097k f78944a;

    /* renamed from: b */
    public final /* synthetic */ String f78945b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f78946c;

    public /* synthetic */ C29093g(C29097k kVar, String str, C60870cx cxVar) {
        this.f78944a = kVar;
        this.f78945b = str;
        this.f78946c = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29097k kVar = this.f78944a;
        String str = this.f78945b;
        C60870cx cxVar = this.f78946c;
        try {
            kVar.f78949a.mo34563a(str, kVar.f78950b.size() + 1);
            kVar.f78950b.put(str, cxVar);
            return C60866ct.f164955a;
        } catch (Exception e) {
            C29045l.m53938j(e, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", str);
            return C60856cj.m92899h(e);
        }
    }
}
