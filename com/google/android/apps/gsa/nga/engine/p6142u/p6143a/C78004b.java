package com.google.android.apps.gsa.nga.engine.p6142u.p6143a;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.nga.engine.u.a.b */
/* compiled from: PG */
public final /* synthetic */ class C78004b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78006d f214827a;

    public /* synthetic */ C78004b(C78006d dVar) {
        this.f214827a = dVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C78005c cVar;
        C78006d dVar = this.f214827a;
        synchronized (dVar.f214835c) {
            if (dVar.f214836d) {
                cVar = C78005c.WAS_ALREADY_LOADED;
            } else {
                boolean booleanValue = ((Boolean) dVar.f214833a.map(C78003a.f214826a).orElse(false)).booleanValue();
                dVar.f214836d = booleanValue;
                if (booleanValue) {
                    cVar = C78005c.LOADED_FROM_APK;
                } else {
                    cVar = C78005c.FAILED;
                }
            }
        }
        return cVar;
    }
}
