package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hl */
/* compiled from: PG */
public final /* synthetic */ class C112921hl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112925hp f312955a;

    /* renamed from: b */
    public final /* synthetic */ C112924ho f312956b;

    /* renamed from: c */
    public final /* synthetic */ int f312957c;

    public /* synthetic */ C112921hl(C112925hp hpVar, C112924ho hoVar, int i) {
        this.f312955a = hpVar;
        this.f312956b = hoVar;
        this.f312957c = i;
    }

    public final void accept(Object obj) {
        C112925hp hpVar = this.f312955a;
        C112924ho hoVar = this.f312956b;
        int i = this.f312957c;
        C113367dh dhVar = hpVar.f312960a;
        ImageView a = hoVar.mo99703a();
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c((C113286bk) obj));
        d.mo99989f(i);
        dhVar.mo100144d(a, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
