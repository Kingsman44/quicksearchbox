package android.support.p031v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.app.FragmentManager;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentManagerState */
/* compiled from: PG */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0200bs();

    /* renamed from: a */
    ArrayList f666a;

    /* renamed from: b */
    ArrayList f667b;

    /* renamed from: c */
    ArrayList f668c;

    /* renamed from: d */
    BackStackRecordState[] f669d;

    /* renamed from: e */
    int f670e;

    /* renamed from: f */
    String f671f = null;

    /* renamed from: g */
    ArrayList f672g = new ArrayList();

    /* renamed from: h */
    ArrayList f673h = new ArrayList();

    /* renamed from: i */
    ArrayList f674i = new ArrayList();

    /* renamed from: j */
    ArrayList f675j = new ArrayList();

    /* renamed from: k */
    ArrayList f676k;

    public FragmentManagerState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f666a);
        parcel.writeStringList(this.f667b);
        parcel.writeStringList(this.f668c);
        parcel.writeTypedArray(this.f669d, i);
        parcel.writeInt(this.f670e);
        parcel.writeString(this.f671f);
        parcel.writeStringList(this.f672g);
        parcel.writeTypedList(this.f673h);
        parcel.writeStringList(this.f674i);
        parcel.writeTypedList(this.f675j);
        parcel.writeTypedList(this.f676k);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f666a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f667b = parcel.createStringArrayList();
        this.f668c = parcel.createStringArrayList();
        this.f669d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f670e = parcel.readInt();
        this.f671f = parcel.readString();
        this.f672g = parcel.createStringArrayList();
        this.f673h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f674i = parcel.createStringArrayList();
        this.f675j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f676k = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
