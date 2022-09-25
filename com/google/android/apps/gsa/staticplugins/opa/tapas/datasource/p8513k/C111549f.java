package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8513k;

import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.k.f */
/* compiled from: PG */
public final /* synthetic */ class C111549f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111550g f310251a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310252b;

    public /* synthetic */ C111549f(C111550g gVar, C113405ep epVar) {
        this.f310251a = gVar;
        this.f310252b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111550g gVar = this.f310251a;
        List list = (List) obj;
        int i = 1;
        if (true != TextUtils.isEmpty(this.f310252b.mo100033p())) {
            i = 3;
        }
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((C58485gu) Collection.EL.stream(list).sorted(C111550g.f310253a).map(new C111547d(gVar)).limit((long) i).collect(C58370cn.f155946a))));
        return p.mo100091a();
    }
}
