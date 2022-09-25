package com.google.android.gms.search.queries.p10873a;

import android.os.Bundle;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.search.queries.C145947o;
import com.google.android.gms.search.queries.QueryCall$Request;

/* renamed from: com.google.android.gms.search.queries.a.j */
/* compiled from: PG */
public final class C145926j {
    /* renamed from: a */
    public static final C143854z m237730a(C143851w wVar, String str, String str2, String[] strArr, int i, QuerySpecification querySpecification) {
        QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.f394512g = new Bundle();
        queryCall$Request.f394512g.putLong("request_timestamp_ms", System.currentTimeMillis());
        queryCall$Request.f394506a = str;
        queryCall$Request.f394507b = str2;
        queryCall$Request.f394508c = strArr;
        queryCall$Request.f394509d = 0;
        queryCall$Request.f394510e = i;
        queryCall$Request.f394511f = querySpecification;
        return wVar.mo119159d(new C145947o(queryCall$Request, wVar));
    }
}
