package androidx.media3.common;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;

/* renamed from: androidx.media3.common.s */
/* compiled from: PG */
public final class C2675s {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7237a(java.lang.String r19) {
        /*
            r0 = -1
            if (r19 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = androidx.media3.common.C2598ay.m6810i(r19)
            int r2 = r1.hashCode()
            r3 = 10
            r4 = 13
            r5 = 15
            r6 = 9
            r7 = 7
            r8 = 1
            r9 = 5
            r10 = 16
            r11 = 4
            r12 = 3
            r13 = 0
            r14 = 8
            r15 = 14
            r16 = 11
            r17 = 6
            r18 = 12
            switch(r2) {
                case -2123537834: goto L_0x0148;
                case -1662384011: goto L_0x013d;
                case -1662384007: goto L_0x0132;
                case -1662095187: goto L_0x0127;
                case -1606874997: goto L_0x011d;
                case -1487394660: goto L_0x0112;
                case -1248337486: goto L_0x0107;
                case -1079884372: goto L_0x00fc;
                case -1004728940: goto L_0x00f1;
                case -387023398: goto L_0x00e5;
                case -43467528: goto L_0x00d9;
                case 13915911: goto L_0x00cd;
                case 187078296: goto L_0x00c2;
                case 187078297: goto L_0x00b7;
                case 187078669: goto L_0x00ac;
                case 187090232: goto L_0x00a0;
                case 187091926: goto L_0x0094;
                case 187099443: goto L_0x0088;
                case 1331848029: goto L_0x007c;
                case 1503095341: goto L_0x0071;
                case 1504578661: goto L_0x0066;
                case 1504619009: goto L_0x005b;
                case 1504824762: goto L_0x004f;
                case 1504831518: goto L_0x0043;
                case 1505118770: goto L_0x0037;
                case 2039520277: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0152
        L_0x002b:
            java.lang.String r2 = "video/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 10
            goto L_0x0153
        L_0x0037:
            java.lang.String r2 = "audio/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 13
            goto L_0x0153
        L_0x0043:
            java.lang.String r2 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 15
            goto L_0x0153
        L_0x004f:
            java.lang.String r2 = "audio/midi"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 9
            goto L_0x0153
        L_0x005b:
            java.lang.String r2 = "audio/flac"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 7
            goto L_0x0153
        L_0x0066:
            java.lang.String r2 = "audio/eac3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 1
            goto L_0x0153
        L_0x0071:
            java.lang.String r2 = "audio/3gpp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 5
            goto L_0x0153
        L_0x007c:
            java.lang.String r2 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 16
            goto L_0x0153
        L_0x0088:
            java.lang.String r2 = "audio/wav"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 22
            goto L_0x0153
        L_0x0094:
            java.lang.String r2 = "audio/ogg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 19
            goto L_0x0153
        L_0x00a0:
            java.lang.String r2 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 17
            goto L_0x0153
        L_0x00ac:
            java.lang.String r2 = "audio/amr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 4
            goto L_0x0153
        L_0x00b7:
            java.lang.String r2 = "audio/ac4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 3
            goto L_0x0153
        L_0x00c2:
            java.lang.String r2 = "audio/ac3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 0
            goto L_0x0153
        L_0x00cd:
            java.lang.String r2 = "video/x-flv"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 8
            goto L_0x0153
        L_0x00d9:
            java.lang.String r2 = "application/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 14
            goto L_0x0153
        L_0x00e5:
            java.lang.String r2 = "audio/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 11
            goto L_0x0153
        L_0x00f1:
            java.lang.String r2 = "text/vtt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 23
            goto L_0x0153
        L_0x00fc:
            java.lang.String r2 = "video/x-msvideo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 25
            goto L_0x0153
        L_0x0107:
            java.lang.String r2 = "application/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 18
            goto L_0x0153
        L_0x0112:
            java.lang.String r2 = "image/jpeg"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 24
            goto L_0x0153
        L_0x011d:
            java.lang.String r2 = "audio/amr-wb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 6
            goto L_0x0153
        L_0x0127:
            java.lang.String r2 = "video/webm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 12
            goto L_0x0153
        L_0x0132:
            java.lang.String r2 = "video/mp2t"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 21
            goto L_0x0153
        L_0x013d:
            java.lang.String r2 = "video/mp2p"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 20
            goto L_0x0153
        L_0x0148:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0152
            r1 = 2
            goto L_0x0153
        L_0x0152:
            r1 = -1
        L_0x0153:
            switch(r1) {
                case 0: goto L_0x0166;
                case 1: goto L_0x0166;
                case 2: goto L_0x0166;
                case 3: goto L_0x0165;
                case 4: goto L_0x0164;
                case 5: goto L_0x0164;
                case 6: goto L_0x0164;
                case 7: goto L_0x0163;
                case 8: goto L_0x0162;
                case 9: goto L_0x0161;
                case 10: goto L_0x0160;
                case 11: goto L_0x0160;
                case 12: goto L_0x0160;
                case 13: goto L_0x0160;
                case 14: goto L_0x0160;
                case 15: goto L_0x015f;
                case 16: goto L_0x015e;
                case 17: goto L_0x015e;
                case 18: goto L_0x015e;
                case 19: goto L_0x015d;
                case 20: goto L_0x015c;
                case 21: goto L_0x015b;
                case 22: goto L_0x015a;
                case 23: goto L_0x0159;
                case 24: goto L_0x0158;
                case 25: goto L_0x0157;
                default: goto L_0x0156;
            }
        L_0x0156:
            return r0
        L_0x0157:
            return r10
        L_0x0158:
            return r15
        L_0x0159:
            return r4
        L_0x015a:
            return r18
        L_0x015b:
            return r16
        L_0x015c:
            return r3
        L_0x015d:
            return r6
        L_0x015e:
            return r14
        L_0x015f:
            return r7
        L_0x0160:
            return r17
        L_0x0161:
            return r5
        L_0x0162:
            return r9
        L_0x0163:
            return r11
        L_0x0164:
            return r12
        L_0x0165:
            return r8
        L_0x0166:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2675s.m7237a(java.lang.String):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7238b(java.util.Map r2) {
        /*
            java.lang.String r0 = "Content-Type"
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            if (r2 == 0) goto L_0x001a
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
        L_0x001a:
            int r2 = m7237a(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2675s.m7238b(java.util.Map):int");
    }

    /* renamed from: c */
    public static int m7239c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(MediaUtilities.VIDEO_FILE_EXTENSION) || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(MediaUtilities.VIDEO_FILE_EXTENSION, lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        return -1;
    }
}
