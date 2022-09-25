package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.SecondaryWidgetRadioButtonPreference;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49913dq;
import com.google.assistant.p3861at.C50289ro;
import com.google.assistant.p3861at.C50291rq;
import com.google.assistant.p3861at.C50292rr;
import com.google.assistant.p3861at.C50294rt;
import com.google.assistant.p3861at.act;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.libassistant.g */
/* compiled from: PG */
final class C9724g extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C9726i f33601a;

    public C9724g(C9726i iVar) {
        this.f33601a = iVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        C50294rt rtVar;
        boolean z;
        boolean z2;
        act act = (act) obj;
        if (act != null) {
            C9726i iVar = this.f33601a;
            C49893cx cxVar = null;
            if ((act.f128895b & 256) != 0) {
                rtVar = act.f128878E;
                if (rtVar == null) {
                    rtVar = C50294rt.f130883b;
                }
            } else {
                rtVar = null;
            }
            if ((act.f128894a & 64) != 0 && (cxVar = act.f128900g) == null) {
                cxVar = C49893cx.f129688b;
            }
            C49891cv c = iVar.f33604j.c(C49875cf.LIBASSISTANT, iVar.f33607m, cxVar);
            if (c != null && rtVar != null && iVar.f33605k != null && iVar.f33606l != null) {
                C49913dq dqVar = c.f129684w;
                if (dqVar == null) {
                    dqVar = C49913dq.f129735e;
                }
                for (C50292rr rrVar : rtVar.f130885a) {
                    if (new C62963cj(rrVar.f130881d, C50292rr.f130875e).contains(C50291rq.AUDIO_OUTPUT_DEVICE) && C50289ro.m85801a(rrVar.f130878a) != C50289ro.DEVICEID_NOT_SET) {
                        SecondaryWidgetRadioButtonPreference b = iVar.mo17992b(rrVar, true);
                        if (!(dqVar == null || rrVar == null)) {
                            int i = dqVar.f129737a;
                            if (i == 1) {
                                if (rrVar.f130878a == 1) {
                                    z2 = ((String) dqVar.f129738b).equalsIgnoreCase((String) rrVar.f130879b);
                                }
                            } else if (i == 3 && rrVar.f130878a == 2) {
                                z2 = ((String) dqVar.f129738b).equalsIgnoreCase((String) rrVar.f130879b);
                            }
                            if (z2) {
                                b.mo8391j(true);
                                iVar.f33608n = b;
                            }
                        }
                        iVar.f33605k.mo8379af(b);
                    }
                    if (new C62963cj(rrVar.f130881d, C50292rr.f130875e).contains(C50291rq.VIDEO_OUTPUT_DEVICE) && C50289ro.m85801a(rrVar.f130878a) != C50289ro.DEVICEID_NOT_SET) {
                        SecondaryWidgetRadioButtonPreference b2 = iVar.mo17992b(rrVar, false);
                        if (!(dqVar == null || rrVar == null)) {
                            int i2 = dqVar.f129739c;
                            if (i2 == 2) {
                                if (rrVar.f130878a == 1) {
                                    z = ((String) dqVar.f129740d).equalsIgnoreCase((String) rrVar.f130879b);
                                }
                            } else if (i2 == 4 && rrVar.f130878a == 2) {
                                z = ((String) dqVar.f129740d).equalsIgnoreCase((String) rrVar.f130879b);
                            }
                            if (z) {
                                b2.mo8391j(true);
                                iVar.f33609o = b2;
                            }
                        }
                        iVar.f33606l.mo8379af(b2);
                    }
                }
            }
        }
    }
}
