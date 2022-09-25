package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ag */
/* compiled from: PG */
public final class C36128ag {

    /* renamed from: a */
    public static final Uri f94466a = Uri.parse("clock-app://com.google.android.deskclock");

    /* renamed from: a */
    public static int m64533a(String str) {
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() > 1) {
            return Integer.parseInt(pathSegments.get(1));
        }
        throw new C35471g("Invalid object definition");
    }

    /* renamed from: b */
    public static C60870cx m64534b(C51809dy dyVar, String str, Function function) {
        C36183e.m64586d(dyVar, str);
        return C36183e.m64583a(dyVar, "alarm_params", C51527l.f134273f.getParserForType(), function);
    }

    /* renamed from: c */
    public static Optional m64535c(C51809dy dyVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        for (C52232kc kcVar : dwVar.f135932a) {
            if (kcVar.f137065b.equals("timer_params")) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return Optional.m71637of((C51594nm) C62942bv.parseFrom((C62942bv) C51594nm.f134474f, kaVar.f137061c, C62921ba.m95368a()));
                } catch (C62974ct unused) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: d */
    static String m64536d(int i) {
        m64538f(i);
        switch (i) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                throw new C35471g("Could not convert day of week to String");
        }
    }

    /* renamed from: e */
    public static void m64537e(boolean z, String str) {
        if (!z) {
            throw new C35471g(str);
        }
    }

    /* renamed from: f */
    static void m64538f(int i) {
        boolean z = false;
        if (i >= 0 && i <= 6) {
            z = true;
        }
        m64537e(z, "Day of week outside expected range [0,6]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m64539g(java.util.List r3) {
        /*
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r3.next()
            com.google.assistant.e.i.a.nk r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51592nk) r0
            java.lang.String r0 = r0.f134467d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            boolean r2 = m64541i(r0)
            if (r2 != 0) goto L_0x0025
            goto L_0x0034
        L_0x0025:
            java.lang.String r0 = r0.getHost()
            if (r0 == 0) goto L_0x0034
            java.lang.String r2 = "com.google.android.deskclock"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0034
            goto L_0x000c
        L_0x0034:
            return r1
        L_0x0035:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2766i.C36128ag.m64539g(java.util.List):boolean");
    }

    /* renamed from: h */
    public static boolean m64540h(PackageManager packageManager) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.deskclock", 0);
            if (packageInfo != null) {
                if (packageInfo.getLongVersionCode() >= 62000712) {
                    if (packageInfo.applicationInfo == null || !packageInfo.applicationInfo.enabled) {
                        return false;
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m64541i(Uri uri) {
        return (uri.getHost() == null || uri.getScheme() == null || !uri.getScheme().equals("clock-app") || uri.getLastPathSegment() == null) ? false : true;
    }
}
