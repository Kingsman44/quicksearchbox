package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.p2081au.C25559i;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62494dq;
import com.google.lens.p4707j.C62496ds;

/* renamed from: com.google.android.libraries.lens.view.main.l */
/* compiled from: PG */
public final /* synthetic */ class C27432l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C62496ds f75076a;

    public /* synthetic */ C27432l(C62496ds dsVar) {
        this.f75076a = dsVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C62496ds dsVar = this.f75076a;
        C25560j jVar = (C25560j) obj;
        C58974d dVar = C27288ae.f74662a;
        C25559i b = jVar.mo30615b();
        C24226r e = jVar.mo30614a().mo29709e();
        C62494dq dqVar = (C62494dq) dsVar.toBuilder();
        C24226r rVar = C24226r.CAMERA;
        switch (e.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                z = true;
                break;
            case 3:
                z = false;
                break;
            default:
                throw new IllegalStateException("The given source is not correctly handled.");
        }
        dqVar.copyOnWrite();
        C62496ds dsVar2 = (C62496ds) dqVar.instance;
        dsVar2.f168725a |= 4;
        dsVar2.f168728d = z;
        b.mo30613c((C62496ds) dqVar.build());
        return b.mo30611a();
    }
}
