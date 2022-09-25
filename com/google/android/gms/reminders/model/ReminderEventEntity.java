package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.C143865e;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public class ReminderEventEntity implements ReflectedParcelable, C145851w {
    public static final Parcelable.Creator CREATOR = new C145853y();

    /* renamed from: a */
    public final Task f394307a;

    /* renamed from: b */
    private final int f394308b;

    /* renamed from: c */
    private final String f394309c;

    public ReminderEventEntity(Parcel parcel) {
        this.f394308b = parcel.readInt();
        this.f394307a = (Task) parcel.readParcelable(Task.class.getClassLoader());
        this.f394309c = parcel.readString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final int mo121964h() {
        return this.f394308b;
    }

    /* renamed from: i */
    public final Task mo121965i() {
        return this.f394307a;
    }

    /* renamed from: j */
    public final String mo121966j() {
        return this.f394309c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f394308b);
        parcel.writeParcelable(this.f394307a, i);
        parcel.writeString(this.f394309c);
    }

    public ReminderEventEntity(C145851w wVar) {
        this.f394308b = wVar.mo121964h();
        this.f394307a = (Task) wVar.mo121965i().mo119345a();
        this.f394309c = ((C143865e) wVar).mo119337kv("account_name");
    }
}
