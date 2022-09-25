package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14139i;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14372gu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14383he;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14384hf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14385hg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C15072d implements C14139i {

    /* renamed from: a */
    public final /* synthetic */ C15089i f45232a;

    /* renamed from: b */
    public final /* synthetic */ C14636z f45233b;

    public /* synthetic */ C15072d(C15089i iVar, C14636z zVar) {
        this.f45232a = iVar;
        this.f45233b = zVar;
    }

    /* renamed from: a */
    public final void mo21457a(View view, C60214n nVar) {
        C15089i iVar = this.f45232a;
        C14636z zVar = this.f45233b;
        if (iVar.mo21948d()) {
            C59104x d = C15089i.f45272a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.CallCenterRend");
            ((C59052c) ((C59052c) d).mo56372aa(45943)).mo56386p("Skipping call top contact due to active call.");
            return;
        }
        C14986h hVar = iVar.f45275c;
        Duration ofNanos = Duration.ofNanos(iVar.f45278f.mo26872d());
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14372gu guVar = (C14372gu) C14385hg.f43516f.createBuilder();
        guVar.copyOnWrite();
        nVar.getClass();
        ((C14385hg) guVar.instance).f43521d = nVar;
        long nanos = ofNanos.toNanos();
        guVar.copyOnWrite();
        C14385hg hgVar = (C14385hg) guVar.instance;
        hgVar.f43518a |= 1;
        hgVar.f43522e = nanos;
        C14383he heVar = (C14383he) C14384hf.f43513b.createBuilder();
        heVar.copyOnWrite();
        zVar.getClass();
        ((C14384hf) heVar.instance).f43515a = zVar;
        guVar.copyOnWrite();
        C14385hg hgVar2 = (C14385hg) guVar.instance;
        C14384hf hfVar = (C14384hf) heVar.build();
        hfVar.getClass();
        hgVar2.f43520c = hfVar;
        hgVar2.f43519b = 2;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14385hg hgVar3 = (C14385hg) guVar.build();
        hgVar3.getClass();
        lfVar.f43801d = hgVar3;
        lfVar.f43800c = 15;
        hVar.mo21875g((C14492lf) gtVar.build());
    }
}
