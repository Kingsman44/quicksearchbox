package com.google.android.libraries.search.assistant.p2783s.p2785b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.speech.p5208h.C66554ak;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.MobileInfoProvider$getActiveNetworkType$2", mo61344c = "MobileInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.s.b.e */
/* compiled from: PG */
final class C36386e extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C36395n f95016a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36386e(C36395n nVar, C69577g gVar) {
        super(2, gVar);
        this.f95016a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36386e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        NetworkInfo activeNetworkInfo;
        C66554ak akVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f95016a.f95041a.getSystemService("connectivity");
        if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
            if (activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
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
                            akVar = C66554ak.UNKNOWN_CELLULAR;
                            break;
                    }
                } else if (type == 1) {
                    akVar = C66554ak.WIFI;
                } else if (type == 6) {
                    akVar = C66554ak.WIMAX;
                } else if (type == 7) {
                    akVar = C66554ak.BLUETOOTH;
                } else if (type != 9) {
                    akVar = C66554ak.UNKNOWN_CONNECTION_TYPE;
                } else {
                    akVar = C66554ak.ETHERNET;
                }
            } else {
                akVar = C66554ak.NO_CONNECTION;
            }
            if (akVar != null) {
                return akVar;
            }
        }
        return C66554ak.UNKNOWN;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36386e(this.f95016a, gVar);
    }
}
