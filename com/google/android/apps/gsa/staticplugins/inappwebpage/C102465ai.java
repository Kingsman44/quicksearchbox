package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ai */
/* compiled from: PG */
final class C102465ai implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        RequestStack requestStack = new RequestStack();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Request.CREATOR);
        requestStack.f285932a.addAll(arrayList);
        return requestStack;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RequestStack[i];
    }
}
