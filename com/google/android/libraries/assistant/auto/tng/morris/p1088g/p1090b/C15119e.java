package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1090b;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14108ai;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14250cg;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.b.e */
/* compiled from: PG */
public final /* synthetic */ class C15119e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15120f f45381a;

    /* renamed from: b */
    public final /* synthetic */ C14250cg f45382b;

    public /* synthetic */ C15119e(C15120f fVar, C14250cg cgVar) {
        this.f45381a = fVar;
        this.f45382b = cgVar;
    }

    public final void onClick(View view) {
        C15120f fVar = this.f45381a;
        if (this.f45382b.f43123b) {
            if (fVar.f45385c.f42793c.get()) {
                fVar.f45385c.mo21415a(C37182a.f97873bz.mo40805c(C62722b.CANCELLED));
            }
            fVar.f45383a.mo21875g(C14745o.m31067j());
            return;
        }
        C14108ai aiVar = fVar.f45385c;
        C37252a i = C37182a.f97872by.mo40815i(C62722b.OK);
        C58976aa aaVar = C58975e.f156826a;
        if (aiVar.f42793c.get()) {
            C59104x d = C14108ai.f42791a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.ElAppFlwLgr");
            ((C59052c) ((C59052c) d).mo56372aa(45808)).mo56386p("Experience Launcher AppFlow ready started. End the existing one and start logging the new one.");
            aiVar.f42792b.mo19974a(C37182a.f97822bA.mo40805c(C62722b.ABORTED));
        }
        aiVar.f42792b.mo19974a(i);
        aiVar.f42793c.set(true);
        fVar.f45383a.mo21875g(C14745o.m31062e());
    }
}
