package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76402a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76433f;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.l */
/* compiled from: PG */
public final class C76414l implements C76402a {
    /* renamed from: a */
    public final boolean mo72188a(C76590bg bgVar, C77426t tVar, C76438k kVar) {
        C76433f fVar;
        int i;
        if (kVar.f211605a == 302) {
            fVar = (C76433f) kVar.f211606b;
        } else {
            fVar = C76433f.f211581b;
        }
        String str = fVar.f211583a;
        Optional map = bgVar.mo72266h(str).map(C76413k.f211556a);
        if (map.isEmpty()) {
            return false;
        }
        switch (((C61748j) map.get()).f166802a) {
            case 0:
                i = 38;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 9;
                break;
            case 6:
                i = 10;
                break;
            case 7:
                i = 11;
                break;
            case 8:
                i = 6;
                break;
            case 9:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 8;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 7;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 26;
                break;
            case 24:
                i = 22;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 27;
                break;
            case 27:
                i = 15;
                break;
            case 28:
                i = 31;
                break;
            case 29:
                i = 29;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 30;
                break;
            case 32:
                i = 33;
                break;
            case 34:
                i = 4;
                break;
            case 35:
                i = 34;
                break;
            case 36:
                i = 35;
                break;
            case 37:
                i = 36;
                break;
            case 38:
                i = 3;
                break;
            case 39:
                i = 37;
                break;
            case 40:
                i = 28;
                break;
            default:
                i = 0;
                break;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 16) {
            return true;
        } else {
            Optional g = bgVar.mo72265g(C76565ai.f211802a, str);
            if (g.isEmpty()) {
                return false;
            }
            return Collection.EL.stream((List) tVar.mo72525b().mo73746a().mo71158k().orElse(C58485gu.m89845m())).filter(C76409g.f211552a).map(C76410h.f211553a).filter(new C76411i(((C63775d) g.get()).f172523d)).anyMatch(C76412j.f211555a);
        }
    }

    /* renamed from: b */
    public final boolean mo72189b(C76438k kVar) {
        C76433f fVar;
        if (kVar.f211605a == 302) {
            fVar = (C76433f) kVar.f211606b;
        } else {
            fVar = C76433f.f211581b;
        }
        return !fVar.f211583a.isEmpty();
    }
}
