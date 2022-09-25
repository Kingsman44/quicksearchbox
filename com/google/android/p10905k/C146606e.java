package com.google.android.p10905k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.k.e */
/* compiled from: PG */
public final class C146606e {

    /* renamed from: a */
    public static final Uri f395966a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f395967b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f395968c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f395969d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f395970e = new AtomicBoolean();

    /* renamed from: f */
    static HashMap f395971f;

    /* renamed from: g */
    static final HashMap f395972g = new HashMap();

    /* renamed from: h */
    static final HashMap f395973h = new HashMap();

    /* renamed from: i */
    static final HashMap f395974i = new HashMap();

    /* renamed from: j */
    static final HashMap f395975j = new HashMap();

    /* renamed from: k */
    static final String[] f395976k = new String[0];

    /* renamed from: l */
    private static Object f395977l;

    /* renamed from: m */
    private static boolean f395978m;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m238839a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.Class<com.google.android.k.e> r0 = com.google.android.p10905k.C146606e.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0013
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r4 = r2
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r4
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r2 = 0
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10905k.C146606e.m238839a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public static Object m238840b(ContentResolver contentResolver) {
        Object obj;
        synchronized (C146606e.class) {
            m238846h(contentResolver);
            obj = f395977l;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r9 = r9.query(f395966a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r10}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r9 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r9.moveToFirst() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        m238847i(r1, r10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r9.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r0 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r0.equals(r11) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        m238847i(r1, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
        throw r10;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m238841c(android.content.ContentResolver r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.Class<com.google.android.k.e> r0 = com.google.android.p10905k.C146606e.class
            monitor-enter(r0)
            m238846h(r9)     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = f395977l     // Catch:{ all -> 0x0060 }
            java.util.HashMap r2 = f395971f     // Catch:{ all -> 0x0060 }
            boolean r2 = r2.containsKey(r10)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x001e
            java.util.HashMap r9 = f395971f     // Catch:{ all -> 0x0060 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0060 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0060 }
            if (r9 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r11 = r9
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return r11
        L_0x001e:
            java.lang.String[] r2 = f395976k     // Catch:{ all -> 0x0060 }
            int r2 = r2.length     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            android.net.Uri r4 = f395966a
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            r2 = 0
            r7[r2] = r10
            r5 = 0
            r6 = 0
            r8 = 0
            r3 = r9
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x0035
            return r11
        L_0x0035:
            boolean r2 = r9.moveToFirst()     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x0043
            r0 = 0
            m238847i(r1, r10, r0)     // Catch:{ all -> 0x005b }
            r9.close()
            return r11
        L_0x0043:
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0050
            boolean r2 = r0.equals(r11)     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x0050
            r0 = r11
        L_0x0050:
            m238847i(r1, r10, r0)     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r11 = r0
        L_0x0057:
            r9.close()
            return r11
        L_0x005b:
            r10 = move-exception
            r9.close()
            throw r10
        L_0x0060:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10905k.C146606e.m238841c(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static Map m238842d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f395967b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: e */
    public static void m238843e(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (C146606e.class) {
            if (obj == f395977l) {
                hashMap.put(str, obj2);
                f395971f.remove(str);
            }
        }
    }

    /* renamed from: f */
    public static boolean m238844f(ContentResolver contentResolver, String str, boolean z) {
        Object b = m238840b(contentResolver);
        HashMap hashMap = f395972g;
        Boolean bool = (Boolean) m238839a(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c = m238841c(contentResolver, str, (String) null);
        if (c != null && !c.equals(BuildConfig.FLAVOR)) {
            if (f395968c.matcher(c).matches()) {
                z = true;
                bool = true;
            } else if (f395969d.matcher(c).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + c + "\") as boolean");
            }
        }
        m238843e(b, hashMap, str, bool);
        return z;
    }

    /* renamed from: g */
    public static long m238845g(ContentResolver contentResolver, long j) {
        Object b = m238840b(contentResolver);
        Long l = (Long) m238839a(f395974i, "android_id", Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        String c = m238841c(contentResolver, "android_id", (String) null);
        if (c != null) {
            try {
                long parseLong = Long.parseLong(c);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        m238843e(b, f395974i, "android_id", l);
        return j;
    }

    /* renamed from: h */
    private static void m238846h(ContentResolver contentResolver) {
        if (f395971f == null) {
            f395970e.set(false);
            f395971f = new HashMap();
            f395977l = new Object();
            f395978m = false;
            contentResolver.registerContentObserver(f395966a, true, new C146605d());
        } else if (f395970e.getAndSet(false)) {
            f395971f.clear();
            f395972g.clear();
            f395973h.clear();
            f395974i.clear();
            f395975j.clear();
            f395977l = new Object();
            f395978m = false;
        }
    }

    /* renamed from: i */
    private static void m238847i(Object obj, String str, String str2) {
        synchronized (C146606e.class) {
            if (obj == f395977l) {
                f395971f.put(str, str2);
            }
        }
    }
}
