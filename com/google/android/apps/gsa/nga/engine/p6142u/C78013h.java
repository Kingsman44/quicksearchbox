package com.google.android.apps.gsa.nga.engine.p6142u;

import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.libraries.assistant.p1363c.p1382d.C17214d;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.nga.engine.u.h */
/* compiled from: PG */
public final /* synthetic */ class C78013h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78016k f214848a;

    /* renamed from: b */
    public final /* synthetic */ C79850ah f214849b;

    public /* synthetic */ C78013h(C78016k kVar, C79850ah ahVar) {
        this.f214848a = kVar;
        this.f214849b = ahVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C78016k kVar = this.f214848a;
        C79850ah ahVar = this.f214849b;
        Void voidR = (Void) obj;
        boolean z = kVar.f214861i.mo23239a(C78002a.f214825a) != C17214d.NOT_LOADED;
        if (z) {
            ahVar.mo74257d();
        } else {
            ahVar.mo74254a();
        }
        synchronized (kVar.f214859g) {
            kVar.f214860h = z;
        }
        return Boolean.valueOf(z);
    }
}
