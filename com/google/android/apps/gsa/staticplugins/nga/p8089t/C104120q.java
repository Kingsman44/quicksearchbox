package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.q */
/* compiled from: PG */
public final /* synthetic */ class C104120q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104123t f289639a;

    /* renamed from: b */
    public final /* synthetic */ boolean f289640b;

    /* renamed from: c */
    public final /* synthetic */ Optional f289641c;

    /* renamed from: d */
    public final /* synthetic */ boolean f289642d;

    public /* synthetic */ C104120q(C104123t tVar, boolean z, Optional optional, boolean z2) {
        this.f289639a = tVar;
        this.f289640b = z;
        this.f289641c = optional;
        this.f289642d = z2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C104123t tVar = this.f289639a;
        boolean z = this.f289640b;
        Optional optional = this.f289641c;
        boolean z2 = this.f289642d;
        C28708an anVar = (C28708an) obj;
        C60870cx c = z ? tVar.mo93943c(optional, anVar) : C60866ct.f164955a;
        if (z2) {
            cxVar = tVar.mo93943c(Optional.empty(), anVar);
        } else {
            cxVar = C60866ct.f164955a;
        }
        return tVar.mo93944d(c, cxVar);
    }
}
