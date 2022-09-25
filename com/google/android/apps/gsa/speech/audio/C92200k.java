package com.google.android.apps.gsa.speech.audio;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.c.a.a;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.p590as.p591a.C10772f;
import com.google.android.libraries.p590as.p591a.p592a.C10767a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.protobuf.C63088z;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.speech.audio.k */
/* compiled from: PG */
public final class C92200k {

    /* renamed from: a */
    private static final C59071e f257051a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.k");

    /* renamed from: b */
    private static final AtomicInteger f257052b = new AtomicInteger(0);

    /* renamed from: a */
    static Uri m151397a(Context context, C10770d dVar) {
        Uri.Builder authority = new Uri.Builder().scheme("content").authority(C92201l.m151402a(context));
        int andIncrement = f257052b.getAndIncrement();
        String str = dVar.f35760f;
        Uri build = authority.path("VoiceSearchOriginalAudioRecording" + (andIncrement % 5) + "." + str).build();
        context.revokeUriPermission(build, 1);
        return build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ IOException -> 0x009a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m151398b(android.content.Context r6, com.google.android.apps.gsa.c.a.a r7, com.google.p4152bb.p4153a.C55052eb r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r7.a
            com.google.android.libraries.as.a.d r1 = com.google.android.libraries.p590as.p591a.C10771e.m25766c(r1)
            com.google.android.libraries.as.a.d r2 = com.google.android.libraries.p590as.p591a.C10770d.AMRWB
            if (r1 != r2) goto L_0x0018
            com.google.android.apps.gsa.c.a.a r7 = m151399c(r7)
            int r1 = r7.a
            com.google.android.libraries.as.a.d r1 = com.google.android.libraries.p590as.p591a.C10771e.m25766c(r1)
        L_0x0018:
            if (r8 == 0) goto L_0x002f
            int r2 = r8.f144838b
            int r2 = com.google.p4152bb.p4153a.C55051ea.m87570a(r2)
            if (r2 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r3 = 2
            if (r2 != r3) goto L_0x0028
            com.google.android.libraries.as.a.d r1 = com.google.android.libraries.p590as.p591a.C10770d.PCM
        L_0x0028:
            com.google.bb.a.db r8 = r8.f144837a
            if (r8 != 0) goto L_0x0030
            com.google.bb.a.db r8 = com.google.p4152bb.p4153a.C55025db.f144764b
            goto L_0x0030
        L_0x002f:
            r8 = r0
        L_0x0030:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ IOException -> 0x009a }
            r2.<init>()     // Catch:{ IOException -> 0x009a }
            java.lang.String r3 = "type"
            java.lang.String r4 = r1.f35759e     // Catch:{ IOException -> 0x009a }
            r2.put(r3, r4)     // Catch:{ IOException -> 0x009a }
            java.lang.String r3 = "data"
            if (r8 == 0) goto L_0x0063
            com.google.protobuf.cq r4 = r8.f144766a     // Catch:{ IOException -> 0x009a }
            int r4 = r4.size()     // Catch:{ IOException -> 0x009a }
            if (r4 != 0) goto L_0x0049
            goto L_0x0063
        L_0x0049:
            com.google.protobuf.cq r4 = r8.f144766a     // Catch:{ IOException -> 0x009a }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x009a }
            com.google.bb.a.da r4 = (com.google.p4152bb.p4153a.C55024da) r4     // Catch:{ IOException -> 0x009a }
            int r4 = r4.f144761a     // Catch:{ IOException -> 0x009a }
            com.google.protobuf.cq r8 = r8.f144766a     // Catch:{ IOException -> 0x009a }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ IOException -> 0x009a }
            com.google.bb.a.da r8 = (com.google.p4152bb.p4153a.C55024da) r8     // Catch:{ IOException -> 0x009a }
            int r8 = r8.f144762b     // Catch:{ IOException -> 0x009a }
            byte[] r8 = m151401e(r7, r4, r8)     // Catch:{ IOException -> 0x009a }
            goto L_0x0065
        L_0x0063:
            byte[] r8 = r7.c     // Catch:{ IOException -> 0x009a }
        L_0x0065:
            com.google.android.libraries.as.a.d r4 = com.google.android.libraries.p590as.p591a.C10770d.PCM     // Catch:{ IOException -> 0x009a }
            if (r1 == r4) goto L_0x006d
            byte[] r8 = com.google.android.libraries.p590as.p591a.C10771e.m25769f(r1, r8)     // Catch:{ IOException -> 0x009a }
        L_0x006d:
            r2.put(r3, r8)     // Catch:{ IOException -> 0x009a }
            java.lang.String r8 = "ext"
            java.lang.String r3 = r1.f35760f     // Catch:{ IOException -> 0x009a }
            r2.put(r8, r3)     // Catch:{ IOException -> 0x009a }
            java.lang.String r8 = "sample-rate"
            int r3 = r7.a     // Catch:{ IOException -> 0x009a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x009a }
            r2.put(r8, r3)     // Catch:{ IOException -> 0x009a }
            java.lang.String r8 = "channel-count"
            int r7 = r7.b     // Catch:{ IOException -> 0x009a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x009a }
            r2.put(r8, r7)     // Catch:{ IOException -> 0x009a }
            android.content.ContentResolver r7 = r6.getContentResolver()     // Catch:{ IOException -> 0x009a }
            android.net.Uri r6 = m151397a(r6, r1)     // Catch:{ IOException -> 0x009a }
            android.net.Uri r6 = r7.insert(r6, r2)     // Catch:{ IOException -> 0x009a }
            return r6
        L_0x009a:
            r6 = move-exception
            com.google.common.f.e r7 = f257051a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Unable to add the audio"
            r1 = 12066(0x2f22, float:1.6908E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r6)).mo56372aa(r1)).mo56386p(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.C92200k.m151398b(android.content.Context, com.google.android.apps.gsa.c.a.a, com.google.bb.a.eb):android.net.Uri");
    }

    /* renamed from: c */
    static a m151399c(a aVar) {
        if (aVar.a == 16000 && aVar.b == 1) {
            byte[] bArr = aVar.c;
            int length = bArr.length >> 2;
            int i = length + length;
            byte[] bArr2 = new byte[i];
            for (int i2 = 0; i2 < i; i2 += 2) {
                int i3 = i2 + i2;
                bArr2[i2] = bArr[i3];
                bArr2[i2 + 1] = bArr[i3 + 1];
            }
            return new a(8000, 1, bArr2);
        }
        ((C59052c) ((C59052c) f257051a.mo56225c()).mo56372aa(12067)).mo56359L("resample failed: input audio is not amrwb format: sample rate %d expected: %s, channel count: %d: expected 1", Integer.valueOf(aVar.a), 16000, Integer.valueOf(aVar.b));
        return aVar;
    }

    /* renamed from: d */
    public static C92199j m151400d(Context context, a aVar, int i, int i2, C58833ax axVar) {
        C10770d dVar;
        byte[] bArr;
        InputStream inputStream;
        if (aVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", C10770d.AMR.f35759e);
            if (axVar.mo56113h()) {
                dVar = (C10770d) axVar.mo56107c();
            } else {
                dVar = C10771e.m25766c(aVar.a);
            }
            if (dVar == C10770d.AMRWB) {
                aVar = m151399c(aVar);
                dVar = C10771e.m25766c(aVar.a);
            }
            byte[] e = m151401e(aVar, i, i2);
            C67451at atVar = C67451at.LINEAR16;
            int ordinal = dVar.ordinal();
            if (ordinal == 0) {
                bArr = C10771e.m25770g(e, C67451at.AMR, true);
            } else if (ordinal == 1) {
                bArr = C10771e.m25770g(e, C67451at.AMR_WB, false);
            } else if (ordinal == 3) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                    C10772f fVar = new C10772f();
                    fVar.f35765a = C58833ax.m90834k(24000);
                    fVar.f35766b = C58833ax.m90834k(16000);
                    fVar.f35767c = C58833ax.m90834k(1);
                    fVar.mo19257g(C67451at.OGG_OPUS);
                    inputStream = C10771e.m25768e(byteArrayInputStream, fVar.mo19268j());
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[384];
                        while (true) {
                            int a = C59332o.m92210a(inputStream, bArr2, 0, 384);
                            if (a <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, a);
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                        C59337t.m92221a(inputStream);
                    } catch (IOException e2) {
                        throw new C10767a(e2);
                    } catch (Throwable th) {
                        th = th;
                        C59337t.m92221a(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    C59337t.m92221a(inputStream);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("Encoding not supported: ".concat(String.valueOf(String.valueOf(dVar))));
            }
            contentValues.put("data", bArr);
            contentValues.put("ext", dVar.f35760f);
            contentValues.put("sample-rate", Integer.valueOf(aVar.a));
            contentValues.put("channel-count", Integer.valueOf(aVar.b));
            Uri insert = context.getContentResolver().insert(m151397a(context, dVar), contentValues);
            Uri uri = insert == null ? null : insert;
            C63088z A = C63088z.m96139A(bArr);
            int i3 = i2 - i;
            int i4 = aVar.a;
            C67451at atVar2 = dVar.f35762h;
            if (atVar2 == null) {
                throw new NullPointerException("Null encoding");
            } else if (uri != null) {
                return new C92202m(uri, A, i3, i4, atVar2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" uri");
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        } catch (IOException e3) {
            ((C59052c) ((C59052c) ((C59052c) f257051a.mo56226d()).mo56382g(e3)).mo56372aa(12068)).mo56386p("Failed to encode audio to amr");
            return null;
        }
    }

    /* renamed from: e */
    static byte[] m151401e(a aVar, int i, int i2) {
        int i3 = aVar.a;
        int i4 = aVar.b;
        int i5 = (((i + i) * i3) * i4) / 1000;
        int i6 = (((i2 + i2) * i3) * i4) / 1000;
        byte[] bArr = aVar.c;
        int length = bArr.length;
        if (i5 < 0 || i5 >= i6 || i5 >= length) {
            ((C59052c) ((C59052c) f257051a.mo56225c()).mo56372aa(12069)).mo56359L("sliceRawAudioWithSlicerMetadata: invalid slicing requested - from %s till %s out of total %s", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(length));
            return aVar.c;
        }
        if (i6 > length) {
            i6 = length;
        }
        return Arrays.copyOfRange(bArr, i5, i6);
    }
}
