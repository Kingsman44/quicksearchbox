package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.bn;
import com.google.android.apps.gsa.nga.engine.am.h.cf;
import com.google.android.apps.gsa.nga.engine.am.h.ct;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cy */
/* compiled from: PG */
public final /* synthetic */ class C77080cy implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212733a;

    /* renamed from: b */
    public final /* synthetic */ C80913i f212734b;

    /* renamed from: c */
    public final /* synthetic */ C77140u f212735c;

    /* renamed from: d */
    public final /* synthetic */ C80303ay f212736d;

    public /* synthetic */ C77080cy(C77089dg dgVar, C80913i iVar, C77140u uVar, C80303ay ayVar) {
        this.f212733a = dgVar;
        this.f212734b = iVar;
        this.f212735c = uVar;
        this.f212736d = ayVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C77089dg dgVar = this.f212733a;
        C80913i iVar = this.f212734b;
        C77140u uVar = this.f212735c;
        C80303ay ayVar = this.f212736d;
        C58485gu guVar = (C58485gu) obj;
        long longValue = ((Long) ((C58485gu) iVar.mo74714i()).get(0)).longValue();
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) C77089dg.f212747a.mo56225c()).mo56372aa(3806)).mo56386p("Cannot send message in any client");
            ((C58970a) ((C58970a) C77089dg.f212747a.mo56224b()).mo56372aa(3807)).mo56388r("Cannot send message to %d in any client", longValue);
            return C80913i.m128773b(Optional.empty());
        }
        Optional g = dgVar.mo72420g(uVar.mo72414j(), false);
        if (g.isPresent() && guVar.contains(g.get())) {
            guVar = C58485gu.m89846n((af) g.get());
        }
        ct ctVar = dgVar.f212751e;
        bb bbVar = bb.c;
        df dfVar = (df) uVar.mo72410f().get();
        List list = (List) Collection.EL.stream(guVar).map(C77062cg.f212690a).collect(C58370cn.f155946a);
        C83320io h = uVar.mo72412h();
        C79850ah c = ctVar.e.mo74252c(18003, h);
        try {
            C60870cx j = ctVar.g.mo28210j(ctVar.d.j(longValue), "[NGA] resolveProvider: getDisplayName", new cf(ctVar, bbVar.e, dfVar, list, ayVar, h));
            c.mo74256c(j);
            if (c != null) {
                c.mo74255b();
            }
            return C80913i.m128774c(j);
        } catch (Throwable th) {
            bn.a(th, th);
        }
        throw th;
    }
}
