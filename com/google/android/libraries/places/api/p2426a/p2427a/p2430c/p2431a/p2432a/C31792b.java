package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.a.b */
/* compiled from: PG */
public final class C31792b {

    /* renamed from: a */
    private static final C58495hd f85416a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(Place.Field.ADDRESS, "formatted_address");
        gzVar.mo55429h(Place.Field.ADDRESS_COMPONENTS, "address_components");
        gzVar.mo55429h(Place.Field.BUSINESS_STATUS, "business_status");
        gzVar.mo55429h(Place.Field.ID, "place_id");
        gzVar.mo55429h(Place.Field.LAT_LNG, "geometry/location");
        gzVar.mo55429h(Place.Field.NAME, "name");
        gzVar.mo55429h(Place.Field.OPENING_HOURS, "opening_hours");
        gzVar.mo55429h(Place.Field.PHONE_NUMBER, "international_phone_number");
        gzVar.mo55429h(Place.Field.PHOTO_METADATAS, "photos");
        gzVar.mo55429h(Place.Field.PLUS_CODE, "plus_code");
        gzVar.mo55429h(Place.Field.PRICE_LEVEL, "price_level");
        gzVar.mo55429h(Place.Field.RATING, "rating");
        gzVar.mo55429h(Place.Field.TYPES, "types");
        gzVar.mo55429h(Place.Field.USER_RATINGS_TOTAL, "user_ratings_total");
        gzVar.mo55429h(Place.Field.UTC_OFFSET, "utc_offset");
        gzVar.mo55429h(Place.Field.VIEWPORT, "geometry/viewport");
        gzVar.mo55429h(Place.Field.WEBSITE_URI, "website");
        gzVar.mo55429h(Place.Field.ICON_URL, "icon_mask_base_uri");
        gzVar.mo55429h(Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color");
        f85416a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static String m59156a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) f85416a.get((Place.Field) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static List m59157b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) f85416a.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
