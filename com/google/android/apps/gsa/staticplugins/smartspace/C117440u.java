package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92034ad;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3820ak.C49215n;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3897e.p3921j.p3926e.C52017hp;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53242gq;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.u */
/* compiled from: PG */
public final /* synthetic */ class C117440u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117350ai f325975a;

    public /* synthetic */ C117440u(C117350ai aiVar) {
        this.f325975a = aiVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C53245gt gtVar;
        OptionalLong optionalLong;
        C53234gi giVar;
        C49215n nVar;
        OptionalLong optionalLong2;
        C117350ai aiVar = this.f325975a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C50818do doVar = ((C83741am) axVar.mo56107c()).f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            long b = aiVar.f325756f.mo26870b() - doVar.f132317n;
            if (b <= 0 || b > aiVar.f325758h.mo79743a(C89985ax.f246685aL)) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                C83739ak akVar = ((C83741am) axVar.mo56107c()).f228251b;
                if (akVar == null) {
                    akVar = C83739ak.f228230q;
                }
                C83738aj ajVar = akVar.f228233b;
                if (ajVar == null) {
                    ajVar = C83738aj.f228226c;
                }
                if (ajVar.f228228a == 3) {
                    gtVar = (C53245gt) ajVar.f228229b;
                } else {
                    gtVar = C53245gt.f139564n;
                }
                C53230ge geVar = (C53230ge) gtVar.f139569c.get(0);
                OptionalLong empty = OptionalLong.empty();
                String str = null;
                if (!aiVar.f325758h.mo79746e(C90017bw.f247969be) || !aiVar.f325761k.mo77161F()) {
                    optionalLong = empty;
                    giVar = null;
                } else {
                    C53234gi giVar2 = gtVar.f139573g;
                    if (giVar2 == null) {
                        giVar2 = C53234gi.f139523e;
                    }
                    if ((gtVar.f139567a & 8) != 0) {
                        C63042fg fgVar = gtVar.f139572f;
                        if (fgVar == null) {
                            fgVar = C63042fg.f170152c;
                        }
                        if (fgVar.f170154a > 0) {
                            C63042fg fgVar2 = gtVar.f139572f;
                            if (fgVar2 == null) {
                                fgVar2 = C63042fg.f170152c;
                            }
                            optionalLong2 = OptionalLong.m71641of(C62953e.m95478c(fgVar2));
                            optionalLong = optionalLong2;
                            giVar = giVar2;
                        }
                    }
                    optionalLong2 = OptionalLong.m71641of(aiVar.f325756f.mo26870b());
                    optionalLong = optionalLong2;
                    giVar = giVar2;
                }
                if ((gtVar.f139567a & 1024) != 0) {
                    C49215n nVar2 = gtVar.f139579m;
                    if (nVar2 == null) {
                        nVar2 = C49215n.f127253d;
                    }
                    nVar = nVar2;
                } else {
                    nVar = null;
                }
                int parseInt = Integer.parseInt(geVar.f139507c);
                boolean z = gtVar.f139574h;
                String str2 = geVar.f139512h;
                String str3 = geVar.f139506b;
                if ((gtVar.f139567a & 256) != 0) {
                    C53242gq gqVar = gtVar.f139577k;
                    if (gqVar == null) {
                        gqVar = C53242gq.f139546f;
                    }
                    if (!gqVar.f139550c.isEmpty() && !gqVar.f139551d) {
                        C53242gq gqVar2 = gtVar.f139577k;
                        if (gqVar2 == null) {
                            gqVar2 = C53242gq.f139546f;
                        }
                        str = gqVar2.f139550c;
                    }
                }
                String str4 = str;
                C62971cq cqVar = gtVar.f139569c;
                int a = C52017hp.m86469a(geVar.f139513i);
                int i = a == 0 ? 1 : a;
                C53232gg a2 = C53232gg.m86789a(gtVar.f139568b);
                if (a2 == null) {
                    a2 = C53232gg.UNKNOWN;
                }
                return aiVar.mo78853f(new C92035ae(parseInt, z, str2, str3, (C92034ad) null, str4, giVar, cqVar, optionalLong, i, nVar, a2));
            }
        }
        return C118826c.f331423b;
    }
}
