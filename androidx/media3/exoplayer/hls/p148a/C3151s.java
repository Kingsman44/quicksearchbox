package androidx.media3.exoplayer.hls.p148a;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2669m;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2610ai;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3258x;
import androidx.media3.extractor.p161h.C3434u;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.common.p4522b.C58557jl;
import java.io.BufferedReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.exoplayer.hls.a.s */
/* compiled from: PG */
public final class C3151s implements C3258x {

    /* renamed from: A */
    private static final Pattern f9320A = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: B */
    private static final Pattern f9321B = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: C */
    private static final Pattern f9322C = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: D */
    private static final Pattern f9323D = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: E */
    private static final Pattern f9324E = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: F */
    private static final Pattern f9325F = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: G */
    private static final Pattern f9326G = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: H */
    private static final Pattern f9327H = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: I */
    private static final Pattern f9328I = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f9329J = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: K */
    private static final Pattern f9330K = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: L */
    private static final Pattern f9331L = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: M */
    private static final Pattern f9332M = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: N */
    private static final Pattern f9333N = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: O */
    private static final Pattern f9334O = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f9335P = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f9336Q = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: R */
    private static final Pattern f9337R = m9201m("AUTOSELECT");

    /* renamed from: S */
    private static final Pattern f9338S = m9201m("DEFAULT");

    /* renamed from: T */
    private static final Pattern f9339T = m9201m("FORCED");

    /* renamed from: U */
    private static final Pattern f9340U = m9201m("INDEPENDENT");

    /* renamed from: V */
    private static final Pattern f9341V = m9201m("GAP");

    /* renamed from: W */
    private static final Pattern f9342W = m9201m("PRECISE");

    /* renamed from: X */
    private static final Pattern f9343X = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: Y */
    private static final Pattern f9344Y = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: Z */
    private static final Pattern f9345Z = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: a */
    private static final Pattern f9346a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    private static final Pattern f9347b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: c */
    private static final Pattern f9348c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: d */
    private static final Pattern f9349d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f9350e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f9351f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: g */
    private static final Pattern f9352g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f9353h = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: i */
    private static final Pattern f9354i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: j */
    private static final Pattern f9355j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: k */
    private static final Pattern f9356k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: l */
    private static final Pattern f9357l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f9358m = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: n */
    private static final Pattern f9359n = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: o */
    private static final Pattern f9360o = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: p */
    private static final Pattern f9361p = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: q */
    private static final Pattern f9362q = m9201m("CAN-SKIP-DATERANGES");

    /* renamed from: r */
    private static final Pattern f9363r = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: s */
    private static final Pattern f9364s = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: t */
    private static final Pattern f9365t = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: u */
    private static final Pattern f9366u = m9201m("CAN-BLOCK-RELOAD");

    /* renamed from: v */
    private static final Pattern f9367v = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: w */
    private static final Pattern f9368w = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: x */
    private static final Pattern f9369x = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: y */
    private static final Pattern f9370y = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: z */
    private static final Pattern f9371z = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: aa */
    private final C3147o f9372aa;

    /* renamed from: ab */
    private final C3144l f9373ab;

    public C3151s() {
        C3147o oVar = C3147o.f9303a;
        throw null;
    }

    public C3151s(C3147o oVar, C3144l lVar) {
        this.f9372aa = oVar;
        this.f9373ab = lVar;
    }

    /* renamed from: b */
    private static double m9190b(String str, Pattern pattern) {
        return Double.parseDouble(m9199k(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: c */
    private static int m9191c(String str, Pattern pattern) {
        return Integer.parseInt(m9199k(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: d */
    private static int m9192d(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !C2612ak.m6957ag(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: e */
    private static DrmInitData.SchemeData m9193e(String str, String str2, Map map) {
        String j = m9198j(str, f9327H, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String k = m9199k(str, f9328I, map);
            return new DrmInitData.SchemeData(C2669m.f7431d, (String) null, MediaUtilities.MIME_TYPE, Base64.decode(k.substring(k.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(C2669m.f7431d, (String) null, "hls", C2612ak.m6961ak(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(j)) {
                return null;
            }
            String k2 = m9199k(str, f9328I, map);
            return new DrmInitData.SchemeData(C2669m.f7432e, (String) null, MediaUtilities.MIME_TYPE, C3434u.m9956b(C2669m.f7432e, (UUID[]) null, Base64.decode(k2.substring(k2.indexOf(44)), 0)));
        }
    }

    /* renamed from: f */
    private static DrmInitData m9194f(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i];
            schemeDataArr2[i] = new DrmInitData.SchemeData(schemeData.f7051a, schemeData.f7052b, schemeData.f7053c, (byte[]) null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    /* renamed from: g */
    private static C3144l m9195g(C3147o oVar, C3144l lVar, C3150r rVar, String str) {
        C3139g gVar;
        boolean z;
        String str2;
        HashMap hashMap;
        String str3;
        TreeMap treeMap;
        String str4;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str5;
        long j;
        C3147o oVar2;
        String str6;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str7;
        ArrayList arrayList5;
        String str8;
        ArrayList arrayList6;
        ArrayList arrayList7;
        HashMap hashMap2;
        String str9;
        long j2;
        DrmInitData drmInitData;
        long j3;
        C3139g gVar2;
        String str10;
        String str11;
        String str12;
        String str13;
        C3147o oVar3 = oVar;
        C3144l lVar2 = lVar;
        boolean z2 = oVar3.f9316v;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        C3143k kVar = new C3143k(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str14 = BuildConfig.FLAVOR;
        boolean z3 = z2;
        C3143k kVar2 = kVar;
        String str15 = str14;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = -1;
        int i = 0;
        boolean z4 = false;
        long j13 = -9223372036854775807L;
        boolean z5 = false;
        int i2 = 0;
        int i3 = 1;
        long j14 = -9223372036854775807L;
        long j15 = -9223372036854775807L;
        boolean z6 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z7 = false;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        int i4 = 0;
        boolean z8 = false;
        C3141i iVar = null;
        ArrayList arrayList12 = arrayList9;
        C3139g gVar3 = null;
        while (rVar.mo7149b()) {
            String a = rVar.mo7148a();
            if (a.startsWith("#EXT")) {
                arrayList11.add(a);
            }
            if (a.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k = m9199k(a, f9360o, hashMap3);
                if ("VOD".equals(k)) {
                    i = 1;
                } else if ("EVENT".equals(k)) {
                    i = 2;
                } else {
                    gVar = gVar3;
                    arrayList2 = arrayList12;
                    z = z4;
                    str2 = str16;
                    str5 = str17;
                    str3 = str18;
                    arrayList = arrayList11;
                    str4 = str14;
                    j = j9;
                    TreeMap treeMap3 = treeMap2;
                    hashMap = hashMap4;
                    treeMap = treeMap3;
                }
            } else if (a.equals("#EXT-X-I-FRAMES-ONLY")) {
                z8 = true;
            } else if (a.startsWith("#EXT-X-START")) {
                j13 = (long) (m9190b(a, f9320A) * 1000000.0d);
                z4 = m9202n(a, f9342W);
            } else if (a.startsWith("#EXT-X-SERVER-CONTROL")) {
                double o = m9203o(a, f9361p);
                long j16 = o == -9.223372036854776E18d ? -9223372036854775807L : (long) (o * 1000000.0d);
                boolean n = m9202n(a, f9362q);
                double o2 = m9203o(a, f9364s);
                long j17 = o2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (o2 * 1000000.0d);
                double o3 = m9203o(a, f9365t);
                kVar2 = new C3143k(j16, n, j17, o3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (o3 * 1000000.0d), m9202n(a, f9366u));
            } else if (a.startsWith("#EXT-X-PART-INF")) {
                j15 = (long) (m9190b(a, f9358m) * 1000000.0d);
            } else {
                if (a.startsWith("#EXT-X-MAP")) {
                    String k2 = m9199k(a, f9328I, hashMap3);
                    z = z4;
                    String j18 = m9198j(a, f9322C, (String) null, hashMap3);
                    if (j18 != null) {
                        String[] aq = C2612ak.m6967aq(j18, "@");
                        j12 = Long.parseLong(aq[0]);
                        if (aq.length > 1) {
                            j6 = Long.parseLong(aq[1]);
                        }
                    }
                    if (j12 == -1) {
                        j6 = 0;
                    }
                    String str19 = str16;
                    String str20 = str17;
                    if (str19 == null || str20 != null) {
                        iVar = new C3141i(k2, j6, j12, str19, str20);
                        if (j12 != -1) {
                            j6 += j12;
                        }
                        str17 = str20;
                        str16 = str19;
                        j12 = -1;
                    } else {
                        throw C2599az.m6821c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", (Throwable) null);
                    }
                } else {
                    z = z4;
                    str2 = str16;
                    str5 = str17;
                    arrayList = arrayList11;
                    HashMap hashMap5 = hashMap4;
                    gVar = gVar3;
                    if (a.startsWith("#EXT-X-TARGETDURATION")) {
                        arrayList5 = arrayList12;
                        j14 = ((long) m9191c(a, f9356k)) * 1000000;
                    } else {
                        arrayList5 = arrayList12;
                        if (a.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j9 = Long.parseLong(m9199k(a, f9367v, Collections.emptyMap()));
                            arrayList12 = arrayList5;
                            arrayList11 = arrayList;
                            hashMap4 = hashMap5;
                            j5 = j9;
                            gVar3 = gVar;
                            str17 = str5;
                            str16 = str2;
                        } else if (a.startsWith("#EXT-X-VERSION")) {
                            i3 = m9191c(a, f9359n);
                        } else if (a.startsWith("#EXT-X-DEFINE")) {
                            String j19 = m9198j(a, f9344Y, (String) null, hashMap3);
                            if (j19 != null) {
                                String str21 = (String) oVar3.f9312j.get(j19);
                                if (str21 != null) {
                                    hashMap3.put(j19, str21);
                                }
                            } else {
                                hashMap3.put(m9199k(a, f9333N, hashMap3), m9199k(a, f9343X, hashMap3));
                            }
                            treeMap = treeMap2;
                            arrayList2 = arrayList5;
                            hashMap = hashMap5;
                            str3 = str18;
                            j = j9;
                            str4 = str14;
                        } else if (a.startsWith("#EXTINF")) {
                            j11 = new BigDecimal(m9199k(a, f9368w, Collections.emptyMap())).multiply(new BigDecimal(1000000)).longValue();
                            str15 = m9198j(a, f9369x, str14, hashMap3);
                        } else if (a.startsWith("#EXT-X-SKIP")) {
                            int c = m9191c(a, f9363r);
                            C2601a.m6832d(lVar2 != null && arrayList8.isEmpty());
                            int i5 = C2612ak.f7249a;
                            int i6 = (int) (j5 - lVar2.f9282h);
                            int i7 = c + i6;
                            if (i6 < 0 || i7 > lVar2.f9289o.size()) {
                                throw new C3149q();
                            }
                            while (i6 < i7) {
                                C3141i iVar2 = (C3141i) lVar2.f9289o.get(i6);
                                if (j5 != lVar2.f9282h) {
                                    int i8 = (lVar2.f9281g - i2) + iVar2.f9262f;
                                    ArrayList arrayList13 = new ArrayList();
                                    long j20 = j8;
                                    int i9 = 0;
                                    while (i9 < iVar2.f9258b.size()) {
                                        C3139g gVar4 = (C3139g) iVar2.f9258b.get(i9);
                                        arrayList13.add(new C3139g(gVar4.f9259c, gVar4.f9260d, gVar4.f9261e, i8, j20, gVar4.f9264h, gVar4.f9265i, gVar4.f9266j, gVar4.f9267k, gVar4.f9268l, gVar4.f9269m, gVar4.f9252a, gVar4.f9253b));
                                        j20 += gVar4.f9261e;
                                        i9++;
                                        C3147o oVar4 = oVar;
                                        str14 = str14;
                                        str5 = str5;
                                        C3144l lVar3 = lVar;
                                    }
                                    str13 = str14;
                                    str12 = str5;
                                    iVar2 = new C3141i(iVar2.f9259c, iVar2.f9260d, iVar2.f9257a, iVar2.f9261e, i8, j8, iVar2.f9264h, iVar2.f9265i, iVar2.f9266j, iVar2.f9267k, iVar2.f9268l, iVar2.f9269m, arrayList13);
                                } else {
                                    str13 = str14;
                                    str12 = str5;
                                }
                                arrayList8.add(iVar2);
                                j8 += iVar2.f9261e;
                                long j21 = iVar2.f9268l;
                                if (j21 != -1) {
                                    j6 = iVar2.f9267k + j21;
                                }
                                int i10 = iVar2.f9262f;
                                C3141i iVar3 = iVar2.f9260d;
                                DrmInitData drmInitData4 = iVar2.f9264h;
                                str2 = iVar2.f9265i;
                                String str22 = iVar2.f9266j;
                                if (str22 == null || !str22.equals(Long.toHexString(j9))) {
                                    str5 = iVar2.f9266j;
                                } else {
                                    str5 = str12;
                                }
                                j9++;
                                i6++;
                                i4 = i10;
                                iVar = iVar3;
                                drmInitData3 = drmInitData4;
                                j7 = j8;
                                C3147o oVar5 = oVar;
                                str14 = str13;
                                lVar2 = lVar;
                            }
                            oVar3 = oVar;
                            lVar2 = lVar;
                            arrayList12 = arrayList5;
                            arrayList11 = arrayList;
                            hashMap4 = hashMap5;
                            gVar3 = gVar;
                            str16 = str2;
                            str17 = str5;
                        } else {
                            String str23 = str14;
                            if (a.startsWith("#EXT-X-KEY")) {
                                String k3 = m9199k(a, f9325F, hashMap3);
                                String j22 = m9198j(a, f9326G, "identity", hashMap3);
                                if ("NONE".equals(k3)) {
                                    treeMap2.clear();
                                    str11 = null;
                                } else {
                                    str11 = m9198j(a, f9329J, (String) null, hashMap3);
                                    if (!"identity".equals(j22)) {
                                        String str24 = str18;
                                        str18 = str24 == null ? m9197i(k3) : str24;
                                        DrmInitData.SchemeData e = m9193e(a, j22, hashMap3);
                                        if (e != null) {
                                            treeMap2.put(j22, e);
                                        }
                                    } else if ("AES-128".equals(k3)) {
                                        str10 = m9199k(a, f9328I, hashMap3);
                                        oVar3 = oVar;
                                        str14 = str23;
                                        arrayList11 = arrayList;
                                        hashMap4 = hashMap5;
                                        z4 = z;
                                        gVar3 = gVar;
                                        lVar2 = lVar;
                                        str17 = str11;
                                        str16 = str10;
                                        arrayList12 = arrayList5;
                                    }
                                    str10 = null;
                                    oVar3 = oVar;
                                    str14 = str23;
                                    arrayList11 = arrayList;
                                    hashMap4 = hashMap5;
                                    z4 = z;
                                    gVar3 = gVar;
                                    lVar2 = lVar;
                                    str17 = str11;
                                    str16 = str10;
                                    arrayList12 = arrayList5;
                                }
                                drmInitData3 = null;
                                str10 = null;
                                oVar3 = oVar;
                                str14 = str23;
                                arrayList11 = arrayList;
                                hashMap4 = hashMap5;
                                z4 = z;
                                gVar3 = gVar;
                                lVar2 = lVar;
                                str17 = str11;
                                str16 = str10;
                                arrayList12 = arrayList5;
                            } else {
                                str3 = str18;
                                if (a.startsWith("#EXT-X-BYTERANGE")) {
                                    String[] aq2 = C2612ak.m6967aq(m9199k(a, f9321B, hashMap3), "@");
                                    j12 = Long.parseLong(aq2[0]);
                                    if (aq2.length > 1) {
                                        j6 = Long.parseLong(aq2[1]);
                                    }
                                    oVar3 = oVar;
                                    str14 = str23;
                                    str8 = str3;
                                    arrayList6 = arrayList5;
                                    arrayList7 = arrayList;
                                    hashMap2 = hashMap5;
                                    gVar3 = gVar;
                                } else if (a.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i2 = Integer.parseInt(a.substring(a.indexOf(58) + 1));
                                    oVar3 = oVar;
                                    str14 = str23;
                                    str8 = str3;
                                    arrayList6 = arrayList5;
                                    arrayList7 = arrayList;
                                    hashMap2 = hashMap5;
                                    gVar3 = gVar;
                                    z5 = true;
                                } else {
                                    if (a.equals("#EXT-X-DISCONTINUITY")) {
                                        i4++;
                                    } else {
                                        if (a.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j4 == 0) {
                                                j4 = C2612ak.m6998w(C2612ak.m6999x(a.substring(a.indexOf(58) + 1))) - j8;
                                            } else {
                                                str4 = str23;
                                                treeMap = treeMap2;
                                            }
                                        } else if (a.equals("#EXT-X-GAP")) {
                                            oVar3 = oVar;
                                            str14 = str23;
                                            str8 = str3;
                                            arrayList6 = arrayList5;
                                            arrayList7 = arrayList;
                                            hashMap2 = hashMap5;
                                            gVar3 = gVar;
                                            z7 = true;
                                        } else if (a.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            oVar3 = oVar;
                                            str14 = str23;
                                            str8 = str3;
                                            arrayList6 = arrayList5;
                                            arrayList7 = arrayList;
                                            hashMap2 = hashMap5;
                                            gVar3 = gVar;
                                            z3 = true;
                                        } else if (a.equals("#EXT-X-ENDLIST")) {
                                            oVar3 = oVar;
                                            str14 = str23;
                                            str8 = str3;
                                            arrayList6 = arrayList5;
                                            arrayList7 = arrayList;
                                            hashMap2 = hashMap5;
                                            gVar3 = gVar;
                                            z6 = true;
                                        } else if (a.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            treeMap = treeMap2;
                                            arrayList10.add(new C3140h(Uri.parse(C2610ai.m6915a(str, m9199k(a, f9328I, hashMap3))), m9205q(a, f9370y), m9204p(a, f9371z)));
                                            str4 = str23;
                                        } else {
                                            treeMap = treeMap2;
                                            if (!a.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j = j9;
                                                if (a.startsWith("#EXT-X-PART")) {
                                                    String h = m9196h(j, str2, str5);
                                                    String k4 = m9199k(a, f9328I, hashMap3);
                                                    long b = (long) (m9190b(a, f9357l) * 1000000.0d);
                                                    boolean n2 = m9202n(a, f9340U) | (z3 && arrayList5.isEmpty());
                                                    boolean n3 = m9202n(a, f9341V);
                                                    String str25 = str23;
                                                    String j23 = m9198j(a, f9322C, (String) null, hashMap3);
                                                    if (j23 != null) {
                                                        String[] aq3 = C2612ak.m6967aq(j23, "@");
                                                        j3 = Long.parseLong(aq3[0]);
                                                        if (aq3.length > 1) {
                                                            j10 = Long.parseLong(aq3[1]);
                                                        }
                                                    } else {
                                                        j3 = -1;
                                                    }
                                                    if (j3 == -1) {
                                                        j10 = 0;
                                                    }
                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData5 = new DrmInitData(str3, true, schemeDataArr);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = m9194f(str3, schemeDataArr);
                                                        }
                                                        drmInitData3 = drmInitData5;
                                                    }
                                                    ArrayList arrayList14 = arrayList5;
                                                    arrayList14.add(new C3139g(k4, iVar, b, i4, j7, drmInitData3, str2, h, j10, j3, n3, n2, false));
                                                    j7 += b;
                                                    if (j3 != -1) {
                                                        j10 += j3;
                                                    }
                                                    oVar3 = oVar;
                                                    lVar2 = lVar;
                                                    treeMap2 = treeMap;
                                                    j9 = j;
                                                    arrayList12 = arrayList14;
                                                    arrayList11 = arrayList;
                                                    hashMap4 = hashMap5;
                                                    str14 = str25;
                                                    str18 = str3;
                                                    str17 = str5;
                                                    str16 = str2;
                                                    z4 = z;
                                                    gVar3 = gVar;
                                                } else {
                                                    str9 = str23;
                                                    arrayList2 = arrayList5;
                                                    if (!a.startsWith("#")) {
                                                        String h2 = m9196h(j, str2, str5);
                                                        j9 = j + 1;
                                                        String l = m9200l(a, hashMap3);
                                                        hashMap = hashMap5;
                                                        C3141i iVar4 = (C3141i) hashMap.get(l);
                                                        if (j12 == -1) {
                                                            j2 = 0;
                                                        } else {
                                                            if (z8 && iVar == null && iVar4 == null) {
                                                                iVar4 = new C3141i(l, 0, j6, (String) null, (String) null);
                                                                hashMap.put(l, iVar4);
                                                            }
                                                            j2 = j6;
                                                        }
                                                        if (drmInitData3 != null || treeMap.isEmpty()) {
                                                            drmInitData = drmInitData3;
                                                        } else {
                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData = new DrmInitData(str3, true, schemeDataArr2);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = m9194f(str3, schemeDataArr2);
                                                            }
                                                        }
                                                        arrayList8.add(new C3141i(l, iVar != null ? iVar : iVar4, str15, j11, i4, j8, drmInitData, str2, h2, j2, j12, z7, arrayList2));
                                                        j7 = j8 + j11;
                                                        arrayList3 = new ArrayList();
                                                        if (j12 != -1) {
                                                            j2 += j12;
                                                        }
                                                        j6 = j2;
                                                        oVar2 = oVar;
                                                        lVar2 = lVar;
                                                        drmInitData3 = drmInitData;
                                                        str6 = str5;
                                                        j11 = 0;
                                                        j12 = -1;
                                                        j8 = j7;
                                                        arrayList4 = arrayList;
                                                        str7 = str9;
                                                        str15 = str7;
                                                        z7 = false;
                                                        str18 = str3;
                                                        str16 = str2;
                                                        z4 = z;
                                                        gVar3 = gVar;
                                                        HashMap hashMap6 = hashMap;
                                                        treeMap2 = treeMap;
                                                        hashMap4 = hashMap6;
                                                    }
                                                }
                                            } else if (gVar != null || !"PART".equals(m9199k(a, f9331L, hashMap3))) {
                                                j = j9;
                                                str9 = str23;
                                                arrayList2 = arrayList5;
                                            } else {
                                                String k5 = m9199k(a, f9328I, hashMap3);
                                                long q = m9205q(a, f9323D);
                                                long q2 = m9205q(a, f9324E);
                                                long j24 = q;
                                                long j25 = j9;
                                                String h3 = m9196h(j25, str2, str5);
                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData6 = new DrmInitData(str3, true, schemeDataArr3);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = m9194f(str3, schemeDataArr3);
                                                    }
                                                    drmInitData3 = drmInitData6;
                                                }
                                                if (j24 == -1 || q2 != -1) {
                                                    gVar2 = new C3139g(k5, iVar, 0, i4, j7, drmInitData3, str2, h3, j24 != -1 ? j24 : 0, q2, false, false, true);
                                                } else {
                                                    gVar2 = null;
                                                }
                                                str14 = str23;
                                                treeMap2 = treeMap;
                                                str18 = str3;
                                                j9 = j25;
                                                arrayList12 = arrayList5;
                                                arrayList11 = arrayList;
                                                hashMap4 = hashMap5;
                                                lVar2 = lVar;
                                                gVar3 = gVar2;
                                                str17 = str5;
                                                str16 = str2;
                                                z4 = z;
                                                oVar3 = oVar;
                                            }
                                            hashMap = hashMap5;
                                        }
                                        arrayList2 = arrayList5;
                                        hashMap = hashMap5;
                                        j = j9;
                                    }
                                    oVar3 = oVar;
                                    str14 = str23;
                                    str8 = str3;
                                    arrayList6 = arrayList5;
                                    arrayList7 = arrayList;
                                    hashMap2 = hashMap5;
                                    gVar3 = gVar;
                                }
                                lVar2 = lVar;
                                str17 = str5;
                                str16 = str2;
                            }
                        }
                    }
                    arrayList12 = arrayList5;
                    arrayList11 = arrayList;
                    hashMap4 = hashMap5;
                    gVar3 = gVar;
                    str17 = str5;
                    str16 = str2;
                }
                z4 = z;
            }
            oVar2 = oVar;
            lVar2 = lVar;
            j9 = j;
            str6 = str5;
            arrayList3 = arrayList2;
            arrayList4 = arrayList;
            str7 = str4;
            str18 = str3;
            str16 = str2;
            z4 = z;
            gVar3 = gVar;
            HashMap hashMap62 = hashMap;
            treeMap2 = treeMap;
            hashMap4 = hashMap62;
        }
        C3139g gVar5 = gVar3;
        ArrayList arrayList15 = arrayList12;
        ArrayList arrayList16 = arrayList11;
        boolean z9 = z4;
        HashMap hashMap7 = new HashMap();
        for (int i11 = 0; i11 < arrayList10.size(); i11++) {
            C3140h hVar = (C3140h) arrayList10.get(i11);
            long j26 = hVar.f9255b;
            if (j26 == -1) {
                j26 = (j5 + ((long) arrayList8.size())) - (arrayList15.isEmpty() ? 1 : 0);
            }
            int i12 = hVar.f9256c;
            if (i12 == -1) {
                if (j15 != -9223372036854775807L) {
                    i12 = (arrayList15.isEmpty() ? ((C3141i) C58557jl.m90131l(arrayList8)).f9258b : arrayList15).size() - 1;
                } else {
                    i12 = -1;
                }
            }
            Uri uri = hVar.f9254a;
            hashMap7.put(uri, new C3140h(uri, j26, i12));
        }
        if (gVar5 != null) {
            arrayList15.add(gVar5);
        }
        return new C3144l(i, str, arrayList16, j13, z9, j4, z5, i2, j5, i3, j14, j15, z3, z6, j4 != 0, drmInitData2, arrayList8, arrayList15, kVar2, hashMap7);
    }

    /* renamed from: h */
    private static String m9196h(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: i */
    private static String m9197i(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: j */
    private static String m9198j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m9200l(str2, map);
    }

    /* renamed from: k */
    private static String m9199k(String str, Pattern pattern, Map map) {
        String j = m9198j(str, pattern, (String) null, map);
        if (j != null) {
            return j;
        }
        String pattern2 = pattern.pattern();
        throw C2599az.m6821c("Couldn't match " + pattern2 + " in " + str, (Throwable) null);
    }

    /* renamed from: l */
    private static String m9200l(String str, Map map) {
        Matcher matcher = f9345Z.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: m */
    private static Pattern m9201m(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* renamed from: n */
    private static boolean m9202n(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: o */
    private static double m9203o(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    /* renamed from: p */
    private static int m9204p(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String group = matcher.group(1);
        group.getClass();
        return Integer.parseInt(group);
    }

    /* renamed from: q */
    private static long m9205q(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: androidx.media3.exoplayer.hls.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: androidx.media3.exoplayer.hls.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.media3.exoplayer.hls.a.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x031e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0321, code lost:
        r0 = null;
        r1 = 0;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0328, code lost:
        if (r1 >= r36.size()) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x032a, code lost:
        r2 = r36;
        r3 = (java.lang.String) r2.get(r1);
        r6 = m9199k(r3, f9334O, r8);
        r9 = m9199k(r3, f9333N, r8);
        r12 = new androidx.media3.common.C2679w();
        r12.f7449a = r6 + ":" + r9;
        r12.f7450b = r9;
        r12.f7458j = r7;
        r4 = m9202n(r3, f9338S);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0369, code lost:
        if (m9202n(r3, f9339T) == false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x036b, code lost:
        r4 = r4 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0373, code lost:
        if (m9202n(r3, f9337R) == false) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0375, code lost:
        r4 = r4 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0377, code lost:
        r12.f7452d = r4;
        r4 = m9198j(r3, f9335P, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0384, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0386, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0388, code lost:
        r4 = androidx.media3.common.p136b.C2612ak.m6967aq(r4, ",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0395, code lost:
        if (true == androidx.media3.common.p136b.C2612ak.m6952ab(r4, "public.accessibility.describes-video")) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0397, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0399, code lost:
        r5 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03a1, code lost:
        if (androidx.media3.common.p136b.C2612ak.m6952ab(r4, "public.accessibility.transcribes-spoken-dialog") == false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03a3, code lost:
        r5 = r5 | 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03ab, code lost:
        if (androidx.media3.common.p136b.C2612ak.m6952ab(r4, "public.accessibility.describes-music-and-sound") == false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03ad, code lost:
        r5 = r5 | 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b5, code lost:
        if (androidx.media3.common.p136b.C2612ak.m6952ab(r4, "public.easy-to-read") == false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03b7, code lost:
        r4 = r5 | 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ba, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03bb, code lost:
        r12.f7453e = r4;
        r12.f7451c = m9198j(r3, f9332M, (java.lang.String) null, r8);
        r4 = m9198j(r3, f9328I, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03cc, code lost:
        if (r4 != null) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ce, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d0, code lost:
        r4 = android.net.Uri.parse(androidx.media3.common.p136b.C2610ai.m6915a(r11, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03d8, code lost:
        r36 = r2;
        r26 = r7;
        r7 = r0;
        r15 = r1;
        r5 = new androidx.media3.common.Metadata(-9223372036854775807L, new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry(r6, r9, java.util.Collections.emptyList()));
        r2 = m9199k(r3, f9330K, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0402, code lost:
        switch(r2.hashCode()) {
            case -959297733: goto L_0x0424;
            case -333210994: goto L_0x041a;
            case 62628790: goto L_0x0410;
            case 81665115: goto L_0x0406;
            default: goto L_0x0405;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x040c, code lost:
        if (r2.equals("VIDEO") == false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x040e, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0416, code lost:
        if (r2.equals("AUDIO") == false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0418, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0420, code lost:
        if (r2.equals("CLOSED-CAPTIONS") == false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0422, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x042a, code lost:
        if (r2.equals("SUBTITLES") == false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x042c, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x042e, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x042f, code lost:
        if (r0 == 0) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0432, code lost:
        if (r0 == 1) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0434, code lost:
        if (r0 == 2) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0437, code lost:
        if (r0 == 3) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0439, code lost:
        r1 = r33;
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r0 = m9199k(r3, f9336Q, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044d, code lost:
        if (r0.startsWith("CC") == false) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x044f, code lost:
        r2 = "application/cea-608";
        r0 = java.lang.Integer.parseInt(r0.substring(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x045b, code lost:
        r2 = "application/cea-708";
        r0 = java.lang.Integer.parseInt(r0.substring(7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0466, code lost:
        if (r14 != null) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0468, code lost:
        r14 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x046d, code lost:
        r12.f7459k = r2;
        r12.f7447C = r0;
        r14.add(new androidx.media3.common.C2680x(r12));
        r0 = r7;
        r1 = r33;
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0482, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0488, code lost:
        if (r0 >= r10.size()) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048a, code lost:
        r2 = (androidx.media3.exoplayer.hls.p148a.C3146n) r10.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0496, code lost:
        if (r6.equals(r2.f9301e) == false) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0499, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x049c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x049d, code lost:
        if (r2 == null) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x049f, code lost:
        r0 = androidx.media3.common.p136b.C2612ak.m6931N(r2.f9298b.f7493k, 3);
        r12.f7456h = r0;
        r0 = androidx.media3.common.C2598ay.m6807f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04b2, code lost:
        if (r0 != null) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04b4, code lost:
        r0 = "text/vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b5, code lost:
        r12.f7459k = r0;
        r12.f7457i = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b9, code lost:
        if (r4 == null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04bb, code lost:
        r2 = r35;
        r2.add(new androidx.media3.exoplayer.hls.p148a.C3145m(r4, new androidx.media3.common.C2680x(r12), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04cb, code lost:
        r2 = r35;
        androidx.media3.common.p136b.C2633u.m7050e("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (androidx.media3.common.p136b.C2612ak.m6957ag(m9192d(r2, false, r4)) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04d4, code lost:
        r35 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d8, code lost:
        r2 = r35;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04df, code lost:
        if (r0 >= r10.size()) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04e1, code lost:
        r1 = (androidx.media3.exoplayer.hls.p148a.C3146n) r10.get(r0);
        r35 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04ef, code lost:
        if (r6.equals(r1.f9300d) == false) goto L_0x04f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04f2, code lost:
        r0 = r0 + 1;
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04f7, code lost:
        r35 = r2;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04fa, code lost:
        if (r1 == null) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r4 = r2.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04fc, code lost:
        r0 = androidx.media3.common.p136b.C2612ak.m6931N(r1.f9298b.f7493k, 1);
        r12.f7456h = r0;
        r0 = androidx.media3.common.C2598ay.m6807f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x050c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x050e, code lost:
        r3 = m9198j(r3, f9352g, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0515, code lost:
        if (r3 == null) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0517, code lost:
        r12.f7472x = java.lang.Integer.parseInt(androidx.media3.common.p136b.C2612ak.m6968ar(r3, "/")[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x052d, code lost:
        if ("audio/eac3".equals(r0) == false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0535, code lost:
        if (r3.endsWith("/JOC") == false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0537, code lost:
        r0 = "audio/eac3-joc";
        r12.f7456h = "ec+3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r4 == null) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0540, code lost:
        r12.f7459k = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0542, code lost:
        if (r4 == null) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0544, code lost:
        r12.f7457i = r5;
        r2 = r34;
        r2.add(new androidx.media3.exoplayer.hls.p148a.C3145m(r4, new androidx.media3.common.C2680x(r12), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0556, code lost:
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0558, code lost:
        if (r1 == null) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x055a, code lost:
        r0 = new androidx.media3.common.C2680x(r12);
        r1 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0562, code lost:
        r2 = r34;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x056b, code lost:
        if (r3 >= r10.size()) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x056d, code lost:
        r0 = (androidx.media3.exoplayer.hls.p148a.C3146n) r10.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r4 = r4.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0579, code lost:
        if (r6.equals(r0.f9299c) == false) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x057c, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0580, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0581, code lost:
        if (r0 == null) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0583, code lost:
        r0 = r0.f9298b;
        r1 = androidx.media3.common.p136b.C2612ak.m6931N(r0.f7493k, 2);
        r12.f7456h = r1;
        r12.f7459k = androidx.media3.common.C2598ay.m6807f(r1);
        r12.f7464p = r0.f7501s;
        r12.f7465q = r0.f7502t;
        r12.f7466r = r0.f7503u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05a0, code lost:
        if (r4 != null) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05a2, code lost:
        r1 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05a5, code lost:
        r12.f7457i = r5;
        r1 = r33;
        r1.add(new androidx.media3.exoplayer.hls.p148a.C3145m(r4, new androidx.media3.common.C2680x(r12), r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05b6, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r4.isEmpty() != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05b7, code lost:
        r33 = r1;
        r34 = r2;
        r1 = r15 + 1;
        r7 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05c7, code lost:
        r7 = r0;
        r1 = r33;
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05cc, code lost:
        if (r18 == false) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05ce, code lost:
        r19 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05d5, code lost:
        r19 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05d7, code lost:
        r10 = new androidx.media3.exoplayer.hls.p148a.C3147o(r11, r41, r13, r1, r2, r35, r17, r7, r19, r20, r8, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05eb, code lost:
        androidx.media3.common.p136b.C2612ak.m6941X(r23);
        r1 = r40;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05f2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05f3, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05f7, code lost:
        r31 = r0;
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0603, code lost:
        if (r4.startsWith("#EXT-X-TARGETDURATION") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x060b, code lost:
        if (r4.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0613, code lost:
        if (r4.startsWith("#EXTINF") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x061b, code lost:
        if (r4.startsWith("#EXT-X-KEY") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r4.startsWith(r0) == false) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0623, code lost:
        if (r4.startsWith("#EXT-X-BYTERANGE") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x062b, code lost:
        if (r4.equals("#EXT-X-DISCONTINUITY") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0633, code lost:
        if (r4.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x063b, code lost:
        if (r4.equals("#EXT-X-ENDLIST") == false) goto L_0x063e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x063e, code lost:
        r3.add(r4);
        r1 = r40;
        r2 = r23;
        r0 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x064c, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x064f, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0657, code lost:
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        r0 = m9195g(r1.f9372aa, r1.f9373ab, new androidx.media3.exoplayer.hls.p148a.C3150r(r3, r5), r41.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0664, code lost:
        androidx.media3.common.p136b.C2612ak.m6941X(r5);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0667, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0668, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x066a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.add(r4);
        r4 = new androidx.media3.exoplayer.hls.p148a.C3150r(r3, r2);
        r11 = r41.toString();
        r3 = new java.util.HashMap();
        r8 = new java.util.HashMap();
        r10 = new java.util.ArrayList();
        r14 = new java.util.ArrayList();
        r15 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r17 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r6 = new java.util.ArrayList();
        r18 = false;
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x066b, code lost:
        r1 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x066d, code lost:
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0670, code lost:
        androidx.media3.common.p136b.C2612ak.m6941X(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x067b, code lost:
        throw androidx.media3.common.C2599az.m6821c("Failed to parse the playlist, could not identify any tags.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0683, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        r7 = "application/x-mpegURL";
        r22 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r4.mo7149b() == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5 = r4.mo7148a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (r5.startsWith("#EXT") == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        r6.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r1 = r5.startsWith("#EXT-X-I-FRAME-STREAM-INF");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        if (r5.startsWith("#EXT-X-DEFINE") == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        r8.put(m9199k(r5, f9333N, r8), m9199k(r5, f9343X, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        r41 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        if (r5.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f5, code lost:
        r31 = r0;
        r2 = r3;
        r41 = r6;
        r32 = r9;
        r36 = r12;
        r35 = r13;
        r33 = r14;
        r34 = r15;
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010e, code lost:
        if (r5.startsWith("#EXT-X-MEDIA") == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0110, code lost:
        r12.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        if (r5.startsWith("#EXT-X-SESSION-KEY") == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011c, code lost:
        r1 = m9193e(r5, m9198j(r5, f9326G, "identity", r8), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0128, code lost:
        if (r1 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012a, code lost:
        r41 = r6;
        r9.add(new androidx.media3.common.DrmInitData(m9197i(m9199k(r5, f9325F, r8)), true, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0146, code lost:
        r41 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014c, code lost:
        if (r5.startsWith(r0) != false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        if (r1 == false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0150, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0152, code lost:
        r31 = r0;
        r2 = r3;
        r32 = r9;
        r36 = r12;
        r35 = r13;
        r33 = r14;
        r34 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0161, code lost:
        r18 = r18 | r5.contains("CLOSED-CAPTIONS=NONE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016a, code lost:
        if (true == r1) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016c, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016e, code lost:
        r2 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        r6 = m9191c(r5, f9351f);
        r31 = r0;
        r0 = m9204p(r5, f9346a);
        r32 = r9;
        r33 = r14;
        r9 = m9198j(r5, f9353h, (java.lang.String) null, r8);
        r34 = r15;
        r15 = m9198j(r5, f9354i, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0191, code lost:
        if (r15 == null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0193, code lost:
        r14 = androidx.media3.common.p136b.C2612ak.m6967aq(r15, "x");
        r15 = java.lang.Integer.parseInt(r14[0]);
        r14 = java.lang.Integer.parseInt(r14[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a8, code lost:
        if (r15 <= 0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01aa, code lost:
        if (r14 > 0) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        r22 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b0, code lost:
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        r35 = r13;
        r14 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b6, code lost:
        r35 = r13;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ba, code lost:
        r36 = r12;
        r13 = m9198j(r5, f9355j, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        if (r13 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c5, code lost:
        r12 = java.lang.Float.parseFloat(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        r12 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cc, code lost:
        r37 = r3;
        r22 = m9198j(r5, f9347b, (java.lang.String) null, r8);
        r38 = m9198j(r5, f9348c, (java.lang.String) null, r8);
        r39 = m9198j(r5, f9349d, (java.lang.String) null, r8);
        r13 = m9198j(r5, f9350e, (java.lang.String) null, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ed, code lost:
        if (r1 == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ef, code lost:
        r1 = android.net.Uri.parse(androidx.media3.common.p136b.C2610ai.m6915a(r11, m9199k(r5, f9328I, r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        if (r4.mo7149b() == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0204, code lost:
        r1 = android.net.Uri.parse(androidx.media3.common.p136b.C2610ai.m6915a(r11, m9200l(r4.mo7148a(), r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0214, code lost:
        r3 = new androidx.media3.common.C2679w();
        r3.f7449a = java.lang.Integer.toString(r10.size());
        r3.f7458j = r7;
        r3.f7456h = r9;
        r3.f7454f = r0;
        r3.f7455g = r6;
        r3.f7464p = r15;
        r3.f7465q = r14;
        r3.f7466r = r12;
        r3.f7453e = r2;
        r10.add(new androidx.media3.exoplayer.hls.p148a.C3146n(r1, new androidx.media3.common.C2680x(r3), r22, r38, r39, r13));
        r2 = r37;
        r3 = (java.util.ArrayList) r2.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0256, code lost:
        if (r3 != null) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0258, code lost:
        r3 = new java.util.ArrayList();
        r2.put(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0260, code lost:
        r3.add(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo(r0, r6, r22, r38, r39, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0276, code lost:
        r1 = r40;
        r6 = r41;
        r3 = r2;
        r2 = r23;
        r0 = r31;
        r9 = r32;
        r14 = r33;
        r15 = r34;
        r13 = r35;
        r12 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0294, code lost:
        throw androidx.media3.common.C2599az.m6821c("#EXT-X-STREAM-INF must be followed by another line", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0295, code lost:
        r23 = r2;
        r2 = r3;
        r41 = r6;
        r32 = r9;
        r36 = r12;
        r35 = r13;
        r33 = r14;
        r34 = r15;
        r13 = new java.util.ArrayList();
        r0 = new java.util.HashSet();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b8, code lost:
        if (r1 >= r10.size()) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02ba, code lost:
        r3 = (androidx.media3.exoplayer.hls.p148a.C3146n) r10.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c6, code lost:
        if (r0.add(r3.f9297a) == false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02cc, code lost:
        if (r3.f9298b.f7494l != null) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ce, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d0, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d1, code lost:
        androidx.media3.common.p136b.C2601a.m6832d(r6);
        r9 = (java.util.ArrayList) r2.get(r3.f9297a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02de, code lost:
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r9 = new androidx.media3.common.Metadata(-9223372036854775807L, new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry((java.lang.String) null, (java.lang.String) null, r9));
        r5 = new androidx.media3.common.C2679w(r3.f9298b);
        r5.f7457i = r9;
        r4 = new androidx.media3.common.C2680x(r5);
        r13.add(new androidx.media3.exoplayer.hls.p148a.C3146n(r3.f9297a, r4, r3.f9299c, r3.f9300d, r3.f9301e, r3.f9302f));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo6768a(android.net.Uri r41, java.io.InputStream r42) {
        /*
            r40 = this;
            r1 = r40
            java.lang.String r0 = "#EXT-X-STREAM-INF"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r4 = r42
            r3.<init>(r4)
            r2.<init>(r3)
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            int r4 = r2.read()     // Catch:{ all -> 0x0685 }
            r5 = 239(0xef, float:3.35E-43)
            if (r4 != r5) goto L_0x0036
            int r4 = r2.read()     // Catch:{ all -> 0x0685 }
            r5 = 187(0xbb, float:2.62E-43)
            if (r4 != r5) goto L_0x0032
            int r4 = r2.read()     // Catch:{ all -> 0x0685 }
            r5 = 191(0xbf, float:2.68E-43)
            if (r4 != r5) goto L_0x0032
            int r4 = r2.read()     // Catch:{ all -> 0x0685 }
            goto L_0x0036
        L_0x0032:
            r5 = r2
            r2 = 0
            goto L_0x067c
        L_0x0036:
            r5 = 1
            int r4 = m9192d(r2, r5, r4)     // Catch:{ all -> 0x0685 }
            r7 = 0
            r8 = 0
        L_0x003d:
            r9 = 7
            if (r8 >= r9) goto L_0x004f
            java.lang.String r9 = "#EXTM3U"
            char r9 = r9.charAt(r8)     // Catch:{ all -> 0x0685 }
            if (r4 != r9) goto L_0x0032
            int r4 = r2.read()     // Catch:{ all -> 0x0685 }
            int r8 = r8 + 1
            goto L_0x003d
        L_0x004f:
            int r4 = m9192d(r2, r7, r4)     // Catch:{ all -> 0x0685 }
            boolean r4 = androidx.media3.common.p136b.C2612ak.m6957ag(r4)     // Catch:{ all -> 0x0685 }
            if (r4 == 0) goto L_0x0032
        L_0x0059:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0685 }
            if (r4 == 0) goto L_0x0670
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x0685 }
            boolean r8 = r4.isEmpty()     // Catch:{ all -> 0x0685 }
            if (r8 != 0) goto L_0x0059
            boolean r8 = r4.startsWith(r0)     // Catch:{ all -> 0x0685 }
            if (r8 == 0) goto L_0x05f7
            r3.add(r4)     // Catch:{ all -> 0x05f2 }
            androidx.media3.exoplayer.hls.a.r r4 = new androidx.media3.exoplayer.hls.a.r     // Catch:{ all -> 0x05f2 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x05f2 }
            java.lang.String r11 = r41.toString()     // Catch:{ all -> 0x05f2 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x05f2 }
            r3.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x05f2 }
            r8.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r10.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r14.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r15.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r13.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r17 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r17.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r12.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r9.<init>()     // Catch:{ all -> 0x05f2 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05f2 }
            r6.<init>()     // Catch:{ all -> 0x05f2 }
            r18 = 0
            r20 = 0
        L_0x00b1:
            boolean r19 = r4.mo7149b()     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = "application/x-mpegURL"
            r22 = -1
            if (r19 == 0) goto L_0x0295
            java.lang.String r5 = r4.mo7148a()     // Catch:{ all -> 0x05f2 }
            java.lang.String r1 = "#EXT"
            boolean r1 = r5.startsWith(r1)     // Catch:{ all -> 0x05f2 }
            if (r1 == 0) goto L_0x00ca
            r6.add(r5)     // Catch:{ all -> 0x05f2 }
        L_0x00ca:
            java.lang.String r1 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r1 = r5.startsWith(r1)     // Catch:{ all -> 0x05f2 }
            r23 = r2
            java.lang.String r2 = "#EXT-X-DEFINE"
            boolean r2 = r5.startsWith(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x00ed
            java.util.regex.Pattern r1 = f9333N     // Catch:{ all -> 0x066a }
            java.lang.String r1 = m9199k(r5, r1, r8)     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r2 = f9343X     // Catch:{ all -> 0x066a }
            java.lang.String r2 = m9199k(r5, r2, r8)     // Catch:{ all -> 0x066a }
            r8.put(r1, r2)     // Catch:{ all -> 0x066a }
        L_0x00e9:
            r41 = r6
            goto L_0x0152
        L_0x00ed:
            java.lang.String r2 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x0108
            r31 = r0
            r2 = r3
            r41 = r6
            r32 = r9
            r36 = r12
            r35 = r13
            r33 = r14
            r34 = r15
            r20 = 1
            goto L_0x0276
        L_0x0108:
            java.lang.String r2 = "#EXT-X-MEDIA"
            boolean r2 = r5.startsWith(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x0114
            r12.add(r5)     // Catch:{ all -> 0x066a }
            goto L_0x00e9
        L_0x0114:
            java.lang.String r2 = "#EXT-X-SESSION-KEY"
            boolean r2 = r5.startsWith(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x0146
            java.util.regex.Pattern r1 = f9326G     // Catch:{ all -> 0x066a }
            java.lang.String r2 = "identity"
            java.lang.String r1 = m9198j(r5, r1, r2, r8)     // Catch:{ all -> 0x066a }
            androidx.media3.common.DrmInitData$SchemeData r1 = m9193e(r5, r1, r8)     // Catch:{ all -> 0x066a }
            if (r1 == 0) goto L_0x00e9
            java.util.regex.Pattern r2 = f9325F     // Catch:{ all -> 0x066a }
            java.lang.String r2 = m9199k(r5, r2, r8)     // Catch:{ all -> 0x066a }
            java.lang.String r2 = m9197i(r2)     // Catch:{ all -> 0x066a }
            androidx.media3.common.DrmInitData r5 = new androidx.media3.common.DrmInitData     // Catch:{ all -> 0x066a }
            r41 = r6
            r7 = 1
            androidx.media3.common.DrmInitData$SchemeData[] r6 = new androidx.media3.common.DrmInitData.SchemeData[r7]     // Catch:{ all -> 0x066a }
            r19 = 0
            r6[r19] = r1     // Catch:{ all -> 0x066a }
            r5.<init>(r2, r7, r6)     // Catch:{ all -> 0x066a }
            r9.add(r5)     // Catch:{ all -> 0x066a }
            goto L_0x0152
        L_0x0146:
            r41 = r6
            boolean r2 = r5.startsWith(r0)     // Catch:{ all -> 0x066a }
            if (r2 != 0) goto L_0x0161
            if (r1 == 0) goto L_0x0152
            r1 = 1
            goto L_0x0161
        L_0x0152:
            r31 = r0
            r2 = r3
            r32 = r9
            r36 = r12
            r35 = r13
            r33 = r14
            r34 = r15
            goto L_0x0276
        L_0x0161:
            java.lang.String r2 = "CLOSED-CAPTIONS=NONE"
            boolean r2 = r5.contains(r2)     // Catch:{ all -> 0x066a }
            r18 = r18 | r2
            r2 = 1
            if (r2 == r1) goto L_0x016e
            r2 = 0
            goto L_0x0170
        L_0x016e:
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x0170:
            java.util.regex.Pattern r6 = f9351f     // Catch:{ all -> 0x066a }
            int r6 = m9191c(r5, r6)     // Catch:{ all -> 0x066a }
            r31 = r0
            java.util.regex.Pattern r0 = f9346a     // Catch:{ all -> 0x066a }
            int r0 = m9204p(r5, r0)     // Catch:{ all -> 0x066a }
            r32 = r9
            java.util.regex.Pattern r9 = f9353h     // Catch:{ all -> 0x066a }
            r33 = r14
            r14 = 0
            java.lang.String r9 = m9198j(r5, r9, r14, r8)     // Catch:{ all -> 0x066a }
            r34 = r15
            java.util.regex.Pattern r15 = f9354i     // Catch:{ all -> 0x066a }
            java.lang.String r15 = m9198j(r5, r15, r14, r8)     // Catch:{ all -> 0x066a }
            if (r15 == 0) goto L_0x01b6
            java.lang.String r14 = "x"
            java.lang.String[] r14 = androidx.media3.common.p136b.C2612ak.m6967aq(r15, r14)     // Catch:{ all -> 0x066a }
            r15 = 0
            r24 = r14[r15]     // Catch:{ all -> 0x066a }
            int r15 = java.lang.Integer.parseInt(r24)     // Catch:{ all -> 0x066a }
            r19 = 1
            r14 = r14[r19]     // Catch:{ all -> 0x066a }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ all -> 0x066a }
            if (r15 <= 0) goto L_0x01b0
            if (r14 > 0) goto L_0x01ad
            goto L_0x01b0
        L_0x01ad:
            r22 = r14
            goto L_0x01b1
        L_0x01b0:
            r15 = -1
        L_0x01b1:
            r35 = r13
            r14 = r22
            goto L_0x01ba
        L_0x01b6:
            r35 = r13
            r14 = -1
            r15 = -1
        L_0x01ba:
            java.util.regex.Pattern r13 = f9355j     // Catch:{ all -> 0x066a }
            r36 = r12
            r12 = 0
            java.lang.String r13 = m9198j(r5, r13, r12, r8)     // Catch:{ all -> 0x066a }
            if (r13 == 0) goto L_0x01ca
            float r12 = java.lang.Float.parseFloat(r13)     // Catch:{ all -> 0x066a }
            goto L_0x01cc
        L_0x01ca:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x01cc:
            java.util.regex.Pattern r13 = f9347b     // Catch:{ all -> 0x066a }
            r37 = r3
            r3 = 0
            java.lang.String r13 = m9198j(r5, r13, r3, r8)     // Catch:{ all -> 0x066a }
            r22 = r13
            java.util.regex.Pattern r13 = f9348c     // Catch:{ all -> 0x066a }
            java.lang.String r13 = m9198j(r5, r13, r3, r8)     // Catch:{ all -> 0x066a }
            r38 = r13
            java.util.regex.Pattern r13 = f9349d     // Catch:{ all -> 0x066a }
            java.lang.String r13 = m9198j(r5, r13, r3, r8)     // Catch:{ all -> 0x066a }
            r39 = r13
            java.util.regex.Pattern r13 = f9350e     // Catch:{ all -> 0x066a }
            java.lang.String r13 = m9198j(r5, r13, r3, r8)     // Catch:{ all -> 0x066a }
            if (r1 == 0) goto L_0x01fe
            java.util.regex.Pattern r1 = f9328I     // Catch:{ all -> 0x066a }
            java.lang.String r1 = m9199k(r5, r1, r8)     // Catch:{ all -> 0x066a }
            java.lang.String r1 = androidx.media3.common.p136b.C2610ai.m6915a(r11, r1)     // Catch:{ all -> 0x066a }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x066a }
            goto L_0x0214
        L_0x01fe:
            boolean r1 = r4.mo7149b()     // Catch:{ all -> 0x066a }
            if (r1 == 0) goto L_0x028d
            java.lang.String r1 = r4.mo7148a()     // Catch:{ all -> 0x066a }
            java.lang.String r1 = m9200l(r1, r8)     // Catch:{ all -> 0x066a }
            java.lang.String r1 = androidx.media3.common.p136b.C2610ai.m6915a(r11, r1)     // Catch:{ all -> 0x066a }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x066a }
        L_0x0214:
            androidx.media3.common.w r3 = new androidx.media3.common.w     // Catch:{ all -> 0x066a }
            r3.<init>()     // Catch:{ all -> 0x066a }
            int r5 = r10.size()     // Catch:{ all -> 0x066a }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x066a }
            r3.f7449a = r5     // Catch:{ all -> 0x066a }
            r3.f7458j = r7     // Catch:{ all -> 0x066a }
            r3.f7456h = r9     // Catch:{ all -> 0x066a }
            r3.f7454f = r0     // Catch:{ all -> 0x066a }
            r3.f7455g = r6     // Catch:{ all -> 0x066a }
            r3.f7464p = r15     // Catch:{ all -> 0x066a }
            r3.f7465q = r14     // Catch:{ all -> 0x066a }
            r3.f7466r = r12     // Catch:{ all -> 0x066a }
            r3.f7453e = r2     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r2 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r2.<init>(r3)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.n r3 = new androidx.media3.exoplayer.hls.a.n     // Catch:{ all -> 0x066a }
            r24 = r3
            r25 = r1
            r26 = r2
            r27 = r22
            r28 = r38
            r29 = r39
            r30 = r13
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x066a }
            r10.add(r3)     // Catch:{ all -> 0x066a }
            r2 = r37
            java.lang.Object r3 = r2.get(r1)     // Catch:{ all -> 0x066a }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x066a }
            if (r3 != 0) goto L_0x0260
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x066a }
            r3.<init>()     // Catch:{ all -> 0x066a }
            r2.put(r1, r3)     // Catch:{ all -> 0x066a }
        L_0x0260:
            androidx.media3.exoplayer.hls.HlsTrackMetadataEntry$VariantInfo r1 = new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry$VariantInfo     // Catch:{ all -> 0x066a }
            r24 = r1
            r25 = r0
            r26 = r6
            r27 = r22
            r28 = r38
            r29 = r39
            r30 = r13
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x066a }
            r3.add(r1)     // Catch:{ all -> 0x066a }
        L_0x0276:
            r1 = r40
            r6 = r41
            r3 = r2
            r2 = r23
            r0 = r31
            r9 = r32
            r14 = r33
            r15 = r34
            r13 = r35
            r12 = r36
            r5 = 1
            r7 = 0
            goto L_0x00b1
        L_0x028d:
            java.lang.String r0 = "#EXT-X-STREAM-INF must be followed by another line"
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6821c(r0, r1)     // Catch:{ all -> 0x066a }
            throw r0     // Catch:{ all -> 0x066a }
        L_0x0295:
            r23 = r2
            r2 = r3
            r41 = r6
            r32 = r9
            r36 = r12
            r35 = r13
            r33 = r14
            r34 = r15
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x066a }
            r13.<init>()     // Catch:{ all -> 0x066a }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x066a }
            r0.<init>()     // Catch:{ all -> 0x066a }
            r1 = 0
        L_0x02af:
            int r3 = r10.size()     // Catch:{ all -> 0x066a }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 >= r3) goto L_0x0321
            java.lang.Object r3 = r10.get(r1)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.n r3 = (androidx.media3.exoplayer.hls.p148a.C3146n) r3     // Catch:{ all -> 0x066a }
            android.net.Uri r6 = r3.f9297a     // Catch:{ all -> 0x066a }
            boolean r6 = r0.add(r6)     // Catch:{ all -> 0x066a }
            if (r6 == 0) goto L_0x031e
            androidx.media3.common.x r6 = r3.f9298b     // Catch:{ all -> 0x066a }
            androidx.media3.common.Metadata r6 = r6.f7494l     // Catch:{ all -> 0x066a }
            if (r6 != 0) goto L_0x02d0
            r6 = 1
            goto L_0x02d1
        L_0x02d0:
            r6 = 0
        L_0x02d1:
            androidx.media3.common.p136b.C2601a.m6832d(r6)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.HlsTrackMetadataEntry r6 = new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry     // Catch:{ all -> 0x066a }
            android.net.Uri r9 = r3.f9297a     // Catch:{ all -> 0x066a }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x066a }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x066a }
            r9.getClass()
            r12 = 0
            r6.<init>(r12, r12, r9)     // Catch:{ all -> 0x066a }
            androidx.media3.common.Metadata r9 = new androidx.media3.common.Metadata     // Catch:{ all -> 0x066a }
            r12 = 1
            androidx.media3.common.Metadata$Entry[] r14 = new androidx.media3.common.Metadata.Entry[r12]     // Catch:{ all -> 0x066a }
            r12 = 0
            r14[r12] = r6     // Catch:{ all -> 0x066a }
            r9.<init>(r4, r14)     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r4 = r3.f9298b     // Catch:{ all -> 0x066a }
            androidx.media3.common.w r5 = new androidx.media3.common.w     // Catch:{ all -> 0x066a }
            r5.<init>(r4)     // Catch:{ all -> 0x066a }
            r5.f7457i = r9     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r4 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r4.<init>(r5)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.n r5 = new androidx.media3.exoplayer.hls.a.n     // Catch:{ all -> 0x066a }
            android.net.Uri r6 = r3.f9297a     // Catch:{ all -> 0x066a }
            java.lang.String r9 = r3.f9299c     // Catch:{ all -> 0x066a }
            java.lang.String r12 = r3.f9300d     // Catch:{ all -> 0x066a }
            java.lang.String r14 = r3.f9301e     // Catch:{ all -> 0x066a }
            java.lang.String r3 = r3.f9302f     // Catch:{ all -> 0x066a }
            r24 = r5
            r25 = r6
            r26 = r4
            r27 = r9
            r28 = r12
            r29 = r14
            r30 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x066a }
            r13.add(r5)     // Catch:{ all -> 0x066a }
        L_0x031e:
            int r1 = r1 + 1
            goto L_0x02af
        L_0x0321:
            r0 = 0
            r1 = 0
            r14 = 0
        L_0x0324:
            int r2 = r36.size()     // Catch:{ all -> 0x066a }
            if (r1 >= r2) goto L_0x05c7
            r2 = r36
            java.lang.Object r3 = r2.get(r1)     // Catch:{ all -> 0x066a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r6 = f9334O     // Catch:{ all -> 0x066a }
            java.lang.String r6 = m9199k(r3, r6, r8)     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r9 = f9333N     // Catch:{ all -> 0x066a }
            java.lang.String r9 = m9199k(r3, r9, r8)     // Catch:{ all -> 0x066a }
            androidx.media3.common.w r12 = new androidx.media3.common.w     // Catch:{ all -> 0x066a }
            r12.<init>()     // Catch:{ all -> 0x066a }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x066a }
            r15.<init>()     // Catch:{ all -> 0x066a }
            r15.append(r6)     // Catch:{ all -> 0x066a }
            java.lang.String r4 = ":"
            r15.append(r4)     // Catch:{ all -> 0x066a }
            r15.append(r9)     // Catch:{ all -> 0x066a }
            java.lang.String r4 = r15.toString()     // Catch:{ all -> 0x066a }
            r12.f7449a = r4     // Catch:{ all -> 0x066a }
            r12.f7450b = r9     // Catch:{ all -> 0x066a }
            r12.f7458j = r7     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r4 = f9338S     // Catch:{ all -> 0x066a }
            boolean r4 = m9202n(r3, r4)     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r5 = f9339T     // Catch:{ all -> 0x066a }
            boolean r5 = m9202n(r3, r5)     // Catch:{ all -> 0x066a }
            if (r5 == 0) goto L_0x036d
            r4 = r4 | 2
        L_0x036d:
            java.util.regex.Pattern r5 = f9337R     // Catch:{ all -> 0x066a }
            boolean r5 = m9202n(r3, r5)     // Catch:{ all -> 0x066a }
            if (r5 == 0) goto L_0x0377
            r4 = r4 | 4
        L_0x0377:
            r12.f7452d = r4     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r4 = f9335P     // Catch:{ all -> 0x066a }
            r5 = 0
            java.lang.String r4 = m9198j(r3, r4, r5, r8)     // Catch:{ all -> 0x066a }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x066a }
            if (r5 == 0) goto L_0x0388
            r4 = 0
            goto L_0x03bb
        L_0x0388:
            java.lang.String r5 = ","
            java.lang.String[] r4 = androidx.media3.common.p136b.C2612ak.m6967aq(r4, r5)     // Catch:{ all -> 0x066a }
            java.lang.String r5 = "public.accessibility.describes-video"
            boolean r5 = androidx.media3.common.p136b.C2612ak.m6952ab(r4, r5)     // Catch:{ all -> 0x066a }
            r15 = 1
            if (r15 == r5) goto L_0x0399
            r5 = 0
            goto L_0x039b
        L_0x0399:
            r5 = 512(0x200, float:7.175E-43)
        L_0x039b:
            java.lang.String r15 = "public.accessibility.transcribes-spoken-dialog"
            boolean r15 = androidx.media3.common.p136b.C2612ak.m6952ab(r4, r15)     // Catch:{ all -> 0x066a }
            if (r15 == 0) goto L_0x03a5
            r5 = r5 | 4096(0x1000, float:5.74E-42)
        L_0x03a5:
            java.lang.String r15 = "public.accessibility.describes-music-and-sound"
            boolean r15 = androidx.media3.common.p136b.C2612ak.m6952ab(r4, r15)     // Catch:{ all -> 0x066a }
            if (r15 == 0) goto L_0x03af
            r5 = r5 | 1024(0x400, float:1.435E-42)
        L_0x03af:
            java.lang.String r15 = "public.easy-to-read"
            boolean r4 = androidx.media3.common.p136b.C2612ak.m6952ab(r4, r15)     // Catch:{ all -> 0x066a }
            if (r4 == 0) goto L_0x03ba
            r4 = r5 | 8192(0x2000, float:1.14794E-41)
            goto L_0x03bb
        L_0x03ba:
            r4 = r5
        L_0x03bb:
            r12.f7453e = r4     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r4 = f9332M     // Catch:{ all -> 0x066a }
            r5 = 0
            java.lang.String r4 = m9198j(r3, r4, r5, r8)     // Catch:{ all -> 0x066a }
            r12.f7451c = r4     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r4 = f9328I     // Catch:{ all -> 0x066a }
            java.lang.String r4 = m9198j(r3, r4, r5, r8)     // Catch:{ all -> 0x066a }
            if (r4 != 0) goto L_0x03d0
            r4 = 0
            goto L_0x03d8
        L_0x03d0:
            java.lang.String r4 = androidx.media3.common.p136b.C2610ai.m6915a(r11, r4)     // Catch:{ all -> 0x066a }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x066a }
        L_0x03d8:
            androidx.media3.common.Metadata r5 = new androidx.media3.common.Metadata     // Catch:{ all -> 0x066a }
            r36 = r2
            r15 = 1
            androidx.media3.common.Metadata$Entry[] r2 = new androidx.media3.common.Metadata.Entry[r15]     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.HlsTrackMetadataEntry r15 = new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry     // Catch:{ all -> 0x066a }
            r26 = r7
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x066a }
            r15.<init>(r6, r9, r7)     // Catch:{ all -> 0x066a }
            r7 = 0
            r2[r7] = r15     // Catch:{ all -> 0x066a }
            r7 = r0
            r15 = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.<init>(r0, r2)     // Catch:{ all -> 0x066a }
            java.util.regex.Pattern r2 = f9330K     // Catch:{ all -> 0x066a }
            java.lang.String r2 = m9199k(r3, r2, r8)     // Catch:{ all -> 0x066a }
            int r24 = r2.hashCode()     // Catch:{ all -> 0x066a }
            r1 = 2
            switch(r24) {
                case -959297733: goto L_0x0424;
                case -333210994: goto L_0x041a;
                case 62628790: goto L_0x0410;
                case 81665115: goto L_0x0406;
                default: goto L_0x0405;
            }
        L_0x0405:
            goto L_0x042e
        L_0x0406:
            java.lang.String r0 = "VIDEO"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042e
            r0 = 0
            goto L_0x042f
        L_0x0410:
            java.lang.String r0 = "AUDIO"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042e
            r0 = 1
            goto L_0x042f
        L_0x041a:
            java.lang.String r0 = "CLOSED-CAPTIONS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042e
            r0 = 3
            goto L_0x042f
        L_0x0424:
            java.lang.String r0 = "SUBTITLES"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x042e
            r0 = 2
            goto L_0x042f
        L_0x042e:
            r0 = -1
        L_0x042f:
            if (r0 == 0) goto L_0x0562
            r2 = 1
            if (r0 == r2) goto L_0x04d8
            if (r0 == r1) goto L_0x0482
            r2 = 3
            if (r0 == r2) goto L_0x0441
        L_0x0439:
            r1 = r33
            r2 = r34
            r21 = 0
            goto L_0x05b6
        L_0x0441:
            java.util.regex.Pattern r0 = f9336Q     // Catch:{ all -> 0x066a }
            java.lang.String r0 = m9199k(r3, r0, r8)     // Catch:{ all -> 0x066a }
            java.lang.String r2 = "CC"
            boolean r2 = r0.startsWith(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x045b
            java.lang.String r2 = "application/cea-608"
            java.lang.String r0 = r0.substring(r1)     // Catch:{ all -> 0x066a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x066a }
            r1 = 7
            goto L_0x0466
        L_0x045b:
            java.lang.String r2 = "application/cea-708"
            r1 = 7
            java.lang.String r0 = r0.substring(r1)     // Catch:{ all -> 0x066a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x066a }
        L_0x0466:
            if (r14 != 0) goto L_0x046d
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x066a }
            r14.<init>()     // Catch:{ all -> 0x066a }
        L_0x046d:
            r12.f7459k = r2     // Catch:{ all -> 0x066a }
            r12.f7447C = r0     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r0 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r0.<init>(r12)     // Catch:{ all -> 0x066a }
            r14.add(r0)     // Catch:{ all -> 0x066a }
            r0 = r7
            r1 = r33
            r2 = r34
            r21 = 0
            goto L_0x05b7
        L_0x0482:
            r1 = 7
            r0 = 0
        L_0x0484:
            int r2 = r10.size()     // Catch:{ all -> 0x066a }
            if (r0 >= r2) goto L_0x049c
            java.lang.Object r2 = r10.get(r0)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.n r2 = (androidx.media3.exoplayer.hls.p148a.C3146n) r2     // Catch:{ all -> 0x066a }
            java.lang.String r3 = r2.f9301e     // Catch:{ all -> 0x066a }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x066a }
            if (r3 == 0) goto L_0x0499
            goto L_0x049d
        L_0x0499:
            int r0 = r0 + 1
            goto L_0x0484
        L_0x049c:
            r2 = 0
        L_0x049d:
            if (r2 == 0) goto L_0x04af
            androidx.media3.common.x r0 = r2.f9298b     // Catch:{ all -> 0x066a }
            java.lang.String r0 = r0.f7493k     // Catch:{ all -> 0x066a }
            r2 = 3
            java.lang.String r0 = androidx.media3.common.p136b.C2612ak.m6931N(r0, r2)     // Catch:{ all -> 0x066a }
            r12.f7456h = r0     // Catch:{ all -> 0x066a }
            java.lang.String r0 = androidx.media3.common.C2598ay.m6807f(r0)     // Catch:{ all -> 0x066a }
            goto L_0x04b0
        L_0x04af:
            r0 = 0
        L_0x04b0:
            java.lang.String r2 = "text/vtt"
            if (r0 != 0) goto L_0x04b5
            r0 = r2
        L_0x04b5:
            r12.f7459k = r0     // Catch:{ all -> 0x066a }
            r12.f7457i = r5     // Catch:{ all -> 0x066a }
            if (r4 == 0) goto L_0x04cb
            androidx.media3.exoplayer.hls.a.m r0 = new androidx.media3.exoplayer.hls.a.m     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r2 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r2.<init>(r12)     // Catch:{ all -> 0x066a }
            r0.<init>(r4, r2, r9)     // Catch:{ all -> 0x066a }
            r2 = r35
            r2.add(r0)     // Catch:{ all -> 0x066a }
            goto L_0x04d4
        L_0x04cb:
            r2 = r35
            java.lang.String r0 = "HlsPlaylistParser"
            java.lang.String r3 = "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"
            androidx.media3.common.p136b.C2633u.m7050e(r0, r3)     // Catch:{ all -> 0x066a }
        L_0x04d4:
            r35 = r2
            goto L_0x0439
        L_0x04d8:
            r2 = r35
            r0 = 0
        L_0x04db:
            int r1 = r10.size()     // Catch:{ all -> 0x066a }
            if (r0 >= r1) goto L_0x04f7
            java.lang.Object r1 = r10.get(r0)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.n r1 = (androidx.media3.exoplayer.hls.p148a.C3146n) r1     // Catch:{ all -> 0x066a }
            r35 = r2
            java.lang.String r2 = r1.f9300d     // Catch:{ all -> 0x066a }
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x04f2
            goto L_0x04fa
        L_0x04f2:
            int r0 = r0 + 1
            r2 = r35
            goto L_0x04db
        L_0x04f7:
            r35 = r2
            r1 = 0
        L_0x04fa:
            if (r1 == 0) goto L_0x050c
            androidx.media3.common.x r0 = r1.f9298b     // Catch:{ all -> 0x066a }
            java.lang.String r0 = r0.f7493k     // Catch:{ all -> 0x066a }
            r2 = 1
            java.lang.String r0 = androidx.media3.common.p136b.C2612ak.m6931N(r0, r2)     // Catch:{ all -> 0x066a }
            r12.f7456h = r0     // Catch:{ all -> 0x066a }
            java.lang.String r0 = androidx.media3.common.C2598ay.m6807f(r0)     // Catch:{ all -> 0x066a }
            goto L_0x050e
        L_0x050c:
            r2 = 1
            r0 = 0
        L_0x050e:
            java.util.regex.Pattern r6 = f9352g     // Catch:{ all -> 0x066a }
            r2 = 0
            java.lang.String r3 = m9198j(r3, r6, r2, r8)     // Catch:{ all -> 0x066a }
            if (r3 == 0) goto L_0x053e
            java.lang.String r2 = "/"
            java.lang.String[] r2 = androidx.media3.common.p136b.C2612ak.m6968ar(r3, r2)     // Catch:{ all -> 0x066a }
            r21 = 0
            r2 = r2[r21]     // Catch:{ all -> 0x066a }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x066a }
            r12.f7472x = r2     // Catch:{ all -> 0x066a }
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x0540
            java.lang.String r2 = "/JOC"
            boolean r2 = r3.endsWith(r2)     // Catch:{ all -> 0x066a }
            if (r2 == 0) goto L_0x0540
            java.lang.String r0 = "audio/eac3-joc"
            java.lang.String r2 = "ec+3"
            r12.f7456h = r2     // Catch:{ all -> 0x066a }
            goto L_0x0540
        L_0x053e:
            r21 = 0
        L_0x0540:
            r12.f7459k = r0     // Catch:{ all -> 0x066a }
            if (r4 == 0) goto L_0x0556
            r12.f7457i = r5     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.m r0 = new androidx.media3.exoplayer.hls.a.m     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r1 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r1.<init>(r12)     // Catch:{ all -> 0x066a }
            r0.<init>(r4, r1, r9)     // Catch:{ all -> 0x066a }
            r2 = r34
            r2.add(r0)     // Catch:{ all -> 0x066a }
            goto L_0x05a2
        L_0x0556:
            r2 = r34
            if (r1 == 0) goto L_0x05a2
            androidx.media3.common.x r0 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r0.<init>(r12)     // Catch:{ all -> 0x066a }
            r1 = r33
            goto L_0x05b7
        L_0x0562:
            r2 = r34
            r21 = 0
            r3 = 0
        L_0x0567:
            int r0 = r10.size()     // Catch:{ all -> 0x066a }
            if (r3 >= r0) goto L_0x0580
            java.lang.Object r0 = r10.get(r3)     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.n r0 = (androidx.media3.exoplayer.hls.p148a.C3146n) r0     // Catch:{ all -> 0x066a }
            java.lang.String r1 = r0.f9299c     // Catch:{ all -> 0x066a }
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x066a }
            if (r1 == 0) goto L_0x057c
            goto L_0x0581
        L_0x057c:
            int r3 = r3 + 1
            r1 = 2
            goto L_0x0567
        L_0x0580:
            r0 = 0
        L_0x0581:
            if (r0 == 0) goto L_0x05a0
            androidx.media3.common.x r0 = r0.f9298b     // Catch:{ all -> 0x066a }
            java.lang.String r1 = r0.f7493k     // Catch:{ all -> 0x066a }
            r3 = 2
            java.lang.String r1 = androidx.media3.common.p136b.C2612ak.m6931N(r1, r3)     // Catch:{ all -> 0x066a }
            r12.f7456h = r1     // Catch:{ all -> 0x066a }
            java.lang.String r1 = androidx.media3.common.C2598ay.m6807f(r1)     // Catch:{ all -> 0x066a }
            r12.f7459k = r1     // Catch:{ all -> 0x066a }
            int r1 = r0.f7501s     // Catch:{ all -> 0x066a }
            r12.f7464p = r1     // Catch:{ all -> 0x066a }
            int r1 = r0.f7502t     // Catch:{ all -> 0x066a }
            r12.f7465q = r1     // Catch:{ all -> 0x066a }
            float r0 = r0.f7503u     // Catch:{ all -> 0x066a }
            r12.f7466r = r0     // Catch:{ all -> 0x066a }
        L_0x05a0:
            if (r4 != 0) goto L_0x05a5
        L_0x05a2:
            r1 = r33
            goto L_0x05b6
        L_0x05a5:
            r12.f7457i = r5     // Catch:{ all -> 0x066a }
            androidx.media3.exoplayer.hls.a.m r0 = new androidx.media3.exoplayer.hls.a.m     // Catch:{ all -> 0x066a }
            androidx.media3.common.x r1 = new androidx.media3.common.x     // Catch:{ all -> 0x066a }
            r1.<init>(r12)     // Catch:{ all -> 0x066a }
            r0.<init>(r4, r1, r9)     // Catch:{ all -> 0x066a }
            r1 = r33
            r1.add(r0)     // Catch:{ all -> 0x066a }
        L_0x05b6:
            r0 = r7
        L_0x05b7:
            int r3 = r15 + 1
            r33 = r1
            r34 = r2
            r1 = r3
            r7 = r26
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0324
        L_0x05c7:
            r7 = r0
            r1 = r33
            r2 = r34
            if (r18 == 0) goto L_0x05d5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x066a }
            r19 = r0
            goto L_0x05d7
        L_0x05d5:
            r19 = r14
        L_0x05d7:
            androidx.media3.exoplayer.hls.a.o r0 = new androidx.media3.exoplayer.hls.a.o     // Catch:{ all -> 0x066a }
            r10 = r0
            r12 = r41
            r3 = r35
            r14 = r1
            r15 = r2
            r16 = r3
            r18 = r7
            r21 = r8
            r22 = r32
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x066a }
            androidx.media3.common.p136b.C2612ak.m6941X(r23)
            r1 = r40
            goto L_0x0667
        L_0x05f2:
            r0 = move-exception
            r1 = r40
            goto L_0x0686
        L_0x05f7:
            r31 = r0
            r23 = r2
            r21 = 0
            java.lang.String r0 = "#EXT-X-TARGETDURATION"
            boolean r0 = r4.startsWith(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r0 = r4.startsWith(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXTINF"
            boolean r0 = r4.startsWith(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXT-X-KEY"
            boolean r0 = r4.startsWith(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXT-X-BYTERANGE"
            boolean r0 = r4.startsWith(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXT-X-DISCONTINUITY"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x066a }
            if (r0 != 0) goto L_0x064c
            java.lang.String r0 = "#EXT-X-ENDLIST"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x066a }
            if (r0 == 0) goto L_0x063e
            goto L_0x064c
        L_0x063e:
            r3.add(r4)     // Catch:{ all -> 0x066a }
            r1 = r40
            r2 = r23
            r0 = r31
            r5 = 1
            r7 = 0
            r9 = 7
            goto L_0x0059
        L_0x064c:
            r3.add(r4)     // Catch:{ all -> 0x066a }
            r1 = r40
            androidx.media3.exoplayer.hls.a.o r0 = r1.f9372aa     // Catch:{ all -> 0x0668 }
            androidx.media3.exoplayer.hls.a.l r2 = r1.f9373ab     // Catch:{ all -> 0x0668 }
            androidx.media3.exoplayer.hls.a.r r4 = new androidx.media3.exoplayer.hls.a.r     // Catch:{ all -> 0x0668 }
            r5 = r23
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0683 }
            java.lang.String r3 = r41.toString()     // Catch:{ all -> 0x0683 }
            androidx.media3.exoplayer.hls.a.l r0 = m9195g(r0, r2, r4, r3)     // Catch:{ all -> 0x0683 }
            androidx.media3.common.p136b.C2612ak.m6941X(r5)
        L_0x0667:
            return r0
        L_0x0668:
            r0 = move-exception
            goto L_0x066d
        L_0x066a:
            r0 = move-exception
            r1 = r40
        L_0x066d:
            r5 = r23
            goto L_0x0687
        L_0x0670:
            r5 = r2
            androidx.media3.common.p136b.C2612ak.m6941X(r5)
            java.lang.String r0 = "Failed to parse the playlist, could not identify any tags."
            r2 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6821c(r0, r2)
            throw r0
        L_0x067c:
            java.lang.String r0 = "Input does not start with the #EXTM3U header."
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6821c(r0, r2)     // Catch:{ all -> 0x0683 }
            throw r0     // Catch:{ all -> 0x0683 }
        L_0x0683:
            r0 = move-exception
            goto L_0x0687
        L_0x0685:
            r0 = move-exception
        L_0x0686:
            r5 = r2
        L_0x0687:
            androidx.media3.common.p136b.C2612ak.m6941X(r5)
            goto L_0x068c
        L_0x068b:
            throw r0
        L_0x068c:
            goto L_0x068b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.p148a.C3151s.mo6768a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
