package com.google.android.apps.gsa.smartspace.p7257a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3886c.C50695ag;
import com.google.assistant.p3886c.C50697ai;
import com.google.assistant.p3886c.C50761bz;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.smartspace.a.l */
/* compiled from: PG */
public final class C92030l {

    /* renamed from: a */
    public final C42876ab f256564a;

    /* renamed from: b */
    public final C58974d f256565b;

    /* renamed from: c */
    public final C60950i f256566c;

    /* renamed from: d */
    public final C86124t f256567d;

    /* renamed from: e */
    public final C39141kp f256568e;

    public C92030l(C42876ab abVar, C83564a aVar, C60950i iVar, C86124t tVar, C39141kp kpVar) {
        this.f256564a = abVar;
        this.f256565b = aVar.mo76900a("SsMediaPushQuotaUtil");
        this.f256566c = iVar;
        this.f256567d = tVar;
        this.f256568e = kpVar;
    }

    /* renamed from: c */
    public static boolean m151039c(C50695ag agVar) {
        return agVar.f131901c == 0 && agVar.f131900b == 0;
    }

    /* renamed from: a */
    public final long mo86681a(Instant instant, int i) {
        long a = this.f256567d.mo79743a(C90017bw.f247956bR);
        Duration ofDays = Duration.ofDays(this.f256567d.mo79743a(C90017bw.f247957bS));
        long a2 = this.f256567d.mo79743a(C90017bw.f247958bT);
        if (!ofDays.isZero()) {
            long log1p = a + (a2 * ((long) Math.log1p((double) (Duration.between(instant, this.f256566c.mo57444a()).dividedBy(ofDays) + 1))));
            long j = log1p - ((long) i);
            ((C58970a) ((C58970a) this.f256565b.mo56224b()).mo56372aa(11977)).mo56359L("Current push quota %s out of %s since %s", Long.valueOf(j), Long.valueOf(log1p), instant);
            return j;
        }
        throw new ArithmeticException("initialTimeWindow cannot be zero as a divisor.");
    }

    /* renamed from: b */
    public final void mo86682b(boolean z, boolean z2, Instant instant) {
        if (this.f256567d.mo79746e(C90017bw.f247895aJ)) {
            C39141kp kpVar = this.f256568e;
            ((C19567d) kpVar.f102885bP.mo6453a()).mo24822a(1, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf((int) Duration.between(instant, this.f256566c.mo57444a()).toHours()));
        }
    }

    /* renamed from: d */
    public final void mo86683d(C50818do doVar) {
        Object obj;
        if (this.f256567d.mo79746e(C90017bw.f247893aH) || this.f256567d.mo79746e(C90017bw.f247895aJ)) {
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (!a.equals(C50794cr.MEDIA)) {
                ((C58970a) ((C58970a) this.f256565b.mo56226d()).mo56372aa(11985)).mo56386p("Not a Smartspace media card");
            }
            C50813dj djVar = doVar.f132329z;
            if (djVar == null) {
                djVar = C50813dj.f132278a;
            }
            C62940bt r0 = C62942bv.checkIsLite(C50761bz.f132094e);
            djVar.mo58887l(r0);
            Object l = djVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C50761bz bzVar = (C50761bz) obj;
            if ((bzVar.f132096a & 2) != 0) {
                C50697ai aiVar = bzVar.f132097b;
                if (aiVar == null) {
                    aiVar = C50697ai.f131903b;
                }
                if (aiVar.f131905a.size() != 0) {
                    this.f256564a.mo46039a(new C92027i(this), C60826bg.f164896a);
                    return;
                }
            }
            ((C58970a) ((C58970a) this.f256565b.mo56224b()).mo56372aa(11984)).mo56386p("Zero media item. Not a media recs card. Skipping...");
            C60870cx cxVar = C60866ct.f164955a;
            return;
        }
        ((C58970a) ((C58970a) this.f256565b.mo56224b()).mo56372aa(11986)).mo56386p("Media negative targeting is disabled. Skipping...");
        C60870cx cxVar2 = C60866ct.f164955a;
    }
}
