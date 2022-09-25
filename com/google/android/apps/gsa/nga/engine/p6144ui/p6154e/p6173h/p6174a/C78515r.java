package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78521ad;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78536as;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.r */
/* compiled from: PG */
public final /* synthetic */ class C78515r implements C83343ad {

    /* renamed from: a */
    public final /* synthetic */ C78516s f216242a;

    public /* synthetic */ C78515r(C78516s sVar) {
        this.f216242a = sVar;
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78245d dVar = (C78245d) obj;
        Boolean bool = (Boolean) obj2;
        Boolean valueOf = Boolean.valueOf(((Boolean) obj3).booleanValue() || this.f216242a.mo73433b());
        C78536as b = C78537at.m126170b();
        if (bool.booleanValue()) {
            ((C78521ad) b).f216265a = 1;
            return b.mo73446a();
        } else if (dVar.mo73183f()) {
            ((C78521ad) b).f216265a = 4;
            return b.mo73446a();
        } else if (valueOf.booleanValue()) {
            ((C78521ad) b).f216265a = 11;
            return b.mo73446a();
        } else {
            ((C78521ad) b).f216265a = 2;
            return b.mo73446a();
        }
    }
}
