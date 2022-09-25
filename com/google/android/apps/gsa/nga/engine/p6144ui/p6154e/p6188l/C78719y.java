package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p5129p.p5131b.C65851t;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.y */
/* compiled from: PG */
public final /* synthetic */ class C78719y implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C78719y f216684a = new C78719y();

    private /* synthetic */ C78719y() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        Optional findFirst = Collection.EL.stream(guVar).findFirst();
        if (!findFirst.isPresent() || (((C65851t) findFirst.get()).f179009a & 1) == 0) {
            return BuildConfig.FLAVOR;
        }
        return ((C65851t) findFirst.get()).f179010b;
    }
}
