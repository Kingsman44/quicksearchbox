package com.google.android.libraries.search.assistant.performer.p2753e;

import android.content.Context;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.e.k */
/* compiled from: PG */
public final class C35998k implements C35990c {

    /* renamed from: a */
    public static final C59071e f94193a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.e.k");

    /* renamed from: b */
    public final C47449e f94194b;

    /* renamed from: c */
    public final Executor f94195c;

    /* renamed from: d */
    private final Context f94196d;

    /* renamed from: e */
    private final C60950i f94197e;

    /* renamed from: f */
    private final SortedMap f94198f = new TreeMap();

    /* renamed from: g */
    private C35989b f94199g = C35989b.UNDEFINED;

    public C35998k(C47449e eVar, Context context, C60950i iVar, C60888db dbVar) {
        this.f94194b = eVar;
        this.f94196d = context;
        this.f94197e = iVar;
        this.f94195c = new C60904dr(dbVar);
    }

    /* renamed from: g */
    private final synchronized boolean m64381g() {
        return this.f94199g.equals(C35989b.DOWNLOADING);
    }

    /* renamed from: h */
    private final synchronized void m64382h() {
        if (!m64381g()) {
            this.f94199g = C35989b.DOWNLOADING;
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx mo39918a(List list) {
        C60870cx e;
        C35997j jVar;
        e = mo39924e(list);
        jVar = new C35997j(this);
        return C60922j.m93045h(e, C47810es.m84966f(jVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final synchronized Optional mo39921b() {
        if (!this.f94198f.isEmpty()) {
            return Optional.m71637of(C58485gu.m89842j(this.f94198f.values()));
        }
        return Optional.empty();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0081 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39922c(int r7, android.graphics.Bitmap r8) {
        /*
            r6 = this;
            java.lang.String r0 = "photo_"
            monitor-enter(r6)
            android.content.Context r1 = r6.f94196d     // Catch:{ all -> 0x00a2 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            java.util.SortedMap r2 = r6.f94198f     // Catch:{ all -> 0x00a2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a2 }
            com.google.common.v.i r3 = r6.f94197e     // Catch:{ all -> 0x00a2 }
            int r4 = com.google.android.libraries.search.assistant.performer.p2753e.C35988a.f94176a     // Catch:{ all -> 0x00a2 }
            j$.time.Instant r3 = r3.mo57444a()     // Catch:{ all -> 0x00a2 }
            long r3 = r3.toEpochMilli()     // Catch:{ all -> 0x00a2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r5.<init>(r0)     // Catch:{ all -> 0x00a2 }
            r5.append(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = ".png"
            r5.append(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00a2 }
            java.io.File r0 = com.google.android.libraries.search.assistant.performer.p2753e.C35988a.m64378b(r0, r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = r1.getPackageName()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = ".PhotoContentProvider"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00a2 }
            androidx.core.content.j r1 = androidx.core.content.FileProvider.m5057a(r1, r3)     // Catch:{ all -> 0x00a2 }
            android.net.Uri r0 = r1.mo5044a(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x009a
            android.content.Context r3 = r6.f94196d     // Catch:{ all -> 0x00a2 }
            java.io.File r1 = com.google.android.libraries.search.assistant.performer.p2753e.C35988a.m64378b(r1, r3)     // Catch:{ all -> 0x00a2 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0082 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0082 }
            r4 = 0
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0065 }
            r8.compress(r5, r4, r3)     // Catch:{ all -> 0x0065 }
            r3.close()     // Catch:{ IOException -> 0x0082 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r6)
            return
        L_0x0065:
            r7 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
            goto L_0x0081
        L_0x006a:
            r8 = move-exception
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r2[r4] = r3     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0081 }
            r0[r4] = r8     // Catch:{ Exception -> 0x0081 }
            r2.invoke(r7, r0)     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            throw r7     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            r7 = move-exception
            r1.delete()     // Catch:{ all -> 0x00a2 }
            com.google.common.base.dd r8 = new com.google.common.base.dd     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "Cannot create photo file "
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00a2 }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x00a2 }
            throw r8     // Catch:{ all -> 0x00a2 }
        L_0x009a:
            com.google.common.base.dd r7 = new com.google.common.base.dd     // Catch:{ all -> 0x00a2 }
            java.lang.String r8 = "Invalid file name for photo file"
            r7.<init>((java.lang.String) r8)     // Catch:{ all -> 0x00a2 }
            throw r7     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2753e.C35998k.mo39922c(int, android.graphics.Bitmap):void");
    }

    /* renamed from: d */
    public final synchronized void mo39923d() {
        File[] listFiles = new File(this.f94196d.getCacheDir(), "personal_photos").listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* renamed from: e */
    public final synchronized C60870cx mo39924e(List list) {
        C60870cx l;
        C35993f fVar;
        mo39925f();
        this.f94198f.clear();
        C35991d dVar = new C35991d(this);
        l = C60856cj.m92903l(C47810es.m84977q(dVar), this.f94195c);
        m64382h();
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            C35992e eVar = new C35992e(this, i, list);
            arrayList.add(C60856cj.m92905n(C47810es.m84965e(eVar), this.f94195c));
        }
        fVar = new C35993f(this, arrayList);
        return C60922j.m93045h(l, C47810es.m84966f(fVar), this.f94195c);
    }

    /* renamed from: f */
    public final synchronized void mo39925f() {
        if (m64381g()) {
            this.f94199g = C35989b.DONE;
        }
    }
}
