package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitExternalEntityKey;
import com.google.common.base.C58833ax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
public final class PopulousCoalescedChannels implements CoalescedChannels {
    public static final Parcelable.Creator CREATOR = new C42113g();

    /* renamed from: a */
    public List f110098a;

    /* renamed from: b */
    private boolean f110099b = false;

    /* renamed from: c */
    private final boolean f110100c;

    /* renamed from: d */
    private final List f110101d;

    /* renamed from: e */
    private final boolean f110102e;

    /* renamed from: f */
    private int f110103f;

    public PopulousCoalescedChannels(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = new ArrayList();
        this.f110098a = arrayList;
        parcel.readList(arrayList, PopulousChannel.class.getClassLoader());
        this.f110099b = parcel.readInt() == 1;
        this.f110100c = parcel.readInt() == 1;
        ArrayList arrayList2 = new ArrayList();
        this.f110101d = arrayList2;
        parcel.readTypedList(arrayList2, PeopleKitExternalEntityKey.CREATOR);
        this.f110102e = parcel.readInt() == 1 ? true : z;
        this.f110103f = parcel.readInt();
    }

    public PopulousCoalescedChannels(C42114h hVar) {
        this.f110098a = hVar.f110155a;
        this.f110100c = hVar.f110156b;
        this.f110101d = hVar.f110157c;
        this.f110102e = hVar.f110158d;
        this.f110103f = 0;
    }

    /* renamed from: a */
    public final int mo44646a() {
        return 0;
    }

    /* renamed from: b */
    public final C58833ax mo44647b() {
        return C58833ax.m90834k(Integer.valueOf(this.f110098a.size()));
    }

    /* renamed from: c */
    public final List mo44648c() {
        return this.f110098a;
    }

    /* renamed from: d */
    public final List mo44649d() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo44650e(Context context) {
        if (!this.f110099b) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Channel channel : this.f110098a) {
                if (hashSet.add(channel.mo44630k(context))) {
                    arrayList.add(channel);
                }
            }
            this.f110098a = arrayList;
            this.f110099b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PopulousCoalescedChannels) {
            PopulousCoalescedChannels populousCoalescedChannels = (PopulousCoalescedChannels) obj;
            if (mo44647b().equals(populousCoalescedChannels.mo44647b())) {
                List list = populousCoalescedChannels.f110098a;
                for (int i = 0; i < this.f110098a.size(); i++) {
                    if (!((Channel) this.f110098a.get(i)).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo44651f(int i) {
        if (this.f110103f != i) {
            Collections.sort(this.f110098a, new C42107a(i));
            this.f110103f = i;
        }
    }

    /* renamed from: g */
    public final boolean mo44652g() {
        return this.f110100c;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f110098a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f110098a);
        parcel.writeInt(this.f110099b ? 1 : 0);
        parcel.writeInt(this.f110100c ? 1 : 0);
        parcel.writeTypedList(this.f110101d);
        parcel.writeInt(this.f110102e ? 1 : 0);
        parcel.writeInt(this.f110103f);
    }
}
