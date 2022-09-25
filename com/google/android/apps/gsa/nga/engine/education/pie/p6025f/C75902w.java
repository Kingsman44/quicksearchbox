package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.engine.ag.a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.w */
/* compiled from: PG */
public final /* synthetic */ class C75902w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75903x f210613a;

    public /* synthetic */ C75902w(C75903x xVar) {
        this.f210613a = xVar;
    }

    public final void run() {
        C75903x xVar = this.f210613a;
        a b = xVar.f210615a.b(xVar.f210616b);
        a aVar = a.a;
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            xVar.mo71950j(C80265t.WAIT_FOR_FOREGROUND_APP_ERROR);
        } else if (ordinal == 1) {
            xVar.mo71951k();
        } else if (ordinal == 2) {
            xVar.mo71950j(C80265t.WAIT_FOR_FOREGROUND_APP_NEGATIVE);
        }
    }
}
