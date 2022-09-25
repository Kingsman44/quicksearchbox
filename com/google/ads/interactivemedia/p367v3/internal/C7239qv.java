package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodecInfo;
import android.util.Log;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qv */
/* compiled from: PG */
public final class C7239qv {

    /* renamed from: a */
    public static final /* synthetic */ int f23668a = 0;

    /* renamed from: b */
    private static final Pattern f23669b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap f23670c = new HashMap();

    /* renamed from: d */
    private static int f23671d = -1;

    /* renamed from: a */
    public static C7224qg m21657a() {
        return m21662f("audio/raw");
    }

    /* renamed from: b */
    public static synchronized List m21658b(String str, boolean z, boolean z2) {
        C7235qr qrVar;
        int i;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        synchronized (C7239qv.class) {
            C7233qp qpVar = new C7233qp(str2, z3, z4);
            HashMap hashMap = f23670c;
            List list = (List) hashMap.get(qpVar);
            if (list != null) {
                return list;
            }
            if (aeu.f20466a >= 21) {
                qrVar = new C7237qt(z3, z4);
            } else {
                qrVar = new C7236qs((byte[]) null);
            }
            ArrayList g = m21663g(qpVar, qrVar);
            if (z3 && g.isEmpty() && (i = aeu.f20466a) >= 21 && i <= 23) {
                g = m21663g(qpVar, new C7236qs((byte[]) null));
                if (!g.isEmpty()) {
                    String str3 = ((C7224qg) g.get(0)).f23577a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + str3.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str2);
                    sb.append(". Assuming: ");
                    sb.append(str3);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str2)) {
                if (aeu.f20466a < 26 && aeu.f20467b.equals("R9") && g.size() == 1 && ((C7224qg) g.get(0)).f23577a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    g.add(C7224qg.m21560a("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                m21665i(g, C7230qm.f23660a);
            }
            if (aeu.f20466a < 21 && g.size() > 1) {
                String str4 = ((C7224qg) g.get(0)).f23577a;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    m21665i(g, C7231qn.f23661a);
                }
            }
            if (aeu.f20466a < 30 && g.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C7224qg) g.get(0)).f23577a)) {
                g.add((C7224qg) g.remove(0));
            }
            List unmodifiableList = Collections.unmodifiableList(g);
            hashMap.put(qpVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: c */
    public static List m21659c(List list, C6864cy cyVar) {
        ArrayList arrayList = new ArrayList(list);
        m21665i(arrayList, new C7229ql(cyVar));
        return arrayList;
    }

    /* renamed from: d */
    public static int m21660d() {
        int i;
        int i2 = f23671d;
        if (i2 == -1) {
            C7224qg f = m21662f("video/avc");
            if (f != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f.mo16307b()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 != 1 && i4 != 2) {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = C89885b.TASK_GRAPH_VALUE;
                                break;
                            case 2048:
                            case 4096:
                                i = C89885b.NOW_VALUE;
                                break;
                            case 8192:
                                i = C89885b.USER_ADVOCATE_VALUE;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, aeu.f20466a >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            f23671d = i2;
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x038a, code lost:
        r0 = r0.f21809i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x038d, code lost:
        if (r1.length >= 4) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x038f, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0399, code lost:
        if (r0.length() == 0) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x039b, code lost:
        r0 = "Ignoring malformed HEVC codec string: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03a0, code lost:
        r0 = new java.lang.String("Ignoring malformed HEVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03a5, code lost:
        android.util.Log.w("MediaCodecUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03a8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03ab, code lost:
        r2 = f23669b.matcher(r1[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03b7, code lost:
        if (r2.matches() != false) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03b9, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03c3, code lost:
        if (r0.length() == 0) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03c5, code lost:
        r0 = "Ignoring malformed HEVC codec string: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03ca, code lost:
        r0 = new java.lang.String("Ignoring malformed HEVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03cf, code lost:
        android.util.Log.w("MediaCodecUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03d3, code lost:
        r0 = r2.group(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03dd, code lost:
        if ("1".equals(r0) == false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03df, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03e7, code lost:
        if ("2".equals(r0) == false) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03e9, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03ea, code lost:
        r1 = r1[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03ec, code lost:
        if (r1 != null) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03ee, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03f5, code lost:
        switch(r1.hashCode()) {
            case 70821: goto L_0x053c;
            case 70914: goto L_0x052d;
            case 70917: goto L_0x0520;
            case 71007: goto L_0x0511;
            case 71010: goto L_0x0504;
            case 74665: goto L_0x04f7;
            case 74758: goto L_0x04ea;
            case 74761: goto L_0x04dd;
            case 74851: goto L_0x04cf;
            case 74854: goto L_0x04c1;
            case 2193639: goto L_0x04b3;
            case 2193642: goto L_0x04a5;
            case 2193732: goto L_0x0497;
            case 2193735: goto L_0x048b;
            case 2193738: goto L_0x047f;
            case 2193825: goto L_0x0473;
            case 2193828: goto L_0x0467;
            case 2193831: goto L_0x045b;
            case 2312803: goto L_0x044f;
            case 2312806: goto L_0x0441;
            case 2312896: goto L_0x0435;
            case 2312899: goto L_0x0429;
            case 2312902: goto L_0x041d;
            case 2312989: goto L_0x0411;
            case 2312992: goto L_0x0405;
            case 2312995: goto L_0x03f9;
            default: goto L_0x03f8;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03ff, code lost:
        if (r1.equals("L186") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0401, code lost:
        r2 = 16777216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x040b, code lost:
        if (r1.equals("L183") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x040d, code lost:
        r2 = 4194304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0417, code lost:
        if (r1.equals("L180") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0419, code lost:
        r2 = 1048576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0423, code lost:
        if (r1.equals("L156") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0425, code lost:
        r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.HTTP_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x042f, code lost:
        if (r1.equals("L153") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0431, code lost:
        r2 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x043b, code lost:
        if (r1.equals("L150") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x043d, code lost:
        r2 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0447, code lost:
        if (r1.equals("L123") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0449, code lost:
        r2 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0455, code lost:
        if (r1.equals("L120") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0457, code lost:
        r2 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0461, code lost:
        if (r1.equals("H186") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0463, code lost:
        r2 = 33554432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x046d, code lost:
        if (r1.equals("H183") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x046f, code lost:
        r2 = 8388608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0479, code lost:
        if (r1.equals("H180") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x047b, code lost:
        r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.NOW_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0485, code lost:
        if (r1.equals("H156") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0487, code lost:
        r2 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0491, code lost:
        if (r1.equals("H153") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0493, code lost:
        r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.S3REQUEST_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x049d, code lost:
        if (r1.equals("H150") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x049f, code lost:
        r2 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04ab, code lost:
        if (r1.equals("H123") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04ad, code lost:
        r2 = 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04b9, code lost:
        if (r1.equals("H120") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04bb, code lost:
        r2 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04c7, code lost:
        if (r1.equals("L93") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04c9, code lost:
        r2 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04d5, code lost:
        if (r1.equals("L90") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04d7, code lost:
        r2 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04e3, code lost:
        if (r1.equals("L63") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x04e5, code lost:
        r2 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04f0, code lost:
        if (r1.equals("L60") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x04f2, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04fd, code lost:
        if (r1.equals("L30") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x04ff, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x050a, code lost:
        if (r1.equals("H93") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x050c, code lost:
        r2 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0517, code lost:
        if (r1.equals("H90") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0519, code lost:
        r2 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0526, code lost:
        if (r1.equals("H63") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0528, code lost:
        r2 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0533, code lost:
        if (r1.equals("H60") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0535, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0537, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0542, code lost:
        if (r1.equals("H30") == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0544, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0548, code lost:
        if (r2 != null) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x054a, code lost:
        r0 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0554, code lost:
        if (r0.length() == 0) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0556, code lost:
        r0 = "Unknown HEVC level string: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x055b, code lost:
        r0 = new java.lang.String("Unknown HEVC level string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0560, code lost:
        android.util.Log.w("MediaCodecUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0570, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x057a, code lost:
        if (r0.length() == 0) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x057c, code lost:
        r0 = "Unknown HEVC profile string: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0581, code lost:
        r0 = new java.lang.String("Unknown HEVC profile string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0586, code lost:
        android.util.Log.w("MediaCodecUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05a1, code lost:
        r0 = r0.f21809i;
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05a6, code lost:
        if (r2 >= 2) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05a8, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x05b0, code lost:
        if (r0.length() == 0) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05b2, code lost:
        r0 = "Ignoring malformed AVC codec string: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05b7, code lost:
        r0 = new java.lang.String("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05bc, code lost:
        android.util.Log.w("MediaCodecUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x05c9, code lost:
        if (r1[1].length() != 6) goto L_0x05e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05cb, code lost:
        r2 = java.lang.Integer.parseInt(r1[1].substring(0, 2), 16);
        r0 = java.lang.Integer.parseInt(r1[1].substring(4), 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05e0, code lost:
        if (r2 < 3) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x05e2, code lost:
        r2 = java.lang.Integer.parseInt(r1[1]);
        r0 = java.lang.Integer.parseInt(r1[2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x05f0, code lost:
        if (r2 == 66) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05f4, code lost:
        if (r2 == 77) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x05f8, code lost:
        if (r2 == 88) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x05fc, code lost:
        if (r2 == 100) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0600, code lost:
        if (r2 == 110) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0604, code lost:
        if (r2 == 122) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0608, code lost:
        if (r2 == 244) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x060a, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x060c, code lost:
        r13 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x060f, code lost:
        r13 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0612, code lost:
        r13 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0615, code lost:
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0618, code lost:
        r13 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x061a, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x061b, code lost:
        if (r13 != -1) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x061d, code lost:
        r0 = new java.lang.StringBuilder(32);
        r0.append("Unknown AVC profile: ");
        r0.append(r2);
        android.util.Log.w("MediaCodecUtil", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0632, code lost:
        switch(r0) {
            case 10: goto L_0x0670;
            case 11: goto L_0x066e;
            case 12: goto L_0x066b;
            case 13: goto L_0x0668;
            default: goto L_0x0635;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0635, code lost:
        switch(r0) {
            case 20: goto L_0x0665;
            case 21: goto L_0x0662;
            case 22: goto L_0x065f;
            default: goto L_0x0638;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0638, code lost:
        switch(r0) {
            case 30: goto L_0x065c;
            case 31: goto L_0x0659;
            case 32: goto L_0x0656;
            default: goto L_0x063b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x063b, code lost:
        switch(r0) {
            case 40: goto L_0x0653;
            case 41: goto L_0x0650;
            case 42: goto L_0x064d;
            default: goto L_0x063e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x063e, code lost:
        switch(r0) {
            case 50: goto L_0x064a;
            case 51: goto L_0x0646;
            case 52: goto L_0x0643;
            default: goto L_0x0641;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0641, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0643, code lost:
        r4 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0646, code lost:
        r4 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x064a, code lost:
        r4 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x064d, code lost:
        r4 = 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0650, code lost:
        r4 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0653, code lost:
        r4 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0656, code lost:
        r4 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0659, code lost:
        r4 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x065c, code lost:
        r4 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x065f, code lost:
        r4 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0662, code lost:
        r4 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0665, code lost:
        r4 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0668, code lost:
        r4 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x066b, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x066e, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0670, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0671, code lost:
        if (r4 != -1) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0673, code lost:
        r1 = new java.lang.StringBuilder(30);
        r1.append("Unknown AVC level: ");
        r1.append(r0);
        android.util.Log.w("MediaCodecUtil", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:?, code lost:
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x069f, code lost:
        if (r1.length() == 0) goto L_0x06a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x06a1, code lost:
        r1 = "Ignoring malformed AVC codec string: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x06a6, code lost:
        r1 = new java.lang.String("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x06ab, code lost:
        android.util.Log.w("MediaCodecUtil", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x06b0, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x06b9, code lost:
        if (r0.length() != 0) goto L_0x06bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x06bb, code lost:
        r0 = "Ignoring malformed AVC codec string: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x06c0, code lost:
        r0 = new java.lang.String("Ignoring malformed AVC codec string: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x06c5, code lost:
        android.util.Log.w("MediaCodecUtil", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        return new android.util.Pair(java.lang.Integer.valueOf(r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:?, code lost:
        return new android.util.Pair(java.lang.Integer.valueOf(r13), java.lang.Integer.valueOf(r4));
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair m21661e(com.google.ads.interactivemedia.p367v3.internal.C6864cy r22) {
        /*
            r0 = r22
            java.lang.String r1 = r0.f21809i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r0.f21812l
            boolean r3 = r3.equals(r4)
            r4 = 512(0x200, float:7.175E-43)
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = 64
            r8 = 3
            r9 = 8
            r10 = 32
            r11 = 16
            r12 = 4
            r13 = 2
            r14 = 1
            java.lang.String r15 = "MediaCodecUtil"
            if (r3 == 0) goto L_0x01cc
            java.lang.String r0 = r0.f21809i
            int r3 = r1.length
            if (r3 >= r8) goto L_0x004c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Ignoring malformed Dolby Vision codec string: "
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0047
        L_0x0042:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0047:
            android.util.Log.w(r15, r0)
            goto L_0x01cb
        L_0x004c:
            java.util.regex.Pattern r3 = f23669b
            r8 = r1[r14]
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r8 = r3.matches()
            if (r8 != 0) goto L_0x0075
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Ignoring malformed Dolby Vision codec string: "
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0070
        L_0x006b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0070:
            android.util.Log.w(r15, r0)
            goto L_0x01cb
        L_0x0075:
            java.lang.String r0 = r3.group(r14)
            if (r0 != 0) goto L_0x007e
        L_0x007b:
            r3 = r2
            goto L_0x0109
        L_0x007e:
            int r3 = r0.hashCode()
            switch(r3) {
                case 1536: goto L_0x00fd;
                case 1537: goto L_0x00f0;
                case 1538: goto L_0x00e3;
                case 1539: goto L_0x00d6;
                case 1540: goto L_0x00c9;
                case 1541: goto L_0x00bc;
                case 1542: goto L_0x00af;
                case 1543: goto L_0x00a2;
                case 1544: goto L_0x0094;
                case 1545: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x007b
        L_0x0086:
            java.lang.String r3 = "09"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            goto L_0x0109
        L_0x0094:
            java.lang.String r3 = "08"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto L_0x0109
        L_0x00a2:
            java.lang.String r3 = "07"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L_0x0109
        L_0x00af:
            java.lang.String r3 = "06"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L_0x0109
        L_0x00bc:
            java.lang.String r3 = "05"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            goto L_0x0109
        L_0x00c9:
            java.lang.String r3 = "04"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            goto L_0x0109
        L_0x00d6:
            java.lang.String r3 = "03"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L_0x0109
        L_0x00e3:
            java.lang.String r3 = "02"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x0109
        L_0x00f0:
            java.lang.String r3 = "01"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            goto L_0x0109
        L_0x00fd:
            java.lang.String r3 = "00"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x007b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
        L_0x0109:
            if (r3 != 0) goto L_0x0126
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Unknown Dolby Vision profile string: "
            if (r1 == 0) goto L_0x011c
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0121
        L_0x011c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0121:
            android.util.Log.w(r15, r0)
            goto L_0x01cb
        L_0x0126:
            r0 = r1[r13]
            if (r0 != 0) goto L_0x012d
        L_0x012a:
            r1 = r2
            goto L_0x01aa
        L_0x012d:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x019e;
                case 1538: goto L_0x0191;
                case 1539: goto L_0x0184;
                case 1540: goto L_0x0177;
                case 1541: goto L_0x016a;
                case 1542: goto L_0x015d;
                case 1543: goto L_0x0150;
                case 1544: goto L_0x0143;
                case 1545: goto L_0x0135;
                default: goto L_0x0134;
            }
        L_0x0134:
            goto L_0x012a
        L_0x0135:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x01aa
        L_0x0143:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L_0x01aa
        L_0x0150:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x01aa
        L_0x015d:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x01aa
        L_0x016a:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x01aa
        L_0x0177:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x01aa
        L_0x0184:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x01aa
        L_0x0191:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x01aa
        L_0x019e:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x012a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
        L_0x01aa:
            if (r1 != 0) goto L_0x01c6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Unknown Dolby Vision level string: "
            if (r1 == 0) goto L_0x01bd
            java.lang.String r0 = r3.concat(r0)
            goto L_0x01c2
        L_0x01bd:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x01c2:
            android.util.Log.w(r15, r0)
            goto L_0x01cb
        L_0x01c6:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r3, r1)
        L_0x01cb:
            return r2
        L_0x01cc:
            r3 = 0
            r2 = r1[r3]
            int r16 = r2.hashCode()
            r17 = 32768(0x8000, float:4.5918E-41)
            r9 = 30
            r18 = 8192(0x2000, float:1.14794E-41)
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 4096(0x1000, float:5.74E-42)
            r6 = -1
            switch(r16) {
                case 3004662: goto L_0x06cb;
                case 3006243: goto L_0x0597;
                case 3006244: goto L_0x058c;
                case 3199032: goto L_0x0380;
                case 3214780: goto L_0x0377;
                case 3356560: goto L_0x02d1;
                case 3624515: goto L_0x01e5;
                default: goto L_0x01e2;
            }
        L_0x01e2:
            r0 = 0
            goto L_0x07e5
        L_0x01e5:
            java.lang.String r3 = "vp09"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e2
            java.lang.String r0 = r0.f21809i
            int r2 = r1.length
            if (r2 >= r8) goto L_0x020e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed VP9 codec string: "
            if (r1 == 0) goto L_0x0203
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0208
        L_0x0203:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0208:
            android.util.Log.w(r15, r0)
        L_0x020b:
            r2 = 0
            goto L_0x02d0
        L_0x020e:
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x02b4 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x02b4 }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x02b4 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02b4 }
            if (r2 == 0) goto L_0x022b
            if (r2 == r14) goto L_0x0229
            if (r2 == r13) goto L_0x0227
            if (r2 == r8) goto L_0x0224
            r1 = -1
            goto L_0x022c
        L_0x0224:
            r1 = 8
            goto L_0x022c
        L_0x0227:
            r1 = 4
            goto L_0x022c
        L_0x0229:
            r1 = 2
            goto L_0x022c
        L_0x022b:
            r1 = 1
        L_0x022c:
            if (r1 != r6) goto L_0x0243
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r15, r0)
            goto L_0x020b
        L_0x0243:
            r2 = 10
            if (r0 == r2) goto L_0x028d
            r2 = 11
            if (r0 == r2) goto L_0x028b
            r2 = 20
            if (r0 == r2) goto L_0x0289
            r2 = 21
            if (r0 == r2) goto L_0x0286
            if (r0 == r9) goto L_0x0283
            r2 = 31
            if (r0 == r2) goto L_0x0280
            r2 = 40
            if (r0 == r2) goto L_0x027d
            r2 = 41
            if (r0 == r2) goto L_0x027a
            r2 = 50
            if (r0 == r2) goto L_0x0277
            r2 = 51
            if (r0 == r2) goto L_0x028e
            switch(r0) {
                case 60: goto L_0x0274;
                case 61: goto L_0x0271;
                case 62: goto L_0x026e;
                default: goto L_0x026c;
            }
        L_0x026c:
            r4 = -1
            goto L_0x028e
        L_0x026e:
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x028e
        L_0x0271:
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x028e
        L_0x0274:
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x028e
        L_0x0277:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x028e
        L_0x027a:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x028e
        L_0x027d:
            r4 = 64
            goto L_0x028e
        L_0x0280:
            r4 = 32
            goto L_0x028e
        L_0x0283:
            r4 = 16
            goto L_0x028e
        L_0x0286:
            r4 = 8
            goto L_0x028e
        L_0x0289:
            r4 = 4
            goto L_0x028e
        L_0x028b:
            r4 = 2
            goto L_0x028e
        L_0x028d:
            r4 = 1
        L_0x028e:
            if (r4 != r6) goto L_0x02a6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.lang.String r2 = "Unknown VP9 level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r15, r0)
            goto L_0x020b
        L_0x02a6:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.<init>(r0, r1)
            goto L_0x02d0
        L_0x02b4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed VP9 codec string: "
            if (r1 == 0) goto L_0x02c6
            java.lang.String r0 = r2.concat(r0)
            goto L_0x02cb
        L_0x02c6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x02cb:
            android.util.Log.w(r15, r0)
            goto L_0x020b
        L_0x02d0:
            return r2
        L_0x02d1:
            java.lang.String r4 = "mp4a"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01e2
            java.lang.String r0 = r0.f21809i
            int r2 = r1.length
            if (r2 == r8) goto L_0x02fa
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed MP4A codec string: "
            if (r1 == 0) goto L_0x02ef
            java.lang.String r0 = r2.concat(r0)
            goto L_0x02f4
        L_0x02ef:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x02f4:
            android.util.Log.w(r15, r0)
        L_0x02f7:
            r2 = 0
            goto L_0x0376
        L_0x02fa:
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x035b }
            int r2 = java.lang.Integer.parseInt(r2, r11)     // Catch:{ NumberFormatException -> 0x035b }
            java.lang.String r4 = "audio/mp4a-latm"
            java.lang.String r2 = com.google.ads.interactivemedia.p367v3.internal.adz.m18357i(r2)     // Catch:{ NumberFormatException -> 0x035b }
            boolean r2 = r4.equals(r2)     // Catch:{ NumberFormatException -> 0x035b }
            if (r2 == 0) goto L_0x02f7
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x035b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x035b }
            r2 = 17
            if (r1 == r2) goto L_0x0348
            r2 = 20
            if (r1 == r2) goto L_0x0345
            r2 = 23
            if (r1 == r2) goto L_0x0342
            r2 = 29
            if (r1 == r2) goto L_0x033f
            r2 = 39
            if (r1 == r2) goto L_0x033c
            r2 = 42
            if (r1 == r2) goto L_0x0339
            switch(r1) {
                case 1: goto L_0x0337;
                case 2: goto L_0x0335;
                case 3: goto L_0x034a;
                case 4: goto L_0x0333;
                case 5: goto L_0x0331;
                case 6: goto L_0x032f;
                default: goto L_0x032d;
            }     // Catch:{ NumberFormatException -> 0x035b }
        L_0x032d:
            r8 = -1
            goto L_0x034a
        L_0x032f:
            r8 = 6
            goto L_0x034a
        L_0x0331:
            r8 = 5
            goto L_0x034a
        L_0x0333:
            r8 = 4
            goto L_0x034a
        L_0x0335:
            r8 = 2
            goto L_0x034a
        L_0x0337:
            r8 = 1
            goto L_0x034a
        L_0x0339:
            r8 = 42
            goto L_0x034a
        L_0x033c:
            r8 = 39
            goto L_0x034a
        L_0x033f:
            r8 = 29
            goto L_0x034a
        L_0x0342:
            r8 = 23
            goto L_0x034a
        L_0x0345:
            r8 = 20
            goto L_0x034a
        L_0x0348:
            r8 = 17
        L_0x034a:
            if (r8 == r6) goto L_0x02f7
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x035b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x035b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x035b }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x035b }
            r2 = r1
            goto L_0x0376
        L_0x035b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed MP4A codec string: "
            if (r1 == 0) goto L_0x036d
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0372
        L_0x036d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0372:
            android.util.Log.w(r15, r0)
            goto L_0x02f7
        L_0x0376:
            return r2
        L_0x0377:
            java.lang.String r3 = "hvc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e2
            goto L_0x038a
        L_0x0380:
            java.lang.String r3 = "hev1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x038a
            goto L_0x01e2
        L_0x038a:
            java.lang.String r0 = r0.f21809i
            int r2 = r1.length
            if (r2 >= r12) goto L_0x03ab
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            if (r1 == 0) goto L_0x03a0
            java.lang.String r0 = r2.concat(r0)
            goto L_0x03a5
        L_0x03a0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x03a5:
            android.util.Log.w(r15, r0)
        L_0x03a8:
            r2 = 0
            goto L_0x058b
        L_0x03ab:
            java.util.regex.Pattern r2 = f23669b
            r3 = r1[r14]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x03d3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            if (r1 == 0) goto L_0x03ca
            java.lang.String r0 = r2.concat(r0)
            goto L_0x03cf
        L_0x03ca:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x03cf:
            android.util.Log.w(r15, r0)
            goto L_0x03a8
        L_0x03d3:
            java.lang.String r0 = r2.group(r14)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x03e1
            r0 = 1
            goto L_0x03ea
        L_0x03e1:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0570
            r0 = 2
        L_0x03ea:
            r1 = r1[r8]
            if (r1 != 0) goto L_0x03f1
        L_0x03ee:
            r2 = 0
            goto L_0x0548
        L_0x03f1:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x053c;
                case 70914: goto L_0x052d;
                case 70917: goto L_0x0520;
                case 71007: goto L_0x0511;
                case 71010: goto L_0x0504;
                case 74665: goto L_0x04f7;
                case 74758: goto L_0x04ea;
                case 74761: goto L_0x04dd;
                case 74851: goto L_0x04cf;
                case 74854: goto L_0x04c1;
                case 2193639: goto L_0x04b3;
                case 2193642: goto L_0x04a5;
                case 2193732: goto L_0x0497;
                case 2193735: goto L_0x048b;
                case 2193738: goto L_0x047f;
                case 2193825: goto L_0x0473;
                case 2193828: goto L_0x0467;
                case 2193831: goto L_0x045b;
                case 2312803: goto L_0x044f;
                case 2312806: goto L_0x0441;
                case 2312896: goto L_0x0435;
                case 2312899: goto L_0x0429;
                case 2312902: goto L_0x041d;
                case 2312989: goto L_0x0411;
                case 2312992: goto L_0x0405;
                case 2312995: goto L_0x03f9;
                default: goto L_0x03f8;
            }
        L_0x03f8:
            goto L_0x03ee
        L_0x03f9:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x0537
        L_0x0405:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0537
        L_0x0411:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0537
        L_0x041d:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0537
        L_0x0429:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0537
        L_0x0435:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0537
        L_0x0441:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            goto L_0x0548
        L_0x044f:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x0537
        L_0x045b:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0537
        L_0x0467:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0537
        L_0x0473:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0537
        L_0x047f:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0537
        L_0x048b:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0537
        L_0x0497:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            goto L_0x0548
        L_0x04a5:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            goto L_0x0548
        L_0x04b3:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            goto L_0x0548
        L_0x04c1:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0548
        L_0x04cf:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0548
        L_0x04dd:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x0548
        L_0x04ea:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x0548
        L_0x04f7:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x0548
        L_0x0504:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x0548
        L_0x0511:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r16 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x0548
        L_0x0520:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x0548
        L_0x052d:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            r2 = 8
        L_0x0537:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0548
        L_0x053c:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x03ee
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x0548:
            if (r2 != 0) goto L_0x0565
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r1 = r0.length()
            java.lang.String r2 = "Unknown HEVC level string: "
            if (r1 == 0) goto L_0x055b
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0560
        L_0x055b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0560:
            android.util.Log.w(r15, r0)
            goto L_0x03a8
        L_0x0565:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r2 = r1
            goto L_0x058b
        L_0x0570:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Unknown HEVC profile string: "
            if (r1 == 0) goto L_0x0581
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0586
        L_0x0581:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0586:
            android.util.Log.w(r15, r0)
            goto L_0x03a8
        L_0x058b:
            return r2
        L_0x058c:
            r16 = 128(0x80, float:1.794E-43)
            java.lang.String r4 = "avc2"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01e2
            goto L_0x05a1
        L_0x0597:
            r16 = 128(0x80, float:1.794E-43)
            java.lang.String r4 = "avc1"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01e2
        L_0x05a1:
            java.lang.String r0 = r0.f21809i
            int r2 = r1.length
            java.lang.String r4 = "Ignoring malformed AVC codec string: "
            if (r2 >= r13) goto L_0x05c2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x05b7
            java.lang.String r0 = r4.concat(r0)
            goto L_0x05bc
        L_0x05b7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x05bc:
            android.util.Log.w(r15, r0)
        L_0x05bf:
            r2 = 0
            goto L_0x06ca
        L_0x05c2:
            r21 = r1[r14]     // Catch:{ NumberFormatException -> 0x06b0 }
            int r5 = r21.length()     // Catch:{ NumberFormatException -> 0x06b0 }
            r7 = 6
            if (r5 != r7) goto L_0x05e0
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x06b0 }
            java.lang.String r2 = r2.substring(r3, r13)     // Catch:{ NumberFormatException -> 0x06b0 }
            int r2 = java.lang.Integer.parseInt(r2, r11)     // Catch:{ NumberFormatException -> 0x06b0 }
            r1 = r1[r14]     // Catch:{ NumberFormatException -> 0x06b0 }
            java.lang.String r1 = r1.substring(r12)     // Catch:{ NumberFormatException -> 0x06b0 }
            int r0 = java.lang.Integer.parseInt(r1, r11)     // Catch:{ NumberFormatException -> 0x06b0 }
            goto L_0x05ee
        L_0x05e0:
            if (r2 < r8) goto L_0x0697
            r2 = r1[r14]     // Catch:{ NumberFormatException -> 0x06b0 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x06b0 }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x06b0 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x06b0 }
        L_0x05ee:
            r1 = 66
            if (r2 == r1) goto L_0x061a
            r1 = 77
            if (r2 == r1) goto L_0x061b
            r1 = 88
            if (r2 == r1) goto L_0x0618
            r1 = 100
            if (r2 == r1) goto L_0x0615
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x0612
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x060f
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x060c
            r13 = -1
            goto L_0x061b
        L_0x060c:
            r13 = 64
            goto L_0x061b
        L_0x060f:
            r13 = 32
            goto L_0x061b
        L_0x0612:
            r13 = 16
            goto L_0x061b
        L_0x0615:
            r13 = 8
            goto L_0x061b
        L_0x0618:
            r13 = 4
            goto L_0x061b
        L_0x061a:
            r13 = 1
        L_0x061b:
            if (r13 != r6) goto L_0x0632
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            java.lang.String r1 = "Unknown AVC profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r15, r0)
            goto L_0x05bf
        L_0x0632:
            switch(r0) {
                case 10: goto L_0x0670;
                case 11: goto L_0x066e;
                case 12: goto L_0x066b;
                case 13: goto L_0x0668;
                default: goto L_0x0635;
            }
        L_0x0635:
            switch(r0) {
                case 20: goto L_0x0665;
                case 21: goto L_0x0662;
                case 22: goto L_0x065f;
                default: goto L_0x0638;
            }
        L_0x0638:
            switch(r0) {
                case 30: goto L_0x065c;
                case 31: goto L_0x0659;
                case 32: goto L_0x0656;
                default: goto L_0x063b;
            }
        L_0x063b:
            switch(r0) {
                case 40: goto L_0x0653;
                case 41: goto L_0x0650;
                case 42: goto L_0x064d;
                default: goto L_0x063e;
            }
        L_0x063e:
            switch(r0) {
                case 50: goto L_0x064a;
                case 51: goto L_0x0646;
                case 52: goto L_0x0643;
                default: goto L_0x0641;
            }
        L_0x0641:
            r4 = -1
            goto L_0x0671
        L_0x0643:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0671
        L_0x0646:
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0671
        L_0x064a:
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0671
        L_0x064d:
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0671
        L_0x0650:
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x0671
        L_0x0653:
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0671
        L_0x0656:
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x0671
        L_0x0659:
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x0671
        L_0x065c:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0671
        L_0x065f:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x0671
        L_0x0662:
            r4 = 64
            goto L_0x0671
        L_0x0665:
            r4 = 32
            goto L_0x0671
        L_0x0668:
            r4 = 16
            goto L_0x0671
        L_0x066b:
            r4 = 8
            goto L_0x0671
        L_0x066e:
            r4 = 4
            goto L_0x0671
        L_0x0670:
            r4 = 1
        L_0x0671:
            if (r4 != r6) goto L_0x0689
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.lang.String r2 = "Unknown AVC level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r15, r0)
            goto L_0x05bf
        L_0x0689:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.<init>(r0, r1)
            goto L_0x06ca
        L_0x0697:
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x06b0 }
            int r2 = r1.length()     // Catch:{ NumberFormatException -> 0x06b0 }
            if (r2 == 0) goto L_0x06a6
            java.lang.String r1 = r4.concat(r1)     // Catch:{ NumberFormatException -> 0x06b0 }
            goto L_0x06ab
        L_0x06a6:
            java.lang.String r1 = new java.lang.String     // Catch:{ NumberFormatException -> 0x06b0 }
            r1.<init>(r4)     // Catch:{ NumberFormatException -> 0x06b0 }
        L_0x06ab:
            android.util.Log.w(r15, r1)     // Catch:{ NumberFormatException -> 0x06b0 }
            goto L_0x05bf
        L_0x06b0:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x06c0
            java.lang.String r0 = r4.concat(r0)
            goto L_0x06c5
        L_0x06c0:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x06c5:
            android.util.Log.w(r15, r0)
            goto L_0x05bf
        L_0x06ca:
            return r2
        L_0x06cb:
            r16 = 128(0x80, float:1.794E-43)
            java.lang.String r4 = "av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01e2
            java.lang.String r2 = r0.f21809i
            com.google.ads.interactivemedia.v3.internal.aex r0 = r0.f21824x
            int r4 = r1.length
            if (r4 >= r12) goto L_0x06f8
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed AV1 codec string: "
            if (r1 == 0) goto L_0x06ed
            java.lang.String r0 = r2.concat(r0)
            goto L_0x06f2
        L_0x06ed:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x06f2:
            android.util.Log.w(r15, r0)
        L_0x06f5:
            r2 = 0
            goto L_0x07e4
        L_0x06f8:
            r4 = r1[r14]     // Catch:{ NumberFormatException -> 0x07c8 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x07c8 }
            r5 = r1[r13]     // Catch:{ NumberFormatException -> 0x07c8 }
            java.lang.String r3 = r5.substring(r3, r13)     // Catch:{ NumberFormatException -> 0x07c8 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x07c8 }
            r1 = r1[r8]     // Catch:{ NumberFormatException -> 0x07c8 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x07c8 }
            if (r4 == 0) goto L_0x0725
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r15, r0)
            goto L_0x06f5
        L_0x0725:
            r2 = 8
            if (r1 == r2) goto L_0x0757
            r4 = 10
            if (r1 == r4) goto L_0x0744
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 34
            r0.<init>(r2)
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r15, r0)
            goto L_0x06f5
        L_0x0744:
            if (r0 == 0) goto L_0x0755
            byte[] r1 = r0.f20488d
            if (r1 != 0) goto L_0x0752
            int r0 = r0.f20487c
            r1 = 7
            if (r0 == r1) goto L_0x0752
            r1 = 6
            if (r0 != r1) goto L_0x0755
        L_0x0752:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0758
        L_0x0755:
            r0 = 2
            goto L_0x0758
        L_0x0757:
            r0 = 1
        L_0x0758:
            switch(r3) {
                case 0: goto L_0x07a1;
                case 1: goto L_0x079f;
                case 2: goto L_0x079d;
                case 3: goto L_0x079a;
                case 4: goto L_0x0797;
                case 5: goto L_0x0794;
                case 6: goto L_0x0791;
                case 7: goto L_0x078e;
                case 8: goto L_0x078b;
                case 9: goto L_0x0788;
                case 10: goto L_0x0785;
                case 11: goto L_0x0782;
                case 12: goto L_0x077f;
                case 13: goto L_0x077c;
                case 14: goto L_0x0779;
                case 15: goto L_0x0775;
                case 16: goto L_0x0772;
                case 17: goto L_0x076f;
                case 18: goto L_0x076c;
                case 19: goto L_0x0769;
                case 20: goto L_0x0766;
                case 21: goto L_0x0763;
                case 22: goto L_0x0760;
                case 23: goto L_0x075d;
                default: goto L_0x075b;
            }
        L_0x075b:
            r4 = -1
            goto L_0x07a2
        L_0x075d:
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x07a2
        L_0x0760:
            r4 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x07a2
        L_0x0763:
            r4 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x07a2
        L_0x0766:
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x07a2
        L_0x0769:
            r4 = 524288(0x80000, float:7.34684E-40)
            goto L_0x07a2
        L_0x076c:
            r4 = 262144(0x40000, float:3.67342E-40)
            goto L_0x07a2
        L_0x076f:
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x07a2
        L_0x0772:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x07a2
        L_0x0775:
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L_0x07a2
        L_0x0779:
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07a2
        L_0x077c:
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07a2
        L_0x077f:
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x07a2
        L_0x0782:
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x07a2
        L_0x0785:
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x07a2
        L_0x0788:
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x07a2
        L_0x078b:
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x07a2
        L_0x078e:
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x07a2
        L_0x0791:
            r4 = 64
            goto L_0x07a2
        L_0x0794:
            r4 = 32
            goto L_0x07a2
        L_0x0797:
            r4 = 16
            goto L_0x07a2
        L_0x079a:
            r4 = 8
            goto L_0x07a2
        L_0x079d:
            r4 = 4
            goto L_0x07a2
        L_0x079f:
            r4 = 2
            goto L_0x07a2
        L_0x07a1:
            r4 = 1
        L_0x07a2:
            if (r4 != r6) goto L_0x07ba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            java.lang.String r1 = "Unknown AV1 level: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r15, r0)
            goto L_0x06f5
        L_0x07ba:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2.<init>(r0, r1)
            goto L_0x07e4
        L_0x07c8:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            java.lang.String r2 = "Ignoring malformed AV1 codec string: "
            if (r1 == 0) goto L_0x07da
            java.lang.String r0 = r2.concat(r0)
            goto L_0x07df
        L_0x07da:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x07df:
            android.util.Log.w(r15, r0)
            goto L_0x06f5
        L_0x07e4:
            return r2
        L_0x07e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7239qv.m21661e(com.google.ads.interactivemedia.v3.internal.cy):android.util.Pair");
    }

    /* renamed from: f */
    public static C7224qg m21662f(String str) {
        List b = m21658b(str, false, false);
        if (b.isEmpty()) {
            return null;
        }
        return (C7224qg) b.get(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d0, code lost:
        if ("SCV31".equals(com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0218, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b.startsWith("t0") != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0178, code lost:
        if ("OMX.Exynos.AAC.Decoder".equals(r12) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x039e A[SYNTHETIC, Splitter:B:228:0x039e] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03ca A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList m21663g(com.google.ads.interactivemedia.p367v3.internal.C7233qp r24, com.google.ads.interactivemedia.p367v3.internal.C7235qr r25) {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0408 }
            r5.<init>()     // Catch:{ Exception -> 0x0408 }
            java.lang.String r15 = r1.f23663a     // Catch:{ Exception -> 0x0408 }
            int r14 = r25.mo16334a()     // Catch:{ Exception -> 0x0408 }
            boolean r16 = r25.mo16336c()     // Catch:{ Exception -> 0x0408 }
            r17 = 0
            r13 = 0
        L_0x001a:
            if (r13 >= r14) goto L_0x0407
            android.media.MediaCodecInfo r0 = r2.mo16335b(r13)     // Catch:{ Exception -> 0x0408 }
            int r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            r7 = 29
            if (r6 < r7) goto L_0x0032
            boolean r6 = r0.isAlias()     // Catch:{ Exception -> 0x0408 }
            if (r6 == 0) goto L_0x0032
        L_0x002c:
            r22 = r13
            r23 = r14
            goto L_0x03ff
        L_0x0032:
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x0408 }
            boolean r6 = r0.isEncoder()     // Catch:{ Exception -> 0x0408 }
            if (r6 != 0) goto L_0x002c
            java.lang.String r6 = ".secure"
            if (r16 != 0) goto L_0x0046
            boolean r8 = r12.endsWith(r6)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x0046:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            r9 = 21
            if (r8 >= r9) goto L_0x007c
            java.lang.String r8 = "CIPAACDecoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "CIPMP3Decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "CIPVorbisDecoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "CIPAMRNBDecoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "AACDecoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "MP3Decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x007c:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            r9 = 18
            if (r8 >= r9) goto L_0x00a8
            java.lang.String r8 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x00a8
            java.lang.String r8 = "a70"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "Xiaomi"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20468c     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x00a8
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r9 = "HM"
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x00a8:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            r9 = 16
            if (r8 != r9) goto L_0x012e
            java.lang.String r8 = "OMX.qcom.audio.decoder.mp3"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x012e
            java.lang.String r8 = "dlxu"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "protou"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "ville"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "villeplus"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "villec2"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r10 = "gee"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C6602"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C6603"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C6606"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C6616"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "L36h"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "SO-02E"
            java.lang.String r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x012e:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            if (r8 != r9) goto L_0x0162
            java.lang.String r8 = "OMX.qcom.audio.decoder.aac"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x0162
            java.lang.String r8 = "C1504"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C1505"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C1604"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "C1605"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x0162:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            r9 = 24
            java.lang.String r10 = "samsung"
            if (r8 >= r9) goto L_0x01d2
            java.lang.String r8 = "OMX.SEC.aac.dec"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x017a
            java.lang.String r8 = "OMX.Exynos.AAC.Decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x01d2
        L_0x017a:
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20468c     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r10.equals(r8)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x01d2
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r9 = "zeroflte"
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r9 = "zerolte"
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r9 = "zenlte"
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "SC-05G"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "marinelteatt"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "404SC"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "SC-04G"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = "SCV31"
            java.lang.String r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x01d2:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            java.lang.String r9 = "jflte"
            r11 = 19
            if (r8 > r11) goto L_0x021a
            java.lang.String r8 = "OMX.SEC.vp8.dec"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x021a
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20468c     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r10.equals(r8)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x021a
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r10 = "d2"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r10 = "serrano"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r10 = "santos"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            java.lang.String r10 = "t0"
            boolean r8 = r8.startsWith(r10)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x021a:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            if (r8 > r11) goto L_0x022e
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ Exception -> 0x0408 }
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x022e
            java.lang.String r8 = "OMX.qcom.video.decoder.vp8"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x022e:
            java.lang.String r8 = "audio/eac3-joc"
            boolean r8 = r8.equals(r15)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x023e
            java.lang.String r8 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x002c
        L_0x023e:
            java.lang.String[] r8 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x0408 }
            int r9 = r8.length     // Catch:{ Exception -> 0x0408 }
            r10 = 0
        L_0x0244:
            if (r10 >= r9) goto L_0x0252
            r11 = r8[r10]     // Catch:{ Exception -> 0x0408 }
            boolean r18 = r11.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x0408 }
            if (r18 == 0) goto L_0x024f
            goto L_0x029e
        L_0x024f:
            int r10 = r10 + 1
            goto L_0x0244
        L_0x0252:
            java.lang.String r8 = "video/dolby-vision"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0408 }
            r11 = 0
            if (r8 == 0) goto L_0x0279
            java.lang.String r8 = "OMX.MS.HEVCDV.Decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x0266
            java.lang.String r11 = "video/hevcdv"
            goto L_0x029e
        L_0x0266:
            java.lang.String r8 = "OMX.RTK.video.decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 != 0) goto L_0x0276
            java.lang.String r8 = "OMX.realtek.video.decoder.tunneled"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x029e
        L_0x0276:
            java.lang.String r11 = "video/dv_hevc"
            goto L_0x029e
        L_0x0279:
            java.lang.String r8 = "audio/alac"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x028c
            java.lang.String r8 = "OMX.lge.alac.decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x028c
            java.lang.String r11 = "audio/x-lg-alac"
            goto L_0x029e
        L_0x028c:
            java.lang.String r8 = "audio/flac"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x029e
            java.lang.String r8 = "OMX.lge.flac.decoder"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x0408 }
            if (r8 == 0) goto L_0x029e
            java.lang.String r11 = "audio/x-lg-flac"
        L_0x029e:
            if (r11 == 0) goto L_0x002c
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r11)     // Catch:{ Exception -> 0x038d }
            boolean r8 = r2.mo16337d(r4, r11, r9)     // Catch:{ Exception -> 0x038d }
            boolean r10 = r2.mo16338e(r4, r9)     // Catch:{ Exception -> 0x038d }
            boolean r7 = r1.f23665c     // Catch:{ Exception -> 0x038d }
            if (r7 != 0) goto L_0x02b3
            if (r10 != 0) goto L_0x002c
            goto L_0x02b7
        L_0x02b3:
            if (r8 != 0) goto L_0x02b7
            goto L_0x002c
        L_0x02b7:
            boolean r7 = r2.mo16337d(r3, r11, r9)     // Catch:{ Exception -> 0x038d }
            boolean r8 = r2.mo16338e(r3, r9)     // Catch:{ Exception -> 0x038d }
            boolean r10 = r1.f23664b     // Catch:{ Exception -> 0x038d }
            r19 = 1
            if (r10 != 0) goto L_0x02c8
            if (r8 != 0) goto L_0x002c
            goto L_0x02cb
        L_0x02c8:
            if (r7 == 0) goto L_0x002c
            r7 = 1
        L_0x02cb:
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x038d }
            r10 = 29
            if (r8 < r10) goto L_0x02d7
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x038d }
            r10 = r8
            goto L_0x02e0
        L_0x02d7:
            boolean r8 = m21664h(r0)     // Catch:{ Exception -> 0x038d }
            if (r8 != 0) goto L_0x02df
            r10 = 1
            goto L_0x02e0
        L_0x02df:
            r10 = 0
        L_0x02e0:
            boolean r20 = m21664h(r0)     // Catch:{ Exception -> 0x038d }
            int r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x038d }
            r2 = 29
            if (r8 < r2) goto L_0x02ef
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x038d }
            goto L_0x0312
        L_0x02ef:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x038d }
            java.lang.String r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18485C(r0)     // Catch:{ Exception -> 0x038d }
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x038d }
            if (r2 != 0) goto L_0x0311
            java.lang.String r2 = "c2.android."
            boolean r2 = r0.startsWith(r2)     // Catch:{ Exception -> 0x038d }
            if (r2 != 0) goto L_0x0311
            java.lang.String r2 = "c2.google."
            boolean r0 = r0.startsWith(r2)     // Catch:{ Exception -> 0x038d }
            if (r0 != 0) goto L_0x0311
            r0 = 1
            goto L_0x0312
        L_0x0311:
            r0 = 0
        L_0x0312:
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x038d }
            r8 = 22
            if (r2 > r8) goto L_0x033d
            java.lang.String r2 = "ODROID-XU3"
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x038d }
            boolean r2 = r2.equals(r8)     // Catch:{ Exception -> 0x038d }
            if (r2 != 0) goto L_0x032c
            java.lang.String r2 = "Nexus 10"
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ Exception -> 0x038d }
            boolean r2 = r2.equals(r8)     // Catch:{ Exception -> 0x038d }
            if (r2 == 0) goto L_0x033d
        L_0x032c:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r12)     // Catch:{ Exception -> 0x038d }
            if (r2 != 0) goto L_0x033f
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r12)     // Catch:{ Exception -> 0x038d }
            if (r2 == 0) goto L_0x033d
            goto L_0x033f
        L_0x033d:
            r19 = 0
        L_0x033f:
            if (r16 == 0) goto L_0x0345
            boolean r2 = r1.f23664b     // Catch:{ Exception -> 0x038d }
            if (r2 == r7) goto L_0x034b
        L_0x0345:
            if (r16 != 0) goto L_0x0368
            boolean r2 = r1.f23664b     // Catch:{ Exception -> 0x038d }
            if (r2 != 0) goto L_0x0368
        L_0x034b:
            r2 = 0
            r6 = r12
            r7 = r15
            r8 = r11
            r18 = r11
            r11 = r20
            r21 = r12
            r12 = r0
            r22 = r13
            r13 = r19
            r23 = r14
            r14 = r2
            com.google.ads.interactivemedia.v3.internal.qg r0 = com.google.ads.interactivemedia.p367v3.internal.C7224qg.m21560a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0366 }
            r5.add(r0)     // Catch:{ Exception -> 0x0366 }
            goto L_0x03ff
        L_0x0366:
            r0 = move-exception
            goto L_0x0396
        L_0x0368:
            r18 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            if (r16 != 0) goto L_0x03ff
            if (r7 == 0) goto L_0x03ff
            java.lang.String r2 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x0366 }
            java.lang.String r6 = r2.concat(r6)     // Catch:{ Exception -> 0x0366 }
            r14 = 1
            r7 = r15
            r8 = r18
            r11 = r20
            r12 = r0
            r13 = r19
            com.google.ads.interactivemedia.v3.internal.qg r0 = com.google.ads.interactivemedia.p367v3.internal.C7224qg.m21560a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0366 }
            r5.add(r0)     // Catch:{ Exception -> 0x0366 }
            return r5
        L_0x038d:
            r0 = move-exception
            r18 = r11
            r21 = r12
            r22 = r13
            r23 = r14
        L_0x0396:
            int r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ Exception -> 0x0408 }
            r6 = 23
            java.lang.String r7 = "MediaCodecUtil"
            if (r2 > r6) goto L_0x03ca
            boolean r2 = r5.isEmpty()     // Catch:{ Exception -> 0x0408 }
            if (r2 != 0) goto L_0x03ca
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x0408 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0408 }
            int r0 = r0 + 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0408 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r0 = "Skipping codec "
            r2.append(r0)     // Catch:{ Exception -> 0x0408 }
            r6 = r21
            r2.append(r6)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r0 = " (failed to query capabilities)"
            r2.append(r0)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0408 }
            android.util.Log.e(r7, r0)     // Catch:{ Exception -> 0x0408 }
            goto L_0x03ff
        L_0x03ca:
            r6 = r21
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0408 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0408 }
            int r1 = r1 + 25
            int r2 = r18.length()     // Catch:{ Exception -> 0x0408 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0408 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x0408 }
            r2.append(r6)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0408 }
            r11 = r18
            r2.append(r11)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0408 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0408 }
            android.util.Log.e(r7, r1)     // Catch:{ Exception -> 0x0408 }
            throw r0     // Catch:{ Exception -> 0x0408 }
        L_0x03ff:
            int r13 = r22 + 1
            r2 = r25
            r14 = r23
            goto L_0x001a
        L_0x0407:
            return r5
        L_0x0408:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.qq r1 = new com.google.ads.interactivemedia.v3.internal.qq
            r1.<init>(r0)
            goto L_0x0410
        L_0x040f:
            throw r1
        L_0x0410:
            goto L_0x040f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7239qv.m21663g(com.google.ads.interactivemedia.v3.internal.qp, com.google.ads.interactivemedia.v3.internal.qr):java.util.ArrayList");
    }

    /* renamed from: h */
    private static boolean m21664h(MediaCodecInfo mediaCodecInfo) {
        if (aeu.f20466a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String C = aeu.m18485C(mediaCodecInfo.getName());
        if (C.startsWith("arc.")) {
            return false;
        }
        if (C.startsWith("omx.google.") || C.startsWith("omx.ffmpeg.") || ((C.startsWith("omx.sec.") && C.contains(".sw.")) || C.equals("omx.qcom.video.decoder.hevcswvdec") || C.startsWith("c2.android.") || C.startsWith("c2.google.") || (!C.startsWith("omx.") && !C.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static void m21665i(List list, C7238qu quVar) {
        Collections.sort(list, new C7232qo(quVar));
    }
}
