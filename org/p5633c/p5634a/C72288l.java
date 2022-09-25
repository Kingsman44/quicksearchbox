package org.p5633c.p5634a;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.p5633c.p5634a.p5639e.C72245b;
import org.p5633c.p5634a.p5639e.C72260q;
import org.p5633c.p5634a.p5639e.C72266w;
import org.p5633c.p5634a.p5640f.C72278h;
import org.p5633c.p5634a.p5640f.C72279i;
import org.p5633c.p5634a.p5640f.C72280j;

/* renamed from: org.c.a.l */
/* compiled from: PG */
public abstract class C72288l implements Serializable {

    /* renamed from: a */
    private static C72280j f192415a = null;

    /* renamed from: b */
    public static final C72288l f192416b = new C72279i("UTC", "UTC", 0, 0);

    /* renamed from: c */
    public static Set f192417c = null;

    /* renamed from: e */
    public static C72278h f192418e = null;

    /* renamed from: f */
    private static volatile C72288l f192419f = null;

    /* renamed from: g */
    private static C72245b f192420g = null;

    /* renamed from: h */
    private static Map f192421h = null;

    /* renamed from: i */
    private static Map f192422i = null;
    private static final long serialVersionUID = 5546345482340108586L;

    /* renamed from: d */
    public final String f192423d;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f A[SYNTHETIC, Splitter:B:12:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
    static {
        /*
            org.c.a.f.i r0 = new org.c.a.f.i
            r1 = 0
            java.lang.String r2 = "UTC"
            r0.<init>(r2, r2, r1, r1)
            f192416b = r0
            r0 = 0
            java.lang.String r1 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ SecurityException -> 0x002b }
            if (r1 == 0) goto L_0x002c
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x001e }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x001e }
            org.c.a.f.j r1 = (org.p5633c.p5634a.p5640f.C72280j) r1     // Catch:{ Exception -> 0x001e }
            goto L_0x002d
        L_0x001e:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ SecurityException -> 0x002b }
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch:{ SecurityException -> 0x002b }
            r4.uncaughtException(r3, r1)     // Catch:{ SecurityException -> 0x002b }
            goto L_0x002c
        L_0x002b:
        L_0x002c:
            r1 = r0
        L_0x002d:
            if (r1 != 0) goto L_0x0042
            org.c.a.f.l r3 = new org.c.a.f.l     // Catch:{ Exception -> 0x0036 }
            r3.<init>()     // Catch:{ Exception -> 0x0036 }
            r1 = r3
            goto L_0x0042
        L_0x0036:
            r3 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.ThreadGroup r5 = r4.getThreadGroup()
            r5.uncaughtException(r4, r3)
        L_0x0042:
            if (r1 != 0) goto L_0x0049
            org.c.a.f.k r1 = new org.c.a.f.k
            r1.<init>()
        L_0x0049:
            java.util.Set r3 = r1.mo37833a()
            if (r3 == 0) goto L_0x00a7
            int r4 = r3.size()
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r3.contains(r2)
            if (r4 == 0) goto L_0x009f
            org.c.a.l r4 = f192416b
            org.c.a.l r2 = r1.mo37834b(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0097
            f192415a = r1
            f192417c = r3
            java.lang.String r1 = "org.joda.time.DateTimeZone.NameProvider"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ SecurityException -> 0x008c }
            if (r1 == 0) goto L_0x008d
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x007f }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x007f }
            org.c.a.f.h r1 = (org.p5633c.p5634a.p5640f.C72278h) r1     // Catch:{ Exception -> 0x007f }
            r0 = r1
            goto L_0x008d
        L_0x007f:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ SecurityException -> 0x008c }
            java.lang.ThreadGroup r3 = r2.getThreadGroup()     // Catch:{ SecurityException -> 0x008c }
            r3.uncaughtException(r2, r1)     // Catch:{ SecurityException -> 0x008c }
            goto L_0x008d
        L_0x008c:
        L_0x008d:
            if (r0 != 0) goto L_0x0094
            org.c.a.f.h r0 = new org.c.a.f.h
            r0.<init>()
        L_0x0094:
            f192418e = r0
            return
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid UTC zone provided"
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't support UTC"
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provider doesn't have any available ids"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.C72288l.<clinit>():void");
    }

    protected C72288l(String str) {
        if (str != null) {
            this.f192423d = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    /* renamed from: c */
    private static int m106783c(String str) {
        return -((int) m106792v().mo63600f(new C72286j()).mo63595a(str));
    }

    /* renamed from: f */
    private static synchronized String m106784f(String str) {
        String str2;
        synchronized (C72288l.class) {
            Map map = f192422i;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                f192422i = map;
            }
            str2 = (String) map.get(str);
        }
        return str2;
    }

    /* renamed from: l */
    public static String m106785l(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        C72266w.m106676d(stringBuffer, i2, 2);
        int i3 = i - (i2 * 3600000);
        int i4 = i3 / 60000;
        stringBuffer.append(':');
        C72266w.m106676d(stringBuffer, i4, 2);
        int i5 = i3 - (i4 * 60000);
        if (i5 == 0) {
            return stringBuffer.toString();
        }
        int i6 = i5 / 1000;
        stringBuffer.append(':');
        C72266w.m106676d(stringBuffer, i6, 2);
        int i7 = i5 - (i6 * 1000);
        if (i7 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        C72266w.m106676d(stringBuffer, i7, 3);
        return stringBuffer.toString();
    }

    /* renamed from: m */
    public static C72288l m106786m(String str) {
        if (str == null) {
            return m106789p();
        }
        if (str.equals("UTC")) {
            return f192416b;
        }
        C72288l b = f192415a.mo37834b(str);
        if (b != null) {
            return b;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int c = m106783c(str);
            if (((long) c) == 0) {
                return f192416b;
            }
            return m106791u(m106785l(c), c);
        }
        throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
    }

    /* renamed from: o */
    public static C72288l m106788o(TimeZone timeZone) {
        if (timeZone == null) {
            return m106789p();
        }
        String id = timeZone.getID();
        if (id.equals("UTC")) {
            return f192416b;
        }
        String f = m106784f(id);
        C72288l b = f != null ? f192415a.mo37834b(f) : null;
        if (b == null) {
            b = f192415a.mo37834b(id);
        }
        if (b != null) {
            return b;
        }
        if (f == null) {
            String id2 = timeZone.getID();
            if (id2.startsWith("GMT+") || id2.startsWith("GMT-")) {
                int c = m106783c(id2.substring(3));
                if (((long) c) == 0) {
                    return f192416b;
                }
                return m106791u(m106785l(c), c);
            }
        }
        throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
    }

    /* renamed from: p */
    public static C72288l m106789p() {
        C72288l lVar = f192419f;
        if (lVar == null) {
            synchronized (C72288l.class) {
                lVar = f192419f;
                if (lVar == null) {
                    lVar = null;
                    try {
                        String property = System.getProperty("user.timezone");
                        if (property != null) {
                            lVar = m106786m(property);
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (lVar == null) {
                        try {
                            lVar = m106788o(TimeZone.getDefault());
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    if (lVar == null) {
                        lVar = f192416b;
                    }
                    f192419f = lVar;
                }
            }
        }
        return lVar;
    }

    /* renamed from: q */
    public static void m106790q(C72288l lVar) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new C72297u());
        }
        if (lVar != null) {
            synchronized (C72288l.class) {
                f192419f = lVar;
            }
            return;
        }
        throw new IllegalArgumentException("The datetime zone must not be null");
    }

    /* renamed from: u */
    private static synchronized C72288l m106791u(String str, int i) {
        C72288l lVar;
        synchronized (C72288l.class) {
            if (i == 0) {
                C72288l lVar2 = f192416b;
                return lVar2;
            }
            if (f192421h == null) {
                f192421h = new HashMap();
            }
            Reference reference = (Reference) f192421h.get(str);
            if (reference != null && (lVar = (C72288l) reference.get()) != null) {
                return lVar;
            }
            C72279i iVar = new C72279i(str, (String) null, i, i);
            f192421h.put(str, new SoftReference(iVar));
            return iVar;
        }
    }

    /* renamed from: v */
    private static synchronized C72245b m106792v() {
        C72245b bVar;
        synchronized (C72288l.class) {
            if (f192420g == null) {
                C72260q qVar = new C72260q();
                qVar.mo63626r((String) null, true, 4);
                f192420g = qVar.mo63610a();
            }
            bVar = f192420g;
        }
        return bVar;
    }

    /* renamed from: a */
    public abstract int mo37823a(long j);

    /* renamed from: b */
    public abstract int mo37824b(long j);

    /* renamed from: d */
    public abstract long mo37826d(long j);

    /* renamed from: e */
    public abstract long mo37827e(long j);

    public abstract boolean equals(Object obj);

    /* renamed from: g */
    public abstract String mo37830g(long j);

    /* renamed from: h */
    public abstract boolean mo37831h();

    public int hashCode() {
        return this.f192423d.hashCode() + 57;
    }

    /* renamed from: i */
    public int mo63661i(long j) {
        int a = mo37823a(j);
        long j2 = j - ((long) a);
        int a2 = mo37823a(j2);
        if (a != a2) {
            if (a - a2 >= 0 || mo37826d(j2) == mo37826d(j - ((long) a2))) {
                return a2;
            }
            return a;
        } else if (a >= 0) {
            long e = mo37827e(j2);
            if (e < j2) {
                int a3 = mo37823a(e);
                if (j2 - e <= ((long) (a3 - a))) {
                    return a3;
                }
            }
        }
        return a2;
    }

    /* renamed from: j */
    public final long mo63663j(long j) {
        long a = (long) mo37823a(j);
        long j2 = j + a;
        if ((j ^ j2) >= 0 || (j ^ a) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* renamed from: k */
    public final long mo63664k(C72288l lVar, long j) {
        if (lVar == null) {
            lVar = m106789p();
        }
        if (lVar == this) {
            return j;
        }
        return lVar.mo63667t(mo63663j(j), j);
    }

    /* renamed from: r */
    public final boolean mo63665r(long j) {
        return mo37823a(j) == mo37824b(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r4 != r6) goto L_0x0030;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo63666s(long r12) {
        /*
            r11 = this;
            int r0 = r11.mo37823a(r12)
            long r1 = (long) r0
            long r1 = r12 - r1
            int r3 = r11.mo37823a(r1)
            if (r0 == r3) goto L_0x002f
            if (r0 >= 0) goto L_0x002f
            long r4 = r11.mo37826d(r1)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x001d
            r4 = r6
        L_0x001d:
            long r1 = (long) r3
            long r1 = r12 - r1
            long r8 = r11.mo37826d(r1)
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = r8
        L_0x002a:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            long r0 = (long) r0
            long r2 = r12 - r0
            long r4 = r12 ^ r2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0049
            long r12 = r12 ^ r0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0041
            goto L_0x0049
        L_0x0041:
            java.lang.ArithmeticException r12 = new java.lang.ArithmeticException
            java.lang.String r13 = "Subtracting time zone offset caused overflow"
            r12.<init>(r13)
            throw r12
        L_0x0049:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.C72288l.mo63666s(long):long");
    }

    /* renamed from: t */
    public final long mo63667t(long j, long j2) {
        int a = mo37823a(j2);
        long j3 = j - ((long) a);
        if (mo37823a(j3) == a) {
            return j3;
        }
        return mo63666s(j);
    }

    public final String toString() {
        return this.f192423d;
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new C72287k(this.f192423d);
    }

    /* renamed from: n */
    public static C72288l m106787n(int i) {
        if (i >= -86399999 && i <= 86399999) {
            return m106791u(m106785l(i), i);
        }
        throw new IllegalArgumentException("Millis out of range: " + i);
    }
}
