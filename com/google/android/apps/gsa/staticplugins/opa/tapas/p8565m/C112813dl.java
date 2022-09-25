package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dl */
/* compiled from: PG */
public final /* synthetic */ class C112813dl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112821dt f312676a;

    /* renamed from: b */
    public final /* synthetic */ C112820ds f312677b;

    /* renamed from: c */
    public final /* synthetic */ int f312678c;

    public /* synthetic */ C112813dl(C112821dt dtVar, C112820ds dsVar, int i) {
        this.f312676a = dtVar;
        this.f312677b = dsVar;
        this.f312678c = i;
    }

    public final void accept(Object obj) {
        C112821dt dtVar = this.f312676a;
        C112820ds dsVar = this.f312677b;
        int i = this.f312678c;
        C113367dh dhVar = dtVar.f312693b;
        ImageView imageView = dsVar.f312688a;
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c(C113259al.m187318c((String) obj)));
        d.mo99989f(i);
        dhVar.mo100144d(imageView, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
