package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.g */
/* compiled from: PG */
public final /* synthetic */ class C79024g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f217316a;

    public /* synthetic */ C79024g(C58485gu guVar) {
        this.f217316a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f217316a;
        C58485gu guVar2 = (C58485gu) obj;
        C58490gz gzVar = new C58490gz(4);
        for (int i = 0; i < guVar.size(); i++) {
            ((Optional) guVar2.get(i)).ifPresent(new C79020c(gzVar, (String) guVar.get(i)));
        }
        return gzVar.mo55427f(false);
    }
}
