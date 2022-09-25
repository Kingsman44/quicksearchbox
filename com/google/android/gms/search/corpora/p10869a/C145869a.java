package com.google.android.gms.search.corpora.p10869a;

import android.os.Parcel;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.corpora.a.a */
/* compiled from: PG */
public abstract class C145869a extends C8849b implements C145870b {
    public C145869a() {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                enforceNoDataAvail(parcel);
                mo122257f((RequestIndexingCall$Response) C8850c.m23492a(parcel, RequestIndexingCall$Response.CREATOR));
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                mo122252a((ClearCorpusCall$Response) C8850c.m23492a(parcel, ClearCorpusCall$Response.CREATOR));
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo122255d((GetCorpusStatusCall$Response) C8850c.m23492a(parcel, GetCorpusStatusCall$Response.CREATOR));
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                mo122254c((GetCorpusInfoCall$Response) C8850c.m23492a(parcel, GetCorpusInfoCall$Response.CREATOR));
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo122253b((DeleteUsageReportCall$Response) C8850c.m23492a(parcel, DeleteUsageReportCall$Response.CREATOR));
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                mo122256e((RegisterCorpusInfoCall$Response) C8850c.m23492a(parcel, RegisterCorpusInfoCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
