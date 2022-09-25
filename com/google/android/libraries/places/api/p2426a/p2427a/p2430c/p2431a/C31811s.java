package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutoValue_LocalTime;
import com.google.android.libraries.places.api.model.AutoValue_TimeOfWeek;
import com.google.android.libraries.places.api.model.DayOfWeek;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31813u;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.s */
/* compiled from: PG */
public final class C31811s {

    /* renamed from: a */
    public static final /* synthetic */ int f85435a = 0;

    /* renamed from: b */
    private static final C58495hd f85436b;

    /* renamed from: c */
    private static final C58495hd f85437c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("OPERATIONAL", Place.BusinessStatus.OPERATIONAL);
        gzVar.mo55429h("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY);
        gzVar.mo55429h("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY);
        f85436b = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("accounting", Place.Type.ACCOUNTING);
        gzVar2.mo55429h("administrative_area_level_1", Place.Type.ADMINISTRATIVE_AREA_LEVEL_1);
        gzVar2.mo55429h("administrative_area_level_2", Place.Type.ADMINISTRATIVE_AREA_LEVEL_2);
        gzVar2.mo55429h("administrative_area_level_3", Place.Type.ADMINISTRATIVE_AREA_LEVEL_3);
        gzVar2.mo55429h("administrative_area_level_4", Place.Type.ADMINISTRATIVE_AREA_LEVEL_4);
        gzVar2.mo55429h("administrative_area_level_5", Place.Type.ADMINISTRATIVE_AREA_LEVEL_5);
        gzVar2.mo55429h("airport", Place.Type.AIRPORT);
        gzVar2.mo55429h("amusement_park", Place.Type.AMUSEMENT_PARK);
        gzVar2.mo55429h("aquarium", Place.Type.AQUARIUM);
        gzVar2.mo55429h("archipelago", Place.Type.ARCHIPELAGO);
        gzVar2.mo55429h("art_gallery", Place.Type.ART_GALLERY);
        gzVar2.mo55429h("atm", Place.Type.ATM);
        gzVar2.mo55429h("bakery", Place.Type.BAKERY);
        gzVar2.mo55429h("bank", Place.Type.BANK);
        gzVar2.mo55429h("bar", Place.Type.BAR);
        gzVar2.mo55429h("beauty_salon", Place.Type.BEAUTY_SALON);
        gzVar2.mo55429h("bicycle_store", Place.Type.BICYCLE_STORE);
        gzVar2.mo55429h("book_store", Place.Type.BOOK_STORE);
        gzVar2.mo55429h("bowling_alley", Place.Type.BOWLING_ALLEY);
        gzVar2.mo55429h("bus_station", Place.Type.BUS_STATION);
        gzVar2.mo55429h("cafe", Place.Type.CAFE);
        gzVar2.mo55429h("campground", Place.Type.CAMPGROUND);
        gzVar2.mo55429h("car_dealer", Place.Type.CAR_DEALER);
        gzVar2.mo55429h("car_rental", Place.Type.CAR_RENTAL);
        gzVar2.mo55429h("car_repair", Place.Type.CAR_REPAIR);
        gzVar2.mo55429h("car_wash", Place.Type.CAR_WASH);
        gzVar2.mo55429h("casino", Place.Type.CASINO);
        gzVar2.mo55429h("cemetery", Place.Type.CEMETERY);
        gzVar2.mo55429h("church", Place.Type.CHURCH);
        gzVar2.mo55429h("city_hall", Place.Type.CITY_HALL);
        gzVar2.mo55429h("clothing_store", Place.Type.CLOTHING_STORE);
        gzVar2.mo55429h("colloquial_area", Place.Type.COLLOQUIAL_AREA);
        gzVar2.mo55429h("continent", Place.Type.CONTINENT);
        gzVar2.mo55429h("convenience_store", Place.Type.CONVENIENCE_STORE);
        gzVar2.mo55429h("country", Place.Type.COUNTRY);
        gzVar2.mo55429h("courthouse", Place.Type.COURTHOUSE);
        gzVar2.mo55429h("dentist", Place.Type.DENTIST);
        gzVar2.mo55429h("department_store", Place.Type.DEPARTMENT_STORE);
        gzVar2.mo55429h("doctor", Place.Type.DOCTOR);
        gzVar2.mo55429h("drugstore", Place.Type.DRUGSTORE);
        gzVar2.mo55429h("electrician", Place.Type.ELECTRICIAN);
        gzVar2.mo55429h("electronics_store", Place.Type.ELECTRONICS_STORE);
        gzVar2.mo55429h("embassy", Place.Type.EMBASSY);
        gzVar2.mo55429h("establishment", Place.Type.ESTABLISHMENT);
        gzVar2.mo55429h("finance", Place.Type.FINANCE);
        gzVar2.mo55429h("fire_station", Place.Type.FIRE_STATION);
        gzVar2.mo55429h("floor", Place.Type.FLOOR);
        gzVar2.mo55429h("florist", Place.Type.FLORIST);
        gzVar2.mo55429h("food", Place.Type.FOOD);
        gzVar2.mo55429h("funeral_home", Place.Type.FUNERAL_HOME);
        gzVar2.mo55429h("furniture_store", Place.Type.FURNITURE_STORE);
        gzVar2.mo55429h("gas_station", Place.Type.GAS_STATION);
        gzVar2.mo55429h("general_contractor", Place.Type.GENERAL_CONTRACTOR);
        gzVar2.mo55429h("geocode", Place.Type.GEOCODE);
        gzVar2.mo55429h("grocery_or_supermarket", Place.Type.GROCERY_OR_SUPERMARKET);
        gzVar2.mo55429h("gym", Place.Type.GYM);
        gzVar2.mo55429h("hair_care", Place.Type.HAIR_CARE);
        gzVar2.mo55429h("hardware_store", Place.Type.HARDWARE_STORE);
        gzVar2.mo55429h("health", Place.Type.HEALTH);
        gzVar2.mo55429h("hindu_temple", Place.Type.HINDU_TEMPLE);
        gzVar2.mo55429h("home_goods_store", Place.Type.HOME_GOODS_STORE);
        gzVar2.mo55429h("hospital", Place.Type.HOSPITAL);
        gzVar2.mo55429h("insurance_agency", Place.Type.INSURANCE_AGENCY);
        gzVar2.mo55429h("intersection", Place.Type.INTERSECTION);
        gzVar2.mo55429h("jewelry_store", Place.Type.JEWELRY_STORE);
        gzVar2.mo55429h("laundry", Place.Type.LAUNDRY);
        gzVar2.mo55429h("lawyer", Place.Type.LAWYER);
        gzVar2.mo55429h("library", Place.Type.LIBRARY);
        gzVar2.mo55429h("light_rail_station", Place.Type.LIGHT_RAIL_STATION);
        gzVar2.mo55429h("liquor_store", Place.Type.LIQUOR_STORE);
        gzVar2.mo55429h("local_government_office", Place.Type.LOCAL_GOVERNMENT_OFFICE);
        gzVar2.mo55429h("locality", Place.Type.LOCALITY);
        gzVar2.mo55429h("locksmith", Place.Type.LOCKSMITH);
        gzVar2.mo55429h("lodging", Place.Type.LODGING);
        gzVar2.mo55429h("meal_delivery", Place.Type.MEAL_DELIVERY);
        gzVar2.mo55429h("meal_takeaway", Place.Type.MEAL_TAKEAWAY);
        gzVar2.mo55429h("mosque", Place.Type.MOSQUE);
        gzVar2.mo55429h("movie_rental", Place.Type.MOVIE_RENTAL);
        gzVar2.mo55429h("movie_theater", Place.Type.MOVIE_THEATER);
        gzVar2.mo55429h("moving_company", Place.Type.MOVING_COMPANY);
        gzVar2.mo55429h("museum", Place.Type.MUSEUM);
        gzVar2.mo55429h("natural_feature", Place.Type.NATURAL_FEATURE);
        gzVar2.mo55429h("neighborhood", Place.Type.NEIGHBORHOOD);
        gzVar2.mo55429h("night_club", Place.Type.NIGHT_CLUB);
        gzVar2.mo55429h("painter", Place.Type.PAINTER);
        gzVar2.mo55429h("park", Place.Type.PARK);
        gzVar2.mo55429h("parking", Place.Type.PARKING);
        gzVar2.mo55429h("pet_store", Place.Type.PET_STORE);
        gzVar2.mo55429h("pharmacy", Place.Type.PHARMACY);
        gzVar2.mo55429h("physiotherapist", Place.Type.PHYSIOTHERAPIST);
        gzVar2.mo55429h("place_of_worship", Place.Type.PLACE_OF_WORSHIP);
        gzVar2.mo55429h("plumber", Place.Type.PLUMBER);
        gzVar2.mo55429h("plus_code", Place.Type.PLUS_CODE);
        gzVar2.mo55429h("point_of_interest", Place.Type.POINT_OF_INTEREST);
        gzVar2.mo55429h("police", Place.Type.POLICE);
        gzVar2.mo55429h("political", Place.Type.POLITICAL);
        gzVar2.mo55429h("post_box", Place.Type.POST_BOX);
        gzVar2.mo55429h("post_office", Place.Type.POST_OFFICE);
        gzVar2.mo55429h("postal_code_prefix", Place.Type.POSTAL_CODE_PREFIX);
        gzVar2.mo55429h("postal_code_suffix", Place.Type.POSTAL_CODE_SUFFIX);
        gzVar2.mo55429h("postal_code", Place.Type.POSTAL_CODE);
        gzVar2.mo55429h("postal_town", Place.Type.POSTAL_TOWN);
        gzVar2.mo55429h("premise", Place.Type.PREMISE);
        gzVar2.mo55429h("primary_school", Place.Type.PRIMARY_SCHOOL);
        gzVar2.mo55429h("real_estate_agency", Place.Type.REAL_ESTATE_AGENCY);
        gzVar2.mo55429h("restaurant", Place.Type.RESTAURANT);
        gzVar2.mo55429h("roofing_contractor", Place.Type.ROOFING_CONTRACTOR);
        gzVar2.mo55429h("room", Place.Type.ROOM);
        gzVar2.mo55429h("route", Place.Type.ROUTE);
        gzVar2.mo55429h("rv_park", Place.Type.RV_PARK);
        gzVar2.mo55429h("school", Place.Type.SCHOOL);
        gzVar2.mo55429h("secondary_school", Place.Type.SECONDARY_SCHOOL);
        gzVar2.mo55429h("shoe_store", Place.Type.SHOE_STORE);
        gzVar2.mo55429h("shopping_mall", Place.Type.SHOPPING_MALL);
        gzVar2.mo55429h("spa", Place.Type.SPA);
        gzVar2.mo55429h("stadium", Place.Type.STADIUM);
        gzVar2.mo55429h("storage", Place.Type.STORAGE);
        gzVar2.mo55429h("store", Place.Type.STORE);
        gzVar2.mo55429h("street_address", Place.Type.STREET_ADDRESS);
        gzVar2.mo55429h("street_number", Place.Type.STREET_NUMBER);
        gzVar2.mo55429h("sublocality_level_1", Place.Type.SUBLOCALITY_LEVEL_1);
        gzVar2.mo55429h("sublocality_level_2", Place.Type.SUBLOCALITY_LEVEL_2);
        gzVar2.mo55429h("sublocality_level_3", Place.Type.SUBLOCALITY_LEVEL_3);
        gzVar2.mo55429h("sublocality_level_4", Place.Type.SUBLOCALITY_LEVEL_4);
        gzVar2.mo55429h("sublocality_level_5", Place.Type.SUBLOCALITY_LEVEL_5);
        gzVar2.mo55429h("sublocality", Place.Type.SUBLOCALITY);
        gzVar2.mo55429h("subpremise", Place.Type.SUBPREMISE);
        gzVar2.mo55429h("subway_station", Place.Type.SUBWAY_STATION);
        gzVar2.mo55429h("supermarket", Place.Type.SUPERMARKET);
        gzVar2.mo55429h("synagogue", Place.Type.SYNAGOGUE);
        gzVar2.mo55429h("taxi_stand", Place.Type.TAXI_STAND);
        gzVar2.mo55429h("tourist_attraction", Place.Type.TOURIST_ATTRACTION);
        gzVar2.mo55429h("town_square", Place.Type.TOWN_SQUARE);
        gzVar2.mo55429h("train_station", Place.Type.TRAIN_STATION);
        gzVar2.mo55429h("transit_station", Place.Type.TRANSIT_STATION);
        gzVar2.mo55429h("travel_agency", Place.Type.TRAVEL_AGENCY);
        gzVar2.mo55429h("university", Place.Type.UNIVERSITY);
        gzVar2.mo55429h("veterinary_care", Place.Type.VETERINARY_CARE);
        gzVar2.mo55429h("zoo", Place.Type.ZOO);
        f85437c = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    static List m59177a(List list) {
        return list != null ? list : new ArrayList();
    }

    /* renamed from: b */
    static List m59178b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            String str = (String) G.next();
            C58495hd hdVar = f85437c;
            if (hdVar.containsKey(str)) {
                arrayList.add((Place.Type) hdVar.get(str));
            } else {
                z = true;
            }
        }
        if (z) {
            arrayList.add(Place.Type.OTHER);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [com.google.android.libraries.places.api.model.$AutoValue_PhotoMetadata, com.google.android.libraries.places.api.model.AutoValue_PhotoMetadata] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0135  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final com.google.android.libraries.places.api.model.Place m59179c(com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31813u r17, java.util.List r18) {
        /*
            r0 = r17
            com.google.android.libraries.places.api.model.e r1 = new com.google.android.libraries.places.api.model.e
            r1.<init>()
            r2 = r18
            r1.f85757d = r2
            if (r0 == 0) goto L_0x032c
            com.google.android.libraries.places.api.a.a.c.a.u$a[] r2 = r0.addressComponents
            r3 = 0
            if (r2 == 0) goto L_0x0017
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89844l(r2)
            goto L_0x0018
        L_0x0017:
            r2 = r3
        L_0x0018:
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x001f
            r2 = r3
            goto L_0x00bb
        L_0x001f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.google.common.b.sm r2 = r2.listIterator(r5)
        L_0x0028:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r2.next()
            com.google.android.libraries.places.api.a.a.c.a.u$a r7 = (com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31813u.C31814a) r7
            if (r7 != 0) goto L_0x0038
            r7 = r3
            goto L_0x0094
        L_0x0038:
            java.lang.String r8 = r7.longName     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r8.getClass()
            java.lang.String[] r9 = r7.types     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            if (r9 == 0) goto L_0x0046
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89844l(r9)     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            goto L_0x0047
        L_0x0046:
            r9 = r3
        L_0x0047:
            r9.getClass()
            com.google.android.libraries.places.api.model.a r10 = new com.google.android.libraries.places.api.model.a     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r10.<init>()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r10.f85735a = r8     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r10.f85737c = r9     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            java.lang.String r7 = r7.shortName     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r10.f85736b = r7     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            com.google.android.libraries.places.api.model.AddressComponent r7 = r10.mo37587a()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            java.lang.String r8 = r7.mo37450a()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            boolean r8 = r8.isEmpty()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r8 = r8 ^ r4
            java.lang.String r9 = "Name must not be empty."
            com.google.common.base.C58838bb.m90884s(r8, r9)     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            java.util.List r7 = r7.mo37452c()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
        L_0x0071:
            boolean r9 = r8.hasNext()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            if (r9 == 0) goto L_0x0088
            java.lang.Object r9 = r8.next()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            r9 = r9 ^ r4
            java.lang.String r11 = "Types must not contain null or empty values."
            com.google.common.base.C58838bb.m90884s(r9, r11)     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            goto L_0x0071
        L_0x0088:
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89842j(r7)     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            if (r7 == 0) goto L_0x0098
            r10.f85737c = r7     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            com.google.android.libraries.places.api.model.AddressComponent r7 = r10.mo37587a()     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
        L_0x0094:
            m59183g(r6, r7)
            goto L_0x0028
        L_0x0098:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            java.lang.String r1 = "Null types"
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
            throw r0     // Catch:{ IllegalStateException -> 0x00a2, NullPointerException -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            goto L_0x00a3
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r1[r5] = r0
            java.lang.String r0 = "AddressComponent not properly defined (%s)."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.google.android.gms.common.api.n r0 = m59180d(r0)
            throw r0
        L_0x00b6:
            com.google.android.libraries.places.api.model.AutoValue_AddressComponents r2 = new com.google.android.libraries.places.api.model.AutoValue_AddressComponents
            r2.<init>(r6)
        L_0x00bb:
            com.google.android.libraries.places.api.a.a.c.a.u$b r6 = r0.geometry
            if (r6 == 0) goto L_0x00e2
            com.google.android.libraries.places.api.a.a.c.a.u$b$a r7 = r6.location
            com.google.android.gms.maps.model.LatLng r7 = m59181e(r7)
            com.google.android.libraries.places.api.a.a.c.a.u$b$b r6 = r6.viewport
            if (r6 != 0) goto L_0x00cb
        L_0x00c9:
            r9 = r3
            goto L_0x00e4
        L_0x00cb:
            com.google.android.libraries.places.api.a.a.c.a.u$b$a r8 = r6.southwest
            com.google.android.gms.maps.model.LatLng r8 = m59181e(r8)
            com.google.android.libraries.places.api.a.a.c.a.u$b$a r6 = r6.northeast
            com.google.android.gms.maps.model.LatLng r6 = m59181e(r6)
            if (r8 == 0) goto L_0x00c9
            if (r6 != 0) goto L_0x00dc
            goto L_0x00c9
        L_0x00dc:
            com.google.android.gms.maps.model.LatLngBounds r9 = new com.google.android.gms.maps.model.LatLngBounds
            r9.<init>(r8, r6)
            goto L_0x00e4
        L_0x00e2:
            r7 = r3
            r9 = r7
        L_0x00e4:
            java.lang.String r6 = r0.website
            if (r6 == 0) goto L_0x00ed
            android.net.Uri r6 = android.net.Uri.parse(r6)
            goto L_0x00ee
        L_0x00ed:
            r6 = r3
        L_0x00ee:
            java.lang.String r8 = r0.iconMaskBaseUri
            if (r8 == 0) goto L_0x00f9
            java.lang.String r10 = ".png"
            java.lang.String r8 = r8.concat(r10)
            goto L_0x00fa
        L_0x00f9:
            r8 = r3
        L_0x00fa:
            java.lang.String r10 = r0.iconBackgroundColor
            if (r10 == 0) goto L_0x0108
            int r10 = android.graphics.Color.parseColor(r10)     // Catch:{ IllegalArgumentException -> 0x0107 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x0107 }
            goto L_0x0109
        L_0x0107:
        L_0x0108:
            r10 = r3
        L_0x0109:
            java.lang.String r11 = r0.formattedAddress
            r1.f85754a = r11
            r1.f85755b = r2
            java.lang.String r2 = r0.businessStatus
            com.google.common.b.hd r11 = f85436b
            java.lang.Object r2 = r11.getOrDefault(r2, r3)
            com.google.android.libraries.places.api.model.Place$BusinessStatus r2 = (com.google.android.libraries.places.api.model.Place.BusinessStatus) r2
            r1.f85756c = r2
            java.lang.String r2 = r0.placeId
            r1.f85758e = r2
            r1.f85759f = r7
            java.lang.String r2 = r0.name
            r1.f85760g = r2
            java.lang.String r2 = r0.internationalPhoneNumber
            r1.f85762i = r2
            com.google.android.libraries.places.api.a.a.c.a.u$d[] r2 = r0.photos
            if (r2 == 0) goto L_0x0132
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89844l(r2)
            goto L_0x0133
        L_0x0132:
            r2 = r3
        L_0x0133:
            if (r2 == 0) goto L_0x0235
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.common.b.sm r2 = r2.listIterator(r5)
        L_0x013e:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0236
            java.lang.Object r11 = r2.next()
            com.google.android.libraries.places.api.a.a.c.a.u$d r11 = (com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31813u.C31821d) r11
            if (r11 != 0) goto L_0x014f
            r12 = r3
            goto L_0x01e4
        L_0x014f:
            java.lang.String r12 = r11.photoReference
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x022e
            java.lang.Integer r13 = r11.height
            java.lang.Integer r14 = r11.width
            com.google.android.libraries.places.api.model.d r15 = new com.google.android.libraries.places.api.model.d
            r15.<init>()
            if (r12 == 0) goto L_0x0226
            r15.f85752d = r12
            r15.mo37597b(r5)
            r15.mo37596a(r5)
            java.lang.String r12 = ""
            r15.f85749a = r12
            java.lang.String[] r11 = r11.htmlAttributions
            if (r11 == 0) goto L_0x0177
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89844l(r11)
            goto L_0x0178
        L_0x0177:
            r11 = r3
        L_0x0178:
            if (r11 == 0) goto L_0x0191
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x0181
            goto L_0x0191
        L_0x0181:
            com.google.common.base.ar r12 = new com.google.common.base.ar
            java.lang.String r3 = ", "
            r12.<init>((java.lang.String) r3)
            com.google.common.base.ao r3 = new com.google.common.base.ao
            r3.<init>(r12, r12)
            java.lang.String r12 = r3.mo56097d(r11)
        L_0x0191:
            r15.f85749a = r12
            if (r13 != 0) goto L_0x0197
            r3 = 0
            goto L_0x019b
        L_0x0197:
            int r3 = r13.intValue()
        L_0x019b:
            r15.mo37596a(r3)
            if (r14 != 0) goto L_0x01a2
            r3 = 0
            goto L_0x01a6
        L_0x01a2:
            int r3 = r14.intValue()
        L_0x01a6:
            r15.mo37597b(r3)
            byte r3 = r15.f85753e
            r11 = 3
            if (r3 != r11) goto L_0x01ea
            java.lang.String r3 = r15.f85749a
            if (r3 == 0) goto L_0x01ea
            java.lang.String r11 = r15.f85752d
            if (r11 != 0) goto L_0x01b7
            goto L_0x01ea
        L_0x01b7:
            com.google.android.libraries.places.api.model.AutoValue_PhotoMetadata r12 = new com.google.android.libraries.places.api.model.AutoValue_PhotoMetadata
            int r13 = r15.f85750b
            int r14 = r15.f85751c
            r12.<init>(r3, r13, r14, r11)
            int r3 = r12.f85526c
            if (r3 < 0) goto L_0x01c6
            r11 = 1
            goto L_0x01c7
        L_0x01c6:
            r11 = 0
        L_0x01c7:
            java.lang.String r13 = "Width must not be < 0, but was: %s."
            com.google.common.base.C58838bb.m90885t(r11, r13, r3)
            int r3 = r12.f85525b
            if (r3 < 0) goto L_0x01d2
            r11 = 1
            goto L_0x01d3
        L_0x01d2:
            r11 = 0
        L_0x01d3:
            java.lang.String r13 = "Height must not be < 0, but was: %s."
            com.google.common.base.C58838bb.m90885t(r11, r13, r3)
            java.lang.String r3 = r12.f85527d
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ r4
            java.lang.String r11 = "PhotoReference must not be null or empty."
            com.google.common.base.C58838bb.m90884s(r3, r11)
        L_0x01e4:
            m59183g(r7, r12)
            r3 = 0
            goto L_0x013e
        L_0x01ea:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r15.f85749a
            if (r1 != 0) goto L_0x01f8
            java.lang.String r1 = " attributions"
            r0.append(r1)
        L_0x01f8:
            byte r1 = r15.f85753e
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0202
            java.lang.String r1 = " height"
            r0.append(r1)
        L_0x0202:
            byte r1 = r15.f85753e
            r1 = r1 & 2
            if (r1 != 0) goto L_0x020d
            java.lang.String r1 = " width"
            r0.append(r1)
        L_0x020d:
            java.lang.String r1 = r15.f85752d
            if (r1 != 0) goto L_0x0216
            java.lang.String r1 = " photoReference"
            r0.append(r1)
        L_0x0216:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0226:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null photoReference"
            r0.<init>(r1)
            throw r0
        L_0x022e:
            java.lang.String r0 = "Photo reference not provided for a PhotoMetadata result."
            com.google.android.gms.common.api.n r0 = m59180d(r0)
            throw r0
        L_0x0235:
            r7 = 0
        L_0x0236:
            r1.f85763j = r7
            com.google.android.libraries.places.api.a.a.c.a.u$c r2 = r0.openingHours
            if (r2 == 0) goto L_0x02f0
            com.google.android.libraries.places.api.model.c r3 = new com.google.android.libraries.places.api.model.c
            r3.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.f85747a = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.f85748b = r7
            com.google.android.libraries.places.api.a.a.c.a.u$c$a[] r7 = r2.periods
            if (r7 == 0) goto L_0x0258
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89844l(r7)
            goto L_0x0259
        L_0x0258:
            r7 = 0
        L_0x0259:
            if (r7 == 0) goto L_0x0289
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.common.b.sm r5 = r7.listIterator(r5)
        L_0x0264:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x028a
            java.lang.Object r7 = r5.next()
            com.google.android.libraries.places.api.a.a.c.a.u$c$a r7 = (com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31813u.C31818c.C31819a) r7
            if (r7 == 0) goto L_0x0284
            com.google.android.libraries.places.api.a.a.c.a.u$c$b r12 = r7.open
            com.google.android.libraries.places.api.model.TimeOfWeek r12 = m59182f(r12)
            com.google.android.libraries.places.api.a.a.c.a.u$c$b r7 = r7.close
            com.google.android.libraries.places.api.model.TimeOfWeek r7 = m59182f(r7)
            com.google.android.libraries.places.api.model.AutoValue_Period r13 = new com.google.android.libraries.places.api.model.AutoValue_Period
            r13.<init>(r12, r7)
            goto L_0x0285
        L_0x0284:
            r13 = 0
        L_0x0285:
            m59183g(r11, r13)
            goto L_0x0264
        L_0x0289:
            r11 = 0
        L_0x028a:
            java.util.List r5 = m59177a(r11)
            r3.f85747a = r5
            java.lang.String[] r2 = r2.weekdayText
            if (r2 == 0) goto L_0x0299
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89844l(r2)
            goto L_0x029a
        L_0x0299:
            r2 = 0
        L_0x029a:
            java.util.List r2 = m59177a(r2)
            r3.f85748b = r2
            com.google.android.libraries.places.api.model.OpeningHours r2 = r3.mo37595a()
            java.util.List r5 = r2.mo37486b()
            java.util.Iterator r5 = r5.iterator()
        L_0x02ac:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02c3
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r7 = r7 ^ r4
            java.lang.String r11 = "WeekdayText must not contain null or empty values."
            com.google.common.base.C58838bb.m90884s(r7, r11)
            goto L_0x02ac
        L_0x02c3:
            java.util.List r4 = r2.mo37485a()
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89842j(r4)
            if (r4 == 0) goto L_0x02e8
            r3.f85747a = r4
            java.util.List r2 = r2.mo37486b()
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            if (r2 == 0) goto L_0x02e0
            r3.f85748b = r2
            com.google.android.libraries.places.api.model.OpeningHours r2 = r3.mo37595a()
            goto L_0x02f1
        L_0x02e0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null weekdayText"
            r0.<init>(r1)
            throw r0
        L_0x02e8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null periods"
            r0.<init>(r1)
            throw r0
        L_0x02f0:
            r2 = 0
        L_0x02f1:
            r1.f85761h = r2
            com.google.android.libraries.places.api.a.a.c.a.u$e r2 = r0.plusCode
            if (r2 != 0) goto L_0x02f9
            r4 = 0
            goto L_0x0302
        L_0x02f9:
            java.lang.String r3 = r2.compoundCode
            java.lang.String r2 = r2.globalCode
            com.google.android.libraries.places.api.model.AutoValue_PlusCode r4 = new com.google.android.libraries.places.api.model.AutoValue_PlusCode
            r4.<init>(r3, r2)
        L_0x0302:
            r1.f85764k = r4
            java.lang.Integer r2 = r0.priceLevel
            r1.f85765l = r2
            java.lang.Double r2 = r0.rating
            r1.f85766m = r2
            java.lang.String[] r2 = r0.types
            if (r2 == 0) goto L_0x0315
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89844l(r2)
            goto L_0x0316
        L_0x0315:
            r3 = 0
        L_0x0316:
            java.util.List r2 = m59178b(r3)
            r1.f85767n = r2
            java.lang.Integer r2 = r0.userRatingsTotal
            r1.f85768o = r2
            java.lang.Integer r0 = r0.utcOffset
            r1.f85769p = r0
            r1.f85770q = r9
            r1.f85771r = r6
            r1.f85772s = r8
            r1.f85773t = r10
        L_0x032c:
            com.google.android.libraries.places.api.model.Place r0 = r1.mo37632e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31811s.m59179c(com.google.android.libraries.places.api.a.a.c.a.u, java.util.List):com.google.android.libraries.places.api.model.Place");
    }

    /* renamed from: d */
    private static C143842n m59180d(String str) {
        return new C143842n(new Status(1, 8, "Unexpected server error: ".concat(String.valueOf(str)), (PendingIntent) null, (ConnectionResult) null));
    }

    /* renamed from: e */
    private static LatLng m59181e(C31813u.C31815b.C31816a aVar) {
        if (aVar == null) {
            return null;
        }
        Double d = aVar.lat;
        Double d2 = aVar.lng;
        if (d == null || d2 == null) {
            return null;
        }
        return new LatLng(d.doubleValue(), d2.doubleValue());
    }

    /* renamed from: f */
    private static TimeOfWeek m59182f(C31813u.C31818c.C31820b bVar) {
        DayOfWeek dayOfWeek;
        if (bVar == null) {
            return null;
        }
        try {
            Integer num = bVar.day;
            C58838bb.m90866a(num, "Unable to convert Pablo response to TimeOfWeek: The \"day\" field is missing.");
            String str = bVar.time;
            C58838bb.m90866a(str, "Unable to convert Pablo response to TimeOfWeek: The \"time\" field is missing.");
            boolean z = true;
            String format = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", new Object[]{str});
            if (str.length() != 4) {
                z = false;
            }
            C58838bb.m90869d(z, format);
            try {
                AutoValue_LocalTime autoValue_LocalTime = new AutoValue_LocalTime(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                int i = autoValue_LocalTime.f85518a;
                C58838bb.m90885t(C58714pg.m90504g(0, 23).mo5941a(Integer.valueOf(i)), "Hours must not be out-of-range: 0 to 23, but was: %s.", i);
                int i2 = autoValue_LocalTime.f85519b;
                C58838bb.m90885t(C58714pg.m90504g(0, 59).mo5941a(Integer.valueOf(i2)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", i2);
                switch (num.intValue()) {
                    case 0:
                        dayOfWeek = DayOfWeek.SUNDAY;
                        break;
                    case 1:
                        dayOfWeek = DayOfWeek.MONDAY;
                        break;
                    case 2:
                        dayOfWeek = DayOfWeek.TUESDAY;
                        break;
                    case 3:
                        dayOfWeek = DayOfWeek.WEDNESDAY;
                        break;
                    case 4:
                        dayOfWeek = DayOfWeek.THURSDAY;
                        break;
                    case 5:
                        dayOfWeek = DayOfWeek.FRIDAY;
                        break;
                    case 6:
                        dayOfWeek = DayOfWeek.SATURDAY;
                        break;
                    default:
                        throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
                }
                return new AutoValue_TimeOfWeek(dayOfWeek, autoValue_LocalTime);
            } catch (IllegalStateException e) {
                throw new IllegalArgumentException(e);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(format, e2);
            }
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException(e3.getMessage(), e3);
        }
    }

    /* renamed from: g */
    private static void m59183g(Collection collection, Object obj) {
        if (obj != null) {
            collection.add(obj);
        }
    }
}
