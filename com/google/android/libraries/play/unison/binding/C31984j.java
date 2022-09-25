package com.google.android.libraries.play.unison.binding;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.j */
/* compiled from: PG */
public final class C31984j implements Parcelable.ClassLoaderCreator {
    /* renamed from: a */
    public static final BindableStateStore m59587a(Parcel parcel, ClassLoader classLoader) {
        C69664n.m101061g(parcel, "input");
        BindableStateStore bindableStateStore = new BindableStateStore(parcel.readInt());
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            Object readValue = parcel.readValue(classLoader);
            Parcelable readParcelable = parcel.readParcelable(classLoader);
            if (readValue != null) {
                bindableStateStore.mo37721c(readValue, readParcelable);
            }
        }
        return bindableStateStore;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "input");
        return m59587a(parcel, getClass().getClassLoader());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BindableStateStore[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m59587a(parcel, classLoader);
    }
}
