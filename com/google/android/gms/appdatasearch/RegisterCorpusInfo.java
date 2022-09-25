package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142790af();

    /* renamed from: a */
    public final String f387515a;

    /* renamed from: b */
    public final String f387516b;

    /* renamed from: c */
    public final Uri f387517c;

    /* renamed from: d */
    public final RegisterSectionInfo[] f387518d;

    /* renamed from: e */
    public final GlobalSearchCorpusConfig f387519e;

    /* renamed from: f */
    public final boolean f387520f;

    /* renamed from: g */
    public final Account f387521g;

    /* renamed from: h */
    public final RegisterCorpusIMEInfo f387522h;

    /* renamed from: i */
    public final String f387523i;
    @Deprecated

    /* renamed from: j */
    public final boolean f387524j;

    /* renamed from: k */
    public final int f387525k;

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i) {
        this.f387515a = str;
        this.f387516b = str2;
        this.f387517c = uri;
        this.f387518d = registerSectionInfoArr;
        this.f387519e = globalSearchCorpusConfig;
        this.f387520f = z;
        this.f387521g = account;
        this.f387522h = registerCorpusIMEInfo;
        this.f387523i = str3;
        this.f387524j = z2;
        this.f387525k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusInfo)) {
            return false;
        }
        RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
        return this.f387524j == registerCorpusInfo.f387524j && this.f387525k == registerCorpusInfo.f387525k && this.f387520f == registerCorpusInfo.f387520f && C143912ba.m233950b(this.f387515a, registerCorpusInfo.f387515a) && C143912ba.m233950b(this.f387516b, registerCorpusInfo.f387516b) && C143912ba.m233950b(this.f387517c, registerCorpusInfo.f387517c) && C143912ba.m233950b(this.f387519e, registerCorpusInfo.f387519e) && C143912ba.m233950b(this.f387522h, registerCorpusInfo.f387522h) && C143912ba.m233950b(this.f387521g, registerCorpusInfo.f387521g) && C143912ba.m233950b(this.f387523i, registerCorpusInfo.f387523i) && Arrays.equals(this.f387518d, registerCorpusInfo.f387518d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387515a, this.f387516b, this.f387517c, Integer.valueOf(Arrays.hashCode(this.f387518d)), this.f387519e, Boolean.valueOf(this.f387520f), this.f387521g, this.f387522h, this.f387523i, Boolean.valueOf(this.f387524j), Integer.valueOf(this.f387525k)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387515a);
        C143947c.m234106y(parcel, 2, this.f387516b);
        C143947c.m234105x(parcel, 3, this.f387517c, i);
        C143947c.m234079B(parcel, 4, this.f387518d, i);
        C143947c.m234105x(parcel, 7, this.f387519e, i);
        C143947c.m234084c(parcel, 8, this.f387520f);
        C143947c.m234105x(parcel, 9, this.f387521g, i);
        C143947c.m234105x(parcel, 10, this.f387522h, i);
        C143947c.m234106y(parcel, 11, this.f387523i);
        C143947c.m234084c(parcel, 12, this.f387524j);
        C143947c.m234089h(parcel, 13, this.f387525k);
        C143947c.m234083b(parcel, a);
    }
}
