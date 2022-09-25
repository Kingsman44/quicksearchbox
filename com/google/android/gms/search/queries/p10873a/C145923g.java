package com.google.android.gms.search.queries.p10873a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.search.C145915i;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.search.queries.a.g */
/* compiled from: PG */
public final class C145923g extends C143847s implements C145948p {

    /* renamed from: a */
    private static final C143840l f394522a;

    /* renamed from: b */
    private static final C143707a f394523b;

    /* renamed from: c */
    private static final C143841m f394524c;

    static {
        C143840l lVar = new C143840l();
        f394522a = lVar;
        C145922f fVar = new C145922f();
        f394523b = fVar;
        f394524c = new C143841m("SearchIndex.QUERIES_API", fVar, lVar);
    }

    public C145923g(Context context, C145915i iVar) {
        super(context, (Activity) null, f394524c, iVar, C143846r.f389923a);
        context.getPackageName();
    }

    /* renamed from: a */
    public final C146006ab mo122337a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.f394512g = new Bundle();
        queryCall$Request.f394512g.putLong("request_timestamp_ms", System.currentTimeMillis());
        queryCall$Request.f394506a = str;
        queryCall$Request.f394507b = str2;
        queryCall$Request.f394508c = strArr;
        queryCall$Request.f394509d = i;
        queryCall$Request.f394510e = i2;
        queryCall$Request.f394511f = querySpecification;
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145921e(queryCall$Request);
        dcVar.f389863d = 8117;
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo122338b(String str, int i, GlobalSearchQuerySpecification globalSearchQuerySpecification) {
        GlobalQueryCall$Request globalQueryCall$Request = new GlobalQueryCall$Request();
        globalQueryCall$Request.f394502e = new Bundle();
        globalQueryCall$Request.f394502e.putLong("request_timestamp_ms", System.currentTimeMillis());
        globalQueryCall$Request.f394498a = str;
        globalQueryCall$Request.f394499b = 0;
        globalQueryCall$Request.f394500c = i;
        globalQueryCall$Request.f394501d = globalSearchQuerySpecification;
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145920d(globalQueryCall$Request);
        dcVar.f389863d = 8116;
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
