package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90003bi;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96886f;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96897q;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C97164e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97166g f271489a;

    public /* synthetic */ C97164e(C97166g gVar) {
        this.f271489a = gVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C97166g gVar = this.f271489a;
        C96897q qVar = gVar.f271494d;
        if (!qVar.f270882c.mo79746e(C90003bi.f246867c)) {
            cxVar = C60856cj.m92899h(new Exception("Auto bubbles debug flag is disabled"));
        } else {
            cxVar = qVar.f270880a.mo46039a(C96886f.f270869a, qVar.f270883d.mo85210c("ClearAutoBubbleDataStore"));
        }
        C90875ai.m148465b(new C97162c(gVar), cxVar, gVar.f271495e, "ShowShortToast").mo85223a(new C97163d(gVar));
    }
}
