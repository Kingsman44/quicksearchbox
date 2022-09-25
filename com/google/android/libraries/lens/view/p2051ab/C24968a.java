package com.google.android.libraries.lens.view.p2051ab;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.libraries.lens.sdk.intent.BinderBitmap;
import com.google.android.libraries.lens.sdk.intent.C24943e;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import com.google.android.libraries.lens.sdk.p2038a.C24841p;
import com.google.android.libraries.lens.view.p2069am.C25343s;
import com.google.android.libraries.lens.view.p2069am.C25344t;
import com.google.android.libraries.lens.view.p2148l.C27221a;
import com.google.android.libraries.lens.view.p2148l.C27223c;
import com.google.android.libraries.lens.view.p2148l.C27226f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27230j;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.base.C58911u;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62471cu;
import com.google.lens.p4711m.C62632i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.view.ab.a */
/* compiled from: PG */
public final class C24968a {

    /* renamed from: a */
    private static final C58974d f68088a = C58974d.m91135i("DirectIntentUtils");

    /* renamed from: a */
    public static C24943e m46212a(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("lens_activity_params");
        return bundleExtra == null ? m46213b(intent.getData()) : new C24943e(bundleExtra);
    }

    /* renamed from: b */
    public static C24943e m46213b(Uri uri) {
        if (uri == null) {
            return null;
        }
        C24943e eVar = new C24943e();
        String queryParameter = uri.getQueryParameter("AccountNameUriKey");
        if (queryParameter != null) {
            eVar.f68071a.putString("account_name", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("LensBitmapUriKey");
        String queryParameter3 = uri.getQueryParameter("ImageSrc");
        String queryParameter4 = uri.getQueryParameter("PageDomain");
        if (queryParameter2 != null) {
            eVar.mo30176l(new LensImage(Uri.parse(queryParameter2), queryParameter4, queryParameter3));
        }
        String queryParameter5 = uri.getQueryParameter("lens_intent_type");
        if (queryParameter5 != null) {
            try {
                eVar.mo30173i(Integer.parseInt(queryParameter5));
            } catch (NumberFormatException e) {
                ((C58970a) ((C58970a) ((C58970a) f68088a.mo56225c()).mo56382g(e)).mo56372aa(49615)).mo56389s("Failed to parse intent type %s", queryParameter5);
            }
        }
        String queryParameter6 = uri.getQueryParameter("ActivityLaunchTimestampNanos");
        if (queryParameter6 != null) {
            try {
                eVar.mo30178n(Long.parseLong(queryParameter6));
            } catch (NumberFormatException e2) {
                ((C58970a) ((C58970a) ((C58970a) f68088a.mo56226d()).mo56382g(e2)).mo56372aa(49614)).mo56389s("Failed to parse launch timestamp %s", queryParameter6);
            }
        }
        String queryParameter7 = uri.getQueryParameter("Gid");
        if (queryParameter7 != null) {
            eVar.f68071a.putString("chrome_finch_variations", queryParameter7);
        }
        eVar.mo30174j(uri.getBooleanQueryParameter("IncognitoUriKey", false));
        return eVar;
    }

    /* renamed from: c */
    public static C24943e m46214c(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("lens_activity_params")) == null) {
            return null;
        }
        return new C24943e(bundle2);
    }

    /* renamed from: d */
    public static C27228h m46215d(Activity activity) {
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            return m46216e(extras);
        }
        C24943e b = m46213b(activity.getIntent().getData());
        if (b == null) {
            return C27228h.f74491h;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("lens_activity_params", b.f68071a);
        return m46216e(bundle);
    }

    /* renamed from: e */
    public static C27228h m46216e(Bundle bundle) {
        LensImage c;
        C24943e c2 = m46214c(bundle);
        if (c2 == null || (c = c2.mo30167c()) == null) {
            return C27228h.f74491h;
        }
        C27226f i = C27228h.m50544i();
        C27221a aVar = (C27221a) i;
        aVar.f74417a = C58833ax.m90833j(c.f68058c);
        BinderBitmap binderBitmap = c.f68056a;
        aVar.f74418b = C58833ax.m90833j(binderBitmap != null ? binderBitmap.f68053a : null);
        aVar.f74421e = C58833ax.m90833j(c.f68057b);
        return i.mo32662a();
    }

    /* renamed from: f */
    public static C27232l m46217f(Bundle bundle) {
        LensImage c;
        Rect rect;
        RectF[] rectFArr;
        C24943e c2 = m46214c(bundle);
        if (c2 == null) {
            return C27232l.f74493A;
        }
        String d = c2.mo30168d();
        d.getClass();
        C27230j D = C27232l.m50570D();
        C27223c cVar = (C27223c) D;
        cVar.f74434c = C58833ax.m90833j(d);
        D.mo32686i(true);
        if (c2.f68071a.containsKey("request_lens_time_nanos")) {
            D.mo32681d(c2.f68071a.getLong("request_lens_time_nanos"));
        }
        if (c2.f68071a.containsKey("account_name")) {
            cVar.f74432a = C58833ax.m90833j(c2.f68071a.getString("account_name"));
        }
        if (c2.f68071a.containsKey("intent_type")) {
            D.mo32684g(c2.f68071a.getInt("intent_type"));
        }
        if (c2.f68071a.containsKey("image_location")) {
            cVar.f74436e = C58833ax.m90833j((Location) c2.f68071a.getParcelable("image_location"));
        }
        if (c2.f68071a.containsKey("image_place_id")) {
            cVar.f74441j = C58833ax.m90833j(c2.f68071a.getString("image_place_id"));
        }
        if (c2.f68071a.containsKey("transition_type")) {
            D.mo32690m(c2.f68071a.getInt("transition_type"));
        }
        if (c2.f68071a.containsKey("is_from_incognito")) {
            D.mo32685h(c2.f68071a.getBoolean("is_from_incognito"));
        }
        if (c2.f68071a.containsKey("region_of_interest")) {
            cVar.f74444m = C58833ax.m90833j((RectF) c2.f68071a.getParcelable("region_of_interest"));
        }
        if (c2.f68071a.containsKey("external_gleam_boxes")) {
            Parcelable[] parcelableArray = c2.f68071a.getParcelableArray("external_gleam_boxes");
            if (parcelableArray == null) {
                rectFArr = null;
            } else {
                RectF[] rectFArr2 = new RectF[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; i++) {
                    rectFArr2[i] = (RectF) parcelableArray[i];
                }
                rectFArr = rectFArr2;
            }
            cVar.f74445n = C58833ax.m90833j(rectFArr);
        }
        if (c2.f68071a.containsKey("hide_close_button")) {
            D.mo32689l(c2.f68071a.getBoolean("hide_close_button"));
        }
        if (c2.f68071a.containsKey("lens_init_params")) {
            try {
                byte[] byteArray = c2.f68071a.getByteArray("lens_init_params");
                byteArray.getClass();
                D.mo32683f((C62471cu) C62942bv.parseFrom((C62942bv) C62471cu.f168676c, byteArray, C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) f68088a.mo56226d()).mo56382g(e)).mo56372aa(49617)).mo56386p("Failed to parse LensInitParams");
            }
        }
        if (c2.f68071a.containsKey("image_screen_location") && (rect = (Rect) c2.f68071a.getParcelable("image_screen_location")) != null) {
            C25343s sVar = (C25343s) C25344t.f68987f.createBuilder();
            int i2 = rect.left;
            sVar.copyOnWrite();
            C25344t tVar = (C25344t) sVar.instance;
            tVar.f68989a = 1 | tVar.f68989a;
            tVar.f68990b = i2;
            int i3 = rect.top;
            sVar.copyOnWrite();
            C25344t tVar2 = (C25344t) sVar.instance;
            tVar2.f68989a |= 2;
            tVar2.f68991c = i3;
            int i4 = rect.right;
            sVar.copyOnWrite();
            C25344t tVar3 = (C25344t) sVar.instance;
            tVar3.f68989a |= 4;
            tVar3.f68992d = i4;
            int i5 = rect.bottom;
            sVar.copyOnWrite();
            C25344t tVar4 = (C25344t) sVar.instance;
            tVar4.f68989a |= 8;
            tVar4.f68993e = i5;
            cVar.f74437f = C58833ax.m90833j((C25344t) sVar.build());
        }
        if (C62632i.m94817b(C58833ax.m90833j(d))) {
            if (c2.f68071a.containsKey("chrome_finch_variations")) {
                String string = c2.f68071a.getString("chrome_finch_variations");
                string.getClass();
                try {
                    ArrayList arrayList = new ArrayList();
                    for (String parseInt : C58869cf.m90938d(" ").mo56152f(C58911u.f156751b).mo56151a().mo56153g(string)) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                    }
                    ((C27223c) D).f74442k = C58833ax.m90833j(arrayList);
                } catch (NumberFormatException e2) {
                    ((C58970a) ((C58970a) ((C58970a) f68088a.mo56226d()).mo56382g(e2)).mo56372aa(49616)).mo56389s("Failed to parse variations: %s", string);
                }
            } else {
                cVar.f74442k = C58833ax.m90833j(new ArrayList());
            }
        }
        if (c2.f68071a.containsKey("postcapture_image") && (c = c2.mo30167c()) != null) {
            String str = c.f68060e;
            if (str != null) {
                cVar.f74439h = C58833ax.m90833j(str);
            }
            String str2 = c.f68059d;
            if (str2 != null) {
                cVar.f74440i = C58833ax.m90833j(str2);
            }
        }
        if (c2.f68071a.containsKey("proactive_query_id")) {
            cVar.f74446o = C58833ax.m90834k(Integer.valueOf(c2.f68071a.getInt("proactive_query_id")));
        }
        return D.mo32678a();
    }

    /* renamed from: g */
    public static void m46218g(Activity activity, int i) {
        IBinder b;
        C24943e a = m46212a(activity.getIntent());
        if (a != null && a.mo30170f() && (b = a.mo30166b()) != null) {
            Parcel obtain = Parcel.obtain();
            Bundle bundle = new Bundle();
            bundle.putInt("activity_result", i);
            obtain.writeBundle(bundle);
            try {
                b.transact(2, obtain, (Parcel) null, 0);
            } catch (RemoteException e) {
                C24841p.m45972c(e, "Failed to set activity result", new Object[0]);
            }
            obtain.recycle();
        }
    }

    /* renamed from: h */
    public static boolean m46219h(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String host = data.getHost();
        String scheme = data.getScheme();
        Uri parse = Uri.parse("google://lens");
        if (!(scheme == null || host == null)) {
            String scheme2 = parse.getScheme();
            scheme2.getClass();
            if (C58890d.m90990e(scheme, scheme2)) {
                String host2 = parse.getHost();
                host2.getClass();
                if (C58890d.m90990e(host, host2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
