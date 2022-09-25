package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ck */
/* compiled from: PG */
abstract class C96134ck extends C83870ad {

    /* renamed from: a */
    private C58800sl f269128a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C58485gu mo89961a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (this.f269128a == null) {
            this.f269128a = mo89961a().listIterator(0);
        }
        return this.f269128a.hasNext() ? C58833ax.m90834k((C83956t) ((C58881cr) this.f269128a.next()).mo6453a()) : C58836b.f156633a;
    }
}
