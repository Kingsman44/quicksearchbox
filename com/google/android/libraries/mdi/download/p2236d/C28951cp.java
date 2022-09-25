package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60184cv;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.cp */
/* compiled from: PG */
public final /* synthetic */ class C28951cp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78644a;

    /* renamed from: b */
    public final /* synthetic */ C60125aq f78645b;

    /* renamed from: c */
    public final /* synthetic */ C28738bp f78646c;

    public /* synthetic */ C28951cp(C29117fe feVar, C60125aq aqVar, C28738bp bpVar) {
        this.f78644a = feVar;
        this.f78645b = aqVar;
        this.f78646c = bpVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78644a;
        C60125aq aqVar = this.f78645b;
        C28738bp bpVar = this.f78646c;
        C29334dr drVar = (C29334dr) obj;
        if (drVar != null) {
            int i = drVar.f79503e;
            aqVar.copyOnWrite();
            C60126ar arVar = (C60126ar) aqVar.instance;
            C60126ar arVar2 = C60126ar.f162612j;
            arVar.f162614a |= 2;
            arVar.f162616c = i;
        }
        feVar.f78973b.mo34546k(C60184cv.m92534b(bpVar.f78134a.f78133ap), (C60126ar) aqVar.build());
        return C60866ct.f164955a;
    }
}
