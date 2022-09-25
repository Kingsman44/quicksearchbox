package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class UdcWriteLocalSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146073o();

    /* renamed from: a */
    SettingChange[] f394777a;

    /* compiled from: PG */
    public class SettingChange extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C146062d();

        /* renamed from: a */
        int f394778a;

        /* renamed from: b */
        boolean f394779b;

        public SettingChange(int i, boolean z) {
            this.f394778a = i;
            this.f394779b = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 2, this.f394778a);
            C143947c.m234084c(parcel, 3, this.f394779b);
            C143947c.m234083b(parcel, a);
        }
    }

    public UdcWriteLocalSettingsRequest(SettingChange[] settingChangeArr) {
        this.f394777a = settingChangeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 2, this.f394777a, i);
        C143947c.m234083b(parcel, a);
    }
}
