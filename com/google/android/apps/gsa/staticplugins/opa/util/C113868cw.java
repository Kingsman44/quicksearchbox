package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cw */
/* compiled from: PG */
public final class C113868cw {

    /* renamed from: a */
    private final Context f315285a;

    /* renamed from: b */
    private final C86124t f315286b;

    public C113868cw(Context context, C86124t tVar) {
        this.f315285a = context;
        this.f315286b = tVar;
    }

    /* renamed from: a */
    public final boolean mo100727a() {
        try {
            this.f315285a.getPackageManager().getApplicationInfo(this.f315286b.mo79758x(C90014bt.f247052Q), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
