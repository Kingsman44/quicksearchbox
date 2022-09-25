package com.google.android.apps.gsa.shared.p7192v;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.v.d */
/* compiled from: PG */
public final /* synthetic */ class C91151d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Instant f254490a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f254491b;

    /* renamed from: c */
    public final /* synthetic */ C42876ab f254492c;

    public /* synthetic */ C91151d(Instant instant, C86124t tVar, C42876ab abVar) {
        this.f254490a = instant;
        this.f254491b = tVar;
        this.f254492c = abVar;
    }

    public final C60870cx apply(Object obj) {
        Instant instant = this.f254490a;
        C86124t tVar = this.f254491b;
        C42876ab abVar = this.f254492c;
        C58528ij ijVar = C91165r.f254530a;
        if (((C136866bf) obj).mo113418c(instant.toEpochMilli())) {
            return C118826c.f331423b;
        }
        C60870cx h = C60922j.m93045h(C91165r.m148930e(instant, tVar, abVar), new C91161n(tVar, abVar, instant), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
