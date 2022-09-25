package com.google.android.libraries.social.peoplekit;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41944s;
import com.google.android.libraries.social.p3269d.p3270a.C41945t;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public final class PeopleKitPickerResultImpl implements PeopleKitPickerResult {
    public static final Parcelable.Creator CREATOR = new C42034b();

    /* renamed from: a */
    public final Set f109514a;

    /* renamed from: b */
    public C41945t f109515b;

    /* renamed from: c */
    private final PeopleKitDataLayer f109516c;

    /* renamed from: d */
    private String f109517d = BuildConfig.FLAVOR;

    public PeopleKitPickerResultImpl(Parcel parcel) {
        this.f109516c = (PeopleKitDataLayer) parcel.readParcelable(PeopleKitDataLayer.class.getClassLoader());
        try {
            this.f109515b = (C41945t) ((C41944s) ((C41944s) C41945t.f109486d.createBuilder()).mergeFrom(parcel.createByteArray(), C62921ba.m95368a())).build();
        } catch (C62974ct unused) {
        }
        HashSet hashSet = new HashSet();
        this.f109514a = hashSet;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, Channel.class.getClassLoader());
        hashSet.addAll(arrayList);
        this.f109517d = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f109516c, i);
        parcel.writeByteArray(this.f109515b.toByteArray());
        parcel.writeList(new ArrayList(this.f109514a));
        parcel.writeString(this.f109517d);
    }

    public PeopleKitPickerResultImpl(PeopleKitDataLayer peopleKitDataLayer, C41945t tVar, Set set) {
        this.f109516c = peopleKitDataLayer;
        this.f109515b = tVar;
        this.f109514a = new HashSet(set);
    }
}
