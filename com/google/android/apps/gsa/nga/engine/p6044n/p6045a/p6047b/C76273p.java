package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.c.a.au;
import com.google.android.apps.gsa.nga.engine.am.c.a.av;
import com.google.android.apps.gsa.nga.engine.am.c.a.az;
import com.google.android.apps.gsa.nga.engine.am.c.a.ba;
import com.google.android.apps.gsa.nga.engine.am.c.a.be;
import com.google.android.apps.gsa.nga.engine.p6056o.C76470a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.p */
/* compiled from: PG */
public final class C76273p extends C22538o {

    /* renamed from: a */
    public final C76470a f211298a;

    public C76273p(C76470a aVar) {
        this.f211298a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C58485gu guVar;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C51594nm nmVar = (C51594nm) m41992m(dwVar, "timer_params", C51594nm.f134474f.getParserForType());
        if (nmVar.f134477b.isEmpty()) {
            guVar = C58485gu.m89846n(new Intent("android.intent.action.SHOW_TIMERS"));
        } else {
            C58485gu j = C58485gu.m89842j(nmVar.f134477b);
            if (Collection.EL.stream(j).allMatch(au.a)) {
                C58480gp e = C58485gu.m89837e();
                HashMap hashMap = new HashMap();
                e.mo55395g(be.d((C51592nk) Collection.EL.stream(j).min(az.a).get()));
                C58495hd l = C58495hd.m89898l(hashMap);
                if (!l.isEmpty()) {
                    Stream map = Collection.EL.stream(j).map(new ba(l));
                    Objects.requireNonNull(e);
                    map.forEach(new av(e));
                }
                guVar = ac.b((Uri[]) e.mo55394f().toArray(new Uri[0]));
            } else {
                throw new IllegalArgumentException("Existing timers need timer ids");
            }
        }
        if (!Collection.EL.stream(guVar).allMatch(new C76272o(this))) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Unable to show timer, intent starter failed."));
        }
        return C60856cj.m92900i(C22402a.f61893a);
    }
}
