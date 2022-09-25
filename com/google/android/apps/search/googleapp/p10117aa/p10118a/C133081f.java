package com.google.android.apps.search.googleapp.p10117aa.p10118a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.util.concurrent.C60866ct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.aa.a.f */
/* compiled from: PG */
public final class C133081f {

    /* renamed from: a */
    public static final C46690ah f362838a = new C46885y("GoogleAppBrowserTabsDataServiceKey");

    /* renamed from: b */
    public final C46723bg f362839b;

    /* renamed from: c */
    public final C46778cv f362840c;

    /* renamed from: d */
    public final Map f362841d;

    /* renamed from: e */
    public final AtomicReference f362842e = new AtomicReference(BuildConfig.FLAVOR);

    /* renamed from: f */
    private final long f362843f;

    /* renamed from: g */
    private final C21370a f362844g;

    public C133081f(long j, C46723bg bgVar, C21370a aVar, C46778cv cvVar) {
        this.f362843f = j;
        this.f362839b = bgVar;
        this.f362844g = aVar;
        this.f362840c = cvVar;
        this.f362841d = new HashMap();
    }

    /* renamed from: a */
    public final void mo110970a(String str) {
        if (this.f362841d.containsKey(str)) {
            Map.EL.replace(this.f362841d, str, Long.valueOf(this.f362844g.mo26870b()));
            return;
        }
        this.f362841d.put(str, Long.valueOf(this.f362844g.mo26870b()));
        if (((long) this.f362841d.size()) > this.f362843f) {
            Optional findFirst = Collection.EL.stream(this.f362841d.entrySet()).sorted(Comparator.CC.comparingLong(C133078c.f362835a)).map(C133079d.f362836a).findFirst();
            if (findFirst.isPresent()) {
                String str2 = (String) findFirst.get();
                this.f362842e.set(C133077b.m216050a(str2));
                this.f362841d.remove(str2);
                this.f362840c.mo50787a(C60866ct.f164955a, f362838a);
            }
        }
    }
}
