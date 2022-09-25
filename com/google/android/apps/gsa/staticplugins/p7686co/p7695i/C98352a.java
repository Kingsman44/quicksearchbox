package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.a */
/* compiled from: PG */
public final /* synthetic */ class C98352a implements C90997f {
    /* renamed from: a */
    public final void mo84666a(C91006f fVar, C91000i iVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C98409cc.f274720e);
        iVar.mo58887l(r0);
        Object l = iVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C98409cc ccVar = (C98409cc) obj;
        C98408cb cbVar = ccVar.f274724c;
        if (cbVar == null) {
            cbVar = C98408cb.f274714d;
        }
        if ((cbVar.f274716a & 1) != 0) {
            C98408cb cbVar2 = ccVar.f274724c;
            if (cbVar2 == null) {
                cbVar2 = C98408cb.f274714d;
            }
            if (cbVar2.f274717b == 0) {
                fVar.mo85279c("status").mo85276a(C90752i.m148229c("success"));
            } else {
                fVar.mo85279c("status").mo85276a(C90752i.m148229c("failed"));
                C91005e c = fVar.mo85279c("errorCode");
                C98408cb cbVar3 = ccVar.f274724c;
                if (cbVar3 == null) {
                    cbVar3 = C98408cb.f274714d;
                }
                c.mo85276a(C90752i.m148230d(Integer.valueOf(cbVar3.f274717b)));
            }
        } else {
            fVar.mo85279c("status").mo85276a(C90752i.m148229c("ongoing"));
        }
        C91005e c2 = fVar.mo85279c("startTime");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C98408cb cbVar4 = ccVar.f274724c;
        if (cbVar4 == null) {
            cbVar4 = C98408cb.f274714d;
        }
        c2.mo85276a(C90752i.m148232f(new Date(timeUnit.toMillis(cbVar4.f274718c))));
        for (C98405bz bzVar : ccVar.f274723b) {
            C91006f e = fVar.mo85281e((Object) null);
            int i = bzVar.f274707b;
            e.mo85291r("request #" + i);
            e.mo85279c("account").mo85276a(C90752i.m148233g(bzVar.f274708c));
            C91005e c3 = e.mo85279c("type");
            C98413cg a = C98413cg.m162977a(bzVar.f274709d);
            if (a == null) {
                a = C98413cg.REQUEST_TYPE_INVALID;
            }
            c3.mo85276a(C90752i.m148229c(a.name()));
            if (bzVar.f274710e.size() > 0) {
                e.mo85279c("clientTraces").mo85276a(C90752i.m148229c(new C58827ar(",").mo56097d(C58597ky.m90217h(bzVar.f274710e, C98438e.f274824a))));
            }
            if (bzVar.f274711f.size() > 0) {
                e.mo85279c("conditionTraces").mo85276a(C90752i.m148229c(new C58827ar(",").mo56097d(C58597ky.m90217h(bzVar.f274711f, C98439f.f274825a))));
            }
            C98418cl clVar = bzVar.f274712g;
            if (clVar == null) {
                clVar = C98418cl.f274760h;
            }
            if ((clVar.f274762a & 1) != 0) {
                e.mo85279c("firstEval").mo85276a(C90752i.m148232f(new Date(TimeUnit.SECONDS.toMillis((long) clVar.f274763b))));
            }
            if ((clVar.f274762a & 2) != 0) {
                e.mo85279c("delayedSendTime").mo85276a(C90752i.m148232f(new Date(TimeUnit.SECONDS.toMillis((long) clVar.f274764c))));
            }
            if ((clVar.f274762a & 4) != 0) {
                e.mo85279c("ttlSec").mo85276a(C90752i.m148230d(Integer.valueOf(clVar.f274765d)));
            }
            if ((clVar.f274762a & 8) != 0) {
                e.mo85279c("forceSend").mo85276a(C90752i.m148228b(Boolean.valueOf(clVar.f274766e)));
            }
        }
    }
}
