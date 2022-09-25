package com.google.android.libraries.search.assistant.p2828y.p2834d;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p3897e.p3917i.p3918a.C51255ay;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;

/* renamed from: com.google.android.libraries.search.assistant.y.d.a */
/* compiled from: PG */
public final class C36861a {

    /* renamed from: a */
    private final TelephonyManager f96008a;

    public C36861a(Context context, C39226b bVar) {
        this.f96008a = (TelephonyManager) C39239a.m68666a(context, bVar).getSystemService("phone");
    }

    /* renamed from: a */
    public final C51261bd mo40421a() {
        int callState;
        TelephonyManager telephonyManager = this.f96008a;
        int i = 4;
        if (!(telephonyManager == null || (callState = telephonyManager.getCallState()) == 0)) {
            if (callState == 1) {
                i = 5;
            } else if (callState == 2) {
                i = 2;
            }
        }
        C51255ay ayVar = (C51255ay) C51261bd.f133446d.createBuilder();
        ayVar.copyOnWrite();
        C51261bd bdVar = (C51261bd) ayVar.instance;
        bdVar.f133449b = i - 1;
        bdVar.f133448a = 1 | bdVar.f133448a;
        return (C51261bd) ayVar.build();
    }
}
