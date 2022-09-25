package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.android.apps.gsa.p6482q.p6483a.C84231d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.y */
/* compiled from: PG */
public final /* synthetic */ class C102194y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C102195z f285103a;

    public /* synthetic */ C102194y(C102195z zVar) {
        this.f285103a = zVar;
    }

    public final Object apply(Object obj) {
        C102195z zVar = this.f285103a;
        if (!((C84231d) obj).mo77687b().f130409c) {
            ((C59052c) ((C59052c) C102128aa.f284912a.mo56224b()).mo56372aa(20574)).mo56386p("new user; show Unified enrollment option");
            zVar.f285104a.f284916e.set(Optional.m71637of(false));
        } else {
            ((C59052c) ((C59052c) C102128aa.f284912a.mo56224b()).mo56372aa(20573)).mo56386p("unified user; show existing user banner");
            zVar.f285104a.f284916e.set(Optional.m71637of(true));
        }
        return new C4645z(C4632m.f14549a);
    }
}
