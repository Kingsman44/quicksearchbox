package com.google.android.apps.gsa.p6487s3.producers;

import android.location.Location;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.shared.logger.C89956x;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.s3.producers.l */
/* compiled from: PG */
public final class C84313l {

    /* renamed from: a */
    public Location f229452a;

    /* renamed from: b */
    private final C74637ae f229453b;

    /* renamed from: c */
    private final C85881bd f229454c;

    /* renamed from: d */
    private final C68214a f229455d;

    public C84313l(C74637ae aeVar, C85881bd bdVar, C68214a aVar) {
        this.f229453b = aeVar;
        this.f229454c = bdVar;
        this.f229455d = aVar;
    }

    /* renamed from: a */
    public final List mo77856a(C84316o oVar, Query query) {
        C58976aa aaVar = C58975e.f156826a;
        long j = query.f252749G;
        ArrayList arrayList = new ArrayList();
        C90748e.m148224b();
        if (this.f229454c.mo79514e(true)) {
            C60870cx g = C60922j.m93044g(this.f229453b.mo71021e(C39226b.TAG_CLASSIC_SERVICES_S3_LO), new C84312k(this, oVar), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            C60856cj.m92911t(g, new C84317p(new C89956x(j, C90719ac.f253778a.f253779b.nextLong()), this.f229455d), C60826bg.f164896a);
            arrayList.add(g);
        }
        return arrayList;
    }
}
