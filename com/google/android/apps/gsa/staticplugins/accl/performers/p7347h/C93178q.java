package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.q */
/* compiled from: PG */
public final /* synthetic */ class C93178q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93180s f259876a;

    /* renamed from: b */
    public final /* synthetic */ aeq f259877b;

    public /* synthetic */ C93178q(C93180s sVar, aeq aeq) {
        this.f259876a = sVar;
        this.f259877b = aeq;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C93180s sVar = this.f259876a;
        aeq aeq = this.f259877b;
        C58833ax axVar = (C58833ax) obj;
        boolean z = aeq.f134951c;
        boolean z2 = aeq.f134952d;
        boolean z3 = aeq.f134953e;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C93180s.m153253b("No BundledMessageNotification present", z3));
        }
        if (z) {
            String i = ((BundledMessageNotification) axVar.mo56107c()).mo84119i();
            if (TextUtils.isEmpty(i)) {
                ((C59052c) ((C59052c) C93180s.f259880a.mo56226d()).mo56372aa(13380)).mo56386p("Notification doesn't have a valid key. Can't mark as read.");
                return C60856cj.m92900i(C93180s.m153253b("Notification doesn't have a valid key.", z3));
            }
            cxVar = sVar.f259881b.mo78563f(i, z2);
        } else {
            cxVar = sVar.f259881b.mo78564g((BundledMessageNotification) axVar.mo56107c());
        }
        C60856cj.m92911t(cxVar, new C93179r(sVar, axVar), C60826bg.f164896a);
        return C60846c.m92878g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C90877ak.m148471e(cxVar, sVar.f259884e.mo79743a(C90014bt.f247505iS), TimeUnit.SECONDS, sVar.f259882c)), new C93175n(z3), C60826bg.f164896a), TimeoutException.class, new C93176o(z3), C60826bg.f164896a), Exception.class, new C93177p(z3), C60826bg.f164896a);
    }
}
