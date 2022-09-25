package com.google.android.apps.gsa.nga.engine.p6032h.p6033a;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80162ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.h.a.e */
/* compiled from: PG */
public final /* synthetic */ class C76148e implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C76148e f211124a = new C76148e();

    private /* synthetic */ C76148e() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80162ck ckVar;
        C80162ck ckVar2;
        C80275dd ddVar = (C80275dd) obj;
        if (ddVar.f220290a == 4) {
            ckVar = (C80162ck) ddVar.f220291b;
        } else {
            ckVar = C80162ck.f219968b;
        }
        ckVar.f219970a.size();
        if (ddVar.f220290a == 4) {
            ckVar2 = (C80162ck) ddVar.f220291b;
        } else {
            ckVar2 = C80162ck.f219968b;
        }
        return (C58485gu) Collection.EL.stream(ckVar2.f219970a).map(C76147d.f211123a).collect(C58370cn.f155946a);
    }
}
