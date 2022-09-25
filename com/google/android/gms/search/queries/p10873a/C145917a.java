package com.google.android.gms.search.queries.p10873a;

import android.os.Parcel;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.queries.a.a */
/* compiled from: PG */
public abstract class C145917a extends C8849b implements C145918b {
    public C145917a() {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                enforceNoDataAvail(parcel);
                mo122332e((QueryCall$Response) C8850c.m23492a(parcel, QueryCall$Response.CREATOR));
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                mo122331d((GlobalQueryCall$Response) C8850c.m23492a(parcel, GlobalQueryCall$Response.CREATOR));
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo122329b((GetDocumentsCall$Response) C8850c.m23492a(parcel, GetDocumentsCall$Response.CREATOR));
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                mo122330c((GetPhraseAffinityCall$Response) C8850c.m23492a(parcel, GetPhraseAffinityCall$Response.CREATOR));
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo122333f((QuerySuggestCall$Response) C8850c.m23492a(parcel, QuerySuggestCall$Response.CREATOR));
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                mo122328a((AnnotateCall$Response) C8850c.m23492a(parcel, AnnotateCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
