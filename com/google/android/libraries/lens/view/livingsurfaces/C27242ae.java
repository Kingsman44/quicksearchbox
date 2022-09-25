package com.google.android.libraries.lens.view.livingsurfaces;

import android.webkit.WebView;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ae */
/* compiled from: PG */
public final class C27242ae implements C27260s {

    /* renamed from: a */
    public static final C58974d f74518a = C58974d.m91136j();

    /* renamed from: d */
    private static final Pattern f74519d = Pattern.compile("^[\\w-_]+$");

    /* renamed from: b */
    public final Object f74520b = new Object();

    /* renamed from: c */
    public WebView f74521c;

    /* renamed from: e */
    private final Executor f74522e;

    /* renamed from: f */
    private final C68214a f74523f;

    /* renamed from: g */
    private final C37215b f74524g;

    /* renamed from: h */
    private final C25459e f74525h;

    /* renamed from: i */
    private final C28310af f74526i;

    /* renamed from: j */
    private final C28443m f74527j;

    /* renamed from: k */
    private final C28306ab f74528k;

    public C27242ae(Executor executor, C68214a aVar, C37215b bVar, C25459e eVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        this.f74522e = executor;
        this.f74523f = aVar;
        this.f74524g = bVar;
        this.f74525h = eVar;
        this.f74526i = afVar;
        this.f74527j = mVar;
        this.f74528k = abVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00fb */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.lens.view.livingsurfaces.C27259r mo32753a(com.google.android.libraries.lens.view.livingsurfaces.C27268v r20) {
        /*
            r19 = this;
            r12 = r19
            r0 = r20
            com.google.android.libraries.lens.view.livingsurfaces.a r0 = (com.google.android.libraries.lens.view.livingsurfaces.C27233a) r0
            android.content.Context r1 = r0.f74494a
            float r2 = r0.f74498e
            android.widget.FrameLayout$LayoutParams r4 = com.google.android.libraries.lens.view.livingsurfaces.C27245d.m50630b(r2)
            com.google.common.base.ax r0 = r0.f74497d
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r4.width
            int r3 = r4.height
            java.util.regex.Pattern r5 = f74519d
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.matches()
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x002c
            java.lang.String r0 = ""
        L_0x002a:
            r15 = r0
            goto L_0x0076
        L_0x002c:
            android.content.res.Resources r5 = r1.getResources()     // Catch:{ IOException -> 0x00fc }
            r8 = 2132017483(0x7f14014b, float:1.9673246E38)
            java.io.InputStream r5 = r5.openRawResource(r8)     // Catch:{ IOException -> 0x00fc }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x00dc }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ all -> 0x00dc }
            java.nio.charset.Charset r10 = p3186j$.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x00dc }
            r9.<init>(r5, r10)     // Catch:{ all -> 0x00dc }
            r8.<init>(r9)     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r9.<init>()     // Catch:{ all -> 0x00dc }
        L_0x0048:
            java.lang.String r10 = r8.readLine()     // Catch:{ all -> 0x00dc }
            if (r10 == 0) goto L_0x0052
            r9.append(r10)     // Catch:{ all -> 0x00dc }
            goto L_0x0048
        L_0x0052:
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = "<VIDEO_ID>"
            java.lang.String r0 = r8.replace(r9, r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r8 = "<VIDEO_WIDTH>"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r0.replace(r8, r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = "<VIDEO_HEIGHT>"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r0.replace(r2, r3)     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x002a
            r5.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x002a
        L_0x0076:
            android.webkit.WebView r0 = new android.webkit.WebView
            r0.<init>(r1)
            r0.setInitialScale(r7)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setJavaScriptEnabled(r7)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setMediaPlaybackRequiresUserGesture(r6)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setLoadWithOverviewMode(r7)
            android.webkit.WebSettings r1 = r0.getSettings()
            r1.setUseWideViewPort(r7)
            com.google.android.libraries.lens.view.livingsurfaces.y r14 = new com.google.android.libraries.lens.view.livingsurfaces.y
            dagger.a r1 = r12.f74523f
            java.lang.Object r1 = r1.mo27525b()
            r5 = r1
            com.google.android.libraries.lens.view.livingsurfaces.j r5 = (com.google.android.libraries.lens.view.livingsurfaces.C27251j) r5
            com.google.android.libraries.search.b.b r6 = r12.f74524g
            com.google.android.libraries.lens.view.ao.e r7 = r12.f74525h
            com.google.android.libraries.logging.ve.af r9 = r12.f74526i
            com.google.android.libraries.logging.ve.m r10 = r12.f74527j
            com.google.android.libraries.logging.ve.ab r11 = r12.f74528k
            r1 = r14
            r2 = r19
            r3 = r0
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "http://com.google.android.libraries.lens/"
            java.lang.String r16 = "text/html"
            java.lang.String r17 = "UTF-8"
            r18 = 0
            r13 = r0
            r2 = r14
            r14 = r1
            r13.loadDataWithBaseURL(r14, r15, r16, r17, r18)
            com.google.android.libraries.lens.view.livingsurfaces.ad r1 = new com.google.android.libraries.lens.view.livingsurfaces.ad
            java.util.concurrent.Executor r3 = r12.f74522e
            r1.<init>(r3, r2)
            java.lang.String r3 = "LensAppHost"
            r0.addJavascriptInterface(r1, r3)
            java.lang.Object r1 = r12.f74520b
            monitor-enter(r1)
            r12.f74521c = r0     // Catch:{ all -> 0x00d9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d9 }
            return r2
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d9 }
            throw r0
        L_0x00dc:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L_0x00fb
            r5.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x00fb
        L_0x00e4:
            r0 = move-exception
            r2 = r0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x00fb }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r0[r6] = r3     // Catch:{ Exception -> 0x00fb }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x00fb }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00fb }
            r3[r6] = r2     // Catch:{ Exception -> 0x00fb }
            r0.invoke(r1, r3)     // Catch:{ Exception -> 0x00fb }
        L_0x00fb:
            throw r1     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            goto L_0x0104
        L_0x0103:
            throw r1
        L_0x0104:
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.livingsurfaces.C27242ae.mo32753a(com.google.android.libraries.lens.view.livingsurfaces.v):com.google.android.libraries.lens.view.livingsurfaces.r");
    }
}
