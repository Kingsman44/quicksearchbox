package com.google.android.apps.search.googleapp.customtabs.p10163g.p10164a;

import android.content.Context;
import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.android.apps.search.googleapp.customtabs.p10149a.C133672e;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135475u;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.g.a.o */
/* compiled from: PG */
public final class C133932o {

    /* renamed from: a */
    public static final C46690ah f364763a = new C46885y("CUSTOM_TABS_ENABLED_DATA_SOURCE");

    /* renamed from: b */
    public static final C46690ah f364764b = new C46885y("CUSTOM_TABS_AVAILABILITY_DATA_SOURCE");

    /* renamed from: c */
    public static final C46690ah f364765c = new C46885y("CUSTOM_TABS_SUMMARY_DATA_SOURCE");

    /* renamed from: d */
    public static final C46690ah f364766d = new C46885y("CUSTOM_TABS_VISIBILITY_DATA_SOURCE");

    /* renamed from: e */
    public static final Duration f364767e = Duration.ofSeconds(2);

    /* renamed from: f */
    public static final C59071e f364768f = C59071e.m91331h();

    /* renamed from: g */
    public final Context f364769g;

    /* renamed from: h */
    public final C133691m f364770h;

    /* renamed from: i */
    public final C133672e f364771i;

    /* renamed from: j */
    public final C135475u f364772j;

    /* renamed from: k */
    public final AccountId f364773k;

    /* renamed from: l */
    public final C46128f f364774l;

    /* renamed from: m */
    public final C46778cv f364775m;

    /* renamed from: n */
    public final C71422aw f364776n;

    /* renamed from: o */
    public final C21370a f364777o;

    /* renamed from: p */
    public final C118803d f364778p;

    public C133932o(Context context, C118803d dVar, C133691m mVar, C133672e eVar, C135475u uVar, AccountId accountId, C46128f fVar, C46778cv cvVar, C71422aw awVar, C21370a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(mVar, "customTabsAvailability");
        C69664n.m101061g(eVar, "customTabsAccountFetcher");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f364769g = context;
        this.f364778p = dVar;
        this.f364770h = mVar;
        this.f364771i = eVar;
        this.f364772j = uVar;
        this.f364773k = accountId;
        this.f364774l = fVar;
        this.f364775m = cvVar;
        this.f364776n = awVar;
        this.f364777o = aVar;
    }
}
