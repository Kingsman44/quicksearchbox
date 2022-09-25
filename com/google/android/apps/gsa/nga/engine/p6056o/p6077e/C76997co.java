package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.education.C75744bd;
import com.google.android.apps.gsa.nga.engine.education.C75745be;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.co */
/* compiled from: PG */
public final /* synthetic */ class C76997co implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76999cq f212539a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212540b;

    public /* synthetic */ C76997co(C76999cq cqVar, C74965n nVar) {
        this.f212539a = cqVar;
        this.f212540b = nVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C76999cq cqVar = this.f212539a;
        C74965n nVar = this.f212540b;
        if (cqVar.f212543b.f212541a.getActiveNetwork() != null) {
            return C80401n.f220656k;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(54419);
        C75745be beVar = cqVar.f212542a;
        Locale q = nVar.mo71342q();
        String string = beVar.f210223a.mo75121a(q).getString(R.string.nga_offline_wcyd_text, new Object[0]);
        t tVar = beVar.f210224b;
        C51809dy r = t.r(string);
        List asList = Arrays.asList(beVar.f210223a.mo75123c(q, R.array.nga_offline_wcyd_tips));
        Collections.shuffle(asList);
        t tVar2 = beVar.f210224b;
        C58485gu o = C58485gu.m89847o(r, t.r((String) Collection.EL.stream(asList).limit(3).map(C75744bd.f210222a).collect(Collectors.joining("<br />"))));
        int i = ((C58724pq) o).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C81442m.m129557s(lVar, (C51809dy) o.get(i2));
        }
        return (C80401n) lVar.build();
    }
}
