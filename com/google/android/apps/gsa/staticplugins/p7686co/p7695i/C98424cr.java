package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cr */
/* compiled from: PG */
final class C98424cr implements C90991b {

    /* renamed from: a */
    final long f274780a;

    /* renamed from: b */
    final int f274781b;

    public C98424cr(C98426ct ctVar, int i) {
        this.f274781b = i;
        this.f274780a = ctVar.f274784b.mo26870b();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148229c(C98426ct.f274782a.format(new Date(this.f274780a))));
        fVar.mo85279c("result").mo85276a(C90752i.m148229c(C98425cs.m162986a(this.f274781b)));
    }

    public final String toString() {
        return String.format("result: %s, ts: %s", new Object[]{C98425cs.m162986a(this.f274781b), C98426ct.f274782a.format(new Date(this.f274780a))});
    }
}
