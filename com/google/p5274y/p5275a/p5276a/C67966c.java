package com.google.p5274y.p5275a.p5276a;

import com.evernote.android.state.BuildConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.google.y.a.a.c */
/* compiled from: PG */
public final class C67966c {

    /* renamed from: a */
    private static Properties f184186a;

    /* renamed from: b */
    private static Map f184187b;

    private C67966c() {
    }

    /* renamed from: a */
    public static int m98222a() {
        try {
            return Integer.parseInt((String) m98224c().get("Build baseline changelist as int"));
        } catch (NumberFormatException unused) {
            return m98223b();
        }
    }

    /* renamed from: b */
    public static int m98223b() {
        try {
            return Integer.parseInt((String) m98224c().get("Build changelist"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static Map m98224c() {
        Map d = m98225d();
        if (d != null) {
            return d;
        }
        return Collections.emptyMap();
    }

    /* renamed from: d */
    private static synchronized Map m98225d() {
        synchronized (C67966c.class) {
            Map map = f184187b;
            if (map != null) {
                return map;
            }
            Properties e = m98226e();
            if (e.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Built on", e.getProperty("build.time", BuildConfig.FLAVOR));
            linkedHashMap.put("Build timestamp", e.getProperty("build.timestamp", BuildConfig.FLAVOR));
            linkedHashMap.put("Build timestamp as int", e.getProperty("build.timestamp.as.int", BuildConfig.FLAVOR));
            linkedHashMap.put("Built at", e.getProperty("build.location", BuildConfig.FLAVOR));
            linkedHashMap.put("Build target", e.getProperty("build.target", BuildConfig.FLAVOR));
            linkedHashMap.put("Build ID", e.getProperty("build.build_id", "<unknown>"));
            linkedHashMap.put("Build changelist", e.getProperty("build.changelist", BuildConfig.FLAVOR));
            linkedHashMap.put("Build changelist as int", e.getProperty("build.changelist.as.int", BuildConfig.FLAVOR));
            linkedHashMap.put("Build version map", e.getProperty("build.versionmap", BuildConfig.FLAVOR));
            linkedHashMap.put("Build client", e.getProperty("build.client", BuildConfig.FLAVOR));
            linkedHashMap.put("Build client mint status", e.getProperty("build.client_mint_status", BuildConfig.FLAVOR));
            linkedHashMap.put("Build depot path", e.getProperty("build.depot.path", BuildConfig.FLAVOR));
            linkedHashMap.put("Build baseline changelist as int", e.getProperty("build.baseline.changelist.as.int", BuildConfig.FLAVOR));
            linkedHashMap.put("Build label", e.getProperty("build.label", BuildConfig.FLAVOR));
            linkedHashMap.put("Build tool", e.getProperty("build.tool", BuildConfig.FLAVOR));
            linkedHashMap.put("Build gplatform", e.getProperty("build.gplatform", BuildConfig.FLAVOR));
            linkedHashMap.put("Mpm version", e.getProperty("build.mpm.version", BuildConfig.FLAVOR));
            linkedHashMap.put("Citc snapshot", e.getProperty("build.citc.snapshot", Integer.toString(-1)));
            linkedHashMap.put("Citc workspace id", e.getProperty("build.citc.workspace_id", BuildConfig.FLAVOR));
            linkedHashMap.put("Source URI", e.getProperty("build.source_uri", BuildConfig.FLAVOR));
            linkedHashMap.put("Verifiable", e.getProperty("build.verifiable", "0"));
            f184187b = linkedHashMap;
            return linkedHashMap;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0026 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.util.Properties m98226e() {
        /*
            java.lang.Class<com.google.y.a.a.c> r0 = com.google.p5274y.p5275a.p5276a.C67966c.class
            monitor-enter(r0)
            java.util.Properties r1 = f184186a     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0026
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            f184186a = r1     // Catch:{ all -> 0x002a }
            java.lang.Class<com.google.y.a.a.c> r1 = com.google.p5274y.p5275a.p5276a.C67966c.class
            java.lang.String r2 = "/build-data.properties"
            java.io.InputStream r1 = r1.getResourceAsStream(r2)     // Catch:{ IOException -> 0x0026 }
            if (r1 == 0) goto L_0x0026
            java.util.Properties r2 = f184186a     // Catch:{ all -> 0x0021 }
            r2.load(r1)     // Catch:{ all -> 0x0021 }
            r1.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x0026
        L_0x0021:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0026 }
            throw r2     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            java.util.Properties r1 = f184186a     // Catch:{ all -> 0x002a }
            monitor-exit(r0)
            return r1
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5274y.p5275a.p5276a.C67966c.m98226e():java.util.Properties");
    }
}
