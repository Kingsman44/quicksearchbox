package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adf */
/* compiled from: PG */
public final class adf extends abr {

    /* renamed from: a */
    private final Resources f20349a;

    /* renamed from: b */
    private final String f20350b;

    /* renamed from: c */
    private Uri f20351c;

    /* renamed from: d */
    private AssetFileDescriptor f20352d;

    /* renamed from: e */
    private InputStream f20353e;

    /* renamed from: f */
    private long f20354f;

    /* renamed from: g */
    private boolean f20355g;

    public adf(Context context) {
        super(false);
        this.f20349a = context.getResources();
        this.f20350b = context.getPackageName();
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20354f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ade(e);
            }
        }
        InputStream inputStream = this.f20353e;
        int i3 = aeu.f20466a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f20354f;
            if (j2 != -1) {
                this.f20354f = j2 - ((long) read);
            }
            mo14406i(read);
            return read;
        } else if (this.f20354f == -1) {
            return -1;
        } else {
            throw new ade((IOException) new EOFException());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo14389c(com.google.ads.interactivemedia.p367v3.internal.acb r8) {
        /*
            r7 = this;
            android.net.Uri r0 = r8.f20241a
            r7.f20351c = r0
            java.lang.String r1 = "rawresource"
            java.lang.String r2 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r2 = 1
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0037
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = r0.getLastPathSegment()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r1)
            java.lang.String r4 = "\\d+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0037
            goto L_0x00a0
        L_0x0037:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r0.getPath()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r1)
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0054
            java.lang.String r1 = r1.substring(r2)
        L_0x0054:
            java.lang.String r3 = r0.getHost()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = ""
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.concat(r4)
        L_0x006b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x007e
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0083
        L_0x007e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0083:
            android.content.res.Resources r3 = r7.f20349a
            java.lang.String r4 = "raw"
            java.lang.String r5 = r7.f20350b
            int r1 = r3.getIdentifier(r1, r4, r5)
            if (r1 == 0) goto L_0x0090
            goto L_0x00ab
        L_0x0090:
            com.google.ads.interactivemedia.v3.internal.ade r8 = new com.google.ads.interactivemedia.v3.internal.ade
            java.lang.String r0 = "Resource not found."
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x0098:
            com.google.ads.interactivemedia.v3.internal.ade r8 = new com.google.ads.interactivemedia.v3.internal.ade
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x00a0:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0120 }
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r1)     // Catch:{ NumberFormatException -> 0x0120 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0120 }
        L_0x00ab:
            r7.mo14404g(r8)
            android.content.res.Resources r3 = r7.f20349a
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)
            r7.f20352d = r1
            if (r1 == 0) goto L_0x0105
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r3 = r1.getFileDescriptor()
            r0.<init>(r3)
            r7.f20353e = r0
            long r3 = r1.getStartOffset()     // Catch:{ IOException -> 0x00fe }
            r0.skip(r3)     // Catch:{ IOException -> 0x00fe }
            long r3 = r8.f20245e     // Catch:{ IOException -> 0x00fe }
            long r3 = r0.skip(r3)     // Catch:{ IOException -> 0x00fe }
            long r5 = r8.f20245e     // Catch:{ IOException -> 0x00fe }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00f8
            long r3 = r8.f20246f
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00e1
            r7.f20354f = r3
            goto L_0x00f0
        L_0x00e1:
            long r0 = r1.getLength()
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            long r3 = r8.f20245e
            long r5 = r0 - r3
        L_0x00ee:
            r7.f20354f = r5
        L_0x00f0:
            r7.f20355g = r2
            r7.mo14405h(r8)
            long r0 = r7.f20354f
            return r0
        L_0x00f8:
            java.io.EOFException r8 = new java.io.EOFException     // Catch:{ IOException -> 0x00fe }
            r8.<init>()     // Catch:{ IOException -> 0x00fe }
            throw r8     // Catch:{ IOException -> 0x00fe }
        L_0x00fe:
            r8 = move-exception
            com.google.ads.interactivemedia.v3.internal.ade r0 = new com.google.ads.interactivemedia.v3.internal.ade
            r0.<init>((java.io.IOException) r8)
            throw r0
        L_0x0105:
            com.google.ads.interactivemedia.v3.internal.ade r8 = new com.google.ads.interactivemedia.v3.internal.ade
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r1.length()
            java.lang.String r1 = "Resource is compressed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x0120:
            com.google.ads.interactivemedia.v3.internal.ade r8 = new com.google.ads.interactivemedia.v3.internal.ade
            java.lang.String r0 = "Resource identifier must be an integer."
            r8.<init>((java.lang.String) r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.adf.mo14389c(com.google.ads.interactivemedia.v3.internal.acb):long");
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f20351c;
    }

    /* renamed from: f */
    public final void mo14391f() {
        this.f20351c = null;
        try {
            InputStream inputStream = this.f20353e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f20353e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f20352d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f20352d = null;
                if (this.f20355g) {
                    this.f20355g = false;
                    mo14407j();
                }
            } catch (IOException e) {
                throw new ade(e);
            } catch (Throwable th) {
                this.f20352d = null;
                if (this.f20355g) {
                    this.f20355g = false;
                    mo14407j();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ade(e2);
        } catch (Throwable th2) {
            this.f20353e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f20352d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f20352d = null;
                if (this.f20355g) {
                    this.f20355g = false;
                    mo14407j();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ade(e3);
            } catch (Throwable th3) {
                this.f20352d = null;
                if (this.f20355g) {
                    this.f20355g = false;
                    mo14407j();
                }
                throw th3;
            }
        }
    }
}
