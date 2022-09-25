package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.h */
/* compiled from: PG */
public final class C100653h {

    /* renamed from: f */
    private static final C59071e f281452f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.es.h");

    /* renamed from: a */
    public final Context f281453a;

    /* renamed from: b */
    public final C22871g f281454b;

    /* renamed from: c */
    C100654i f281455c;

    /* renamed from: d */
    public final C100643a f281456d;

    /* renamed from: e */
    public final C68214a f281457e;

    /* renamed from: g */
    private final C21370a f281458g;

    /* renamed from: h */
    private final C100668w f281459h;

    public C100653h(Context context, C22871g gVar, C21370a aVar, C100668w wVar, C100643a aVar2, C68214a aVar3) {
        this.f281453a = context;
        this.f281454b = gVar;
        this.f281458g = aVar;
        this.f281459h = wVar;
        this.f281456d = aVar2;
        this.f281457e = aVar3;
    }

    /* renamed from: c */
    protected static final long m166816c(Context context, Uri uri) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor a = C147806g.m240907a(context, uri, C33259r.f88929b, C147805f.f398780b);
            if (a == null) {
                ((C59052c) ((C59052c) f281452f.mo56225c()).mo56372aa(33935)).mo56389s("Failed to open asset for length of uri: %s", uri);
                return 0;
            }
            long length = a.getLength();
            try {
                a.close();
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f281452f.mo56225c()).mo56382g(e)).mo56372aa(33931)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri);
            }
            return length;
        } catch (FileNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f281452f.mo56225c()).mo56382g(e2)).mo56372aa(33932)).mo56389s("Failed to query length of uri: %s", uri);
            if (assetFileDescriptor == null) {
                return 0;
            }
            try {
                assetFileDescriptor.close();
                return 0;
            } catch (IOException e3) {
                ((C59052c) ((C59052c) ((C59052c) f281452f.mo56225c()).mo56382g(e3)).mo56372aa(33933)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri);
                return 0;
            }
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    ((C59052c) ((C59052c) ((C59052c) f281452f.mo56225c()).mo56382g(e4)).mo56372aa(33934)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri);
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    static final int m166817d(String str, int i) {
        Bundle carrierConfigValues = SmsManager.getDefault().getCarrierConfigValues();
        if (carrierConfigValues == null) {
            return i;
        }
        return carrierConfigValues.getInt(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (r4.createNewFile() == false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135 A[SYNTHETIC, Splitter:B:52:0x0135] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final android.net.Uri m166818e(android.content.Context r7, com.android.p266f.p267a.p268a.C5121f r8) {
        /*
            java.lang.String r0 = "Out of memory in composing PDU: "
            com.google.android.apps.gsa.shared.util.ac r1 = com.google.android.apps.gsa.shared.util.C90719ac.f253778a
            java.util.Random r1 = r1.f253779b
            long r1 = r1.nextLong()
            long r1 = java.lang.Math.abs(r1)
            java.lang.String r3 = "content://com.google.android.googlequicksearchbox.GsaPublicContentProvider/mms/"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.net.Uri$Builder r1 = r3.appendPath(r1)
            android.net.Uri r1 = r1.build()
            java.lang.String r2 = r1.getLastPathSegment()
            r3 = 0
            if (r2 == 0) goto L_0x008c
            boolean r4 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.m166804h(r2)
            if (r4 == 0) goto L_0x008c
            java.io.File r4 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.m166803g(r2, r7)
            java.io.File r5 = r4.getParentFile()     // Catch:{ IOException -> 0x007d }
            if (r5 != 0) goto L_0x0052
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.f281445a     // Catch:{ IOException -> 0x007d }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x007d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ IOException -> 0x007d }
            r4 = 33917(0x847d, float:4.7528E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ IOException -> 0x007d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ IOException -> 0x007d }
            java.lang.String r4 = "FileProvider: Failed to create file, no parent directory."
            r1.mo56386p(r4)     // Catch:{ IOException -> 0x007d }
            goto L_0x008c
        L_0x0052:
            boolean r6 = r5.exists()     // Catch:{ IOException -> 0x007d }
            if (r6 != 0) goto L_0x0076
            boolean r5 = r5.mkdirs()     // Catch:{ IOException -> 0x007d }
            if (r5 == 0) goto L_0x005f
            goto L_0x0076
        L_0x005f:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.f281445a     // Catch:{ IOException -> 0x007d }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ IOException -> 0x007d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ IOException -> 0x007d }
            r4 = 33916(0x847c, float:4.7526E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ IOException -> 0x007d }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ IOException -> 0x007d }
            java.lang.String r4 = "FileProvider: Failed to create parent dir"
            r1.mo56386p(r4)     // Catch:{ IOException -> 0x007d }
            goto L_0x008c
        L_0x0076:
            boolean r4 = r4.createNewFile()     // Catch:{ IOException -> 0x007d }
            if (r4 != 0) goto L_0x009b
            goto L_0x008c
        L_0x007d:
            r1 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.f281445a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "FileProvider: Failed to create file"
            r6 = 33915(0x847b, float:4.7525E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r1)).mo56372aa(r6)).mo56386p(r5)
        L_0x008c:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.f281445a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r4 = "Failed to create temp file. fileId: %s"
            r5 = 33911(0x8477, float:4.752E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r5)).mo56389s(r4, r2)
            r1 = r3
        L_0x009b:
            if (r1 == 0) goto L_0x0141
            java.lang.String r2 = r1.getLastPathSegment()
            if (r2 == 0) goto L_0x0139
            java.io.File r2 = com.google.android.apps.gsa.staticplugins.p7930es.C100647b.m166803g(r2, r7)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0107, OutOfMemoryError -> 0x00d1 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0107, OutOfMemoryError -> 0x00d1 }
            com.android.f.a.a.n r3 = new com.android.f.a.a.n     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
            r3.<init>(r7, r8)     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
            byte[] r7 = r3.mo10166i()     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
            if (r7 == 0) goto L_0x00be
            r4.write(r7)     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
            r4.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            return r1
        L_0x00be:
            com.google.android.apps.gsa.staticplugins.es.j r7 = new com.google.android.apps.gsa.staticplugins.es.j     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
            java.lang.String r8 = "Empty or zero length PDU data"
            r7.<init>(r8)     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
            throw r7     // Catch:{ IOException -> 0x00cc, OutOfMemoryError -> 0x00c9, all -> 0x00c6 }
        L_0x00c6:
            r7 = move-exception
            r3 = r4
            goto L_0x0133
        L_0x00c9:
            r7 = move-exception
            r3 = r4
            goto L_0x00d2
        L_0x00cc:
            r7 = move-exception
            r3 = r4
            goto L_0x0108
        L_0x00cf:
            r7 = move-exception
            goto L_0x0133
        L_0x00d1:
            r7 = move-exception
        L_0x00d2:
            r2.delete()     // Catch:{ all -> 0x00cf }
            com.google.common.f.e r8 = f281452f     // Catch:{ all -> 0x00cf }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x00cf }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00cf }
            com.google.common.f.x r8 = r8.mo56382g(r7)     // Catch:{ all -> 0x00cf }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00cf }
            r1 = 33942(0x8496, float:4.7563E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r1)     // Catch:{ all -> 0x00cf }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Out of memory in composing PDU"
            r8.mo56386p(r1)     // Catch:{ all -> 0x00cf }
            com.google.android.apps.gsa.staticplugins.es.j r8 = new com.google.android.apps.gsa.staticplugins.es.j     // Catch:{ all -> 0x00cf }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r1.<init>(r0)     // Catch:{ all -> 0x00cf }
            r1.append(r7)     // Catch:{ all -> 0x00cf }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x00cf }
            r8.<init>(r7)     // Catch:{ all -> 0x00cf }
            throw r8     // Catch:{ all -> 0x00cf }
        L_0x0107:
            r7 = move-exception
        L_0x0108:
            r2.delete()     // Catch:{ all -> 0x00cf }
            com.google.common.f.e r8 = f281452f     // Catch:{ all -> 0x00cf }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x00cf }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00cf }
            com.google.common.f.x r7 = r8.mo56382g(r7)     // Catch:{ all -> 0x00cf }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x00cf }
            r8 = 33941(0x8495, float:4.7561E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ all -> 0x00cf }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x00cf }
            java.lang.String r8 = "Cannot create temporary file %s"
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ all -> 0x00cf }
            r7.mo56389s(r8, r0)     // Catch:{ all -> 0x00cf }
            com.google.android.apps.gsa.staticplugins.es.j r7 = new com.google.android.apps.gsa.staticplugins.es.j     // Catch:{ all -> 0x00cf }
            java.lang.String r8 = "Cannot create raw mms file"
            r7.<init>(r8)     // Catch:{ all -> 0x00cf }
            throw r7     // Catch:{ all -> 0x00cf }
        L_0x0133:
            if (r3 == 0) goto L_0x0138
            r3.close()     // Catch:{ IOException -> 0x0138 }
        L_0x0138:
            throw r7
        L_0x0139:
            com.google.android.apps.gsa.staticplugins.es.j r7 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r8 = "Invalid file id pdu file"
            r7.<init>(r8)
            throw r7
        L_0x0141:
            com.google.android.apps.gsa.staticplugins.es.j r7 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r8 = "Failed to get uri for pdu file"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7930es.C100653h.m166818e(android.content.Context, com.android.f.a.a.f):android.net.Uri");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC, Splitter:B:19:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[SYNTHETIC, Splitter:B:27:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0145  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo91993a(android.content.Context r10, com.android.p266f.p267a.p268a.C5125j r11, android.net.Uri r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to close inputStream for uri: %s"
            boolean r1 = com.android.p266f.p267a.C5115a.m13990b(r13)
            if (r1 == 0) goto L_0x0155
            long r1 = m166816c(r10, r12)
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x014d
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options
            r10.<init>()
            r3 = 1
            r10.inJustDecodeBounds = r3
            r3 = 0
            android.content.Context r4 = r9.f281453a     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x003f }
            com.google.android.libraries.ao.c.f r5 = com.google.android.libraries.p11029ao.p11032c.C147805f.f398780b     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x003f }
            java.io.InputStream r4 = com.google.android.libraries.p11029ao.p11032c.C147806g.m240909c(r4, r12, r5)     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x003f }
            android.graphics.BitmapFactory.decodeStream(r4, r3, r10)     // Catch:{ FileNotFoundException -> 0x003d, all -> 0x003a }
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x006a
        L_0x002c:
            r3 = move-exception
            com.google.common.f.e r4 = f281452f
            com.google.common.f.x r4 = r4.mo56225c()
            r5 = 33937(0x8491, float:4.7556E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r5)).mo56389s(r0, r12)
            goto L_0x006a
        L_0x003a:
            r10 = move-exception
            r3 = r4
            goto L_0x0040
        L_0x003d:
            goto L_0x0056
        L_0x003f:
            r10 = move-exception
        L_0x0040:
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0053
        L_0x0046:
            r11 = move-exception
            com.google.common.f.e r13 = f281452f
            com.google.common.f.x r13 = r13.mo56225c()
            r14 = 33940(0x8494, float:4.756E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r11)).mo56372aa(r14)).mo56389s(r0, r12)
        L_0x0053:
            throw r10
        L_0x0054:
            r4 = r3
        L_0x0056:
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0069
        L_0x005c:
            r10 = move-exception
            com.google.common.f.e r4 = f281452f
            com.google.common.f.x r4 = r4.mo56225c()
            r5 = 33939(0x8493, float:4.7559E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r10)).mo56372aa(r5)).mo56389s(r0, r12)
        L_0x0069:
            r10 = r3
        L_0x006a:
            if (r10 == 0) goto L_0x0145
            java.lang.String r0 = "maxImageHeight"
            r3 = 480(0x1e0, float:6.73E-43)
            int r0 = m166817d(r0, r3)
            java.lang.String r3 = "maxImageWidth"
            r4 = 640(0x280, float:8.97E-43)
            int r3 = m166817d(r3, r4)
            int r4 = r10.outWidth
            int r10 = r10.outHeight
            if (r4 <= 0) goto L_0x0129
            if (r10 <= 0) goto L_0x0129
            com.android.f.a.a.r r5 = new com.android.f.a.a.r
            r5.<init>()
            long r6 = (long) r14
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0095
            if (r4 > r3) goto L_0x0095
            if (r10 > r0) goto L_0x0095
            r5.f16341b = r12
            goto L_0x00a4
        L_0x0095:
            com.google.android.apps.gsa.staticplugins.es.w r10 = r9.f281459h
            byte[] r10 = r10.mo92004a(r12, r3, r0, r14)
            if (r10 == 0) goto L_0x0121
            int r12 = r10.length
            if (r12 == 0) goto L_0x0121
            long r1 = (long) r12
            r5.mo10182e(r10)
        L_0x00a4:
            byte[] r10 = r13.getBytes()
            r5.mo10181d(r10)
            java.lang.String r10 = "image_"
            java.lang.String r10 = r9.mo91994b(r10)
            java.lang.String r12 = "image/gif"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 == 0) goto L_0x00bc
            java.lang.String r12 = ".gif"
            goto L_0x010b
        L_0x00bc:
            java.lang.String r12 = "image/jpeg"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 == 0) goto L_0x00c7
            java.lang.String r12 = ".jpeg"
            goto L_0x010b
        L_0x00c7:
            java.lang.String r12 = "image/jpg"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 != 0) goto L_0x0109
            java.lang.String r12 = "image/*"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 == 0) goto L_0x00d8
            goto L_0x0109
        L_0x00d8:
            java.lang.String r12 = "image/png"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 == 0) goto L_0x00e3
            java.lang.String r12 = ".png"
            goto L_0x010b
        L_0x00e3:
            java.lang.String r12 = "image/vnd.wap.wbmp"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 == 0) goto L_0x00ee
            java.lang.String r12 = ".wbmp"
            goto L_0x010b
        L_0x00ee:
            java.lang.String r12 = "image/x-ms-bmp"
            boolean r12 = com.google.common.base.C58890d.m90990e(r13, r12)
            if (r12 == 0) goto L_0x00f9
            java.lang.String r12 = ".bmp"
            goto L_0x010b
        L_0x00f9:
            com.google.android.apps.gsa.staticplugins.es.j r10 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r11 = "Unsupported image contentType: %"
            java.lang.String r12 = java.lang.String.valueOf(r13)
            java.lang.String r11 = r11.concat(r12)
            r10.<init>(r11)
            throw r10
        L_0x0109:
            java.lang.String r12 = ".jpg"
        L_0x010b:
            java.lang.String r12 = r10.concat(r12)
            byte[] r12 = r12.getBytes()
            r5.mo10180c(r12)
            byte[] r10 = r10.getBytes()
            r5.mo10179b(r10)
            r11.mo10152c(r5)
            return r1
        L_0x0121:
            com.google.android.apps.gsa.staticplugins.es.j r10 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r11 = "Failed to resize image. ImageBytes empty."
            r10.<init>(r11)
            throw r10
        L_0x0129:
            com.google.android.apps.gsa.staticplugins.es.j r11 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Invalid image dimensions. Image width: "
            r12.<init>(r13)
            r12.append(r4)
            java.lang.String r13 = ". Image height: "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0145:
            com.google.android.apps.gsa.staticplugins.es.j r10 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r11 = "Can't get image dimensions. BitmapFactory.Options null."
            r10.<init>(r11)
            throw r10
        L_0x014d:
            com.google.android.apps.gsa.staticplugins.es.j r10 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r11 = "Can't get image"
            r10.<init>(r11)
            throw r10
        L_0x0155:
            com.google.android.apps.gsa.staticplugins.es.j r10 = new com.google.android.apps.gsa.staticplugins.es.j
            java.lang.String r11 = "Unsupported image contentType: "
            java.lang.String r12 = java.lang.String.valueOf(r13)
            java.lang.String r11 = r11.concat(r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7930es.C100653h.mo91993a(android.content.Context, com.android.f.a.a.j, android.net.Uri, java.lang.String, int):long");
    }

    /* renamed from: b */
    public final String mo91994b(String str) {
        return str.concat(String.valueOf(String.valueOf(this.f281458g.mo26870b())));
    }
}
