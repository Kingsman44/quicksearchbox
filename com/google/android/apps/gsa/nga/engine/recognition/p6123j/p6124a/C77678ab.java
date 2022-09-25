package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.ab */
/* compiled from: PG */
final class C77678ab {

    /* renamed from: a */
    public static final C58974d f213960a = C58974d.m91136j();

    /* renamed from: b */
    public final C91142g f213961b;

    /* renamed from: c */
    public final C22871g f213962c;

    /* renamed from: d */
    public final C81457f f213963d;

    /* renamed from: e */
    public C60870cx f213964e;

    public C77678ab(C91142g gVar, C22871g gVar2, C22871g gVar3, C81465n nVar) {
        this.f213961b = gVar;
        this.f213962c = gVar2;
        this.f213963d = nVar.mo75094a(gVar3, C77677aa.f213959a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72772a() {
        C60870cx cxVar = this.f213964e;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f213964e = null;
        }
    }
}
