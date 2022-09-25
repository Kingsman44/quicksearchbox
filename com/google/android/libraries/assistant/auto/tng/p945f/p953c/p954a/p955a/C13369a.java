package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p955a;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13065k;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13067m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.C13368a;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p956b.C13373b;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p956b.C13374c;
import com.google.assistant.p3897e.p3902c.p3907c.C50962bg;
import com.google.assistant.p3897e.p3902c.p3907c.C50965bj;
import com.google.assistant.p3897e.p3902c.p3907c.C50966bk;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51138hu;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52435rq;
import com.google.assistant.p3897e.p3921j.C52438rt;
import com.google.assistant.p3897e.p3921j.acn;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.aep;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.assistant.p3897e.p3921j.aer;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.assistant.p3897e.p3921j.aey;
import com.google.assistant.p3897e.p3921j.aez;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51942ev;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51944ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.auto.tng.communication.notification.fulfiller.impl.MessageReadRequestFulfillerImpl$handleFulfillment$1", mo61344c = "MessageReadRequestFulfillerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.a.a.a */
/* compiled from: PG */
final class C13369a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C13370b f41118a;

    /* renamed from: b */
    final /* synthetic */ Optional f41119b;

    /* renamed from: c */
    final /* synthetic */ C13068n f41120c;

    /* renamed from: d */
    final /* synthetic */ boolean f41121d;

    /* renamed from: e */
    final /* synthetic */ String f41122e;

    /* renamed from: f */
    final /* synthetic */ C52091ex f41123f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13369a(C13370b bVar, Optional optional, C13068n nVar, boolean z, String str, C52091ex exVar, C69577g gVar) {
        super(2, gVar);
        this.f41118a = bVar;
        this.f41119b = optional;
        this.f41120c = nVar;
        this.f41121d = z;
        this.f41122e = str;
        this.f41123f = exVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C13369a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        int i;
        C58485gu guVar;
        C13368a aVar;
        C13368a aVar2;
        String str;
        C13368a aVar3;
        int i2;
        int a;
        int a2;
        C69554a aVar4 = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C13370b bVar = this.f41118a;
        Optional optional = this.f41119b;
        C13068n nVar = this.f41120c;
        boolean z = this.f41121d;
        if (!optional.isPresent() || (((a = C13065k.m29249a((i2 = nVar.f40559b))) != 0 && a == 3) || ((a2 = C13065k.m29249a(i2)) != 0 && a2 == 4))) {
            i = 1;
        } else {
            int a3 = C13067m.m29250a(nVar.f40561d);
            if (a3 != 0 && a3 == 2) {
                Object b = bVar.f41124a.mo17428b();
                C69664n.m101060f(b, "enableTapToReadOptimization.get()");
                if (((Boolean) b).booleanValue() && z) {
                    i = 3;
                }
            }
            i = 2;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            C13068n nVar2 = this.f41120c;
            String str2 = this.f41122e;
            C58976aa aaVar = C58975e.f156826a;
            C69664n.m101061g(nVar2, "inputParams");
            C69664n.m101061g(str2, "locale");
            int a4 = C13065k.m29249a(nVar2.f40559b);
            if (a4 == 0) {
                a4 = 1;
            }
            int i4 = a4 - 1;
            if (i4 == 2) {
                String str3 = nVar2.f40560c;
                C69664n.m101060f(str3, "inputParams.messageHandlingErrorMessage");
                guVar = C58485gu.m89846n(C13373b.m29631b(str3, str2));
                C69664n.m101060f(guVar, "of(createTtsClientOp(inp…ingErrorMessage, locale))");
            } else if (i4 != 3) {
                String str4 = nVar2.f40560c;
                C69664n.m101060f(str4, "inputParams.messageHandlingErrorMessage");
                guVar = C58485gu.m89846n(C13373b.m29631b(str4, str2));
                C69664n.m101060f(guVar, "of(createTtsClientOp(inp…ingErrorMessage, locale))");
            } else {
                C52435rq rqVar = (C52435rq) C52438rt.f137645h.createBuilder();
                rqVar.copyOnWrite();
                C52438rt rtVar = (C52438rt) rqVar.instance;
                rtVar.f137647a |= 1;
                rtVar.f137648b = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
                C62942bv build = rqVar.build();
                C69664n.m101060f(build, "newBuilder()\n        .se…TTINGS\")\n        .build()");
                C51809dy a5 = C12875h.m29133a("device.REQUEST_PERMISSION", "device_request_permission_args", "assistant.api.client_op.DeviceRequestPermissionArgs", (C52438rt) build);
                C69664n.m101060f(a5, "createClientOp(\n      op…questPermissionArgs\n    )");
                guVar = C58485gu.m89846n(a5);
                C69664n.m101060f(guVar, "of(createPermissionRequestClientOp())");
            }
            Optional of = Optional.m71637of(C13373b.m29630a(C69540x.m100944b(guVar)));
            C69664n.m101060f(of, "of(\n        ClientOpUtil…ocale))\n        )\n      )");
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            aVar = new C13368a(of, empty);
        } else if (i3 != 1) {
            C13370b bVar2 = this.f41118a;
            Object obj2 = this.f41119b.get();
            C69664n.m101060f(obj2, "messageNotification.get()");
            aco aco = (aco) obj2;
            Object b2 = this.f41118a.f41126c.mo17428b();
            C69664n.m101060f(b2, "shouldFireIntentThroughNls.get()");
            boolean booleanValue = ((Boolean) b2).booleanValue();
            C58976aa aaVar2 = C58975e.f156826a;
            Object b3 = bVar2.f41125b.mo17428b();
            C69664n.m101060f(b3, "enableImmersives.get()");
            boolean booleanValue2 = ((Boolean) b3).booleanValue();
            aer aer = (aer) aeu.f134959h.createBuilder();
            aet aet = aet.ALTERNATIVE;
            aer.copyOnWrite();
            aeu aeu = (aeu) aer.instance;
            aeu.f134963c = aet.f134958c;
            aeu.f134961a |= 2;
            aer.copyOnWrite();
            aeu aeu2 = (aeu) aer.instance;
            aeu2.f134961a |= 1;
            aeu2.f134962b = true;
            aer.copyOnWrite();
            aeu aeu3 = (aeu) aer.instance;
            aeu3.f134961a |= 4;
            aeu3.f134964d = true;
            aer.copyOnWrite();
            aeu aeu4 = (aeu) aer.instance;
            aeu4.f134961a |= 32;
            aeu4.f134966f = booleanValue2;
            C62942bv build2 = aer.build();
            C69664n.m101060f(build2, "newBuilder()\n        .se…Replies)\n        .build()");
            C51809dy a6 = C12875h.m29133a("notification.FETCH", "notification_fetch_args", "assistant.api.client_op.NotificationFetchArgs", (aeu) build2);
            C69664n.m101060f(a6, "createClientOp(\n      op…tificationFetchArgs\n    )");
            List b4 = C69540x.m100944b(a6);
            C58480gp e = C58485gu.m89837e();
            boolean a7 = bVar2.f41129f.mo21011a();
            aey aey = (aey) aez.f134976g.createBuilder();
            aey.copyOnWrite();
            aez aez = (aez) aey.instance;
            aez.f134978a |= 1;
            aez.f134979b = 0;
            aey.copyOnWrite();
            aez aez2 = (aez) aey.instance;
            aez2.f134978a |= 4;
            aez2.f134980c = !a7;
            C62942bv build3 = aey.build();
            C69664n.m101060f(build3, "newBuilder()\n        .se…Offline)\n        .build()");
            C51809dy a8 = C12875h.m29133a("notification.READ", "notification_read_args", "assistant.api.client_op.NotificationReadArgs", (aez) build3);
            C69664n.m101060f(a8, "createClientOp(\n      op…otificationReadArgs\n    )");
            e.mo55395g(a8);
            aep aep = (aep) aeq.f134947f.createBuilder();
            aep.copyOnWrite();
            aeq aeq = (aeq) aep.instance;
            aeq.f134949a |= 1;
            aeq.f134950b = 0;
            aep.copyOnWrite();
            aeq aeq2 = (aeq) aep.instance;
            aeq2.f134949a |= 2;
            aeq2.f134951c = booleanValue;
            aep.copyOnWrite();
            aeq aeq3 = (aeq) aep.instance;
            aeq3.f134949a |= 4;
            aeq3.f134952d = false;
            C62942bv build4 = aep.build();
            C69664n.m101060f(build4, "newBuilder()\n        .se…n(false)\n        .build()");
            C51809dy a9 = C12875h.m29133a("notification.MARK_AS_READ", "mark_notification_as_read_args", "assistant.api.client_op.MarkNotificationAsReadArgs", (aeq) build4);
            C69664n.m101060f(a9, "createClientOp(\n      op…ificationAsReadArgs\n    )");
            e.mo55395g(a9);
            Object b5 = bVar2.f41125b.mo17428b();
            C69664n.m101060f(b5, "enableImmersives.get()");
            if (!((Boolean) b5).booleanValue() || !bVar2.f41129f.mo21011a()) {
                aVar3 = aVar2;
                str = "messageNotification.get()";
            } else {
                Context context = bVar2.f41128e;
                Object b6 = bVar2.f41127d.mo17428b();
                C69664n.m101060f(b6, "useReplyClientInputForCustomReply.get()");
                boolean booleanValue3 = ((Boolean) b6).booleanValue();
                C69664n.m101061g(context, "context");
                C69664n.m101061g(aco, "messageNotification");
                C69664n.m101061g(context, "context");
                C69664n.m101061g(aco, "messageNotification");
                C51934en enVar = (C51934en) C51953ff.f136315l.createBuilder();
                enVar.copyOnWrite();
                C51953ff ffVar = (C51953ff) enVar.instance;
                ffVar.f136317a |= 2;
                ffVar.f136320d = "reply_button_id";
                enVar.copyOnWrite();
                C51953ff ffVar2 = (C51953ff) enVar.instance;
                ffVar2.f136317a |= 8;
                ffVar2.f136321e = "REPLY_INTENT_SELECTION";
                C51936ep epVar = C51936ep.READ_MESSAGE;
                enVar.copyOnWrite();
                C51953ff ffVar3 = (C51953ff) enVar.instance;
                ffVar3.f136323g = epVar.f136236u;
                ffVar3.f136317a |= 32;
                C51944ex exVar = (C51944ex) C51948fa.f136294i.createBuilder();
                C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
                if ((aco.f134823a & C89885b.S3REQUEST_VALUE) != 0) {
                    String str5 = aco.f134841s;
                    dbVar.copyOnWrite();
                    C51012dc dcVar = (C51012dc) dbVar.instance;
                    str5.getClass();
                    dcVar.f132815a |= 2;
                    dcVar.f132817c = str5;
                }
                if ((aco.f134823a & 16) != 0) {
                    C51011db dbVar2 = (C51011db) C51012dc.f132813k.createBuilder();
                    String str6 = aco.f134828f;
                    dbVar2.copyOnWrite();
                    C51012dc dcVar2 = (C51012dc) dbVar2.instance;
                    str6.getClass();
                    dcVar2.f132815a |= 32;
                    dcVar2.f132821g = str6;
                    C51012dc dcVar3 = (C51012dc) dbVar2.build();
                    dbVar.copyOnWrite();
                    C51012dc dcVar4 = (C51012dc) dbVar.instance;
                    dcVar3.getClass();
                    dcVar4.f132823i = dcVar3;
                    dcVar4.f132815a |= 1024;
                }
                C62942bv build5 = dbVar.build();
                C69664n.m101060f(build5, "newBuilder()\n        .ap…       }\n        .build()");
                C51012dc dcVar5 = (C51012dc) build5;
                C51138hu huVar = (C51138hu) C51141hx.f133119h.createBuilder();
                if ((aco.f134823a & 4) != 0) {
                    acn acn = aco.f134826d;
                    if (acn == null) {
                        acn = acn.f134817c;
                    }
                    C69664n.m101060f(acn, "messageNotification.getSender()");
                    if ((acn.f134819a & 2) != 0) {
                        String str7 = acn.f134820b;
                        huVar.copyOnWrite();
                        C51141hx hxVar = (C51141hx) huVar.instance;
                        str7.getClass();
                        aVar3 = aVar2;
                        hxVar.f133122b = 1;
                        hxVar.f133123c = str7;
                        huVar.copyOnWrite();
                        C51141hx hxVar2 = (C51141hx) huVar.instance;
                        dcVar5.getClass();
                        hxVar2.f133126f = dcVar5;
                        hxVar2.f133121a |= 16;
                        C62942bv build6 = huVar.build();
                        C69664n.m101060f(build6, "newBuilder()\n        .ap…       }\n        .build()");
                        C51141hx hxVar3 = (C51141hx) build6;
                        C51942ev evVar = (C51942ev) C51943ew.f136285f.createBuilder();
                        C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
                        eqVar.copyOnWrite();
                        C51941eu euVar = (C51941eu) eqVar.instance;
                        euVar.f136273a |= 8;
                        euVar.f136279g = "contact_form_field_id";
                        C50966bk bkVar = (C50966bk) C50969bn.f132678i.createBuilder();
                        C50962bg bgVar = (C50962bg) C50965bj.f132670e.createBuilder();
                        bgVar.copyOnWrite();
                        C50965bj bjVar = (C50965bj) bgVar.instance;
                        str = "messageNotification.get()";
                        bjVar.f132675d = 4;
                        bjVar.f132672a |= 1;
                        bgVar.copyOnWrite();
                        C50965bj bjVar2 = (C50965bj) bgVar.instance;
                        hxVar3.getClass();
                        bjVar2.f132674c = hxVar3;
                        bjVar2.f132673b = 3;
                        C50965bj bjVar3 = (C50965bj) bgVar.build();
                        bkVar.copyOnWrite();
                        C50969bn bnVar = (C50969bn) bkVar.instance;
                        bjVar3.getClass();
                        bnVar.f132682c = bjVar3;
                        bnVar.f132680a |= 2;
                        C50969bn bnVar2 = (C50969bn) bkVar.build();
                        eqVar.copyOnWrite();
                        C51941eu euVar2 = (C51941eu) eqVar.instance;
                        bnVar2.getClass();
                        euVar2.f136278f = bnVar2;
                        euVar2.f136277e = 16;
                        evVar.mo53759b((C51941eu) eqVar.build());
                        C62942bv build7 = evVar.build();
                        C69664n.m101060f(build7, "newBuilder()\n      .addF…()\n      )\n      .build()");
                        exVar.mo53763b((C51943ew) build7);
                        String string = context.getString(R.string.reply_button_string);
                        C69664n.m101060f(string, "context.getString(R.string.reply_button_string)");
                        C51941eu a10 = C13374c.m29632a("reply_button_id", false, string, aco, booleanValue3);
                        String string2 = context.getString(R.string.custom_reply_button_string);
                        C69664n.m101060f(string2, "context.getString(R.stri…stom_reply_button_string)");
                        C51941eu a11 = C13374c.m29632a("custom_reply_button_id", true, string2, aco, booleanValue3);
                        C51942ev evVar2 = (C51942ev) C51943ew.f136285f.createBuilder();
                        evVar2.mo53759b(a10);
                        evVar2.mo53759b(a11);
                        C62942bv build8 = evVar2.build();
                        C69664n.m101060f(build8, "newBuilder()\n      .addF…FormField)\n      .build()");
                        exVar.mo53763b((C51943ew) build8);
                        enVar.mo53755b((C51948fa) exVar.build());
                        C62942bv build9 = enVar.build();
                        C69664n.m101060f(build9, "newBuilder()\n      .setF…()\n      )\n      .build()");
                        C51809dy a12 = C12875h.m29133a("ui.SHOW_NATIVE_FORM", "show_native_form_args", "assistant.api.client_op.ShowNativeFormArgs", (C51953ff) build9);
                        C69664n.m101060f(a12, "createClientOp(\n      op…ClientInput\n      )\n    )");
                        e.mo55395g(a12);
                    }
                }
                aVar3 = aVar2;
                huVar.copyOnWrite();
                C51141hx hxVar22 = (C51141hx) huVar.instance;
                dcVar5.getClass();
                hxVar22.f133126f = dcVar5;
                hxVar22.f133121a |= 16;
                C62942bv build62 = huVar.build();
                C69664n.m101060f(build62, "newBuilder()\n        .ap…       }\n        .build()");
                C51141hx hxVar32 = (C51141hx) build62;
                C51942ev evVar3 = (C51942ev) C51943ew.f136285f.createBuilder();
                C51937eq eqVar2 = (C51937eq) C51941eu.f136271l.createBuilder();
                eqVar2.copyOnWrite();
                C51941eu euVar3 = (C51941eu) eqVar2.instance;
                euVar3.f136273a |= 8;
                euVar3.f136279g = "contact_form_field_id";
                C50966bk bkVar2 = (C50966bk) C50969bn.f132678i.createBuilder();
                C50962bg bgVar2 = (C50962bg) C50965bj.f132670e.createBuilder();
                bgVar2.copyOnWrite();
                C50965bj bjVar4 = (C50965bj) bgVar2.instance;
                str = "messageNotification.get()";
                bjVar4.f132675d = 4;
                bjVar4.f132672a |= 1;
                bgVar2.copyOnWrite();
                C50965bj bjVar22 = (C50965bj) bgVar2.instance;
                hxVar32.getClass();
                bjVar22.f132674c = hxVar32;
                bjVar22.f132673b = 3;
                C50965bj bjVar32 = (C50965bj) bgVar2.build();
                bkVar2.copyOnWrite();
                C50969bn bnVar3 = (C50969bn) bkVar2.instance;
                bjVar32.getClass();
                bnVar3.f132682c = bjVar32;
                bnVar3.f132680a |= 2;
                C50969bn bnVar22 = (C50969bn) bkVar2.build();
                eqVar2.copyOnWrite();
                C51941eu euVar22 = (C51941eu) eqVar2.instance;
                bnVar22.getClass();
                euVar22.f136278f = bnVar22;
                euVar22.f136277e = 16;
                evVar3.mo53759b((C51941eu) eqVar2.build());
                C62942bv build72 = evVar3.build();
                C69664n.m101060f(build72, "newBuilder()\n      .addF…()\n      )\n      .build()");
                exVar.mo53763b((C51943ew) build72);
                String string3 = context.getString(R.string.reply_button_string);
                C69664n.m101060f(string3, "context.getString(R.string.reply_button_string)");
                C51941eu a102 = C13374c.m29632a("reply_button_id", false, string3, aco, booleanValue3);
                String string22 = context.getString(R.string.custom_reply_button_string);
                C69664n.m101060f(string22, "context.getString(R.stri…stom_reply_button_string)");
                C51941eu a112 = C13374c.m29632a("custom_reply_button_id", true, string22, aco, booleanValue3);
                C51942ev evVar22 = (C51942ev) C51943ew.f136285f.createBuilder();
                evVar22.mo53759b(a102);
                evVar22.mo53759b(a112);
                C62942bv build82 = evVar22.build();
                C69664n.m101060f(build82, "newBuilder()\n      .addF…FormField)\n      .build()");
                exVar.mo53763b((C51943ew) build82);
                enVar.mo53755b((C51948fa) exVar.build());
                C62942bv build92 = enVar.build();
                C69664n.m101060f(build92, "newBuilder()\n      .setF…()\n      )\n      .build()");
                C51809dy a122 = C12875h.m29133a("ui.SHOW_NATIVE_FORM", "show_native_form_args", "assistant.api.client_op.ShowNativeFormArgs", (C51953ff) build92);
                C69664n.m101060f(a122, "createClientOp(\n      op…ClientInput\n      )\n    )");
                e.mo55395g(a122);
            }
            C58485gu f = e.mo55394f();
            C69664n.m101060f(f, "secondBlock.build()");
            Optional of2 = Optional.m71637of(C13373b.m29630a(C69540x.m100947e(b4, f)));
            C69664n.m101060f(of2, "of(ClientOpUtils.createO…k, secondBlock.build())))");
            Object obj3 = this.f41119b.get();
            C69664n.m101060f(obj3, str);
            aVar = new C13368a(of2, C13370b.m29626b((aco) obj3, this.f41120c, this.f41123f, true));
        } else {
            Object obj4 = this.f41119b.get();
            C69664n.m101060f(obj4, "messageNotification.get()");
            C13068n nVar3 = this.f41120c;
            C52091ex exVar2 = this.f41123f;
            C58976aa aaVar3 = C58975e.f156826a;
            Optional empty2 = Optional.empty();
            C69664n.m101060f(empty2, "empty()");
            return new C13368a(empty2, C13370b.m29626b((aco) obj4, nVar3, exVar2, false));
        }
        return aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C13369a(this.f41118a, this.f41119b, this.f41120c, this.f41121d, this.f41122e, this.f41123f, gVar);
    }
}
