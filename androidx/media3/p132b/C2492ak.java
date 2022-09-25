package androidx.media3.p132b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.media3.b.ak */
/* compiled from: PG */
public final class C2492ak extends C2499c {

    /* renamed from: a */
    private final Resources f6838a;

    /* renamed from: b */
    private final String f6839b;

    /* renamed from: c */
    private Uri f6840c;

    /* renamed from: d */
    private AssetFileDescriptor f6841d;

    /* renamed from: e */
    private InputStream f6842e;

    /* renamed from: f */
    private long f6843f;

    /* renamed from: g */
    private boolean f6844g;

    public C2492ak(Context context) {
        super(false);
        this.f6838a = context.getResources();
        this.f6839b = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6843f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C2491aj((String) null, e, SimpleSnackbar.LENGTH_SHORT);
            }
        }
        InputStream inputStream = this.f6842e;
        int i3 = C2612ak.f7249a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f6843f;
            if (j2 != -1) {
                this.f6843f = j2 - ((long) read);
            }
            mo5927g(read);
            return read;
        } else if (this.f6843f == -1) {
            return -1;
        } else {
            throw new C2491aj("End of stream reached having not read sufficient data.", new EOFException(), SimpleSnackbar.LENGTH_SHORT);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r1.matches("\\d+") != false) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5880b(androidx.media3.p132b.C2510n r15) {
        /*
            r14 = this;
            android.net.Uri r0 = r15.f6891a
            r14.f6840c = r0
            java.lang.String r1 = "rawresource"
            java.lang.String r2 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r2 = 2005(0x7d5, float:2.81E-42)
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = r0.getScheme()
            java.lang.String r6 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r6, r1)
            if (r1 == 0) goto L_0x003c
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r4) goto L_0x003c
            java.lang.String r1 = r0.getLastPathSegment()
            r1.getClass()
            java.lang.String r7 = "\\d+"
            boolean r1 = r1.matches(r7)
            if (r1 == 0) goto L_0x003c
            goto L_0x0095
        L_0x003c:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r6, r1)
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r0.getPath()
            r1.getClass()
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0059
            java.lang.String r1 = r1.substring(r4)
        L_0x0059:
            java.lang.String r3 = r0.getHost()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0066
            java.lang.String r3 = ""
            goto L_0x0070
        L_0x0066:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = ":"
            java.lang.String r3 = r3.concat(r6)
        L_0x0070:
            android.content.res.Resources r6 = r14.f6838a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = "raw"
            java.lang.String r7 = r14.f6839b
            int r1 = r6.getIdentifier(r1, r3, r7)
            if (r1 == 0) goto L_0x0085
            goto L_0x00a0
        L_0x0085:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj
            java.lang.String r0 = "Resource not found."
            r15.<init>(r0, r5, r2)
            throw r15
        L_0x008d:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r15.<init>(r0, r5, r3)
            throw r15
        L_0x0095:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0167 }
            r1.getClass()
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0167 }
        L_0x00a0:
            r14.mo5929i(r15)
            android.content.res.Resources r3 = r14.f6838a     // Catch:{ NotFoundException -> 0x0160 }
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)     // Catch:{ NotFoundException -> 0x0160 }
            r14.f6841d = r1
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r1 == 0) goto L_0x014c
            long r6 = r1.getLength()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r3 = r1.getFileDescriptor()
            r0.<init>(r3)
            r14.f6842e = r0
            r3 = 2008(0x7d8, float:2.814E-42)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00d3
            long r10 = r15.f6896f     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 > 0) goto L_0x00cd
            goto L_0x00d3
        L_0x00cd:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            r15.<init>(r5, r5, r3)     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            throw r15     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
        L_0x00d3:
            long r10 = r1.getStartOffset()     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            long r12 = r15.f6896f     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            long r12 = r12 + r10
            long r12 = r0.skip(r12)     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            long r12 = r12 - r10
            long r10 = r15.f6896f     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x013d
            r10 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0111
            java.nio.channels.FileChannel r0 = p3186j$.wrapper.java.p3189io.FileInputStreamWrapper.getChannel(r0)     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            long r6 = r0.size()     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x00fb
            r14.f6843f = r8     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            r6 = r8
            goto L_0x0118
        L_0x00fb:
            long r6 = r0.size()     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            long r0 = r0.position()     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            long r6 = r6 - r0
            r14.f6843f = r6     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x010b
            goto L_0x0118
        L_0x010b:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            r15.<init>(r5, r5, r3)     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            throw r15     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
        L_0x0111:
            long r6 = r6 - r12
            r14.f6843f = r6     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0137
        L_0x0118:
            long r0 = r15.f6897g
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0128
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0126
            long r0 = java.lang.Math.min(r6, r0)
        L_0x0126:
            r14.f6843f = r0
        L_0x0128:
            r14.f6844g = r4
            r14.mo5930j(r15)
            long r0 = r15.f6897g
            int r15 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x0134
            return r0
        L_0x0134:
            long r0 = r14.f6843f
            return r0
        L_0x0137:
            androidx.media3.b.j r15 = new androidx.media3.b.j     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            r15.<init>(r3)     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            throw r15     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
        L_0x013d:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            r15.<init>(r5, r5, r3)     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
            throw r15     // Catch:{ aj -> 0x014a, IOException -> 0x0143 }
        L_0x0143:
            r15 = move-exception
            androidx.media3.b.aj r0 = new androidx.media3.b.aj
            r0.<init>(r5, r15, r2)
            throw r0
        L_0x014a:
            r15 = move-exception
            throw r15
        L_0x014c:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Resource is compressed: "
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0, r5, r2)
            throw r15
        L_0x0160:
            r15 = move-exception
            androidx.media3.b.aj r0 = new androidx.media3.b.aj
            r0.<init>(r5, r15, r2)
            throw r0
        L_0x0167:
            androidx.media3.b.aj r15 = new androidx.media3.b.aj
            java.lang.String r0 = "Resource identifier must be an integer."
            r15.<init>(r0, r5, r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p132b.C2492ak.mo5880b(androidx.media3.b.n):long");
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6840c;
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6840c = null;
        try {
            InputStream inputStream = this.f6842e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f6842e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f6841d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f6841d = null;
                if (this.f6844g) {
                    this.f6844g = false;
                    mo5928h();
                }
            } catch (IOException e) {
                throw new C2491aj((String) null, e, SimpleSnackbar.LENGTH_SHORT);
            } catch (Throwable th) {
                this.f6841d = null;
                if (this.f6844g) {
                    this.f6844g = false;
                    mo5928h();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C2491aj((String) null, e2, SimpleSnackbar.LENGTH_SHORT);
        } catch (Throwable th2) {
            this.f6842e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f6841d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f6841d = null;
                if (this.f6844g) {
                    this.f6844g = false;
                    mo5928h();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C2491aj((String) null, e3, SimpleSnackbar.LENGTH_SHORT);
            } catch (Throwable th3) {
                this.f6841d = null;
                if (this.f6844g) {
                    this.f6844g = false;
                    mo5928h();
                }
                throw th3;
            }
        }
    }
}
