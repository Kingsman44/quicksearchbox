package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1295g;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
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
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.g.c */
/* compiled from: PG */
public final class C16581c extends C68247h {

    /* renamed from: a */
    private final C68283d f48621a;

    /* renamed from: c */
    private final C68283d f48622c;

    /* renamed from: d */
    private final C68283d f48623d;

    public C16581c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C16581c.class), aVar);
        this.f48621a = C68236af.m98549d(dVar);
        this.f48622c = C68236af.m98549d(dVar2);
        this.f48623d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C66554ak akVar;
        List list = (List) obj;
        TelephonyManager telephonyManager = (TelephonyManager) list.get(0);
        ConnectivityManager connectivityManager = (ConnectivityManager) list.get(1);
        C15481g gVar = (C15481g) list.get(2);
        int[] iArr = C16580b.f48619a;
        C66553aj ajVar = (C66553aj) C66555al.f181029g.createBuilder();
        int[] a = C16580b.m33630a(telephonyManager.getNetworkOperator());
        if (a != C16580b.f48619a) {
            int i = a[0];
            ajVar.copyOnWrite();
            C66555al alVar = (C66555al) ajVar.instance;
            alVar.f181032a |= 1;
            alVar.f181033b = i;
            int i2 = a[1];
            ajVar.copyOnWrite();
            C66555al alVar2 = (C66555al) ajVar.instance;
            alVar2.f181032a = 2 | alVar2.f181032a;
            alVar2.f181034c = i2;
        }
        int[] a2 = C16580b.m33630a(telephonyManager.getSimOperator());
        if (a2 != C16580b.f48619a) {
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
                ((C59052c) ((C59052c) C16579a.f48618a.mo56224b()).mo56372aa(46388)).mo56386p("Unknown connection type.");
                akVar = C66554ak.UNKNOWN_CONNECTION_TYPE;
            }
            int i5 = akVar.f181028z;
            ajVar.copyOnWrite();
            C66555al alVar5 = (C66555al) ajVar.instance;
            alVar5.f181032a |= 16;
            alVar5.f181037f = i5;
        }
        gVar.mo22352b(C37179a.f97521bn);
        return C60856cj.m92900i(new C16462a(C58833ax.m90834k((C66555al) ajVar.build()), C66555al.f181030h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48621a.mo60297gq(), this.f48622c.mo60297gq(), this.f48623d.mo60297gq());
    }
}
