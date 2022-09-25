package com.google.android.apps.gsa.search.core.p6820r.p6832d;

import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.search.core.r.d.e */
/* compiled from: PG */
final class C86416e implements C60931s {

    /* renamed from: a */
    private final C60870cx f233560a;

    /* renamed from: b */
    private final Iterator f233561b;

    public C86416e(C60870cx cxVar, Iterator it) {
        this.f233560a = cxVar;
        this.f233561b = it;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return C60856cj.m92900i(axVar);
        }
        if (!this.f233561b.hasNext()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx h = C60922j.m93045h(((C86569o) this.f233561b.next()).mo79838g(this.f233560a).mo80184c(), this, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
