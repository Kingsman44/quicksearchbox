package com.google.android.apps.gsa.search.shared.actions;

import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C54946ad;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.l */
/* compiled from: PG */
public final class C87424l {

    /* renamed from: a */
    public String f236090a;

    /* renamed from: b */
    public C54944ab f236091b = C54944ab.UNKNOWN;

    /* renamed from: c */
    public int f236092c = 1;

    /* renamed from: d */
    public int f236093d = 1;

    /* renamed from: e */
    public int f236094e = 1;

    /* renamed from: f */
    public int f236095f = 1;

    /* renamed from: f */
    public static final C54944ab m141592f(CardDecision cardDecision) {
        C54944ab a = C54944ab.m87544a(cardDecision.f236260n);
        C54944ab abVar = C54944ab.UNKNOWN;
        return a == abVar ? (C54944ab) C58833ax.m90833j(C54944ab.m87544a(cardDecision.f236259m)).mo56109e(abVar) : a;
    }

    /* renamed from: b */
    public final boolean mo81202b(boolean z, CardDecision cardDecision) {
        if (z && cardDecision != null && cardDecision.f236257k <= 0) {
            return false;
        }
        this.f236092c = 4;
        if (z) {
            this.f236093d = 4;
        } else {
            this.f236093d = 3;
            this.f236094e = 1;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo81203c(boolean z) {
        this.f236093d = 2;
        if (!z) {
            return false;
        }
        this.f236092c = 7;
        return true;
    }

    /* renamed from: d */
    public final boolean mo81204d(CardDecision cardDecision, VoiceAction voiceAction, boolean z) {
        int i;
        if (this.f236092c == 1) {
            if (cardDecision.f236255i || (voiceAction != null && voiceAction.mo81086x())) {
                i = 4;
            } else {
                if (!cardDecision.f236256j && (voiceAction == null || !voiceAction.mo81083v())) {
                    if (cardDecision.f236254h || (!z && m141592f(cardDecision) != C54944ab.UNKNOWN)) {
                        i = 6;
                    } else if (voiceAction != null && !voiceAction.mo81133M()) {
                        i = 2;
                    } else if (!z || voiceAction == null || voiceAction.mo81052B() || voiceAction.mo81087y()) {
                        i = 1;
                    }
                }
                i = 3;
            }
            if (i == 1) {
                return false;
            }
            int i2 = this.f236093d;
            if (i2 == 2) {
                this.f236092c = i;
                return true;
            } else if (i != this.f236095f) {
                this.f236092c = i;
                if (i == 3 && i2 == 1 && this.f236094e == 1) {
                    this.f236093d = 3;
                    this.f236094e = 4;
                }
                return true;
            } else if (i == 6 && m141592f(cardDecision) != this.f236091b) {
                this.f236092c = 6;
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo81205e(int i) {
        this.f236093d = 3;
        this.f236094e = i;
        if (i != 3) {
            return false;
        }
        if (this.f236092c == 1) {
            this.f236092c = 3;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo81201a(ActionData actionData, VoiceAction voiceAction, Query query) {
        if (actionData == null || actionData.mo81098i()) {
            this.f236090a = null;
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C54946ad s = actionData.mo81107s();
        String str = (s == null || (s.f144533a & 2048) == 0) ? null : s.f144538f;
        if (str != null) {
            this.f236090a = str;
        } else if (query.mo84397cd() && voiceAction != null && voiceAction.mo81069hv() != null) {
            this.f236090a = voiceAction.mo81069hv();
        } else if (this.f236090a == null || !actionData.mo81099j()) {
            this.f236090a = null;
            if (actionData.mo81101l()) {
                String str2 = actionData.f236000j;
                if (str2 != null) {
                    this.f236090a = "G".concat(str2);
                }
            } else {
                this.f236090a = "C".concat(String.valueOf(C39191a.m68623b(query.f252751I)));
            }
        }
        if (this.f236090a == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f236090a = "R".concat(String.valueOf(C39191a.m68623b(C90719ac.f253778a.f253779b.nextLong())));
        }
        if (voiceAction != null) {
            voiceAction.mo81074m(this.f236090a);
        }
        C58976aa aaVar3 = C58975e.f156826a;
    }
}
