package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.p2432a;

import android.location.Location;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31782c;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31783d;
import com.google.common.base.C58826aq;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.a.a */
/* compiled from: PG */
public final class C31791a {

    /* renamed from: a */
    private static final C58495hd f85415a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C31782c.NONE, "NONE");
        gzVar.mo55429h(C31782c.PSK, "WPA_PSK");
        gzVar.mo55429h(C31782c.EAP, "WPA_EAP");
        gzVar.mo55429h(C31782c.OTHER, "SECURED_NONE");
        f85415a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public static Integer m59147a(Location location) {
        if (location == null) {
            return null;
        }
        float accuracy = location.getAccuracy();
        if (!location.hasAccuracy() || accuracy <= 0.0f) {
            return null;
        }
        return Integer.valueOf(Math.round(accuracy * 100.0f));
    }

    /* renamed from: b */
    public static String m59148b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2)) {
                str = "country:".concat(String.valueOf(str2.toLowerCase(Locale.US)));
            }
            if (str != null) {
                if (sb.length() != 0) {
                    sb.append('|');
                }
                sb.append(str);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m59149c(Location location) {
        if (location == null) {
            return null;
        }
        return m59154h(location.getLatitude(), location.getLongitude());
    }

    /* renamed from: d */
    public static String m59150d(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return m59154h(latLng.f392012a, latLng.f392013b);
    }

    /* renamed from: e */
    public static String m59151e(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return m59155i((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    /* renamed from: f */
    public static String m59152f(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return m59155i((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    /* renamed from: g */
    public static String m59153g(C58485gu guVar) {
        StringBuilder sb = new StringBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C31783d dVar = (C31783d) guVar.get(i);
            String str = sb.length() > 0 ? "|" : BuildConfig.FLAVOR;
            C58490gz gzVar = new C58490gz(4);
            gzVar.mo55429h("mac", dVar.f85400a);
            gzVar.mo55429h("strength_dbm", Integer.valueOf(dVar.f85401b));
            gzVar.mo55429h("wifi_auth_type", f85415a.get(dVar.f85402c));
            gzVar.mo55429h("is_connected", Boolean.valueOf(dVar.f85403d));
            gzVar.mo55429h("frequency_mhz", Integer.valueOf(dVar.f85404e));
            String concat = str.concat(new C58826aq(new C58827ar(","), "=").mo56095a(gzVar.mo55427f(true)));
            if (sb.length() + concat.length() > 4000) {
                break;
            }
            sb.append(concat);
        }
        return sb.toString();
    }

    /* renamed from: h */
    private static String m59154h(double d, double d2) {
        return String.format(Locale.US, "%.15f,%.15f", new Object[]{Double.valueOf(d), Double.valueOf(d2)});
    }

    /* renamed from: i */
    private static String m59155i(RectangularBounds rectangularBounds) {
        LatLng b = rectangularBounds.mo37536b();
        double d = b.f392012a;
        double d2 = b.f392013b;
        LatLng a = rectangularBounds.mo37535a();
        double d3 = a.f392012a;
        double d4 = a.f392013b;
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", new Object[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)});
    }
}
