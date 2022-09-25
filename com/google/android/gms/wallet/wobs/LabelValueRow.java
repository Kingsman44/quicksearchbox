package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146387c();
    @Deprecated

    /* renamed from: a */
    String f395438a;
    @Deprecated

    /* renamed from: b */
    String f395439b;

    /* renamed from: c */
    ArrayList f395440c;

    LabelValueRow() {
        this.f395440c = new ArrayList();
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.f395438a = str;
        this.f395439b = str2;
        this.f395440c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395438a);
        C143947c.m234106y(parcel, 3, this.f395439b);
        C143947c.m234080C(parcel, 4, this.f395440c);
        C143947c.m234083b(parcel, a);
    }
}
