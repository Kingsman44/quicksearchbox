package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.p060c.C0983m;

/* renamed from: androidx.core.graphics.i */
/* compiled from: PG */
public final class C1943i {

    /* renamed from: a */
    public static final C1945k f5852a = new C1944j();

    /* renamed from: b */
    public static final C0983m f5853b = new C0983m(16);

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0027;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m5260b(android.content.Context r6, androidx.core.content.p091b.C1857f r7, android.content.res.Resources r8, int r9, java.lang.String r10, int r11, int r12, androidx.core.content.p091b.C1872u r13, android.os.Handler r14, boolean r15) {
        /*
            boolean r0 = r7 instanceof androidx.core.content.p091b.C1860i
            r1 = -3
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0103
            androidx.core.content.b.i r7 = (androidx.core.content.p091b.C1860i) r7
            java.lang.String r0 = r7.f5742d
            if (r0 == 0) goto L_0x0026
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0026
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r2)
            if (r0 == 0) goto L_0x0026
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0027
        L_0x0026:
            r0 = r3
        L_0x0027:
            if (r0 == 0) goto L_0x002f
            if (r13 == 0) goto L_0x002e
            r13.mo5043e(r0, r14)
        L_0x002e:
            return r0
        L_0x002f:
            r0 = 1
            if (r15 == 0) goto L_0x0037
            int r4 = r7.f5741c
            if (r4 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r13 != 0) goto L_0x003a
        L_0x0039:
            r2 = 1
        L_0x003a:
            r0 = -1
            if (r15 == 0) goto L_0x0040
            int r15 = r7.f5740b
            goto L_0x0041
        L_0x0040:
            r15 = -1
        L_0x0041:
            android.os.Handler r14 = androidx.core.content.p091b.C1872u.m5098c(r14)
            androidx.core.graphics.h r4 = new androidx.core.graphics.h
            r4.<init>(r13)
            androidx.core.g.g r7 = r7.f5739a
            androidx.core.g.c r13 = new androidx.core.g.c
            r13.<init>(r4, r14)
            if (r2 == 0) goto L_0x0097
            java.lang.String r14 = androidx.core.p095g.C1915m.m5180b(r7, r12)
            androidx.c.m r2 = androidx.core.p095g.C1915m.f5802a
            java.lang.Object r2 = r2.mo3690d(r14)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L_0x006c
            androidx.core.g.l r6 = new androidx.core.g.l
            r6.<init>((android.graphics.Typeface) r2)
            r13.mo5058a(r6)
            r3 = r2
            goto L_0x0168
        L_0x006c:
            if (r15 != r0) goto L_0x0079
            androidx.core.g.l r6 = androidx.core.p095g.C1915m.m5179a(r14, r6, r7, r12)
            r13.mo5058a(r6)
            android.graphics.Typeface r3 = r6.f5800a
            goto L_0x0168
        L_0x0079:
            androidx.core.g.h r0 = new androidx.core.g.h
            r0.<init>(r14, r6, r7, r12)
            java.util.concurrent.ExecutorService r6 = androidx.core.p095g.C1915m.f5803b     // Catch:{ InterruptedException -> 0x008d }
            java.lang.Object r6 = androidx.core.p095g.C1923u.m5181a(r6, r0, r15)     // Catch:{ InterruptedException -> 0x008d }
            androidx.core.g.l r6 = (androidx.core.p095g.C1914l) r6     // Catch:{ InterruptedException -> 0x008d }
            r13.mo5058a(r6)     // Catch:{ InterruptedException -> 0x008d }
            android.graphics.Typeface r3 = r6.f5800a     // Catch:{ InterruptedException -> 0x008d }
            goto L_0x0168
        L_0x008d:
            androidx.core.g.l r6 = new androidx.core.g.l
            r6.<init>((int) r1)
            r13.mo5058a(r6)
            goto L_0x0168
        L_0x0097:
            java.lang.String r14 = androidx.core.p095g.C1915m.m5180b(r7, r12)
            androidx.c.m r15 = androidx.core.p095g.C1915m.f5802a
            java.lang.Object r15 = r15.mo3690d(r14)
            android.graphics.Typeface r15 = (android.graphics.Typeface) r15
            if (r15 == 0) goto L_0x00b0
            androidx.core.g.l r6 = new androidx.core.g.l
            r6.<init>((android.graphics.Typeface) r15)
            r13.mo5058a(r6)
            r3 = r15
            goto L_0x0168
        L_0x00b0:
            androidx.core.g.i r15 = new androidx.core.g.i
            r15.<init>(r13)
            java.lang.Object r0 = androidx.core.p095g.C1915m.f5804c
            monitor-enter(r0)
            androidx.c.n r13 = androidx.core.p095g.C1915m.f5805d     // Catch:{ all -> 0x0100 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x0100 }
            if (r13 == 0) goto L_0x00c8
            r13.add(r15)     // Catch:{ all -> 0x0100 }
            monitor-exit(r0)     // Catch:{ all -> 0x0100 }
            goto L_0x0168
        L_0x00c8:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r13.<init>()     // Catch:{ all -> 0x0100 }
            r13.add(r15)     // Catch:{ all -> 0x0100 }
            androidx.c.n r15 = androidx.core.p095g.C1915m.f5805d     // Catch:{ all -> 0x0100 }
            r15.put(r14, r13)     // Catch:{ all -> 0x0100 }
            monitor-exit(r0)     // Catch:{ all -> 0x0100 }
            androidx.core.g.j r13 = new androidx.core.g.j
            r13.<init>(r14, r6, r7, r12)
            java.util.concurrent.ExecutorService r6 = androidx.core.p095g.C1915m.f5803b
            androidx.core.g.k r7 = new androidx.core.g.k
            r7.<init>(r14)
            android.os.Looper r14 = android.os.Looper.myLooper()
            if (r14 != 0) goto L_0x00f2
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r15 = android.os.Looper.getMainLooper()
            r14.<init>(r15)
            goto L_0x00f7
        L_0x00f2:
            android.os.Handler r14 = new android.os.Handler
            r14.<init>()
        L_0x00f7:
            androidx.core.g.t r15 = new androidx.core.g.t
            r15.<init>(r14, r13, r7)
            r6.execute(r15)
            goto L_0x0168
        L_0x0100:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0100 }
            throw r6
        L_0x0103:
            androidx.core.content.b.g r7 = (androidx.core.content.p091b.C1858g) r7
            androidx.core.content.b.h[] r6 = r7.f5733a     // Catch:{ Exception -> 0x015c }
            int r7 = r6.length     // Catch:{ Exception -> 0x015c }
            r15 = r3
        L_0x0109:
            if (r2 >= r7) goto L_0x013f
            r0 = r6[r2]     // Catch:{ Exception -> 0x015c }
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x013c }
            int r5 = r0.f5738e     // Catch:{ IOException -> 0x013c }
            r4.<init>(r8, r5)     // Catch:{ IOException -> 0x013c }
            int r5 = r0.f5734a     // Catch:{ IOException -> 0x013c }
            android.graphics.fonts.Font$Builder r4 = r4.setWeight(r5)     // Catch:{ IOException -> 0x013c }
            boolean r5 = r0.f5735b     // Catch:{ IOException -> 0x013c }
            android.graphics.fonts.Font$Builder r4 = r4.setSlant(r5)     // Catch:{ IOException -> 0x013c }
            int r5 = r0.f5737d     // Catch:{ IOException -> 0x013c }
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r5)     // Catch:{ IOException -> 0x013c }
            java.lang.String r0 = r0.f5736c     // Catch:{ IOException -> 0x013c }
            android.graphics.fonts.Font$Builder r0 = r4.setFontVariationSettings(r0)     // Catch:{ IOException -> 0x013c }
            android.graphics.fonts.Font r0 = r0.build()     // Catch:{ IOException -> 0x013c }
            if (r15 != 0) goto L_0x0139
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x013c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x013c }
            r15 = r4
            goto L_0x013c
        L_0x0139:
            r15.addFont(r0)     // Catch:{ IOException -> 0x013c }
        L_0x013c:
            int r2 = r2 + 1
            goto L_0x0109
        L_0x013f:
            if (r15 != 0) goto L_0x0142
            goto L_0x015d
        L_0x0142:
            android.graphics.fonts.FontFamily r6 = r15.build()     // Catch:{ Exception -> 0x015c }
            android.graphics.Typeface$CustomFallbackBuilder r7 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x015c }
            r7.<init>(r6)     // Catch:{ Exception -> 0x015c }
            android.graphics.fonts.Font r6 = androidx.core.graphics.C1944j.m5262b(r6, r12)     // Catch:{ Exception -> 0x015c }
            android.graphics.fonts.FontStyle r6 = r6.getStyle()     // Catch:{ Exception -> 0x015c }
            android.graphics.Typeface$CustomFallbackBuilder r6 = r7.setStyle(r6)     // Catch:{ Exception -> 0x015c }
            android.graphics.Typeface r3 = r6.build()     // Catch:{ Exception -> 0x015c }
            goto L_0x015d
        L_0x015c:
        L_0x015d:
            if (r13 == 0) goto L_0x0168
            if (r3 == 0) goto L_0x0165
            r13.mo5043e(r3, r14)
            goto L_0x0168
        L_0x0165:
            r13.mo5042d(r1, r14)
        L_0x0168:
            if (r3 == 0) goto L_0x0173
            androidx.c.m r6 = f5853b
            java.lang.String r7 = m5261c(r8, r9, r10, r11, r12)
            r6.mo3691e(r7, r3)
        L_0x0173:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C1943i.m5260b(android.content.Context, androidx.core.content.b.f, android.content.res.Resources, int, java.lang.String, int, int, androidx.core.content.b.u, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: c */
    public static String m5261c(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: a */
    public static Typeface m5259a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
