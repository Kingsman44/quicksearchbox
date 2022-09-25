package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.t */
/* compiled from: PG */
public final /* synthetic */ class C79133t implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78983aj f217531a;

    /* renamed from: b */
    public final /* synthetic */ C80513b f217532b;

    public /* synthetic */ C79133t(C78983aj ajVar, C80513b bVar) {
        this.f217531a = ajVar;
        this.f217532b = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        return (C58485gu) Collection.EL.stream((C58485gu) obj).map(new C79132s(this.f217531a, this.f217532b)).collect(C58370cn.f155946a);
    }
}
