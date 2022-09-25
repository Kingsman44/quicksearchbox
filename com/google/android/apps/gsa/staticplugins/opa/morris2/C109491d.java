package com.google.android.apps.gsa.staticplugins.opa.morris2;

import android.databinding.C0118a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14498ll;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.d */
/* compiled from: PG */
public final /* synthetic */ class C109491d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109710m f304955a;

    /* renamed from: b */
    public final /* synthetic */ C14499lm f304956b;

    public /* synthetic */ C109491d(C109710m mVar, C14499lm lmVar) {
        this.f304955a = mVar;
        this.f304956b = lmVar;
    }

    public final void run() {
        C109710m mVar = this.f304955a;
        C14499lm lmVar = this.f304956b;
        if (mVar.f305640o == null) {
            C59104x c = C109710m.f305620a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrlImpl");
            C0118a.m108p(c, "Root renderer is null", 24752, C38505d.f101864b, 164111538);
            return;
        }
        if (mVar.f305629d.t()) {
            mVar.f305641p.mo98013a(lmVar, mVar.f305629d.s());
        }
        mVar.f305640o.mo21976d(lmVar, mVar.f305629d.s());
        if (C14498ll.m30626a(lmVar.f43850a) == 5) {
            mVar.f305635j.mo21572d();
        }
    }
}
