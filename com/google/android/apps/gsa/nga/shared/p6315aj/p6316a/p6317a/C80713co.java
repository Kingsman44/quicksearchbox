package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.co */
/* compiled from: PG */
public final /* synthetic */ class C80713co implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80722cx f221590a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f221591b;

    public /* synthetic */ C80713co(C80722cx cxVar, Bundle bundle) {
        this.f221590a = cxVar;
        this.f221591b = bundle;
    }

    public final void accept(Object obj) {
        C80722cx cxVar = this.f221590a;
        Bundle bundle = this.f221591b;
        C80719cu cuVar = (C80719cu) obj;
        C80719cu cuVar2 = (C80719cu) cxVar.mo74496f().get();
        Bundle bundle2 = new Bundle();
        bundle2.putString("disclosure_label", cuVar2.mo74512b());
        cuVar2.mo74511a().ifPresent(new C80717cs(bundle2));
        bundle.putBundle("disclosure_info", bundle2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
