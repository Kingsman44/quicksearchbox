package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40108a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40517c;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40518d;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40524j;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40525k;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40528n;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protobuf.C62972cr;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.h */
/* compiled from: PG */
public final class C40190h {

    /* renamed from: a */
    public final C71422aw f105585a;

    /* renamed from: b */
    public final C21370a f105586b;

    /* renamed from: c */
    public final C40183a f105587c;

    /* renamed from: d */
    public final C40527m f105588d;

    /* renamed from: e */
    private final C46723bg f105589e;

    public C40190h(C40525k kVar, C40518d dVar, C40528n nVar, C71422aw awVar, C21370a aVar, C46723bg bgVar, C40183a aVar2) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(aVar2, "responseStore");
        this.f105585a = awVar;
        this.f105586b = aVar;
        this.f105589e = bgVar;
        this.f105587c = aVar2;
        C57695ab abVar = C57695ab.XBLEND_BUBBLES_ANDROID;
        C40517c a = dVar.mo42486a(C57695ab.XBLEND_BUBBLES_ANDROID);
        Context context = (Context) kVar.f106356a.mo17428b();
        context.getClass();
        C71422aw awVar2 = (C71422aw) kVar.f106357b.mo17428b();
        awVar2.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) kVar.f106358c.mo17428b();
        scheduledExecutorService.getClass();
        C40358k kVar2 = (C40358k) kVar.f106359d.mo17428b();
        kVar2.getClass();
        abVar.getClass();
        this.f105588d = nVar.mo42489a(new C40524j(context, awVar2, scheduledExecutorService, kVar2, abVar, a));
    }

    /* renamed from: b */
    public static final C46690ah m69784b(C40111d dVar) {
        return new C46885y("BUBBLE ".concat(String.valueOf(((C40108a) dVar).f105349a.mo59170I(C62972cr.f170009a))));
    }

    /* renamed from: a */
    public final C46689ag mo42303a(C40111d dVar, C69626l lVar) {
        return new C46719bc(this.f105589e, new C40185c(this, dVar, lVar), m69784b(dVar));
    }
}
