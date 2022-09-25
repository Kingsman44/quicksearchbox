package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hm */
/* compiled from: PG */
public final /* synthetic */ class C112922hm implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112925hp f312958a;

    /* renamed from: b */
    public final /* synthetic */ C112924ho f312959b;

    public /* synthetic */ C112922hm(C112925hp hpVar, C112924ho hoVar) {
        this.f312958a = hpVar;
        this.f312959b = hoVar;
    }

    public final void accept(Object obj) {
        C112925hp hpVar = this.f312958a;
        C112924ho hoVar = this.f312959b;
        C113367dh dhVar = hpVar.f312960a;
        ImageView a = hoVar.mo99703a();
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c((C113286bk) obj));
        dhVar.mo100144d(a, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
