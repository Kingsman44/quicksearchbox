package org.p5633c.p5634a.p5640f;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.p5633c.p5634a.C72288l;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.f.l */
/* compiled from: PG */
public final class C72282l implements C72280j {

    /* renamed from: a */
    private final String f192384a = "org/joda/time/tz/data/";

    /* renamed from: b */
    private final ClassLoader f192385b = getClass().getClassLoader();

    /* renamed from: c */
    private final Map f192386c;

    public C72282l() {
        InputStream c = m106765c("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(c);
        try {
            m106767e(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(C72288l.f192416b));
            this.f192386c = concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private final InputStream m106765c(String str) {
        InputStream inputStream;
        String concat = this.f192384a.concat(str);
        ClassLoader classLoader = this.f192385b;
        if (classLoader != null) {
            inputStream = classLoader.getResourceAsStream(concat);
        } else {
            inputStream = ClassLoader.getSystemResourceAsStream(concat);
        }
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(concat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader2 = this.f192385b;
        sb.append(classLoader2 != null ? classLoader2.toString() : "system");
        throw new IOException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043 A[SYNTHETIC, Splitter:B:22:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049 A[SYNTHETIC, Splitter:B:27:0x0049] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.p5633c.p5634a.C72288l m106766d(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.m106765c(r6)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            boolean r2 = r1 instanceof java.io.DataInput     // Catch:{ IOException -> 0x002b }
            if (r2 == 0) goto L_0x0011
            r2 = r1
            java.io.DataInput r2 = (java.io.DataInput) r2     // Catch:{ IOException -> 0x002b }
            org.c.a.l r2 = org.p5633c.p5634a.p5640f.C72277g.m106750b(r2, r6)     // Catch:{ IOException -> 0x002b }
            goto L_0x001a
        L_0x0011:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ IOException -> 0x002b }
            r2.<init>(r1)     // Catch:{ IOException -> 0x002b }
            org.c.a.l r2 = org.p5633c.p5634a.p5640f.C72277g.m106750b(r2, r6)     // Catch:{ IOException -> 0x002b }
        L_0x001a:
            java.util.Map r3 = r5.f192386c     // Catch:{ IOException -> 0x002b }
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch:{ IOException -> 0x002b }
            r4.<init>(r2)     // Catch:{ IOException -> 0x002b }
            r3.put(r6, r4)     // Catch:{ IOException -> 0x002b }
            r1.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return r2
        L_0x0028:
            r6 = move-exception
            r0 = r1
            goto L_0x0047
        L_0x002b:
            r2 = move-exception
            goto L_0x0031
        L_0x002d:
            r6 = move-exception
            goto L_0x0047
        L_0x002f:
            r2 = move-exception
            r1 = r0
        L_0x0031:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0028 }
            java.lang.ThreadGroup r4 = r3.getThreadGroup()     // Catch:{ all -> 0x0028 }
            r4.uncaughtException(r3, r2)     // Catch:{ all -> 0x0028 }
            java.util.Map r2 = r5.f192386c     // Catch:{ all -> 0x0028 }
            r2.remove(r6)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r0
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5640f.C72282l.m106766d(java.lang.String):org.c.a.l");
    }

    /* renamed from: e */
    private static void m106767e(DataInputStream dataInputStream, Map map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        int i = 0;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        while (i < readUnsignedShort2) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    /* renamed from: a */
    public final Set mo37833a() {
        return new TreeSet(this.f192386c.keySet());
    }

    /* renamed from: b */
    public final C72288l mo37834b(String str) {
        Object obj;
        if (str == null || (obj = this.f192386c.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return m106766d(str);
        }
        if (!(obj instanceof SoftReference)) {
            return mo37834b((String) obj);
        }
        C72288l lVar = (C72288l) ((SoftReference) obj).get();
        if (lVar != null) {
            return lVar;
        }
        return m106766d(str);
    }
}
