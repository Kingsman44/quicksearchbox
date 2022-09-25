package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.ac */
/* compiled from: PG */
public final class C90364ac {

    /* renamed from: d */
    private static final C59071e f252385d = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.a.ac");

    /* renamed from: e */
    private static final C58495hd f252386e;

    /* renamed from: f */
    private static final C58495hd f252387f;

    /* renamed from: g */
    private static final int f252388g = 9;

    /* renamed from: a */
    public final C89656k f252389a;

    /* renamed from: b */
    public final C58495hd f252390b;

    /* renamed from: c */
    public final C58495hd f252391c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.facebook.orca", new C90363ab(1, (List) null));
        gzVar.mo55429h("jp.naver.line.android", new C90363ab(3, C58485gu.m89847o(Locale.JAPAN, Locale.JAPANESE)));
        gzVar.mo55429h("com.whatsapp", new C90392z(C58485gu.m89847o(Locale.JAPAN, Locale.JAPANESE)));
        gzVar.mo55429h("com.google.android.talk", new C90363ab(4, (List) null));
        gzVar.mo55429h("com.google.android.apps.dynamite", new C90363ab(9, (List) null));
        gzVar.mo55429h("com.google.android.apps.googlevoice", new C90363ab(5, C58485gu.m89846n(Locale.US)));
        gzVar.mo55429h("com.google.android.apps.messaging", new C90363ab(6, (List) null));
        f252386e = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("com.facebook.orca", new C90363ab(1, (List) null));
        gzVar2.mo55429h("jp.naver.line.android", new C90363ab(3, C58485gu.m89847o(Locale.JAPAN, Locale.JAPANESE)));
        gzVar2.mo55429h("com.whatsapp", new C90392z(C58485gu.m89847o(Locale.JAPAN, Locale.JAPANESE)));
        gzVar2.mo55429h("com.google.android.talk", new C90363ab(4, (List) null));
        gzVar2.mo55429h("com.google.android.apps.dynamite", new C90363ab(9, (List) null));
        gzVar2.mo55429h("com.google.android.apps.googlevoice", new C90363ab(5, C58485gu.m89846n(Locale.US)));
        gzVar2.mo55429h("com.google.android.apps.messaging", new C90363ab(6, (List) null));
        gzVar2.mo55429h("com.android.car.messenger", new C90363ab(7, (List) null));
        gzVar2.mo55429h("com.samsung.android.messaging", new C90363ab(8, (List) null));
        f252387f = gzVar2.mo55427f(false);
    }

    public C90364ac(C89656k kVar) {
        this.f252389a = kVar;
        this.f252390b = kVar.mo83555j(176) ? f252387f : f252386e;
        this.f252391c = f252387f;
    }

    /* renamed from: b */
    public static boolean m146959b(Context context, C89656k kVar, String str, int i) {
        Map map;
        String c = kVar.mo83548c("messaging_parsing_blacklist");
        if (C58837ba.m90859h(c)) {
            map = Collections.emptyMap();
        } else {
            C58490gz gzVar = new C58490gz(4);
            for (String split : c.split(",")) {
                String[] split2 = split.split(":");
                if (split2.length != 2) {
                    ((C59052c) ((C59052c) f252385d.mo56226d()).mo56372aa(10911)).mo56389s("Bad blacklist: %s", c);
                    int i2 = C90755l.f253831a;
                } else {
                    try {
                        int parseInt = Integer.parseInt(split2[0]);
                        if (parseInt >= 0) {
                            int i3 = f252388g;
                            int i4 = i3 - 1;
                            if (i3 == 0) {
                                throw null;
                            } else if (parseInt <= i4) {
                                gzVar.mo55429h(Integer.valueOf(parseInt), Integer.valueOf(split2[1]));
                            }
                        }
                        ((C59052c) ((C59052c) f252385d.mo56226d()).mo56372aa(10909)).mo56389s("Bad blacklist: %s", c);
                        int i5 = C90755l.f253831a;
                    } catch (NumberFormatException e) {
                        ((C59052c) ((C59052c) ((C59052c) f252385d.mo56226d()).mo56382g(e)).mo56372aa(10910)).mo56389s("Bad blacklist: %s", c);
                        int i6 = C90755l.f253831a;
                    }
                }
            }
            map = gzVar.mo55427f(false);
        }
        Integer num = (Integer) map.get(Integer.valueOf(i - 1));
        if (num == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode >= num.intValue();
        } catch (PackageManager.NameNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f252385d.mo56226d()).mo56382g(e2)).mo56372aa(10912)).mo56386p("Not found");
            int i7 = C90755l.f253831a;
            return true;
        }
    }

    /* renamed from: a */
    public final String mo84074a() {
        return C58827ar.m90818c(',').mo56097d(this.f252390b.keySet());
    }
}
