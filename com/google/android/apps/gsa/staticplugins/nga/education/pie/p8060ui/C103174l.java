package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.l */
/* compiled from: PG */
public final /* synthetic */ class C103174l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C103188z f287906a;

    public /* synthetic */ C103174l(C103188z zVar) {
        this.f287906a = zVar;
    }

    public final void accept(Object obj) {
        C103188z zVar = this.f287906a;
        C80271z zVar2 = (C80271z) obj;
        C80246cm a = C80246cm.m128102a(zVar.f287927a.f220140b);
        if (a == null) {
            a = C80246cm.NO_UI;
        }
        if (a != C80246cm.MULTISTEP_EDUCATION) {
            zVar.mo93697a(new C103183u(zVar, zVar2));
        } else if (zVar.f287930d.mo79746e(C90037cp.f248602dt)) {
            zVar.mo93697a(new C103181s(zVar, zVar2));
        } else {
            zVar.mo93697a(new C103182t(zVar, zVar2));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
