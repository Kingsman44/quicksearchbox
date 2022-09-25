package com.google.android.apps.gsa.staticplugins.opa.p8378m;

import com.google.android.libraries.logging.C28294l;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.abx;
import com.google.assistant.p3897e.p3921j.aby;
import com.google.assistant.p3897e.p3921j.abz;
import com.google.assistant.p3897e.p3921j.aca;
import com.google.assistant.p3897e.p3921j.acb;
import com.google.assistant.p3897e.p3921j.acc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m.d */
/* compiled from: PG */
public final class C109458d {

    /* renamed from: a */
    private static final C59071e f304881a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.m.d");

    /* renamed from: a */
    public static C51805du m182153a(List list, byte[] bArr) {
        abx abx = (abx) aby.f134781d.createBuilder();
        abx.copyOnWrite();
        aby aby = (aby) abx.instance;
        C62971cq cqVar = aby.f134785c;
        if (!cqVar.mo58948c()) {
            aby.f134785c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) aby.f134785c);
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            abx.copyOnWrite();
            aby aby2 = (aby) abx.instance;
            aby2.f134783a |= 1;
            aby2.f134784b = A;
        }
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "notification.DISMISSED";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.NotificationDismissedParam";
        C63088z byteString = ((aby) abx.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("notification_dismissed_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: b */
    public static C51805du m182154b(byte[] bArr) {
        abz abz = (abz) acc.f134794e.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        abz.copyOnWrite();
        acc acc = (acc) abz.instance;
        acc.f134796a |= 4;
        acc.f134797b = A;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "notification.TRIGGER";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.NotificationRequestParam";
        C63088z byteString = ((acc) abz.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("notification_request_params", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: c */
    public static C51805du m182155c(byte[] bArr, int i, String str, C58833ax axVar) {
        C60214n nVar;
        abz abz = (abz) acc.f134794e.createBuilder();
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            abz.copyOnWrite();
            acc acc = (acc) abz.instance;
            acc.f134796a |= 4;
            acc.f134797b = A;
        }
        abz.copyOnWrite();
        acc acc2 = (acc) abz.instance;
        acc2.f134796a |= 8;
        acc2.f134798c = i + 1;
        if (axVar.mo56113h()) {
            aca aca = (aca) acb.f134790c.createBuilder();
            String str2 = (String) axVar.mo56107c();
            aca.copyOnWrite();
            acb acb = (acb) aca.instance;
            str2.getClass();
            acb.f134792a |= 1;
            acb.f134793b = str2;
            acb acb2 = (acb) aca.build();
            abz.copyOnWrite();
            acc acc3 = (acc) abz.instance;
            acb2.getClass();
            acc3.f134799d = acb2;
            acc3.f134796a |= 16;
        }
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "notification.notification_request";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.NotificationRequestParam";
        C63088z byteString = ((acc) abz.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("notification_request_params", (C52230ka) jzVar.build());
        if (!C58837ba.m90859h(str)) {
            try {
                nVar = C28294l.m52911a(str);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f304881a.mo56225c()).mo56382g(e)).mo56372aa(24065)).mo56386p("Cannot parse the click-tracking VED from the server.");
                nVar = null;
            }
            if (nVar != null) {
                C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar2.copyOnWrite();
                C52230ka kaVar3 = (C52230ka) jzVar2.instance;
                kaVar3.f137059a |= 1;
                kaVar3.f137060b = "logs.ClickTrackingCGI";
                C63088z byteString2 = nVar.toByteString();
                jzVar2.copyOnWrite();
                C52230ka kaVar4 = (C52230ka) jzVar2.instance;
                byteString2.getClass();
                kaVar4.f137059a |= 2;
                kaVar4.f137061c = byteString2;
                dsVar.mo53729a("click_tracking_cgi_params", (C52230ka) jzVar2.build());
            }
        }
        return (C51805du) dsVar.build();
    }
}
