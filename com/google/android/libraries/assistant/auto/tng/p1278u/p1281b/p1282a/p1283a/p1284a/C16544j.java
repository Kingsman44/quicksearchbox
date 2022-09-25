package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.telephony.TelephonyManager;
import com.google.assistant.p3897e.p3917i.p3918a.C51255ay;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.j */
/* compiled from: PG */
public final class C16544j extends C68247h {

    /* renamed from: a */
    private final C68283d f48536a;

    public C16544j(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16544j.class), aVar);
        this.f48536a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C51261bd bdVar;
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        int i = 4;
        if (telephonyManager != null) {
            try {
                int callState = telephonyManager.getCallState();
                if (callState != 0) {
                    if (callState == 1) {
                        i = 5;
                    } else if (callState == 2) {
                        i = 2;
                    }
                }
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) C16543i.f48535a.mo56225c()).mo56382g(e)).mo56372aa(46317)).mo56386p("Error obtaining CallState");
                C51255ay ayVar = (C51255ay) C51261bd.f133446d.createBuilder();
                ayVar.copyOnWrite();
                C51261bd bdVar2 = (C51261bd) ayVar.instance;
                bdVar2.f133449b = 3;
                bdVar2.f133448a = 1 | bdVar2.f133448a;
                bdVar = (C51261bd) ayVar.build();
            }
        }
        C51255ay ayVar2 = (C51255ay) C51261bd.f133446d.createBuilder();
        ayVar2.copyOnWrite();
        C51261bd bdVar3 = (C51261bd) ayVar2.instance;
        bdVar3.f133449b = i - 1;
        bdVar3.f133448a = 1 | bdVar3.f133448a;
        bdVar = (C51261bd) ayVar2.build();
        return C60856cj.m92900i(bdVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48536a.mo60297gq();
    }
}
