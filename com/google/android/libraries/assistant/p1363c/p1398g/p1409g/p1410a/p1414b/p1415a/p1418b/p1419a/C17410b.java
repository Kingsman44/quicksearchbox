package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1418b.p1419a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.C17404a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1418b.C17408a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66553aj;
import com.google.speech.p5208h.C66554ak;
import com.google.speech.p5208h.C66555al;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.b.a.b */
/* compiled from: PG */
public final class C17410b extends C68247h {

    /* renamed from: a */
    private final C68283d f50307a;

    /* renamed from: c */
    private final C68283d f50308c;

    public C17410b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C17410b.class), aVar);
        this.f50307a = C68236af.m98549d(dVar);
        this.f50308c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C66554ak akVar;
        List list = (List) obj;
        TelephonyManager telephonyManager = (TelephonyManager) list.get(0);
        ConnectivityManager connectivityManager = (ConnectivityManager) list.get(1);
        int[] iArr = C17409a.f50305a;
        C66553aj ajVar = (C66553aj) C66555al.f181029g.createBuilder();
        int[] a = C17409a.m34686a(telephonyManager.getNetworkOperator());
        if (a != C17409a.f50305a) {
            int i = a[0];
            ajVar.copyOnWrite();
            C66555al alVar = (C66555al) ajVar.instance;
            alVar.f181032a |= 1;
            alVar.f181033b = i;
            int i2 = a[1];
            ajVar.copyOnWrite();
            C66555al alVar2 = (C66555al) ajVar.instance;
            alVar2.f181032a |= 2;
            alVar2.f181034c = i2;
        }
        int[] a2 = C17409a.m34686a(telephonyManager.getSimOperator());
        if (a2 != C17409a.f50305a) {
            int i3 = a2[0];
            ajVar.copyOnWrite();
            C66555al alVar3 = (C66555al) ajVar.instance;
            alVar3.f181032a |= 4;
            alVar3.f181035d = i3;
            int i4 = a2[1];
            ajVar.copyOnWrite();
            C66555al alVar4 = (C66555al) ajVar.instance;
            alVar4.f181032a |= 8;
            alVar4.f181036e = i4;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            boolean isConnected = activeNetworkInfo.isConnected();
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            C58976aa aaVar = C58975e.f156826a;
            if (!isConnected) {
                akVar = C66554ak.NO_CONNECTION;
            } else if (type == 1) {
                akVar = C66554ak.WIFI;
            } else if (type == 6) {
                akVar = C66554ak.WIMAX;
            } else if (type == 7) {
                akVar = C66554ak.BLUETOOTH;
            } else if (type == 9) {
                akVar = C66554ak.ETHERNET;
            } else if (type == 0) {
                switch (subtype) {
                    case 1:
                        akVar = C66554ak.GPRS;
                        break;
                    case 2:
                        akVar = C66554ak.EDGE;
                        break;
                    case 3:
                        akVar = C66554ak.UMTS;
                        break;
                    case 4:
                        akVar = C66554ak.CDMA;
                        break;
                    case 5:
                        akVar = C66554ak.EVDO_0;
                        break;
                    case 6:
                        akVar = C66554ak.EVDO_A;
                        break;
                    case 7:
                        akVar = C66554ak.RTT;
                        break;
                    case 8:
                        akVar = C66554ak.HSDPA;
                        break;
                    case 9:
                        akVar = C66554ak.HSUPA;
                        break;
                    case 10:
                        akVar = C66554ak.HSPA;
                        break;
                    case 11:
                        akVar = C66554ak.IDEN;
                        break;
                    case 12:
                        akVar = C66554ak.EVDO_B;
                        break;
                    case 13:
                        akVar = C66554ak.LTE;
                        break;
                    case 14:
                        akVar = C66554ak.EHRPD;
                        break;
                    case 15:
                        akVar = C66554ak.HSPAP;
                        break;
                    default:
                        C66554ak akVar2 = C66554ak.UNKNOWN;
                        akVar = C66554ak.UNKNOWN_CELLULAR;
                        break;
                }
            } else {
                C59104x b = C17408a.f50304a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "TTS.Server");
                ((C59052c) ((C59052c) b).mo56372aa(42710)).mo56386p("Unknown connection type.");
                akVar = C66554ak.UNKNOWN_CONNECTION_TYPE;
            }
            int i5 = akVar.f181028z;
            ajVar.copyOnWrite();
            C66555al alVar5 = (C66555al) ajVar.instance;
            alVar5.f181032a |= 16;
            alVar5.f181037f = i5;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C60856cj.m92900i(new C17404a(Optional.m71637of((C66555al) ajVar.build()), C66555al.f181030h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f50307a.mo60297gq(), this.f50308c.mo60297gq());
    }
}
