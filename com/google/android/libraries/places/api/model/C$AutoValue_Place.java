package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_Place  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Place extends Place {

    /* renamed from: a */
    public final String f85528a;

    /* renamed from: b */
    public final AddressComponents f85529b;

    /* renamed from: c */
    public final Place.BusinessStatus f85530c;

    /* renamed from: d */
    public final List f85531d;

    /* renamed from: e */
    public final String f85532e;

    /* renamed from: f */
    public final LatLng f85533f;

    /* renamed from: g */
    public final String f85534g;

    /* renamed from: h */
    public final OpeningHours f85535h;

    /* renamed from: i */
    public final String f85536i;

    /* renamed from: j */
    public final List f85537j;

    /* renamed from: k */
    public final PlusCode f85538k;

    /* renamed from: l */
    public final Integer f85539l;

    /* renamed from: m */
    public final Double f85540m;

    /* renamed from: n */
    public final List f85541n;

    /* renamed from: o */
    public final Integer f85542o;

    /* renamed from: p */
    public final Integer f85543p;

    /* renamed from: q */
    public final LatLngBounds f85544q;

    /* renamed from: r */
    public final Uri f85545r;

    /* renamed from: s */
    public final String f85546s;

    /* renamed from: t */
    public final Integer f85547t;

    public C$AutoValue_Place(String str, AddressComponents addressComponents, Place.BusinessStatus businessStatus, List list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List list2, PlusCode plusCode, Integer num, Double d, List list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri, String str5, Integer num4) {
        this.f85528a = str;
        this.f85529b = addressComponents;
        this.f85530c = businessStatus;
        this.f85531d = list;
        this.f85532e = str2;
        this.f85533f = latLng;
        this.f85534g = str3;
        this.f85535h = openingHours;
        this.f85536i = str4;
        this.f85537j = list2;
        this.f85538k = plusCode;
        this.f85539l = num;
        this.f85540m = d;
        this.f85541n = list3;
        this.f85542o = num2;
        this.f85543p = num3;
        this.f85544q = latLngBounds;
        this.f85545r = uri;
        this.f85546s = str5;
        this.f85547t = num4;
    }

    /* renamed from: a */
    public final Uri mo37502a() {
        return this.f85545r;
    }

    /* renamed from: b */
    public final LatLng mo37503b() {
        return this.f85533f;
    }

    /* renamed from: c */
    public final LatLngBounds mo37504c() {
        return this.f85544q;
    }

    /* renamed from: d */
    public final AddressComponents mo37505d() {
        return this.f85529b;
    }

    /* renamed from: e */
    public final OpeningHours mo37506e() {
        return this.f85535h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str = this.f85528a;
            if (str != null ? str.equals(place.mo37516m()) : place.mo37516m() == null) {
                AddressComponents addressComponents = this.f85529b;
                if (addressComponents != null ? addressComponents.equals(place.mo37505d()) : place.mo37505d() == null) {
                    Place.BusinessStatus businessStatus = this.f85530c;
                    if (businessStatus != null ? businessStatus.equals(place.mo37508f()) : place.mo37508f() == null) {
                        List list = this.f85531d;
                        if (list != null ? list.equals(place.mo37521r()) : place.mo37521r() == null) {
                            String str2 = this.f85532e;
                            if (str2 != null ? str2.equals(place.mo37518o()) : place.mo37518o() == null) {
                                LatLng latLng = this.f85533f;
                                if (latLng != null ? latLng.equals(place.mo37503b()) : place.mo37503b() == null) {
                                    String str3 = this.f85534g;
                                    if (str3 != null ? str3.equals(place.mo37519p()) : place.mo37519p() == null) {
                                        OpeningHours openingHours = this.f85535h;
                                        if (openingHours != null ? openingHours.equals(place.mo37506e()) : place.mo37506e() == null) {
                                            String str4 = this.f85536i;
                                            if (str4 != null ? str4.equals(place.mo37520q()) : place.mo37520q() == null) {
                                                List list2 = this.f85537j;
                                                if (list2 != null ? list2.equals(place.mo37522s()) : place.mo37522s() == null) {
                                                    PlusCode plusCode = this.f85538k;
                                                    if (plusCode != null ? plusCode.equals(place.mo37509g()) : place.mo37509g() == null) {
                                                        Integer num = this.f85539l;
                                                        if (num != null ? num.equals(place.mo37513j()) : place.mo37513j() == null) {
                                                            Double d = this.f85540m;
                                                            if (d != null ? d.equals(place.mo37510h()) : place.mo37510h() == null) {
                                                                List list3 = this.f85541n;
                                                                if (list3 != null ? list3.equals(place.mo37523t()) : place.mo37523t() == null) {
                                                                    Integer num2 = this.f85542o;
                                                                    if (num2 != null ? num2.equals(place.mo37514k()) : place.mo37514k() == null) {
                                                                        Integer num3 = this.f85543p;
                                                                        if (num3 != null ? num3.equals(place.mo37515l()) : place.mo37515l() == null) {
                                                                            LatLngBounds latLngBounds = this.f85544q;
                                                                            if (latLngBounds != null ? latLngBounds.equals(place.mo37504c()) : place.mo37504c() == null) {
                                                                                Uri uri = this.f85545r;
                                                                                if (uri != null ? uri.equals(place.mo37502a()) : place.mo37502a() == null) {
                                                                                    String str5 = this.f85546s;
                                                                                    if (str5 != null ? str5.equals(place.mo37517n()) : place.mo37517n() == null) {
                                                                                        Integer num4 = this.f85547t;
                                                                                        if (num4 != null ? num4.equals(place.mo37512i()) : place.mo37512i() == null) {
                                                                                            return true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Place.BusinessStatus mo37508f() {
        return this.f85530c;
    }

    /* renamed from: g */
    public final PlusCode mo37509g() {
        return this.f85538k;
    }

    /* renamed from: h */
    public final Double mo37510h() {
        return this.f85540m;
    }

    /* renamed from: i */
    public final Integer mo37512i() {
        return this.f85547t;
    }

    /* renamed from: j */
    public final Integer mo37513j() {
        return this.f85539l;
    }

    /* renamed from: k */
    public final Integer mo37514k() {
        return this.f85542o;
    }

    /* renamed from: l */
    public final Integer mo37515l() {
        return this.f85543p;
    }

    /* renamed from: m */
    public final String mo37516m() {
        return this.f85528a;
    }

    /* renamed from: n */
    public final String mo37517n() {
        return this.f85546s;
    }

    /* renamed from: o */
    public final String mo37518o() {
        return this.f85532e;
    }

    /* renamed from: p */
    public final String mo37519p() {
        return this.f85534g;
    }

    /* renamed from: q */
    public final String mo37520q() {
        return this.f85536i;
    }

    /* renamed from: r */
    public final List mo37521r() {
        return this.f85531d;
    }

    /* renamed from: s */
    public final List mo37522s() {
        return this.f85537j;
    }

    /* renamed from: t */
    public final List mo37523t() {
        return this.f85541n;
    }

    public final String toString() {
        String str = this.f85528a;
        String valueOf = String.valueOf(this.f85529b);
        String valueOf2 = String.valueOf(this.f85530c);
        String valueOf3 = String.valueOf(this.f85531d);
        String str2 = this.f85532e;
        String valueOf4 = String.valueOf(this.f85533f);
        String str3 = this.f85534g;
        String valueOf5 = String.valueOf(this.f85535h);
        String str4 = this.f85536i;
        String valueOf6 = String.valueOf(this.f85537j);
        String valueOf7 = String.valueOf(this.f85538k);
        Integer num = this.f85539l;
        Double d = this.f85540m;
        String valueOf8 = String.valueOf(this.f85541n);
        Integer num2 = this.f85542o;
        Integer num3 = this.f85543p;
        String valueOf9 = String.valueOf(this.f85544q);
        String valueOf10 = String.valueOf(this.f85545r);
        String str5 = this.f85546s;
        return "Place{address=" + str + ", addressComponents=" + valueOf + ", businessStatus=" + valueOf2 + ", attributions=" + valueOf3 + ", id=" + str2 + ", latLng=" + valueOf4 + ", name=" + str3 + ", openingHours=" + valueOf5 + ", phoneNumber=" + str4 + ", photoMetadatas=" + valueOf6 + ", plusCode=" + valueOf7 + ", priceLevel=" + num + ", rating=" + d + ", types=" + valueOf8 + ", userRatingsTotal=" + num2 + ", utcOffsetMinutes=" + num3 + ", viewport=" + valueOf9 + ", websiteUri=" + valueOf10 + ", iconUrl=" + str5 + ", iconBackgroundColor=" + this.f85547t + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f85528a;
        int i5 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        AddressComponents addressComponents = this.f85529b;
        int hashCode2 = (hashCode ^ (addressComponents == null ? 0 : addressComponents.hashCode())) * 1000003;
        Place.BusinessStatus businessStatus = this.f85530c;
        int hashCode3 = (hashCode2 ^ (businessStatus == null ? 0 : businessStatus.hashCode())) * 1000003;
        List list = this.f85531d;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        String str2 = this.f85532e;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LatLng latLng = this.f85533f;
        int hashCode6 = (hashCode5 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        String str3 = this.f85534g;
        int hashCode7 = (hashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        OpeningHours openingHours = this.f85535h;
        int hashCode8 = (hashCode7 ^ (openingHours == null ? 0 : openingHours.hashCode())) * 1000003;
        String str4 = this.f85536i;
        int hashCode9 = (hashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        List list2 = this.f85537j;
        int hashCode10 = (hashCode9 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PlusCode plusCode = this.f85538k;
        int hashCode11 = (hashCode10 ^ (plusCode == null ? 0 : plusCode.hashCode())) * 1000003;
        Integer num = this.f85539l;
        int hashCode12 = (hashCode11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Double d = this.f85540m;
        int hashCode13 = (hashCode12 ^ (d == null ? 0 : d.hashCode())) * 1000003;
        List list3 = this.f85541n;
        int hashCode14 = (hashCode13 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        Integer num2 = this.f85542o;
        int hashCode15 = (hashCode14 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.f85543p;
        if (num3 == null) {
            i = 0;
        } else {
            i = num3.hashCode();
        }
        int i6 = (hashCode15 ^ i) * 1000003;
        LatLngBounds latLngBounds = this.f85544q;
        if (latLngBounds == null) {
            i2 = 0;
        } else {
            i2 = latLngBounds.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        Uri uri = this.f85545r;
        if (uri == null) {
            i3 = 0;
        } else {
            i3 = uri.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str5 = this.f85546s;
        if (str5 == null) {
            i4 = 0;
        } else {
            i4 = str5.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        Integer num4 = this.f85547t;
        if (num4 != null) {
            i5 = num4.hashCode();
        }
        return i9 ^ i5;
    }
}
