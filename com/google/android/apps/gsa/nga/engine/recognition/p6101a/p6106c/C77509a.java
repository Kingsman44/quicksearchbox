package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82313ao;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.a */
/* compiled from: PG */
final class C77509a {

    /* renamed from: a */
    public final C83305i f213571a;

    /* renamed from: b */
    public final C83334w f213572b;

    /* renamed from: c */
    public final C76092h f213573c;

    public C77509a(C83305i iVar, C83334w wVar, C76092h hVar) {
        this.f213571a = iVar;
        this.f213572b = wVar;
        this.f213573c = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72593a(long j, C77566as asVar) {
        C83305i iVar = this.f213571a;
        int m = asVar.mo72690m();
        String a = C77568au.m124486a(m);
        if (m != 0) {
            iVar.mo75579d(new C82313ao("MIC_DURATION2", Double.valueOf((double) j), this.f213573c.mo72021b().mo72042g(), a));
            return;
        }
        throw null;
    }
}
