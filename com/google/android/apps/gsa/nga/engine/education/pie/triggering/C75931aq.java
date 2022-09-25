package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.common.p4522b.C58671nr;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.aq */
/* compiled from: PG */
public final /* synthetic */ class C75931aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58671nr f210680a;

    /* renamed from: b */
    public final /* synthetic */ C80248co f210681b;

    public /* synthetic */ C75931aq(C58671nr nrVar, C80248co coVar) {
        this.f210680a = nrVar;
        this.f210681b = coVar;
    }

    public final void accept(Object obj) {
        this.f210680a.mo54956I(this.f210681b, (C80213bg) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
