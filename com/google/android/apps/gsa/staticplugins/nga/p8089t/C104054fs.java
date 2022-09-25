package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82335bj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82564jw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82565jx;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fs */
/* compiled from: PG */
public final /* synthetic */ class C104054fs implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104055ft f289519a;

    public /* synthetic */ C104054fs(C104055ft ftVar) {
        this.f289519a = ftVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104055ft ftVar = this.f289519a;
        Exception exc = (Exception) obj;
        ftVar.f289526g.mo93949b(21, exc, "NGA Priority download failed");
        C83305i iVar = ftVar.f289524e;
        C82564jw c = C82565jx.m131538c();
        String name = exc.getClass().getName();
        if (name != null) {
            ((C82335bj) c).f224924b = name;
            iVar.mo75579d(c.mo75763a());
            return C118826c.f331422a;
        }
        throw new NullPointerException("Null exception");
    }
}
