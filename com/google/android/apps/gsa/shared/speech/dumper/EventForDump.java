package com.google.android.apps.gsa.shared.speech.dumper;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public abstract class EventForDump implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90549b();

    /* renamed from: c */
    public static C90550c m147674c() {
        C90537a aVar = new C90537a();
        aVar.f253120a = BuildConfig.FLAVOR;
        return aVar;
    }

    /* renamed from: d */
    public static EventForDump m147675d(int i) {
        C90550c c = m147674c();
        ((C90537a) c).f253121b = i;
        return c.mo84659a();
    }

    /* renamed from: e */
    public static EventForDump m147676e(int i, String str) {
        C90550c c = m147674c();
        C90537a aVar = (C90537a) c;
        aVar.f253121b = i;
        if (str != null) {
            aVar.f253120a = str;
            return c.mo84659a();
        }
        throw new NullPointerException("Null tag");
    }

    /* renamed from: a */
    public abstract String mo84652a();

    /* renamed from: b */
    public abstract int mo84653b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = mo84653b();
        String a = C90551d.m147694a(b);
        if (b != 0) {
            parcel.writeString(a);
            parcel.writeString(mo84652a());
            return;
        }
        throw null;
    }
}
