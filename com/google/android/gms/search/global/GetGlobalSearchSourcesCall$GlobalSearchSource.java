package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetGlobalSearchSourcesCall$GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145902f();

    /* renamed from: a */
    public String f394449a;

    /* renamed from: b */
    public String f394450b;

    /* renamed from: c */
    public int f394451c;

    /* renamed from: d */
    public int f394452d;

    /* renamed from: e */
    public int f394453e;

    /* renamed from: f */
    public String f394454f;

    /* renamed from: g */
    public String f394455g;

    /* renamed from: h */
    public String f394456h;

    /* renamed from: i */
    public GetGlobalSearchSourcesCall$CorpusInfo[] f394457i;

    /* renamed from: j */
    public boolean f394458j;

    public GetGlobalSearchSourcesCall$GlobalSearchSource() {
    }

    public GetGlobalSearchSourcesCall$GlobalSearchSource(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr, boolean z) {
        this.f394449a = str;
        this.f394450b = str2;
        this.f394451c = i;
        this.f394452d = i2;
        this.f394453e = i3;
        this.f394454f = str3;
        this.f394455g = str4;
        this.f394456h = str5;
        this.f394457i = getGlobalSearchSourcesCall$CorpusInfoArr;
        this.f394458j = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394449a);
        C143947c.m234089h(parcel, 2, this.f394451c);
        C143947c.m234089h(parcel, 3, this.f394452d);
        C143947c.m234089h(parcel, 4, this.f394453e);
        C143947c.m234106y(parcel, 5, this.f394454f);
        C143947c.m234106y(parcel, 6, this.f394455g);
        C143947c.m234106y(parcel, 7, this.f394456h);
        C143947c.m234079B(parcel, 8, this.f394457i, i);
        C143947c.m234084c(parcel, 9, this.f394458j);
        C143947c.m234106y(parcel, 10, this.f394450b);
        C143947c.m234083b(parcel, a);
    }
}
