package com.google.android.apps.gsa.speech.audio;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;

/* compiled from: PG */
public final class AudioProvider extends C90494d {

    /* renamed from: a */
    private static final C59071e f256878a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.AudioProvider");

    /* renamed from: b */
    private final Object f256879b = new Object();

    /* renamed from: c */
    private boolean f256880c;

    /* renamed from: d */
    private final UriMatcher f256881d = new UriMatcher(-1);

    /* renamed from: a */
    private final File m151254a(Uri uri) {
        return getContext().getFileStreamPath(uri.getLastPathSegment());
    }

    /* renamed from: b */
    private final void m151255b() {
        synchronized (this.f256879b) {
            if (!this.f256880c) {
                String a = C92201l.m151402a(getContext());
                ((C59052c) ((C59052c) f256878a.mo56224b()).mo56372aa(12061)).mo56389s("authority: %s", a);
                UriMatcher uriMatcher = this.f256881d;
                C10770d[] dVarArr = {C10770d.AMR, C10770d.AMRWB, C10770d.PCM, C10770d.OGGOPUS};
                for (int i = 0; i < 5; i++) {
                    for (int i2 = 0; i2 < 4; i2++) {
                        C10770d dVar = dVarArr[i2];
                        String str = dVar.f35760f;
                        uriMatcher.addURI(a, "VoiceSearchOriginalAudioRecording" + i + "." + str, dVar.f35761g);
                    }
                }
                this.f256880c = true;
            }
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        m151255b();
        int match = this.f256881d.match(uri);
        for (C10770d dVar : C10770d.values()) {
            if (dVar.f35761g == match) {
                return dVar.f35759e;
            }
        }
        throw new IllegalArgumentException("invalid code: " + match);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ all -> 0x014a, FileNotFoundException -> 0x015c, IOException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc A[Catch:{ all -> 0x014a, FileNotFoundException -> 0x015c, IOException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[Catch:{ all -> 0x014a, FileNotFoundException -> 0x015c, IOException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea A[Catch:{ all -> 0x014a, FileNotFoundException -> 0x015c, IOException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119 A[Catch:{ all -> 0x014a, FileNotFoundException -> 0x015c, IOException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140 A[Catch:{ all -> 0x014a, FileNotFoundException -> 0x015c, IOException -> 0x014f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri insert(android.net.Uri r18, android.content.ContentValues r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = 6
            com.google.android.apps.gsa.p5846e.C74507e.m120469e(r3)
            r17.m151255b()
            android.content.UriMatcher r3 = r1.f256881d
            int r3 = r3.match(r0)
            if (r3 <= 0) goto L_0x019d
            android.content.UriMatcher r3 = r1.f256881d
            int r3 = r3.match(r0)
            com.google.android.libraries.as.a.d r4 = com.google.android.libraries.p590as.p591a.C10770d.PCM
            int r4 = r4.f35761g
            r5 = 0
            java.lang.String r6 = "Failed to write audio file %s"
            java.lang.String r7 = "Failed to open audio file %s"
            java.lang.String r8 = "data"
            if (r3 != r4) goto L_0x0169
            byte[] r3 = r2.getAsByteArray(r8)
            java.io.File r4 = r17.m151254a(r18)
            com.google.audio.a.a r9 = new com.google.audio.a.a     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            int r10 = r3.length     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            byte[] r11 = new byte[r10]     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r9.f143283b = r11     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            byte[] r11 = r9.f143283b     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r12 = 0
            java.lang.System.arraycopy(r3, r12, r11, r12, r10)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.lang.String r3 = "sample-rate"
            java.lang.Integer r3 = r2.getAsInteger(r3)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            int r3 = r3.intValue()     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r10 = 1
            if (r3 <= 0) goto L_0x004f
            r11 = 1
            goto L_0x0050
        L_0x004f:
            r11 = 0
        L_0x0050:
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r13[r12] = r14     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.lang.String r14 = "Sample rate must be positive, got: %s"
            com.google.audio.p4106a.C54571a.m87482c(r11, r14, r13)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r9.f143284c = r3     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r3 = 16
            r9.f143286e = r3     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.lang.String r11 = "channel-count"
            java.lang.Integer r2 = r2.getAsInteger(r11)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            int r2 = r2.intValue()     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            if (r2 <= 0) goto L_0x0071
            r11 = 1
            goto L_0x0072
        L_0x0071:
            r11 = 0
        L_0x0072:
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r13[r12] = r14     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.lang.String r14 = "Number of channels must be positive, got: %s"
            com.google.audio.p4106a.C54571a.m87482c(r11, r14, r13)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r9.f143285d = r2     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            byte[] r11 = r9.f143283b     // Catch:{ all -> 0x014a }
            if (r11 == 0) goto L_0x008c
            r11 = 1
            goto L_0x008d
        L_0x008c:
            r11 = 0
        L_0x008d:
            java.lang.String r13 = "Data must be set"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87482c(r11, r13, r14)     // Catch:{ all -> 0x014a }
            int r11 = r9.f143284c     // Catch:{ all -> 0x014a }
            if (r11 <= 0) goto L_0x009a
            r11 = 1
            goto L_0x009b
        L_0x009a:
            r11 = 0
        L_0x009b:
            java.lang.String r13 = "Sample rate must be set"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87482c(r11, r13, r14)     // Catch:{ all -> 0x014a }
            int r11 = r9.f143285d     // Catch:{ all -> 0x014a }
            int r13 = r9.f143286e     // Catch:{ all -> 0x014a }
            int r14 = r13 / 8
            int r14 = r14 * r11
            byte[] r15 = r9.f143283b     // Catch:{ all -> 0x014a }
            int r15 = r15.length     // Catch:{ all -> 0x014a }
            int r14 = r15 % r14
            int r15 = r15 - r14
            r14 = 2
            if (r13 > r3) goto L_0x00b8
            if (r11 <= r14) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r11 = 0
            goto L_0x00b9
        L_0x00b8:
            r11 = 1
        L_0x00b9:
            if (r10 == r11) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r3 = 40
        L_0x00be:
            java.lang.String r13 = "RIFF"
            byte[] r13 = r13.getBytes()     // Catch:{ all -> 0x014a }
            r2.write(r13)     // Catch:{ all -> 0x014a }
            int r13 = r3 + 20
            int r13 = r13 + r15
            int r16 = r15 % 2
            int r13 = r13 + r16
            com.google.audio.p4106a.C54571a.m87483d(r2, r13)     // Catch:{ all -> 0x014a }
            java.lang.String r13 = "WAVE"
            byte[] r13 = r13.getBytes()     // Catch:{ all -> 0x014a }
            r2.write(r13)     // Catch:{ all -> 0x014a }
            java.lang.String r13 = "fmt "
            byte[] r13 = r13.getBytes()     // Catch:{ all -> 0x014a }
            r2.write(r13)     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87483d(r2, r3)     // Catch:{ all -> 0x014a }
            if (r10 == r11) goto L_0x00ea
            r3 = 1
            goto L_0x00eb
        L_0x00ea:
            r3 = -2
        L_0x00eb:
            com.google.audio.p4106a.C54571a.m87484e(r2, r3)     // Catch:{ all -> 0x014a }
            int r3 = r9.f143285d     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87484e(r2, r3)     // Catch:{ all -> 0x014a }
            int r3 = r9.f143284c     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87483d(r2, r3)     // Catch:{ all -> 0x014a }
            int r3 = r9.f143285d     // Catch:{ all -> 0x014a }
            int r13 = r9.f143284c     // Catch:{ all -> 0x014a }
            int r3 = r3 * r13
            int r13 = r9.f143286e     // Catch:{ all -> 0x014a }
            int r13 = r13 / 8
            int r3 = r3 * r13
            com.google.audio.p4106a.C54571a.m87483d(r2, r3)     // Catch:{ all -> 0x014a }
            int r3 = r9.f143285d     // Catch:{ all -> 0x014a }
            int r13 = r9.f143286e     // Catch:{ all -> 0x014a }
            int r13 = r13 / 8
            int r3 = r3 * r13
            com.google.audio.p4106a.C54571a.m87484e(r2, r3)     // Catch:{ all -> 0x014a }
            int r3 = r9.f143286e     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87484e(r2, r3)     // Catch:{ all -> 0x014a }
            if (r11 == 0) goto L_0x012e
            r3 = 22
            com.google.audio.p4106a.C54571a.m87484e(r2, r3)     // Catch:{ all -> 0x014a }
            int r3 = r9.f143286e     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87484e(r2, r3)     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87483d(r2, r12)     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87484e(r2, r10)     // Catch:{ all -> 0x014a }
            byte[] r3 = com.google.audio.p4106a.C54571a.f143282a     // Catch:{ all -> 0x014a }
            r2.write(r3)     // Catch:{ all -> 0x014a }
        L_0x012e:
            byte[] r3 = r8.getBytes()     // Catch:{ all -> 0x014a }
            r2.write(r3)     // Catch:{ all -> 0x014a }
            com.google.audio.p4106a.C54571a.m87483d(r2, r15)     // Catch:{ all -> 0x014a }
            byte[] r3 = r9.f143283b     // Catch:{ all -> 0x014a }
            r2.write(r3, r12, r15)     // Catch:{ all -> 0x014a }
            int r15 = r15 % r14
            if (r15 != r10) goto L_0x0143
            r2.write(r12)     // Catch:{ all -> 0x014a }
        L_0x0143:
            r2.flush()     // Catch:{ all -> 0x014a }
            r2.close()     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            return r0
        L_0x014a:
            r0 = move-exception
            r2.close()     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
            throw r0     // Catch:{ FileNotFoundException -> 0x015c, IOException -> 0x014f }
        L_0x014f:
            r0 = move-exception
            com.google.common.f.e r2 = f256878a
            com.google.common.f.x r2 = r2.mo56225c()
            r3 = 12065(0x2f21, float:1.6907E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r3)).mo56389s(r6, r4)
            goto L_0x0168
        L_0x015c:
            r0 = move-exception
            com.google.common.f.e r2 = f256878a
            com.google.common.f.x r2 = r2.mo56225c()
            r3 = 12064(0x2f20, float:1.6905E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r3)).mo56389s(r7, r4)
        L_0x0168:
            return r5
        L_0x0169:
            byte[] r2 = r2.getAsByteArray(r8)
            java.io.File r3 = r17.m151254a(r18)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0190, IOException -> 0x0183 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0190, IOException -> 0x0183 }
            r4.write(r2)     // Catch:{ all -> 0x017d }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0190, IOException -> 0x0183 }
            return r0
        L_0x017d:
            r0 = move-exception
            r2 = r0
            r4.close()     // Catch:{ FileNotFoundException -> 0x0190, IOException -> 0x0183 }
            throw r2     // Catch:{ FileNotFoundException -> 0x0190, IOException -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            com.google.common.f.e r2 = f256878a
            com.google.common.f.x r2 = r2.mo56225c()
            r4 = 12063(0x2f1f, float:1.6904E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56389s(r6, r3)
            goto L_0x019c
        L_0x0190:
            r0 = move-exception
            com.google.common.f.e r2 = f256878a
            com.google.common.f.x r2 = r2.mo56225c()
            r4 = 12062(0x2f1e, float:1.6902E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56389s(r7, r3)
        L_0x019c:
            return r5
        L_0x019d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Unknown URI: "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.AudioProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        C74507e.m120470f(6);
        m151255b();
        if (this.f256881d.match(uri) <= 0) {
            throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
        } else if (C33259r.f88929b.equals(str)) {
            return ParcelFileDescriptor.open(m151254a(uri), 268435456);
        } else {
            throw new IllegalArgumentException("Bad mode: ".concat(String.valueOf(str)));
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C74507e.m120471g(6);
        m151255b();
        if (this.f256881d.match(uri) > 0) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name", "_size"}, 1);
            matrixCursor.addRow(new Object[]{uri.getLastPathSegment(), Long.valueOf(m151254a(uri).length())});
            return matrixCursor;
        }
        throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
