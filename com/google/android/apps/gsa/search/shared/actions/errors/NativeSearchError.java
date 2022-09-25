package com.google.android.apps.gsa.search.shared.actions.errors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class NativeSearchError extends SearchError {
    public static final Parcelable.Creator CREATOR = new C87414b();

    protected NativeSearchError(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: S */
    public final int mo81139S() {
        return R.string.native_search_connection_error;
    }

    public NativeSearchError(Query query, C90456c cVar) {
        super(query, (String) null, cVar);
        this.f236029m &= -513;
    }
}
