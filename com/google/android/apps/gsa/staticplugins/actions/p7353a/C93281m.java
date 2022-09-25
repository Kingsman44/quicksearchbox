package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.apps.gsa.opa.p6435c.C83602n;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.assistant.p3745ab.C48273ca;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.m */
/* compiled from: PG */
public final /* synthetic */ class C93281m implements C22411a {

    /* renamed from: a */
    public final /* synthetic */ C93286r f260120a;

    /* renamed from: b */
    public final /* synthetic */ ModularAction f260121b;

    public /* synthetic */ C93281m(C93286r rVar, ModularAction modularAction) {
        this.f260120a = rVar;
        this.f260121b = modularAction;
    }

    /* renamed from: a */
    public final void mo27600a(int i, C48273ca caVar) {
        C93286r rVar = this.f260120a;
        ModularAction modularAction = this.f260121b;
        C48273ca a = C83602n.m133181a(caVar, rVar.f260142d);
        switch (i - 1) {
            case 0:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_START, modularAction, a, false);
                return;
            case 1:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CONNECT_TIMEOUT, modularAction, a, true);
                return;
            case 2:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_DIAL_START, modularAction, a, false);
                return;
            case 3:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_TIMEOUT, modularAction, a, true);
                return;
            case 4:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_END, modularAction, a, true);
                return;
            case 6:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CALL_INTENT_FAILED, modularAction, a, false);
                return;
            case 7:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_STARTCALL_PERMISSION_DENIED, modularAction, a, false);
                return;
            case 8:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_PERMISSION_DENIED, modularAction, a, true);
                return;
            case 9:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_QUERY_SUCCESS, modularAction, a, true);
                return;
            case 10:
                rVar.mo87613d(C89849ae.OPA_APP_USAGE_REPORT_CALL_CALLLOG_QUERY_FAILURE, modularAction, a, true);
                return;
            default:
                return;
        }
    }
}
