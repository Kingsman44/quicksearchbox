package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import com.google.android.apps.gsa.nga.engine.am.c.a.d;
import com.google.android.apps.gsa.nga.engine.am.c.a.j;
import com.google.android.apps.gsa.nga.engine.p6056o.C76470a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.time.LocalTime;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.x */
/* compiled from: PG */
public final class C76281x extends C22538o {

    /* renamed from: a */
    public final C76470a f211307a;

    public C76281x(C76470a aVar) {
        this.f211307a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52397qf qfVar;
        C52397qf qfVar2;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C51527l lVar = (C51527l) m41992m(dwVar, "alarm_params", C51527l.f134273f.getParserForType());
        if (lVar.f134276b.size() == 1) {
            C51473j jVar = (C51473j) lVar.f134276b.get(0);
            try {
                j a = d.a(C58485gu.m89844l(new C51473j[]{jVar}));
                if ((jVar.f134092a & 2) != 0) {
                    C52403ql qlVar = jVar.f134096e;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    a.e(LocalTime.m71211of(qlVar.f137515b, qlVar.f137516c));
                }
                if ((jVar.f134092a & 64) != 0) {
                    a.d(jVar.f134099h);
                }
                if (jVar.f134093b == 4) {
                    qfVar = (C52397qf) jVar.f134094c;
                } else {
                    qfVar = C52397qf.f137491j;
                }
                if (qfVar.f137496d.size() > 0) {
                    if (jVar.f134093b == 4) {
                        qfVar2 = (C52397qf) jVar.f134094c;
                    } else {
                        qfVar2 = C52397qf.f137491j;
                    }
                    a.f((C58485gu) Collection.EL.stream(qfVar2.f137496d).map(C76279v.f211305a).collect(C58370cn.f155946a));
                }
                C51419h hVar = C51419h.UNKNOWN_ALARM_STATUS;
                C51419h a2 = C51419h.m86180a(jVar.f134097f);
                if (a2 == null) {
                    a2 = C51419h.UNKNOWN_ALARM_STATUS;
                }
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    a.c();
                } else if (ordinal == 4) {
                    a.b();
                }
                if (((C58485gu) Collection.EL.stream(a.mo71268a()).map(new C76280w(this)).collect(C58370cn.f155946a)).contains(false)) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Unable to update alarm, intent starter failed."));
                }
                return C60856cj.m92900i(C22402a.f61893a);
            } catch (IllegalArgumentException e) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, String.format(Locale.US, "Invalid alarm given: %s", new Object[]{e.getMessage()})));
            }
        } else {
            lVar.f134276b.size();
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, String.format(Locale.US, "Can only update exactly 1 alarm at a time, provided %d alarms.", new Object[]{Integer.valueOf(lVar.f134276b.size())})));
        }
    }
}
