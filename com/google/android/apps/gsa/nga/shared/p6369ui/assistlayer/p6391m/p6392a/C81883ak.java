package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80803i;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81986aw;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C81883ak implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223907a;

    public /* synthetic */ C81883ak(C81889aq aqVar) {
        this.f223907a = aqVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81889aq aqVar = this.f223907a;
        C81986aw awVar = aqVar.f223930o;
        float a = ((C80803i) obj).mo74420a();
        float f = awVar.f224140b;
        float[] fArr = awVar.f224139a;
        int i = awVar.f224141c;
        float f2 = f - fArr[i];
        awVar.f224140b = f2;
        fArr[i] = a;
        awVar.f224140b = f2 + a;
        boolean z = true;
        int i2 = i + 1;
        awVar.f224141c = i2;
        if (i2 == 3) {
            awVar.f224141c = 0;
        }
        C83357g gVar = aqVar.f223929n;
        if (((double) (aqVar.f223930o.f224140b / 3.0f)) < 0.30000001192092896d) {
            z = false;
        }
        gVar.mo76660b(Boolean.valueOf(z));
    }
}
