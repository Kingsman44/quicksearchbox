package com.google.android.libraries.kids.platform.kidonboarding.p1988b;

import android.net.Uri;
import com.google.android.libraries.kids.platform.kidonboarding.p1987a.C24038a;
import com.google.android.libraries.kids.platform.kidonboarding.p1987a.C24039b;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.protobuf.C62921ba;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.b.a */
/* compiled from: PG */
public final class C24041a implements C24043c {

    /* renamed from: a */
    private final C62921ba f65707a;

    /* renamed from: b */
    private final String f65708b;

    public C24041a(C62921ba baVar, String str) {
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f65707a = baVar;
        this.f65708b = str;
    }

    /* renamed from: a */
    public final Uri mo29437a(C54618k kVar) {
        C69664n.m101061g(kVar, "params");
        Uri.Builder buildUpon = Uri.parse(this.f65708b).buildUpon();
        C69664n.m101060f(buildUpon, "uriBuilder");
        C24042b.m44639a(kVar, buildUpon);
        Uri build = buildUpon.build();
        C69664n.m101060f(build, "uriBuilder.build()");
        return build;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C24039b mo29438b(C69626l lVar) {
        return new C24038a(this.f65707a, lVar);
    }
}
