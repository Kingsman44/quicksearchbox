package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.fi */
/* compiled from: PG */
public final /* synthetic */ class C112864fi implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C112869fn f312822a;

    public /* synthetic */ C112864fi(C112869fn fnVar) {
        this.f312822a = fnVar;
    }

    public final void accept(Object obj) {
        Optional optional;
        C112880fy fyVar = (C112880fy) this.f312822a.f312830c.mo27525b();
        C112036an a = fyVar.f312862g.mo99348a((C48570ad) obj);
        if (a.f311211b.mo79746e(C90063do.f249401co)) {
            int i = a.f311210a.f125483a;
        }
        if ((a.f311210a.f125483a & 1) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            a.mo99342d().get();
            C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
            C63088z byteString = ((C61752n) a.mo99342d().get()).toByteString();
            hcVar.copyOnWrite();
            C52152hd hdVar = (C52152hd) hcVar.instance;
            byteString.getClass();
            hdVar.f136852a |= 1;
            hdVar.f136853b = byteString;
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.IntentInput";
            C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString2.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString2;
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "asst_input.INTENT";
            dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            C63088z byteString3 = ((C51805du) dsVar.build()).toByteString();
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            byteString3.getClass();
            oyVar.f238176a |= 1;
            oyVar.f238177b = byteString3;
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
            optional = Optional.m71637of(jVar.mo82013a());
        } else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            fyVar.f312858c.mo96219b((ClientEventData) optional.get());
            fyVar.f312859d.f();
            return;
        }
        ((C59052c) ((C59052c) C112880fy.f312856a.mo56225c()).mo56372aa(27820)).mo56389s("Can't send NLU Intent with name %s", a.mo99343e());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
