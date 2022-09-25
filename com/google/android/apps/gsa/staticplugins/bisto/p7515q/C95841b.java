package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.p10712d.C142465gi;
import com.google.android.p10712d.C142468gl;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.b */
/* compiled from: PG */
public final /* synthetic */ class C95841b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95848i f268387a;

    /* renamed from: b */
    public final /* synthetic */ C124548d f268388b;

    public /* synthetic */ C95841b(C95848i iVar, C124548d dVar) {
        this.f268387a = iVar;
        this.f268388b = dVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95848i iVar = this.f268387a;
        C124548d dVar = this.f268388b;
        C142468gl glVar = (C142468gl) obj;
        C89492cd cdVar = iVar.f268402d;
        String k = iVar.f268400b.mo89270k();
        String c = iVar.mo89818c(dVar, glVar);
        String str = glVar.f386631j;
        Collection c2 = iVar.f268401c.mo83586c(glVar);
        String str2 = glVar.f386629h;
        String str3 = glVar.f386630i;
        C142465gi a = C142465gi.m231087a(glVar.f386628g);
        if (a == null) {
            a = C142465gi.DEVICE_TYPE_UNKNOWN;
        }
        cdVar.mo83389ae(k, c, str, c2, str2, str3, a.equals(C142465gi.DEVICE_TYPE_HOTWORD_MODEL));
        return C118826c.f331422a;
    }
}
