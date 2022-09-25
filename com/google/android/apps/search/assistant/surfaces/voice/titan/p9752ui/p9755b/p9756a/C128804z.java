package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128100bv;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128101bw;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128109j;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128116q;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128690a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128831f;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128832g;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128833h;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128835j;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128838m;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128839n;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128840o;
import com.google.assistant.p3897e.p3921j.C51809dy;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.z */
/* compiled from: PG */
public final class C128804z {
    /* renamed from: a */
    public static final C128831f m210176a(String str, boolean z, C128109j jVar) {
        C128840o oVar;
        if (str.length() > 0) {
            return new C128838m(str);
        }
        if (jVar == null) {
            return C128832g.f354116a;
        }
        C128116q a = C128116q.m209218a(jVar.f352487b);
        if (a == null) {
            a = C128116q.ONBOARDING_TYPE_UNKNOWN;
        }
        C69664n.m101060f(a, "onboardingResult.type");
        C128098bt btVar = C128098bt.IDLE;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            oVar = C128840o.UNKNOWN;
        } else if (ordinal == 1) {
            oVar = C128840o.OOBE;
        } else {
            throw new C69677g();
        }
        if (oVar != C128840o.UNKNOWN) {
            return new C128835j(oVar);
        }
        return z ? new C128833h(C128839n.HI) : C128832g.f354116a;
    }

    /* renamed from: b */
    static /* synthetic */ C128831f m210177b(String str, C128109j jVar, int i) {
        if ((i & 4) != 0) {
            jVar = C128109j.f352484c;
        }
        return m210176a(str, false, jVar);
    }

    /* renamed from: c */
    public static final C128692aa m210178c(C128802x xVar, C51809dy dyVar) {
        C128087bi biVar;
        C128101bw bwVar = xVar.f354060a;
        if (bwVar.f352470b == 4) {
            biVar = (C128087bi) bwVar.f352471c;
        } else {
            biVar = C128087bi.f352422f;
        }
        C69664n.m101060f(biVar, "state.voicePlateStateResponse.executing");
        C128100bv bvVar = biVar.f352425b;
        if (bvVar == null) {
            bvVar = C128100bv.f352463c;
        }
        String str = bvVar.f352466b;
        C69664n.m101060f(str, "executing.transcription.transcription");
        return new C128692aa(C128690a.THINKING, m210177b(str, xVar.f354061b, 2), !C69664n.m101066l(dyVar, C51809dy.f135933f), 8);
    }
}
