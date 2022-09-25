package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14234br;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14278dh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14355gd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi;
import com.google.android.libraries.search.p6glow.C39872c;
import com.google.android.libraries.search.p6glow.C39882m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.b */
/* compiled from: PG */
public final class C15328b {

    /* renamed from: a */
    private static final C58528ij f46007a = C58528ij.m90015O(C14602ph.MESSAGE_READ_TASK, C14602ph.MESSAGE_AUTO_READ_TASK, C14602ph.MESSAGE_REPLY_TASK, C14602ph.MESSAGE_COMPOSE_TASK, C14602ph.MESSAGE_CONFIRM_TASK, C14602ph.MESSAGE_SENT_TASK, C14602ph.EXPANDED_VOICE_PLATE_TASK);

    /* renamed from: a */
    public static void m31910a(C14350fz fzVar, C39882m mVar) {
        C58976aa aaVar = C58975e.f156826a;
        C14350fz fzVar2 = C14350fz.MIC_UNKNOWN;
        switch (fzVar.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 6:
                mVar.mo42063b(C39872c.GONE);
                return;
            case 2:
                mVar.mo42063b(C39872c.LISTENING);
                return;
            case 3:
                mVar.mo42063b(C39872c.USER_INPUT);
                return;
            case 4:
                mVar.mo42063b(C39872c.THINKING);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static boolean m31911b(C14499lm lmVar) {
        C14234br brVar;
        C14355gd gdVar;
        C14278dh dhVar;
        C14278dh dhVar2;
        C14355gd gdVar2;
        C14234br brVar2;
        if (lmVar.f43850a == 6) {
            brVar = (C14234br) lmVar.f43851b;
        } else {
            brVar = C14234br.f43075k;
        }
        if (brVar.f43083g != null) {
            C58528ij ijVar = f46007a;
            if (lmVar.f43850a == 6) {
                brVar2 = (C14234br) lmVar.f43851b;
            } else {
                brVar2 = C14234br.f43075k;
            }
            C14603pi piVar = brVar2.f43083g;
            if (piVar == null) {
                piVar = C14603pi.f44158c;
            }
            if (ijVar.contains(C14602ph.m30643a(piVar.f44160a))) {
                return true;
            }
        }
        if (lmVar.f43850a == 7) {
            gdVar = (C14355gd) lmVar.f43851b;
        } else {
            gdVar = C14355gd.f43438d;
        }
        if (gdVar.f43440a != null) {
            C58528ij ijVar2 = f46007a;
            if (lmVar.f43850a == 7) {
                gdVar2 = (C14355gd) lmVar.f43851b;
            } else {
                gdVar2 = C14355gd.f43438d;
            }
            C14603pi piVar2 = gdVar2.f43440a;
            if (piVar2 == null) {
                piVar2 = C14603pi.f44158c;
            }
            if (ijVar2.contains(C14602ph.m30643a(piVar2.f44160a))) {
                return true;
            }
        }
        if (lmVar.f43850a == 3) {
            dhVar = (C14278dh) lmVar.f43851b;
        } else {
            dhVar = C14278dh.f43183g;
        }
        if (dhVar.f43187c == null) {
            return false;
        }
        C58528ij ijVar3 = f46007a;
        if (lmVar.f43850a == 3) {
            dhVar2 = (C14278dh) lmVar.f43851b;
        } else {
            dhVar2 = C14278dh.f43183g;
        }
        C14603pi piVar3 = dhVar2.f43187c;
        if (piVar3 == null) {
            piVar3 = C14603pi.f44158c;
        }
        if (ijVar3.contains(C14602ph.m30643a(piVar3.f44160a))) {
            return true;
        }
        return false;
    }
}
