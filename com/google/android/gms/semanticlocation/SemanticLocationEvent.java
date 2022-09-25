package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SemanticLocationEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145950aa();

    /* renamed from: a */
    public final long f394617a;
    @Deprecated

    /* renamed from: b */
    public final String f394618b;

    /* renamed from: c */
    public final int f394619c;

    /* renamed from: d */
    public final PlaceEnterEvent f394620d;

    /* renamed from: e */
    public final PlaceExitEvent f394621e;

    /* renamed from: f */
    public final PlaceOngoingEvent f394622f;

    /* renamed from: g */
    public final ActivityStartEvent f394623g;

    /* renamed from: h */
    public final ActivityEndEvent f394624h;

    /* renamed from: i */
    public final ActivityOngoingEvent f394625i;

    public SemanticLocationEvent(long j, String str, int i, PlaceEnterEvent placeEnterEvent, PlaceExitEvent placeExitEvent, PlaceOngoingEvent placeOngoingEvent, ActivityStartEvent activityStartEvent, ActivityEndEvent activityEndEvent, ActivityOngoingEvent activityOngoingEvent) {
        this.f394617a = j;
        this.f394618b = str;
        this.f394619c = i;
        this.f394620d = placeEnterEvent;
        this.f394621e = placeExitEvent;
        this.f394622f = placeOngoingEvent;
        this.f394623g = activityStartEvent;
        this.f394624h = activityEndEvent;
        this.f394625i = activityOngoingEvent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f394617a);
        C143947c.m234106y(parcel, 2, this.f394618b);
        C143947c.m234089h(parcel, 3, this.f394619c);
        C143947c.m234105x(parcel, 4, this.f394620d, i);
        C143947c.m234105x(parcel, 5, this.f394621e, i);
        C143947c.m234105x(parcel, 6, this.f394622f, i);
        C143947c.m234105x(parcel, 7, this.f394623g, i);
        C143947c.m234105x(parcel, 8, this.f394624h, i);
        C143947c.m234105x(parcel, 9, this.f394625i, i);
        C143947c.m234083b(parcel, a);
    }
}
