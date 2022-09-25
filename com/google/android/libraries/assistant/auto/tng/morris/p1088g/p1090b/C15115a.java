package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1090b;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14139i;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.b.a */
/* compiled from: PG */
public final /* synthetic */ class C15115a implements C14139i {

    /* renamed from: a */
    public final /* synthetic */ C15116b f45368a;

    public /* synthetic */ C15115a(C15116b bVar) {
        this.f45368a = bVar;
    }

    /* renamed from: a */
    public final void mo21457a(View view, C60214n nVar) {
        C15116b bVar = this.f45368a;
        if (bVar.f45374f.mo21414e()) {
            LogoView logoView = bVar.f45377i;
            logoView.getClass();
            if (logoView.f63001h == 7) {
                C59104x d = C15116b.f45369a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.AssistIcnRend");
                ((C59052c) ((C59052c) d).mo56372aa(45971)).mo56386p("Assistant AppFlow is in progress while mic is closed. Cancel the existing flow.");
                bVar.f45374f.mo21410a(C37182a.f97887cM.mo40805c(C62722b.CANCELLED));
            }
        }
        bVar.f45371c.mo21875g(C14731a.m31006c(nVar, Duration.ofNanos(bVar.f45375g.mo26872d())));
    }
}
