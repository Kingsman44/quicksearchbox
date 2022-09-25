package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class GlobalSearchApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142823t();

    /* renamed from: a */
    public final GlobalSearchApplicationInfo f387458a;

    /* renamed from: b */
    public final GlobalSearchAppCorpusFeatures[] f387459b;

    /* renamed from: c */
    public final boolean f387460c;

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr, boolean z) {
        this.f387458a = globalSearchApplicationInfo;
        this.f387459b = globalSearchAppCorpusFeaturesArr;
        this.f387460c = z;
    }

    /* renamed from: a */
    public final Set mo117632a() {
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = this.f387459b;
        if (globalSearchAppCorpusFeaturesArr == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(globalSearchAppCorpusFeaturesArr.length);
        int i = 0;
        while (true) {
            GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr2 = this.f387459b;
            if (i >= globalSearchAppCorpusFeaturesArr2.length) {
                return hashSet;
            }
            hashSet.add(globalSearchAppCorpusFeaturesArr2[i].f387456a);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchApplication) {
            GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) obj;
            if (!C143912ba.m233950b(this.f387458a, globalSearchApplication.f387458a) || !C143912ba.m233950b(Boolean.valueOf(this.f387460c), Boolean.valueOf(globalSearchApplication.f387460c)) || !Arrays.equals(this.f387459b, globalSearchApplication.f387459b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387458a, Boolean.valueOf(this.f387460c), Integer.valueOf(Arrays.hashCode(this.f387459b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387458a, i);
        C143947c.m234079B(parcel, 2, this.f387459b, i);
        C143947c.m234084c(parcel, 3, this.f387460c);
        C143947c.m234083b(parcel, a);
    }
}
