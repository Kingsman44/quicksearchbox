package com.google.common.p4542m;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.common.m.a */
/* compiled from: PG */
public final class C59344a {

    /* renamed from: a */
    private static final Map f157534a = new HashMap();

    private C59344a() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:72|73) */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0149 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m92230a(java.lang.String r9) {
        /*
            java.lang.String r0 = "Don't know how to unmap library name in current platform ("
            java.lang.String r1 = "Couldn't find classloader resource '"
            java.lang.Class<com.google.common.m.a> r2 = com.google.common.p4542m.C59344a.class
            monitor-enter(r2)
            java.util.Map r3 = f157534a     // Catch:{ all -> 0x01ab }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ all -> 0x01ab }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01ab }
            if (r3 == 0) goto L_0x0013
            monitor-exit(r2)
            return
        L_0x0013:
            java.lang.Class<com.google.common.m.a> r3 = com.google.common.p4542m.C59344a.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ all -> 0x01ab }
            if (r3 == 0) goto L_0x0026
            java.lang.Class<com.google.common.m.a> r3 = com.google.common.p4542m.C59344a.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ all -> 0x01ab }
            java.io.InputStream r3 = r3.getResourceAsStream(r9)     // Catch:{ all -> 0x01ab }
            goto L_0x002a
        L_0x0026:
            java.io.InputStream r3 = java.lang.ClassLoader.getSystemResourceAsStream(r9)     // Catch:{ all -> 0x01ab }
        L_0x002a:
            if (r3 != 0) goto L_0x00b8
            java.lang.String r3 = m92231b(r9)     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r5.<init>(r1)     // Catch:{ all -> 0x01ab }
            r5.append(r9)     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = "'"
            r5.append(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01ab }
            r4.<init>(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = m92232c(r9, r4)     // Catch:{ all -> 0x01ab }
            if (r1 != 0) goto L_0x00aa
            java.lang.String r1 = "os.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r5 = "Mac OS X"
            boolean r5 = r1.equals(r5)     // Catch:{ all -> 0x01ab }
            if (r5 == 0) goto L_0x005d
            java.lang.String r0 = ".dylib"
            goto L_0x0067
        L_0x005d:
            java.lang.String r5 = "Linux"
            boolean r5 = r1.equals(r5)     // Catch:{ all -> 0x01ab }
            if (r5 == 0) goto L_0x0093
            java.lang.String r0 = ".so"
        L_0x0067:
            int r1 = r3.length()     // Catch:{ all -> 0x01ab }
            int r5 = r0.length()     // Catch:{ all -> 0x01ab }
            r6 = 3
            int r5 = r5 + r6
            if (r1 <= r5) goto L_0x008e
            java.lang.String r1 = "lib"
            boolean r1 = r3.startsWith(r1)     // Catch:{ all -> 0x01ab }
            if (r1 == 0) goto L_0x008e
            boolean r1 = r3.endsWith(r0)     // Catch:{ all -> 0x01ab }
            if (r1 == 0) goto L_0x008e
            int r1 = r3.length()     // Catch:{ all -> 0x01ab }
            int r0 = r0.length()     // Catch:{ all -> 0x01ab }
            int r1 = r1 - r0
            java.lang.String r3 = r3.substring(r6, r1)     // Catch:{ all -> 0x01ab }
        L_0x008e:
            java.lang.String r1 = m92233d(r3, r9, r4)     // Catch:{ all -> 0x01ab }
            goto L_0x00aa
        L_0x0093:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r3.<init>(r0)     // Catch:{ all -> 0x01ab }
            r3.append(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ab }
            r9.<init>(r0)     // Catch:{ all -> 0x01ab }
            throw r9     // Catch:{ all -> 0x01ab }
        L_0x00aa:
            if (r1 == 0) goto L_0x00ae
            monitor-exit(r2)
            return
        L_0x00ae:
            java.lang.UnsatisfiedLinkError r9 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01ab }
            r9.<init>(r0)     // Catch:{ all -> 0x01ab }
            throw r9     // Catch:{ all -> 0x01ab }
        L_0x00b8:
            java.lang.String r0 = m92231b(r9)     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            r1.<init>()     // Catch:{ IOException -> 0x0184 }
            java.lang.String r4 = "java.io.tmpdir"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch:{ IOException -> 0x0184 }
            r1.append(r4)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r4 = java.io.File.separator     // Catch:{ IOException -> 0x0184 }
            r1.append(r4)     // Catch:{ IOException -> 0x0184 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0184 }
            r1.append(r4)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r4 = "-"
            r1.append(r4)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0184 }
            r4 = 1
            r5 = 1
        L_0x00e1:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 >= r6) goto L_0x0152
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            r7.<init>()     // Catch:{ IOException -> 0x0184 }
            r7.append(r1)     // Catch:{ IOException -> 0x0184 }
            r7.append(r5)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0184 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0184 }
            boolean r7 = r6.mkdirs()     // Catch:{ IOException -> 0x0184 }
            if (r7 == 0) goto L_0x014f
            java.io.File r1 = r6.getCanonicalFile()     // Catch:{ IOException -> 0x014f }
            r1.deleteOnExit()     // Catch:{ IOException -> 0x0184 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0184 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0184 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x014a }
            r0.<init>(r5)     // Catch:{ all -> 0x014a }
            r1 = 4096(0x1000, float:5.74E-42)
            r6 = 0
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x012e }
        L_0x0115:
            int r7 = r3.read(r1)     // Catch:{ all -> 0x012e }
            r8 = -1
            if (r7 != r8) goto L_0x012a
            r0.close()     // Catch:{ all -> 0x014a }
            r3.close()     // Catch:{ IOException -> 0x0184 }
            r5.deleteOnExit()     // Catch:{ IOException -> 0x0184 }
            m92234e(r9, r5)     // Catch:{ all -> 0x01ab }
            monitor-exit(r2)
            return
        L_0x012a:
            r0.write(r1, r6, r7)     // Catch:{ all -> 0x012e }
            goto L_0x0115
        L_0x012e:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0133 }
            goto L_0x0149
        L_0x0133:
            r0 = move-exception
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r5[r6] = r7     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r5 = r7.getDeclaredMethod(r8, r5)     // Catch:{ Exception -> 0x0149 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0149 }
            r4[r6] = r0     // Catch:{ Exception -> 0x0149 }
            r5.invoke(r1, r4)     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            throw r1     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0184 }
            throw r0     // Catch:{ IOException -> 0x0184 }
        L_0x014f:
            int r5 = r5 + 1
            goto L_0x00e1
        L_0x0152:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0184 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
            r3.<init>()     // Catch:{ IOException -> 0x0184 }
            java.lang.String r4 = "Failed to create any usable temp directory between "
            r3.append(r4)     // Catch:{ IOException -> 0x0184 }
            r3.append(r1)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r4 = "1 and "
            r3.append(r4)     // Catch:{ IOException -> 0x0184 }
            r3.append(r1)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r1 = "9999, where java.io.tmpdir="
            r3.append(r1)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r1 = "java.io.tmpdir"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ IOException -> 0x0184 }
            r3.append(r1)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch:{ IOException -> 0x0184 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0184 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0184 }
            throw r0     // Catch:{ IOException -> 0x0184 }
        L_0x0184:
            r0 = move-exception
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r3.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "Failed while writing input stream to temp file '"
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            r3.append(r9)     // Catch:{ all -> 0x01ab }
            java.lang.String r9 = "': "
            r3.append(r9)     // Catch:{ all -> 0x01ab }
            java.lang.String r9 = r0.getMessage()     // Catch:{ all -> 0x01ab }
            r3.append(r9)     // Catch:{ all -> 0x01ab }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x01ab }
            r1.<init>(r9)     // Catch:{ all -> 0x01ab }
            r1.initCause(r0)     // Catch:{ all -> 0x01ab }
            throw r1     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            r9 = move-exception
            monitor-exit(r2)
            goto L_0x01af
        L_0x01ae:
            throw r9
        L_0x01af:
            goto L_0x01ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4542m.C59344a.m92230a(java.lang.String):void");
    }

    /* renamed from: b */
    private static String m92231b(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: c */
    private static String m92232c(String str, StringBuilder sb) {
        try {
            System.load(str);
            f157534a.put(str, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't load(" + str + "): " + e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    private static String m92233d(String str, String str2, StringBuilder sb) {
        try {
            System.loadLibrary(str);
            f157534a.put(str2, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't loadLibrary(" + str + "): " + e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    private static void m92234e(String str, File file) {
        try {
            System.load(file.getPath());
            f157534a.put(str, file.getPath());
            file.getPath();
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            String property = System.getProperty("sun.arch.data.model");
            if ((!message.contains("ELFCLASS64") || !"32".equals(property)) && (!message.contains("ELFCLASS32") || !"64".equals(property))) {
                throw e;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append(". If you built this binary from google3, then you need to use the flag --java_cpu=");
            sb.append(true != property.equals("32") ? "k8" : "piii");
            sb.append(".  Failure to do so may cause unpredictable and serious failures.");
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb.toString());
            unsatisfiedLinkError.setStackTrace(e.getStackTrace());
            throw unsatisfiedLinkError;
        }
    }
}
