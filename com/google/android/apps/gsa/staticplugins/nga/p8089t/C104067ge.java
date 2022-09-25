package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C28708an;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ge */
/* compiled from: PG */
public final /* synthetic */ class C104067ge implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104073gk f289547a;

    /* renamed from: b */
    public final /* synthetic */ C28708an f289548b;

    /* renamed from: c */
    public final /* synthetic */ boolean f289549c;

    public /* synthetic */ C104067ge(C104073gk gkVar, C28708an anVar, boolean z) {
        this.f289547a = gkVar;
        this.f289548b = anVar;
        this.f289549c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104073gk gkVar = this.f289547a;
        C28708an anVar = this.f289548b;
        boolean z = this.f289549c;
        Boolean bool = (Boolean) obj;
        String concat = String.valueOf(anVar.f77997b).concat(true != z ? " without an account" : " with an account");
        if (bool.booleanValue()) {
            int i = anVar.f77999d;
            return null;
        }
        gkVar.f289560b.mo93948a(3, String.format(Locale.US, "Failed to add %s to MDD", new Object[]{concat}));
        return null;
    }
}
