package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class LocationGroupEntity extends AbstractSafeParcelable implements LocationGroup {
    public static final Parcelable.Creator CREATOR = new C145840l();

    /* renamed from: a */
    public final String f394283a;

    /* renamed from: b */
    public final Integer f394284b;

    /* renamed from: c */
    public final ChainInfoEntity f394285c;

    /* renamed from: d */
    public final CategoryInfoEntity f394286d;

    public LocationGroupEntity(LocationGroup locationGroup) {
        this(locationGroup.mo122014k(), locationGroup.mo122013j(), locationGroup.mo122012i(), locationGroup.mo122011h(), false);
    }

    public LocationGroupEntity(String str, Integer num, ChainInfoEntity chainInfoEntity, CategoryInfoEntity categoryInfoEntity) {
        this.f394283a = str;
        this.f394284b = num;
        this.f394285c = chainInfoEntity;
        this.f394286d = categoryInfoEntity;
    }

    /* renamed from: b */
    public static int m237403b(LocationGroup locationGroup) {
        return Arrays.hashCode(new Object[]{locationGroup.mo122014k(), locationGroup.mo122013j(), locationGroup.mo122012i(), locationGroup.mo122011h()});
    }

    /* renamed from: c */
    public static boolean m237404c(LocationGroup locationGroup, LocationGroup locationGroup2) {
        return C143912ba.m233950b(locationGroup.mo122014k(), locationGroup2.mo122014k()) && C143912ba.m233950b(locationGroup.mo122013j(), locationGroup2.mo122013j()) && C143912ba.m233950b(locationGroup.mo122012i(), locationGroup2.mo122012i()) && C143912ba.m233950b(locationGroup.mo122011h(), locationGroup2.mo122011h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationGroup)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237404c(this, (LocationGroup) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final CategoryInfo mo122011h() {
        return this.f394286d;
    }

    public final int hashCode() {
        return m237403b(this);
    }

    /* renamed from: i */
    public final ChainInfo mo122012i() {
        return this.f394285c;
    }

    /* renamed from: j */
    public final Integer mo122013j() {
        return this.f394284b;
    }

    /* renamed from: k */
    public final String mo122014k() {
        return this.f394283a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145840l.m237587a(this, parcel, i);
    }

    public LocationGroupEntity(String str, Integer num, ChainInfo chainInfo, CategoryInfo categoryInfo, boolean z) {
        ChainInfoEntity chainInfoEntity;
        this.f394283a = str;
        this.f394284b = num;
        if (z) {
            this.f394285c = (ChainInfoEntity) chainInfo;
            this.f394286d = (CategoryInfoEntity) categoryInfo;
            return;
        }
        CategoryInfoEntity categoryInfoEntity = null;
        if (chainInfo == null) {
            chainInfoEntity = null;
        } else {
            chainInfoEntity = new ChainInfoEntity(chainInfo);
        }
        this.f394285c = chainInfoEntity;
        this.f394286d = categoryInfo != null ? new CategoryInfoEntity(categoryInfo) : categoryInfoEntity;
    }
}
