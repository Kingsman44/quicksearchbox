package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.dataservice.C46819h;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52448sc;
import com.google.assistant.p3897e.p3921j.C52449sd;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ap */
/* compiled from: PG */
public final class C35887ap implements C35472h {

    /* renamed from: a */
    public static final C59071e f94011a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.ap");

    /* renamed from: b */
    private static final C58495hd f94012b;

    /* renamed from: c */
    private final C46877q f94013c;

    /* renamed from: d */
    private final PackageManager f94014d;

    /* renamed from: e */
    private final C60887da f94015e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C52448sc.SET_WIND_DOWN, "set_wind_down_mode");
        gzVar.mo55429h(C52448sc.START_WIND_DOWN, "start_wind_down_mode");
        gzVar.mo55429h(C52448sc.STOP_WIND_DOWN, "stop_wind_down_mode");
        gzVar.mo55429h(C52448sc.GET_ALL_APPS_USAGE, "get_all_apps_usage");
        gzVar.mo55429h(C52448sc.GET_APP_USAGE, "get_app_usage");
        gzVar.mo55429h(C52448sc.SET_APP_TIMER, "set_app_limit");
        gzVar.mo55429h(C52448sc.UNSET_APP_TIMER, "unset_app_limit");
        f94012b = gzVar.mo55427f(false);
    }

    public C35887ap(C46877q qVar, PackageManager packageManager, C60887da daVar) {
        this.f94013c = qVar;
        this.f94014d = packageManager;
        this.f94015e = daVar;
    }

    /* renamed from: b */
    public static C52070ec m64281b(String str) {
        return C36180b.m64579c(C52235kf.ABORTED, "Error calling Sunshine ContentResolver API ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    private static void m64282c(boolean z, String str) {
        if (!z) {
            throw new C35471g(str);
        }
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (dyVar.f135936b.equals("device.HANDLE_WELLBEING")) {
            C52449sd sdVar = (C52449sd) C36183e.m64584b(dyVar, "handle_wellbeing_args", C52449sd.f137679j.getParserForType());
            C52448sc a = C52448sc.m86638a(sdVar.f137682b);
            if (a == null) {
                a = C52448sc.UNSPECIFIED;
            }
            m64282c(a != C52448sc.UNSPECIFIED, "Unspecified Sunshine operation type.");
            String str = (String) f94012b.getOrDefault(a, (Object) null);
            if (C58837ba.m90859h(str)) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.UNIMPLEMENTED, "Unsupported operation: ".concat(String.valueOf(String.valueOf(a)))));
            }
            String str2 = sdVar.f137688h;
            m64282c(!str2.isEmpty(), "Missing Sunshine provider URI.");
            Uri parse = Uri.parse(str2);
            try {
                this.f94014d.getPackageInfo("com.google.android.apps.wellbeing", 0);
                Bundle bundle = new Bundle();
                if ((sdVar.f137681a & 2) != 0) {
                    C52403ql qlVar = sdVar.f137683c;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    int i = qlVar.f137514a;
                    if (!((i & 1) == 0 || (i & 2) == 0)) {
                        bundle.putString("startTime", LocalTime.m71211of(qlVar.f137515b, qlVar.f137516c).toString());
                    }
                }
                if ((sdVar.f137681a & 4) != 0) {
                    C52403ql qlVar2 = sdVar.f137684d;
                    if (qlVar2 == null) {
                        qlVar2 = C52403ql.f137512f;
                    }
                    int i2 = qlVar2.f137514a;
                    if (!((i2 & 1) == 0 || (2 & i2) == 0)) {
                        bundle.putString("endTime", LocalTime.m71211of(qlVar2.f137515b, qlVar2.f137516c).toString());
                    }
                }
                if ((sdVar.f137681a & 8) != 0) {
                    C52393qb qbVar = sdVar.f137685e;
                    if (qbVar == null) {
                        qbVar = C52393qb.f137479e;
                    }
                    int i3 = qbVar.f137481a;
                    if (!((i3 & 1) == 0 || (i3 & 2) == 0 || (i3 & 4) == 0)) {
                        bundle.putString("date", LocalDate.m71157of(qbVar.f137482b, qbVar.f137483c, qbVar.f137484d).toString());
                    }
                }
                if ((sdVar.f137681a & 16) != 0) {
                    C52460so soVar = sdVar.f137686f;
                    if (soVar == null) {
                        soVar = C52460so.f137714d;
                    }
                    bundle.putLong("limitMillis", soVar.f137717b * 1000);
                }
                if ((sdVar.f137681a & 32) != 0) {
                    m64282c(!sdVar.f137687g.isEmpty(), "Empty package name.");
                    bundle.putCharSequence("packageName", sdVar.f137687g);
                }
                if ((sdVar.f137681a & 128) != 0) {
                    bundle.putBoolean("enabled", sdVar.f137689i);
                }
                return C47633f.m84733g(C47633f.m84733g(this.f94013c.mo50874d(new C46819h(parse, str, bundle))).mo51515h(C35883al.f94007a, this.f94015e).mo51513e(Exception.class, new C35884am(str), this.f94015e)).mo51516i(new C35885an(str), C60826bg.f164896a).mo51513e(Exception.class, new C35886ao(str), C60826bg.f164896a);
            } catch (PackageManager.NameNotFoundException unused) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.FAILED_PRECONDITION, "Sunshine is not installed."));
            }
        } else {
            throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.HANDLE_WELLBEING", dyVar.f135936b}));
        }
    }
}
