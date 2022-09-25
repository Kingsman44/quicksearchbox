package com.google.android.apps.gsa.search.core.tasks.now;

import android.databinding.C0118a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.sidekick.main.notifications.C91500ao;
import com.google.android.apps.gsa.sidekick.main.notifications.C91544r;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.p489g.p493c.C9131d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7730hv;
import com.google.p375ai.p378b.C7798ki;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.tasks.now.b */
/* compiled from: PG */
public final /* synthetic */ class C87182b implements C118549h {

    /* renamed from: a */
    public final /* synthetic */ C91544r f235585a;

    public /* synthetic */ C87182b(C91544r rVar) {
        this.f235585a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        Object obj2;
        byte[] bArr;
        C91544r rVar = this.f235585a;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r1 = C62942bv.checkIsLite(C9131d.f31426c);
        akVar.mo58887l(r1);
        Object l = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C63088z zVar = (C63088z) obj;
        C62940bt r2 = C62942bv.checkIsLite(C9131d.f31427d);
        akVar.mo58887l(r2);
        Object l2 = akVar.f169962ag.mo58854l(r2.f169971d);
        if (l2 == null) {
            obj2 = r2.f169969b;
        } else {
            obj2 = r2.mo58889c(l2);
        }
        List<C7730hv> list = (List) obj2;
        if (!list.isEmpty()) {
            for (C7730hv hvVar : list) {
                C7799kj kjVar = hvVar.f27022b;
                if (kjVar == null) {
                    kjVar = C7799kj.f27263h;
                }
                C7799kj kjVar2 = kjVar;
                int a = C7798ki.m22853a(kjVar2.f27266b);
                if (a != 0 && a == 3) {
                    C91500ao aoVar = rVar.f255333b;
                    long j = hvVar.f27023c;
                    if (zVar == null) {
                        bArr = null;
                    } else {
                        bArr = zVar.mo59174N();
                    }
                    aoVar.mo85846k(j, kjVar2, false, bArr);
                }
            }
            rVar.mo85930i();
        } else {
            C0118a.m109q(C87184d.f235587a.mo56225c(), "Unexpected null CallbackWithInterest in notificationScheduleRefreshTask!", 9340, "NotificationSchedRef", C58975e.f156826a);
        }
        return C118826c.f331423b;
    }
}
