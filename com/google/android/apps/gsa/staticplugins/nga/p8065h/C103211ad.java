package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.search.queries.p10874b.C145934f;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ad */
/* compiled from: PG */
abstract class C103211ad {

    /* renamed from: a */
    private static final int f287976a = ((int) TimeUnit.DAYS.toSeconds(1));

    /* renamed from: e */
    protected static C103210ac m171108e() {
        C103234b bVar = new C103234b();
        bVar.f288007d = BuildConfig.FLAVOR;
        return bVar;
    }

    /* renamed from: f */
    public static C103211ad m171109f(String str) {
        C142787ac acVar = new C142787ac();
        acVar.f387579c = false;
        acVar.f387580d = 5;
        acVar.f387581e = 3;
        acVar.f387582f = new STSortSpec("(GET_NUM _DOC_SCORE)");
        acVar.mo117690b(new Section("name", false, 0));
        acVar.f387577a = false;
        C103210ac e = m171108e();
        C103234b bVar = (C103234b) e;
        bVar.f288007d = C145934f.m237740a(str).toString();
        bVar.f288004a = "com.google.android.gm";
        bVar.f288005b = "internal.3p:EmailMessage";
        bVar.f288006c = acVar.mo117689a();
        return e.mo93710a();
    }

    /* renamed from: g */
    public static C103211ad m171110g() {
        String format = String.format(Locale.US, "(MIN _USAGE_COUNT %d)", new Object[]{999});
        String format2 = String.format(Locale.US, "(CEILING (DIV _LAST_USED_TIMESTAMP %d))", new Object[]{Integer.valueOf(f287976a)});
        STSortSpec sTSortSpec = new STSortSpec(String.format(Locale.US, "(ADD (MUL %s %d) %s)", new Object[]{format2, 1000, format}));
        C103210ac e = m171108e();
        C103234b bVar = (C103234b) e;
        bVar.f288004a = "com.google.android.apps.maps";
        bVar.f288005b = "internal.3p:Place";
        C142787ac acVar = new C142787ac();
        acVar.f387577a = true;
        acVar.f387579c = false;
        acVar.mo117690b(new Section("name", false, 0));
        acVar.f387580d = 5;
        acVar.f387582f = sTSortSpec;
        bVar.f288006c = acVar.mo117689a();
        return e.mo93710a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract QuerySpecification mo93711a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo93712b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo93713c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo93714d();
}
