package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52370pf;
import com.google.assistant.p3897e.p3921j.add;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62947c;
import java.util.List;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70976ac;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70978ae;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70979af;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bj */
/* compiled from: PG */
public final /* synthetic */ class C35551bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35556bo f93357a;

    /* renamed from: b */
    public final /* synthetic */ C52370pf f93358b;

    public /* synthetic */ C35551bj(C35556bo boVar, C52370pf pfVar) {
        this.f93357a = boVar;
        this.f93358b = pfVar;
    }

    public final Object apply(Object obj) {
        C35556bo boVar = this.f93357a;
        C52370pf pfVar = this.f93358b;
        C58485gu guVar = (C58485gu) obj;
        C37215b bVar = boVar.f93367d;
        C37252a c = C37176a.f97089ev.mo40805c(C62722b.OK);
        C62940bt btVar = C70977ad.f189267f;
        C70976ac acVar = (C70976ac) C70977ad.f189266e.createBuilder();
        C70978ae aeVar = (C70978ae) C70979af.f189273c.createBuilder();
        int size = guVar.size();
        aeVar.copyOnWrite();
        C70979af afVar = (C70979af) aeVar.instance;
        afVar.f189275a |= 1;
        afVar.f189276b = size;
        C70979af afVar2 = (C70979af) aeVar.build();
        acVar.copyOnWrite();
        C70977ad adVar = (C70977ad) acVar.instance;
        afVar2.getClass();
        adVar.f189271c = afVar2;
        adVar.f189269a |= 2;
        ((C37253b) c).mo40792p(btVar, (C70977ad) acVar.build());
        bVar.mo19974a(c);
        add add = (add) ade.f134877h.createBuilder();
        add.copyOnWrite();
        ade ade = (ade) add.instance;
        ade.mo53674a();
        C62947c.addAll((Iterable) guVar, (List) ade.f134885g);
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b(C35556bo.m63911b("person_result", ((ade) add.build()).toByteString(), "assistant.api.dialog_state.values.Person"));
        eaVar.mo53780b(C35556bo.m63911b("contact_query_args", pfVar.toByteString(), "assistant.api.client_op.ContactQueryArgs"));
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }
}
