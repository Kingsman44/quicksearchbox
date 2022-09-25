package com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c;

import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40518d;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40528n;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.p3635a.p3636a.C46682c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import com.google.protobuf.C62912at;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.c.e */
/* compiled from: PG */
public final class C40514e {

    /* renamed from: a */
    public static final C46690ah f106305a = new C46885y("XBLEND_DATA_SOURCE");

    /* renamed from: b */
    public final C71422aw f106306b;

    /* renamed from: c */
    public final C46682c f106307c;

    /* renamed from: d */
    public final C46723bg f106308d;

    /* renamed from: e */
    public final C40527m f106309e;

    /* renamed from: f */
    public final Object f106310f = new Object();

    /* renamed from: g */
    public C40510a f106311g = new C40510a((byte[]) null);

    /* renamed from: h */
    private final C40528n f106312h;

    /* renamed from: i */
    private final C40518d f106313i;

    /* renamed from: j */
    private final C46401p f106314j;

    public C40514e(C71422aw awVar, C40528n nVar, C40518d dVar, C46682c cVar, C46723bg bgVar, InstanceStateStoreFactory instanceStateStoreFactory) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(instanceStateStoreFactory, "responseStoreFactory");
        this.f106306b = awVar;
        this.f106312h = nVar;
        this.f106313i = dVar;
        this.f106307c = cVar;
        this.f106308d = bgVar;
        this.f106309e = nVar.mo42489a(dVar.mo42486a(C57695ab.XBLEND_ANDROID));
        this.f106314j = instanceStateStoreFactory.mo50325a("xblend_response_cached", C57827x.f154499e);
    }

    /* renamed from: a */
    public final C46370ah mo42482a(C40510a aVar) {
        C46370ah a;
        synchronized (this.f106310f) {
            a = C69664n.m101066l(this.f106311g, aVar) ? this.f106314j.mo50378a(C62912at.f169862a) : null;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo42483b(C40510a aVar, C57827x xVar) {
        synchronized (this.f106310f) {
            if (C69664n.m101066l(this.f106311g, aVar)) {
                if (xVar == null) {
                    this.f106314j.mo50382e(C62912at.f169862a);
                } else {
                    this.f106314j.mo50381d(C62912at.f169862a, xVar);
                }
            }
        }
    }
}
