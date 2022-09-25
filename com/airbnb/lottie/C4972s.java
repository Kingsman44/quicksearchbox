package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.p238c.C4892g;
import com.airbnb.lottie.p243e.C4936t;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p245f.C4954k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p5589m.C71831h;
import p5589m.C71832i;
import p5589m.C71834k;
import p5589m.C71835l;

/* renamed from: com.airbnb.lottie.s */
/* compiled from: PG */
public final class C4972s {

    /* renamed from: a */
    public static final Map f15780a = new HashMap();

    /* renamed from: b */
    private static final C71832i f15781b = C71831h.m105171b(80, 75, 3, 4);

    static {
        C71832i iVar = C71832i.f191357a;
    }

    /* renamed from: a */
    public static C4830ah m13743a(Context context, String str) {
        return m13744b(context, str, "asset_".concat(String.valueOf(str)));
    }

    /* renamed from: b */
    public static C4830ah m13744b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return m13755m(context.getAssets().open(str), str2);
                }
            }
            return m13747e(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C4830ah((Throwable) e);
        }
    }

    /* renamed from: c */
    public static C4830ah m13745c(String str, String str2) {
        return m13756n(C4908e.m13603e(C71835l.m105189b(C71834k.m105185b(new ByteArrayInputStream(str.getBytes())))), str2, true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:81|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = com.airbnb.lottie.p245f.C4947d.f15711a;
        r0 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01d0 */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015b A[Catch:{ Exception -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0157 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.C4830ah m13746d(android.content.Context r23, int r24, java.lang.String r25) {
        /*
            r0 = r25
            java.lang.String r1 = "bytes"
            android.content.res.Resources r2 = r23.getResources()     // Catch:{ NotFoundException -> 0x0202 }
            r3 = r24
            java.io.InputStream r2 = r2.openRawResource(r3)     // Catch:{ NotFoundException -> 0x0202 }
            m.x r2 = p5589m.C71834k.m105185b(r2)     // Catch:{ NotFoundException -> 0x0202 }
            m.g r2 = p5589m.C71835l.m105189b(r2)     // Catch:{ NotFoundException -> 0x0202 }
            r3 = 0
            m.i r4 = f15781b     // Catch:{ Exception -> 0x01ce }
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r1)     // Catch:{ Exception -> 0x01ce }
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r1)     // Catch:{ Exception -> 0x01ce }
            r5 = r2
            m.r r5 = (p5589m.C71841r) r5     // Catch:{ Exception -> 0x01ce }
            boolean r5 = r5.f191372c     // Catch:{ Exception -> 0x01ce }
            if (r5 != 0) goto L_0x01c4
            r5 = 0
            r7 = r5
        L_0x0029:
            r9 = r2
            m.r r9 = (p5589m.C71841r) r9     // Catch:{ Exception -> 0x01ce }
            m.e r9 = r9.f191371b     // Catch:{ Exception -> 0x01ce }
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r1)     // Catch:{ Exception -> 0x01ce }
            byte[] r10 = r4.f191358b     // Catch:{ Exception -> 0x01ce }
            int r10 = r10.length     // Catch:{ Exception -> 0x01ce }
            if (r10 <= 0) goto L_0x01ba
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x01a0
            m.s r10 = r9.f191355a     // Catch:{ Exception -> 0x01ce }
            r11 = 1
            if (r10 != 0) goto L_0x004e
        L_0x0040:
            r21 = r1
            r20 = r2
            r22 = r4
        L_0x0046:
            r18 = r7
            r0 = -1
        L_0x004a:
            r2 = -1
            goto L_0x0153
        L_0x004e:
            long r5 = r9.f191356b     // Catch:{ Exception -> 0x01ce }
            long r15 = r5 - r7
            int r17 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r17 >= 0) goto L_0x00cc
        L_0x0056:
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x0067
            m.s r10 = r10.f191379g     // Catch:{ Exception -> 0x01ce }
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)     // Catch:{ Exception -> 0x01ce }
            int r15 = r10.f191375c     // Catch:{ Exception -> 0x01ce }
            int r13 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            int r15 = r15 - r13
            long r13 = (long) r15     // Catch:{ Exception -> 0x01ce }
            long r5 = r5 - r13
            goto L_0x0056
        L_0x0067:
            if (r10 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            byte[] r13 = r4.f191358b     // Catch:{ Exception -> 0x01ce }
            byte r14 = r13[r3]     // Catch:{ Exception -> 0x01ce }
            int r15 = r13.length     // Catch:{ Exception -> 0x01ce }
            r18 = r4
            long r3 = r9.f191356b     // Catch:{ Exception -> 0x01ce }
            r19 = r5
            long r5 = (long) r15     // Catch:{ Exception -> 0x01ce }
            long r3 = r3 - r5
            long r3 = r3 + r11
            r5 = r19
            r19 = r7
        L_0x007c:
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c9
            byte[] r9 = r10.f191373a     // Catch:{ Exception -> 0x01ce }
            int r11 = r10.f191375c     // Catch:{ Exception -> 0x01ce }
            long r11 = (long) r11     // Catch:{ Exception -> 0x01ce }
            r21 = r1
            int r1 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            long r0 = (long) r1     // Catch:{ Exception -> 0x01ce }
            long r0 = r0 + r3
            long r0 = r0 - r5
            long r0 = java.lang.Math.min(r11, r0)     // Catch:{ Exception -> 0x01ce }
            int r1 = (int) r0     // Catch:{ Exception -> 0x01ce }
            int r0 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            long r11 = (long) r0     // Catch:{ Exception -> 0x01ce }
            long r11 = r11 + r19
            long r11 = r11 - r5
            int r0 = (int) r11     // Catch:{ Exception -> 0x01ce }
        L_0x0098:
            if (r0 >= r1) goto L_0x00b3
            byte r11 = r9[r0]     // Catch:{ Exception -> 0x01ce }
            if (r11 != r14) goto L_0x00b0
            int r11 = r0 + 1
            boolean r11 = p5589m.p5590a.C71820a.m105122b(r10, r11, r13, r15)     // Catch:{ Exception -> 0x01ce }
            if (r11 == 0) goto L_0x00b0
            int r1 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            int r0 = r0 - r1
            long r0 = (long) r0     // Catch:{ Exception -> 0x01ce }
            long r0 = r0 + r5
            r20 = r2
            r22 = r18
            goto L_0x00ec
        L_0x00b0:
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00b3:
            int r0 = r10.f191375c     // Catch:{ Exception -> 0x01ce }
            int r1 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            int r0 = r0 - r1
            long r0 = (long) r0     // Catch:{ Exception -> 0x01ce }
            long r19 = r5 + r0
            m.s r10 = r10.f191378f     // Catch:{ Exception -> 0x01ce }
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)     // Catch:{ Exception -> 0x01ce }
            r0 = r25
            r5 = r19
            r1 = r21
            r11 = 1
            goto L_0x007c
        L_0x00c9:
            r21 = r1
            goto L_0x00e6
        L_0x00cc:
            r21 = r1
            r18 = r4
            r0 = 0
        L_0x00d2:
            int r3 = r10.f191375c     // Catch:{ Exception -> 0x01ce }
            int r4 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            int r3 = r3 - r4
            long r3 = (long) r3     // Catch:{ Exception -> 0x01ce }
            long r3 = r3 + r0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x00e4
            m.s r10 = r10.f191378f     // Catch:{ Exception -> 0x01ce }
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)     // Catch:{ Exception -> 0x01ce }
            r0 = r3
            goto L_0x00d2
        L_0x00e4:
            if (r10 != 0) goto L_0x00f1
        L_0x00e6:
            r20 = r2
            r22 = r18
            r0 = -1
        L_0x00ec:
            r2 = -1
            r18 = r7
            goto L_0x0153
        L_0x00f1:
            r3 = r18
            byte[] r4 = r3.f191358b     // Catch:{ Exception -> 0x01ce }
            r5 = 0
            byte r6 = r4[r5]     // Catch:{ Exception -> 0x01ce }
            int r5 = r4.length     // Catch:{ Exception -> 0x01ce }
            long r11 = r9.f191356b     // Catch:{ Exception -> 0x01ce }
            long r13 = (long) r5     // Catch:{ Exception -> 0x01ce }
            long r11 = r11 - r13
            r13 = 1
            long r11 = r11 + r13
            r13 = r7
        L_0x0101:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x014d
            byte[] r9 = r10.f191373a     // Catch:{ Exception -> 0x01ce }
            int r15 = r10.f191375c     // Catch:{ Exception -> 0x01ce }
            r18 = r7
            long r7 = (long) r15     // Catch:{ Exception -> 0x01ce }
            int r15 = r10.f191374b     // Catch:{ Exception -> 0x01ce }
            r20 = r2
            r22 = r3
            long r2 = (long) r15
            long r2 = r2 + r11
            long r2 = r2 - r0
            long r2 = java.lang.Math.min(r7, r2)     // Catch:{ Exception -> 0x01d0 }
            int r3 = (int) r2     // Catch:{ Exception -> 0x01d0 }
            int r2 = r10.f191374b     // Catch:{ Exception -> 0x01d0 }
            long r7 = (long) r2     // Catch:{ Exception -> 0x01d0 }
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r2 = (int) r7     // Catch:{ Exception -> 0x01d0 }
        L_0x0120:
            if (r2 >= r3) goto L_0x0138
            byte r7 = r9[r2]     // Catch:{ Exception -> 0x01d0 }
            if (r7 != r6) goto L_0x0135
            int r7 = r2 + 1
            boolean r7 = p5589m.p5590a.C71820a.m105122b(r10, r7, r4, r5)     // Catch:{ Exception -> 0x01d0 }
            if (r7 == 0) goto L_0x0135
            int r3 = r10.f191374b     // Catch:{ Exception -> 0x01d0 }
            int r2 = r2 - r3
            long r2 = (long) r2     // Catch:{ Exception -> 0x01d0 }
            long r0 = r0 + r2
            goto L_0x004a
        L_0x0135:
            int r2 = r2 + 1
            goto L_0x0120
        L_0x0138:
            int r2 = r10.f191375c     // Catch:{ Exception -> 0x01d0 }
            int r3 = r10.f191374b     // Catch:{ Exception -> 0x01d0 }
            int r2 = r2 - r3
            long r2 = (long) r2     // Catch:{ Exception -> 0x01d0 }
            long r13 = r0 + r2
            m.s r10 = r10.f191378f     // Catch:{ Exception -> 0x01d0 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)     // Catch:{ Exception -> 0x01d0 }
            r0 = r13
            r7 = r18
            r2 = r20
            r3 = r22
            goto L_0x0101
        L_0x014d:
            r20 = r2
            r22 = r3
            goto L_0x0046
        L_0x0153:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x015b
            r13 = r0
        L_0x0158:
            r3 = 0
            goto L_0x0177
        L_0x015b:
            r2 = r20
            m.r r2 = (p5589m.C71841r) r2     // Catch:{ Exception -> 0x01d0 }
            m.e r0 = r2.f191371b     // Catch:{ Exception -> 0x01d0 }
            long r1 = r0.f191356b     // Catch:{ Exception -> 0x01d0 }
            r3 = r20
            m.r r3 = (p5589m.C71841r) r3     // Catch:{ Exception -> 0x01d0 }
            m.x r3 = r3.f191370a     // Catch:{ Exception -> 0x01d0 }
            r4 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3.mo62472a(r0, r4)     // Catch:{ Exception -> 0x01d0 }
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0183
            r13 = r5
            goto L_0x0158
        L_0x0177:
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x017d
            r5 = 1
            goto L_0x017e
        L_0x017d:
            r5 = 0
        L_0x017e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x01d7
        L_0x0183:
            r0 = r22
            r3 = 0
            byte[] r5 = r0.f191358b     // Catch:{ Exception -> 0x01d0 }
            int r5 = r5.length     // Catch:{ Exception -> 0x01d0 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x01d0 }
            long r1 = r1 - r5
            r5 = 1
            long r1 = r1 + r5
            r5 = r18
            long r7 = java.lang.Math.max(r5, r1)     // Catch:{ Exception -> 0x01d0 }
            r5 = r3
            r2 = r20
            r1 = r21
            r3 = 0
            r4 = r0
            r0 = r25
            goto L_0x0029
        L_0x01a0:
            r20 = r2
            r5 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d0 }
            r0.<init>()     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r1 = "fromIndex < 0: "
            r0.append(r1)     // Catch:{ Exception -> 0x01d0 }
            r0.append(r5)     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01d0 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01d0 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01d0 }
            throw r1     // Catch:{ Exception -> 0x01d0 }
        L_0x01ba:
            r20 = r2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r1 = "bytes is empty"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01d0 }
            throw r0     // Catch:{ Exception -> 0x01d0 }
        L_0x01c4:
            r20 = r2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01d0 }
            throw r0     // Catch:{ Exception -> 0x01d0 }
        L_0x01ce:
            r20 = r2
        L_0x01d0:
            com.airbnb.lottie.af r0 = com.airbnb.lottie.p245f.C4947d.f15711a     // Catch:{ NotFoundException -> 0x0202 }
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NotFoundException -> 0x0202 }
        L_0x01d7:
            boolean r0 = r0.booleanValue()     // Catch:{ NotFoundException -> 0x0202 }
            if (r0 == 0) goto L_0x01f2
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x0202 }
            m.q r1 = new m.q     // Catch:{ NotFoundException -> 0x0202 }
            r2 = r20
            m.r r2 = (p5589m.C71841r) r2     // Catch:{ NotFoundException -> 0x0202 }
            r1.<init>(r2)     // Catch:{ NotFoundException -> 0x0202 }
            r0.<init>(r1)     // Catch:{ NotFoundException -> 0x0202 }
            r1 = r25
            com.airbnb.lottie.ah r0 = m13747e(r0, r1)     // Catch:{ NotFoundException -> 0x0202 }
            return r0
        L_0x01f2:
            r1 = r25
            m.q r0 = new m.q     // Catch:{ NotFoundException -> 0x0202 }
            r2 = r20
            m.r r2 = (p5589m.C71841r) r2     // Catch:{ NotFoundException -> 0x0202 }
            r0.<init>(r2)     // Catch:{ NotFoundException -> 0x0202 }
            com.airbnb.lottie.ah r0 = m13755m(r0, r1)     // Catch:{ NotFoundException -> 0x0202 }
            return r0
        L_0x0202:
            r0 = move-exception
            com.airbnb.lottie.ah r1 = new com.airbnb.lottie.ah
            r1.<init>((java.lang.Throwable) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C4972s.m13746d(android.content.Context, int, java.lang.String):com.airbnb.lottie.ah");
    }

    /* renamed from: e */
    public static C4830ah m13747e(ZipInputStream zipInputStream, String str) {
        C4830ah ahVar;
        C4826ad adVar;
        try {
            HashMap hashMap = new HashMap();
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    obj = m13756n(C4908e.m13603e(C71835l.m105189b(C71834k.m105185b(zipInputStream))), (String) null, false).f15396a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (obj == null) {
                ahVar = new C4830ah((Throwable) new IllegalArgumentException("Unable to parse composition"));
            } else {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Iterator it = ((C4964k) obj).f15754c.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            adVar = null;
                            break;
                        }
                        adVar = (C4826ad) it.next();
                        if (adVar.f15360d.equals(str2)) {
                            break;
                        }
                    }
                    if (adVar != null) {
                        adVar.f15361e = C4954k.m13722e((Bitmap) entry.getValue(), adVar.f15357a, adVar.f15358b);
                    }
                }
                Iterator it2 = ((C4964k) obj).f15754c.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (((C4826ad) entry2.getValue()).f15361e == null) {
                            ahVar = new C4830ah((Throwable) new IllegalStateException("There is no image for ".concat(((C4826ad) entry2.getValue()).f15360d)));
                            break;
                        }
                    } else {
                        if (str != null) {
                            C4892g.f15627a.mo9829a(str, (C4964k) obj);
                        }
                        ahVar = new C4830ah(obj);
                    }
                }
            }
        } catch (IOException e) {
            ahVar = new C4830ah((Throwable) e);
        } catch (Throwable th) {
            C4954k.m13726i(zipInputStream);
            throw th;
        }
        C4954k.m13726i(zipInputStream);
        return ahVar;
    }

    /* renamed from: f */
    public static C4833ak m13748f(Context context, String str) {
        return m13749g(context, str, "asset_".concat(String.valueOf(str)));
    }

    /* renamed from: g */
    public static C4833ak m13749g(Context context, String str, String str2) {
        return m13757o(str2, new C4968o(context.getApplicationContext(), str, str2));
    }

    /* renamed from: h */
    public static C4833ak m13750h(InputStream inputStream, String str) {
        return m13757o(str, new C4970q(inputStream, str));
    }

    /* renamed from: i */
    public static C4833ak m13751i(Context context, int i, String str) {
        return m13757o(str, new C4969p(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    /* renamed from: j */
    public static C4833ak m13752j(Context context, String str) {
        return m13753k(context, str, "url_".concat(String.valueOf(str)));
    }

    /* renamed from: k */
    public static C4833ak m13753k(Context context, String str, String str2) {
        return m13757o(str2, new C4967n(context, str, str2));
    }

    /* renamed from: l */
    public static String m13754l(Context context, int i) {
        String str = (context.getResources().getConfiguration().uiMode & 48) != 32 ? "_day_" : "_night_";
        return "rawRes" + str + i;
    }

    /* renamed from: m */
    public static C4830ah m13755m(InputStream inputStream, String str) {
        try {
            return m13756n(C4908e.m13603e(C71835l.m105189b(C71834k.m105185b(inputStream))), str, true);
        } finally {
            C4954k.m13726i(inputStream);
        }
    }

    /* renamed from: n */
    private static C4830ah m13756n(C4908e eVar, String str, boolean z) {
        try {
            C4964k a = C4936t.m13682a(eVar);
            if (str != null) {
                C4892g.f15627a.mo9829a(str, a);
            }
            C4830ah ahVar = new C4830ah((Object) a);
            if (z) {
                C4954k.m13726i(eVar);
            }
            return ahVar;
        } catch (Exception e) {
            C4830ah ahVar2 = new C4830ah((Throwable) e);
            if (z) {
                C4954k.m13726i(eVar);
            }
            return ahVar2;
        } catch (Throwable th) {
            if (z) {
                C4954k.m13726i(eVar);
            }
            throw th;
        }
    }

    /* renamed from: o */
    private static C4833ak m13757o(String str, Callable callable) {
        C4964k kVar;
        if (str == null) {
            kVar = null;
        } else {
            kVar = (C4964k) C4892g.f15627a.f15628b.mo3690d(str);
        }
        if (kVar != null) {
            return new C4833ak(new C4971r(kVar), false);
        }
        if (str != null) {
            Map map = f15780a;
            if (map.containsKey(str)) {
                return (C4833ak) map.get(str);
            }
        }
        C4833ak akVar = new C4833ak(callable, false);
        if (str != null) {
            akVar.mo9793e(new C4965l(str));
            akVar.mo9792d(new C4966m(str));
            f15780a.put(str, akVar);
        }
        return akVar;
    }
}
