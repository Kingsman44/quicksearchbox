package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.h */
/* compiled from: PG */
public final /* synthetic */ class C112909h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112940j f312931a;

    /* renamed from: b */
    public final /* synthetic */ C112936i f312932b;

    public /* synthetic */ C112909h(C112940j jVar, C112936i iVar) {
        this.f312931a = jVar;
        this.f312932b = iVar;
    }

    public final void accept(Object obj) {
        C112940j jVar = this.f312931a;
        C112936i iVar = this.f312932b;
        C113367dh dhVar = jVar.f312987a;
        ImageView imageView = iVar.f312979a;
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c(C113259al.m187317b((Drawable) obj)));
        dhVar.mo100144d(imageView, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
