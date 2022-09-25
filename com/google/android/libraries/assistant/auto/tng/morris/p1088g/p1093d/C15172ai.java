package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14139i;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C15172ai implements C14139i {

    /* renamed from: a */
    public final /* synthetic */ C15174ak f45527a;

    public /* synthetic */ C15172ai(C15174ak akVar) {
        this.f45527a = akVar;
    }

    /* renamed from: a */
    public final void mo21457a(View view, C60214n nVar) {
        C15174ak akVar = this.f45527a;
        if (akVar.f45535g == C14350fz.MIC_OPEN || akVar.f45535g == C14350fz.MIC_RECORDING) {
            akVar.f45530b.mo21875g(C14731a.m31006c(nVar, Duration.ofNanos(akVar.f45532d.mo26872d())));
        }
    }
}
