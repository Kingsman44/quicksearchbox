package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9969d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131265b;
import com.google.assistant.p3886c.C50755bt;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.d.b */
/* compiled from: PG */
public final class C131294b implements C131265b {

    /* renamed from: a */
    private final C60950i f358962a;

    /* renamed from: b */
    private final C130895ag f358963b;

    public C131294b(C60950i iVar, C130895ag agVar) {
        this.f358962a = iVar;
        this.f358963b = agVar;
    }

    /* renamed from: a */
    public final void mo110141a(C50818do doVar, List list) {
        Object obj;
        Object obj2;
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (a != C50794cr.FLIGHT_LANDING) {
            C60870cx cxVar = C60866ct.f164955a;
            return;
        }
        Optional findFirst = Collection.EL.stream(list).filter(C131293a.f358961a).findFirst();
        C50813dj djVar = doVar.f132329z;
        if (djVar == null) {
            djVar = C50813dj.f132278a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C50755bt.f132079d);
        djVar.mo58887l(r0);
        Object l = djVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C123789r rVar = ((C50755bt) obj).f132082b;
        if (rVar == null) {
            rVar = C123789r.f341963n;
        }
        boolean z = rVar.f341972h;
        String str = rVar.f341975k;
        String str2 = rVar.f341973i;
        String str3 = rVar.f341974j;
        Instant ofEpochMilli = Instant.ofEpochMilli(rVar.f341968d);
        Instant a2 = this.f358962a.mo57444a();
        if (findFirst.isPresent()) {
            C50813dj djVar2 = ((C50818do) findFirst.get()).f132329z;
            if (djVar2 == null) {
                djVar2 = C50813dj.f132278a;
            }
            C62940bt r9 = C62942bv.checkIsLite(C50755bt.f132079d);
            djVar2.mo58887l(r9);
            Object l2 = djVar2.f169962ag.mo58854l(r9.f169971d);
            if (l2 == null) {
                obj2 = r9.f169969b;
            } else {
                obj2 = r9.mo58889c(l2);
            }
            C123789r rVar2 = ((C50755bt) obj2).f132082b;
            if (rVar2 == null) {
                rVar2 = C123789r.f341963n;
            }
            if (!z || rVar2.f341972h) {
                C60870cx cxVar2 = C60866ct.f164955a;
                return;
            } else {
                this.f358963b.mo109868D("GET_BAGGAGE_CLAIM_FROM_LATER_UPDATES", str, str2, str3);
                this.f358963b.mo109926ax(Duration.between(ofEpochMilli, a2), str, str2, str3);
            }
        } else if (rVar.f341972h) {
            this.f358963b.mo109868D("HAS_BAGGAGE_CLAIM_IN_ORIGINAL_FLIGHT_LANDING_UPDATE", str, str2, str3);
            this.f358963b.mo109926ax(Duration.between(ofEpochMilli, a2), str, str2, str3);
        } else {
            this.f358963b.mo109868D("NO_BAGGAGE_CLAIM_IN_ORIGINAL_FLIGHT_LANDING_UPDATE", str, str2, str3);
        }
        C60870cx cxVar3 = C60866ct.f164955a;
    }
}
