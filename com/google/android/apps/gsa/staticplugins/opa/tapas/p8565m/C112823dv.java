package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dv */
/* compiled from: PG */
public final /* synthetic */ class C112823dv implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112826dy f312700a;

    /* renamed from: b */
    public final /* synthetic */ C112824dw f312701b;

    public /* synthetic */ C112823dv(C112826dy dyVar, C112824dw dwVar) {
        this.f312700a = dyVar;
        this.f312701b = dwVar;
    }

    public final void accept(Object obj) {
        C112826dy dyVar = this.f312700a;
        C112824dw dwVar = this.f312701b;
        C113367dh dhVar = dyVar.f312718c;
        ImageView imageView = dwVar.f312702a;
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c((C113286bk) obj));
        d.mo99989f(C1878d.m5128a(dyVar.f312717b, R.color.grey_placeholder));
        dhVar.mo100144d(imageView, d.mo99984a());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
