package com.google.android.libraries.places.widget.internal.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.widget.internal.common.AutocompleteActivityOrigin;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.base.C58837ba;

/* compiled from: PG */
public class AutocompleteWidgetSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C31923a();

    /* renamed from: a */
    public final AutocompleteActivityOrigin f85847a;

    /* renamed from: b */
    public final AutocompleteActivityMode f85848b;

    /* renamed from: c */
    public final AutocompleteSessionToken f85849c;

    /* renamed from: d */
    public boolean f85850d;

    /* renamed from: e */
    public boolean f85851e;

    /* renamed from: f */
    public int f85852f;

    /* renamed from: g */
    public int f85853g;

    /* renamed from: h */
    public int f85854h;

    /* renamed from: i */
    public int f85855i;

    /* renamed from: j */
    public boolean f85856j;

    /* renamed from: k */
    public boolean f85857k;

    /* renamed from: l */
    public String f85858l;

    /* renamed from: m */
    public int f85859m;

    /* renamed from: n */
    public int f85860n;

    /* renamed from: o */
    public boolean f85861o;

    /* renamed from: p */
    public int f85862p;

    /* renamed from: q */
    public long f85863q;

    /* renamed from: r */
    public final C21370a f85864r;

    public AutocompleteWidgetSession(Parcel parcel) {
        this.f85847a = (AutocompleteActivityOrigin) parcel.readParcelable(AutocompleteActivityOrigin.class.getClassLoader());
        this.f85848b = (AutocompleteActivityMode) parcel.readParcelable(AutocompleteActivityMode.class.getClassLoader());
        this.f85849c = (AutocompleteSessionToken) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader());
        this.f85856j = m59488b(parcel);
        this.f85850d = m59488b(parcel);
        this.f85851e = m59488b(parcel);
        this.f85855i = parcel.readInt();
        this.f85852f = parcel.readInt();
        this.f85853g = parcel.readInt();
        this.f85857k = m59488b(parcel);
        this.f85854h = parcel.readInt();
        this.f85858l = C58837ba.m90858g(parcel.readString());
        this.f85859m = parcel.readInt();
        this.f85860n = parcel.readInt();
        this.f85861o = m59488b(parcel);
        this.f85862p = parcel.readInt();
        this.f85863q = parcel.readLong();
        this.f85864r = new C21375e();
    }

    /* renamed from: b */
    private static boolean m59488b(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public final boolean mo37689a() {
        return this.f85863q != -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f85847a, i);
        parcel.writeParcelable(this.f85848b, i);
        parcel.writeParcelable(this.f85849c, i);
        parcel.writeInt(this.f85856j ? 1 : 0);
        parcel.writeInt(this.f85850d ? 1 : 0);
        parcel.writeInt(this.f85851e ? 1 : 0);
        parcel.writeInt(this.f85855i);
        parcel.writeInt(this.f85852f);
        parcel.writeInt(this.f85853g);
        parcel.writeInt(this.f85857k ? 1 : 0);
        parcel.writeInt(this.f85854h);
        parcel.writeString(this.f85858l);
        parcel.writeInt(this.f85859m);
        parcel.writeInt(this.f85860n);
        parcel.writeInt(this.f85861o ? 1 : 0);
        parcel.writeInt(this.f85862p);
        parcel.writeLong(this.f85863q);
    }

    public AutocompleteWidgetSession(AutocompleteActivityOrigin autocompleteActivityOrigin, AutocompleteActivityMode autocompleteActivityMode, String str, C21370a aVar) {
        this.f85847a = autocompleteActivityOrigin;
        this.f85848b = autocompleteActivityMode;
        this.f85849c = AutocompleteSessionToken.m59347b();
        this.f85858l = C58837ba.m90858g(str);
        this.f85855i = -1;
        this.f85863q = -1;
        this.f85864r = aVar;
    }
}
