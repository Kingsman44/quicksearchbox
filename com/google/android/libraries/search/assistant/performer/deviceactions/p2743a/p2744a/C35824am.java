package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63077o;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.am */
/* compiled from: PG */
public final /* synthetic */ class C35824am implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C35825an f93870a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f93871b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f93872c;

    /* renamed from: d */
    public final /* synthetic */ C52115fu f93873d;

    /* renamed from: e */
    public final /* synthetic */ String f93874e;

    public /* synthetic */ C35824am(C35825an anVar, C60870cx cxVar, C60870cx cxVar2, C52115fu fuVar, String str) {
        this.f93870a = anVar;
        this.f93871b = cxVar;
        this.f93872c = cxVar2;
        this.f93873d = fuVar;
        this.f93874e = str;
    }

    public final Object call() {
        C35825an anVar = this.f93870a;
        C60870cx cxVar = this.f93871b;
        C60870cx cxVar2 = this.f93872c;
        C52115fu fuVar = this.f93873d;
        String str = this.f93874e;
        try {
            boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
            if (((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
                C58976aa aaVar = C58975e.f156826a;
                anVar.f93879e.mo39894b(C35845bg.m64246f(fuVar), C62722b.OK);
                return C36180b.m64577a("is_dependent_setting_modified", "google.protobuf.BoolValue", C63077o.m96099a(booleanValue));
            }
            anVar.f93879e.mo39894b(C35845bg.m64246f(fuVar), C62722b.UNAVAILABLE);
            String format = String.format("Setting %s is not modified by Phone buddy API.", new Object[]{str});
            C58976aa aaVar2 = C58975e.f156826a;
            return C36180b.m64579c(C52235kf.UNAVAILABLE, format);
        } catch (Exception e) {
            anVar.f93879e.mo39894b(C35845bg.m64246f(fuVar), C62722b.INTERNAL);
            C59104x c = C35825an.f93875a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ModifySettingPhoneBuddy");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(51944)).mo56386p("Failed retrieve phone buddy API modifySingleSetting return result.");
            return C36180b.m64579c(C52235kf.INTERNAL, "Phone buddy API modfiy setting failed with ".concat(String.valueOf(e.getMessage())));
        }
    }
}
