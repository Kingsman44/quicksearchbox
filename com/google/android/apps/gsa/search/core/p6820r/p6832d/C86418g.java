package com.google.android.apps.gsa.search.core.p6820r.p6832d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86567m;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.search.core.r.d.g */
/* compiled from: PG */
public final class C86418g implements C86569o {

    /* renamed from: a */
    private final Iterable f233565a;

    public C86418g(Iterable iterable) {
        this.f233565a = C58485gu.m89841i(iterable);
    }

    /* renamed from: b */
    public final String mo79837b() {
        StringBuilder sb = new StringBuilder("[FailoverFetcher with: ");
        String str = BuildConfig.FLAVOR;
        for (C86569o b : this.f233565a) {
            sb.append(str.concat(String.valueOf(b.mo79837b())));
            str = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: g */
    public final C86497j mo79838g(C60870cx cxVar) {
        C58485gu i = C58485gu.m89841i(C58557jl.m90127h(this.f233565a, C86415d.f233559a));
        C60870cx i2 = C60856cj.m92900i(C58836b.f156633a);
        Iterator it = i.iterator();
        if (it.hasNext()) {
            i2 = C60922j.m93045h(((C86569o) it.next()).mo79838g(cxVar).mo80184c(), new C86416e(cxVar, it), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
        }
        return new C86567m(i2);
    }
}
