package com.google.android.apps.search.googleapp.search.p10422l;

import com.google.android.apps.search.googleapp.search.p10415i.C137493b;
import com.google.android.libraries.silk.p3205a.p3237z.C41741a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4291aa.C56623a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4291aa.C56624b;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.l.a */
/* compiled from: PG */
public final class C137548a implements C41741a {

    /* renamed from: a */
    private static final C58974d f374103a = C58974d.m91134h("SilkTimestampApi");

    /* renamed from: b */
    private final C137493b f374104b;

    public C137548a(C137493b bVar) {
        C69664n.m101061g(bVar, "firstByteTime");
        this.f374104b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo44333a() {
        Instant instant = this.f374104b.f373960c;
        if (C69664n.m101066l(instant, Instant.EPOCH)) {
            ((C58970a) f374103a.mo56226d()).mo56386p("No first byte time was stored, reporting 0");
        }
        C56623a aVar = (C56623a) C56624b.f151183c.createBuilder();
        long epochMilli = instant.toEpochMilli();
        aVar.copyOnWrite();
        C56624b bVar = (C56624b) aVar.instance;
        bVar.f151185a |= 1;
        bVar.f151186b = epochMilli;
        return C60856cj.m92900i(aVar.build());
    }
}
