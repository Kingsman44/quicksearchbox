package com.google.android.apps.gsa.staticplugins.nga.p8079r;

import com.google.android.apps.gsa.opa.p6441f.p6442a.C83619ah;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83622ak;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83623al;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83629ar;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.common.base.C58852bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.k */
/* compiled from: PG */
public final /* synthetic */ class C103752k implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C103763v f288916a;

    public /* synthetic */ C103752k(C103763v vVar) {
        this.f288916a = vVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C103763v vVar = this.f288916a;
        C83619ah ahVar = (C83619ah) obj;
        C83622ak akVar = (C83622ak) C83623al.f227970c.createBuilder();
        C86697a aVar = vVar.f288928c;
        if (aVar != null) {
            long j = ((C86775r) aVar).f234381c;
            akVar.copyOnWrite();
            C83623al alVar = (C83623al) akVar.instance;
            alVar.f227972a |= 1;
            alVar.f227973b = j;
        }
        C83623al alVar2 = (C83623al) akVar.build();
        ahVar.copyOnWrite();
        C83629ar arVar = (C83629ar) ahVar.instance;
        C83629ar arVar2 = C83629ar.f227979f;
        alVar2.getClass();
        arVar.f227983c = alVar2;
        arVar.f227982b = 6;
    }
}
