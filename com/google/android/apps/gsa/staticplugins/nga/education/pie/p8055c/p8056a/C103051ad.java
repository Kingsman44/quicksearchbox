package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81368n;
import com.google.common.p4522b.C58490gz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C103051ad implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f287672a;

    public /* synthetic */ C103051ad(C58490gz gzVar) {
        this.f287672a = gzVar;
    }

    public final void accept(Object obj) {
        C58490gz gzVar = this.f287672a;
        C81368n nVar = (C81368n) obj;
        C80248co a = C80248co.m128104a(nVar.f222706d);
        if (a == null) {
            a = C80248co.USECASE_TYPE_UNKNOWN;
        }
        gzVar.mo55429h(a, nVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
