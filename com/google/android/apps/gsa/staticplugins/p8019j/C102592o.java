package com.google.android.apps.gsa.staticplugins.p8019j;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p3897e.p3917i.p3918a.C51255ay;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.o */
/* compiled from: PG */
public final class C102592o {

    /* renamed from: a */
    private static final C59071e f286347a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.j.o");

    /* renamed from: b */
    private final Context f286348b;

    /* renamed from: c */
    private final TelephonyManager f286349c;

    public C102592o(Context context) {
        this.f286348b = context;
        this.f286349c = (TelephonyManager) C39239a.m68666a(context, C39226b.TAG_CLASSIC_ASSISTANT).getSystemService("phone");
    }

    /* renamed from: a */
    public final C52232kc mo93347a() {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "call";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.CallStateParams";
        int i = 4;
        if (this.f286349c == null || (Build.VERSION.SDK_INT >= 31 && !C91077d.m148794e(this.f286348b, "android.permission.READ_PHONE_STATE"))) {
            ((C59052c) ((C59052c) f286347a.mo56224b()).mo56372aa(13962)).mo56386p("Failed to get CallState because permission READ_PHONE_STATE is not granted");
        } else {
            int callState = this.f286349c.getCallState();
            if (callState != 0) {
                if (callState == 1) {
                    i = 5;
                } else if (callState == 2) {
                    i = 2;
                }
            }
        }
        C51255ay ayVar = (C51255ay) C51261bd.f133446d.createBuilder();
        ayVar.copyOnWrite();
        C51261bd bdVar = (C51261bd) ayVar.instance;
        bdVar.f133449b = i - 1;
        bdVar.f133448a = 1 | bdVar.f133448a;
        C63088z byteString = ((C51261bd) ayVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }
}
