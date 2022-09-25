package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14733c;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14139i;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14372gu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14382hd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14385hg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4552o.p4566l.C60214n;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.a */
/* compiled from: PG */
public final /* synthetic */ class C15272a implements C14139i {

    /* renamed from: a */
    public final /* synthetic */ C15300d f45838a;

    public /* synthetic */ C15272a(C15300d dVar) {
        this.f45838a = dVar;
    }

    /* renamed from: a */
    public final void mo21457a(View view, C60214n nVar) {
        C15300d dVar = this.f45838a;
        if (dVar.f45951b.mo79746e(C90051dc.f248924u)) {
            dVar.f45950a.mo21875g(C14745o.m31059b());
        } else if (dVar.f45951b.mo79746e(C90051dc.f248927x)) {
            C14986h hVar = dVar.f45950a;
            Duration ofNanos = Duration.ofNanos(dVar.f45952c.mo26872d());
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14372gu guVar = (C14372gu) C14385hg.f43516f.createBuilder();
            long nanos = ofNanos.toNanos();
            guVar.copyOnWrite();
            C14385hg hgVar = (C14385hg) guVar.instance;
            hgVar.f43518a |= 1;
            hgVar.f43522e = nanos;
            guVar.copyOnWrite();
            nVar.getClass();
            ((C14385hg) guVar.instance).f43521d = nVar;
            C14382hd hdVar = C14382hd.f43511a;
            guVar.copyOnWrite();
            C14385hg hgVar2 = (C14385hg) guVar.instance;
            hdVar.getClass();
            hgVar2.f43520c = hdVar;
            hgVar2.f43519b = 7;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14385hg hgVar3 = (C14385hg) guVar.build();
            hgVar3.getClass();
            lfVar.f43801d = hgVar3;
            lfVar.f43800c = 15;
            hVar.mo21875g((C14492lf) gtVar.build());
        } else {
            dVar.f45950a.mo21875g(C14733c.m31017a(nVar, Duration.ofNanos(dVar.f45952c.mo26872d())));
        }
    }
}
