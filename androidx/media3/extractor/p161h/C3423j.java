package androidx.media3.extractor.p161h;

import android.util.Pair;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3330ae;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import com.google.common.base.C58913w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.h.j */
/* compiled from: PG */
final class C3423j {

    /* renamed from: a */
    private static final byte[] f10489a = C2612ak.m6961ak("OpusHead");

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x033c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        if (r0 != 13) goto L_0x03ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0311 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair m9905a(androidx.media3.extractor.p161h.C3415b r17) {
        /*
            r0 = r17
            androidx.media3.common.b.ac r1 = r0.f10462a
            r0 = 8
            r1.mo6131A(r0)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x000c:
            int r5 = r1.f7236c
            int r6 = r1.f7235b
            int r5 = r5 - r6
            if (r5 < r0) goto L_0x03b6
            int r5 = r1.mo6134b()
            int r7 = r1.mo6134b()
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            r11 = 0
            r12 = 1
            if (r7 != r8) goto L_0x033f
            r1.mo6131A(r6)
            int r3 = r6 + r5
            int r7 = r1.f7235b
            int r7 = r7 + r0
            r1.mo6131A(r7)
            m9907c(r1)
        L_0x0030:
            int r7 = r1.f7235b
            if (r7 >= r3) goto L_0x033a
            int r8 = r1.mo6134b()
            int r13 = r1.mo6134b()
            r14 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r13 != r14) goto L_0x032d
            r1.mo6131A(r7)
            int r7 = r7 + r8
            int r3 = r1.f7235b
            int r3 = r3 + r0
            r1.mo6131A(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0050:
            int r8 = r1.f7235b
            if (r8 >= r7) goto L_0x031c
            int r8 = androidx.media3.extractor.p161h.C3429p.f10545b
            int r8 = r1.f7235b
            int r13 = r1.mo6134b()
            int r8 = r8 + r13
            int r13 = r1.mo6134b()
            int r14 = r13 >> 24
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 169(0xa9, float:2.37E-43)
            java.lang.String r0 = "TCON"
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "MetadataUtil"
            if (r14 == r15) goto L_0x0234
            r15 = 253(0xfd, float:3.55E-43)
            if (r14 != r15) goto L_0x0079
            goto L_0x0234
        L_0x0079:
            r14 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r13 != r14) goto L_0x009f
            int r10 = androidx.media3.extractor.p161h.C3429p.m9938a(r1)     // Catch:{ all -> 0x026f }
            if (r10 <= 0) goto L_0x008f
            r13 = 192(0xc0, float:2.69E-43)
            if (r10 > r13) goto L_0x008f
            java.lang.String[] r13 = androidx.media3.extractor.p161h.C3429p.f10544a     // Catch:{ all -> 0x026f }
            int r10 = r10 + -1
            r10 = r13[r10]     // Catch:{ all -> 0x026f }
            goto L_0x0090
        L_0x008f:
            r10 = r2
        L_0x0090:
            if (r10 == 0) goto L_0x0098
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = new androidx.media3.extractor.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x026f }
            r9.<init>(r0, r2, r10)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0098:
            java.lang.String r0 = "Failed to parse standard genre code"
            androidx.media3.common.p136b.C2633u.m7050e(r9, r0)     // Catch:{ all -> 0x026f }
        L_0x009d:
            r9 = r2
            goto L_0x00aa
        L_0x009f:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r13 != r0) goto L_0x00b1
            java.lang.String r9 = "TPOS"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9940c(r0, r9, r1)     // Catch:{ all -> 0x026f }
        L_0x00aa:
            r1.mo6131A(r8)
            r10 = 8
            goto L_0x030c
        L_0x00b1:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r13 != r0) goto L_0x00bd
            java.lang.String r9 = "TRCK"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9940c(r0, r9, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x00bd:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r13 != r0) goto L_0x00c9
            java.lang.String r9 = "TBPM"
            androidx.media3.extractor.metadata.id3.Id3Frame r9 = androidx.media3.extractor.p161h.C3429p.m9939b(r0, r9, r1, r12, r11)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x00c9:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r13 != r0) goto L_0x00d5
            java.lang.String r9 = "TCMP"
            androidx.media3.extractor.metadata.id3.Id3Frame r9 = androidx.media3.extractor.p161h.C3429p.m9939b(r0, r9, r1, r12, r12)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x00d5:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r13 != r0) goto L_0x012f
            int r0 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            int r13 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            if (r13 != r10) goto L_0x0128
            int r10 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            r10 = r10 & r16
            r13 = 13
            if (r10 != r13) goto L_0x00f1
            java.lang.String r13 = "image/jpeg"
            goto L_0x00fb
        L_0x00f1:
            r13 = 14
            if (r10 != r13) goto L_0x00fa
            java.lang.String r13 = "image/png"
            r10 = 14
            goto L_0x00fb
        L_0x00fa:
            r13 = r2
        L_0x00fb:
            if (r13 != 0) goto L_0x0112
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r0.<init>()     // Catch:{ all -> 0x026f }
            java.lang.String r13 = "Unrecognized cover art flags: "
            r0.append(r13)     // Catch:{ all -> 0x026f }
            r0.append(r10)     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x026f }
            androidx.media3.common.p136b.C2633u.m7050e(r9, r0)     // Catch:{ all -> 0x026f }
            goto L_0x009d
        L_0x0112:
            int r9 = r1.f7235b     // Catch:{ all -> 0x026f }
            int r9 = r9 + 4
            r1.mo6131A(r9)     // Catch:{ all -> 0x026f }
            int r0 = r0 + -16
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x026f }
            r1.mo6155w(r9, r11, r0)     // Catch:{ all -> 0x026f }
            androidx.media3.extractor.metadata.id3.ApicFrame r0 = new androidx.media3.extractor.metadata.id3.ApicFrame     // Catch:{ all -> 0x026f }
            r10 = 3
            r0.<init>(r13, r2, r10, r9)     // Catch:{ all -> 0x026f }
            r9 = r0
            goto L_0x00aa
        L_0x0128:
            java.lang.String r0 = "Failed to parse cover art attribute"
            androidx.media3.common.p136b.C2633u.m7050e(r9, r0)     // Catch:{ all -> 0x026f }
            goto L_0x009d
        L_0x012f:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r13 != r0) goto L_0x013c
            java.lang.String r9 = "TPE2"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r0, r9, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x013c:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r13 != r0) goto L_0x0149
            java.lang.String r9 = "TSOT"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r0, r9, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0149:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r13 != r0) goto L_0x0156
            java.lang.String r9 = "TSO2"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r0, r9, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0156:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r13 != r0) goto L_0x0166
            java.lang.String r0 = "TSOA"
            r9 = 1936679282(0x736f6172, float:1.8965689E31)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r9, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0166:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r13 != r0) goto L_0x0176
            java.lang.String r0 = "TSOP"
            r9 = 1936679265(0x736f6161, float:1.8965668E31)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r9, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0176:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r13 != r0) goto L_0x0186
            java.lang.String r0 = "TSOC"
            r9 = 1936679791(0x736f636f, float:1.8966304E31)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r9, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0186:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r13 != r0) goto L_0x0196
            java.lang.String r0 = "ITUNESADVISORY"
            r9 = 1920233063(0x72746e67, float:4.84146E30)
            androidx.media3.extractor.metadata.id3.Id3Frame r9 = androidx.media3.extractor.p161h.C3429p.m9939b(r9, r0, r1, r11, r11)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x0196:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r13 != r0) goto L_0x01a6
            java.lang.String r0 = "ITUNESGAPLESS"
            r9 = 1885823344(0x70676170, float:2.8643533E29)
            androidx.media3.extractor.metadata.id3.Id3Frame r9 = androidx.media3.extractor.p161h.C3429p.m9939b(r9, r0, r1, r11, r12)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x01a6:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r13 != r0) goto L_0x01b6
            java.lang.String r0 = "TVSHOWSORT"
            r9 = 1936683886(0x736f736e, float:1.8971255E31)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r9, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x01b6:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r13 != r0) goto L_0x01c6
            java.lang.String r0 = "TVSHOW"
            r9 = 1953919848(0x74767368, float:7.810338E31)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r9, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x00aa
        L_0x01c6:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r13 != r0) goto L_0x0230
            r0 = -1
            r9 = r2
            r13 = r9
            r14 = -1
            r15 = -1
        L_0x01d0:
            int r2 = r1.f7235b     // Catch:{ all -> 0x026f }
            if (r2 >= r8) goto L_0x020f
            int r16 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            int r11 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            int r12 = r1.f7235b     // Catch:{ all -> 0x026f }
            int r12 = r12 + 4
            r1.mo6131A(r12)     // Catch:{ all -> 0x026f }
            r12 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r11 != r12) goto L_0x01ef
            int r2 = r16 + -12
            java.lang.String r9 = r1.mo6150r(r2)     // Catch:{ all -> 0x026f }
            goto L_0x020c
        L_0x01ef:
            r12 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r11 != r12) goto L_0x01fb
            int r2 = r16 + -12
            java.lang.String r13 = r1.mo6150r(r2)     // Catch:{ all -> 0x026f }
            goto L_0x020c
        L_0x01fb:
            if (r11 != r10) goto L_0x01ff
            r15 = r16
        L_0x01ff:
            if (r11 == r10) goto L_0x0202
            goto L_0x0203
        L_0x0202:
            r14 = r2
        L_0x0203:
            int r16 = r16 + -12
            int r2 = r1.f7235b     // Catch:{ all -> 0x026f }
            int r2 = r2 + r16
            r1.mo6131A(r2)     // Catch:{ all -> 0x026f }
        L_0x020c:
            r11 = 0
            r12 = 1
            goto L_0x01d0
        L_0x020f:
            if (r9 == 0) goto L_0x022d
            if (r13 == 0) goto L_0x022d
            if (r14 != r0) goto L_0x0216
            goto L_0x022d
        L_0x0216:
            r1.mo6131A(r14)     // Catch:{ all -> 0x026f }
            int r0 = r1.f7235b     // Catch:{ all -> 0x026f }
            int r0 = r0 + 16
            r1.mo6131A(r0)     // Catch:{ all -> 0x026f }
            int r15 = r15 + -16
            java.lang.String r0 = r1.mo6150r(r15)     // Catch:{ all -> 0x026f }
            androidx.media3.extractor.metadata.id3.InternalFrame r2 = new androidx.media3.extractor.metadata.id3.InternalFrame     // Catch:{ all -> 0x026f }
            r2.<init>(r9, r13, r0)     // Catch:{ all -> 0x026f }
            goto L_0x009d
        L_0x022d:
            r9 = 0
            goto L_0x00aa
        L_0x0230:
            r10 = 8
            goto L_0x02df
        L_0x0234:
            r2 = r13 & r16
            r11 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r11) goto L_0x0272
            int r0 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            int r2 = r1.mo6134b()     // Catch:{ all -> 0x026f }
            if (r2 != r10) goto L_0x025d
            int r2 = r1.f7235b     // Catch:{ all -> 0x026f }
            r10 = 8
            int r2 = r2 + r10
            r1.mo6131A(r2)     // Catch:{ all -> 0x026f }
            int r0 = r0 + -16
            java.lang.String r0 = r1.mo6150r(r0)     // Catch:{ all -> 0x026f }
            androidx.media3.extractor.metadata.id3.CommentFrame r2 = new androidx.media3.extractor.metadata.id3.CommentFrame     // Catch:{ all -> 0x026f }
            java.lang.String r9 = "und"
            r2.<init>(r9, r0, r0)     // Catch:{ all -> 0x026f }
            r9 = r2
            goto L_0x0309
        L_0x025d:
            r10 = 8
            java.lang.String r0 = androidx.media3.extractor.p161h.C3416c.m9894f(r13)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x026f }
            androidx.media3.common.p136b.C2633u.m7050e(r9, r0)     // Catch:{ all -> 0x026f }
            r9 = 0
            goto L_0x0309
        L_0x026f:
            r0 = move-exception
            goto L_0x0318
        L_0x0272:
            r10 = 8
            r11 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r11) goto L_0x0303
            r11 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r11) goto L_0x0280
            goto L_0x0303
        L_0x0280:
            r11 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r11) goto L_0x02fc
            r11 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r11) goto L_0x028c
            goto L_0x02fc
        L_0x028c:
            r11 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r11) goto L_0x0299
            java.lang.String r0 = "TDRC"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x0299:
            r11 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r11) goto L_0x02a5
            java.lang.String r0 = "TPE1"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x02a5:
            r11 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r11) goto L_0x02b1
            java.lang.String r0 = "TSSE"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x02b1:
            r11 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r11) goto L_0x02bd
            java.lang.String r0 = "TALB"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x02bd:
            r11 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r11) goto L_0x02c9
            java.lang.String r0 = "USLT"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x02c9:
            r11 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r11) goto L_0x02d3
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x02d3:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r0) goto L_0x02df
            java.lang.String r0 = "TIT1"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x02df:
            java.lang.String r0 = androidx.media3.extractor.p161h.C3416c.m9894f(r13)     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r2.<init>()     // Catch:{ all -> 0x026f }
            java.lang.String r11 = "Skipped unknown metadata entry: "
            r2.append(r11)     // Catch:{ all -> 0x026f }
            r2.append(r0)     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x026f }
            androidx.media3.common.p136b.C2633u.m7047b(r9, r0)     // Catch:{ all -> 0x026f }
            r1.mo6131A(r8)
            r9 = 0
            goto L_0x030c
        L_0x02fc:
            java.lang.String r0 = "TCOM"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
            goto L_0x0309
        L_0x0303:
            java.lang.String r0 = "TIT2"
            androidx.media3.extractor.metadata.id3.TextInformationFrame r9 = androidx.media3.extractor.p161h.C3429p.m9941d(r13, r0, r1)     // Catch:{ all -> 0x026f }
        L_0x0309:
            r1.mo6131A(r8)
        L_0x030c:
            if (r9 == 0) goto L_0x0311
            r3.add(r9)
        L_0x0311:
            r0 = 8
            r2 = 0
            r11 = 0
            r12 = 1
            goto L_0x0050
        L_0x0318:
            r1.mo6131A(r8)
            throw r0
        L_0x031c:
            r10 = 8
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0325
            goto L_0x033c
        L_0x0325:
            androidx.media3.common.Metadata r0 = new androidx.media3.common.Metadata
            r0.<init>((java.util.List) r3)
            r3 = r0
            goto L_0x03ad
        L_0x032d:
            r10 = 8
            int r7 = r7 + r8
            r1.mo6131A(r7)
            r0 = 8
            r2 = 0
            r11 = 0
            r12 = 1
            goto L_0x0030
        L_0x033a:
            r10 = 8
        L_0x033c:
            r3 = 0
            goto L_0x03ad
        L_0x033f:
            r10 = 8
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r7 != r0) goto L_0x03ad
            r1.mo6131A(r6)
            int r0 = r6 + r5
            int r2 = r1.f7235b
            r4 = 12
            int r2 = r2 + r4
            r1.mo6131A(r2)
        L_0x0353:
            int r2 = r1.f7235b
            if (r2 >= r0) goto L_0x03ac
            int r7 = r1.mo6134b()
            int r8 = r1.mo6134b()
            r9 = 1935766900(0x73617574, float:1.7862687E31)
            if (r8 != r9) goto L_0x03a1
            r8 = 14
            if (r7 >= r8) goto L_0x0369
            goto L_0x03ac
        L_0x0369:
            int r0 = r1.f7235b
            int r0 = r0 + 5
            r1.mo6131A(r0)
            int r0 = r1.mo6139g()
            r2 = 1123024896(0x42f00000, float:120.0)
            if (r0 == r4) goto L_0x037d
            r9 = 13
            if (r0 == r9) goto L_0x0381
            goto L_0x03ac
        L_0x037d:
            if (r0 != r4) goto L_0x0381
            r2 = 1131413504(0x43700000, float:240.0)
        L_0x0381:
            int r0 = r1.f7235b
            r11 = 1
            int r0 = r0 + r11
            r1.mo6131A(r0)
            int r0 = r1.mo6139g()
            androidx.media3.common.Metadata r4 = new androidx.media3.common.Metadata
            androidx.media3.common.Metadata$Entry[] r7 = new androidx.media3.common.Metadata.Entry[r11]
            androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry r8 = new androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry
            r8.<init>(r2, r0)
            r12 = 0
            r7[r12] = r8
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.<init>(r8, r7)
            goto L_0x03ad
        L_0x03a1:
            r8 = 14
            r9 = 13
            r11 = 1
            r12 = 0
            int r2 = r2 + r7
            r1.mo6131A(r2)
            goto L_0x0353
        L_0x03ac:
            r4 = 0
        L_0x03ad:
            int r6 = r6 + r5
            r1.mo6131A(r6)
            r0 = 8
            r2 = 0
            goto L_0x000c
        L_0x03b6:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3423j.m9905a(androidx.media3.extractor.h.b):android.util.Pair");
    }

    /* renamed from: b */
    public static Metadata m9906b(C3413a aVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        C3415b b = aVar.mo7380b(1751411826);
        C3415b b2 = aVar.mo7380b(1801812339);
        C3415b b3 = aVar.mo7380b(1768715124);
        if (b == null || b2 == null || b3 == null || m9911g(b.f10462a) != 1835299937) {
            return null;
        }
        C2604ac acVar = b2.f10462a;
        acVar.mo6131A(12);
        int b4 = acVar.mo6134b();
        String[] strArr = new String[b4];
        for (int i = 0; i < b4; i++) {
            int b5 = acVar.mo6134b();
            acVar.mo6131A(acVar.f7235b + 4);
            strArr[i] = acVar.mo6151s(b5 - 8, C58913w.f156754c);
        }
        C2604ac acVar2 = b3.f10462a;
        acVar2.mo6131A(8);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = acVar2.f7236c;
            int i3 = acVar2.f7235b;
            if (i2 - i3 <= 8) {
                break;
            }
            int b6 = acVar2.mo6134b();
            int b7 = acVar2.mo6134b() - 1;
            if (b7 < 0 || b7 >= b4) {
                C2633u.m7050e("AtomParsers", "Skipped metadata with unknown key index: " + b7);
            } else {
                String str = strArr[b7];
                int i4 = i3 + b6;
                int i5 = C3429p.f10545b;
                while (true) {
                    int i6 = acVar2.f7235b;
                    if (i6 >= i4) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int b8 = acVar2.mo6134b();
                    if (acVar2.mo6134b() == 1684108385) {
                        int b9 = acVar2.mo6134b();
                        int b10 = acVar2.mo6134b();
                        int i7 = b8 - 16;
                        byte[] bArr = new byte[i7];
                        acVar2.mo6155w(bArr, 0, i7);
                        mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr, b10, b9);
                        break;
                    }
                    acVar2.mo6131A(i6 + b8);
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            }
            acVar2.mo6131A(i3 + b6);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List) arrayList);
    }

    /* renamed from: c */
    public static void m9907c(C2604ac acVar) {
        int i = acVar.f7235b;
        int i2 = i + 4;
        acVar.mo6131A(i2);
        if (acVar.mo6134b() != 1751411826) {
            i = i2;
        }
        acVar.mo6131A(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (r14 == 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x072a, code lost:
        if (r24 == null) goto L_0x0740;
     */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07a5  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x07ae  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x07b4  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x07b8  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x07ec  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x099f  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0a72 A[LOOP:12: B:473:0x0a72->B:477:0x0a7c, LOOP_START, PHI: r16 
      PHI: (r16v19 int) = (r16v8 int), (r16v20 int) binds: [B:472:0x0a70, B:477:0x0a7c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0ad6  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0aeb  */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x0aee  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0b46  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0b59  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0d95  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x0a66 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m9908d(androidx.media3.extractor.p161h.C3413a r53, androidx.media3.extractor.C3339an r54, long r55, androidx.media3.common.DrmInitData r57, boolean r58, com.google.common.base.C58817ah r59) {
        /*
            r0 = r53
            r1 = r54
            r12 = r57
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List r2 = r0.f10453c
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0da2
            java.util.List r2 = r0.f10453c
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            androidx.media3.extractor.h.a r11 = (androidx.media3.extractor.p161h.C3413a) r11
            int r2 = r11.f10463d
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r31 = r15
            goto L_0x0d97
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            androidx.media3.extractor.h.b r2 = r0.mo7380b(r2)
            r2.getClass()
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            androidx.media3.extractor.h.a r3 = r11.mo7379a(r10)
            r3.getClass()
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            androidx.media3.extractor.h.b r4 = r3.mo7380b(r4)
            r4.getClass()
            androidx.media3.common.b.ac r4 = r4.f10462a
            int r4 = m9911g(r4)
            int r9 = m9909e(r4)
            java.lang.String r6 = "AtomParsers"
            r31 = r15
            r5 = -1
            if (r9 != r5) goto L_0x0064
            r0 = r59
            r7 = r6
            r2 = r11
            r32 = r13
            r4 = 1
            r5 = 2
            r6 = -1
        L_0x0061:
            r8 = 0
            goto L_0x07e3
        L_0x0064:
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            androidx.media3.extractor.h.b r4 = r11.mo7380b(r4)
            r4.getClass()
            androidx.media3.common.b.ac r4 = r4.f10462a
            r8 = 8
            r4.mo6131A(r8)
            int r21 = r4.mo6134b()
            int r21 = androidx.media3.extractor.p161h.C3416c.m9893e(r21)
            r22 = 16
            if (r21 != 0) goto L_0x0084
            r23 = 8
            goto L_0x0086
        L_0x0084:
            r23 = 16
        L_0x0086:
            int r8 = r4.f7235b
            int r8 = r8 + r23
            r4.mo6131A(r8)
            int r8 = r4.mo6134b()
            int r10 = r4.f7235b
            r25 = 4
            int r10 = r10 + 4
            r4.mo6131A(r10)
            int r10 = r4.f7235b
            if (r21 != 0) goto L_0x00a0
            r7 = 4
            goto L_0x00a2
        L_0x00a0:
            r7 = 8
        L_0x00a2:
            r14 = 0
        L_0x00a3:
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 >= r7) goto L_0x00c7
            byte[] r15 = r4.f7234a
            int r24 = r10 + r14
            byte r15 = r15[r24]
            if (r15 == r5) goto L_0x00c4
            if (r21 != 0) goto L_0x00b9
            long r14 = r4.mo6146n()
            goto L_0x00bd
        L_0x00b9:
            long r14 = r4.mo6147o()
        L_0x00bd:
            r29 = 0
            int r7 = (r14 > r29 ? 1 : (r14 == r29 ? 0 : -1))
            if (r7 != 0) goto L_0x00cf
            goto L_0x00cd
        L_0x00c4:
            int r14 = r14 + 1
            goto L_0x00a3
        L_0x00c7:
            int r10 = r4.f7235b
            int r10 = r10 + r7
            r4.mo6131A(r10)
        L_0x00cd:
            r14 = r27
        L_0x00cf:
            int r7 = r4.f7235b
            int r7 = r7 + 16
            r4.mo6131A(r7)
            int r7 = r4.mo6134b()
            int r10 = r4.mo6134b()
            int r5 = r4.f7235b
            int r5 = r5 + 4
            r4.mo6131A(r5)
            int r5 = r4.mo6134b()
            int r4 = r4.mo6134b()
            r0 = 65536(0x10000, float:9.18355E-41)
            r24 = r6
            r6 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x0105
            if (r10 != r0) goto L_0x0104
            if (r5 != r6) goto L_0x0100
            if (r4 != 0) goto L_0x00fe
            r0 = 90
            goto L_0x0125
        L_0x00fe:
            r5 = -65536(0xffffffffffff0000, float:NaN)
        L_0x0100:
            r7 = 0
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0105
        L_0x0104:
            r7 = 0
        L_0x0105:
            if (r7 != 0) goto L_0x0118
            if (r10 != r6) goto L_0x0115
            if (r5 != r0) goto L_0x0110
            if (r4 != 0) goto L_0x0111
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0125
        L_0x0110:
            r0 = r5
        L_0x0111:
            r7 = 0
            r10 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0119
        L_0x0115:
            r0 = r5
            r7 = 0
            goto L_0x0119
        L_0x0118:
            r0 = r5
        L_0x0119:
            if (r7 != r6) goto L_0x0124
            if (r10 != 0) goto L_0x0124
            if (r0 != 0) goto L_0x0124
            if (r4 != r6) goto L_0x0124
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0125
        L_0x0124:
            r0 = 0
        L_0x0125:
            int r4 = (r55 > r27 ? 1 : (r55 == r27 ? 0 : -1))
            if (r4 != 0) goto L_0x012c
            r32 = r14
            goto L_0x012e
        L_0x012c:
            r32 = r55
        L_0x012e:
            androidx.media3.common.b.ac r2 = r2.f10462a
            long r14 = m9912h(r2)
            int r2 = (r32 > r27 ? 1 : (r32 == r27 ? 0 : -1))
            if (r2 != 0) goto L_0x0139
            goto L_0x0144
        L_0x0139:
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r14
            long r4 = androidx.media3.common.p136b.C2612ak.m7000y(r32, r34, r36)
            r27 = r4
        L_0x0144:
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            androidx.media3.extractor.h.a r2 = r3.mo7379a(r7)
            r2.getClass()
            r10 = 1937007212(0x7374626c, float:1.9362132E31)
            androidx.media3.extractor.h.a r2 = r2.mo7379a(r10)
            r2.getClass()
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            androidx.media3.extractor.h.b r3 = r3.mo7380b(r4)
            r3.getClass()
            androidx.media3.common.b.ac r3 = r3.f10462a
            android.util.Pair r6 = m9914j(r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            androidx.media3.extractor.h.b r2 = r2.mo7380b(r3)
            r2.getClass()
            androidx.media3.common.b.ac r5 = r2.f10462a
            java.lang.Object r2 = r6.second
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r3 = 12
            r5.mo6131A(r3)
            int r2 = r5.mo6134b()
            r32 = r13
            androidx.media3.extractor.h.g r13 = new androidx.media3.extractor.h.g
            r13.<init>(r2)
            r1 = 0
        L_0x018a:
            if (r1 >= r2) goto L_0x0784
            r29 = r14
            int r14 = r5.f7235b
            int r15 = r5.mo6134b()
            if (r15 <= 0) goto L_0x0198
            r3 = 1
            goto L_0x0199
        L_0x0198:
            r3 = 0
        L_0x0199:
            java.lang.String r7 = "childAtomSize must be positive"
            androidx.media3.extractor.C3330ae.m9645b(r3, r7)
            int r3 = r5.mo6134b()
            r7 = 1635148593(0x61766331, float:2.840654E20)
            r10 = 1701733238(0x656e6376, float:7.035987E22)
            if (r3 == r7) goto L_0x037a
            r7 = 1635148595(0x61766333, float:2.8406544E20)
            if (r3 == r7) goto L_0x037a
            if (r3 == r10) goto L_0x037a
            r7 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r3 == r7) goto L_0x037a
            r7 = 1836070006(0x6d703476, float:4.646239E27)
            if (r3 == r7) goto L_0x037a
            r7 = 1752589105(0x68766331, float:4.6541277E24)
            if (r3 == r7) goto L_0x037a
            r7 = 1751479857(0x68657631, float:4.3344087E24)
            if (r3 == r7) goto L_0x037a
            r7 = 1932670515(0x73323633, float:1.4119387E31)
            if (r3 == r7) goto L_0x037a
            r7 = 1211250227(0x48323633, float:182488.8)
            if (r3 == r7) goto L_0x037a
            r7 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 == r7) goto L_0x037a
            r7 = 1987063865(0x76703039, float:1.2178997E33)
            if (r3 == r7) goto L_0x037a
            r7 = 1635135537(0x61763031, float:2.8383572E20)
            if (r3 == r7) goto L_0x037a
            r7 = 1685479798(0x64766176, float:1.8179687E22)
            if (r3 == r7) goto L_0x037a
            r7 = 1685479729(0x64766131, float:1.817961E22)
            if (r3 == r7) goto L_0x037a
            r7 = 1685481573(0x64766865, float:1.8181686E22)
            if (r3 == r7) goto L_0x037a
            r7 = 1685481521(0x64766831, float:1.8181627E22)
            if (r3 != r7) goto L_0x01f4
            goto L_0x037a
        L_0x01f4:
            r7 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r3 == r7) goto L_0x0347
            r7 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r3 == r7) goto L_0x0347
            r7 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r3 == r7) goto L_0x0347
            r7 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r3 == r7) goto L_0x0347
            r7 = 1685353315(0x64747363, float:1.803728E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1685353317(0x64747365, float:1.8037282E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1685353320(0x64747368, float:1.8037286E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1685353324(0x6474736c, float:1.803729E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1685353336(0x64747378, float:1.8037304E22)
            if (r3 == r7) goto L_0x0347
            r7 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r3 == r7) goto L_0x0347
            r7 = 1935767394(0x73617762, float:1.7863284E31)
            if (r3 == r7) goto L_0x0347
            r7 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r3 == r7) goto L_0x0347
            r7 = 1936684916(0x736f7774, float:1.89725E31)
            if (r3 == r7) goto L_0x0347
            r7 = 1953984371(0x74776f73, float:7.841539E31)
            if (r3 == r7) goto L_0x0347
            r7 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r3 == r7) goto L_0x0347
            r7 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r3 == r7) goto L_0x0347
            r7 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r3 == r7) goto L_0x0347
            r7 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r3 == r7) goto L_0x0347
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r3 == r7) goto L_0x0347
            r7 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r3 == r7) goto L_0x0347
            r7 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r3 == r7) goto L_0x0347
            r7 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r3 == r7) goto L_0x0347
            r7 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r3 != r7) goto L_0x0273
            goto L_0x0347
        L_0x0273:
            r7 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r3 == r7) goto L_0x02cd
            r7 = 1954034535(0x74783367, float:7.865797E31)
            if (r3 == r7) goto L_0x02cd
            r7 = 2004251764(0x77767474, float:4.998699E33)
            if (r3 == r7) goto L_0x02cd
            r7 = 1937010800(0x73747070, float:1.9366469E31)
            if (r3 == r7) goto L_0x02cd
            r7 = 1664495672(0x63363038, float:3.360782E21)
            if (r3 != r7) goto L_0x028d
            goto L_0x02cd
        L_0x028d:
            r7 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r3 != r7) goto L_0x0296
            m9920p(r5, r14, r8, r13)
            goto L_0x02b1
        L_0x0296:
            r7 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r3 != r7) goto L_0x02b1
            androidx.media3.common.w r3 = new androidx.media3.common.w
            r3.<init>()
            java.lang.String r7 = java.lang.Integer.toString(r8)
            r3.f7449a = r7
            java.lang.String r7 = "application/x-camera-motion"
            r3.f7459k = r7
            androidx.media3.common.x r7 = new androidx.media3.common.x
            r7.<init>(r3)
            r13.f10478b = r7
        L_0x02b1:
            r20 = r1
            r33 = r2
            r16 = r4
            r40 = r6
            r17 = r8
            r18 = r9
            r42 = r11
            r1 = r13
            r34 = r14
            r36 = r15
            r7 = r24
            r4 = 1
            r6 = -1
            r2 = r0
            r0 = r5
            r5 = 2
            goto L_0x075d
        L_0x02cd:
            int r7 = r14 + 16
            r5.mo6131A(r7)
            r7 = 1414810956(0x54544d4c, float:3.64731957E12)
            r33 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != r7) goto L_0x02e2
            java.lang.String r3 = "application/ttml+xml"
        L_0x02de:
            r38 = r33
            r10 = 0
            goto L_0x0313
        L_0x02e2:
            r7 = 1954034535(0x74783367, float:7.865797E31)
            if (r3 != r7) goto L_0x02fa
            int r3 = r15 + -16
            byte[] r7 = new byte[r3]
            r10 = 0
            r5.mo6155w(r7, r10, r3)
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r10 = r3
            r3 = r7
            r38 = r33
            goto L_0x0313
        L_0x02fa:
            r7 = 2004251764(0x77767474, float:4.998699E33)
            if (r3 != r7) goto L_0x0302
            java.lang.String r3 = "application/x-mp4-vtt"
            goto L_0x02de
        L_0x0302:
            r7 = 1937010800(0x73747070, float:1.9366469E31)
            if (r3 != r7) goto L_0x030d
            java.lang.String r3 = "application/ttml+xml"
            r10 = 0
            r38 = 0
            goto L_0x0313
        L_0x030d:
            r7 = 1
            r13.f10480d = r7
            java.lang.String r3 = "application/x-mp4-cea-608"
            goto L_0x02de
        L_0x0313:
            androidx.media3.common.w r7 = new androidx.media3.common.w
            r7.<init>()
            r33 = r2
            java.lang.String r2 = java.lang.Integer.toString(r8)
            r7.f7449a = r2
            r7.f7459k = r3
            r7.f7451c = r4
            r2 = r38
            r7.f7463o = r2
            r7.f7461m = r10
            androidx.media3.common.x r2 = new androidx.media3.common.x
            r2.<init>(r7)
            r13.f10478b = r2
            r2 = r0
            r20 = r1
            r16 = r4
            r0 = r5
            r40 = r6
            r17 = r8
            r18 = r9
            r42 = r11
            r1 = r13
            r34 = r14
            r36 = r15
            r7 = r24
            goto L_0x0376
        L_0x0347:
            r33 = r2
            r2 = r5
            r7 = 12
            r16 = r4
            r10 = 2
            r4 = r14
            r19 = r0
            r0 = r5
            r7 = -1
            r5 = r15
            r40 = r6
            r41 = r24
            r6 = r8
            r7 = r16
            r17 = r8
            r8 = r58
            r18 = r9
            r9 = r57
            r10 = r13
            r42 = r11
            r11 = r1
            m9918n(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r20 = r1
            r1 = r13
            r34 = r14
            r36 = r15
            r2 = r19
            r7 = r41
        L_0x0376:
            r4 = 1
            r5 = 2
            goto L_0x06ed
        L_0x037a:
            r19 = r0
            r33 = r2
            r16 = r4
            r0 = r5
            r40 = r6
            r17 = r8
            r18 = r9
            r42 = r11
            r41 = r24
            int r2 = r14 + 16
            r0.mo6131A(r2)
            int r2 = r0.f7235b
            int r2 = r2 + 16
            r0.mo6131A(r2)
            int r2 = r0.mo6142j()
            int r4 = r0.mo6142j()
            int r5 = r0.f7235b
            int r5 = r5 + 50
            r0.mo6131A(r5)
            int r5 = r0.f7235b
            if (r3 != r10) goto L_0x03d8
            android.util.Pair r3 = m9915k(r0, r14, r15)
            if (r3 == 0) goto L_0x03d0
            java.lang.Object r6 = r3.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r12 != 0) goto L_0x03bc
            r8 = 0
            goto L_0x03c6
        L_0x03bc:
            java.lang.Object r7 = r3.second
            androidx.media3.extractor.h.y r7 = (androidx.media3.extractor.p161h.C3438y) r7
            java.lang.String r7 = r7.f10588b
            androidx.media3.common.DrmInitData r8 = r12.mo6048a(r7)
        L_0x03c6:
            androidx.media3.extractor.h.y[] r7 = r13.f10477a
            java.lang.Object r3 = r3.second
            androidx.media3.extractor.h.y r3 = (androidx.media3.extractor.p161h.C3438y) r3
            r7[r1] = r3
            r3 = r6
            goto L_0x03d4
        L_0x03d0:
            r8 = r12
            r3 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x03d4:
            r0.mo6131A(r5)
            goto L_0x03d9
        L_0x03d8:
            r8 = r12
        L_0x03d9:
            r6 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r3 != r6) goto L_0x03e3
            java.lang.String r6 = "video/mpeg"
            r10 = r3
            r3 = r6
            goto L_0x03f0
        L_0x03e3:
            r6 = 1211250227(0x48323633, float:182488.8)
            if (r3 != r6) goto L_0x03ee
            java.lang.String r3 = "video/3gpp"
            r10 = 1211250227(0x48323633, float:182488.8)
            goto L_0x03f0
        L_0x03ee:
            r10 = r3
            r3 = 0
        L_0x03f0:
            r6 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            r6 = r5
            r1 = 0
            r5 = -1
            r9 = 0
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r21 = -1
            r23 = -1
            r24 = 0
            r25 = 0
            r26 = -1
            r43 = 0
        L_0x0407:
            int r7 = r6 - r14
            if (r7 >= r15) goto L_0x06d1
            r0.mo6131A(r6)
            int r7 = r0.f7235b
            int r34 = r0.mo6134b()
            r35 = r8
            if (r34 != 0) goto L_0x0427
            int r8 = r0.f7235b
            int r8 = r8 - r14
            if (r8 != r15) goto L_0x0425
            r39 = r1
            r51 = r4
            r44 = r5
            goto L_0x06d9
        L_0x0425:
            r8 = 0
            goto L_0x0429
        L_0x0427:
            r8 = r34
        L_0x0429:
            if (r8 <= 0) goto L_0x0431
            r34 = r14
            r36 = r15
            r14 = 1
            goto L_0x0436
        L_0x0431:
            r34 = r14
            r36 = r15
            r14 = 0
        L_0x0436:
            java.lang.String r15 = "childAtomSize must be positive"
            androidx.media3.extractor.C3330ae.m9645b(r14, r15)
            int r14 = r0.mo6134b()
            r15 = 1635148611(0x61766343, float:2.8406573E20)
            if (r14 != r15) goto L_0x0475
            if (r3 != 0) goto L_0x0448
            r1 = 1
            goto L_0x0449
        L_0x0448:
            r1 = 0
        L_0x0449:
            r15 = 0
            androidx.media3.extractor.C3330ae.m9645b(r1, r15)
            int r7 = r7 + 8
            r0.mo6131A(r7)
            androidx.media3.extractor.f r1 = androidx.media3.extractor.C3395f.m9815a(r0)
            java.util.List r3 = r1.f10281a
            int r7 = r1.f10282b
            r13.f10479c = r7
            if (r25 != 0) goto L_0x0460
            float r12 = r1.f10285e
        L_0x0460:
            java.lang.String r1 = r1.f10286f
            java.lang.String r7 = "video/avc"
        L_0x0464:
            r11 = r1
            r1 = r3
            r51 = r4
            r44 = r5
            r3 = r7
        L_0x046b:
            r37 = r10
            r38 = r13
            r7 = r41
            r4 = 1
        L_0x0472:
            r5 = 2
            goto L_0x06be
        L_0x0475:
            r15 = 1752589123(0x68766343, float:4.6541328E24)
            if (r14 != r15) goto L_0x049b
            if (r3 != 0) goto L_0x047e
            r1 = 1
            goto L_0x047f
        L_0x047e:
            r1 = 0
        L_0x047f:
            r3 = 0
            androidx.media3.extractor.C3330ae.m9645b(r1, r3)
            int r7 = r7 + 8
            r0.mo6131A(r7)
            androidx.media3.extractor.ao r1 = androidx.media3.extractor.C3340ao.m9682a(r0)
            java.util.List r3 = r1.f10075a
            int r7 = r1.f10076b
            r13.f10479c = r7
            if (r25 != 0) goto L_0x0496
            float r12 = r1.f10077c
        L_0x0496:
            java.lang.String r1 = r1.f10078d
            java.lang.String r7 = "video/hevc"
            goto L_0x0464
        L_0x049b:
            r15 = 1685480259(0x64766343, float:1.8180206E22)
            if (r14 == r15) goto L_0x069c
            r15 = 1685485123(0x64767643, float:1.8185683E22)
            if (r14 != r15) goto L_0x04a7
            goto L_0x069c
        L_0x04a7:
            r15 = 1987076931(0x76706343, float:1.21891066E33)
            if (r14 != r15) goto L_0x04c0
            if (r3 != 0) goto L_0x04b0
            r3 = 1
            goto L_0x04b1
        L_0x04b0:
            r3 = 0
        L_0x04b1:
            r7 = 0
            androidx.media3.extractor.C3330ae.m9645b(r3, r7)
            r3 = 1987063864(0x76703038, float:1.21789965E33)
            if (r10 != r3) goto L_0x04bd
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x04d0
        L_0x04bd:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x04d0
        L_0x04c0:
            r15 = 1635135811(0x61763143, float:2.8384055E20)
            if (r14 != r15) goto L_0x04d5
            if (r3 != 0) goto L_0x04c9
            r3 = 1
            goto L_0x04ca
        L_0x04c9:
            r3 = 0
        L_0x04ca:
            r7 = 0
            androidx.media3.extractor.C3330ae.m9645b(r3, r7)
            java.lang.String r3 = "video/av01"
        L_0x04d0:
            r51 = r4
            r44 = r5
            goto L_0x046b
        L_0x04d5:
            r15 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r14 != r15) goto L_0x04fd
            if (r24 != 0) goto L_0x04e0
            java.nio.ByteBuffer r24 = m9917m()
        L_0x04e0:
            r7 = r24
            r14 = 21
            r7.position(r14)
            short r14 = r0.mo6152t()
            r7.putShort(r14)
            short r14 = r0.mo6152t()
            r7.putShort(r14)
            r51 = r4
            r44 = r5
            r24 = r7
            goto L_0x046b
        L_0x04fd:
            r15 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r14 != r15) goto L_0x057a
            if (r24 != 0) goto L_0x0508
            java.nio.ByteBuffer r24 = m9917m()
        L_0x0508:
            r7 = r24
            short r14 = r0.mo6152t()
            short r15 = r0.mo6152t()
            r37 = r10
            short r10 = r0.mo6152t()
            r38 = r13
            short r13 = r0.mo6152t()
            r39 = r1
            short r1 = r0.mo6152t()
            r44 = r5
            short r5 = r0.mo6152t()
            r45 = r9
            short r9 = r0.mo6152t()
            r46 = r12
            short r12 = r0.mo6152t()
            long r47 = r0.mo6146n()
            long r49 = r0.mo6146n()
            r51 = r4
            r4 = 1
            r7.position(r4)
            r7.putShort(r1)
            r7.putShort(r5)
            r7.putShort(r14)
            r7.putShort(r15)
            r7.putShort(r10)
            r7.putShort(r13)
            r7.putShort(r9)
            r7.putShort(r12)
            r9 = 10000(0x2710, double:4.9407E-320)
            long r9 = r47 / r9
            int r1 = (int) r9
            short r1 = (short) r1
            r7.putShort(r1)
            r9 = 10000(0x2710, double:4.9407E-320)
            long r9 = r49 / r9
            int r1 = (int) r9
            short r1 = (short) r1
            r7.putShort(r1)
            r24 = r7
        L_0x0570:
            r1 = r39
            r7 = r41
            r9 = r45
        L_0x0576:
            r12 = r46
            goto L_0x0472
        L_0x057a:
            r39 = r1
            r51 = r4
            r44 = r5
            r45 = r9
            r37 = r10
            r46 = r12
            r38 = r13
            r4 = 1
            r1 = 1681012275(0x64323633, float:1.3149704E22)
            if (r14 != r1) goto L_0x059b
            if (r3 != 0) goto L_0x0592
            r1 = 1
            goto L_0x0593
        L_0x0592:
            r1 = 0
        L_0x0593:
            r5 = 0
            androidx.media3.extractor.C3330ae.m9645b(r1, r5)
            java.lang.String r1 = "video/3gpp"
            r3 = r1
            goto L_0x0570
        L_0x059b:
            r5 = 0
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r14 != r1) goto L_0x05bc
            if (r3 != 0) goto L_0x05a5
            r1 = 1
            goto L_0x05a6
        L_0x05a5:
            r1 = 0
        L_0x05a6:
            androidx.media3.extractor.C3330ae.m9645b(r1, r5)
            androidx.media3.extractor.h.e r1 = m9916l(r0, r7)
            java.lang.String r3 = r1.f10473a
            byte[] r5 = r1.f10474b
            if (r5 == 0) goto L_0x05b9
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89846n(r5)
            r39 = r5
        L_0x05b9:
            r43 = r1
            goto L_0x0570
        L_0x05bc:
            r1 = 1885434736(0x70617370, float:2.7909473E29)
            if (r14 != r1) goto L_0x05dd
            int r7 = r7 + 8
            r0.mo6131A(r7)
            int r1 = r0.mo6141i()
            float r1 = (float) r1
            int r5 = r0.mo6141i()
            float r5 = (float) r5
            float r1 = r1 / r5
            r12 = r1
            r1 = r39
            r7 = r41
            r9 = r45
            r5 = 2
            r25 = 1
            goto L_0x06be
        L_0x05dd:
            r1 = 1937126244(0x73763364, float:1.9506033E31)
            if (r14 != r1) goto L_0x060a
            int r1 = r7 + 8
        L_0x05e4:
            int r5 = r1 - r7
            if (r5 >= r8) goto L_0x0602
            r0.mo6131A(r1)
            int r5 = r0.mo6134b()
            int r9 = r0.mo6134b()
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r9 != r10) goto L_0x0600
            byte[] r7 = r0.f7234a
            int r5 = r5 + r1
            byte[] r1 = java.util.Arrays.copyOfRange(r7, r1, r5)
            goto L_0x0603
        L_0x0600:
            int r1 = r1 + r5
            goto L_0x05e4
        L_0x0602:
            r1 = 0
        L_0x0603:
            r9 = r1
            r1 = r39
            r7 = r41
            goto L_0x0576
        L_0x060a:
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r14 != r1) goto L_0x063d
            int r1 = r0.mo6139g()
            int r5 = r0.f7235b
            r7 = 3
            int r5 = r5 + r7
            r0.mo6131A(r5)
            if (r1 != 0) goto L_0x0636
            int r1 = r0.mo6139g()
            r5 = 2
            if (r1 == 0) goto L_0x0633
            if (r1 == r4) goto L_0x0630
            if (r1 == r5) goto L_0x062d
            if (r1 == r7) goto L_0x062a
            goto L_0x0637
        L_0x062a:
            r44 = 3
            goto L_0x0637
        L_0x062d:
            r44 = 2
            goto L_0x0637
        L_0x0630:
            r44 = 1
            goto L_0x0637
        L_0x0633:
            r44 = 0
            goto L_0x0637
        L_0x0636:
            r5 = 2
        L_0x0637:
            r1 = r39
            r7 = r41
            goto L_0x06ba
        L_0x063d:
            r5 = 2
            r1 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r14 != r1) goto L_0x0699
            int r1 = r0.mo6134b()
            r7 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r7) goto L_0x0662
            r7 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r7) goto L_0x0652
            goto L_0x0662
        L_0x0652:
            java.lang.String r7 = "Unsupported color type: "
            java.lang.String r1 = androidx.media3.extractor.p161h.C3416c.m9894f(r1)
            java.lang.String r1 = r7.concat(r1)
            r7 = r41
            androidx.media3.common.p136b.C2633u.m7050e(r7, r1)
            goto L_0x06b8
        L_0x0662:
            r7 = r41
            int r1 = r0.mo6142j()
            int r9 = r0.mo6142j()
            int r10 = r0.f7235b
            int r10 = r10 + r5
            r0.mo6131A(r10)
            r10 = 19
            if (r8 != r10) goto L_0x0684
            int r8 = r0.mo6139g()
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0682
            r8 = 19
            r10 = 1
            goto L_0x0685
        L_0x0682:
            r8 = 19
        L_0x0684:
            r10 = 0
        L_0x0685:
            int r1 = androidx.media3.common.C2670n.m7234a(r1)
            if (r4 == r10) goto L_0x068d
            r10 = 2
            goto L_0x068e
        L_0x068d:
            r10 = 1
        L_0x068e:
            int r9 = androidx.media3.common.C2670n.m7235b(r9)
            r26 = r1
            r21 = r9
            r23 = r10
            goto L_0x06b8
        L_0x0699:
            r7 = r41
            goto L_0x06b8
        L_0x069c:
            r39 = r1
            r51 = r4
            r44 = r5
            r45 = r9
            r37 = r10
            r46 = r12
            r38 = r13
            r7 = r41
            r4 = 1
            r5 = 2
            androidx.media3.extractor.w r1 = androidx.media3.extractor.C3633w.m10477a(r0)
            if (r1 == 0) goto L_0x06b8
            java.lang.String r11 = r1.f11579a
            java.lang.String r3 = "video/dolby-vision"
        L_0x06b8:
            r1 = r39
        L_0x06ba:
            r9 = r45
            r12 = r46
        L_0x06be:
            int r6 = r6 + r8
            r41 = r7
            r14 = r34
            r8 = r35
            r15 = r36
            r10 = r37
            r13 = r38
            r5 = r44
            r4 = r51
            goto L_0x0407
        L_0x06d1:
            r39 = r1
            r51 = r4
            r44 = r5
            r35 = r8
        L_0x06d9:
            r45 = r9
            r46 = r12
            r38 = r13
            r34 = r14
            r36 = r15
            r7 = r41
            r4 = 1
            r5 = 2
            if (r3 != 0) goto L_0x06f0
            r2 = r19
            r1 = r38
        L_0x06ed:
            r6 = -1
            goto L_0x075d
        L_0x06f0:
            androidx.media3.common.w r1 = new androidx.media3.common.w
            r1.<init>()
            java.lang.String r6 = java.lang.Integer.toString(r17)
            r1.f7449a = r6
            r1.f7459k = r3
            r1.f7456h = r11
            r1.f7464p = r2
            r2 = r51
            r1.f7465q = r2
            r12 = r46
            r1.f7468t = r12
            r2 = r19
            r1.f7467s = r2
            r9 = r45
            r1.f7469u = r9
            r3 = r44
            r1.f7470v = r3
            r3 = r39
            r1.f7461m = r3
            r12 = r35
            r1.f7462n = r12
            r3 = r26
            r6 = -1
            if (r3 != r6) goto L_0x072d
            r8 = r23
            r9 = r21
            if (r8 != r6) goto L_0x0731
            if (r9 != r6) goto L_0x0731
            if (r24 == 0) goto L_0x0740
            goto L_0x0731
        L_0x072d:
            r9 = r21
            r8 = r23
        L_0x0731:
            androidx.media3.common.n r10 = new androidx.media3.common.n
            if (r24 == 0) goto L_0x073a
            byte[] r11 = r24.array()
            goto L_0x073b
        L_0x073a:
            r11 = 0
        L_0x073b:
            r10.<init>(r3, r8, r9, r11)
            r1.f7471w = r10
        L_0x0740:
            r3 = r43
            if (r3 == 0) goto L_0x0754
            long r8 = r3.f10475c
            int r8 = com.google.common.p4575r.C60757n.m92748i(r8)
            r1.f7454f = r8
            long r8 = r3.f10476d
            int r3 = com.google.common.p4575r.C60757n.m92748i(r8)
            r1.f7455g = r3
        L_0x0754:
            androidx.media3.common.x r3 = new androidx.media3.common.x
            r3.<init>(r1)
            r1 = r38
            r1.f10478b = r3
        L_0x075d:
            int r14 = r34 + r36
            r0.mo6131A(r14)
            int r3 = r20 + 1
            r12 = r57
            r5 = r0
            r13 = r1
            r0 = r2
            r1 = r3
            r24 = r7
            r4 = r16
            r8 = r17
            r9 = r18
            r14 = r29
            r2 = r33
            r6 = r40
            r11 = r42
            r3 = 12
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            r10 = 1937007212(0x7374626c, float:1.9362132E31)
            goto L_0x018a
        L_0x0784:
            r40 = r6
            r17 = r8
            r18 = r9
            r42 = r11
            r1 = r13
            r29 = r14
            r7 = r24
            r4 = 1
            r5 = 2
            r6 = -1
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r42
            androidx.media3.extractor.h.a r0 = r2.mo7379a(r0)
            if (r0 == 0) goto L_0x07ae
            android.util.Pair r0 = m9913i(r0)
            if (r0 == 0) goto L_0x07ae
            java.lang.Object r3 = r0.first
            long[] r3 = (long[]) r3
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            goto L_0x07b0
        L_0x07ae:
            r0 = 0
            r3 = 0
        L_0x07b0:
            androidx.media3.common.x r8 = r1.f10478b
            if (r8 != 0) goto L_0x07b8
            r0 = r59
            goto L_0x0061
        L_0x07b8:
            androidx.media3.extractor.h.x r8 = new androidx.media3.extractor.h.x
            r9 = r40
            java.lang.Object r9 = r9.first
            java.lang.Long r9 = (java.lang.Long) r9
            long r19 = r9.longValue()
            androidx.media3.common.x r9 = r1.f10478b
            int r10 = r1.f10480d
            androidx.media3.extractor.h.y[] r11 = r1.f10477a
            int r1 = r1.f10479c
            r16 = r8
            r21 = r29
            r23 = r27
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r1
            r29 = r3
            r30 = r0
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r59
        L_0x07e3:
            java.lang.Object r1 = r0.apply(r8)
            r9 = r1
            androidx.media3.extractor.h.x r9 = (androidx.media3.extractor.p161h.C3437x) r9
            if (r9 == 0) goto L_0x0d95
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            androidx.media3.extractor.h.a r1 = r2.mo7379a(r1)
            r1.getClass()
            r2 = 1835626086(0x6d696e66, float:4.515217E27)
            androidx.media3.extractor.h.a r1 = r1.mo7379a(r2)
            r1.getClass()
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            androidx.media3.extractor.h.a r1 = r1.mo7379a(r2)
            r1.getClass()
            r2 = 1937011578(0x7374737a, float:1.936741E31)
            androidx.media3.extractor.h.b r2 = r1.mo7380b(r2)
            if (r2 == 0) goto L_0x081b
            androidx.media3.extractor.h.h r3 = new androidx.media3.extractor.h.h
            androidx.media3.common.x r8 = r9.f10581f
            r3.<init>(r2, r8)
            goto L_0x0829
        L_0x081b:
            r2 = 1937013298(0x73747a32, float:1.9369489E31)
            androidx.media3.extractor.h.b r2 = r1.mo7380b(r2)
            if (r2 == 0) goto L_0x0d8d
            androidx.media3.extractor.h.i r3 = new androidx.media3.extractor.h.i
            r3.<init>(r2)
        L_0x0829:
            int r2 = r3.mo7388b()
            if (r2 != 0) goto L_0x0845
            androidx.media3.extractor.h.aa r1 = new androidx.media3.extractor.h.aa
            r2 = 0
            long[] r10 = new long[r2]
            int[] r11 = new int[r2]
            r12 = 0
            long[] r13 = new long[r2]
            int[] r14 = new int[r2]
            r15 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x0841:
            r0 = r32
            goto L_0x0d89
        L_0x0845:
            r8 = 1937007471(0x7374636f, float:1.9362445E31)
            androidx.media3.extractor.h.b r8 = r1.mo7380b(r8)
            if (r8 != 0) goto L_0x085a
            r8 = 1668232756(0x636f3634, float:4.4126776E21)
            androidx.media3.extractor.h.b r8 = r1.mo7380b(r8)
            r8.getClass()
            r10 = 1
            goto L_0x085b
        L_0x085a:
            r10 = 0
        L_0x085b:
            androidx.media3.common.b.ac r8 = r8.f10462a
            r11 = 1937011555(0x73747363, float:1.9367382E31)
            androidx.media3.extractor.h.b r11 = r1.mo7380b(r11)
            r11.getClass()
            androidx.media3.common.b.ac r11 = r11.f10462a
            r12 = 1937011827(0x73747473, float:1.9367711E31)
            androidx.media3.extractor.h.b r12 = r1.mo7380b(r12)
            r12.getClass()
            androidx.media3.common.b.ac r12 = r12.f10462a
            r13 = 1937011571(0x73747373, float:1.9367401E31)
            androidx.media3.extractor.h.b r13 = r1.mo7380b(r13)
            if (r13 == 0) goto L_0x0881
            androidx.media3.common.b.ac r13 = r13.f10462a
            goto L_0x0882
        L_0x0881:
            r13 = 0
        L_0x0882:
            r14 = 1668576371(0x63747473, float:4.5093966E21)
            androidx.media3.extractor.h.b r1 = r1.mo7380b(r14)
            if (r1 == 0) goto L_0x088e
            androidx.media3.common.b.ac r1 = r1.f10462a
            goto L_0x088f
        L_0x088e:
            r1 = 0
        L_0x088f:
            androidx.media3.extractor.h.d r14 = new androidx.media3.extractor.h.d
            r14.<init>(r11, r8, r10)
            r8 = 12
            r12.mo6131A(r8)
            int r10 = r12.mo6141i()
            int r10 = r10 + r6
            int r11 = r12.mo6141i()
            int r15 = r12.mo6141i()
            if (r1 == 0) goto L_0x08b0
            r1.mo6131A(r8)
            int r16 = r1.mo6141i()
            goto L_0x08b2
        L_0x08b0:
            r16 = 0
        L_0x08b2:
            if (r13 == 0) goto L_0x08cc
            r13.mo6131A(r8)
            int r8 = r13.mo6141i()
            if (r8 <= 0) goto L_0x08c9
            int r17 = r13.mo6141i()
            int r17 = r17 + -1
            r52 = r13
            r13 = r8
            r8 = r52
            goto L_0x08d0
        L_0x08c9:
            r13 = r8
            r8 = 0
            goto L_0x08ce
        L_0x08cc:
            r8 = r13
            r13 = 0
        L_0x08ce:
            r17 = -1
        L_0x08d0:
            int r5 = r3.mo7387a()
            androidx.media3.common.x r4 = r9.f10581f
            java.lang.String r4 = r4.f7496n
            if (r5 == r6) goto L_0x0980
            java.lang.String r6 = "audio/raw"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x08f2
            java.lang.String r6 = "audio/g711-mlaw"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x08f2
            java.lang.String r6 = "audio/g711-alaw"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0980
        L_0x08f2:
            if (r10 != 0) goto L_0x0980
            if (r16 != 0) goto L_0x097f
            if (r13 != 0) goto L_0x097f
            int r1 = r14.f10464a
            long[] r3 = new long[r1]
            int[] r4 = new int[r1]
        L_0x08fe:
            boolean r6 = r14.mo7386a()
            if (r6 == 0) goto L_0x090f
            int r6 = r14.f10465b
            long r7 = r14.f10467d
            r3[r6] = r7
            int r7 = r14.f10466c
            r4[r6] = r7
            goto L_0x08fe
        L_0x090f:
            long r6 = (long) r15
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r5
            r10 = 0
            r11 = 0
        L_0x0915:
            if (r10 >= r1) goto L_0x0921
            r12 = r4[r10]
            int r12 = androidx.media3.common.p136b.C2612ak.m6979d(r12, r8)
            int r11 = r11 + r12
            int r10 = r10 + 1
            goto L_0x0915
        L_0x0921:
            long[] r10 = new long[r11]
            int[] r12 = new int[r11]
            long[] r13 = new long[r11]
            int[] r11 = new int[r11]
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x092f:
            if (r14 >= r1) goto L_0x0976
            r18 = r4[r14]
            r20 = r3[r14]
            r0 = r16
            r52 = r18
            r18 = r1
            r1 = r52
        L_0x093d:
            if (r1 <= 0) goto L_0x0969
            int r16 = java.lang.Math.min(r8, r1)
            r10[r17] = r20
            r22 = r3
            int r3 = r5 * r16
            r12[r17] = r3
            int r0 = java.lang.Math.max(r0, r3)
            r23 = r4
            long r3 = (long) r15
            long r3 = r3 * r6
            r13[r17] = r3
            r3 = 1
            r11[r17] = r3
            r3 = r12[r17]
            long r3 = (long) r3
            long r20 = r20 + r3
            int r15 = r15 + r16
            int r1 = r1 - r16
            int r17 = r17 + 1
            r3 = r22
            r4 = r23
            goto L_0x093d
        L_0x0969:
            r22 = r3
            r23 = r4
            int r14 = r14 + 1
            r16 = r0
            r1 = r18
            r0 = r59
            goto L_0x092f
        L_0x0976:
            long r0 = (long) r15
            long r6 = r6 * r0
            r15 = r9
            r0 = r10
            r14 = r11
            r10 = r6
            goto L_0x0b38
        L_0x097f:
            r10 = 0
        L_0x0980:
            long[] r0 = new long[r2]
            int[] r4 = new int[r2]
            long[] r5 = new long[r2]
            int[] r6 = new int[r2]
            r24 = r9
            r22 = r10
            r23 = r11
            r20 = r13
            r10 = r17
            r9 = 0
            r11 = 0
            r13 = 0
            r17 = 0
            r18 = 0
            r25 = 0
            r27 = 0
        L_0x099d:
            if (r11 >= r2) goto L_0x0a66
            r29 = r17
            r17 = 1
        L_0x09a3:
            if (r29 != 0) goto L_0x09c8
            boolean r17 = r14.mo7386a()
            if (r17 == 0) goto L_0x09c0
            r30 = r12
            r33 = r13
            long r12 = r14.f10467d
            r34 = r2
            int r2 = r14.f10466c
            r29 = r2
            r25 = r12
            r12 = r30
            r13 = r33
            r2 = r34
            goto L_0x09a3
        L_0x09c0:
            r34 = r2
            r30 = r12
            r33 = r13
            r2 = 0
            goto L_0x09d0
        L_0x09c8:
            r34 = r2
            r30 = r12
            r33 = r13
            r2 = r29
        L_0x09d0:
            if (r17 != 0) goto L_0x09ed
            java.lang.String r2 = "Unexpected end of chunk data"
            androidx.media3.common.p136b.C2633u.m7050e(r7, r2)
            long[] r0 = java.util.Arrays.copyOf(r0, r11)
            int[] r4 = java.util.Arrays.copyOf(r4, r11)
            long[] r5 = java.util.Arrays.copyOf(r5, r11)
            int[] r6 = java.util.Arrays.copyOf(r6, r11)
            r12 = r1
            r2 = r11
            r13 = r33
            goto L_0x0a6d
        L_0x09ed:
            if (r1 == 0) goto L_0x0a08
            r13 = r33
        L_0x09f1:
            if (r18 != 0) goto L_0x0a04
            if (r16 <= 0) goto L_0x0a00
            int r18 = r1.mo6141i()
            int r13 = r1.mo6134b()
            int r16 = r16 + -1
            goto L_0x09f1
        L_0x0a00:
            r12 = -1
            r18 = 0
            goto L_0x0a05
        L_0x0a04:
            r12 = -1
        L_0x0a05:
            int r18 = r18 + -1
            goto L_0x0a0a
        L_0x0a08:
            r13 = r33
        L_0x0a0a:
            r0[r11] = r25
            int r12 = r3.mo7389c()
            r4[r11] = r12
            r29 = r0
            if (r12 <= r9) goto L_0x0a17
            r9 = r12
        L_0x0a17:
            r12 = r1
            long r0 = (long) r13
            long r0 = r27 + r0
            r5[r11] = r0
            if (r8 != 0) goto L_0x0a21
            r0 = 1
            goto L_0x0a22
        L_0x0a21:
            r0 = 0
        L_0x0a22:
            r6[r11] = r0
            if (r11 != r10) goto L_0x0a37
            r0 = 1
            r6[r11] = r0
            int r20 = r20 + -1
            if (r20 <= 0) goto L_0x0a37
            r8.getClass()
            int r0 = r8.mo6141i()
            r1 = -1
            int r0 = r0 + r1
            r10 = r0
        L_0x0a37:
            long r0 = (long) r15
            long r27 = r27 + r0
            int r0 = r23 + -1
            if (r0 != 0) goto L_0x0a51
            if (r22 <= 0) goto L_0x0a4e
            int r0 = r30.mo6141i()
            int r1 = r30.mo6134b()
            int r22 = r22 + -1
            r23 = r0
            r15 = r1
            goto L_0x0a53
        L_0x0a4e:
            r23 = 0
            goto L_0x0a53
        L_0x0a51:
            r23 = r0
        L_0x0a53:
            r0 = r4[r11]
            long r0 = (long) r0
            long r25 = r25 + r0
            r0 = -1
            int r17 = r2 + -1
            int r11 = r11 + 1
            r1 = r12
            r0 = r29
            r12 = r30
            r2 = r34
            goto L_0x099d
        L_0x0a66:
            r29 = r0
            r12 = r1
            r34 = r2
            r29 = r17
        L_0x0a6d:
            long r10 = (long) r13
            long r10 = r27 + r10
            if (r12 == 0) goto L_0x0a82
        L_0x0a72:
            if (r16 <= 0) goto L_0x0a82
            int r1 = r12.mo6141i()
            if (r1 == 0) goto L_0x0a7c
            r1 = 0
            goto L_0x0a83
        L_0x0a7c:
            r12.mo6134b()
            int r16 = r16 + -1
            goto L_0x0a72
        L_0x0a82:
            r1 = 1
        L_0x0a83:
            if (r20 != 0) goto L_0x0ad6
            if (r23 != 0) goto L_0x0ac8
            if (r29 != 0) goto L_0x0abb
            if (r22 != 0) goto L_0x0aaf
            if (r18 != 0) goto L_0x0aa4
            if (r1 != 0) goto L_0x0a9a
            r16 = r0
            r15 = r24
            r1 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            goto L_0x0ae4
        L_0x0a9a:
            r16 = r0
            r17 = r2
            r18 = r4
            r15 = r24
            goto L_0x0b2e
        L_0x0aa4:
            r16 = r0
            r14 = r18
            r15 = r24
            r3 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            goto L_0x0ae4
        L_0x0aaf:
            r16 = r0
            r14 = r18
            r13 = r22
            r15 = r24
            r3 = 0
            r8 = 0
            r12 = 0
            goto L_0x0ae4
        L_0x0abb:
            r16 = r0
            r14 = r18
            r13 = r22
            r15 = r24
            r12 = r29
            r3 = 0
            r8 = 0
            goto L_0x0ae4
        L_0x0ac8:
            r16 = r0
            r14 = r18
            r13 = r22
            r8 = r23
            r15 = r24
            r12 = r29
            r3 = 0
            goto L_0x0ae4
        L_0x0ad6:
            r16 = r0
            r14 = r18
            r3 = r20
            r13 = r22
            r8 = r23
            r15 = r24
            r12 = r29
        L_0x0ae4:
            int r0 = r15.f10576a
            r17 = r2
            r2 = 1
            if (r2 == r1) goto L_0x0aee
            java.lang.String r1 = ", ctts invalid"
            goto L_0x0af0
        L_0x0aee:
            java.lang.String r1 = ""
        L_0x0af0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r18 = r4
            java.lang.String r4 = "Inconsistent stbl box for track "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = ": remainingSynchronizationSamples "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r2.append(r0)
            r2.append(r14)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r7, r0)
        L_0x0b2e:
            r13 = r5
            r14 = r6
            r0 = r16
            r2 = r17
            r12 = r18
            r16 = r9
        L_0x0b38:
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r15.f10578c
            r3 = r10
            long r3 = androidx.media3.common.p136b.C2612ak.m7000y(r3, r5, r7)
            long[] r1 = r15.f10583h
            if (r1 != 0) goto L_0x0b59
            long r1 = r15.f10578c
            androidx.media3.common.p136b.C2612ak.m6946aB(r13, r1)
            androidx.media3.extractor.h.aa r1 = new androidx.media3.extractor.h.aa
            r8 = r1
            r9 = r15
            r10 = r0
            r11 = r12
            r12 = r16
            r15 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0841
        L_0x0b59:
            int r3 = r1.length
            r4 = 1
            if (r3 != r4) goto L_0x0bf4
            int r3 = r15.f10577b
            if (r3 != r4) goto L_0x0bf4
            int r3 = r13.length
            r4 = 2
            if (r3 < r4) goto L_0x0bf4
            long[] r3 = r15.f10584i
            r3.getClass()
            long[] r3 = (long[]) r3
            r4 = 0
            r17 = r3[r4]
            r19 = r1[r4]
            long r3 = r15.f10578c
            long r5 = r15.f10579d
            r21 = r3
            r23 = r5
            long r3 = androidx.media3.common.p136b.C2612ak.m7000y(r19, r21, r23)
            long r19 = r17 + r3
            r3 = r13
            r4 = r10
            r6 = r17
            r8 = r19
            boolean r1 = m9919o(r3, r4, r6, r8)
            if (r1 == 0) goto L_0x0bf4
            r1 = 0
            r3 = r13[r1]
            long r21 = r17 - r3
            androidx.media3.common.x r1 = r15.f10581f
            int r1 = r1.f7478B
            long r3 = (long) r1
            long r5 = r15.f10578c
            r23 = r3
            r25 = r5
            long r3 = androidx.media3.common.p136b.C2612ak.m7000y(r21, r23, r25)
            long r21 = r10 - r19
            androidx.media3.common.x r1 = r15.f10581f
            int r1 = r1.f7478B
            long r5 = (long) r1
            long r7 = r15.f10578c
            r23 = r5
            r25 = r7
            long r5 = androidx.media3.common.p136b.C2612ak.m7000y(r21, r23, r25)
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0bbc
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0bf4
            r3 = 0
        L_0x0bbc:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0bf4
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0bf4
            int r1 = (int) r3
            r3 = r54
            r3.f10073a = r1
            int r1 = (int) r5
            r3.f10074b = r1
            long r1 = r15.f10578c
            androidx.media3.common.p136b.C2612ak.m6946aB(r13, r1)
            long[] r1 = r15.f10583h
            r2 = 0
            r4 = r1[r2]
            long r8 = r15.f10579d
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = androidx.media3.common.p136b.C2612ak.m7000y(r4, r6, r8)
            androidx.media3.extractor.h.aa r4 = new androidx.media3.extractor.h.aa
            r8 = r4
            r9 = r15
            r10 = r0
            r11 = r12
            r12 = r16
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x0bf1:
            r1 = r4
            goto L_0x0841
        L_0x0bf4:
            r3 = r54
            long[] r1 = r15.f10583h
            int r7 = r1.length
            r4 = 1
            if (r7 != r4) goto L_0x0c44
            r4 = 0
            r5 = r1[r4]
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0c42
            long[] r1 = r15.f10584i
            r1.getClass()
            long[] r1 = (long[]) r1
            r5 = r1[r4]
            r1 = 0
        L_0x0c0f:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x0c26
            r7 = r13[r1]
            long r17 = r7 - r5
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r15.f10578c
            r21 = r7
            long r7 = androidx.media3.common.p136b.C2612ak.m7000y(r17, r19, r21)
            r13[r1] = r7
            int r1 = r1 + 1
            goto L_0x0c0f
        L_0x0c26:
            long r1 = r15.f10578c
            long r17 = r10 - r5
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r1
            long r1 = androidx.media3.common.p136b.C2612ak.m7000y(r17, r19, r21)
            androidx.media3.extractor.h.aa r5 = new androidx.media3.extractor.h.aa
            r8 = r5
            r9 = r15
            r10 = r0
            r11 = r12
            r12 = r16
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1 = r5
            goto L_0x0841
        L_0x0c42:
            r7 = 1
            goto L_0x0c45
        L_0x0c44:
            r4 = 0
        L_0x0c45:
            int r1 = r15.f10577b
            r5 = 1
            if (r1 != r5) goto L_0x0c4c
            r1 = 1
            goto L_0x0c4d
        L_0x0c4c:
            r1 = 0
        L_0x0c4d:
            int[] r5 = new int[r7]
            int[] r6 = new int[r7]
            long[] r7 = r15.f10584i
            r7.getClass()
            long[] r7 = (long[]) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0c5c:
            long[] r4 = r15.f10583h
            int r3 = r4.length
            if (r10 >= r3) goto L_0x0cbe
            r17 = r2
            r2 = r7[r10]
            r18 = -1
            int r20 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x0cad
            r21 = r4[r10]
            r18 = r11
            r4 = r12
            long r11 = r15.f10578c
            r19 = r7
            r20 = r8
            long r7 = r15.f10579d
            r23 = r11
            r25 = r7
            long r7 = androidx.media3.common.p136b.C2612ak.m7000y(r21, r23, r25)
            r11 = 1
            int r12 = androidx.media3.common.p136b.C2612ak.m6973aw(r13, r2, r11)
            r5[r10] = r12
            long r2 = r2 + r7
            int r2 = androidx.media3.common.p136b.C2612ak.m6972av(r13, r2, r1)
            r6[r10] = r2
        L_0x0c8e:
            r2 = r5[r10]
            r3 = r6[r10]
            if (r2 >= r3) goto L_0x0c9f
            r7 = r14[r2]
            r7 = r7 & r11
            if (r7 != 0) goto L_0x0c9f
            int r2 = r2 + 1
            r5[r10] = r2
            r11 = 1
            goto L_0x0c8e
        L_0x0c9f:
            int r7 = r3 - r2
            int r8 = r20 + r7
            if (r9 == r2) goto L_0x0ca7
            r7 = 1
            goto L_0x0ca8
        L_0x0ca7:
            r7 = 0
        L_0x0ca8:
            r2 = r18 | r7
            r11 = r2
            r9 = r3
            goto L_0x0cb4
        L_0x0cad:
            r19 = r7
            r20 = r8
            r18 = r11
            r4 = r12
        L_0x0cb4:
            int r10 = r10 + 1
            r3 = r54
            r12 = r4
            r2 = r17
            r7 = r19
            goto L_0x0c5c
        L_0x0cbe:
            r18 = r11
            r4 = r12
            if (r8 == r2) goto L_0x0cc5
            r7 = 1
            goto L_0x0cc6
        L_0x0cc5:
            r7 = 0
        L_0x0cc6:
            r1 = r18 | r7
            if (r1 == 0) goto L_0x0cce
            long[] r2 = new long[r8]
            r10 = r2
            goto L_0x0ccf
        L_0x0cce:
            r10 = r0
        L_0x0ccf:
            if (r1 == 0) goto L_0x0cd5
            int[] r2 = new int[r8]
            r11 = r2
            goto L_0x0cd6
        L_0x0cd5:
            r11 = r4
        L_0x0cd6:
            r2 = 1
            if (r2 != r1) goto L_0x0cdb
            r16 = 0
        L_0x0cdb:
            if (r1 == 0) goto L_0x0ce0
            int[] r2 = new int[r8]
            goto L_0x0ce1
        L_0x0ce0:
            r2 = r14
        L_0x0ce1:
            long[] r3 = new long[r8]
            r12 = r16
            r7 = 0
            r8 = 0
            r22 = 0
        L_0x0ce9:
            long[] r9 = r15.f10583h
            int r9 = r9.length
            if (r7 >= r9) goto L_0x0d6e
            long[] r9 = r15.f10584i
            r24 = r9[r7]
            r9 = r5[r7]
            r26 = r5
            r5 = r6[r7]
            if (r1 == 0) goto L_0x0d08
            r27 = r6
            int r6 = r5 - r9
            java.lang.System.arraycopy(r0, r9, r10, r8, r6)
            java.lang.System.arraycopy(r4, r9, r11, r8, r6)
            java.lang.System.arraycopy(r14, r9, r2, r8, r6)
            goto L_0x0d0a
        L_0x0d08:
            r27 = r6
        L_0x0d0a:
            if (r9 >= r5) goto L_0x0d52
            r18 = 1000000(0xf4240, double:4.940656E-318)
            r28 = r5
            long r5 = r15.f10579d
            r16 = r22
            r20 = r5
            long r5 = androidx.media3.common.p136b.C2612ak.m7000y(r16, r18, r20)
            r16 = r13[r9]
            r18 = r13
            r19 = r14
            long r13 = r16 - r24
            r16 = r9
            r29 = r10
            r9 = 0
            long r33 = java.lang.Math.max(r9, r13)
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r15.f10578c
            r37 = r13
            long r13 = androidx.media3.common.p136b.C2612ak.m7000y(r33, r35, r37)
            long r5 = r5 + r13
            r3[r8] = r5
            if (r1 == 0) goto L_0x0d44
            r5 = r11[r8]
            if (r5 <= r12) goto L_0x0d44
            r5 = r4[r16]
            r12 = r5
        L_0x0d44:
            int r8 = r8 + 1
            int r5 = r16 + 1
            r9 = r5
            r13 = r18
            r14 = r19
            r5 = r28
            r10 = r29
            goto L_0x0d0a
        L_0x0d52:
            r29 = r10
            r18 = r13
            r19 = r14
            r9 = 0
            long[] r5 = r15.f10583h
            r13 = r5[r7]
            long r22 = r22 + r13
            int r7 = r7 + 1
            r13 = r18
            r14 = r19
            r5 = r26
            r6 = r27
            r10 = r29
            goto L_0x0ce9
        L_0x0d6e:
            r29 = r10
            long r0 = r15.f10579d
            r18 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r22
            r20 = r0
            long r0 = androidx.media3.common.p136b.C2612ak.m7000y(r16, r18, r20)
            androidx.media3.extractor.h.aa r4 = new androidx.media3.extractor.h.aa
            r8 = r4
            r9 = r15
            r13 = r3
            r14 = r2
            r15 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0bf1
        L_0x0d89:
            r0.add(r1)
            goto L_0x0d97
        L_0x0d8d:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x0d95:
            r0 = r32
        L_0x0d97:
            int r15 = r31 + 1
            r1 = r54
            r12 = r57
            r13 = r0
            r0 = r53
            goto L_0x000c
        L_0x0da2:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3423j.m9908d(androidx.media3.extractor.h.a, androidx.media3.extractor.an, long, androidx.media3.common.DrmInitData, boolean, com.google.common.base.ah):java.util.List");
    }

    /* renamed from: e */
    private static int m9909e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: f */
    private static int m9910f(C2604ac acVar) {
        int g = acVar.mo6139g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = acVar.mo6139g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }

    /* renamed from: g */
    private static int m9911g(C2604ac acVar) {
        acVar.mo6131A(16);
        return acVar.mo6134b();
    }

    /* renamed from: h */
    private static long m9912h(C2604ac acVar) {
        int i = 8;
        acVar.mo6131A(8);
        if (C3416c.m9893e(acVar.mo6134b()) != 0) {
            i = 16;
        }
        acVar.mo6131A(acVar.f7235b + i);
        return acVar.mo6146n();
    }

    /* renamed from: i */
    private static Pair m9913i(C3413a aVar) {
        C3415b b = aVar.mo7380b(1701606260);
        if (b == null) {
            return null;
        }
        C2604ac acVar = b.f10462a;
        acVar.mo6131A(8);
        int e = C3416c.m9893e(acVar.mo6134b());
        int i = acVar.mo6141i();
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (i2 < i) {
            jArr[i2] = e == 1 ? acVar.mo6147o() : acVar.mo6146n();
            jArr2[i2] = e == 1 ? acVar.mo6145m() : (long) acVar.mo6134b();
            if (acVar.mo6152t() == 1) {
                acVar.mo6131A(acVar.f7235b + 2);
                i2++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: j */
    private static Pair m9914j(C2604ac acVar) {
        int i = 8;
        acVar.mo6131A(8);
        int e = C3416c.m9893e(acVar.mo6134b());
        acVar.mo6131A(acVar.f7235b + (e == 0 ? 8 : 16));
        long n = acVar.mo6146n();
        if (e == 0) {
            i = 4;
        }
        acVar.mo6131A(acVar.f7235b + i);
        int j = acVar.mo6142j();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((j >> 10) & 31) + 96));
        sb.append((char) (((j >> 5) & 31) + 96));
        sb.append((char) ((j & 31) + 96));
        return Pair.create(Long.valueOf(n), sb.toString());
    }

    /* renamed from: k */
    private static Pair m9915k(C2604ac acVar, int i, int i2) {
        Pair pair;
        Integer num;
        C3438y yVar;
        int i3;
        int i4;
        byte[] bArr;
        C2604ac acVar2 = acVar;
        int i5 = acVar2.f7235b;
        while (i5 - i < i2) {
            acVar2.mo6131A(i5);
            int b = acVar.mo6134b();
            boolean z = true;
            C3330ae.m9645b(b > 0, "childAtomSize must be positive");
            if (acVar.mo6134b() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < b) {
                    acVar2.mo6131A(i6);
                    int b2 = acVar.mo6134b();
                    int b3 = acVar.mo6134b();
                    if (b3 == 1718775137) {
                        num2 = Integer.valueOf(acVar.mo6134b());
                    } else if (b3 == 1935894637) {
                        acVar2.mo6131A(acVar2.f7235b + 4);
                        str = acVar2.mo6151s(4, C58913w.f156754c);
                    } else if (b3 == 1935894633) {
                        i7 = i6;
                        i8 = b2;
                    }
                    i6 += b2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C3330ae.m9645b(num2 != null, "frma atom is mandatory");
                    C3330ae.m9645b(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            yVar = null;
                            break;
                        }
                        acVar2.mo6131A(i9);
                        int b4 = acVar.mo6134b();
                        if (acVar.mo6134b() == 1952804451) {
                            int b5 = acVar.mo6134b();
                            acVar2.mo6131A(acVar2.f7235b + 1);
                            if (C3416c.m9893e(b5) == 0) {
                                acVar2.mo6131A(acVar2.f7235b + 1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int g = acVar.mo6139g();
                                i4 = g & 15;
                                i3 = (g & 240) >> 4;
                            }
                            boolean z2 = acVar.mo6139g() == 1;
                            int g2 = acVar.mo6139g();
                            byte[] bArr2 = new byte[16];
                            acVar2.mo6155w(bArr2, 0, 16);
                            if (!z2 || g2 != 0) {
                                bArr = null;
                            } else {
                                int g3 = acVar.mo6139g();
                                byte[] bArr3 = new byte[g3];
                                acVar2.mo6155w(bArr3, 0, g3);
                                bArr = bArr3;
                            }
                            num = num2;
                            yVar = new C3438y(z2, str, g2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i9 += b4;
                        }
                    }
                    if (yVar == null) {
                        z = false;
                    }
                    C3330ae.m9645b(z, "tenc atom is mandatory");
                    int i10 = C2612ak.f7249a;
                    pair = Pair.create(num, yVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += b;
        }
        return null;
    }

    /* renamed from: l */
    private static C3418e m9916l(C2604ac acVar, int i) {
        acVar.mo6131A(i + 12);
        acVar.mo6131A(acVar.f7235b + 1);
        m9910f(acVar);
        acVar.mo6131A(acVar.f7235b + 2);
        int g = acVar.mo6139g();
        if ((g & 128) != 0) {
            acVar.mo6131A(acVar.f7235b + 2);
        }
        if ((g & 64) != 0) {
            acVar.mo6131A(acVar.f7235b + acVar.mo6139g());
        }
        if ((g & 32) != 0) {
            acVar.mo6131A(acVar.f7235b + 2);
        }
        acVar.mo6131A(acVar.f7235b + 1);
        m9910f(acVar);
        String g2 = C2598ay.m6808g(acVar.mo6139g());
        if ("audio/mpeg".equals(g2) || "audio/vnd.dts".equals(g2) || "audio/vnd.dts.hd".equals(g2)) {
            return new C3418e(g2, (byte[]) null, -1, -1);
        }
        acVar.mo6131A(acVar.f7235b + 4);
        long n = acVar.mo6146n();
        long n2 = acVar.mo6146n();
        acVar.mo6131A(acVar.f7235b + 1);
        int f = m9910f(acVar);
        byte[] bArr = new byte[f];
        acVar.mo6155w(bArr, 0, f);
        long j = -1;
        if (n2 <= 0) {
            n2 = -1;
        }
        if (n > 0) {
            j = n;
        }
        return new C3418e(g2, bArr, n2, j);
    }

    /* renamed from: m */
    private static ByteBuffer m9917m() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:188:0x046c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018e  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9918n(androidx.media3.common.p136b.C2604ac r29, int r30, int r31, int r32, int r33, java.lang.String r34, boolean r35, androidx.media3.common.DrmInitData r36, androidx.media3.extractor.p161h.C3420g r37, int r38) {
        /*
            r0 = r29
            r1 = r31
            r2 = r32
            r3 = r34
            r4 = r36
            r5 = r37
            int r6 = r1 + 16
            r0.mo6131A(r6)
            if (r35 == 0) goto L_0x001f
            int r7 = r29.mo6142j()
            int r8 = r0.f7235b
            int r8 = r8 + 6
            r0.mo6131A(r8)
            goto L_0x0027
        L_0x001f:
            int r7 = r0.f7235b
            int r7 = r7 + 8
            r0.mo6131A(r7)
            r7 = 0
        L_0x0027:
            r8 = 20
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0053
            if (r7 != r10) goto L_0x0030
            goto L_0x0053
        L_0x0030:
            if (r7 != r9) goto L_0x0052
            int r7 = r0.f7235b
            int r7 = r7 + 16
            r0.mo6131A(r7)
            long r11 = r29.mo6145m()
            double r11 = java.lang.Double.longBitsToDouble(r11)
            long r11 = java.lang.Math.round(r11)
            int r7 = (int) r11
            int r11 = r29.mo6141i()
            int r12 = r0.f7235b
            int r12 = r12 + r8
            r0.mo6131A(r12)
            r13 = 0
            goto L_0x008b
        L_0x0052:
            return
        L_0x0053:
            int r11 = r29.mo6142j()
            int r12 = r0.f7235b
            int r12 = r12 + 6
            r0.mo6131A(r12)
            byte[] r12 = r0.f7234a
            int r13 = r0.f7235b
            int r14 = r13 + 1
            r0.f7235b = r14
            byte r13 = r12[r13]
            int r15 = r14 + 1
            r0.f7235b = r15
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            byte r12 = r12[r14]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r12 | r13
            int r15 = r15 + r9
            r0.f7235b = r15
            int r15 = r15 + -4
            r0.mo6131A(r15)
            int r13 = r29.mo6134b()
            if (r7 != r10) goto L_0x008a
            int r7 = r0.f7235b
            int r7 = r7 + 16
            r0.mo6131A(r7)
        L_0x008a:
            r7 = r12
        L_0x008b:
            int r12 = r0.f7235b
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r8 = r30
            if (r8 != r14) goto L_0x00bc
            android.util.Pair r8 = m9915k(r0, r1, r2)
            if (r8 == 0) goto L_0x00b8
            java.lang.Object r14 = r8.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r4 != 0) goto L_0x00a6
            r4 = 0
            goto L_0x00b0
        L_0x00a6:
            java.lang.Object r10 = r8.second
            androidx.media3.extractor.h.y r10 = (androidx.media3.extractor.p161h.C3438y) r10
            java.lang.String r10 = r10.f10588b
            androidx.media3.common.DrmInitData r4 = r4.mo6048a(r10)
        L_0x00b0:
            androidx.media3.extractor.h.y[] r10 = r5.f10477a
            java.lang.Object r8 = r8.second
            androidx.media3.extractor.h.y r8 = (androidx.media3.extractor.p161h.C3438y) r8
            r10[r38] = r8
        L_0x00b8:
            r0.mo6131A(r12)
            r8 = r14
        L_0x00bc:
            r10 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r9 = "audio/ac4"
            java.lang.String r18 = "audio/eac3"
            java.lang.String r15 = "audio/ac3"
            if (r8 != r10) goto L_0x00cf
            r21 = r15
        L_0x00cc:
            r8 = -1
            goto L_0x0182
        L_0x00cf:
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r8 != r10) goto L_0x00d7
            r21 = r18
            goto L_0x00cc
        L_0x00d7:
            r10 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r8 != r10) goto L_0x00df
            r21 = r9
            goto L_0x00cc
        L_0x00df:
            r10 = 1685353315(0x64747363, float:1.803728E22)
            if (r8 != r10) goto L_0x00e9
            java.lang.String r8 = "audio/vnd.dts"
        L_0x00e6:
            r21 = r8
            goto L_0x00cc
        L_0x00e9:
            r10 = 1685353320(0x64747368, float:1.8037286E22)
            if (r8 == r10) goto L_0x017e
            r10 = 1685353324(0x6474736c, float:1.803729E22)
            if (r8 != r10) goto L_0x00f5
            goto L_0x017e
        L_0x00f5:
            r10 = 1685353317(0x64747365, float:1.8037282E22)
            if (r8 != r10) goto L_0x00fd
            java.lang.String r8 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00e6
        L_0x00fd:
            r10 = 1685353336(0x64747378, float:1.8037304E22)
            if (r8 != r10) goto L_0x0105
            java.lang.String r8 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00e6
        L_0x0105:
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r8 != r10) goto L_0x010d
            java.lang.String r8 = "audio/3gpp"
            goto L_0x00e6
        L_0x010d:
            r10 = 1935767394(0x73617762, float:1.7863284E31)
            if (r8 != r10) goto L_0x0115
            java.lang.String r8 = "audio/amr-wb"
            goto L_0x00e6
        L_0x0115:
            r10 = 1819304813(0x6c70636d, float:1.1624469E27)
            java.lang.String r21 = "audio/raw"
            if (r8 == r10) goto L_0x017c
            r10 = 1936684916(0x736f7774, float:1.89725E31)
            if (r8 != r10) goto L_0x0122
            goto L_0x017c
        L_0x0122:
            r10 = 1953984371(0x74776f73, float:7.841539E31)
            if (r8 != r10) goto L_0x012a
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0182
        L_0x012a:
            r10 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r8 == r10) goto L_0x0178
            r10 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r8 != r10) goto L_0x0135
            goto L_0x0178
        L_0x0135:
            r10 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r8 != r10) goto L_0x013d
            java.lang.String r8 = "audio/mha1"
            goto L_0x00e6
        L_0x013d:
            r10 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r8 != r10) goto L_0x0145
            java.lang.String r8 = "audio/mhm1"
            goto L_0x00e6
        L_0x0145:
            if (r8 != r14) goto L_0x014a
            java.lang.String r8 = "audio/alac"
            goto L_0x00e6
        L_0x014a:
            r10 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r8 != r10) goto L_0x0152
            java.lang.String r8 = "audio/g711-alaw"
            goto L_0x00e6
        L_0x0152:
            r10 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r8 != r10) goto L_0x015a
            java.lang.String r8 = "audio/g711-mlaw"
            goto L_0x00e6
        L_0x015a:
            r10 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r8 != r10) goto L_0x0162
            java.lang.String r8 = "audio/opus"
            goto L_0x00e6
        L_0x0162:
            r10 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r8 != r10) goto L_0x016b
            java.lang.String r8 = "audio/flac"
            goto L_0x00e6
        L_0x016b:
            r10 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r8 != r10) goto L_0x0174
            java.lang.String r8 = "audio/true-hd"
            goto L_0x00e6
        L_0x0174:
            r8 = -1
            r21 = 0
            goto L_0x0182
        L_0x0178:
            java.lang.String r8 = "audio/mpeg"
            goto L_0x00e6
        L_0x017c:
            r8 = 2
            goto L_0x0182
        L_0x017e:
            java.lang.String r8 = "audio/vnd.dts.hd"
            goto L_0x00e6
        L_0x0182:
            r10 = r21
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x018a:
            int r6 = r12 - r1
            if (r6 >= r2) goto L_0x0466
            r0.mo6131A(r12)
            int r6 = r29.mo6134b()
            if (r6 <= 0) goto L_0x0199
            r14 = 1
            goto L_0x019a
        L_0x0199:
            r14 = 0
        L_0x019a:
            java.lang.String r1 = "childAtomSize must be positive"
            androidx.media3.extractor.C3330ae.m9645b(r14, r1)
            int r14 = r29.mo6134b()
            r2 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r14 != r2) goto L_0x01c6
            int r1 = r6 + -13
            byte[] r2 = new byte[r1]
            int r14 = r12 + 13
            r0.mo6131A(r14)
            r14 = 0
            r0.mo6155w(r2, r14, r1)
            com.google.common.b.gu r23 = com.google.common.p4522b.C58485gu.m89846n(r2)
            r21 = r8
            r38 = r15
        L_0x01bd:
            r14 = 0
            r15 = 20
            r16 = 1
            r17 = 2
            goto L_0x0458
        L_0x01c6:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r14 == r2) goto L_0x0420
            if (r35 == 0) goto L_0x0226
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r14 != r2) goto L_0x0226
            int r2 = r0.f7235b
            if (r2 < r12) goto L_0x01db
            r21 = r2
            r2 = 0
            r14 = 1
            goto L_0x01df
        L_0x01db:
            r21 = r2
            r2 = 0
            r14 = 0
        L_0x01df:
            androidx.media3.extractor.C3330ae.m9645b(r14, r2)
            r2 = r21
        L_0x01e4:
            int r14 = r2 - r12
            if (r14 >= r6) goto L_0x0214
            r0.mo6131A(r2)
            int r14 = r29.mo6134b()
            if (r14 <= 0) goto L_0x01f5
            r21 = r8
            r8 = 1
            goto L_0x01f8
        L_0x01f5:
            r21 = r8
            r8 = 0
        L_0x01f8:
            androidx.media3.extractor.C3330ae.m9645b(r8, r1)
            int r8 = r29.mo6134b()
            r25 = r1
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 == r1) goto L_0x020c
            int r2 = r2 + r14
            r8 = r21
            r1 = r25
            goto L_0x01e4
        L_0x020c:
            r8 = r2
            r38 = r15
            r1 = -1
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x021d
        L_0x0214:
            r21 = r8
            r38 = r15
            r1 = -1
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r8 = -1
        L_0x021d:
            r14 = 0
            r15 = 20
            r16 = 1
            r17 = 2
            goto L_0x0430
        L_0x0226:
            r21 = r8
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            r2 = 3
            r8 = 4
            if (r14 != r1) goto L_0x0278
            int r1 = r12 + 8
            r0.mo6131A(r1)
            java.lang.String r1 = java.lang.Integer.toString(r33)
            int[] r14 = androidx.media3.extractor.C3375c.f10200a
            int r14 = r29.mo6139g()
            int[] r25 = androidx.media3.extractor.C3375c.f10201b
            r14 = r14 & 192(0xc0, float:2.69E-43)
            int r14 = r14 >> 6
            r14 = r25[r14]
            int r25 = r29.mo6139g()
            int[] r26 = androidx.media3.extractor.C3375c.f10203d
            r27 = r25 & 56
            int r2 = r27 >> 3
            r2 = r26[r2]
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0258
            int r2 = r2 + 1
        L_0x0258:
            androidx.media3.common.w r8 = new androidx.media3.common.w
            r8.<init>()
            r8.f7449a = r1
            r8.f7459k = r15
            r8.f7472x = r2
            r8.f7473y = r14
            r8.f7462n = r4
            r8.f7451c = r3
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r8)
            r5.f10478b = r1
            r38 = r15
        L_0x0272:
            r1 = 0
        L_0x0273:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x01bd
        L_0x0278:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r14 != r1) goto L_0x02f5
            int r1 = r12 + 8
            r0.mo6131A(r1)
            java.lang.String r1 = java.lang.Integer.toString(r33)
            int[] r2 = androidx.media3.extractor.C3375c.f10200a
            int r2 = r0.f7235b
            r8 = 2
            int r2 = r2 + r8
            r0.mo6131A(r2)
            int r2 = r29.mo6139g()
            int[] r8 = androidx.media3.extractor.C3375c.f10201b
            r2 = r2 & 192(0xc0, float:2.69E-43)
            int r2 = r2 >> 6
            r2 = r8[r2]
            int r8 = r29.mo6139g()
            int[] r14 = androidx.media3.extractor.C3375c.f10203d
            r25 = r8 & 14
            r16 = 1
            int r25 = r25 >> 1
            r14 = r14[r25]
            r8 = r8 & 1
            if (r8 == 0) goto L_0x02af
            int r14 = r14 + 1
        L_0x02af:
            int r8 = r29.mo6139g()
            r8 = r8 & 30
            int r8 = r8 >> 1
            if (r8 <= 0) goto L_0x02c5
            int r8 = r29.mo6139g()
            r17 = 2
            r8 = r8 & 2
            if (r8 == 0) goto L_0x02c5
            int r14 = r14 + 2
        L_0x02c5:
            int r8 = r0.f7236c
            r38 = r15
            int r15 = r0.f7235b
            int r8 = r8 - r15
            if (r8 <= 0) goto L_0x02d9
            int r8 = r29.mo6139g()
            r15 = 1
            r8 = r8 & r15
            if (r8 == 0) goto L_0x02d9
            java.lang.String r8 = "audio/eac3-joc"
            goto L_0x02db
        L_0x02d9:
            r8 = r18
        L_0x02db:
            androidx.media3.common.w r15 = new androidx.media3.common.w
            r15.<init>()
            r15.f7449a = r1
            r15.f7459k = r8
            r15.f7472x = r14
            r15.f7473y = r2
            r15.f7462n = r4
            r15.f7451c = r3
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r15)
            r5.f10478b = r1
            goto L_0x0272
        L_0x02f5:
            r38 = r15
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r14 != r1) goto L_0x033a
            int r1 = r12 + 8
            r0.mo6131A(r1)
            java.lang.String r1 = java.lang.Integer.toString(r33)
            int r2 = androidx.media3.extractor.C3387e.f10256a
            int r2 = r0.f7235b
            r8 = 1
            int r2 = r2 + r8
            r0.mo6131A(r2)
            int r2 = r29.mo6139g()
            r2 = r2 & 32
            int r2 = r2 >> 5
            if (r8 == r2) goto L_0x031c
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x031f
        L_0x031c:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x031f:
            androidx.media3.common.w r8 = new androidx.media3.common.w
            r8.<init>()
            r8.f7449a = r1
            r8.f7459k = r9
            r1 = 2
            r8.f7472x = r1
            r8.f7473y = r2
            r8.f7462n = r4
            r8.f7451c = r3
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r8)
            r5.f10478b = r1
            goto L_0x0272
        L_0x033a:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r14 != r1) goto L_0x0359
            if (r13 <= 0) goto L_0x0345
            r7 = r13
            r11 = 2
            goto L_0x01bd
        L_0x0345:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x0359:
            r1 = 0
            r15 = 1684305011(0x64647473, float:1.6856995E22)
            if (r14 != r15) goto L_0x037d
            androidx.media3.common.w r2 = new androidx.media3.common.w
            r2.<init>()
            java.lang.String r8 = java.lang.Integer.toString(r33)
            r2.f7449a = r8
            r2.f7459k = r10
            r2.f7472x = r11
            r2.f7473y = r7
            r2.f7462n = r4
            r2.f7451c = r3
            androidx.media3.common.x r8 = new androidx.media3.common.x
            r8.<init>(r2)
            r5.f10478b = r8
            goto L_0x0273
        L_0x037d:
            r15 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r14 != r15) goto L_0x039b
            int r2 = r6 + -8
            byte[] r8 = f10489a
            int r14 = r8.length
            int r14 = r14 + r2
            byte[] r14 = java.util.Arrays.copyOf(r8, r14)
            int r15 = r12 + 8
            r0.mo6131A(r15)
            int r8 = r8.length
            r0.mo6155w(r14, r8, r2)
            java.util.List r23 = androidx.media3.extractor.C3348aw.m9697a(r14)
            goto L_0x01bd
        L_0x039b:
            r15 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r14 != r15) goto L_0x03cd
            int r14 = r6 + -12
            int r15 = r14 + 4
            byte[] r15 = new byte[r15]
            r19 = 102(0x66, float:1.43E-43)
            r20 = 0
            r15[r20] = r19
            r19 = 76
            r16 = 1
            r15[r16] = r19
            r19 = 97
            r17 = 2
            r15[r17] = r19
            r19 = 67
            r15[r2] = r19
            int r2 = r12 + 12
            r0.mo6131A(r2)
            r0.mo6155w(r15, r8, r14)
            com.google.common.b.gu r23 = com.google.common.p4522b.C58485gu.m89846n(r15)
        L_0x03c8:
            r14 = 0
            r15 = 20
            goto L_0x0458
        L_0x03cd:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r17 = 2
            if (r14 != r2) goto L_0x03c8
            int r7 = r6 + -12
            byte[] r8 = new byte[r7]
            int r11 = r12 + 12
            r0.mo6131A(r11)
            r14 = 0
            r0.mo6155w(r8, r14, r7)
            androidx.media3.common.b.ac r7 = new androidx.media3.common.b.ac
            r7.<init>((byte[]) r8)
            r11 = 9
            r7.mo6131A(r11)
            int r11 = r7.mo6139g()
            r15 = 20
            r7.mo6131A(r15)
            int r7 = r7.mo6141i()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            android.util.Pair r7 = android.util.Pair.create(r7, r11)
            java.lang.Object r11 = r7.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.common.b.gu r23 = com.google.common.p4522b.C58485gu.m89846n(r8)
            r28 = r11
            r11 = r7
            r7 = r28
            goto L_0x0458
        L_0x0420:
            r21 = r8
            r38 = r15
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 0
            r15 = 20
            r16 = 1
            r17 = 2
            r8 = r12
            r1 = -1
        L_0x0430:
            if (r8 == r1) goto L_0x0458
            androidx.media3.extractor.h.e r8 = m9916l(r0, r8)
            java.lang.String r10 = r8.f10473a
            byte[] r1 = r8.f10474b
            if (r1 == 0) goto L_0x0456
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0450
            androidx.media3.extractor.a r2 = androidx.media3.extractor.C3352b.m9711a(r1)
            int r7 = r2.f10030a
            int r11 = r2.f10031b
            java.lang.String r2 = r2.f10032c
            r22 = r2
        L_0x0450:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            r23 = r1
        L_0x0456:
            r24 = r8
        L_0x0458:
            int r12 = r12 + r6
            r1 = r31
            r2 = r32
            r15 = r38
            r8 = r21
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x018a
        L_0x0466:
            r21 = r8
            androidx.media3.common.x r0 = r5.f10478b
            if (r0 != 0) goto L_0x04aa
            if (r10 == 0) goto L_0x04aa
            androidx.media3.common.w r0 = new androidx.media3.common.w
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r33)
            r0.f7449a = r1
            r0.f7459k = r10
            r1 = r22
            r0.f7456h = r1
            r0.f7472x = r11
            r0.f7473y = r7
            r6 = r21
            r0.f7474z = r6
            r1 = r23
            r0.f7461m = r1
            r0.f7462n = r4
            r0.f7451c = r3
            r1 = r24
            if (r1 == 0) goto L_0x04a3
            long r2 = r1.f10475c
            int r2 = com.google.common.p4575r.C60757n.m92748i(r2)
            r0.f7454f = r2
            long r1 = r1.f10476d
            int r1 = com.google.common.p4575r.C60757n.m92748i(r1)
            r0.f7455g = r1
        L_0x04a3:
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r0)
            r5.f10478b = r1
        L_0x04aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p161h.C3423j.m9918n(androidx.media3.common.b.ac, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, androidx.media3.extractor.h.g, int):void");
    }

    /* renamed from: o */
    private static boolean m9919o(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        int f = C2612ak.m6981f(4, 0, i);
        int f2 = C2612ak.m6981f(length - 4, 0, i);
        if (jArr[0] > j2 || j2 >= jArr[f] || jArr[f2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private static void m9920p(C2604ac acVar, int i, int i2, C3420g gVar) {
        acVar.mo6131A(i + 16);
        acVar.mo6132B();
        String B = acVar.mo6132B();
        if (B != null) {
            C2679w wVar = new C2679w();
            wVar.f7449a = Integer.toString(i2);
            wVar.f7459k = B;
            gVar.f10478b = new C2680x(wVar);
        }
    }
}
