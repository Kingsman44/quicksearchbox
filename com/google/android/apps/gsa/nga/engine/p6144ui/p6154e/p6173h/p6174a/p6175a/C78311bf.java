package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78276a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78568w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80568b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C78311bf implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78312bg f215613a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f215614b;

    /* renamed from: c */
    public final /* synthetic */ C80568b f215615c;

    public /* synthetic */ C78311bf(C78312bg bgVar, C58485gu guVar, C80568b bVar) {
        this.f215613a = bgVar;
        this.f215614b = guVar;
        this.f215615c = bVar;
    }

    public final void run() {
        C78312bg bgVar = this.f215613a;
        C58485gu guVar = this.f215614b;
        C80568b bVar = this.f215615c;
        if (!((C58485gu) Collection.EL.stream(guVar).filter(C78310be.f215612a).collect(C58370cn.f155946a)).isEmpty()) {
            C78276a aVar = bgVar.f215616a;
            if (bVar.equals(C80568b.f221151c)) {
                bVar = ((C78568w) aVar).f216317b;
            }
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(((C78568w) aVar).f216318c);
            e.mo55396h(guVar);
            bgVar.f215616a = new C78568w(bVar, e.mo55394f());
            bgVar.mo73301d();
        }
    }
}
