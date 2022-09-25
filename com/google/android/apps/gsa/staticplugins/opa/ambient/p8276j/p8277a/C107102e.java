package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80902aq;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.e */
/* compiled from: PG */
public final /* synthetic */ class C107102e implements C80902aq {

    /* renamed from: a */
    public final /* synthetic */ C107115r f298172a;

    /* renamed from: b */
    public final /* synthetic */ C83739ak f298173b;

    public /* synthetic */ C107102e(C107115r rVar, C83739ak akVar) {
        this.f298172a = rVar;
        this.f298173b = akVar;
    }

    /* renamed from: a */
    public final void mo49513a(Throwable th) {
        C107115r rVar = this.f298172a;
        C83739ak akVar = this.f298173b;
        C58970a aVar = (C58970a) ((C58970a) ((C58970a) rVar.f298188b.mo56225c()).mo56382g(th)).mo56372aa(23498);
        C50794cr a = C50794cr.m85938a(akVar.f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        aVar.mo56389s("Failed to send card of type %s", a.name());
        String str = akVar.f228234c;
        C50794cr a2 = C50794cr.m85938a(akVar.f228239h);
        if (a2 == null) {
            a2 = C50794cr.UNDEFINED;
        }
        a2.name();
    }
}
