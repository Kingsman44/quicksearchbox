package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113164bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62963cj;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bv */
/* compiled from: PG */
public final class C111884bv {

    /* renamed from: a */
    public final Map f310885a;

    /* renamed from: b */
    private final C58485gu f310886b;

    /* renamed from: c */
    private final C58485gu f310887c;

    /* renamed from: d */
    private final C58485gu f310888d;

    public C111884bv(Map map, C86124t tVar) {
        this.f310885a = map;
        C58480gp e = C58485gu.m89837e();
        e.mo55395g(C48672ag.TAPAS_SERVER);
        e.mo55395g(C48672ag.HABIT);
        e.mo55395g(C48672ag.HABIT_RECENT_QUERIES);
        e.mo55395g(C48672ag.PCP);
        e.mo55395g(C48672ag.ICING);
        e.mo55395g(C48672ag.MEDIA);
        e.mo55395g(C48672ag.NOTIFICATION);
        e.mo55395g(C48672ag.CHALKBOARD);
        e.mo55395g(C48672ag.OFFLINE_WORKER);
        e.mo55395g(C48672ag.APPS);
        e.mo55395g(C48672ag.WORK_APPS);
        e.mo55395g(C48672ag.USAGE_STATS_APPS);
        e.mo55395g(C48672ag.APP_ACTIONS_DONATION);
        e.mo55395g(C48672ag.APP_SHORTCUTS);
        e.mo55395g(C48672ag.APP_ACTIONS_SHORTCUT);
        this.f310886b = e.mo55394f();
        C58480gp e2 = C58485gu.m89837e();
        e2.mo55371a(new C48672ag[]{C48672ag.TAPAS_SERVER, C48672ag.COMPLETE_SERVER, C48672ag.CALCULATOR, C48672ag.ICING, C48672ag.MEDIA, C48672ag.COMMUNICATION, C48672ag.APPS, C48672ag.APP_SHORTCUTS, C48672ag.WORK_APPS, C48672ag.SHORTCUT, C48672ag.MESSAGE, C48672ag.ANSWER, C48672ag.APP_ACTIONS_DONATION, C48672ag.OFFLINE_CLIENT, C48672ag.APP_ACTIONS_SHORTCUT}, 15);
        if (tVar.mo79746e(C90014bt.f247171cC)) {
            e2.mo55395g(C48672ag.APP_ACTIONS);
            e2.mo55395g(C48672ag.APP_ACTIONS_ENTITY);
            if (tVar.mo79746e(C90063do.f249353bt)) {
                e2.mo55395g(C48672ag.APP_ACTIONS_SLICE);
            }
        }
        if (tVar.mo79746e(C90063do.f249388cb) || tVar.mo79746e(C90063do.f249389cc)) {
            e2.mo55395g(C48672ag.HOME_AUTOMATION);
        }
        if (tVar.mo79746e(C90063do.f249321bN)) {
            e2.mo55395g(C48672ag.SLICES);
        }
        this.f310887c = e2.mo55394f();
        this.f310888d = m185714c(C58485gu.m89849q(C48672ag.ICING, C48672ag.APP_ACTIONS, C48672ag.APP_ACTIONS_SHORTCUT, C48672ag.APP_SHORTCUTS), C113164bv.m187181b(tVar.mo79745c(C90063do.f249596gX)));
    }

    /* renamed from: c */
    private static C58485gu m185714c(List list, Collection collection) {
        C58528ij F = C58528ij.m90006F(collection);
        Stream stream = Collection.EL.stream(list);
        Objects.requireNonNull(F);
        return (C58485gu) stream.filter(new C111883bu(F)).collect(C58370cn.f155946a);
    }

    /* renamed from: a */
    public final C58485gu mo99271a(C113405ep epVar) {
        if (epVar.mo100031n().isPresent()) {
            return this.f310888d;
        }
        C19167ba f = epVar.mo100022f();
        if (TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p()))) {
            return m185714c(this.f310886b, new C62963cj(f.f53676b, C19167ba.f53671c));
        }
        return m185714c(this.f310887c, new C62963cj(f.f53677d, C19167ba.f53672e));
    }

    /* renamed from: b */
    public final C69464a mo99272b(C48672ag agVar) {
        return (C69464a) this.f310885a.get(agVar);
    }
}
