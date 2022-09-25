package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.eg */
/* compiled from: PG */
final class C112835eg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C113415ez f312733a;

    /* renamed from: b */
    final /* synthetic */ C113408es f312734b;

    /* renamed from: c */
    final /* synthetic */ C0673gh f312735c;

    /* renamed from: d */
    final /* synthetic */ C113321r f312736d;

    /* renamed from: e */
    final /* synthetic */ C112851ew f312737e;

    public C112835eg(C112851ew ewVar, C113415ez ezVar, C113408es esVar, C0673gh ghVar, C113321r rVar) {
        this.f312737e = ewVar;
        this.f312733a = ezVar;
        this.f312734b = esVar;
        this.f312735c = ghVar;
        this.f312736d = rVar;
    }

    public final void onClick(View view) {
        this.f312737e.f312797h.mo99739a(9, this.f312733a, this.f312734b, Optional.m71637of(Arrays.asList(new Integer[]{60736})));
        if (this.f312733a.mo100206f() == 10019) {
            this.f312737e.f312798i.mo99652c(view);
        } else {
            this.f312737e.f312798i.mo99652c(this.f312735c.itemView);
        }
        this.f312737e.mo99765n(this.f312735c, this.f312736d);
    }
}
