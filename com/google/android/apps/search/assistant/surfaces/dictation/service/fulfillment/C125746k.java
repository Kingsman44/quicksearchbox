package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125698e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125702i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126295ad;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.knowledge.p4661a.p4662a.C61739ab;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.C69677g;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.k */
/* compiled from: PG */
public final /* synthetic */ class C125746k implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C125702i f346549a;

    public /* synthetic */ C125746k(C125702i iVar) {
        this.f346549a = iVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Optional optional;
        C61752n nVar;
        C51805du duVar;
        C125702i iVar = this.f346549a;
        C63070h hVar = (C63070h) obj;
        C125708c cVar = (C125708c) obj2;
        C69664n.m101061g(hVar, "buttonPressPayload");
        C69664n.m101061g(cVar, "context");
        if (hVar.f170217a.isEmpty()) {
            ((C59052c) ((C59052c) C126336m.f348024a.mo56226d()).mo56372aa(37004)).mo56386p("Missing button payload. [SD]");
            optional = Optional.empty();
        } else {
            C125045k kVar = (C125045k) C126336m.m206592c(hVar).orElse(C125045k.f345012c);
            C69664n.m101061g(kVar, "suggestionChipData");
            C125044j a = C125044j.m204969a(kVar.f345014a);
            if (a == null) {
                a = C125044j.UNRECOGNIZED;
            }
            switch (a.ordinal()) {
                case 0:
                case 14:
                case 15:
                case 17:
                case 18:
                    nVar = null;
                    break;
                case 1:
                    nVar = C126295ad.m206516a("StopDictation");
                    break;
                case 2:
                    nVar = C126295ad.m206516a("DeleteEditingObject");
                    break;
                case 3:
                    nVar = C126295ad.m206516a("Send_contextual_digital_object");
                    break;
                case 4:
                    nVar = C126295ad.m206516a("ConfirmSearch");
                    break;
                case 5:
                    nVar = C126295ad.m206516a("UndoAction");
                    break;
                case 6:
                    nVar = C126295ad.m206517b("RelativeListPositionNext");
                    break;
                case 7:
                    nVar = C126295ad.m206517b("RelativeListPositionPrevious");
                    break;
                case 8:
                    C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
                    C69664n.m101060f(sVar, "newBuilder()");
                    C61739ab a2 = C69664n.m101061g(sVar, "builder");
                    C61757s sVar2 = a2.f166787a;
                    sVar2.copyOnWrite();
                    C61758t tVar = (C61758t) sVar2.instance;
                    tVar.f166826a = 2;
                    tVar.f166827b = 1L;
                    nVar = C126295ad.m206518c("SelectItemFromMenu", "menu_item_position", a2.mo58171a());
                    break;
                case 9:
                    C61757s sVar3 = (C61757s) C61758t.f166824c.createBuilder();
                    C69664n.m101060f(sVar3, "newBuilder()");
                    C61739ab a3 = C69664n.m101061g(sVar3, "builder");
                    a3.mo58172b("subject");
                    nVar = C126295ad.m206518c("FillFormField", "field_name", a3.mo58171a());
                    break;
                case 10:
                    C61757s sVar4 = (C61757s) C61758t.f166824c.createBuilder();
                    C69664n.m101060f(sVar4, "newBuilder()");
                    C61739ab a4 = C69664n.m101061g(sVar4, "builder");
                    a4.mo58172b("body");
                    nVar = C126295ad.m206518c("FillFormField", "field_name", a4.mo58171a());
                    break;
                case 11:
                    nVar = C126295ad.m206516a("AddUIElement");
                    break;
                case 12:
                    nVar = C126295ad.m206516a("SaveEntity");
                    break;
                case 13:
                    nVar = C126295ad.m206516a("DeleteAllContent");
                    break;
                case 16:
                    nVar = C126295ad.m206516a("Delete_message_flattened");
                    break;
                default:
                    throw new C69677g();
            }
            if (nVar == null) {
                duVar = null;
            } else {
                C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
                C63088z byteString = nVar.toByteString();
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
                kaVar2.f137059a = 2 | kaVar2.f137059a;
                kaVar2.f137061c = byteString2;
                C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                dsVar.copyOnWrite();
                C51805du duVar2 = (C51805du) dsVar.instance;
                duVar2.f135926a |= 1;
                duVar2.f135927b = "asst_input.INTENT";
                dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
                duVar = (C51805du) dsVar.build();
            }
            if (duVar == null && C126336m.m206590a(hVar) == C125044j.EMOJI_SUGGESTION) {
                duVar = C126336m.m206591b(hVar);
            }
            if (duVar == null) {
                ((C59052c) ((C59052c) C126336m.f348024a.mo56226d()).mo56372aa(37003)).mo56386p("Malformed button payload. [SD]");
            }
            optional = Optional.ofNullable(duVar);
        }
        if (!optional.isPresent()) {
            C125044j a5 = C126336m.m206590a(hVar);
            C59052c cVar2 = (C59052c) C125702i.f346453a.mo56226d();
            C69664n.m101060f(a5, "chipId");
            C61301b d = C126288a.m206492d(a5);
            cVar2.mo56379ah(new C59094n(36640));
            cVar2.mo56389s("Unimplemented button %s [SD]", d);
            return C60856cj.m92900i(C69496am.f185918a);
        }
        Object obj3 = optional.get();
        C69664n.m101060f(obj3, "clientInput.get()");
        C51805du duVar3 = (C51805du) obj3;
        C69664n.m101061g(duVar3, "clientInput");
        C69664n.m101061g(cVar, "context");
        return C71663i.m104688a(C71803m.m105042c(iVar.f346455c, (C69585o) null, (C71424ay) null, new C125698e(iVar, duVar3, cVar, (C69577g) null), 3));
    }
}
