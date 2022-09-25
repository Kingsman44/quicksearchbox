package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58759qy;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bf */
/* compiled from: PG */
public final /* synthetic */ class C81754bf implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81772bx f223608a;

    /* renamed from: b */
    public final /* synthetic */ C81722aa f223609b;

    public /* synthetic */ C81754bf(C81772bx bxVar, C81722aa aaVar) {
        this.f223608a = bxVar;
        this.f223609b = aaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81801t tVar;
        C81772bx bxVar = this.f223608a;
        C81722aa aaVar = this.f223609b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bxVar.f223657i.ifPresent(C81730ai.f223577a);
        if (booleanValue) {
            if (aaVar.f223553f.getVisibility() == 8) {
                tVar = bxVar.f223652d.mo75318a(aaVar.f223553f);
            } else {
                tVar = new C81797p(new C58759qy(aaVar.f223553f));
            }
        } else if (aaVar.f223553f.getVisibility() == 0) {
            tVar = bxVar.f223652d.mo75319b(aaVar.f223553f);
        } else {
            tVar = new C81791j(new C58759qy(aaVar.f223553f));
        }
        tVar.mo75317b();
        bxVar.f223657i = Optional.m71637of(tVar);
    }
}
