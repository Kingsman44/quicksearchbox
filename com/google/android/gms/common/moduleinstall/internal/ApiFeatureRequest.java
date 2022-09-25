package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143852x;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143969c();

    /* renamed from: e */
    private static final Comparator f390197e = C143968b.f390202a;

    /* renamed from: a */
    public final List f390198a;

    /* renamed from: b */
    public final boolean f390199b;

    /* renamed from: c */
    public final String f390200c;

    /* renamed from: d */
    public final String f390201d;

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        C143919bh.m233958a(list);
        this.f390198a = list;
        this.f390199b = z;
        this.f390200c = str;
        this.f390201d = str2;
    }

    /* renamed from: a */
    static ApiFeatureRequest m234132a(List list, boolean z) {
        TreeSet treeSet = new TreeSet(f390197e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((C143852x) it.next()).mo119300a());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, (String) null, (String) null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f390199b != apiFeatureRequest.f390199b || !C143912ba.m233950b(this.f390198a, apiFeatureRequest.f390198a) || !C143912ba.m233950b(this.f390200c, apiFeatureRequest.f390200c) || !C143912ba.m233950b(this.f390201d, apiFeatureRequest.f390201d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f390199b), this.f390198a, this.f390200c, this.f390201d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f390198a);
        C143947c.m234084c(parcel, 2, this.f390199b);
        C143947c.m234106y(parcel, 3, this.f390200c);
        C143947c.m234106y(parcel, 4, this.f390201d);
        C143947c.m234083b(parcel, a);
    }
}
