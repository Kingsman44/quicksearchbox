package com.google.apps.tiktok.p3674l.p3680d;

import android.content.Context;
import android.content.res.Configuration;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;

/* renamed from: com.google.apps.tiktok.l.d.a */
/* compiled from: PG */
public final class C47401a {

    /* renamed from: a */
    private static final C59071e f123129a = C59071e.m91332i("com.google.apps.tiktok.l.d.a");

    /* renamed from: com.google.apps.tiktok.l.d.a$a */
    /* compiled from: PG */
    public interface C47402a {
        /* renamed from: dD */
        C58833ax mo51255dD();

        /* renamed from: dE */
        C58833ax mo51256dE();
    }

    /* renamed from: a */
    public static Context m84248a(Context context) {
        Locale c;
        C47402a aVar = (C47402a) C47266f.m84076a(context, C47402a.class);
        C58833ax dE = aVar.mo51256dE();
        if (!dE.mo56113h() || !((Boolean) dE.mo56107c()).booleanValue() || (c = m84250c(context, (C47411j) aVar.mo51255dD().mo56109e(C47411j.CREDENTIAL))) == null) {
            return context;
        }
        if (C58837ba.m90859h(c.getLanguage())) {
            ((C59052c) ((C59052c) f123129a.mo56225c()).mo56372aa(54789)).mo56386p("Read locale with empty language.");
            return context;
        }
        Locale.setDefault(c);
        Configuration configuration = new Configuration();
        configuration.setLocale(c);
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: b */
    public static void m84249b(Context context, Configuration configuration) {
        Locale c;
        C47402a aVar = (C47402a) C47266f.m84076a(context, C47402a.class);
        C58833ax dE = aVar.mo51256dE();
        if (dE.mo56113h() && ((Boolean) dE.mo56107c()).booleanValue()) {
            C47411j jVar = (C47411j) aVar.mo51255dD().mo56109e(C47411j.CREDENTIAL);
            if (configuration.getLocales().isEmpty() && (c = m84250c(context, jVar)) != null) {
                configuration.setLocale(c);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Locale m84250c(android.content.Context r7, com.google.apps.tiktok.p3674l.p3680d.C47411j r8) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            com.google.apps.tiktok.l.d.h r2 = com.google.apps.tiktok.p3674l.p3680d.C47409h.f123141a     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            com.google.common.base.ax r4 = r2.f123143b     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            r5 = 1
            if (r4 != 0) goto L_0x003a
            monitor-enter(r2)     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            com.google.common.base.ax r4 = r2.f123143b     // Catch:{ all -> 0x0037 }
            if (r4 != 0) goto L_0x0035
            java.io.File r4 = com.google.apps.tiktok.p3674l.p3680d.C47409h.m84254a(r7, r8)     // Catch:{ all -> 0x0037 }
            com.google.common.base.ax r4 = com.google.apps.tiktok.p3674l.p3680d.C47409h.m84255b(r4, r3)     // Catch:{ all -> 0x0037 }
            com.google.apps.tiktok.l.d.j r6 = com.google.apps.tiktok.p3674l.p3680d.C47411j.DEVICE     // Catch:{ all -> 0x0037 }
            if (r8 != r6) goto L_0x0033
            boolean r8 = r4.mo56113h()     // Catch:{ all -> 0x0037 }
            if (r8 != 0) goto L_0x0033
            r2.f123144c = r5     // Catch:{ all -> 0x0037 }
            com.google.apps.tiktok.l.d.j r8 = com.google.apps.tiktok.p3674l.p3680d.C47411j.CREDENTIAL     // Catch:{ all -> 0x0037 }
            java.io.File r7 = com.google.apps.tiktok.p3674l.p3680d.C47409h.m84254a(r7, r8)     // Catch:{ all -> 0x0037 }
            com.google.common.base.ax r4 = com.google.apps.tiktok.p3674l.p3680d.C47409h.m84255b(r7, r3)     // Catch:{ all -> 0x0037 }
        L_0x0033:
            r2.f123143b = r4     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r7     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
        L_0x003a:
            boolean r7 = r4.mo56113h()     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r4.mo56107c()     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            com.google.apps.tiktok.l.d.e r7 = (com.google.apps.tiktok.p3674l.p3680d.C47406e) r7     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            int r8 = r7.f123138a     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            if (r8 != r5) goto L_0x0063
            java.util.Locale$Builder r8 = new java.util.Locale$Builder     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            r8.<init>()     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            java.lang.String r2 = ""
            int r3 = r7.f123138a     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            if (r3 != r5) goto L_0x005a
            java.lang.Object r7 = r7.f123139b     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
        L_0x005a:
            java.util.Locale$Builder r7 = r8.setLanguageTag(r2)     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            java.util.Locale r1 = r7.build()     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            goto L_0x0076
        L_0x0063:
            r2 = 2
            if (r8 != r2) goto L_0x0076
            java.lang.Object r7 = r7.f123139b     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            com.google.apps.tiktok.l.d.c r7 = (com.google.apps.tiktok.p3674l.p3680d.C47404c) r7     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            java.util.Locale r8 = new java.util.Locale     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            java.lang.String r2 = r7.f123132a     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            java.lang.String r3 = r7.f123133b     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            java.lang.String r7 = r7.f123134c     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            r8.<init>(r2, r3, r7)     // Catch:{ IOException -> 0x007e, RuntimeException -> 0x007c }
            r1 = r8
        L_0x0076:
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x009c
        L_0x007a:
            r7 = move-exception
            goto L_0x009d
        L_0x007c:
            r7 = move-exception
            goto L_0x007f
        L_0x007e:
            r7 = move-exception
        L_0x007f:
            com.google.common.f.e r8 = f123129a     // Catch:{ all -> 0x007a }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x007a }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x007a }
            com.google.common.f.x r7 = r8.mo56382g(r7)     // Catch:{ all -> 0x007a }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x007a }
            r8 = 54790(0xd606, float:7.6777E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ all -> 0x007a }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x007a }
            java.lang.String r8 = "Failed to read custom locale."
            r7.mo56386p(r8)     // Catch:{ all -> 0x007a }
            goto L_0x0076
        L_0x009c:
            return r1
        L_0x009d:
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x00a2
        L_0x00a1:
            throw r7
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3674l.p3680d.C47401a.m84250c(android.content.Context, com.google.apps.tiktok.l.d.j):java.util.Locale");
    }
}
