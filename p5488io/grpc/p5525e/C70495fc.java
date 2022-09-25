package p5488io.grpc.p5525e;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e.fc */
/* compiled from: PG */
public final class C70495fc {

    /* renamed from: a */
    private static final long f187877a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    public static Double m102940a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", new Object[]{obj, str}));
            }
        } else {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map}));
        }
    }

    /* renamed from: b */
    public static Integer m102941b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d = (Double) obj;
            int intValue = d.intValue();
            if (((double) intValue) == d.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            new StringBuilder("Number expected to be integer: ").append(d);
            throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
        } else if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", new Object[]{obj, str}));
            }
        } else {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", new Object[]{obj, str}));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:82|83|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0134, code lost:
        throw new java.text.ParseException("Duration value is out of range.", 0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x012d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:76:0x010d=Splitter:B:76:0x010d, B:82:0x012d=Splitter:B:82:0x012d} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long m102942c(java.util.Map r14, java.lang.String r15) {
        /*
            java.lang.String r14 = m102943d(r14, r15)
            if (r14 == 0) goto L_0x0154
            boolean r15 = r14.isEmpty()     // Catch:{ ParseException -> 0x014d }
            java.lang.String r0 = "Invalid duration string: "
            r1 = 0
            if (r15 != 0) goto L_0x0143
            int r15 = r14.length()     // Catch:{ ParseException -> 0x014d }
            r2 = -1
            int r15 = r15 + r2
            char r15 = r14.charAt(r15)     // Catch:{ ParseException -> 0x014d }
            r3 = 115(0x73, float:1.61E-43)
            if (r15 != r3) goto L_0x0143
            char r15 = r14.charAt(r1)     // Catch:{ ParseException -> 0x014d }
            r3 = 45
            r4 = 1
            if (r15 != r3) goto L_0x002c
            java.lang.String r14 = r14.substring(r4)     // Catch:{ ParseException -> 0x014d }
            r15 = 1
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            int r3 = r14.length()     // Catch:{ ParseException -> 0x014d }
            int r3 = r3 + r2
            java.lang.String r3 = r14.substring(r1, r3)     // Catch:{ ParseException -> 0x014d }
            java.lang.String r5 = ""
            r6 = 46
            int r6 = r3.indexOf(r6)     // Catch:{ ParseException -> 0x014d }
            if (r6 == r2) goto L_0x004a
            int r2 = r6 + 1
            java.lang.String r5 = r3.substring(r2)     // Catch:{ ParseException -> 0x014d }
            java.lang.String r3 = r3.substring(r1, r6)     // Catch:{ ParseException -> 0x014d }
        L_0x004a:
            long r2 = java.lang.Long.parseLong(r3)     // Catch:{ ParseException -> 0x014d }
            boolean r6 = r5.isEmpty()     // Catch:{ ParseException -> 0x014d }
            if (r6 == 0) goto L_0x0056
            r7 = 0
            goto L_0x0087
        L_0x0056:
            r6 = 0
            r7 = 0
        L_0x0058:
            r8 = 9
            if (r6 >= r8) goto L_0x0087
            int r7 = r7 * 10
            int r8 = r5.length()     // Catch:{ ParseException -> 0x014d }
            if (r6 >= r8) goto L_0x0084
            char r8 = r5.charAt(r6)     // Catch:{ ParseException -> 0x014d }
            r9 = 48
            if (r8 < r9) goto L_0x007c
            char r8 = r5.charAt(r6)     // Catch:{ ParseException -> 0x014d }
            r9 = 57
            if (r8 > r9) goto L_0x007c
            char r8 = r5.charAt(r6)     // Catch:{ ParseException -> 0x014d }
            int r8 = r8 + -48
            int r7 = r7 + r8
            goto L_0x0084
        L_0x007c:
            java.text.ParseException r14 = new java.text.ParseException     // Catch:{ ParseException -> 0x014d }
            java.lang.String r15 = "Invalid nanoseconds."
            r14.<init>(r15, r1)     // Catch:{ ParseException -> 0x014d }
            throw r14     // Catch:{ ParseException -> 0x014d }
        L_0x0084:
            int r6 = r6 + 1
            goto L_0x0058
        L_0x0087:
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0135
            if (r15 == 0) goto L_0x0091
            long r2 = -r2
            int r7 = -r7
        L_0x0091:
            long r14 = (long) r7
            long r8 = f187877a     // Catch:{ IllegalArgumentException -> 0x012d }
            long r10 = -r8
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00a5
        L_0x009d:
            long r10 = r14 / r8
            long r2 = com.google.common.p4573p.C60718h.m92647a(r2, r10)     // Catch:{ IllegalArgumentException -> 0x012d }
            long r14 = r14 % r8
            int r7 = (int) r14     // Catch:{ IllegalArgumentException -> 0x012d }
        L_0x00a5:
            int r14 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x00b1
            if (r7 >= 0) goto L_0x00b1
            long r14 = (long) r7     // Catch:{ IllegalArgumentException -> 0x012d }
            long r14 = r14 + r8
            int r7 = (int) r14     // Catch:{ IllegalArgumentException -> 0x012d }
            r14 = -1
            long r2 = r2 + r14
        L_0x00b1:
            r14 = 1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            if (r7 <= 0) goto L_0x00bd
            long r10 = (long) r7     // Catch:{ IllegalArgumentException -> 0x012d }
            long r10 = r10 - r8
            int r7 = (int) r10     // Catch:{ IllegalArgumentException -> 0x012d }
            long r2 = r2 + r14
        L_0x00bd:
            r10 = -315576000000(0xffffffb686346200, double:NaN)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0112
            r10 = 315576000000(0x4979cb9e00, double:1.55915260252E-312)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0112
            long r10 = (long) r7     // Catch:{ IllegalArgumentException -> 0x012d }
            r12 = -999999999(0xffffffffc4653601, double:NaN)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0112
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0112
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00e1
            if (r7 >= 0) goto L_0x00e7
        L_0x00e1:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0112
            if (r7 > 0) goto L_0x0112
        L_0x00e7:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IllegalArgumentException -> 0x012d }
            long r2 = r0.toNanos(r2)     // Catch:{ IllegalArgumentException -> 0x012d }
            long r7 = r2 + r10
            long r10 = r10 ^ r2
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f6
            r0 = 1
            goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            long r2 = r2 ^ r7
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x00fd
            r1 = 1
        L_0x00fd:
            r0 = r0 | r1
            if (r0 == 0) goto L_0x0101
            goto L_0x010d
        L_0x0101:
            r0 = 63
            long r0 = r7 >>> r0
            long r14 = r14 ^ r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r7 = r14 + r0
        L_0x010d:
            java.lang.Long r14 = java.lang.Long.valueOf(r7)     // Catch:{ ParseException -> 0x014d }
            return r14
        L_0x0112:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x012d }
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ IllegalArgumentException -> 0x012d }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x012d }
            r15[r1] = r0     // Catch:{ IllegalArgumentException -> 0x012d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x012d }
            r15[r4] = r0     // Catch:{ IllegalArgumentException -> 0x012d }
            java.lang.String r0 = "Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds"
            java.lang.String r15 = java.lang.String.format(r0, r15)     // Catch:{ IllegalArgumentException -> 0x012d }
            r14.<init>(r15)     // Catch:{ IllegalArgumentException -> 0x012d }
            throw r14     // Catch:{ IllegalArgumentException -> 0x012d }
        L_0x012d:
            java.text.ParseException r14 = new java.text.ParseException     // Catch:{ ParseException -> 0x014d }
            java.lang.String r15 = "Duration value is out of range."
            r14.<init>(r15, r1)     // Catch:{ ParseException -> 0x014d }
            throw r14     // Catch:{ ParseException -> 0x014d }
        L_0x0135:
            java.text.ParseException r15 = new java.text.ParseException     // Catch:{ ParseException -> 0x014d }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ ParseException -> 0x014d }
            java.lang.String r14 = r0.concat(r14)     // Catch:{ ParseException -> 0x014d }
            r15.<init>(r14, r1)     // Catch:{ ParseException -> 0x014d }
            throw r15     // Catch:{ ParseException -> 0x014d }
        L_0x0143:
            java.text.ParseException r15 = new java.text.ParseException     // Catch:{ ParseException -> 0x014d }
            java.lang.String r14 = r0.concat(r14)     // Catch:{ ParseException -> 0x014d }
            r15.<init>(r14, r1)     // Catch:{ ParseException -> 0x014d }
            throw r15     // Catch:{ ParseException -> 0x014d }
        L_0x014d:
            r14 = move-exception
            java.lang.RuntimeException r15 = new java.lang.RuntimeException
            r15.<init>(r14)
            throw r15
        L_0x0154:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70495fc.m102942c(java.util.Map, java.lang.String):java.lang.Long");
    }

    /* renamed from: d */
    public static String m102943d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", new Object[]{obj, str, map}));
    }

    /* renamed from: e */
    public static List m102944e(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", new Object[]{obj, str, map}));
    }

    /* renamed from: f */
    public static List m102945f(Map map, String str) {
        List e = m102944e(map, str);
        if (e == null) {
            return null;
        }
        m102948i(e);
        return e;
    }

    /* renamed from: g */
    public static List m102946g(Map map, String str) {
        List e = m102944e(map, str);
        if (e == null) {
            return null;
        }
        int i = 0;
        while (i < e.size()) {
            if (e.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", new Object[]{e.get(i), Integer.valueOf(i), e}));
            }
        }
        return e;
    }

    /* renamed from: h */
    public static Map m102947h(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", new Object[]{obj, str, map}));
    }

    /* renamed from: i */
    public static void m102948i(List list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
    }

    /* renamed from: j */
    public static Boolean m102949j(Map map) {
        if (!map.containsKey("waitForReady")) {
            return null;
        }
        Object obj = map.get("waitForReady");
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", new Object[]{obj, "waitForReady", map}));
    }
}
