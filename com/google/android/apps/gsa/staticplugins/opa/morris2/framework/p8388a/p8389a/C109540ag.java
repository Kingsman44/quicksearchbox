package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C109540ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109546am f305070a;

    /* renamed from: b */
    public final /* synthetic */ C14350fz f305071b;

    public /* synthetic */ C109540ag(C109546am amVar, C14350fz fzVar) {
        this.f305070a = amVar;
        this.f305071b = fzVar;
    }

    public final void run() {
        C109546am amVar = this.f305070a;
        C14350fz fzVar = this.f305071b;
        if (amVar.f305083d.isPresent() && amVar.f305083d.get() == C14350fz.MIC_PROCESSING) {
            amVar.f305082c.mo97887c(C37182a.f97922cv.mo40813g());
            amVar.f305081b.mo21875g(C14731a.m31011h(fzVar, amVar.f305080a.getString(R.string.trying_to_connect)));
        }
    }
}
