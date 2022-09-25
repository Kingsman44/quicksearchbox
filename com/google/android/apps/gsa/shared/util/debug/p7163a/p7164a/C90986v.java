package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59798fz;
import com.google.common.p4552o.C59820gm;
import com.google.common.p4552o.C59822go;
import com.google.common.p4552o.C59824gq;
import com.google.common.p4552o.C59825gr;
import com.google.common.p4552o.C59856ht;
import com.google.common.p4552o.C59858hv;
import com.google.common.p4552o.C59977ia;
import com.google.common.p4552o.C59978ib;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.v */
/* compiled from: PG */
public final class C90986v extends C90983s {
    public C90986v(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: b */
    private final void m148615b(C59856ht htVar) {
        if (htVar != null) {
            this.f254188a.mo85258b(htVar.f161761b);
            this.f254188a.mo85261e();
            this.f254188a.mo85259c("Version Name", htVar.f161762c);
            this.f254188a.mo85260d();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        String str2;
        C59858hv hvVar = (C59858hv) messageLite;
        if (hvVar != null) {
            this.f254188a.mo85258b("System Info");
            this.f254188a.mo85261e();
            C59856ht htVar = hvVar.f161766b;
            if (htVar == null) {
                htVar = C59856ht.f161758d;
            }
            m148615b(htVar);
            C59856ht htVar2 = hvVar.f161767c;
            if (htVar2 == null) {
                htVar2 = C59856ht.f161758d;
            }
            m148615b(htVar2);
            C59798fz fzVar = hvVar.f161768d;
            if (fzVar == null) {
                fzVar = C59798fz.f161600i;
            }
            this.f254188a.mo85258b("Android Build Info");
            this.f254188a.mo85261e();
            this.f254188a.mo85259c("Device", fzVar.f161603b);
            this.f254188a.mo85259c("Release", fzVar.f161604c);
            this.f254188a.mo85259c("Id", fzVar.f161605d);
            this.f254188a.mo85259c("Model", fzVar.f161606e);
            if (fzVar.f161607f.size() > 0) {
                this.f254188a.mo85258b("Supported abis");
                this.f254188a.mo85261e();
                for (String a : fzVar.f161607f) {
                    this.f254188a.mo85257a(a);
                }
                this.f254188a.mo85260d();
            }
            this.f254188a.mo85259c("Tags", fzVar.f161608g);
            this.f254188a.mo85259c("Type", fzVar.f161609h);
            this.f254188a.mo85260d();
            C59978ib ibVar = hvVar.f161769e;
            if (ibVar == null) {
                ibVar = C59978ib.f162091e;
            }
            this.f254188a.mo85258b("Wifi Infos");
            this.f254188a.mo85261e();
            C90974j jVar = this.f254188a;
            int a2 = C59977ia.m92519a(ibVar.f162096d);
            if (a2 != 0) {
                switch (a2) {
                    case 1:
                        break;
                    case 2:
                        str = "INTERFACE_DISABLED";
                        break;
                    case 3:
                        str = "INACTIVE";
                        break;
                    case 4:
                        str = "SCANNING";
                        break;
                    case 5:
                        str = "AUTHENTICATING";
                        break;
                    case 6:
                        str = "ASSOCIATING";
                        break;
                    case 7:
                        str = "ASSOCIATED";
                        break;
                    case 8:
                        str = "FOUR_WAY_HANDSHAKE";
                        break;
                    case 9:
                        str = "GROUP_HANDSHAKE";
                        break;
                    case 10:
                        str = "COMPLETED";
                        break;
                    case 11:
                        str = "DORMANT";
                        break;
                    case 12:
                        str = "UNINITIALIZED";
                        break;
                    default:
                        str = "INVALID";
                        break;
                }
            }
            str = "DISCONNECTED";
            jVar.mo85259c("Supplicant State", str);
            C90974j jVar2 = this.f254188a;
            int i = ibVar.f162093a;
            jVar2.mo85259c("Link Speed", i + "Mbps");
            C90974j jVar3 = this.f254188a;
            int i2 = ibVar.f162094b;
            jVar3.mo85259c("Frequency", i2 + "MHz");
            C90974j jVar4 = this.f254188a;
            int i3 = ibVar.f162095c;
            jVar4.mo85259c("Received Signal Strength Indicator: ", i3 + "dBm");
            this.f254188a.mo85260d();
            C59825gr grVar = hvVar.f161770f;
            if (grVar == null) {
                grVar = C59825gr.f161654e;
            }
            this.f254188a.mo85258b("Cellular Network Infos");
            this.f254188a.mo85261e();
            C90974j jVar5 = this.f254188a;
            int a3 = C59820gm.m92511a(grVar.f161657b);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a3 != 8) {
                switch (a3) {
                    case 1:
                        str2 = "UNKNOWN";
                        break;
                    case 2:
                        str2 = "GPRS";
                        break;
                    case 3:
                        str2 = "EDGE";
                        break;
                    case 4:
                        str2 = "UMTS";
                        break;
                    case 5:
                        str2 = "CDMA";
                        break;
                    case 6:
                        str2 = "EVDO_0";
                        break;
                    case 7:
                        str2 = "EVDO_A";
                        break;
                    case 8:
                        str2 = "RTT";
                        break;
                    case 9:
                        str2 = "HSDPA";
                        break;
                    case 10:
                        str2 = "HSUPA";
                        break;
                    case 11:
                        str2 = "HSPA";
                        break;
                    case 12:
                        str2 = "IDEN";
                        break;
                    case 13:
                        str2 = "EVDO_B";
                        break;
                    case 14:
                        str2 = "LTE";
                        break;
                    case 15:
                        str2 = "EHRPD";
                        break;
                    default:
                        str2 = "HSPAP";
                        break;
                }
            } else {
                str2 = "1xRTT";
            }
            jVar5.mo85259c("Cellular Network Type", str2);
            C90974j jVar6 = this.f254188a;
            int a4 = C59822go.m92512a(grVar.f161658c);
            if (a4 == 0) {
                a4 = 1;
            }
            jVar6.mo85259c("Data Activity", (a4 != 1 ? a4 != 2 ? a4 != 3 ? a4 != 4 ? "DATA_DORMANT" : "DATA_INOUT" : "DATA_OUT" : "DATA_IN" : "DATA_NONE").substring(5));
            C90974j jVar7 = this.f254188a;
            int a5 = C59824gq.m92513a(grVar.f161659d);
            jVar7.mo85259c("Data Connection State", (a5 == 0 || a5 == 1) ? "DATA_DISCONNECTED" : a5 != 2 ? a5 != 3 ? "DATA_SUSPENDED" : "DATA_CONNECTED" : "DATA_CONNECTING");
            this.f254188a.mo85260d();
            this.f254188a.mo85260d();
        }
    }
}
