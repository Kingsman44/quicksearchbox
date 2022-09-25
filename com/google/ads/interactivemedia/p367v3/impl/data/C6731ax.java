package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.agj;
import com.google.ads.interactivemedia.p367v3.internal.aku;
import com.google.ads.interactivemedia.p367v3.internal.ald;
import com.google.ads.interactivemedia.p367v3.internal.ars;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ax */
/* compiled from: PG */
public final class C6731ax {
    private C6731ax() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agk((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agq((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.ads.interactivemedia.p367v3.internal.agl.f20627a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agq((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.agq((java.lang.Throwable) r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r1v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: ale (r1v4 'e' com.google.ads.interactivemedia.v3.internal.ale A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r1v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p367v3.internal.agj m18025a(com.google.ads.interactivemedia.p367v3.internal.alb r1) {
        /*
            r1.mo14838p()     // Catch:{ EOFException -> 0x0024, ale -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.ads.interactivemedia.v3.internal.agt r0 = com.google.ads.interactivemedia.p367v3.internal.aku.f20811V     // Catch:{ EOFException -> 0x000c, ale -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r1 = r0.read(r1)     // Catch:{ EOFException -> 0x000c, ale -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.ads.interactivemedia.v3.internal.agj r1 = (com.google.ads.interactivemedia.p367v3.internal.agj) r1     // Catch:{ EOFException -> 0x000c, ale -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r1
        L_0x000c:
            r1 = move-exception
            r0 = 0
            goto L_0x0026
        L_0x000f:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.agq r0 = new com.google.ads.interactivemedia.v3.internal.agq
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0016:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.agk r0 = new com.google.ads.interactivemedia.v3.internal.agk
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x001d:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.agq r0 = new com.google.ads.interactivemedia.v3.internal.agq
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0024:
            r1 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.ads.interactivemedia.v3.internal.agl r1 = com.google.ads.interactivemedia.p367v3.internal.agl.f20627a
            return r1
        L_0x002b:
            com.google.ads.interactivemedia.v3.internal.agq r0 = new com.google.ads.interactivemedia.v3.internal.agq
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.impl.data.C6731ax.m18025a(com.google.ads.interactivemedia.v3.internal.alb):com.google.ads.interactivemedia.v3.internal.agj");
    }

    /* renamed from: b */
    public static void m18026b(agj agj, ald ald) {
        aku.f20811V.write(ald, agj);
    }

    /* renamed from: c */
    public static Writer m18027c(Appendable appendable) {
        return (Writer) appendable;
    }

    public static ars create(int i) {
        return ars.m19428b("GvnExternalLayer", C6730aw.create(i, true));
    }

    /* renamed from: d */
    public static DateFormat m18028d(int i, int i2) {
        return new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US);
    }

    /* renamed from: e */
    public static void m18029e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m18030f(Object obj) {
        obj.getClass();
    }
}
