package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.di */
/* compiled from: PG */
public final class C35674di {

    /* renamed from: e */
    private static final C59071e f93557e = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.di");

    /* renamed from: a */
    public final Context f93558a;

    /* renamed from: b */
    public final C60887da f93559b;

    /* renamed from: c */
    C35675dj f93560c;

    /* renamed from: d */
    public final C35575cd f93561d;

    /* renamed from: f */
    private final C21370a f93562f;

    public C35674di(Context context, C60887da daVar, C21370a aVar, C35575cd cdVar) {
        this.f93558a = context;
        this.f93559b = daVar;
        this.f93562f = aVar;
        this.f93561d = cdVar;
    }

    /* renamed from: c */
    protected static final long m64080c(Context context, Uri uri) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor a = C147806g.m240907a(context, uri, C33259r.f88929b, C147805f.f398780b);
            if (a == null) {
                ((C59052c) ((C59052c) f93557e.mo56225c()).mo56372aa(51682)).mo56389s("Failed to open asset for length of uri: %s", uri);
                return 0;
            }
            long length = a.getLength();
            try {
                a.close();
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f93557e.mo56225c()).mo56382g(e)).mo56372aa(51678)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri);
            }
            return length;
        } catch (FileNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f93557e.mo56225c()).mo56382g(e2)).mo56372aa(51679)).mo56389s("Failed to query length of uri: %s", uri);
            if (assetFileDescriptor == null) {
                return 0;
            }
            try {
                assetFileDescriptor.close();
                return 0;
            } catch (IOException e3) {
                ((C59052c) ((C59052c) ((C59052c) f93557e.mo56225c()).mo56382g(e3)).mo56372aa(51680)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri);
                return 0;
            }
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    ((C59052c) ((C59052c) ((C59052c) f93557e.mo56225c()).mo56382g(e4)).mo56372aa(51681)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    static final int m64081d(String str, int i) {
        Bundle carrierConfigValues = SmsManager.getDefault().getCarrierConfigValues();
        if (carrierConfigValues == null) {
            return i;
        }
        return carrierConfigValues.getInt(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        throw new com.google.android.libraries.search.assistant.performer.communication.C35673dh("Out of memory in composing PDU: ", r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[ExcHandler: OutOfMemoryError (r6v6 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:10:0x0047] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final android.net.Uri m64082e(android.content.Context r6, com.android.p266f.p267a.p268a.C5121f r7) {
        /*
            java.lang.String r0 = "mms"
            java.io.File r1 = new java.io.File     // Catch:{ RuntimeException -> 0x00be }
            java.io.File r2 = r6.getCacheDir()     // Catch:{ RuntimeException -> 0x00be }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x00be }
            java.io.File r2 = new java.io.File     // Catch:{ RuntimeException -> 0x00be }
            java.lang.String r3 = "default_image.jpg"
            r2.<init>(r1, r3)     // Catch:{ RuntimeException -> 0x00be }
            java.lang.String r1 = r6.getPackageName()     // Catch:{ RuntimeException -> 0x00be }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ RuntimeException -> 0x00be }
            java.lang.String r3 = ".performer.mms"
            java.lang.String r1 = r1.concat(r3)     // Catch:{ RuntimeException -> 0x00be }
            androidx.core.content.j r1 = androidx.core.content.FileProvider.m5057a(r6, r1)     // Catch:{ RuntimeException -> 0x00be }
            android.net.Uri r1 = r1.mo5044a(r2)     // Catch:{ RuntimeException -> 0x00be }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r2 = r1.getLastPathSegment()
            if (r2 == 0) goto L_0x00ae
            java.io.File r3 = new java.io.File
            java.io.File r4 = r6.getCacheDir()
            r3.<init>(r4, r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0042
            r3.mkdirs()
        L_0x0042:
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0090, OutOfMemoryError -> 0x0084 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0090, OutOfMemoryError -> 0x0084 }
            com.android.f.a.a.n r3 = new com.android.f.a.a.n     // Catch:{ all -> 0x0066 }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x0066 }
            byte[] r6 = r3.mo10166i()     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x005e
            r2.write(r6)     // Catch:{ all -> 0x0066 }
            r2.close()     // Catch:{ IOException -> 0x0090, OutOfMemoryError -> 0x0084 }
            return r1
        L_0x005e:
            com.google.android.libraries.search.assistant.performer.communication.dh r6 = new com.google.android.libraries.search.assistant.performer.communication.dh     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "Empty or zero length PDU data"
            r6.<init>(r7)     // Catch:{ all -> 0x0066 }
            throw r6     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r6 = move-exception
            r2.close()     // Catch:{ all -> 0x006b }
            goto L_0x0083
        L_0x006b:
            r7 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0083, OutOfMemoryError -> 0x0084 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0083, OutOfMemoryError -> 0x0084 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x0083, OutOfMemoryError -> 0x0084 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0083, OutOfMemoryError -> 0x0084 }
            r1[r4] = r7     // Catch:{ Exception -> 0x0083, OutOfMemoryError -> 0x0084 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0083, OutOfMemoryError -> 0x0084 }
        L_0x0083:
            throw r6     // Catch:{ IOException -> 0x0090, OutOfMemoryError -> 0x0084 }
        L_0x0084:
            r6 = move-exception
            r0.delete()
            com.google.android.libraries.search.assistant.performer.communication.dh r7 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r0 = "Out of memory in composing PDU: "
            r7.<init>(r0, r6)
            throw r7
        L_0x0090:
            r6 = move-exception
            r0.delete()
            com.google.common.f.e r7 = f93557e
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r0 = r0.getAbsolutePath()
            r1 = 51688(0xc9e8, float:7.243E-41)
            java.lang.String r2 = "Cannot create temporary file %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r6)).mo56372aa(r1)).mo56389s(r2, r0)
            com.google.android.libraries.search.assistant.performer.communication.dh r6 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r7 = "Cannot create raw mms file"
            r6.<init>(r7)
            throw r6
        L_0x00ae:
            com.google.android.libraries.search.assistant.performer.communication.dh r6 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r7 = "Invalid file id pdu file"
            r6.<init>(r7)
            throw r6
        L_0x00b6:
            com.google.android.libraries.search.assistant.performer.communication.dh r6 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r7 = "Failed to get uri for pdu file"
            r6.<init>(r7)
            throw r6
        L_0x00be:
            r6 = move-exception
            com.google.android.libraries.search.assistant.performer.communication.dh r7 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r0 = "Failed to build uri for pdu file"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.C35674di.m64082e(android.content.Context, com.android.f.a.a.f):android.net.Uri");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC, Splitter:B:19:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[SYNTHETIC, Splitter:B:27:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0135  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo39797a(android.content.Context r9, com.android.p266f.p267a.p268a.C5125j r10, android.net.Uri r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to close inputStream for uri: %s"
            boolean r1 = com.android.p266f.p267a.C5115a.m13990b(r12)
            if (r1 == 0) goto L_0x0145
            long r1 = m64080c(r9, r11)
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x013d
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options
            r9.<init>()
            r3 = 1
            r9.inJustDecodeBounds = r3
            r3 = 0
            android.content.Context r4 = r8.f93558a     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x003f }
            com.google.android.libraries.ao.c.f r5 = com.google.android.libraries.p11029ao.p11032c.C147805f.f398780b     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x003f }
            java.io.InputStream r4 = com.google.android.libraries.p11029ao.p11032c.C147806g.m240909c(r4, r11, r5)     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x003f }
            android.graphics.BitmapFactory.decodeStream(r4, r3, r9)     // Catch:{ FileNotFoundException -> 0x003d, all -> 0x003a }
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x006a
        L_0x002c:
            r3 = move-exception
            com.google.common.f.e r4 = f93557e
            com.google.common.f.x r4 = r4.mo56225c()
            r5 = 51684(0xc9e4, float:7.2425E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r5)).mo56389s(r0, r11)
            goto L_0x006a
        L_0x003a:
            r9 = move-exception
            r3 = r4
            goto L_0x0040
        L_0x003d:
            goto L_0x0056
        L_0x003f:
            r9 = move-exception
        L_0x0040:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0053
        L_0x0046:
            r10 = move-exception
            com.google.common.f.e r12 = f93557e
            com.google.common.f.x r12 = r12.mo56225c()
            r13 = 51687(0xc9e7, float:7.2429E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r10)).mo56372aa(r13)).mo56389s(r0, r11)
        L_0x0053:
            throw r9
        L_0x0054:
            r4 = r3
        L_0x0056:
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0069
        L_0x005c:
            r9 = move-exception
            com.google.common.f.e r4 = f93557e
            com.google.common.f.x r4 = r4.mo56225c()
            r5 = 51686(0xc9e6, float:7.2428E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r9)).mo56372aa(r5)).mo56389s(r0, r11)
        L_0x0069:
            r9 = r3
        L_0x006a:
            if (r9 == 0) goto L_0x0135
            java.lang.String r0 = "maxImageHeight"
            r3 = 480(0x1e0, float:6.73E-43)
            int r0 = m64081d(r0, r3)
            java.lang.String r3 = "maxImageWidth"
            r4 = 640(0x280, float:8.97E-43)
            int r3 = m64081d(r3, r4)
            int r4 = r9.outWidth
            int r9 = r9.outHeight
            if (r4 <= 0) goto L_0x0119
            if (r9 <= 0) goto L_0x0119
            com.android.f.a.a.r r5 = new com.android.f.a.a.r
            r5.<init>()
            long r6 = (long) r13
            int r13 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x0111
            if (r4 > r3) goto L_0x0111
            if (r9 > r0) goto L_0x0111
            r5.f16341b = r11
            byte[] r9 = r12.getBytes()
            r5.mo10181d(r9)
            java.lang.String r9 = "image_"
            java.lang.String r9 = r8.mo39798b(r9)
            java.lang.String r11 = "image/gif"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 == 0) goto L_0x00ac
            java.lang.String r11 = ".gif"
            goto L_0x00fb
        L_0x00ac:
            java.lang.String r11 = "image/jpeg"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 == 0) goto L_0x00b7
            java.lang.String r11 = ".jpeg"
            goto L_0x00fb
        L_0x00b7:
            java.lang.String r11 = "image/jpg"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 != 0) goto L_0x00f9
            java.lang.String r11 = "image/*"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 == 0) goto L_0x00c8
            goto L_0x00f9
        L_0x00c8:
            java.lang.String r11 = "image/png"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 == 0) goto L_0x00d3
            java.lang.String r11 = ".png"
            goto L_0x00fb
        L_0x00d3:
            java.lang.String r11 = "image/vnd.wap.wbmp"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 == 0) goto L_0x00de
            java.lang.String r11 = ".wbmp"
            goto L_0x00fb
        L_0x00de:
            java.lang.String r11 = "image/x-ms-bmp"
            boolean r11 = com.google.common.base.C58890d.m90990e(r12, r11)
            if (r11 == 0) goto L_0x00e9
            java.lang.String r11 = ".bmp"
            goto L_0x00fb
        L_0x00e9:
            com.google.android.libraries.search.assistant.performer.communication.dh r9 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r10 = "Unsupported image contentType: %"
            java.lang.String r11 = java.lang.String.valueOf(r12)
            java.lang.String r10 = r10.concat(r11)
            r9.<init>(r10)
            throw r9
        L_0x00f9:
            java.lang.String r11 = ".jpg"
        L_0x00fb:
            java.lang.String r11 = r9.concat(r11)
            byte[] r11 = r11.getBytes()
            r5.mo10180c(r11)
            byte[] r9 = r9.getBytes()
            r5.mo10179b(r9)
            r10.mo10152c(r5)
            return r1
        L_0x0111:
            com.google.android.libraries.search.assistant.performer.communication.dh r9 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r10 = "Not Implemented"
            r9.<init>(r10)
            throw r9
        L_0x0119:
            com.google.android.libraries.search.assistant.performer.communication.dh r10 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Invalid image dimensions. Image width: "
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r12 = ". Image height: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0135:
            com.google.android.libraries.search.assistant.performer.communication.dh r9 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r10 = "Can't get image dimensions. BitmapFactory.Options null."
            r9.<init>(r10)
            throw r9
        L_0x013d:
            com.google.android.libraries.search.assistant.performer.communication.dh r9 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r10 = "Can't get image"
            r9.<init>(r10)
            throw r9
        L_0x0145:
            com.google.android.libraries.search.assistant.performer.communication.dh r9 = new com.google.android.libraries.search.assistant.performer.communication.dh
            java.lang.String r10 = "Unsupported image contentType: "
            java.lang.String r11 = java.lang.String.valueOf(r12)
            java.lang.String r10 = r10.concat(r11)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.C35674di.mo39797a(android.content.Context, com.android.f.a.a.j, android.net.Uri, java.lang.String, int):long");
    }

    /* renamed from: b */
    public final String mo39798b(String str) {
        return str.concat(String.valueOf(String.valueOf(this.f93562f.mo26870b())));
    }
}
