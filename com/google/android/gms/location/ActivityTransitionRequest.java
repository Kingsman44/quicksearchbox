package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144951l();

    /* renamed from: a */
    public static final Comparator f391734a = new C144950k();

    /* renamed from: b */
    public final List f391735b;

    /* renamed from: c */
    public final String f391736c;

    /* renamed from: d */
    public final List f391737d;

    /* renamed from: e */
    public String f391738e;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        List list3;
        C143919bh.m233971n(list, "transitions can't be null");
        C143919bh.m233960c(list.size() > 0, "transitions can't be empty.");
        C143919bh.m233958a(list);
        TreeSet treeSet = new TreeSet(f391734a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            C143919bh.m233960c(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.f391735b = Collections.unmodifiableList(list);
        this.f391736c = str;
        if (list2 == null) {
            list3 = Collections.emptyList();
        } else {
            list3 = Collections.unmodifiableList(list2);
        }
        this.f391737d = list3;
        this.f391738e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return C143912ba.m233950b(this.f391735b, activityTransitionRequest.f391735b) && C143912ba.m233950b(this.f391736c, activityTransitionRequest.f391736c) && C143912ba.m233950b(this.f391738e, activityTransitionRequest.f391738e) && C143912ba.m233950b(this.f391737d, activityTransitionRequest.f391737d);
        }
    }

    public final int hashCode() {
        int hashCode = this.f391735b.hashCode() * 31;
        String str = this.f391736c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f391737d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f391738e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f391735b);
        String str = this.f391736c;
        String valueOf2 = String.valueOf(this.f391737d);
        String str2 = this.f391738e;
        return "ActivityTransitionRequest [mTransitions=" + valueOf + ", mTag='" + str + "', mClients=" + valueOf2 + ", mAttributionTag=" + str2 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233958a(parcel);
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f391735b);
        C143947c.m234106y(parcel, 2, this.f391736c);
        C143947c.m234080C(parcel, 3, this.f391737d);
        C143947c.m234106y(parcel, 4, this.f391738e);
        C143947c.m234083b(parcel, a);
    }
}
