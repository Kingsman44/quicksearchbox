package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class CategoryInfoEntity extends AbstractSafeParcelable implements CategoryInfo {
    public static final Parcelable.Creator CREATOR = new C145830b();

    /* renamed from: a */
    public final String f394253a;

    /* renamed from: b */
    public final String f394254b;

    /* renamed from: c */
    public final List f394255c;

    public CategoryInfoEntity(CategoryInfo categoryInfo) {
        this(categoryInfo.mo121978h(), categoryInfo.mo121980j(), categoryInfo.mo121979i());
    }

    /* renamed from: b */
    public static int m237314b(CategoryInfo categoryInfo) {
        return Arrays.hashCode(new Object[]{categoryInfo.mo121978h(), categoryInfo.mo121980j(), categoryInfo.mo121979i()});
    }

    /* renamed from: c */
    public static boolean m237315c(CategoryInfo categoryInfo, CategoryInfo categoryInfo2) {
        return C143912ba.m233950b(categoryInfo.mo121978h(), categoryInfo2.mo121978h()) && C143912ba.m233950b(categoryInfo.mo121980j(), categoryInfo2.mo121980j()) && C143912ba.m233950b(categoryInfo.mo121979i(), categoryInfo2.mo121979i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237315c(this, (CategoryInfo) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final String mo121978h() {
        return this.f394253a;
    }

    public final int hashCode() {
        return m237314b(this);
    }

    /* renamed from: i */
    public final String mo121979i() {
        return this.f394254b;
    }

    /* renamed from: j */
    public final List mo121980j() {
        return this.f394255c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145830b.m237575a(this, parcel);
    }

    public CategoryInfoEntity(String str, List list, String str2) {
        ArrayList arrayList = new ArrayList();
        this.f394255c = arrayList;
        this.f394253a = str;
        this.f394254b = str2;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
