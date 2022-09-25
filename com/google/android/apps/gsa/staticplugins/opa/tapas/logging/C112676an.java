package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60548tz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.an */
/* compiled from: PG */
public final /* synthetic */ class C112676an implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112678ap f312300a;

    /* renamed from: b */
    public final /* synthetic */ C112667ae f312301b;

    /* renamed from: c */
    public final /* synthetic */ C60548tz f312302c;

    /* renamed from: d */
    public final /* synthetic */ C19087s f312303d;

    public /* synthetic */ C112676an(C112678ap apVar, C112667ae aeVar, C60548tz tzVar, C19087s sVar) {
        this.f312300a = apVar;
        this.f312301b = aeVar;
        this.f312302c = tzVar;
        this.f312303d = sVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112678ap apVar = this.f312300a;
        C112667ae aeVar = this.f312301b;
        C60548tz tzVar = this.f312302c;
        C19087s sVar = this.f312303d;
        C59104x c = C112678ap.f312305a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TapasClientEventLogger");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(27512)).mo56386p("Failed to log query");
        apVar.mo99625b(aeVar, tzVar, sVar);
    }
}
