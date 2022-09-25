package android.p017a.p019b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* renamed from: android.a.b.u */
/* compiled from: PG */
public final class C0107u extends C0098l {

    /* renamed from: a */
    public static final C0107u f303a = new C0107u();

    /* renamed from: d */
    private static final ResourceBundle f304d = new C0087a();

    /* renamed from: b */
    public Map f305b;

    /* renamed from: c */
    public Map f306c;

    /* renamed from: e */
    private final Map f307e = new HashMap();

    private C0107u() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.p017a.p019b.C0106t mo68a(java.lang.String r10) {
        /*
            r9 = this;
            java.util.Map r0 = r9.f307e
            monitor-enter(r0)
            java.util.Map r1 = r9.f307e     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.containsKey(r10)     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            java.util.Map r3 = r9.f307e     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r10)     // Catch:{ all -> 0x0090 }
            android.a.b.t r3 = (android.p017a.p019b.C0106t) r3     // Catch:{ all -> 0x0090 }
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x008f
            java.util.ResourceBundle r0 = f304d     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            java.lang.String r1 = "rules"
            java.lang.Object r0 = r0.getObject(r1)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            java.lang.Object[][] r0 = (java.lang.Object[][]) r0     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            int r1 = r0.length     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r4 = 0
            r5 = 0
        L_0x0026:
            r6 = 1
            if (r5 >= r1) goto L_0x003c
            r7 = r0[r5]     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r8 = r7[r4]     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            boolean r8 = r10.equals(r8)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            if (r8 == 0) goto L_0x0039
            r0 = r7[r6]     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r2 = r0
            java.lang.Object[][] r2 = (java.lang.Object[][]) r2     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            goto L_0x003c
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x003c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r0.<init>()     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            int r1 = r2.length     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r5 = 0
        L_0x0043:
            if (r5 >= r1) goto L_0x0068
            r7 = r2[r5]     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            int r8 = r0.length()     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            if (r8 <= 0) goto L_0x0052
            java.lang.String r8 = "; "
            r0.append(r8)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
        L_0x0052:
            r8 = r7[r4]     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r0.append(r8)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            java.lang.String r8 = ": "
            r0.append(r8)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r7 = r7[r6]     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            r0.append(r7)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            int r5 = r5 + 1
            goto L_0x0043
        L_0x0068:
            java.lang.String r0 = r0.toString()     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
            android.a.b.t r3 = android.p017a.p019b.C0106t.m61b(r0)     // Catch:{ ParseException | MissingResourceException -> 0x0070 }
        L_0x0070:
            java.util.Map r0 = r9.f307e
            monitor-enter(r0)
            java.util.Map r1 = r9.f307e     // Catch:{ all -> 0x008c }
            boolean r1 = r1.containsKey(r10)     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x0085
            java.util.Map r1 = r9.f307e     // Catch:{ all -> 0x008c }
            java.lang.Object r10 = r1.get(r10)     // Catch:{ all -> 0x008c }
            android.a.b.t r10 = (android.p017a.p019b.C0106t) r10     // Catch:{ all -> 0x008c }
            r3 = r10
            goto L_0x008a
        L_0x0085:
            java.util.Map r1 = r9.f307e     // Catch:{ all -> 0x008c }
            r1.put(r10, r3)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            goto L_0x008f
        L_0x008c:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            throw r10
        L_0x008f:
            return r3
        L_0x0090:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0093:
            throw r10
        L_0x0094:
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p019b.C0107u.mo68a(java.lang.String):android.a.b.t");
    }

    /* renamed from: b */
    public final void mo69b() {
        Map map;
        Map map2;
        Map map3;
        synchronized (this) {
            map = this.f305b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = f304d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                map2 = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    map2.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                map3 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    map3.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                map2 = Collections.emptyMap();
                map3 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.f305b == null) {
                    this.f305b = map2;
                    this.f306c = map3;
                }
            }
        }
    }
}
