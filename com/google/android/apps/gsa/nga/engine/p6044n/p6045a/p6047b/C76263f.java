package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.net.Uri;
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
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.f */
/* compiled from: PG */
public final class C76263f extends C22538o {

    /* renamed from: a */
    public final C76470a f211281a;

    public C76263f(C76470a aVar) {
        this.f211281a = aVar;
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
            C52403ql qlVar = jVar.f134096e;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            if ((qlVar.f137514a & 1) == 0) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Missing time pattern, required for alarm creation."));
            }
            C52403ql qlVar2 = jVar.f134096e;
            if (qlVar2 == null) {
                qlVar2 = C52403ql.f137512f;
            }
            j jVar2 = new j(C58485gu.m89846n(C51473j.f134090i));
            jVar2.e(LocalTime.m71211of(qlVar2.f137515b, (qlVar2.f137514a & 2) != 0 ? qlVar2.f137516c : 0));
            try {
                Optional map = ((jVar.f134092a & 1) != 0 ? Optional.ofNullable(Uri.parse(jVar.f134095d)) : Optional.empty()).map(C76258a.f211276a).map(C76259b.f211277a);
                Objects.requireNonNull(jVar2);
                map.ifPresent(new C76260c(jVar2));
            } catch (IllegalArgumentException unused) {
                String str = jVar.f134095d;
            }
            if ((jVar.f134092a & 64) != 0) {
                jVar2.d(jVar.f134099h);
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
                jVar2.f((C58485gu) Collection.EL.stream(qfVar2.f137496d).map(C76261d.f211279a).collect(C58370cn.f155946a));
            }
            C51419h hVar = C51419h.UNKNOWN_ALARM_STATUS;
            C51419h a = C51419h.m86180a(jVar.f134097f);
            if (a == null) {
                a = C51419h.UNKNOWN_ALARM_STATUS;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                jVar2.c();
            } else if (ordinal == 4) {
                jVar2.b();
            }
            if (((C58485gu) Collection.EL.stream(jVar2.mo71261a()).map(new C76262e(this)).collect(C58370cn.f155946a)).contains(false)) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Unable to create alarm, intent starter failed"));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        lVar.f134276b.size();
        return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, String.format(Locale.US, "Can only create exactly 1 alarm at a time, provided %d alarms.", new Object[]{Integer.valueOf(lVar.f134276b.size())})));
    }
}
