package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C28708an;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fu */
/* compiled from: PG */
public final /* synthetic */ class C104056fu implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104057fv f289528a;

    /* renamed from: b */
    public final /* synthetic */ C28708an f289529b;

    public /* synthetic */ C104056fu(C104057fv fvVar, C28708an anVar) {
        this.f289528a = fvVar;
        this.f289529b = anVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104057fv fvVar = this.f289528a;
        C28708an anVar = this.f289529b;
        if (((Boolean) obj).booleanValue()) {
            String str = anVar.f77997b;
            return null;
        }
        fvVar.f289530a.mo93948a(19, String.format(Locale.US, "Failed to add %s to MDD", new Object[]{anVar.f77997b}));
        return null;
    }
}
