package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8329f;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.session.MediaController;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6491a.C84371q;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88449bt;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88451bv;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88452bw;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2998g.p2999a.C38343ac;
import com.google.android.libraries.search.p2998g.p2999a.C38377r;
import com.google.android.libraries.search.p2998g.p2999a.C38378s;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.afv;
import com.google.assistant.p3861at.afw;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.aqb;
import com.google.assistant.p3897e.p3921j.aqc;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.f.b */
/* compiled from: PG */
public final /* synthetic */ class C107926b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107929e f300287a;

    /* renamed from: b */
    public final /* synthetic */ long f300288b;

    /* renamed from: c */
    public final /* synthetic */ C88431bb f300289c;

    public /* synthetic */ C107926b(C107929e eVar, long j, C88431bb bbVar) {
        this.f300287a = eVar;
        this.f300288b = j;
        this.f300289c = bbVar;
    }

    public final void run() {
        Object obj;
        int a;
        Object obj2;
        C107929e eVar = this.f300287a;
        long j = this.f300288b;
        C88431bb bbVar = this.f300289c;
        eVar.f300297g.mo81932c();
        eVar.f300297g.mo81946r(j, (Bundle) null, C88431bb.f239082a);
        eVar.f300297g.mo81940l(eVar, C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED);
        eVar.f300307q = false;
        if (((SharedPreferences) eVar.f300306p.mo27525b()).getBoolean("opa_wake_up_with_assistant_enabled", false)) {
            if (bbVar == null) {
                ((C59052c) ((C59052c) C107929e.f300292a.mo56226d()).mo56372aa(26375)).mo56389s("Invalid Session context for WUWA: %s", (Object) null);
                int i = C90755l.f253831a;
                return;
            }
            C62940bt r1 = C62942bv.checkIsLite(C88452bw.f239126a);
            bbVar.mo58887l(r1);
            if (bbVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt r12 = C62942bv.checkIsLite(C88452bw.f239126a);
                bbVar.mo58887l(r12);
                Object l = bbVar.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj = r12.f169969b;
                } else {
                    obj = r12.mo58889c(l);
                }
                C88451bv bvVar = (C88451bv) obj;
                if (bvVar == null) {
                    ((C59052c) ((C59052c) C107929e.f300292a.mo56226d()).mo56372aa(26374)).mo56389s("Invalid deeplink information in session context: %s", bbVar);
                    int i2 = C90755l.f253831a;
                } else if (bvVar.f239124a == 1 && (a = C88449bt.m142811a(((Integer) bvVar.f239125b).intValue())) != 0 && a == 2) {
                    C62940bt r13 = C62942bv.checkIsLite(C38378s.f101619a);
                    bbVar.mo58887l(r13);
                    if (!bbVar.f169962ag.mo58857o(r13.f169971d)) {
                        ((C59052c) ((C59052c) C107929e.f300292a.mo56226d()).mo56372aa(26366)).mo56389s("No deeplink info in WUWA Session context: %s", bbVar);
                        int i3 = C90755l.f253831a;
                        return;
                    }
                    C62940bt r14 = C62942bv.checkIsLite(C38378s.f101619a);
                    bbVar.mo58887l(r14);
                    Object l2 = bbVar.f169962ag.mo58854l(r14.f169971d);
                    if (l2 == null) {
                        obj2 = r14.f169969b;
                    } else {
                        obj2 = r14.mo58889c(l2);
                    }
                    C38377r rVar = (C38377r) obj2;
                    if (rVar == null || !rVar.f101617c) {
                        ((C59052c) ((C59052c) C107929e.f300292a.mo56226d()).mo56372aa(26365)).mo56389s("Invalid deeplink info in WUWA Session context: %s", bbVar);
                        int i4 = C90755l.f253831a;
                        return;
                    }
                    eVar.f300302l.mo83702b(C89849ae.OPA_ANDROID_WUWA_ALARM_DISMISSED);
                    C38343ac acVar = rVar.f101616b;
                    if (acVar == null) {
                        acVar = C38343ac.f101528b;
                    }
                    C62971cq cqVar = acVar.f101530a;
                    NetworkInfo activeNetworkInfo = eVar.f300301k.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        String a2 = C107929e.m179179a(cqVar, "workflow_label");
                        if (!TextUtils.isEmpty(a2)) {
                            eVar.f300302l.mo83702b(C89849ae.OPA_ANDROID_WUWA_OFFLINE_NOTIFICATION_DISPLAYED);
                            C1839z a3 = C89095d.m144923a(eVar.f300293c, (String) null);
                            a3.f5679J.icon = R.drawable.ic_assistant_light;
                            a3.f5670A = eVar.f300293c.getResources().getColor(R.color.google_blue);
                            a3.f5671B = 1;
                            a3.f5685e = C1839z.m5037c(a2);
                            a3.f5686f = C1839z.m5037c(eVar.f300293c.getString(R.string.opa_wuwa_offline_notification_content));
                            a3.f5690j = 0;
                            eVar.f300295e.mo5003b((String) null, C89885b.OKHTTP_UNEXPECTED_END_VALUE, a3.mo5013a());
                            eVar.mo96334m(false);
                            return;
                        }
                        eVar.mo96334m(true);
                        return;
                    }
                    String a4 = C107929e.m179179a(cqVar, "workflow_data");
                    String a5 = C107929e.m179179a(cqVar, "workflow_action");
                    String a6 = C107929e.m179179a(cqVar, "workflow_alarm_time");
                    if ("execute".equals(a5) && a4 != null && a6 != null) {
                        Context context = eVar.f300293c;
                        String string = context.getString(R.string.opa_wuwa_notification_content, new Object[]{DateUtils.formatDateTime(context, Long.parseLong(a6), 1)});
                        eVar.f300298h.f300310a = eVar;
                        eVar.mo96335n();
                        C84370p b = ((C84371q) eVar.f300294d.mo56107c()).mo77930b(2);
                        aqb aqb = (aqb) aqc.f135604e.createBuilder();
                        aqb.copyOnWrite();
                        aqc aqc = (aqc) aqb.instance;
                        aqc.f135606a |= 1;
                        aqc.f135607b = a4;
                        aqb.copyOnWrite();
                        aqc aqc2 = (aqc) aqb.instance;
                        string.getClass();
                        aqc2.f135606a |= 8;
                        aqc2.f135609d = string;
                        aqb.copyOnWrite();
                        aqc aqc3 = (aqc) aqb.instance;
                        aqc3.f135608c = 1;
                        aqc3.f135606a |= 2;
                        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                        jzVar.copyOnWrite();
                        C52230ka kaVar = (C52230ka) jzVar.instance;
                        kaVar.f137059a |= 1;
                        kaVar.f137060b = "assistant.api.client_input.WorkflowTriggerInput";
                        C63088z byteString = ((aqc) aqb.build()).toByteString();
                        jzVar.copyOnWrite();
                        C52230ka kaVar2 = (C52230ka) jzVar.instance;
                        byteString.getClass();
                        kaVar2.f137059a = 2 | kaVar2.f137059a;
                        kaVar2.f137061c = byteString;
                        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                        dsVar.copyOnWrite();
                        C51805du duVar = (C51805du) dsVar.instance;
                        duVar.f135926a = 1 | duVar.f135926a;
                        duVar.f135927b = "workflow.TRIGGER";
                        dsVar.mo53729a("workflow_trigger_input", (C52230ka) jzVar.build());
                        b.mo77919a((C51805du) dsVar.build());
                    } else if ("delete".equals(a5) && a4 != null) {
                        acw acw = (acw) acx.f128971H.createBuilder();
                        afv afv = (afv) afw.f129184c.createBuilder();
                        afv.copyOnWrite();
                        afw afw = (afw) afv.instance;
                        afw.f129186a = 1 | afw.f129186a;
                        afw.f129187b = a4;
                        acw.copyOnWrite();
                        acx acx = (acx) acw.instance;
                        afw afw2 = (afw) afv.build();
                        afw2.getClass();
                        acx.f128992i = afw2;
                        acx.f128984a |= 64;
                        ((l) eVar.f300304n.mo27525b()).n(((C86054o) eVar.f300305o.mo27525b()).mo79668a(), (acx) acw.build(), new C107928d(), eVar.getClass().getSimpleName());
                    }
                } else {
                    C107929e eVar2 = eVar.f300298h.f300310a;
                    if (eVar2 == null) {
                        ((C59052c) ((C59052c) C107929e.f300292a.mo56225c()).mo56372aa(26373)).mo56386p("mainWuwaSessionController is null.");
                        eVar.mo96334m(true);
                        return;
                    }
                    if (bvVar.f239124a == 2 && ((Boolean) bvVar.f239125b).booleanValue()) {
                        eVar2.f300302l.mo83702b(C89849ae.OPA_ANDROID_WUWA_NOTIFICATION_DISMISSED);
                        eVar2.f300299i.mo78914c();
                        C84370p b2 = ((C84371q) eVar2.f300294d.mo56107c()).mo77930b(2);
                        C51803ds dsVar2 = (C51803ds) C51805du.f135924e.createBuilder();
                        dsVar2.copyOnWrite();
                        C51805du duVar2 = (C51805du) dsVar2.instance;
                        duVar2.f135926a |= 1;
                        duVar2.f135927b = "tts.CANCEL";
                        b2.mo77919a((C51805du) dsVar2.build());
                        ((C84371q) eVar2.f300294d.mo56107c()).mo77930b(2).mo77928j(1);
                        eVar2.mo96334m(true);
                    } else if (bvVar.f239124a == 3 && ((Boolean) bvVar.f239125b).booleanValue()) {
                        eVar.f300302l.mo83702b(C89849ae.OPA_ANDROID_WUWA_EXECUTION_COMPLETED);
                        eVar2.mo96334m(true);
                    } else if (bvVar.f239124a != 4 || !((Boolean) bvVar.f239125b).booleanValue()) {
                        ((C59052c) ((C59052c) C107929e.f300292a.mo56225c()).mo56372aa(26372)).mo56389s("Unsupported WuwaSessionContextData in SessionContext: %s", bbVar);
                    } else {
                        eVar2.f300302l.mo83702b(C89849ae.OPA_ANDROID_WUWA_EXECUTION_STARTED);
                        eVar2.f300296f.mo78814i(true);
                        MediaController a7 = eVar2.f300303m.mo81722a((String) null, false, true);
                        if (eVar2.f300300j.mo79746e(C90014bt.f247542jC) && a7 != null) {
                            a7.getTransportControls().pause();
                        }
                    }
                    eVar.mo96336o();
                }
            }
        }
    }
}
