package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.en */
/* compiled from: PG */
final class C112842en implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C113415ez f312756a;

    /* renamed from: b */
    final /* synthetic */ C113408es f312757b;

    /* renamed from: c */
    final /* synthetic */ C0673gh f312758c;

    /* renamed from: d */
    final /* synthetic */ List f312759d;

    /* renamed from: e */
    final /* synthetic */ C112851ew f312760e;

    public C112842en(C112851ew ewVar, C113415ez ezVar, C113408es esVar, C0673gh ghVar, List list) {
        this.f312760e = ewVar;
        this.f312756a = ezVar;
        this.f312757b = esVar;
        this.f312758c = ghVar;
        this.f312759d = list;
    }

    public final void onClick(View view) {
        this.f312760e.f312797h.mo99739a(8, this.f312756a, this.f312757b, Optional.m71637of(Arrays.asList(new Integer[]{23190})));
        if (this.f312756a.mo100206f() == 10019) {
            this.f312760e.f312798i.mo99654e(view);
        } else {
            this.f312760e.f312798i.mo99654e(this.f312758c.itemView);
        }
        this.f312760e.mo99764m((C113321r) this.f312759d.get(0));
    }
}
