package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14139i;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14426iu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14427iv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.cu */
/* compiled from: PG */
public final /* synthetic */ class C15066cu implements C14139i {

    /* renamed from: a */
    public final /* synthetic */ C15068cw f45191a;

    public /* synthetic */ C15066cu(C15068cw cwVar) {
        this.f45191a = cwVar;
    }

    /* renamed from: a */
    public final void mo21457a(View view, C60214n nVar) {
        C15068cw cwVar = this.f45191a;
        C15069cx cxVar = cwVar.f45203j;
        if (cxVar.mo21930c()) {
            C59104x d = C15069cx.f45204a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MsgCenterRend");
            ((C59052c) ((C59052c) d).mo56372aa(45965)).mo56386p("Skipping read message due to ongoing call.");
            return;
        }
        C14348fx fxVar = cwVar.f45202i;
        if (fxVar == null) {
            C59104x c = C15069cx.f45204a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MsgCenterRend");
            ((C59052c) ((C59052c) c).mo56372aa(45964)).mo56386p("Message thread not populated for the clicked message view");
            return;
        }
        C14986h hVar = cxVar.f45206c;
        long j = fxVar.f43417b;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14426iu iuVar = (C14426iu) C14427iv.f43643o.createBuilder();
        iuVar.copyOnWrite();
        ((C14427iv) iuVar.instance).f43645a = 12;
        iuVar.copyOnWrite();
        nVar.getClass();
        ((C14427iv) iuVar.instance).f43655k = nVar;
        iuVar.copyOnWrite();
        ((C14427iv) iuVar.instance).f43646b = j;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14427iv ivVar = (C14427iv) iuVar.build();
        ivVar.getClass();
        lfVar.f43801d = ivVar;
        lfVar.f43800c = 5;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
