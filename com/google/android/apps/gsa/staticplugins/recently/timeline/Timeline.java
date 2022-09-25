package com.google.android.apps.gsa.staticplugins.recently.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.List;

/* compiled from: PG */
public class Timeline implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C116202e();

    /* renamed from: a */
    public final Group[] f322178a;

    public Timeline(Parcel parcel) {
        this.f322178a = (Group[]) parcel.createTypedArray(Group.CREATOR);
    }

    /* renamed from: b */
    public static boolean m192671b(C22845p pVar) {
        int a = C22840k.m42693a(pVar.f62894c);
        if (a == 0) {
            a = 1;
        }
        return a == 6 || a == 5 || a == 4 || a == 8 || a == 7 || a == 9 || a == 14 || a == 16;
    }

    /* renamed from: c */
    public static boolean m192672c(C22845p pVar) {
        int a = C22840k.m42693a(pVar.f62894c);
        if (a == 0) {
            a = 1;
        }
        return a == 1 || a == 13 || a == 12 || a == 2 || a == 11 || a == 16;
    }

    /* renamed from: a */
    public final boolean mo102548a(Group group) {
        for (Group b : this.f322178a) {
            if (b.mo102544b(group)) {
                return true;
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f322178a, i);
    }

    public Timeline(List list) {
        this.f322178a = (Group[]) list.toArray(new Group[list.size()]);
    }
}
