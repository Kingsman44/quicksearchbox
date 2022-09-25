package com.google.android.libraries.social.peoplekit.common.selectionmodel;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42108b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public final class PeopleKitSelectionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42137a();

    /* renamed from: a */
    public final Set f110228a;

    /* renamed from: b */
    public final Set f110229b;

    /* renamed from: c */
    public PeopleKitDataLayer f110230c;

    /* renamed from: d */
    final boolean f110231d;

    public PeopleKitSelectionModel(Parcel parcel) {
        this.f110229b = new HashSet();
        this.f110228a = new LinkedHashSet(parcel.readArrayList(Channel.class.getClassLoader()));
        this.f110231d = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public final int mo44744a() {
        return this.f110228a.size();
    }

    /* renamed from: b */
    public final List mo44745b(Context context) {
        ArrayList arrayList = new ArrayList();
        for (Channel g : this.f110228a) {
            arrayList.add(g.mo44626g(context));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final Set mo44746c() {
        return new LinkedHashSet(this.f110228a);
    }

    /* renamed from: d */
    public final void mo44747d(C42138b bVar) {
        this.f110229b.add(bVar);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final boolean mo44750f(Channel channel) {
        int i;
        if (!this.f110231d) {
            return true;
        }
        Iterator it = this.f110228a.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            Channel channel2 = (Channel) it.next();
            if (channel2.mo44621b() != 0 && channel2.mo44621b() != 6) {
                i = channel2.mo44621b();
                break;
            }
        }
        Map a = C42108b.m73898a(i);
        if (a.isEmpty()) {
            return true;
        }
        return a.containsKey(Integer.valueOf(channel.mo44621b()));
    }

    /* renamed from: g */
    public final boolean mo44751g(Channel channel) {
        return this.f110228a.contains(channel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(new ArrayList(this.f110228a));
        parcel.writeInt(this.f110231d ? 1 : 0);
    }

    public PeopleKitSelectionModel() {
        this.f110231d = false;
        this.f110228a = new LinkedHashSet();
        this.f110229b = new HashSet();
    }

    /* renamed from: e */
    public final void mo44749e(Channel channel) {
        channel.getClass();
        this.f110230c.getClass();
        if (this.f110228a.remove(channel)) {
            for (C42138b e : this.f110229b) {
                e.mo44422e(channel);
            }
            this.f110230c.mo44668m(channel);
        }
    }

    /* renamed from: h */
    public final boolean mo44752h(Channel channel, CoalescedChannels coalescedChannels) {
        channel.getClass();
        if (!this.f110231d || mo44750f(channel)) {
            this.f110230c.getClass();
            if (!this.f110228a.add(channel)) {
                return true;
            }
            for (C42138b f : this.f110229b) {
                f.mo44423f(channel, coalescedChannels);
            }
            this.f110230c.mo44671p(channel);
            return true;
        }
        for (C42138b t : this.f110229b) {
            t.mo44429t();
        }
        return false;
    }
}
