package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.io.InputStream;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.e */
/* compiled from: PG */
public final /* synthetic */ class C112119e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311341a;

    /* renamed from: b */
    public final /* synthetic */ String f311342b;

    public /* synthetic */ C112119e(C112127m mVar, String str) {
        this.f311341a = mVar;
        this.f311342b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112127m mVar = this.f311341a;
        String str = this.f311342b;
        if (!((Boolean) obj).booleanValue()) {
            mVar.mo99407h(1, "JNI load was unsuccessful. Not loading resources.", new Object[0]);
            return false;
        }
        C121509q l = C112127m.f311355a.mo105243l("loadCortexResources");
        try {
            Optional flatMap = mVar.f311361f.flatMap(new C112123i());
            if (flatMap.isEmpty()) {
                mVar.mo99407h(1, "Missing %s from DEV ASSETS (include_tapas_assets=true)", str);
                l.close();
                return false;
            }
            Boolean e = mVar.mo99404e(mVar.mo99406g((InputStream) flatMap.get(), str), -1);
            l.close();
            return e;
        } catch (Throwable th) {
            C112113a.m185984a(th, th);
        }
        throw th;
    }
}
