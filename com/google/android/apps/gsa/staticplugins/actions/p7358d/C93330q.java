package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.C87500v;
import com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.common.base.C58833ax;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C54945ac;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54947ae;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C54960ar;
import com.google.p4152bb.p4153a.C54975bf;
import com.google.p4152bb.p4153a.C54976bg;
import com.google.p4152bb.p4153a.C54982bm;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.q */
/* compiled from: PG */
public final class C93330q implements C87500v {

    /* renamed from: a */
    private final C93329p f260289a;

    public C93330q(C93329p pVar) {
        this.f260289a = pVar;
    }

    /* renamed from: a */
    public final C54946ad mo81493a(VoiceAction voiceAction, CardDecision cardDecision, C54948af afVar, C54960ar arVar, C54976bg bgVar) {
        C54946ad adVar;
        Object obj;
        if (voiceAction instanceof VisitableAbstractVoiceAction) {
            adVar = (C54946ad) ((VisitableAbstractVoiceAction) voiceAction).mo81132L(this.f260289a);
        } else {
            adVar = voiceAction instanceof NewVisitableAbstractVoiceAction ? (C54946ad) ((NewVisitableAbstractVoiceAction) voiceAction).mo81146L(this.f260289a) : null;
        }
        if (adVar == null) {
            return null;
        }
        C54945ac acVar = (C54945ac) adVar.toBuilder();
        if (afVar != null) {
            C54948af afVar2 = adVar.f144536d;
            if (afVar2 == null) {
                afVar2 = C54948af.f144541h;
            }
            C54947ae aeVar = (C54947ae) afVar2.toBuilder();
            if ((afVar.f144543a & 4) != 0) {
                C63088z zVar = afVar.f144546d;
                aeVar.copyOnWrite();
                C54948af afVar3 = (C54948af) aeVar.instance;
                zVar.getClass();
                afVar3.f144543a |= 4;
                afVar3.f144546d = zVar;
            }
            if ((afVar.f144543a & 1) != 0) {
                C55421x a = C55421x.m87686a(afVar.f144544b);
                if (a == null) {
                    a = C55421x.UNKNOWN_ACTION_TYPE;
                }
                aeVar.copyOnWrite();
                C54948af afVar4 = (C54948af) aeVar.instance;
                afVar4.f144544b = a.f146230cP;
                afVar4.f144543a |= 1;
            }
            if ((afVar.f144543a & 2) != 0) {
                C55421x a2 = C55421x.m87686a(afVar.f144545c);
                if (a2 == null) {
                    a2 = C55421x.UNKNOWN_ACTION_TYPE;
                }
                aeVar.copyOnWrite();
                C54948af afVar5 = (C54948af) aeVar.instance;
                afVar5.f144545c = a2.f146230cP;
                afVar5.f144543a |= 2;
            }
            if ((afVar.f144543a & 64) != 0) {
                String str = afVar.f144548f;
                aeVar.copyOnWrite();
                C54948af afVar6 = (C54948af) aeVar.instance;
                str.getClass();
                afVar6.f144543a |= 64;
                afVar6.f144548f = str;
            }
            C62940bt r3 = C62942bv.checkIsLite(C54982bm.f144670c);
            afVar.mo58887l(r3);
            if (afVar.f169962ag.mo58857o(r3.f169971d)) {
                C62940bt btVar = C54982bm.f144670c;
                C62940bt r4 = C62942bv.checkIsLite(btVar);
                afVar.mo58887l(r4);
                Object l = afVar.f169962ag.mo58854l(r4.f169971d);
                if (l == null) {
                    obj = r4.f169969b;
                } else {
                    obj = r4.mo58889c(l);
                }
                aeVar.mo58885m(btVar, (C54982bm) obj);
            }
            acVar.copyOnWrite();
            C54946ad adVar2 = (C54946ad) acVar.instance;
            C54948af afVar7 = (C54948af) aeVar.build();
            afVar7.getClass();
            adVar2.f144536d = afVar7;
            adVar2.f144533a |= 16;
        }
        if (arVar != null) {
            acVar.mo58885m(C54960ar.f144579d, arVar);
        }
        if (bgVar != null) {
            acVar.copyOnWrite();
            C54946ad adVar3 = (C54946ad) acVar.instance;
            adVar3.f144537e = bgVar;
            adVar3.f144533a |= 32;
        }
        if (cardDecision != null) {
            C54976bg bgVar2 = ((C54946ad) acVar.instance).f144537e;
            if (bgVar2 == null) {
                bgVar2 = C54976bg.f144641o;
            }
            C54975bf bfVar = (C54975bf) bgVar2.toBuilder();
            C54944ab abVar = (C54944ab) C58833ax.m90833j(C54944ab.m87544a(cardDecision.f236259m)).mo56109e(C54944ab.UNKNOWN);
            bfVar.copyOnWrite();
            C54976bg bgVar3 = (C54976bg) bfVar.instance;
            bgVar3.f144643a &= -65;
            bgVar3.f144649g = 0;
            if (abVar != C54944ab.UNKNOWN) {
                int i = abVar.f144530R;
                bfVar.copyOnWrite();
                C54976bg bgVar4 = (C54976bg) bfVar.instance;
                bgVar4.f144643a |= 64;
                bgVar4.f144649g = i;
                C54944ab abVar2 = (C54944ab) C58833ax.m90833j(C54944ab.m87544a(cardDecision.f236260n)).mo56109e(C54944ab.UNKNOWN);
                if (abVar2 != C54944ab.UNKNOWN) {
                    int i2 = abVar2.f144530R;
                    bfVar.copyOnWrite();
                    C54976bg bgVar5 = (C54976bg) bfVar.instance;
                    bgVar5.f144643a |= 256;
                    bgVar5.f144650h = i2;
                }
            }
            bfVar.copyOnWrite();
            ((C54976bg) bfVar.instance).f144651i = C54976bg.emptyIntList();
            if (cardDecision.mo81423h()) {
                List list = cardDecision.f236261o;
                bfVar.copyOnWrite();
                C54976bg bgVar6 = (C54976bg) bfVar.instance;
                C62961ch chVar = bgVar6.f144651i;
                if (!chVar.mo58948c()) {
                    bgVar6.f144651i = C62942bv.mutableCopy(chVar);
                }
                C62947c.addAll((Iterable) list, (List) bgVar6.f144651i);
            }
            boolean z = cardDecision.f236254h;
            bfVar.copyOnWrite();
            C54976bg bgVar7 = (C54976bg) bfVar.instance;
            bgVar7.f144643a |= 8;
            bgVar7.f144647e = z;
            bfVar.copyOnWrite();
            C54976bg bgVar8 = (C54976bg) bfVar.instance;
            bgVar8.f144643a &= -2;
            bgVar8.f144644b = false;
            if (voiceAction.mo81080s()) {
                bfVar.copyOnWrite();
                C54976bg bgVar9 = (C54976bg) bfVar.instance;
                bgVar9.f144643a |= 1;
                bgVar9.f144644b = true;
            }
            bfVar.copyOnWrite();
            C54976bg bgVar10 = (C54976bg) bfVar.instance;
            bgVar10.f144643a &= -17;
            bgVar10.f144648f = false;
            if (voiceAction.mo81083v()) {
                bfVar.copyOnWrite();
                C54976bg bgVar11 = (C54976bg) bfVar.instance;
                bgVar11.f144643a |= 16;
                bgVar11.f144648f = true;
            }
            String str2 = cardDecision.f236249c;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                bfVar.copyOnWrite();
                C54976bg bgVar12 = (C54976bg) bfVar.instance;
                bgVar12.f144643a |= 4096;
                bgVar12.f144654l = str2;
            }
            long j = cardDecision.f236257k;
            bfVar.copyOnWrite();
            C54976bg bgVar13 = (C54976bg) bfVar.instance;
            bgVar13.f144643a |= 2;
            bgVar13.f144645c = (int) j;
            C54976bg bgVar14 = (C54976bg) bfVar.build();
            acVar.copyOnWrite();
            C54946ad adVar4 = (C54946ad) acVar.instance;
            bgVar14.getClass();
            adVar4.f144537e = bgVar14;
            adVar4.f144533a |= 32;
        }
        acVar.copyOnWrite();
        C54946ad adVar5 = (C54946ad) acVar.instance;
        adVar5.f144533a |= 4;
        adVar5.f144534b = true;
        String hv = voiceAction.mo81069hv();
        if (hv != null) {
            acVar.copyOnWrite();
            C54946ad adVar6 = (C54946ad) acVar.instance;
            adVar6.f144533a |= 2048;
            adVar6.f144538f = hv;
        }
        String hw = voiceAction.mo81070hw();
        if (hw != null) {
            acVar.copyOnWrite();
            C54946ad adVar7 = (C54946ad) acVar.instance;
            adVar7.f144533a |= 4096;
            adVar7.f144539g = hw;
        }
        return (C54946ad) acVar.build();
    }
}
