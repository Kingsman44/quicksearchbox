package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.f */
/* compiled from: PG */
public final /* synthetic */ class C102837f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102839h f287182a;

    public /* synthetic */ C102837f(C102839h hVar) {
        this.f287182a = hVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102839h hVar = this.f287182a;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String str = hVar.f287190g.f253249c;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        str.getClass();
        cbVar.f160115b |= 4096;
        cbVar.f160048M = str;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.RUN_ENROLLMENT_GET_HOTWORD_DATA_FAILED;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) hVar.f287203t.mo27525b()).mo74236a(fVar.mo83699a());
        ((C59052c) ((C59052c) ((C59052c) C102839h.f287184a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(21269)).mo56386p("Error creating hotword data");
        hVar.mo93501a();
    }
}
