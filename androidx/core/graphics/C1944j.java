package androidx.core.graphics;

import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;

/* renamed from: androidx.core.graphics.j */
/* compiled from: PG */
public final class C1944j extends C1945k {
    /* renamed from: b */
    public static final Font m5262b(FontFamily fontFamily, int i) {
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int c = m5263c(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            Font font2 = fontFamily.getFont(i2);
            int c2 = m5263c(fontStyle, font2.getStyle());
            int i3 = c2 < c ? c2 : c;
            if (c2 < c) {
                font = font2;
            }
            i2++;
            c = i3;
        }
        return font;
    }

    /* renamed from: c */
    private static int m5263c(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo5097a(android.content.Context r12, androidx.core.p095g.C1917o[] r13, int r14) {
        /*
            r11 = this;
            android.content.ContentResolver r12 = r12.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch:{ Exception -> 0x0080 }
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x0009:
            if (r3 >= r1) goto L_0x0063
            r5 = r13[r3]     // Catch:{ Exception -> 0x0080 }
            android.net.Uri r6 = r5.f5808a     // Catch:{ IOException -> 0x0060 }
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r6 = r12.openFileDescriptor(r6, r7, r0)     // Catch:{ IOException -> 0x0060 }
            if (r6 != 0) goto L_0x0018
            goto L_0x0060
        L_0x0018:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0043 }
            r7.<init>(r6)     // Catch:{ all -> 0x0043 }
            int r8 = r5.f5810c     // Catch:{ all -> 0x0043 }
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch:{ all -> 0x0043 }
            boolean r8 = r5.f5811d     // Catch:{ all -> 0x0043 }
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch:{ all -> 0x0043 }
            int r5 = r5.f5809b     // Catch:{ all -> 0x0043 }
            android.graphics.fonts.Font$Builder r5 = r7.setTtcIndex(r5)     // Catch:{ all -> 0x0043 }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x0043 }
            if (r4 != 0) goto L_0x003c
            android.graphics.fonts.FontFamily$Builder r7 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0043 }
            r7.<init>(r5)     // Catch:{ all -> 0x0043 }
            r4 = r7
            goto L_0x003f
        L_0x003c:
            r4.addFont(r5)     // Catch:{ all -> 0x0043 }
        L_0x003f:
            r6.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0043:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x0048 }
            goto L_0x005f
        L_0x0048:
            r6 = move-exception
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            r8[r2] = r9     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            java.lang.String r10 = "addSuppressed"
            java.lang.reflect.Method r8 = r9.getDeclaredMethod(r10, r8)     // Catch:{ Exception -> 0x005f }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x005f }
            r7[r2] = r6     // Catch:{ Exception -> 0x005f }
            r8.invoke(r5, r7)     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            throw r5     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0063:
            if (r4 != 0) goto L_0x0066
            return r0
        L_0x0066:
            android.graphics.fonts.FontFamily r12 = r4.build()     // Catch:{ Exception -> 0x0080 }
            android.graphics.Typeface$CustomFallbackBuilder r13 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x0080 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0080 }
            android.graphics.fonts.Font r12 = m5262b(r12, r14)     // Catch:{ Exception -> 0x0080 }
            android.graphics.fonts.FontStyle r12 = r12.getStyle()     // Catch:{ Exception -> 0x0080 }
            android.graphics.Typeface$CustomFallbackBuilder r12 = r13.setStyle(r12)     // Catch:{ Exception -> 0x0080 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ Exception -> 0x0080 }
            return r12
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C1944j.mo5097a(android.content.Context, androidx.core.g.o[], int):android.graphics.Typeface");
    }
}
