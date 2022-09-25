package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.cj */
/* compiled from: PG */
public final /* synthetic */ class C112784cj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112788cn f312602a;

    /* renamed from: b */
    public final /* synthetic */ C112790cp f312603b;

    /* renamed from: c */
    public final /* synthetic */ int f312604c;

    public /* synthetic */ C112784cj(C112788cn cnVar, C112790cp cpVar, int i) {
        this.f312602a = cnVar;
        this.f312603b = cpVar;
        this.f312604c = i;
    }

    public final void accept(Object obj) {
        C112788cn cnVar = this.f312602a;
        C112790cp cpVar = this.f312603b;
        int i = this.f312604c;
        C113367dh dhVar = cnVar.f312608a;
        ImageView imageView = cpVar.f312612a;
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c(C113259al.m187318c((String) obj)));
        d.mo99989f(i);
        dhVar.mo100144d(imageView, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
