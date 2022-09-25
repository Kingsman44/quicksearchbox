package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitExternalEntityKey;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class PopulousCoalescedGroup implements CoalescedChannels {
    public static final Parcelable.Creator CREATOR = new C42115i();

    /* renamed from: a */
    private final List f110104a;

    /* renamed from: b */
    private final List f110105b;

    /* renamed from: c */
    private final C58833ax f110106c;

    /* renamed from: d */
    private final boolean f110107d;

    /* renamed from: e */
    private final List f110108e;

    /* renamed from: f */
    private final boolean f110109f;

    public PopulousCoalescedGroup(Parcel parcel) {
        C58833ax axVar;
        ArrayList arrayList = new ArrayList();
        this.f110104a = arrayList;
        parcel.readList(arrayList, PopulousChannel.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f110105b = arrayList2;
        parcel.readList(arrayList2, PopulousChannel.class.getClassLoader());
        boolean z = true;
        if (parcel.readInt() == 1) {
            axVar = C58833ax.m90834k(Integer.valueOf(parcel.readInt()));
        } else {
            axVar = C58836b.f156633a;
        }
        this.f110106c = axVar;
        this.f110107d = parcel.readInt() == 1;
        ArrayList arrayList3 = new ArrayList();
        this.f110108e = arrayList3;
        parcel.readTypedList(arrayList3, PeopleKitExternalEntityKey.CREATOR);
        this.f110109f = parcel.readInt() != 1 ? false : z;
    }

    public PopulousCoalescedGroup(C42116j jVar) {
        this.f110104a = jVar.f110159a;
        this.f110105b = jVar.f110160b;
        this.f110106c = jVar.f110161c;
        this.f110107d = false;
        this.f110108e = null;
        this.f110109f = false;
    }

    /* renamed from: a */
    public final int mo44646a() {
        return 1;
    }

    /* renamed from: b */
    public final C58833ax mo44647b() {
        return this.f110106c;
    }

    /* renamed from: c */
    public final List mo44648c() {
        return this.f110104a;
    }

    /* renamed from: d */
    public final List mo44649d() {
        return this.f110105b;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo44650e(Context context) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PopulousCoalescedGroup) {
            return ((Channel) this.f110104a.get(0)).equals(((PopulousCoalescedGroup) obj).f110104a.get(0));
        }
        return false;
    }

    /* renamed from: f */
    public final void mo44651f(int i) {
    }

    /* renamed from: g */
    public final boolean mo44652g() {
        return this.f110107d;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f110104a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f110104a);
        parcel.writeList(this.f110105b);
        C58833ax axVar = this.f110106c;
        parcel.writeInt(axVar.mo56113h() ? 1 : 0);
        if (axVar.mo56113h()) {
            parcel.writeInt(((Integer) axVar.mo56107c()).intValue());
        }
        parcel.writeInt(this.f110107d ? 1 : 0);
        parcel.writeTypedList(this.f110108e);
        parcel.writeInt(this.f110109f ? 1 : 0);
    }
}
