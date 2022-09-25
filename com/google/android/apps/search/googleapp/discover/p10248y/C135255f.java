package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134757h;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134759j;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134760k;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134761l;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134762m;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134763n;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134764o;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134765p;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46786dc;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.p4522b.C58528ij;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.f */
/* compiled from: PG */
public final class C135255f {

    /* renamed from: a */
    public static final C46691ai f368471a;

    /* renamed from: b */
    private static final C46690ah f368472b;

    /* renamed from: c */
    private static final C46690ah f368473c;

    /* renamed from: d */
    private static final C46690ah f368474d;

    /* renamed from: e */
    private static final C46690ah f368475e;

    /* renamed from: f */
    private static final C46690ah f368476f;

    /* renamed from: g */
    private static final C46690ah f368477g;

    /* renamed from: h */
    private static final C46691ai f368478h;

    static {
        C46885y yVar = new C46885y("minus_one_key");
        f368472b = yVar;
        C46885y yVar2 = new C46885y("activity_key");
        f368473c = yVar2;
        C46885y yVar3 = new C46885y("second_screen_key");
        f368474d = yVar3;
        C46885y yVar4 = new C46885y("full_coverage_key");
        f368475e = yVar4;
        C46885y yVar5 = new C46885y("channel_detail_key");
        f368476f = yVar5;
        C46885y yVar6 = new C46885y("related_videos_key");
        f368477g = yVar6;
        C46786dc a = C46786dc.m83350a(C58528ij.m90015O(yVar, yVar2, yVar3, yVar4, yVar5, yVar6, new C46690ah[0]));
        f368478h = a;
        C69664n.m101060f(a, "ALL_SURFACES_MERGED_KEY");
        f368471a = a;
    }

    /* renamed from: a */
    public static final C46691ai m219392a(C134766q qVar) {
        C69664n.m101061g(qVar, "tngDiscoverSurface");
        if ((qVar instanceof C134763n) || C69664n.m101066l(qVar, C134761l.f366945a)) {
            C46690ah ahVar = f368472b;
            C69664n.m101060f(ahVar, "MINUS_ONE_DATA_KEY");
            return ahVar;
        } else if ((qVar instanceof C134762m) || C69664n.m101066l(qVar, C134760k.f366943a)) {
            C46690ah ahVar2 = f368473c;
            C69664n.m101060f(ahVar2, "GOOGLE_ACTIVITY_DATA_KEY");
            return ahVar2;
        } else if (qVar instanceof C134765p) {
            C46690ah ahVar3 = f368474d;
            C69664n.m101060f(ahVar3, "SECOND_SCREEN_DATA_KEY");
            return ahVar3;
        } else if (qVar instanceof C134759j) {
            C46690ah ahVar4 = f368475e;
            C69664n.m101060f(ahVar4, "FULL_COVERAGE_DATA_KEY");
            return ahVar4;
        } else if (qVar instanceof C134757h) {
            C46690ah ahVar5 = f368476f;
            C69664n.m101060f(ahVar5, "CHANNEL_DETAIL_DATA_KEY");
            return ahVar5;
        } else if (qVar instanceof C134764o) {
            C46690ah ahVar6 = f368477g;
            C69664n.m101060f(ahVar6, "RELATED_VIDEOS_DATA_KEY");
            return ahVar6;
        } else {
            throw new C69677g();
        }
    }
}
