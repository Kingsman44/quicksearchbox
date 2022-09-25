package com.google.android.libraries.kids.platform.kidonboarding.p1988b;

import android.net.Uri;
import com.google.android.libraries.kids.platform.kidonboarding.p1987a.C24038a;
import com.google.android.libraries.kids.platform.kidonboarding.p1987a.C24039b;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.p4109av.p4114c.p4115a.p4116a.C54622o;
import com.google.protobuf.C62921ba;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.b.e */
/* compiled from: PG */
public final class C24045e implements C24043c {

    /* renamed from: a */
    private final C62921ba f65711a;

    /* renamed from: b */
    private final String f65712b;

    public C24045e(C62921ba baVar, String str) {
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f65711a = baVar;
        this.f65712b = str;
    }

    /* renamed from: a */
    public final Uri mo29437a(C54618k kVar) {
        C54622o oVar;
        C69664n.m101061g(kVar, "params");
        String str = this.f65712b;
        if (kVar.f143393b == 7) {
            oVar = (C54622o) kVar.f143394c;
        } else {
            oVar = C54622o.f143400c;
        }
        String str2 = oVar.f143403b;
        C69664n.m101060f(str2, "params.profileUpgrade.kidOid");
        Uri.Builder buildUpon = Uri.parse(C69764m.m101231j(str, "$childId", str2)).buildUpon();
        C69664n.m101060f(buildUpon, "uriBuilder");
        C24042b.m44639a(kVar, buildUpon);
        Uri build = buildUpon.build();
        C69664n.m101060f(build, "uriBuilder.build()");
        return build;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C24039b mo29438b(C69626l lVar) {
        return new C24038a(this.f65711a, lVar);
    }
}
