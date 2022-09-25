package com.google.android.setupcompat.p3549a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.setupcompat.p3550b.C45244a;
import java.util.EnumMap;

/* renamed from: com.google.android.setupcompat.a.c */
/* compiled from: PG */
public final class C45240c {

    /* renamed from: a */
    public static final String f118157a = "c";

    /* renamed from: b */
    static Bundle f118158b = null;

    /* renamed from: c */
    public static Bundle f118159c = null;

    /* renamed from: d */
    public static Bundle f118160d = null;

    /* renamed from: e */
    public static Bundle f118161e = null;

    /* renamed from: f */
    public static Bundle f118162f = null;

    /* renamed from: g */
    public static int f118163g = 1;

    /* renamed from: h */
    public static int f118164h;

    /* renamed from: i */
    public static int f118165i;

    /* renamed from: l */
    private static C45240c f118166l;

    /* renamed from: m */
    private static ContentObserver f118167m;

    /* renamed from: n */
    private static int f118168n;

    /* renamed from: j */
    Bundle f118169j = null;

    /* renamed from: k */
    final EnumMap f118170k;

    private C45240c(Context context) {
        EnumMap enumMap = new EnumMap(C45238a.class);
        this.f118170k = enumMap;
        Bundle bundle = this.f118169j;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.f118169j = context.getContentResolver().call(m80573d(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
                String str = f118157a;
                Bundle bundle2 = this.f118169j;
                String obj = (bundle2 != null ? Integer.valueOf(bundle2.size()) : "(null)").toString();
                Log.i(str, "PartnerConfigsBundle=" + obj);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(f118157a, "Fail to get config from suw provider");
            }
        }
        if (m80576m(context)) {
            if (f118167m != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(f118167m);
                    f118167m = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e) {
                    Log.w(f118157a, "Failed to unregister content observer: ".concat(e.toString()));
                }
            }
            Uri d = m80573d();
            try {
                f118167m = new C45239b();
                context.getContentResolver().registerContentObserver(d, true, f118167m);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
                String str2 = f118157a;
                String valueOf = String.valueOf(d);
                String obj2 = e2.toString();
                Log.w(str2, "Failed to register content observer for " + valueOf + ": " + obj2);
            }
        }
    }

    /* renamed from: d */
    public static Uri m80573d() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r1.screenHeightDp == f118164h) goto L_0x005f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.google.android.setupcompat.p3549a.C45240c m80574e(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.setupcompat.a.c> r0 = com.google.android.setupcompat.p3549a.C45240c.class
            monitor-enter(r0)
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ all -> 0x0063 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0063 }
            com.google.android.setupcompat.a.c r2 = f118166l     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0022
            int r2 = r1.uiMode     // Catch:{ all -> 0x0063 }
            r2 = r2 & 48
            f118168n = r2     // Catch:{ all -> 0x0063 }
            int r2 = r1.orientation     // Catch:{ all -> 0x0063 }
            f118163g = r2     // Catch:{ all -> 0x0063 }
            int r2 = r1.screenWidthDp     // Catch:{ all -> 0x0063 }
            f118165i = r2     // Catch:{ all -> 0x0063 }
            int r1 = r1.screenHeightDp     // Catch:{ all -> 0x0063 }
            f118164h = r1     // Catch:{ all -> 0x0063 }
            goto L_0x0058
        L_0x0022:
            boolean r2 = m80576m(r4)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0031
            int r2 = r1.uiMode     // Catch:{ all -> 0x0063 }
            r2 = r2 & 48
            int r3 = f118168n     // Catch:{ all -> 0x0063 }
            if (r2 == r3) goto L_0x0031
            goto L_0x0043
        L_0x0031:
            int r2 = r1.orientation     // Catch:{ all -> 0x0063 }
            int r3 = f118163g     // Catch:{ all -> 0x0063 }
            if (r2 != r3) goto L_0x0043
            int r2 = r1.screenWidthDp     // Catch:{ all -> 0x0063 }
            int r3 = f118165i     // Catch:{ all -> 0x0063 }
            if (r2 != r3) goto L_0x0043
            int r2 = r1.screenHeightDp     // Catch:{ all -> 0x0063 }
            int r3 = f118164h     // Catch:{ all -> 0x0063 }
            if (r2 == r3) goto L_0x005f
        L_0x0043:
            int r2 = r1.uiMode     // Catch:{ all -> 0x0063 }
            r2 = r2 & 48
            f118168n = r2     // Catch:{ all -> 0x0063 }
            int r2 = r1.orientation     // Catch:{ all -> 0x0063 }
            f118163g = r2     // Catch:{ all -> 0x0063 }
            int r2 = r1.screenHeightDp     // Catch:{ all -> 0x0063 }
            f118164h = r2     // Catch:{ all -> 0x0063 }
            int r1 = r1.screenWidthDp     // Catch:{ all -> 0x0063 }
            f118165i = r1     // Catch:{ all -> 0x0063 }
            m80575i()     // Catch:{ all -> 0x0063 }
        L_0x0058:
            com.google.android.setupcompat.a.c r1 = new com.google.android.setupcompat.a.c     // Catch:{ all -> 0x0063 }
            r1.<init>(r4)     // Catch:{ all -> 0x0063 }
            f118166l = r1     // Catch:{ all -> 0x0063 }
        L_0x005f:
            com.google.android.setupcompat.a.c r4 = f118166l     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)
            return r4
        L_0x0063:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupcompat.p3549a.C45240c.m80574e(android.content.Context):com.google.android.setupcompat.a.c");
    }

    /* renamed from: i */
    public static synchronized void m80575i() {
        synchronized (C45240c.class) {
            f118166l = null;
            f118158b = null;
            f118159c = null;
            f118160d = null;
            f118161e = null;
            f118162f = null;
        }
    }

    /* renamed from: m */
    public static boolean m80576m(Context context) {
        if (f118158b == null) {
            try {
                f118158b = context.getContentResolver().call(m80573d(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(f118157a, "SetupWizard DayNight supporting status unknown; return as false.");
                f118158b = null;
                return false;
            }
        }
        Bundle bundle = f118158b;
        if (bundle == null || !bundle.getBoolean("isSuwDayNightEnabled", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m80577n(Context context) {
        if (f118161e == null) {
            try {
                f118161e = context.getContentResolver().call(m80573d(), "isDynamicColorEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(f118157a, "SetupWizard dynamic color supporting status unknown; return as false.");
                f118161e = null;
                return false;
            }
        }
        Bundle bundle = f118161e;
        if (bundle == null || !bundle.getBoolean("isDynamicColorEnabled", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m80578o(Context context) {
        if (f118159c == null) {
            try {
                f118159c = context.getContentResolver().call(m80573d(), "isExtendedPartnerConfigEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(f118157a, "SetupWizard extended partner configs supporting status unknown; return as false.");
                f118159c = null;
                return false;
            }
        }
        Bundle bundle = f118159c;
        if (bundle == null || !bundle.getBoolean("isExtendedPartnerConfigEnabled", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m80579p(Context context) {
        Bundle bundle = f118160d;
        if (bundle == null || bundle.isEmpty()) {
            try {
                Bundle call = context.getContentResolver().call(m80573d(), "IsMaterialYouStyleEnabled", (String) null, (Bundle) null);
                f118160d = call;
                if (call != null && call.isEmpty() && !C45244a.m80596b()) {
                    return m80578o(context);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(f118157a, "SetupWizard Material You configs supporting status unknown; return as false.");
                f118160d = null;
                return false;
            }
        }
        Bundle bundle2 = f118160d;
        if (bundle2 == null || !bundle2.getBoolean("IsMaterialYouStyleEnabled", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r4 = r5.f118175d.getResourceTypeName(r5.f118174c);
        r1 = r5.f118173b.concat("_material_you");
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final com.google.android.setupcompat.p3549a.C45241d m80580q(android.content.Context r4, com.google.android.setupcompat.p3549a.C45241d r5) {
        /*
            java.lang.String r0 = "use material you resource:"
            boolean r1 = com.google.android.setupcompat.p3550b.C45244a.m80596b()
            if (r1 == 0) goto L_0x004d
            boolean r4 = m80579p(r4)
            if (r4 == 0) goto L_0x004d
            java.lang.String r4 = "com.google.android.setupwizard"
            java.lang.String r1 = r5.f118172a     // Catch:{ NotFoundException -> 0x004d }
            boolean r4 = r4.equals(r1)     // Catch:{ NotFoundException -> 0x004d }
            if (r4 == 0) goto L_0x004d
            android.content.res.Resources r4 = r5.f118175d     // Catch:{ NotFoundException -> 0x004d }
            int r1 = r5.f118174c     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r4 = r4.getResourceTypeName(r1)     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r1 = r5.f118173b     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r2 = "_material_you"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NotFoundException -> 0x004d }
            android.content.res.Resources r2 = r5.f118175d     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r3 = r5.f118172a     // Catch:{ NotFoundException -> 0x004d }
            int r4 = r2.getIdentifier(r1, r4, r3)     // Catch:{ NotFoundException -> 0x004d }
            if (r4 == 0) goto L_0x004d
            java.lang.String r2 = f118157a     // Catch:{ NotFoundException -> 0x004d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x004d }
            r3.<init>(r0)     // Catch:{ NotFoundException -> 0x004d }
            r3.append(r1)     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r0 = r3.toString()     // Catch:{ NotFoundException -> 0x004d }
            android.util.Log.i(r2, r0)     // Catch:{ NotFoundException -> 0x004d }
            com.google.android.setupcompat.a.d r0 = new com.google.android.setupcompat.a.d     // Catch:{ NotFoundException -> 0x004d }
            java.lang.String r2 = r5.f118172a     // Catch:{ NotFoundException -> 0x004d }
            android.content.res.Resources r3 = r5.f118175d     // Catch:{ NotFoundException -> 0x004d }
            r0.<init>(r2, r1, r4, r3)     // Catch:{ NotFoundException -> 0x004d }
            return r0
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupcompat.p3549a.C45240c.m80580q(android.content.Context, com.google.android.setupcompat.a.d):com.google.android.setupcompat.a.d");
    }

    /* renamed from: t */
    private static float m80581t(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public final float mo49099a(Context context, C45238a aVar, float f) {
        if (aVar.f118156bs != 6) {
            throw new IllegalArgumentException("Not a dimension resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return m80581t(context, (TypedValue) this.f118170k.get(aVar));
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                Resources resources = g.f118175d;
                int i = g.f118174c;
                float dimension = resources.getDimension(i);
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 5) {
                    this.f118170k.put(aVar, typedValue);
                    return m80581t(context, (TypedValue) this.f118170k.get(aVar));
                }
                String hexString = Integer.toHexString(i);
                String hexString2 = Integer.toHexString(typedValue.type);
                throw new Resources.NotFoundException("Resource ID #0x" + hexString + " type #0x" + hexString2 + " is not valid");
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return f;
            }
        }
    }

    /* renamed from: b */
    public final int mo49100b(Context context, C45238a aVar) {
        if (aVar.f118156bs != 3) {
            throw new IllegalArgumentException("Not a color resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return ((Integer) this.f118170k.get(aVar)).intValue();
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                Resources resources = g.f118175d;
                int i = g.f118174c;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 1) {
                    if (typedValue.data == 0) {
                        return 0;
                    }
                }
                int color = resources.getColor(i, (Resources.Theme) null);
                this.f118170k.put(aVar, Integer.valueOf(color));
                return color;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
    }

    /* renamed from: c */
    public final Drawable mo49101c(Context context, C45238a aVar) {
        if (aVar.f118156bs != 4) {
            throw new IllegalArgumentException("Not a drawable resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return (Drawable) this.f118170k.get(aVar);
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                Resources resources = g.f118175d;
                int i = g.f118174c;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 1) {
                    if (typedValue.data == 0) {
                        return null;
                    }
                }
                Drawable drawable = resources.getDrawable(i, (Resources.Theme) null);
                this.f118170k.put(aVar, drawable);
                return drawable;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return null;
            }
        }
    }

    /* renamed from: f */
    public final C45241d mo49102f(Context context, C45238a aVar) {
        if (aVar.f118156bs != 8) {
            throw new IllegalArgumentException("Not a illustration resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return (C45241d) this.f118170k.get(aVar);
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                Resources resources = g.f118175d;
                int i = g.f118174c;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 1) {
                    if (typedValue.data == 0) {
                        return null;
                    }
                }
                this.f118170k.put(aVar, g);
                return g;
            } catch (NullPointerException unused) {
                return null;
            }
        }
    }

    /* renamed from: g */
    public final C45241d mo49103g(Context context, String str) {
        Bundle bundle = this.f118169j.getBundle(str);
        Bundle bundle2 = this.f118169j.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(str));
        }
        C45241d q = m80580q(context, C45241d.m80593a(context, bundle));
        Resources resources = q.f118175d;
        Configuration configuration = resources.getConfiguration();
        if (!m80576m(context) && C45242e.m80594a(configuration)) {
            if (q == null) {
                Log.w(f118157a, "resourceEntry is null, skip to force day mode.");
            } else {
                configuration.uiMode = (configuration.uiMode & -49) | 16;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
        return q;
    }

    /* renamed from: h */
    public final String mo49104h(Context context, C45238a aVar) {
        if (aVar.f118156bs != 5) {
            throw new IllegalArgumentException("Not a string resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return (String) this.f118170k.get(aVar);
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                String string = g.f118175d.getString(g.f118174c);
                try {
                    this.f118170k.put(aVar, string);
                    return string;
                } catch (NullPointerException unused) {
                    return string;
                }
            } catch (NullPointerException unused2) {
                return null;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo49105j(Context context, C45238a aVar, boolean z) {
        if (aVar.f118156bs != 2) {
            throw new IllegalArgumentException("Not a bool resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return ((Boolean) this.f118170k.get(aVar)).booleanValue();
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                z = g.f118175d.getBoolean(g.f118174c);
                this.f118170k.put(aVar, Boolean.valueOf(z));
                return z;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return z;
            }
        }
    }

    /* renamed from: k */
    public final boolean mo49106k() {
        Bundle bundle = this.f118169j;
        return bundle != null && !bundle.isEmpty();
    }

    /* renamed from: l */
    public final boolean mo49107l(C45238a aVar) {
        return mo49106k() && this.f118169j.containsKey(aVar.f118155br);
    }

    /* renamed from: r */
    public final float mo49108r(Context context, C45238a aVar) {
        if (aVar.f118156bs != 7) {
            throw new IllegalArgumentException("Not a fraction resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return ((Float) this.f118170k.get(aVar)).floatValue();
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                float fraction = g.f118175d.getFraction(g.f118174c, 1, 1);
                try {
                    this.f118170k.put(aVar, Float.valueOf(fraction));
                    return fraction;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return fraction;
                }
            } catch (Resources.NotFoundException | NullPointerException unused2) {
                return 0.0f;
            }
        }
    }

    /* renamed from: s */
    public final int mo49109s(Context context, C45238a aVar) {
        if (aVar.f118156bs != 1) {
            throw new IllegalArgumentException("Not a integer resource");
        } else if (this.f118170k.containsKey(aVar)) {
            return ((Integer) this.f118170k.get(aVar)).intValue();
        } else {
            try {
                C45241d g = mo49103g(context, aVar.f118155br);
                int integer = g.f118175d.getInteger(g.f118174c);
                try {
                    this.f118170k.put(aVar, Integer.valueOf(integer));
                    return integer;
                } catch (Resources.NotFoundException | NullPointerException unused) {
                    return integer;
                }
            } catch (Resources.NotFoundException | NullPointerException unused2) {
                return 0;
            }
        }
    }
}
