package com.google.android.apps.search.assistant.surfaces.appactions.service;

import com.google.android.libraries.appactions.service.C147861c;
import com.google.android.libraries.appactions.service.ShortcutLookupRequest;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p386ak.C8398n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.b */
/* compiled from: PG */
final class C124370b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f343280a;

    /* renamed from: b */
    final /* synthetic */ boolean f343281b;

    /* renamed from: c */
    final /* synthetic */ String f343282c;

    /* renamed from: d */
    final /* synthetic */ C8398n f343283d;

    /* renamed from: e */
    final /* synthetic */ ShortcutLookupRequest f343284e;

    /* renamed from: f */
    final /* synthetic */ C124371c f343285f;

    /* renamed from: g */
    final /* synthetic */ C147861c f343286g;

    public C124370b(C124371c cVar, String str, boolean z, C147861c cVar2, String str2, C8398n nVar, ShortcutLookupRequest shortcutLookupRequest) {
        this.f343285f = cVar;
        this.f343280a = str;
        this.f343281b = z;
        this.f343286g = cVar2;
        this.f343282c = str2;
        this.f343283d = nVar;
        this.f343284e = shortcutLookupRequest;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C147861c cVar = this.f343286g;
        C58974d dVar = C124371c.f343287a;
        if (!(th instanceof GellerException)) {
            C124371c.m203827a(cVar, 1001, "Internal exception.", th);
        } else if (((GellerException) th).f60397a == C62722b.INVALID_ARGUMENT) {
            C124371c.m203827a(cVar, 1001, "User account error.", th);
        } else {
            C124371c.m203827a(cVar, 1001, "Failed to fetch user shortcuts.", th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.google.assistant.an.c.a.ca} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(2:94|95)|96|97) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:17|(9:18|19|20|21|22|23|24|25|26)|40|41|(1:43)(4:44|(1:46)(2:47|(1:49)(1:50))|51|(1:(1:129)(3:53|(2:55|130)(3:56|(2:58|(4:128|60|(1:67)(1:62)|(5:73|(1:75)(2:77|(1:79)(2:80|(3:82|83|(1:85)(0))(0)))|76|83|(0)(0))(0))(1:87))|131)|88)))|89|90|91|92) */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0194, code lost:
        if (java.util.Arrays.equals(r0, r4) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01a8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A[SYNTHETIC, Splitter:B:36:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5 A[Catch:{ NameNotFoundException -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[Catch:{ NameNotFoundException -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0190 A[Catch:{ NameNotFoundException -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a5 A[SYNTHETIC, Splitter:B:94:0x01a5] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00b1=Splitter:B:40:0x00b1, B:96:0x01a8=Splitter:B:96:0x01a8} */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17911gm(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "Failed to verify the APK signature. If this is a development build, please make sure to update the preview of your app in App Actions Test Tool."
            r3 = r21
            com.google.assistant.an.c.a.cd r3 = (com.google.assistant.p3825an.p3830c.p3831a.C49312cd) r3
            com.google.android.apps.search.assistant.surfaces.appactions.service.c r0 = r1.f343285f
            java.lang.String r4 = r1.f343280a
            boolean r5 = r1.f343281b
            com.google.android.libraries.appactions.service.c r6 = r1.f343286g
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x01b3
            com.google.protobuf.cq r5 = r3.f127454b
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L_0x001e
            goto L_0x01b3
        L_0x001e:
            android.content.Context r9 = r0.f343288b     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r10 == 0) goto L_0x01a9
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo     // Catch:{ NameNotFoundException -> 0x01ae }
            boolean r10 = r10.enabled     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r10 != 0) goto L_0x0034
            goto L_0x01a9
        L_0x0034:
            com.google.android.apps.search.assistant.surfaces.appactions.b.a.a r0 = r0.f343292f     // Catch:{ NameNotFoundException -> 0x01ae }
            long r9 = androidx.core.content.p090a.C1846a.m5060a(r9)     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.Context r11 = r0.f343275a     // Catch:{ NameNotFoundException -> 0x01ae }
            com.google.android.gms.common.e.c r0 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ NameNotFoundException -> 0x01ae }
            com.google.android.gms.common.e.b r0 = r0.mo119351a(r11)     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.PackageInfo r0 = r0.mo119348b(r4, r7)     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r0 != 0) goto L_0x004e
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0052
        L_0x004e:
            long r12 = r0.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x01ae }
        L_0x0052:
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ NameNotFoundException -> 0x01ae }
            goto L_0x01b3
        L_0x005b:
            com.google.android.gms.common.e.c r0 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ NameNotFoundException -> 0x01ae }
            com.google.android.gms.common.e.b r0 = r0.mo119351a(r11)     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.ApplicationInfo r0 = r0.mo119347a(r4, r7)     // Catch:{ NameNotFoundException -> 0x01ae }
            java.io.File r9 = new java.io.File     // Catch:{ NameNotFoundException -> 0x01ae }
            java.lang.String r0 = r0.sourceDir     // Catch:{ NameNotFoundException -> 0x01ae }
            r9.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01ae }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x01ae }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x01ae }
            java.io.RandomAccessFile r12 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x009b, all -> 0x0097 }
            java.lang.String r13 = "r"
            r12.<init>(r9, r13)     // Catch:{ IOException -> 0x009b, all -> 0x0097 }
            long r18 = r12.length()     // Catch:{ IOException -> 0x0095 }
            java.nio.channels.FileChannel r15 = r12.getChannel()     // Catch:{ IOException -> 0x0095 }
            r15.getClass()
            com.android.a.b.b.c r9 = new com.android.a.b.b.c     // Catch:{ IOException -> 0x0095 }
            r16 = 0
            r14 = r9
            r14.<init>(r15, r16, r18)     // Catch:{ IOException -> 0x0095 }
            com.android.a.d r0 = com.android.p247a.C5014e.m13804b(r9, r0, r10)     // Catch:{ IOException -> 0x0095 }
            r12.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b1
        L_0x0092:
            r0 = move-exception
            goto L_0x01a3
        L_0x0095:
            r0 = move-exception
            goto L_0x009d
        L_0x0097:
            r0 = move-exception
            r12 = 0
            goto L_0x01a3
        L_0x009b:
            r0 = move-exception
            r12 = 0
        L_0x009d:
            com.android.a.d r9 = new com.android.a.d     // Catch:{ all -> 0x0092 }
            r9.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x0092 }
            r10[r7] = r0     // Catch:{ all -> 0x0092 }
            r0 = 29
            r9.mo9967a(r0, r10)     // Catch:{ all -> 0x0092 }
            if (r12 == 0) goto L_0x00b0
            r12.close()     // Catch:{ IOException -> 0x00b0 }
        L_0x00b0:
            r0 = r9
        L_0x00b1:
            boolean r9 = r0.f15877e     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r9 != 0) goto L_0x00ba
            com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ NameNotFoundException -> 0x01ae }
            goto L_0x019e
        L_0x00ba:
            com.android.a.c r9 = r0.f15876d     // Catch:{ NameNotFoundException -> 0x01ae }
            java.util.List r10 = r9.f15868a     // Catch:{ NameNotFoundException -> 0x01ae }
            boolean r10 = r10.isEmpty()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r10 != 0) goto L_0x00cb
            java.util.List r9 = r9.f15868a     // Catch:{ NameNotFoundException -> 0x01ae }
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89842j(r9)     // Catch:{ NameNotFoundException -> 0x01ae }
            goto L_0x00de
        L_0x00cb:
            java.security.cert.X509Certificate r10 = r9.mo9966a()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r10 == 0) goto L_0x00da
            java.security.cert.X509Certificate r9 = r9.mo9966a()     // Catch:{ NameNotFoundException -> 0x01ae }
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89846n(r9)     // Catch:{ NameNotFoundException -> 0x01ae }
            goto L_0x00de
        L_0x00da:
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ NameNotFoundException -> 0x01ae }
        L_0x00de:
            com.google.common.b.gu r10 = com.google.android.gms.common.C143703ae.f389607a     // Catch:{ NameNotFoundException -> 0x01ae }
            int r12 = r9.size()     // Catch:{ NameNotFoundException -> 0x01ae }
            r13 = 0
        L_0x00e5:
            if (r13 >= r12) goto L_0x019e
            java.lang.Object r14 = r9.get(r13)     // Catch:{ NameNotFoundException -> 0x01ae }
            java.security.cert.X509Certificate r14 = (java.security.cert.X509Certificate) r14     // Catch:{ NameNotFoundException -> 0x01ae }
            byte[] r14 = com.google.android.gms.common.C143704af.m233458a(r14)     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r14 != 0) goto L_0x00fc
            java.lang.String r14 = "GoogleSourceStampsChkr"
            java.lang.String r15 = "Unable to encode stamp from X509Certificate"
            android.util.Log.w(r14, r15)     // Catch:{ NameNotFoundException -> 0x01ae }
            goto L_0x019a
        L_0x00fc:
            r15 = r10
            com.google.common.b.pq r15 = (com.google.common.p4522b.C58724pq) r15     // Catch:{ NameNotFoundException -> 0x01ae }
            int r15 = r15.f156474d     // Catch:{ NameNotFoundException -> 0x01ae }
            r5 = 0
        L_0x0102:
            if (r5 >= r15) goto L_0x019a
            java.lang.Object r16 = r10.get(r5)     // Catch:{ NameNotFoundException -> 0x01ae }
            r7 = r16
            com.google.android.gms.common.ad r7 = (com.google.android.gms.common.C143702ad) r7     // Catch:{ NameNotFoundException -> 0x01ae }
            byte[] r7 = r7.f389606a     // Catch:{ NameNotFoundException -> 0x01ae }
            boolean r7 = java.util.Arrays.equals(r14, r7)     // Catch:{ NameNotFoundException -> 0x01ae }
            int r5 = r5 + 1
            if (r7 == 0) goto L_0x0197
            com.google.android.gms.common.e.c r5 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ NameNotFoundException -> 0x01ae }
            com.google.android.gms.common.e.b r5 = r5.mo119351a(r11)     // Catch:{ NameNotFoundException -> 0x01ae }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r4 = r5.mo119348b(r4, r7)     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r4 != 0) goto L_0x0126
        L_0x0124:
            r4 = 0
            goto L_0x0140
        L_0x0126:
            android.content.pm.SigningInfo r5 = r4.signingInfo     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 == 0) goto L_0x0124
            android.content.pm.SigningInfo r5 = r4.signingInfo     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch:{ NameNotFoundException -> 0x01ae }
            int r5 = r5.length     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 != r8) goto L_0x0124
            android.content.pm.SigningInfo r4 = r4.signingInfo     // Catch:{ NameNotFoundException -> 0x01ae }
            android.content.pm.Signature[] r4 = r4.getApkContentsSigners()     // Catch:{ NameNotFoundException -> 0x01ae }
            r5 = 0
            r4 = r4[r5]     // Catch:{ NameNotFoundException -> 0x01ae }
            byte[] r4 = r4.toByteArray()     // Catch:{ NameNotFoundException -> 0x01ae }
        L_0x0140:
            if (r4 == 0) goto L_0x019e
            java.util.List r5 = r0.f15874b     // Catch:{ NameNotFoundException -> 0x01ae }
            int r5 = r5.size()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 > r8) goto L_0x019e
            java.util.List r5 = r0.f15875c     // Catch:{ NameNotFoundException -> 0x01ae }
            int r5 = r5.size()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 > r8) goto L_0x019e
            java.util.List r5 = r0.f15875c     // Catch:{ NameNotFoundException -> 0x01ae }
            boolean r5 = r5.isEmpty()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 != 0) goto L_0x0165
            java.util.List r0 = r0.f15875c     // Catch:{ NameNotFoundException -> 0x01ae }
            r5 = 0
            java.lang.Object r0 = r0.get(r5)     // Catch:{ NameNotFoundException -> 0x01ae }
            com.android.a.b r0 = (com.android.p247a.C4984b) r0     // Catch:{ NameNotFoundException -> 0x01ae }
        L_0x0163:
            r7 = 0
            goto L_0x0188
        L_0x0165:
            java.util.List r5 = r0.f15874b     // Catch:{ NameNotFoundException -> 0x01ae }
            boolean r5 = r5.isEmpty()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 != 0) goto L_0x0177
            java.util.List r0 = r0.f15874b     // Catch:{ NameNotFoundException -> 0x01ae }
            r5 = 0
            java.lang.Object r0 = r0.get(r5)     // Catch:{ NameNotFoundException -> 0x01ae }
            com.android.a.b r0 = (com.android.p247a.C4984b) r0     // Catch:{ NameNotFoundException -> 0x01ae }
            goto L_0x0163
        L_0x0177:
            java.util.List r5 = r0.f15873a     // Catch:{ NameNotFoundException -> 0x01ae }
            boolean r5 = r5.isEmpty()     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r5 != 0) goto L_0x019e
            java.util.List r0 = r0.f15873a     // Catch:{ NameNotFoundException -> 0x01ae }
            r7 = 0
            java.lang.Object r0 = r0.get(r7)     // Catch:{ NameNotFoundException -> 0x01ae }
            com.android.a.b r0 = (com.android.p247a.C4984b) r0     // Catch:{ NameNotFoundException -> 0x01ae }
        L_0x0188:
            java.security.cert.X509Certificate r0 = r0.f15800a     // Catch:{ NameNotFoundException -> 0x01ae }
            byte[] r0 = com.google.android.gms.common.C143704af.m233458a(r0)     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r0 == 0) goto L_0x019e
            boolean r0 = java.util.Arrays.equals(r0, r4)     // Catch:{ NameNotFoundException -> 0x01ae }
            if (r0 == 0) goto L_0x019e
            goto L_0x01b3
        L_0x0197:
            r7 = 0
            goto L_0x0102
        L_0x019a:
            int r13 = r13 + 1
            goto L_0x00e5
        L_0x019e:
            r3 = 0
            com.google.android.apps.search.assistant.surfaces.appactions.service.C124371c.m203827a(r6, r8, r2, r3)     // Catch:{ NameNotFoundException -> 0x01af }
            return
        L_0x01a3:
            if (r12 == 0) goto L_0x01a8
            r12.close()     // Catch:{ IOException -> 0x01a8 }
        L_0x01a8:
            throw r0     // Catch:{ NameNotFoundException -> 0x01ae }
        L_0x01a9:
            r3 = 0
            com.google.android.apps.search.assistant.surfaces.appactions.service.C124371c.m203827a(r6, r8, r2, r3)     // Catch:{ NameNotFoundException -> 0x01af }
            return
        L_0x01ae:
            r3 = 0
        L_0x01af:
            com.google.android.apps.search.assistant.surfaces.appactions.service.C124371c.m203827a(r6, r8, r2, r3)
            return
        L_0x01b3:
            com.google.android.libraries.appactions.service.c r0 = r1.f343286g
            java.lang.String r2 = r1.f343280a
            java.lang.String r4 = r1.f343282c
            com.google.ak.n r5 = r1.f343283d
            com.google.assistant.an.c.a.ca r6 = com.google.assistant.p3825an.p3830c.p3831a.C49309ca.f127447b
            com.google.protobuf.dn r3 = r3.f127453a
            boolean r9 = r3.containsKey(r2)
            if (r9 == 0) goto L_0x01cc
            java.lang.Object r2 = r3.get(r2)
            r6 = r2
            com.google.assistant.an.c.a.ca r6 = (com.google.assistant.p3825an.p3830c.p3831a.C49309ca) r6
        L_0x01cc:
            com.google.protobuf.cq r2 = r6.f127449a
            java.util.Iterator r2 = r2.iterator()
        L_0x01d2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01f3
            java.lang.Object r3 = r2.next()
            com.google.assistant.an.c.a.by r3 = (com.google.assistant.p3825an.p3830c.p3831a.C49306by) r3
            java.lang.String r6 = r3.f127437a
            boolean r6 = android.text.TextUtils.equals(r6, r4)
            if (r6 == 0) goto L_0x01d2
            com.google.protobuf.ga r3 = r3.f127438b
            if (r3 != 0) goto L_0x01ec
            com.google.protobuf.ga r3 = com.google.protobuf.C63063ga.f170179c
        L_0x01ec:
            boolean r3 = com.google.android.apps.search.assistant.surfaces.appactions.service.C124380k.m203841a(r3, r5)
            if (r3 == 0) goto L_0x01d2
            r7 = 1
        L_0x01f3:
            com.google.android.libraries.appactions.service.ShortcutLookupRequest r2 = r1.f343284e
            com.google.common.f.a.d r3 = com.google.android.apps.search.assistant.surfaces.appactions.service.C124371c.f343287a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            r4 = 36224(0x8d80, float:5.076E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r4 = "Calling back the client with isShortcutPresent = %s, for appAction = %s"
            r3.mo56357J(r4, r7, r2)
            android.os.Parcel r3 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x0219 }
            com.google.android.p445a.C8850c.m23495d(r3, r7)     // Catch:{ RemoteException -> 0x0219 }
            com.google.android.p445a.C8850c.m23497f(r3, r2)     // Catch:{ RemoteException -> 0x0219 }
            r0.mo17263hf(r8, r3)     // Catch:{ RemoteException -> 0x0219 }
            return
        L_0x0219:
            r0 = move-exception
            com.google.common.f.a.d r2 = com.google.android.apps.search.assistant.surfaces.appactions.service.C124371c.f343287a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Callback failed"
            r4 = 36225(0x8d81, float:5.0762E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.appactions.service.C124370b.mo17911gm(java.lang.Object):void");
    }
}
