package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C103653ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C103656ae f288731a;

    public /* synthetic */ C103653ab(C103656ae aeVar) {
        this.f288731a = aeVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C103656ae aeVar = this.f288731a;
        if (((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            return C47633f.m84733g(C60856cj.m92900i(false));
        }
        if (!aeVar.f288737e.mo56113h()) {
            C59104x d = C103656ae.f288733a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HfSettingsNotifHandler");
            ((C58970a) ((C58970a) d).mo56372aa(21630)).mo56386p("#maybeGetAssistantOnLockscreen Lockscreen service unavailable");
            cxVar = C60856cj.m92898g();
        } else {
            cxVar = ((C9799ae) aeVar.f288737e.mo56107c()).mo18041a();
        }
        return C47633f.m84733g(cxVar).mo51515h(new C103652aa(aeVar), C60826bg.f164896a);
    }
}
