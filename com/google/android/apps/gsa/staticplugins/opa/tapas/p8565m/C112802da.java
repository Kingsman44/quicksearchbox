package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.da */
/* compiled from: PG */
public final /* synthetic */ class C112802da implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112805dd f312647a;

    /* renamed from: b */
    public final /* synthetic */ C112804dc f312648b;

    public /* synthetic */ C112802da(C112805dd ddVar, C112804dc dcVar) {
        this.f312647a = ddVar;
        this.f312648b = dcVar;
    }

    public final void accept(Object obj) {
        C112805dd ddVar = this.f312647a;
        C112804dc dcVar = this.f312648b;
        C113367dh dhVar = ddVar.f312652a;
        ImageView imageView = dcVar.f312649a;
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c((C113286bk) obj));
        dhVar.mo100144d(imageView, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
