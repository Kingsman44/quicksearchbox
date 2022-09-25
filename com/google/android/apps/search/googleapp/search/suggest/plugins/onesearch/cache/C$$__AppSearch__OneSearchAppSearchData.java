package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0843h;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.$$__AppSearch__OneSearchAppSearchData  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__OneSearchAppSearchData implements C0855t {
    public static final String SCHEMA_NAME = "OneSearchAppSearchData";

    public OneSearchAppSearchData fromGenericDocument(C0858w wVar) {
        String str = wVar.f2847b;
        String h = wVar.mo3447h();
        long j = wVar.f2849d;
        long c = wVar.mo3442c();
        byte[][] o = wVar.mo3455o("zeroStateGetSuggestionsResponseBytes");
        byte[] bArr = null;
        byte[] bArr2 = (o == null || o.length == 0) ? null : o[0];
        byte[][] o2 = wVar.mo3455o("zeroStateInternalBytes");
        if (!(o2 == null || o2.length == 0)) {
            bArr = o2[0];
        }
        return new OneSearchAppSearchData(h, str, j, c, bArr2, bArr);
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0843h hVar = new C0843h("zeroStateGetSuggestionsResponseBytes");
        hVar.mo3397b();
        gVar.mo3395b(hVar.mo3396a());
        C0843h hVar2 = new C0843h("zeroStateInternalBytes");
        hVar2.mo3397b();
        gVar.mo3395b(hVar2.mo3396a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(OneSearchAppSearchData oneSearchAppSearchData) {
        C0857v vVar = new C0857v(oneSearchAppSearchData.f376066a, oneSearchAppSearchData.f376067b, SCHEMA_NAME);
        vVar.mo3434e(oneSearchAppSearchData.f376068c);
        vVar.mo3431b(oneSearchAppSearchData.f376069d);
        byte[] bArr = oneSearchAppSearchData.f376070e;
        if (bArr != null) {
            vVar.mo3436g("zeroStateGetSuggestionsResponseBytes", bArr);
        }
        byte[] bArr2 = oneSearchAppSearchData.f376071f;
        if (bArr2 != null) {
            vVar.mo3436g("zeroStateInternalBytes", bArr2);
        }
        return vVar.mo3432c();
    }
}
