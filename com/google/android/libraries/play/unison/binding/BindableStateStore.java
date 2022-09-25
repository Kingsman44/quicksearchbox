package com.google.android.libraries.play.unison.binding;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C2358bf;
import androidx.savedstate.C4087c;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class BindableStateStore extends C2358bf implements Parcelable, C31982h, C4087c {
    public static final Parcelable.ClassLoaderCreator CREATOR = new C31984j();

    /* renamed from: a */
    public final int f85924a;

    /* renamed from: b */
    public final Map f85925b = new C31985k(this);

    public BindableStateStore(int i) {
        this.f85924a = i;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(C59002s.f156871a, this);
        return bundle;
    }

    /* renamed from: b */
    public final Parcelable mo37720b(Object obj) {
        return (Parcelable) this.f85925b.get(obj);
    }

    /* renamed from: c */
    public final void mo37721c(Object obj, Parcelable parcelable) {
        if (parcelable != null) {
            this.f85925b.put(obj, parcelable);
        } else {
            this.f85925b.remove(obj);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "dest");
        parcel.writeInt(this.f85924a);
        parcel.writeInt(this.f85925b.size());
        for (Map.Entry entry : this.f85925b.entrySet()) {
            Object key = entry.getKey();
            Parcelable parcelable = (Parcelable) entry.getValue();
            int dataPosition = parcel.dataPosition();
            try {
                parcel.writeValue(key);
            } catch (RuntimeException e) {
                if (parcel.dataPosition() == dataPosition) {
                    parcel.writeValue((Object) null);
                } else {
                    throw e;
                }
            }
            parcel.writeParcelable(parcelable, 0);
        }
    }
}
