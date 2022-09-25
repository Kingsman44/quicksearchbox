package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87862gi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87864gk;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.as */
/* compiled from: PG */
public final class C86925as extends C86898ct {

    /* renamed from: b */
    private static final C59071e f234754b = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.as");

    /* renamed from: a */
    public final Map f234755a = new HashMap();

    /* renamed from: c */
    private final Queue f234756c = new ArrayDeque();

    public C86925as(C68214a aVar) {
        super(aVar, 3);
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.SET_GWS_LOGGABLE_EVENT, C87739bu.SUPPRESS_GWS_LOGGABLE_EVENT};
    }

    /* renamed from: e */
    public final int mo80574e(ActionData actionData) {
        if (!this.f234755a.containsKey(actionData)) {
            return 0;
        }
        int intValue = ((Integer) this.f234755a.get(actionData)).intValue();
        int i = intValue & 4095;
        mo80576i(actionData, i << 16);
        return (((intValue >>> 16) & 4095) ^ -1) & i;
    }

    /* renamed from: g */
    public final void mo80575g(ActionData actionData, int i) {
        if (i == 4096) {
            mo80576i(actionData, 4096);
        } else if (actionData.mo81100k()) {
            boolean z = true;
            C58838bb.m90868c((i & 4095) != 0);
            if ((i & -4096) != 0) {
                z = false;
            }
            C58838bb.m90868c(z);
            mo80576i(actionData, i);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C62940bt btVar = C87862gi.f237708a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r4 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r4);
        if (!bwVar.f169962ag.mo58857o(r4.f169971d)) {
            ((C59052c) ((C59052c) f234754b.mo56226d()).mo56372aa(9149)).mo56386p("Expected GwsLoggableEventData extension.");
            int i = C90755l.f253831a;
            return;
        }
        C62940bt btVar2 = C87862gi.f237708a;
        C87741bw bwVar2 = clientEventData.f236955a;
        C62940bt r42 = C62942bv.checkIsLite(btVar2);
        bwVar2.mo58887l(r42);
        Object l = bwVar2.f169962ag.mo58854l(r42.f169971d);
        if (l == null) {
            obj = r42.f169969b;
        } else {
            obj = r42.mo58889c(l);
        }
        int i2 = ((C87864gk) obj).f237712b;
        try {
            ActionData actionData = (ActionData) clientEventData.mo81912b(ActionData.class);
            C87739bu buVar = C87739bu.UNKNOWN;
            C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a == null) {
                a = C87739bu.UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 20) {
                mo80575g(actionData, i2);
            } else if (ordinal == 21 && actionData.mo81100k()) {
                int i3 = i2 & 4095;
                boolean z = true;
                C58838bb.m90868c(i3 != 0);
                if ((i2 & -4096) != 0) {
                    z = false;
                }
                C58838bb.m90868c(z);
                mo80576i(actionData, i3 << 16);
            }
        } catch (Exception unused) {
            ((C59052c) ((C59052c) f234754b.mo56226d()).mo56372aa(9148)).mo56386p("GwsLoggableEventData did not contain ActionData");
            int i4 = C90755l.f253831a;
        }
    }

    /* renamed from: i */
    public final synchronized void mo80576i(ActionData actionData, int i) {
        Integer num = (Integer) this.f234755a.get(actionData);
        if (num != null) {
            int intValue = num.intValue();
            int i2 = i | intValue;
            if (i2 != intValue) {
                this.f234755a.put(actionData, Integer.valueOf(i2));
                return;
            }
            return;
        }
        this.f234756c.add(actionData);
        if (this.f234756c.size() > 50) {
            this.f234755a.remove((ActionData) this.f234756c.remove());
        }
        this.f234755a.put(actionData, Integer.valueOf(i));
    }
}
