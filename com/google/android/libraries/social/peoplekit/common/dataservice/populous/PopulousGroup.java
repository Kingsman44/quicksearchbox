package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.GroupMember;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public final class PopulousGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42127u();

    /* renamed from: a */
    private final Group f110118a;

    public PopulousGroup(Parcel parcel) {
        Group group = (Group) parcel.readParcelable(Group.class.getClassLoader());
        this.f110118a = group;
        m73893a(group);
    }

    /* renamed from: a */
    private static void m73893a(Group group) {
        if (group == null) {
            C58485gu.m89845m();
            return;
        }
        C58480gp gpVar = new C58480gp(4);
        C58485gu b = group.mo44781b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C42130x xVar = new C42130x();
            xVar.f110200a = ((GroupMember) b.get(i)).mo44788a();
            gpVar.mo55395g(new PopulousPerson(xVar));
        }
        gpVar.mo55394f();
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String toString() {
        if (this.f110118a.mo44782c().isEmpty()) {
            return String.valueOf(this.f110118a.mo44783d()).concat(":GROUP");
        }
        String d = this.f110118a.mo44783d();
        String c = ((GroupOrigin) this.f110118a.mo44782c().get(0)).mo45008c();
        return d + ":" + c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110118a, i);
    }

    public PopulousGroup(C42128v vVar) {
        Group group = vVar.f110199a;
        this.f110118a = group;
        m73893a(group);
    }
}
