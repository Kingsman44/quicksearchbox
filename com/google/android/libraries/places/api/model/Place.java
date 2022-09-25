package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
public abstract class Place implements Parcelable {

    /* compiled from: PG */
    public enum BusinessStatus implements Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;
        
        public static final Parcelable.Creator CREATOR = null;

        static {
            CREATOR = new C31893z();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: PG */
    public enum Field implements Parcelable {
        ADDRESS,
        ADDRESS_COMPONENTS,
        BUSINESS_STATUS,
        ID,
        LAT_LNG,
        NAME,
        OPENING_HOURS,
        PHONE_NUMBER,
        PHOTO_METADATAS,
        PLUS_CODE,
        PRICE_LEVEL,
        RATING,
        TYPES,
        USER_RATINGS_TOTAL,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI,
        ICON_BACKGROUND_COLOR,
        ICON_URL;
        
        public static final Parcelable.Creator CREATOR = null;

        static {
            CREATOR = new C31866aa();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: PG */
    public enum Type implements Parcelable {
        OTHER,
        ACCOUNTING,
        ADMINISTRATIVE_AREA_LEVEL_1,
        ADMINISTRATIVE_AREA_LEVEL_2,
        ADMINISTRATIVE_AREA_LEVEL_3,
        ADMINISTRATIVE_AREA_LEVEL_4,
        ADMINISTRATIVE_AREA_LEVEL_5,
        AIRPORT,
        AMUSEMENT_PARK,
        AQUARIUM,
        ARCHIPELAGO,
        ART_GALLERY,
        ATM,
        BAKERY,
        BANK,
        BAR,
        BEAUTY_SALON,
        BICYCLE_STORE,
        BOOK_STORE,
        BOWLING_ALLEY,
        BUS_STATION,
        CAFE,
        CAMPGROUND,
        CAR_DEALER,
        CAR_RENTAL,
        CAR_REPAIR,
        CAR_WASH,
        CASINO,
        CEMETERY,
        CHURCH,
        CITY_HALL,
        CLOTHING_STORE,
        COLLOQUIAL_AREA,
        CONTINENT,
        CONVENIENCE_STORE,
        COUNTRY,
        COURTHOUSE,
        DENTIST,
        DEPARTMENT_STORE,
        DOCTOR,
        DRUGSTORE,
        ELECTRICIAN,
        ELECTRONICS_STORE,
        EMBASSY,
        ESTABLISHMENT,
        FINANCE,
        FIRE_STATION,
        FLOOR,
        FLORIST,
        FOOD,
        FUNERAL_HOME,
        FURNITURE_STORE,
        GAS_STATION,
        GENERAL_CONTRACTOR,
        GEOCODE,
        GROCERY_OR_SUPERMARKET,
        GYM,
        HAIR_CARE,
        HARDWARE_STORE,
        HEALTH,
        HINDU_TEMPLE,
        HOME_GOODS_STORE,
        HOSPITAL,
        INSURANCE_AGENCY,
        INTERSECTION,
        JEWELRY_STORE,
        LAUNDRY,
        LAWYER,
        LIBRARY,
        LIGHT_RAIL_STATION,
        LIQUOR_STORE,
        LOCAL_GOVERNMENT_OFFICE,
        LOCALITY,
        LOCKSMITH,
        LODGING,
        MEAL_DELIVERY,
        MEAL_TAKEAWAY,
        MOSQUE,
        MOVIE_RENTAL,
        MOVIE_THEATER,
        MOVING_COMPANY,
        MUSEUM,
        NATURAL_FEATURE,
        NEIGHBORHOOD,
        NIGHT_CLUB,
        PAINTER,
        PARK,
        PARKING,
        PET_STORE,
        PHARMACY,
        PHYSIOTHERAPIST,
        PLACE_OF_WORSHIP,
        PLUMBER,
        PLUS_CODE,
        POINT_OF_INTEREST,
        POLICE,
        POLITICAL,
        POST_BOX,
        POST_OFFICE,
        POSTAL_CODE_PREFIX,
        POSTAL_CODE_SUFFIX,
        POSTAL_CODE,
        POSTAL_TOWN,
        PREMISE,
        PRIMARY_SCHOOL,
        REAL_ESTATE_AGENCY,
        RESTAURANT,
        ROOFING_CONTRACTOR,
        ROOM,
        ROUTE,
        RV_PARK,
        SCHOOL,
        SECONDARY_SCHOOL,
        SHOE_STORE,
        SHOPPING_MALL,
        SPA,
        STADIUM,
        STORAGE,
        STORE,
        STREET_ADDRESS,
        STREET_NUMBER,
        SUBLOCALITY_LEVEL_1,
        SUBLOCALITY_LEVEL_2,
        SUBLOCALITY_LEVEL_3,
        SUBLOCALITY_LEVEL_4,
        SUBLOCALITY_LEVEL_5,
        SUBLOCALITY,
        SUBPREMISE,
        SUBWAY_STATION,
        SUPERMARKET,
        SYNAGOGUE,
        TAXI_STAND,
        TOURIST_ATTRACTION,
        TOWN_SQUARE,
        TRAIN_STATION,
        TRANSIT_STATION,
        TRAVEL_AGENCY,
        UNIVERSITY,
        VETERINARY_CARE,
        ZOO;
        
        public static final Parcelable.Creator CREATOR = null;

        static {
            CREATOR = new C31867ab();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* renamed from: a */
    public abstract Uri mo37502a();

    /* renamed from: b */
    public abstract LatLng mo37503b();

    /* renamed from: c */
    public abstract LatLngBounds mo37504c();

    /* renamed from: d */
    public abstract AddressComponents mo37505d();

    /* renamed from: e */
    public abstract OpeningHours mo37506e();

    /* renamed from: f */
    public abstract BusinessStatus mo37508f();

    /* renamed from: g */
    public abstract PlusCode mo37509g();

    /* renamed from: h */
    public abstract Double mo37510h();

    /* renamed from: i */
    public abstract Integer mo37512i();

    /* renamed from: j */
    public abstract Integer mo37513j();

    /* renamed from: k */
    public abstract Integer mo37514k();

    /* renamed from: l */
    public abstract Integer mo37515l();

    /* renamed from: m */
    public abstract String mo37516m();

    /* renamed from: n */
    public abstract String mo37517n();

    /* renamed from: o */
    public abstract String mo37518o();

    /* renamed from: p */
    public abstract String mo37519p();

    /* renamed from: q */
    public abstract String mo37520q();

    /* renamed from: r */
    public abstract List mo37521r();

    /* renamed from: s */
    public abstract List mo37522s();

    /* renamed from: t */
    public abstract List mo37523t();
}
