package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35870b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.as */
/* compiled from: PG */
public final /* synthetic */ class C35890as implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35894aw f94019a;

    /* renamed from: b */
    public final /* synthetic */ C52115fu f94020b;

    public /* synthetic */ C35890as(C35894aw awVar, C52115fu fuVar) {
        this.f94019a = awVar;
        this.f94020b = fuVar;
    }

    public final C60870cx apply(Object obj) {
        C35894aw awVar = this.f94019a;
        C52115fu fuVar = this.f94020b;
        C52070ec ecVar = (C52070ec) obj;
        if (C35894aw.m64288b(ecVar)) {
            return C60856cj.m92900i(ecVar);
        }
        if ((fuVar.f136755a & 16) == 0) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.NOT_FOUND, "SettingId is not provided."));
        }
        String str = fuVar.f136760f;
        if (!awVar.f94028d.containsKey(str)) {
            String format = String.format("Setting %s not supported by legacy flow", new Object[]{str});
            ((C59052c) ((C59052c) C35894aw.f94025a.mo56224b()).mo56372aa(51841)).mo56389s("%s", format);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.UNAVAILABLE, format));
        }
        C35870b bVar = (C35870b) awVar.f94028d.get(str);
        if (bVar.mo39853c()) {
            bVar.mo39852b(awVar.f94026b);
        }
        return bVar.mo39851a(fuVar);
    }
}
