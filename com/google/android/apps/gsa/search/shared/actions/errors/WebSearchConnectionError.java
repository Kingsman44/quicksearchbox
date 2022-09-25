package com.google.android.apps.gsa.search.shared.actions.errors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class WebSearchConnectionError extends SearchError {
    public static final Parcelable.Creator CREATOR = new C87417e();

    protected WebSearchConnectionError(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: S */
    public final int mo81139S() {
        return R.string.web_search_connection_error;
    }

    public WebSearchConnectionError(Query query, C90456c cVar) {
        super(query, (String) null, cVar);
        this.f236029m = (this.f236029m & -513) | 16;
    }
}
