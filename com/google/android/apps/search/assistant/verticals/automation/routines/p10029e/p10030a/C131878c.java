package com.google.android.apps.search.assistant.verticals.automation.routines.p10029e.p10030a;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131845f;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10034g.C131899e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.proactive.p2770b.C36232a;
import com.google.assistant.p3861at.afy;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.assistant.p3897e.p3921j.aqb;
import com.google.assistant.p3897e.p3921j.aqc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47877k;
import com.google.p3717aq.p3718a.p3719a.C47879m;
import com.google.p3717aq.p3718a.p3719a.C47882p;
import com.google.p3717aq.p3718a.p3719a.C47883q;
import com.google.p3717aq.p3718a.p3719a.C47884r;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62950b;
import java.util.UUID;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.e.a.c */
/* compiled from: PG */
public final /* synthetic */ class C131878c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131879d f360125a;

    /* renamed from: b */
    public final /* synthetic */ afy f360126b;

    public /* synthetic */ C131878c(C131879d dVar, afy afy) {
        this.f360125a = dVar;
        this.f360126b = afy;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C131879d dVar = this.f360125a;
        afy afy = this.f360126b;
        String str2 = (String) obj;
        C131845f fVar = dVar.f360129c.f360073g;
        if (fVar == null) {
            fVar = C131845f.f360061b;
        }
        Context context = dVar.f360128b;
        Instant a = dVar.f360130d.mo57444a();
        UUID randomUUID = UUID.randomUUID();
        C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "workflow.TRIGGER";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.WorkflowTriggerInput";
        aqb aqb = (aqb) aqc.f135604e.createBuilder();
        String str3 = afy.f129191b;
        aqb.copyOnWrite();
        aqc aqc = (aqc) aqb.instance;
        str3.getClass();
        aqc.f135606a |= 1;
        aqc.f135607b = str3;
        aqb.copyOnWrite();
        aqc aqc2 = (aqc) aqb.instance;
        aqc2.f135608c = 13;
        aqc2.f135606a |= 2;
        C63088z byteString = ((aqc) aqb.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("workflow_trigger_input", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        aVar.copyOnWrite();
        C47868b bVar = (C47868b) aVar.instance;
        duVar2.getClass();
        bVar.f123939b = duVar2;
        bVar.f123938a = 2;
        C47868b bVar2 = (C47868b) aVar.build();
        C47867a aVar2 = (C47867a) C47868b.f123936f.createBuilder();
        if (afy.f129195f.equals("routine_0000008")) {
            str = String.format("opt:edit+id:%s+type:alarm", new Object[]{afy.f129191b});
        } else if (afy.f129195f.startsWith("routine_")) {
            str = String.format("opt:edit+preset_id:%s", new Object[]{afy.f129195f});
        } else {
            str = String.format("opt:edit+id:%s", new Object[]{afy.f129191b});
        }
        C58485gu p = C58485gu.m89848p("surface=1", "feature=routines", "feature_action=".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder();
        C58801sm G = p.listIterator(0);
        if (G.hasNext()) {
            while (true) {
                sb.append((CharSequence) G.next());
                if (!G.hasNext()) {
                    break;
                }
                sb.append("&");
            }
        }
        aVar2.mo51701a("assistant-settings://?".concat(sb.toString()));
        C47868b bVar3 = (C47868b) aVar2.build();
        C47872f fVar2 = (C47872f) C47887u.f123976l.createBuilder();
        String string = context.getString(R.string.assistant_trigger_routine_on_mobile_device_notification_title);
        fVar2.copyOnWrite();
        C47887u uVar = (C47887u) fVar2.instance;
        string.getClass();
        uVar.f123978a = 1;
        uVar.f123979b = string;
        String string2 = context.getString(R.string.assistant_trigger_routine_on_mobile_device_notification_text, new Object[]{C131899e.m214363a(context, afy)});
        fVar2.copyOnWrite();
        C47887u uVar2 = (C47887u) fVar2.instance;
        string2.getClass();
        uVar2.f123980c = 7;
        uVar2.f123981d = string2;
        fVar2.copyOnWrite();
        bVar2.getClass();
        ((C47887u) fVar2.instance).f123984g = bVar2;
        fVar2.copyOnWrite();
        ((C47887u) fVar2.instance).f123987j = C47877k.m85093a(2);
        C47879m mVar = (C47879m) C47884r.f123965g.createBuilder();
        C47882p pVar = (C47882p) C47883q.f123958f.createBuilder();
        C131879d dVar2 = dVar;
        long epochMilli = a.toEpochMilli();
        pVar.copyOnWrite();
        ((C47883q) pVar.instance).f123962c = epochMilli;
        mVar.copyOnWrite();
        C47883q qVar = (C47883q) pVar.build();
        qVar.getClass();
        ((C47884r) mVar.instance).f123971e = qVar;
        fVar2.copyOnWrite();
        C47884r rVar = (C47884r) mVar.build();
        rVar.getClass();
        ((C47887u) fVar2.instance).f123988k = rVar;
        C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
        gVar.copyOnWrite();
        ((C47875i) gVar.instance).f123949c = 1;
        String string3 = context.getString(R.string.assistant_notification_button_label_start_now);
        gVar.copyOnWrite();
        C47875i iVar = (C47875i) gVar.instance;
        string3.getClass();
        iVar.f123947a = 1;
        iVar.f123948b = string3;
        gVar.copyOnWrite();
        bVar2.getClass();
        ((C47875i) gVar.instance).f123950d = bVar2;
        fVar2.mo51703b((C47875i) gVar.build());
        C47873g gVar2 = (C47873g) C47875i.f123945g.createBuilder();
        gVar2.copyOnWrite();
        ((C47875i) gVar2.instance).f123949c = 2;
        String string4 = context.getString(R.string.assistant_notification_button_label_edit_routine);
        gVar2.copyOnWrite();
        C47875i iVar2 = (C47875i) gVar2.instance;
        string4.getClass();
        iVar2.f123947a = 1;
        iVar2.f123948b = string4;
        gVar2.copyOnWrite();
        bVar3.getClass();
        ((C47875i) gVar2.instance).f123950d = bVar3;
        fVar2.mo51703b((C47875i) gVar2.build());
        C47887u uVar3 = (C47887u) fVar2.build();
        aax aax = (aax) abc.f134691o.createBuilder();
        aax.copyOnWrite();
        abc abc = (abc) aax.instance;
        abc.f134697d = 1;
        abc.f134694a |= 1;
        aax.copyOnWrite();
        abc abc2 = (abc) aax.instance;
        abc2.f134699f = 1;
        abc2.f134694a |= 16;
        aax.copyOnWrite();
        abc abc3 = (abc) aax.instance;
        uVar3.getClass();
        abc3.f134698e = uVar3;
        abc3.f134694a |= 2;
        aax.copyOnWrite();
        abc abc4 = (abc) aax.instance;
        abc4.f134694a |= 32;
        abc4.f134700g = 2;
        abc abc5 = (abc) aax.build();
        aaj aaj = (aaj) aas.f134661u.createBuilder();
        String uuid = randomUUID.toString();
        aaj.copyOnWrite();
        aas aas = (aas) aaj.instance;
        uuid.getClass();
        aas.f134663a |= 16;
        aas.f134668f = uuid;
        C62910ar arVar = fVar.f360063a;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        long epochMilli2 = a.plus(C62950b.m95473d(arVar)).toEpochMilli();
        aaj.copyOnWrite();
        aas aas2 = (aas) aaj.instance;
        aas2.f134663a |= 4;
        aas2.f134666d = epochMilli2;
        String str4 = afy.f129191b;
        aaj.copyOnWrite();
        aas aas3 = (aas) aaj.instance;
        aas3.f134663a |= 256;
        aas3.f134670h = "routines_location_notification#".concat(String.valueOf(str4));
        aaj.copyOnWrite();
        aas aas4 = (aas) aaj.instance;
        aas4.f134664b = 1;
        aas4.f134663a |= 1;
        aam aam = (aam) aap.f134650h.createBuilder();
        aam.copyOnWrite();
        aap aap = (aap) aam.instance;
        aap.f134652a |= 1;
        aap.f134653b = 62;
        aam.copyOnWrite();
        aap aap2 = (aap) aam.instance;
        aap2.f134652a |= 4;
        aap2.f134655d = 348;
        aam.copyOnWrite();
        aap aap3 = (aap) aam.instance;
        aap3.f134658g = 0;
        aap3.f134652a |= 16;
        aap aap4 = (aap) aam.build();
        aaj.copyOnWrite();
        aas aas5 = (aas) aaj.instance;
        aap4.getClass();
        aas5.f134676n = aap4;
        aas5.f134663a |= 8192;
        aaj.mo58885m(abc.f134692p, abc5);
        aas aas6 = (aas) aaj.build();
        if (!str2.isEmpty()) {
            aaj aaj2 = (aaj) aas6.toBuilder();
            aaj2.copyOnWrite();
            aas aas7 = (aas) aaj2.instance;
            str2.getClass();
            aas7.f134663a |= 2048;
            aas7.f134674l = str2;
            aas6 = (aas) aaj2.build();
        }
        C36232a.m64676c(dVar2.f360128b, aas6, ajy.CLIENT_GENERATED.f158927f);
        return C60866ct.f164955a;
    }
}
