package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6560at.C84734a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90725ai;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.j */
/* compiled from: PG */
public final /* synthetic */ class C102814j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C102821q f287088a;

    /* renamed from: b */
    public final /* synthetic */ C90584f f287089b;

    /* renamed from: c */
    public final /* synthetic */ String f287090c;

    /* renamed from: d */
    public final /* synthetic */ String f287091d;

    /* renamed from: e */
    public final /* synthetic */ String f287092e;

    public /* synthetic */ C102814j(C102821q qVar, C90584f fVar, String str, String str2, String str3) {
        this.f287088a = qVar;
        this.f287089b = fVar;
        this.f287090c = str;
        this.f287091d = str2;
        this.f287092e = str3;
    }

    public final Object apply(Object obj) {
        C102821q qVar = this.f287088a;
        C90584f fVar = this.f287089b;
        String str = this.f287090c;
        String str2 = this.f287091d;
        String str3 = this.f287092e;
        C29690f fVar2 = (C29690f) obj;
        C58976aa aaVar = C58975e.f156826a;
        qVar.mo93466f(C89849ae.HOTWORD_MODEL_MDD_MODEL_RETURNED);
        ((C102826v) qVar.f287103e.mo27525b()).mo93474d(fVar);
        ((C102826v) qVar.f287103e.mo27525b()).mo93472b();
        C102828x.m170539b(qVar.f287100b, (C84734a) qVar.f287104f.mo27525b());
        C86337q b = qVar.f287100b.mo80076b();
        b.mo80073h(C90725ai.m148179a(str, str2), "mdd-".concat(str3));
        b.apply();
        qVar.mo93465e();
        C59104x b2 = C102821q.f287099a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b2).mo56372aa(21184)).mo56386p("Hotword model update tasks finished.");
        qVar.mo93466f(C89849ae.HOTWORD_MODEL_MDD_ENROLLMENT_SUCCEEDED);
        return C118826c.f331422a;
    }
}
