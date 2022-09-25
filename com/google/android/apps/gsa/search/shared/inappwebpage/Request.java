package com.google.android.apps.gsa.search.shared.inappwebpage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
public final class Request implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87575b();

    /* renamed from: d */
    private static final C58528ij f236599d = C58528ij.m90011K("auth", "uberauth");

    /* renamed from: a */
    public final Uri f236600a;

    /* renamed from: b */
    public final C58528ij f236601b;

    /* renamed from: c */
    public final Query f236602c;

    public Request(Uri uri, C58528ij ijVar, Query query) {
        uri.getClass();
        this.f236600a = uri;
        ijVar.getClass();
        this.f236601b = ijVar;
        this.f236602c = query;
    }

    /* renamed from: a */
    public static Request m142363a(Intent intent) {
        if (intent.getData() == null) {
            return null;
        }
        Query query = (Query) intent.getParcelableExtra("base_query");
        if (query == null) {
            query = Query.f252741b;
        }
        return new Request(intent.getData(), C58528ij.m90011K("^https?:\\/\\/[^\\/]+\\/imgres\\?.*$", "^https?:\\/\\/[^\\/]+\\/saves?\\/?(list\\/.*)?(\\?.*)?$"), query);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Request) {
            Request request = (Request) obj;
            if (!C58832aw.m90831a(this.f236600a, request.f236600a) || !C58832aw.m90831a(this.f236601b, request.f236601b) || !C58832aw.m90831a(this.f236602c.f252768g, request.f236602c.f252768g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f236600a, this.f236601b, this.f236602c.f252768g});
    }

    public final String toString() {
        String str;
        C58830au b = C58831av.m90829b(this);
        Uri uri = this.f236600a;
        if (!uri.isHierarchical() || Collections.disjoint(uri.getQueryParameterNames(), f236599d)) {
            str = uri.toString();
        } else {
            str = uri.buildUpon().query("REDACTED").build().toString();
        }
        b.mo56102b("mUri", str);
        b.mo56102b("mInitialInAppUriPatterns", this.f236601b);
        b.mo56102b("mBaseQuery", this.f236602c.f252768g);
        return b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236600a, i);
        parcel.writeInt(this.f236601b.size());
        C58800sl lA = this.f236601b.iterator();
        while (lA.hasNext()) {
            parcel.writeString((String) lA.next());
        }
        parcel.writeParcelable(this.f236602c, i);
    }
}
