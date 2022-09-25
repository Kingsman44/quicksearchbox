package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
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
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import org.p5633c.p5634a.C72298v;
import org.p5633c.p5634a.C72300x;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.ag */
/* compiled from: PG */
public final class C92872ag extends C22538o {

    /* renamed from: a */
    public static final C59071e f259102a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.ag");

    /* renamed from: b */
    private static final C58495hd f259103b;

    /* renamed from: c */
    private final Context f259104c;

    /* renamed from: d */
    private final C90931ca f259105d;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C52448sc.SET_WIND_DOWN, "set_wind_down_mode");
        gzVar.mo55429h(C52448sc.START_WIND_DOWN, "start_wind_down_mode");
        gzVar.mo55429h(C52448sc.STOP_WIND_DOWN, "stop_wind_down_mode");
        gzVar.mo55429h(C52448sc.GET_ALL_APPS_USAGE, "get_all_apps_usage");
        gzVar.mo55429h(C52448sc.GET_APP_USAGE, "get_app_usage");
        gzVar.mo55429h(C52448sc.SET_APP_TIMER, "set_app_limit");
        gzVar.mo55429h(C52448sc.UNSET_APP_TIMER, "unset_app_limit");
        f259103b = gzVar.mo55427f(false);
    }

    public C92872ag(Context context, C90931ca caVar) {
        this.f259104c = context;
        this.f259105d = caVar;
    }

    /* renamed from: b */
    public static C52070ec m152912b(String str) {
        return C22402a.m41822b(C52235kf.ABORTED, "Error calling Sunshine ContentResolver API ".concat(String.valueOf(str)));
    }

    /* renamed from: c */
    private static void m152913c(boolean z, String str) {
        if (!z) {
            C59104x c = f259102a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WellbeingPerformer");
            ((C59052c) ((C59052c) c).mo56372aa(13088)).mo56389s("%s", str);
            throw new C22534k();
        }
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C58976aa aaVar = C58975e.f156826a;
        ContentResolver contentResolver = this.f259104c.getContentResolver();
        PackageManager packageManager = this.f259104c.getPackageManager();
        if (dyVar.f135936b.equals("device.HANDLE_WELLBEING")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52449sd sdVar = (C52449sd) m41992m(dwVar, "handle_wellbeing_args", C52449sd.f137679j.getParserForType());
            C52448sc a = C52448sc.m86638a(sdVar.f137682b);
            if (a == null) {
                a = C52448sc.UNSPECIFIED;
            }
            m152913c(a != C52448sc.UNSPECIFIED, "Unspecified Sunshine operation type.");
            String str = (String) f259103b.getOrDefault(a, (Object) null);
            if (C58837ba.m90859h(str)) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNIMPLEMENTED, "Unsupported operation: ".concat(String.valueOf(String.valueOf(a)))));
            }
            String str2 = sdVar.f137688h;
            m152913c(!str2.isEmpty(), "Missing Sunshine provider URI.");
            Uri parse = Uri.parse(str2);
            try {
                packageManager.getPackageInfo("com.google.android.apps.wellbeing", 0);
                Bundle bundle = new Bundle();
                if ((sdVar.f137681a & 2) != 0) {
                    C52403ql qlVar = sdVar.f137683c;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    int i = qlVar.f137514a;
                    if (!((i & 1) == 0 || (i & 2) == 0)) {
                        bundle.putString("startTime", new C72300x(qlVar.f137515b, qlVar.f137516c, C72156ab.f192017E).mo63692j());
                    }
                }
                if ((sdVar.f137681a & 4) != 0) {
                    C52403ql qlVar2 = sdVar.f137684d;
                    if (qlVar2 == null) {
                        qlVar2 = C52403ql.f137512f;
                    }
                    int i2 = qlVar2.f137514a;
                    if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                        bundle.putString("endTime", new C72300x(qlVar2.f137515b, qlVar2.f137516c, C72156ab.f192017E).mo63692j());
                    }
                }
                if ((sdVar.f137681a & 8) != 0) {
                    C52393qb qbVar = sdVar.f137685e;
                    if (qbVar == null) {
                        qbVar = C52393qb.f137479e;
                    }
                    int i3 = qbVar.f137481a;
                    if (!((i3 & 1) == 0 || (i3 & 2) == 0 || (i3 & 4) == 0)) {
                        bundle.putString("date", C72267x.f192321b.mo63597c(new C72298v(qbVar.f137482b, qbVar.f137483c, qbVar.f137484d, C72156ab.f192017E)));
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
                    m152913c(!sdVar.f137687g.isEmpty(), "Empty package name.");
                    bundle.putCharSequence("packageName", sdVar.f137687g);
                }
                if ((sdVar.f137681a & 128) != 0) {
                    bundle.putBoolean("enabled", sdVar.f137689i);
                }
                return C60846c.m92878g(C60922j.m93045h(this.f259105d.mo85138c(new C92871af(contentResolver, parse, str, bundle)), new C92869ad(str), C60826bg.f164896a), Exception.class, new C92870ae(str), C60826bg.f164896a);
            } catch (PackageManager.NameNotFoundException unused) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.FAILED_PRECONDITION, "Sunshine is not installed."));
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
