package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.io.FileInputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.d */
/* compiled from: PG */
public final /* synthetic */ class C112118d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311339a;

    /* renamed from: b */
    public final /* synthetic */ String f311340b;

    public /* synthetic */ C112118d(C112127m mVar, String str) {
        this.f311339a = mVar;
        this.f311340b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        FileInputStream fileInputStream;
        C112127m mVar = this.f311339a;
        String str = this.f311340b;
        if (!((Boolean) obj).booleanValue()) {
            mVar.mo99407h(1, "JNI load was unsuccessful. Not loading resources.", new Object[0]);
            return false;
        }
        try {
            C121509q l = C112127m.f311355a.mo105243l("loadCortexResources");
            try {
                fileInputStream = new FileInputStream(str);
                Boolean e = mVar.mo99404e(mVar.mo99406g(fileInputStream, str), -1);
                fileInputStream.close();
                l.close();
                return e;
            } catch (Throwable th) {
                l.close();
                throw th;
            }
        } catch (Throwable th2) {
            mVar.mo99407h(1, "Error while loading cortex: %s", th2);
            throw th2;
        }
        throw th;
    }
}
