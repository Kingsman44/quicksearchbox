package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
public class RequestStack implements Parcelable, Iterable {
    public static final Parcelable.Creator CREATOR = new C102465ai();

    /* renamed from: a */
    public final ArrayDeque f285932a = new ArrayDeque();

    /* renamed from: a */
    public final Request mo93254a() {
        return (Request) this.f285932a.getFirst();
    }

    public final int describeContents() {
        return 0;
    }

    public final Iterator iterator() {
        return this.f285932a.iterator();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("mDeque", this.f285932a);
        return b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(C58597ky.m90211b(this.f285932a));
    }
}
