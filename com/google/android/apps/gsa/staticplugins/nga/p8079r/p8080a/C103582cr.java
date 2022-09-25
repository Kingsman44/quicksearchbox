package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.os.Build;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.logger.C89837aa;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7060f.C89914c;
import com.google.android.apps.gsa.shared.logger.p7060f.C89915d;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66585bk;
import com.google.speech.p5208h.C66586bl;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5218j.C67161nh;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67476x;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.cr */
/* compiled from: PG */
public final /* synthetic */ class C103582cr implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C89859i f288578a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f288579b;

    /* renamed from: c */
    public final /* synthetic */ C89837aa f288580c;

    public /* synthetic */ C103582cr(C89859i iVar, C69464a aVar, C89837aa aaVar) {
        this.f288578a = iVar;
        this.f288579b = aVar;
        this.f288580c = aaVar;
    }

    public final Object apply(Object obj) {
        char c;
        String str;
        int i;
        String str2;
        Object obj2;
        String str3;
        int i2;
        int a;
        C89859i iVar = this.f288578a;
        C69464a aVar = this.f288579b;
        C89837aa aaVar = this.f288580c;
        C67438ag agVar = (C67438ag) obj;
        C118928k kVar = C103584ct.f288582a;
        C67442ak akVar = agVar.f183264g;
        if (akVar == null) {
            akVar = C67442ak.f183276i;
        }
        if (!akVar.f183281d.isEmpty()) {
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.ASR_PREFETCH_S3_HANDOVER;
            C67442ak akVar2 = agVar.f183264g;
            if (akVar2 == null) {
                akVar2 = C67442ak.f183276i;
            }
            fVar.mo83701c("queryHash", Integer.toString(((C67468p) akVar2.f183281d.get(0)).f183367b.hashCode()));
            iVar.mo74236a(fVar.mo83699a());
        }
        boolean e = ((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f251087cG);
        String str4 = "empty";
        if ((agVar.f183258a & 8) != 0) {
            C67476x xVar = agVar.f183262e;
            if (xVar == null) {
                xVar = C67476x.f183390i;
            }
            if ((xVar.f183392a & 65536) != 0) {
                C67476x xVar2 = agVar.f183262e;
                if (xVar2 == null) {
                    xVar2 = C67476x.f183390i;
                }
                str = String.valueOf(xVar2.f183399h);
            } else {
                str = str4;
            }
            c = 2;
        } else {
            str = str4;
            c = 1;
        }
        if ((agVar.f183258a & 32) != 0) {
            C67442ak akVar3 = agVar.f183264g;
            if (((akVar3 == null ? C67442ak.f183276i : akVar3).f183278a & 256) != 0) {
                if (akVar3 == null) {
                    akVar3 = C67442ak.f183276i;
                }
                str = String.valueOf(akVar3.f183283f);
            }
            c = 3;
        }
        if ((agVar.f183258a & 4) != 0) {
            C67442ak akVar4 = agVar.f183261d;
            if (((akVar4 == null ? C67442ak.f183276i : akVar4).f183278a & 256) != 0) {
                if (akVar4 == null) {
                    akVar4 = C67442ak.f183276i;
                }
                str = String.valueOf(akVar4.f183283f);
            }
            c = 4;
        }
        C62940bt r10 = C62942bv.checkIsLite(C89915d.f246344f);
        agVar.mo58887l(r10);
        if (agVar.f169962ag.mo58857o(r10.f169971d)) {
            C62940bt r102 = C62942bv.checkIsLite(C89915d.f246344f);
            agVar.mo58887l(r102);
            Object l = agVar.f169962ag.mo58854l(r102.f169971d);
            if (l == null) {
                obj2 = r102.f169969b;
            } else {
                obj2 = r102.mo58889c(l);
            }
            C89915d dVar = (C89915d) obj2;
            i = C89914c.m146438a(dVar.f246349d);
            if (i == 0) {
                i = 1;
            }
            if ((dVar.f246346a & 1) == 0 || (a = C67161nh.m97429a(i2)) == 0 || a == 1) {
                str3 = str4;
            } else {
                int a2 = C67161nh.m97429a((i2 = dVar.f246347b));
                str3 = String.valueOf(a2 != 0 && a2 == 2);
            }
            if (!dVar.f246348c.isEmpty()) {
                String str5 = dVar.f246348c;
                C58485gu guVar = C89837aa.f243163a;
                int i3 = ((C58724pq) guVar).f156474d;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        str4 = "false";
                        break;
                    }
                    int i5 = i4 + 1;
                    if (C58890d.m90990e((String) guVar.get(i4), str5)) {
                        str4 = "true";
                        break;
                    }
                    i4 = i5;
                }
            }
            str2 = str4;
            str4 = str3;
        } else {
            str2 = str4;
            i = 1;
        }
        C39141kp kpVar = aaVar.f243164b;
        String str6 = "FINAL";
        String str7 = c != 1 ? c != 2 ? c != 3 ? str6 : "PREFETCH" : "PARTIAL" : "UNKNOWN";
        boolean startsWith = Build.MODEL.startsWith("Pixel");
        if (i == 1) {
            str6 = "UNKNOWN";
        } else if (i == 2) {
            str6 = "PARTIAL";
        } else if (i == 3) {
            str6 = "PREFETCH";
        }
        ((C19567d) kpVar.f102837aU.mo6453a()).mo24822a(1, str, str7, Boolean.valueOf(e), Boolean.valueOf(startsWith), str4, str2, str6);
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C66585bk bkVar = (C66585bk) C66586bl.f181121c.createBuilder();
        bkVar.copyOnWrite();
        C66586bl blVar = (C66586bl) bkVar.instance;
        agVar.getClass();
        blVar.f181125b = agVar;
        blVar.f181124a |= 1;
        new C118928k(C58833ax.m90834k((C66586bl) bkVar.build()), C66586bl.f181122d).mo104073a(cdVar);
        int a3 = C67437af.m97466a(agVar.f183259b);
        if (a3 != 0 && a3 == 2) {
            C103584ct.f288582a.mo104073a(cdVar);
        }
        return (C66607ce) cdVar.build();
    }
}
