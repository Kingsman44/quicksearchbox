package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aff */
/* compiled from: PG */
public final class aff extends C7226qi {

    /* renamed from: c */
    private static final int[] f20511c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: d */
    private static boolean f20512d;

    /* renamed from: e */
    private static boolean f20513e;

    /* renamed from: A */
    private int f20514A;

    /* renamed from: B */
    private int f20515B;

    /* renamed from: C */
    private long f20516C;

    /* renamed from: D */
    private long f20517D;

    /* renamed from: E */
    private int f20518E;

    /* renamed from: F */
    private int f20519F;

    /* renamed from: G */
    private int f20520G;

    /* renamed from: H */
    private int f20521H;

    /* renamed from: I */
    private float f20522I;

    /* renamed from: J */
    private float f20523J;

    /* renamed from: K */
    private int f20524K;

    /* renamed from: L */
    private int f20525L;

    /* renamed from: M */
    private int f20526M;

    /* renamed from: N */
    private float f20527N;

    /* renamed from: O */
    private boolean f20528O;

    /* renamed from: P */
    private int f20529P;

    /* renamed from: Q */
    private afg f20530Q;

    /* renamed from: b */
    afe f20531b;

    /* renamed from: f */
    private final Context f20532f;

    /* renamed from: g */
    private final afj f20533g;

    /* renamed from: h */
    private final aft f20534h;

    /* renamed from: i */
    private final long f20535i = 5000;

    /* renamed from: j */
    private final int f20536j = 50;

    /* renamed from: k */
    private final boolean f20537k;

    /* renamed from: l */
    private afd f20538l;

    /* renamed from: m */
    private boolean f20539m;

    /* renamed from: n */
    private boolean f20540n;

    /* renamed from: o */
    private Surface f20541o;

    /* renamed from: p */
    private float f20542p;

    /* renamed from: q */
    private Surface f20543q;

    /* renamed from: r */
    private boolean f20544r;

    /* renamed from: s */
    private int f20545s;

    /* renamed from: t */
    private boolean f20546t;

    /* renamed from: u */
    private boolean f20547u;

    /* renamed from: v */
    private boolean f20548v;

    /* renamed from: w */
    private long f20549w;

    /* renamed from: x */
    private long f20550x;

    /* renamed from: y */
    private long f20551y;

    /* renamed from: z */
    private int f20552z;

    public aff(Context context, C7228qk qkVar, Handler handler, afu afu) {
        super(2, qkVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f20532f = applicationContext;
        this.f20533g = new afj(applicationContext);
        this.f20534h = new aft(handler, afu);
        this.f20537k = "NVIDIA".equals(aeu.f20468c);
        this.f20550x = -9223372036854775807L;
        this.f20519F = -1;
        this.f20520G = -1;
        this.f20522I = -1.0f;
        this.f20545s = 1;
        m18582aR();
    }

    /* renamed from: aC */
    protected static int m18570aC(C7224qg qgVar, C6864cy cyVar) {
        if (cyVar.f21813m == -1) {
            return m18587aW(qgVar, cyVar.f21812l, cyVar.f21817q, cyVar.f21818r);
        }
        int size = cyVar.f21814n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) cyVar.f21814n.get(i2)).length;
        }
        return cyVar.f21813m + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b9, code lost:
        if (r1.equals("TB3-730F") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c3, code lost:
        if (r1.equals("A7020a48") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cd, code lost:
        if (r1.equals("A7010a48") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d7, code lost:
        if (r1.equals("griffin") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e1, code lost:
        if (r1.equals("marino_f") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01eb, code lost:
        if (r1.equals("CPY83_I00") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f5, code lost:
        if (r1.equals("A2016a40") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ff, code lost:
        if (r1.equals("le_x6") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0209, code lost:
        if (r1.equals("l5460") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0213, code lost:
        if (r1.equals("i9031") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021d, code lost:
        if (r1.equals("X3_HK") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0227, code lost:
        if (r1.equals("V23GB") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0231, code lost:
        if (r1.equals("Q4310") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x023b, code lost:
        if (r1.equals("Q4260") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0245, code lost:
        if (r1.equals("PRO7S") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x024f, code lost:
        if (r1.equals("F3311") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0259, code lost:
        if (r1.equals("F3215") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0263, code lost:
        if (r1.equals("F3213") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x026d, code lost:
        if (r1.equals("F3211") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0277, code lost:
        if (r1.equals("F3116") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r1.equals("machuca") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0281, code lost:
        if (r1.equals("F3113") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x028b, code lost:
        if (r1.equals("F3111") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0295, code lost:
        if (r1.equals("E5643") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x029f, code lost:
        if (r1.equals("A1601") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02a9, code lost:
        if (r1.equals("Aura_Note_2") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02b3, code lost:
        if (r1.equals("602LV") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02bd, code lost:
        if (r1.equals("601LV") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02c7, code lost:
        if (r1.equals("MEIZU_M5") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d1, code lost:
        if (r1.equals("p212") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02db, code lost:
        if (r1.equals("mido") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r1.equals("magnolia") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02e5, code lost:
        if (r1.equals("kate") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ef, code lost:
        if (r1.equals("fugu") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f9, code lost:
        if (r1.equals("XE2X") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0303, code lost:
        if (r1.equals("Q427") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x030d, code lost:
        if (r1.equals("Q350") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0317, code lost:
        if (r1.equals("P681") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0321, code lost:
        if (r1.equals("F04J") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x032b, code lost:
        if (r1.equals("F04H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0335, code lost:
        if (r1.equals("F03H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x033f, code lost:
        if (r1.equals("F02H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r1.equals("dangalUHD") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0349, code lost:
        if (r1.equals("F01J") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0353, code lost:
        if (r1.equals("F01H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x035d, code lost:
        if (r1.equals("1714") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0367, code lost:
        if (r1.equals("1713") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0371, code lost:
        if (r1.equals("1601") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x037b, code lost:
        if (r1.equals("flo") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0385, code lost:
        if (r1.equals("deb") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x038f, code lost:
        if (r1.equals("cv3") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0399, code lost:
        if (r1.equals("cv1") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a3, code lost:
        if (r1.equals("Z80") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1.equals("dangalFHD") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03ad, code lost:
        if (r1.equals("QX1") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03b7, code lost:
        if (r1.equals("PLE") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03c1, code lost:
        if (r1.equals("P85") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03cb, code lost:
        if (r1.equals("MX6") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03d5, code lost:
        if (r1.equals("M5c") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03df, code lost:
        if (r1.equals("M04") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03e9, code lost:
        if (r1.equals("JGZ") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03f3, code lost:
        if (r1.equals("mh") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03fd, code lost:
        if (r1.equals("b5") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0407, code lost:
        if (r1.equals("V5") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r1.equals("dangal") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0411, code lost:
        if (r1.equals("V1") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x041b, code lost:
        if (r1.equals("Q5") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0425, code lost:
        if (r1.equals("C1") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x042f, code lost:
        if (r1.equals("woods_fn") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0439, code lost:
        if (r1.equals("ELUGA_A3_Pro") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0443, code lost:
        if (r1.equals("Z12_PRO") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x044d, code lost:
        if (r1.equals("BLACK-1X") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0457, code lost:
        if (r1.equals("taido_row") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0461, code lost:
        if (r1.equals("Pixi4-7_3G") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x046b, code lost:
        if (r1.equals("GIONEE_GBL7360") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0475, code lost:
        if (r1.equals("GiONEE_CBL7513") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x047f, code lost:
        if (r1.equals("OnePlus5T") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0489, code lost:
        if (r1.equals("whyred") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0493, code lost:
        if (r1.equals("watson") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x049d, code lost:
        if (r1.equals("SVP-DTV15") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04a7, code lost:
        if (r1.equals("A7000-a") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04b1, code lost:
        if (r1.equals("nicklaus_f") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04bb, code lost:
        if (r1.equals("tcl_eu") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04c5, code lost:
        if (r1.equals("ELUGA_Ray_X") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04cf, code lost:
        if (r1.equals("s905x018") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04d9, code lost:
        if (r1.equals("A10-70L") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04e3, code lost:
        if (r1.equals("A10-70F") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04ed, code lost:
        if (r1.equals("namath") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04f7, code lost:
        if (r1.equals("Slate_Pro") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0501, code lost:
        if (r1.equals("iris60") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x050b, code lost:
        if (r1.equals("BRAVIA_ATV2") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0515, code lost:
        if (r1.equals("GiONEE_GBL7319") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x051f, code lost:
        if (r1.equals("panell_dt") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0529, code lost:
        if (r1.equals("panell_ds") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0533, code lost:
        if (r1.equals("panell_dl") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x053d, code lost:
        if (r1.equals("vernee_M5") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0547, code lost:
        if (r1.equals("pacificrim") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0551, code lost:
        if (r1.equals("Phantom6") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x055b, code lost:
        if (r1.equals("ComioS1") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0565, code lost:
        if (r1.equals("XT1663") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x056f, code lost:
        if (r1.equals("RAIJIN") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0579, code lost:
        if (r1.equals("AquaPowerM") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0583, code lost:
        if (r1.equals("PGN611") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x058d, code lost:
        if (r1.equals("PGN610") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0597, code lost:
        if (r1.equals("PGN528") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x05a1, code lost:
        if (r1.equals("NX573J") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05ab, code lost:
        if (r1.equals("NX541J") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05b5, code lost:
        if (r1.equals("CP8676_I02") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05bf, code lost:
        if (r1.equals("K50a40") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05c9, code lost:
        if (r1.equals("GIONEE_SWW1631") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05d3, code lost:
        if (r1.equals("GIONEE_SWW1627") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05dd, code lost:
        if (r1.equals("GIONEE_SWW1609") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r1.equals("HWWAS-H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        if (r1.equals("HWVNS-H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r1.equals("ELUGA_Prim") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r1.equals("ELUGA_Note") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        if (r1.equals("ASUS_X00AD_2") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (r1.equals("HWCAM-H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r1.equals("HWBLN-H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b8, code lost:
        if (r1.equals("DM-01K") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r1.equals("Infinix-X572") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d3, code lost:
        if (r1.equals("PB2-670M") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        if (r1.equals("santoni") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        if (r1.equals("iball8735_9806") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f1, code lost:
        if (r1.equals("CPH1715") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fb, code lost:
        if (r1.equals("CPH1609") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        if (r1.equals("woods_f") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010f, code lost:
        if (r1.equals("htc_e56ml_dtul") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        if (r1.equals("EverStar_S") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        if (r1.equals("hwALE-H") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012d, code lost:
        if (r1.equals("itel_S41") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0137, code lost:
        if (r1.equals("LS-5017") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0141, code lost:
        if (r1.equals("panell_d") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014b, code lost:
        if (r1.equals("j2xlteins") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0155, code lost:
        if (r1.equals("A7000plus") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015f, code lost:
        if (r1.equals("manning") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0169, code lost:
        if (r1.equals("GIONEE_WBL7519") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0173, code lost:
        if (r1.equals("GIONEE_WBL7365") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017d, code lost:
        if (r1.equals("GIONEE_WBL5708") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0187, code lost:
        if (r1.equals("QM16XE_U") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0191, code lost:
        if (r1.equals("Pixi5-10_4G") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019b, code lost:
        if (r1.equals("TB3-850M") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a5, code lost:
        if (r1.equals("TB3-850F") != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01af, code lost:
        if (r1.equals("TB3-730X") != false) goto L_0x004e;
     */
    /* renamed from: aF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m18573aF(java.lang.String r5) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r5 = r5.startsWith(r0)
            r0 = 0
            if (r5 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.aff> r5 = com.google.ads.interactivemedia.p367v3.internal.aff.class
            monitor-enter(r5)
            boolean r1 = f20512d     // Catch:{ all -> 0x061d }
            if (r1 != 0) goto L_0x0619
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ all -> 0x061d }
            r2 = 28
            r3 = 1
            if (r1 > r2) goto L_0x0051
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ all -> 0x061d }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x061d }
            switch(r2) {
                case -1339091551: goto L_0x0046;
                case -1220081023: goto L_0x003d;
                case -1220066608: goto L_0x0034;
                case -64886864: goto L_0x002b;
                case 825323514: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0051
        L_0x0022:
            java.lang.String r2 = "machuca"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0051
            goto L_0x004e
        L_0x002b:
            java.lang.String r2 = "magnolia"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0051
            goto L_0x004e
        L_0x0034:
            java.lang.String r2 = "dangalUHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0051
            goto L_0x004e
        L_0x003d:
            java.lang.String r2 = "dangalFHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0051
            goto L_0x004e
        L_0x0046:
            java.lang.String r2 = "dangal"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0051
        L_0x004e:
            r0 = 1
            goto L_0x0615
        L_0x0051:
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ all -> 0x061d }
            r2 = 27
            if (r1 > r2) goto L_0x0062
            java.lang.String r1 = "HWEML"
            java.lang.String r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ all -> 0x061d }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x061d }
            if (r1 == 0) goto L_0x0062
            goto L_0x004e
        L_0x0062:
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a     // Catch:{ all -> 0x061d }
            r2 = 26
            if (r1 > r2) goto L_0x0615
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20467b     // Catch:{ all -> 0x061d }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x061d }
            switch(r2) {
                case -2144781245: goto L_0x05d7;
                case -2144781185: goto L_0x05cd;
                case -2144781160: goto L_0x05c3;
                case -2097309513: goto L_0x05b9;
                case -2022874474: goto L_0x05af;
                case -1978993182: goto L_0x05a5;
                case -1978990237: goto L_0x059b;
                case -1936688988: goto L_0x0591;
                case -1936688066: goto L_0x0587;
                case -1936688065: goto L_0x057d;
                case -1931988508: goto L_0x0573;
                case -1885099851: goto L_0x0569;
                case -1696512866: goto L_0x055f;
                case -1680025915: goto L_0x0555;
                case -1615810839: goto L_0x054b;
                case -1600724499: goto L_0x0541;
                case -1554255044: goto L_0x0537;
                case -1481772737: goto L_0x052d;
                case -1481772730: goto L_0x0523;
                case -1481772729: goto L_0x0519;
                case -1320080169: goto L_0x050f;
                case -1217592143: goto L_0x0505;
                case -1180384755: goto L_0x04fb;
                case -1139198265: goto L_0x04f1;
                case -1052835013: goto L_0x04e7;
                case -993250464: goto L_0x04dd;
                case -993250458: goto L_0x04d3;
                case -965403638: goto L_0x04c9;
                case -958336948: goto L_0x04bf;
                case -879245230: goto L_0x04b5;
                case -842500323: goto L_0x04ab;
                case -821392978: goto L_0x04a1;
                case -797483286: goto L_0x0497;
                case -794946968: goto L_0x048d;
                case -788334647: goto L_0x0483;
                case -782144577: goto L_0x0479;
                case -575125681: goto L_0x046f;
                case -521118391: goto L_0x0465;
                case -430914369: goto L_0x045b;
                case -290434366: goto L_0x0451;
                case -282781963: goto L_0x0447;
                case -277133239: goto L_0x043d;
                case -173639913: goto L_0x0433;
                case -56598463: goto L_0x0429;
                case 2126: goto L_0x041f;
                case 2564: goto L_0x0415;
                case 2715: goto L_0x040b;
                case 2719: goto L_0x0401;
                case 3091: goto L_0x03f7;
                case 3483: goto L_0x03ed;
                case 73405: goto L_0x03e3;
                case 75537: goto L_0x03d9;
                case 75739: goto L_0x03cf;
                case 76779: goto L_0x03c5;
                case 78669: goto L_0x03bb;
                case 79305: goto L_0x03b1;
                case 80618: goto L_0x03a7;
                case 88274: goto L_0x039d;
                case 98846: goto L_0x0393;
                case 98848: goto L_0x0389;
                case 99329: goto L_0x037f;
                case 101481: goto L_0x0375;
                case 1513190: goto L_0x036b;
                case 1514184: goto L_0x0361;
                case 1514185: goto L_0x0357;
                case 2133089: goto L_0x034d;
                case 2133091: goto L_0x0343;
                case 2133120: goto L_0x0339;
                case 2133151: goto L_0x032f;
                case 2133182: goto L_0x0325;
                case 2133184: goto L_0x031b;
                case 2436959: goto L_0x0311;
                case 2463773: goto L_0x0307;
                case 2464648: goto L_0x02fd;
                case 2689555: goto L_0x02f3;
                case 3154429: goto L_0x02e9;
                case 3284551: goto L_0x02df;
                case 3351335: goto L_0x02d5;
                case 3386211: goto L_0x02cb;
                case 41325051: goto L_0x02c1;
                case 51349633: goto L_0x02b7;
                case 51350594: goto L_0x02ad;
                case 55178625: goto L_0x02a3;
                case 61542055: goto L_0x0299;
                case 65355429: goto L_0x028f;
                case 66214468: goto L_0x0285;
                case 66214470: goto L_0x027b;
                case 66214473: goto L_0x0271;
                case 66215429: goto L_0x0267;
                case 66215431: goto L_0x025d;
                case 66215433: goto L_0x0253;
                case 66216390: goto L_0x0249;
                case 76402249: goto L_0x023f;
                case 76404105: goto L_0x0235;
                case 76404911: goto L_0x022b;
                case 80963634: goto L_0x0221;
                case 82882791: goto L_0x0217;
                case 98715550: goto L_0x020d;
                case 101370885: goto L_0x0203;
                case 102844228: goto L_0x01f9;
                case 165221241: goto L_0x01ef;
                case 182191441: goto L_0x01e5;
                case 245388979: goto L_0x01db;
                case 287431619: goto L_0x01d1;
                case 307593612: goto L_0x01c7;
                case 308517133: goto L_0x01bd;
                case 316215098: goto L_0x01b3;
                case 316215116: goto L_0x01a9;
                case 316246811: goto L_0x019f;
                case 316246818: goto L_0x0195;
                case 407160593: goto L_0x018b;
                case 507412548: goto L_0x0181;
                case 793982701: goto L_0x0177;
                case 794038622: goto L_0x016d;
                case 794040393: goto L_0x0163;
                case 835649806: goto L_0x0159;
                case 917340916: goto L_0x014f;
                case 958008161: goto L_0x0145;
                case 1060579533: goto L_0x013b;
                case 1150207623: goto L_0x0131;
                case 1176899427: goto L_0x0127;
                case 1280332038: goto L_0x011d;
                case 1306947716: goto L_0x0113;
                case 1349174697: goto L_0x0109;
                case 1522194893: goto L_0x00ff;
                case 1691543273: goto L_0x00f5;
                case 1691544261: goto L_0x00eb;
                case 1709443163: goto L_0x00e1;
                case 1865889110: goto L_0x00d7;
                case 1906253259: goto L_0x00cd;
                case 1977196784: goto L_0x00c4;
                case 2006372676: goto L_0x00bb;
                case 2019281702: goto L_0x00b2;
                case 2029784656: goto L_0x00a9;
                case 2030379515: goto L_0x00a0;
                case 2033393791: goto L_0x0097;
                case 2047190025: goto L_0x008e;
                case 2047252157: goto L_0x0085;
                case 2048319463: goto L_0x007c;
                case 2048855701: goto L_0x0073;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x05e1
        L_0x0073:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x007c:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0085:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x008e:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0097:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00a0:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00a9:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00b2:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00bb:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00c4:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00cd:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00d7:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00e1:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00eb:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00f5:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x00ff:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0109:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0113:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x011d:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0127:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0131:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x013b:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0145:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x014f:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0159:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0163:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x016d:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0177:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0181:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x018b:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0195:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x019f:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01a9:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01b3:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01bd:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01c7:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01d1:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01db:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01e5:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01ef:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x01f9:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0203:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x020d:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0217:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0221:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x022b:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0235:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x023f:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0249:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0253:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x025d:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0267:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0271:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x027b:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0285:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x028f:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0299:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02a3:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02ad:
            java.lang.String r2 = "602LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02b7:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02c1:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02cb:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02d5:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02df:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02e9:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02f3:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x02fd:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0307:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0311:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x031b:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0325:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x032f:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0339:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0343:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x034d:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0357:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0361:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x036b:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0375:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x037f:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0389:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0393:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x039d:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03a7:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03b1:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03bb:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03c5:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03cf:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03d9:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03e3:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03ed:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x03f7:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0401:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x040b:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0415:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x041f:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0429:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0433:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x043d:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0447:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0451:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x045b:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0465:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x046f:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0479:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0483:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x048d:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0497:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04a1:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04ab:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04b5:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04bf:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04c9:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04d3:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04dd:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04e7:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04f1:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x04fb:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0505:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x050f:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0519:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0523:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x052d:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0537:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0541:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x054b:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0555:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x055f:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0569:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0573:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x057d:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0587:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x0591:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x059b:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05a5:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05af:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05b9:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05c3:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05cd:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05d7:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x05e1
            goto L_0x004e
        L_0x05e1:
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d     // Catch:{ all -> 0x061d }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x061d }
            r4 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r4) goto L_0x060b
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x0601
            r4 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r4) goto L_0x05f7
            goto L_0x0615
        L_0x05f7:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0615
            goto L_0x004e
        L_0x0601:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0615
            goto L_0x004e
        L_0x060b:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0615
            goto L_0x004e
        L_0x0615:
            f20513e = r0     // Catch:{ all -> 0x061d }
            f20512d = r3     // Catch:{ all -> 0x061d }
        L_0x0619:
            monitor-exit(r5)     // Catch:{ all -> 0x061d }
            boolean r5 = f20513e
            return r5
        L_0x061d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x061d }
            goto L_0x0621
        L_0x0620:
            throw r0
        L_0x0621:
            goto L_0x0620
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aff.m18573aF(java.lang.String):boolean");
    }

    /* renamed from: aJ */
    private static List m18574aJ(C7228qk qkVar, C6864cy cyVar, boolean z, boolean z2) {
        Pair e;
        String str = cyVar.f21812l;
        if (str == null) {
            return Collections.emptyList();
        }
        List c = C7239qv.m21659c(qkVar.mo16329a(str, z, z2), cyVar);
        if ("video/dolby-vision".equals(str) && (e = C7239qv.m21661e(cyVar)) != null) {
            int intValue = ((Integer) e.first).intValue();
            if (intValue == 16 || intValue == 256) {
                c.addAll(qkVar.mo16329a("video/hevc", z, z2));
            } else if (intValue == 512) {
                c.addAll(qkVar.mo16329a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(c);
    }

    /* renamed from: aK */
    private final void m18575aK(long j, long j2, C6864cy cyVar) {
        afg afg = this.f20530Q;
        if (afg != null) {
            afg.mo14653a();
        }
    }

    /* renamed from: aL */
    private final void m18576aL(boolean z) {
        Surface surface;
        if (aeu.f20466a >= 30 && (surface = this.f20541o) != null && surface != this.f20543q) {
            float f = 0.0f;
            if (mo15516e() == 2) {
                float f2 = this.f20523J;
                if (f2 != -1.0f) {
                    f = f2 * mo16325aw();
                }
            }
            if (this.f20542p != f || z) {
                this.f20542p = f;
                m18578aN(surface, f);
            }
        }
    }

    /* renamed from: aM */
    private final void m18577aM() {
        Surface surface;
        if (aeu.f20466a >= 30 && (surface = this.f20541o) != null && surface != this.f20543q && this.f20542p != 0.0f) {
            this.f20542p = 0.0f;
            m18578aN(surface, 0.0f);
        }
    }

    /* renamed from: aN */
    private static void m18578aN(Surface surface, float f) {
        surface.setFrameRate(f, f == 0.0f ? 0 : 1);
    }

    /* renamed from: aO */
    private final boolean m18579aO(C7224qg qgVar) {
        if (aeu.f20466a < 23 || this.f20528O || m18573aF(qgVar.f23577a)) {
            return false;
        }
        if (!qgVar.f23582f || afa.m18566a(this.f20532f)) {
            return true;
        }
        return false;
    }

    /* renamed from: aP */
    private final void m18580aP() {
        this.f20550x = SystemClock.elapsedRealtime() + 5000;
    }

    /* renamed from: aQ */
    private final void m18581aQ() {
        MediaCodec am;
        this.f20546t = false;
        if (aeu.f20466a >= 23 && this.f20528O && (am = mo16319am()) != null) {
            this.f20531b = new afe(this, am);
        }
    }

    /* renamed from: aR */
    private final void m18582aR() {
        this.f20524K = -1;
        this.f20525L = -1;
        this.f20527N = -1.0f;
        this.f20526M = -1;
    }

    /* renamed from: aS */
    private final void m18583aS() {
        int i = this.f20519F;
        if (i == -1) {
            if (this.f20520G != -1) {
                i = -1;
            } else {
                return;
            }
        }
        if (this.f20524K != i || this.f20525L != this.f20520G || this.f20526M != this.f20521H || this.f20527N != this.f20522I) {
            this.f20534h.mo14682f(i, this.f20520G, this.f20521H, this.f20522I);
            this.f20524K = this.f20519F;
            this.f20525L = this.f20520G;
            this.f20526M = this.f20521H;
            this.f20527N = this.f20522I;
        }
    }

    /* renamed from: aT */
    private final void m18584aT() {
        int i = this.f20524K;
        if (i == -1) {
            if (this.f20525L != -1) {
                i = -1;
            } else {
                return;
            }
        }
        this.f20534h.mo14682f(i, this.f20525L, this.f20526M, this.f20527N);
    }

    /* renamed from: aU */
    private final void m18585aU() {
        if (this.f20552z > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f20534h.mo14680d(this.f20552z, elapsedRealtime - this.f20551y);
            this.f20552z = 0;
            this.f20551y = elapsedRealtime;
        }
    }

    /* renamed from: aV */
    private static boolean m18586aV(long j) {
        return j < -30000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r4.equals("video/mp4v-es") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r4.equals("video/hevc") != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        r5 = r5 * r6;
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r4.equals("video/3gpp") != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        r5 = r5 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        return (r5 * 3) / (r2 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r4.equals("video/x-vnd.on2.vp9") != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r4.equals("video/x-vnd.on2.vp8") != false) goto L_0x0084;
     */
    /* renamed from: aW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m18587aW(com.google.ads.interactivemedia.p367v3.internal.C7224qg r3, java.lang.String r4, int r5, int r6) {
        /*
            r0 = -1
            if (r5 == r0) goto L_0x008b
            if (r6 != r0) goto L_0x0007
            goto L_0x008b
        L_0x0007:
            int r1 = r4.hashCode()
            r2 = 2
            switch(r1) {
                case -1664118616: goto L_0x007c;
                case -1662541442: goto L_0x0070;
                case 1187890754: goto L_0x0067;
                case 1331836730: goto L_0x0023;
                case 1599127256: goto L_0x001a;
                case 1599127257: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x008b
        L_0x0011:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x0078
        L_0x001a:
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x0084
        L_0x0023:
            java.lang.String r1 = "video/avc"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x008b
            java.lang.String r4 = "BRAVIA 4K 2015"
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0066
            java.lang.String r4 = "Amazon"
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20468c
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0057
            java.lang.String r4 = "KFSOWI"
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0066
            java.lang.String r4 = "AFTS"
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20469d
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0057
            boolean r3 = r3.f23582f
            if (r3 != 0) goto L_0x0066
        L_0x0057:
            r3 = 16
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18488F(r5, r3)
            int r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18488F(r6, r3)
            int r4 = r4 * r3
            int r5 = r4 * 256
            goto L_0x0086
        L_0x0066:
            return r0
        L_0x0067:
            java.lang.String r3 = "video/mp4v-es"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x0084
        L_0x0070:
            java.lang.String r3 = "video/hevc"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008b
        L_0x0078:
            int r5 = r5 * r6
            r2 = 4
            goto L_0x0086
        L_0x007c:
            java.lang.String r3 = "video/3gpp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008b
        L_0x0084:
            int r5 = r5 * r6
        L_0x0086:
            int r5 = r5 * 3
            int r2 = r2 + r2
            int r5 = r5 / r2
            return r5
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aff.m18587aW(com.google.ads.interactivemedia.v3.internal.qg, java.lang.String, int, int):int");
    }

    /* renamed from: I */
    public final void mo14619I(float f) {
        super.mo14619I(f);
        m18576aL(false);
    }

    /* renamed from: K */
    public final String mo14620K() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: M */
    public final boolean mo14621M() {
        Surface surface;
        if (super.mo14621M() && (this.f20546t || (((surface = this.f20543q) != null && this.f20541o == surface) || mo16319am() == null || this.f20528O))) {
            this.f20550x = -9223372036854775807L;
            return true;
        } else if (this.f20550x == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f20550x) {
                return true;
            }
            this.f20550x = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final int mo14622P(C7228qk qkVar, C6864cy cyVar) {
        int i = 0;
        if (!adz.m18350b(cyVar.f21812l)) {
            return 0;
        }
        boolean z = cyVar.f21815o != null;
        List aJ = m18574aJ(qkVar, cyVar, z, false);
        if (z && aJ.isEmpty()) {
            aJ = m18574aJ(qkVar, cyVar, false, false);
        }
        if (aJ.isEmpty()) {
            return 1;
        }
        if (!m21572aA(cyVar)) {
            return 2;
        }
        C7224qg qgVar = (C7224qg) aJ.get(0);
        boolean c = qgVar.mo16308c(cyVar);
        int i2 = true != qgVar.mo16309d(cyVar) ? 8 : 16;
        if (c) {
            List aJ2 = m18574aJ(qkVar, cyVar, z, true);
            if (!aJ2.isEmpty()) {
                C7224qg qgVar2 = (C7224qg) aJ2.get(0);
                if (qgVar2.mo16308c(cyVar) && qgVar2.mo16309d(cyVar)) {
                    i = 32;
                }
            }
        }
        return (true != c ? 3 : 4) | i2 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final List mo14623Q(C7228qk qkVar, C6864cy cyVar, boolean z) {
        return m18574aJ(qkVar, cyVar, z, this.f20528O);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo14624S(C7224qg qgVar, C7222qe qeVar, C6864cy cyVar, MediaCrypto mediaCrypto, float f) {
        String str;
        afd afd;
        boolean z;
        Pair e;
        String str2;
        String str3;
        Point point;
        int aW;
        C7224qg qgVar2 = qgVar;
        C6864cy cyVar2 = cyVar;
        float f2 = f;
        String str4 = qgVar2.f23579c;
        C6864cy[] B = mo15501B();
        int i = cyVar2.f21817q;
        int i2 = cyVar2.f21818r;
        int aC = m18570aC(qgVar2, cyVar2);
        int length = B.length;
        boolean z2 = false;
        if (length == 1) {
            if (!(aC == -1 || (aW = m18587aW(qgVar2, cyVar2.f21812l, cyVar2.f21817q, cyVar2.f21818r)) == -1)) {
                aC = Math.min((int) (((float) aC) * 1.5f), aW);
            }
            afd = new afd(i, i2, aC);
            str = str4;
        } else {
            int i3 = 0;
            boolean z3 = false;
            while (i3 < length) {
                C6864cy cyVar3 = B[i3];
                if (qgVar2.mo16310e(cyVar2, cyVar3, z2)) {
                    int i4 = cyVar3.f21817q;
                    z3 |= i4 == -1 || cyVar3.f21818r == -1;
                    i = Math.max(i, i4);
                    i2 = Math.max(i2, cyVar3.f21818r);
                    aC = Math.max(aC, m18570aC(qgVar2, cyVar3));
                }
                i3++;
                z2 = false;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                String str5 = "x";
                sb.append(str5);
                sb.append(i2);
                String str6 = "MediaCodecVideoRenderer";
                Log.w(str6, sb.toString());
                int i5 = cyVar2.f21818r;
                int i6 = cyVar2.f21817q;
                int i7 = i5 > i6 ? i5 : i6;
                int i8 = i5 <= i6 ? i5 : i6;
                float f3 = ((float) i8) / ((float) i7);
                int[] iArr = f20511c;
                str = str4;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (((float) i10) * f3);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    int i12 = i7;
                    int i13 = i8;
                    if (aeu.f20466a >= 21) {
                        int i14 = i5 <= i6 ? i10 : i11;
                        if (i5 <= i6) {
                            i10 = i11;
                        }
                        Point g = qgVar2.mo16312g(i14, i10);
                        str3 = str5;
                        str2 = str6;
                        if (qgVar2.mo16311f(g.x, g.y, (double) cyVar2.f21819s)) {
                            point = g;
                            break;
                        }
                    } else {
                        str3 = str5;
                        str2 = str6;
                        try {
                            int F = aeu.m18488F(i10, 16) * 16;
                            int F2 = aeu.m18488F(i11, 16) * 16;
                            if (F * F2 <= C7239qv.m21660d()) {
                                int i15 = i5 <= i6 ? F : F2;
                                if (i5 <= i6) {
                                    F = F2;
                                }
                                point = new Point(i15, F);
                            }
                        } catch (C7234qq unused) {
                        }
                    }
                    i9++;
                    iArr = iArr2;
                    i7 = i12;
                    i8 = i13;
                    str5 = str3;
                    str6 = str2;
                }
                str3 = str5;
                str2 = str6;
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    aC = Math.max(aC, m18587aW(qgVar2, cyVar2.f21812l, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append(str3);
                    sb2.append(i2);
                    Log.w(str2, sb2.toString());
                }
            } else {
                str = str4;
            }
            afd = new afd(i, i2, aC);
        }
        this.f20538l = afd;
        boolean z4 = this.f20537k;
        int i16 = this.f20529P;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", cyVar2.f21817q);
        mediaFormat.setInteger("height", cyVar2.f21818r);
        C7135mz.m21201d(mediaFormat, cyVar2.f21814n);
        float f4 = cyVar2.f21819s;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        C7135mz.m21202e(mediaFormat, "rotation-degrees", cyVar2.f21820t);
        aex aex = cyVar2.f21824x;
        if (aex != null) {
            C7135mz.m21202e(mediaFormat, "color-transfer", aex.f20487c);
            C7135mz.m21202e(mediaFormat, "color-standard", aex.f20485a);
            C7135mz.m21202e(mediaFormat, "color-range", aex.f20486b);
            byte[] bArr = aex.f20488d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(cyVar2.f21812l) && (e = C7239qv.m21661e(cyVar)) != null) {
            C7135mz.m21202e(mediaFormat, "profile", ((Integer) e.first).intValue());
        }
        mediaFormat.setInteger("max-width", afd.f20506a);
        mediaFormat.setInteger("max-height", afd.f20507b);
        C7135mz.m21202e(mediaFormat, "max-input-size", afd.f20508c);
        if (aeu.f20466a >= 23) {
            mediaFormat.setInteger("priority", 0);
            float f5 = f;
            if (f5 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f5);
            }
        }
        if (z4) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f20541o == null) {
            if (m18579aO(qgVar)) {
                if (this.f20543q == null) {
                    this.f20543q = afa.m18567b(this.f20532f, qgVar2.f23582f);
                }
                this.f20541o = this.f20543q;
            } else {
                throw new IllegalStateException();
            }
        }
        qeVar.mo16304g(mediaFormat, this.f20541o, mediaCrypto);
        if (aeu.f20466a >= 23 && this.f20528O) {
            this.f20531b = new afe(this, qeVar.mo16303f());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo14625T(String str, long j, long j2) {
        this.f20534h.mo14678b(str, j, j2);
        this.f20539m = m18573aF(str);
        C7224qg an = mo16320an();
        ary.m19467t(an);
        boolean z = false;
        if (aeu.f20466a >= 29 && "video/x-vnd.on2.vp9".equals(an.f23578b)) {
            MediaCodecInfo.CodecProfileLevel[] b = an.mo16307b();
            int length = b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (b[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f20540n = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo14626U(C6865cz czVar) {
        super.mo14626U(czVar);
        this.f20534h.mo14679c(czVar.f21827a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo14627V(C6864cy cyVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        MediaCodec am = mo16319am();
        if (am != null) {
            am.setVideoScalingMode(this.f20545s);
        }
        if (this.f20528O) {
            this.f20519F = cyVar.f21817q;
            this.f20520G = cyVar.f21818r;
        } else {
            ary.m19467t(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f20519F = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f20520G = i2;
        }
        this.f20522I = cyVar.f21821u;
        if (aeu.f20466a >= 21) {
            int i3 = cyVar.f21820t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f20519F;
                this.f20519F = this.f20520G;
                this.f20520G = i4;
                this.f20522I = 1.0f / this.f20522I;
            }
        } else {
            this.f20521H = cyVar.f21820t;
        }
        this.f20523J = cyVar.f21819s;
        m18576aL(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo14628W(long j) {
        mo16316aj(j);
        m18583aS();
        this.f23615a.f22507e++;
        mo14632aB();
        mo14645av(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo14629X(C7024iw iwVar) {
        if (!this.f20528O) {
            this.f20515B++;
        }
        if (aeu.f20466a < 23 && this.f20528O) {
            mo14628W(iwVar.f22517d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo14630Y() {
        m18581aQ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final boolean mo14631Z(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6864cy cyVar) {
        long j4;
        boolean z3;
        boolean z4;
        int G;
        long j5 = j;
        MediaCodec mediaCodec2 = mediaCodec;
        int i4 = i;
        long j6 = j3;
        ary.m19467t(mediaCodec);
        if (this.f20549w == -9223372036854775807L) {
            this.f20549w = j5;
        }
        long az = mo16328az();
        long j7 = j6 - az;
        if (!z || z2) {
            long j8 = j6 - j5;
            if (this.f20541o != this.f20543q) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                long j9 = j8;
                long j10 = elapsedRealtime - this.f20516C;
                int e = mo15516e();
                if (this.f20548v ? this.f20546t : e != 2 && !this.f20547u) {
                    j4 = az;
                    z3 = false;
                } else {
                    j4 = az;
                    z3 = true;
                }
                if (this.f20550x != -9223372036854775807L || j5 < j4 || (!z3 && (e != 2 || !m18586aV(j9) || j10 <= 100000))) {
                    long j11 = j9;
                    if (e != 2 || j5 == this.f20549w) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    long c = this.f20533g.mo14665c(j3, ((j11 - (elapsedRealtime - j2)) * 1000) + nanoTime);
                    long j12 = (c - nanoTime) / 1000;
                    long j13 = this.f20550x;
                    if (j12 < -500000 && !z2 && (G = mo15506G(j)) != 0) {
                        C7022iu iuVar = this.f23615a;
                        iuVar.f22511i++;
                        int i5 = this.f20515B + G;
                        if (j13 != -9223372036854775807L) {
                            iuVar.f22508f += i5;
                        } else {
                            mo14636ab(i5);
                        }
                        mo16322ap();
                        return false;
                    } else if (m18586aV(j12) && !z2) {
                        if (j13 != -9223372036854775807L) {
                            mo14635aI(mediaCodec2, i4);
                            z4 = true;
                        } else {
                            atv.m19619k("dropVideoBuffer");
                            mediaCodec2.releaseOutputBuffer(i4, false);
                            atv.m19620l();
                            z4 = true;
                            mo14636ab(1);
                        }
                        mo14637ac(j12);
                        return z4;
                    } else if (aeu.f20466a >= 21) {
                        if (j12 >= 50000) {
                            return false;
                        }
                        m18575aK(j7, c, cyVar);
                        mo14634aH(mediaCodec2, i4, c);
                        mo14637ac(j12);
                        return true;
                    } else if (j12 >= 30000) {
                        return false;
                    } else {
                        if (j12 > 11000) {
                            try {
                                Thread.sleep((-10000 + j12) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m18575aK(j7, c, cyVar);
                        mo14633aG(mediaCodec2, i4);
                        mo14637ac(j12);
                        return true;
                    }
                } else {
                    long nanoTime2 = System.nanoTime();
                    m18575aK(j7, nanoTime2, cyVar);
                    if (aeu.f20466a >= 21) {
                        mo14634aH(mediaCodec2, i4, nanoTime2);
                    } else {
                        mo14633aG(mediaCodec2, i4);
                    }
                    mo14637ac(j9);
                    return true;
                }
            } else if (!m18586aV(j8)) {
                return false;
            } else {
                mo14635aI(mediaCodec2, i4);
                mo14637ac(j8);
                return true;
            }
        } else {
            mo14635aI(mediaCodec2, i4);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aB */
    public final void mo14632aB() {
        this.f20548v = true;
        if (!this.f20546t) {
            this.f20546t = true;
            this.f20534h.mo14683g(this.f20541o);
            this.f20544r = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public final void mo14633aG(MediaCodec mediaCodec, int i) {
        m18583aS();
        atv.m19619k("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        atv.m19620l();
        this.f20516C = SystemClock.elapsedRealtime() * 1000;
        this.f23615a.f22507e++;
        this.f20514A = 0;
        mo14632aB();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public final void mo14634aH(MediaCodec mediaCodec, int i, long j) {
        m18583aS();
        atv.m19619k("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        atv.m19620l();
        this.f20516C = SystemClock.elapsedRealtime() * 1000;
        this.f23615a.f22507e++;
        this.f20514A = 0;
        mo14632aB();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public final void mo14635aI(MediaCodec mediaCodec, int i) {
        atv.m19619k("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        atv.m19620l();
        this.f23615a.f22508f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final void mo14636ab(int i) {
        C7022iu iuVar = this.f23615a;
        iuVar.f22509g += i;
        this.f20552z += i;
        int i2 = this.f20514A + i;
        this.f20514A = i2;
        iuVar.f22510h = Math.max(i2, iuVar.f22510h);
        if (this.f20552z >= 50) {
            m18585aU();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo14637ac(long j) {
        C7022iu iuVar = this.f23615a;
        iuVar.f22512j += j;
        iuVar.f22513k++;
        this.f20517D += j;
        this.f20518E++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final int mo14638ad(C7224qg qgVar, C6864cy cyVar, C6864cy cyVar2) {
        if (!qgVar.mo16310e(cyVar, cyVar2, true)) {
            return 0;
        }
        int i = cyVar2.f21817q;
        afd afd = this.f20538l;
        if (i > afd.f20506a || cyVar2.f21818r > afd.f20507b || m18570aC(qgVar, cyVar2) > this.f20538l.f20508c) {
            return 0;
        }
        return cyVar.mo15641e(cyVar2) ? 3 : 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final float mo14639ae(float f, C6864cy[] cyVarArr) {
        float f2 = -1.0f;
        for (C6864cy cyVar : cyVarArr) {
            float f3 = cyVar.f21819s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public final boolean mo14640ag(C7224qg qgVar) {
        return this.f20541o != null || m18579aO(qgVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public final boolean mo14641ah() {
        return this.f20528O && aeu.f20466a < 23;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public final void mo14642ar() {
        super.mo14642ar();
        this.f20515B = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public final C7223qf mo14643at(Throwable th, C7224qg qgVar) {
        return new afc(th, qgVar, this.f20541o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public final void mo14644au(C7024iw iwVar) {
        if (this.f20540n) {
            ByteBuffer byteBuffer = iwVar.f22518e;
            ary.m19467t(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodec am = mo16319am();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    am.setParameters(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public final void mo14645av(long j) {
        super.mo14645av(j);
        if (!this.f20528O) {
            this.f20515B--;
        }
    }

    /* renamed from: t */
    public final void mo14646t(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f20543q;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C7224qg an = mo16320an();
                    if (an != null && m18579aO(an)) {
                        surface = afa.m18567b(this.f20532f, an.f23582f);
                        this.f20543q = surface;
                    }
                }
            }
            if (this.f20541o != surface) {
                m18577aM();
                this.f20541o = surface;
                this.f20544r = false;
                m18576aL(true);
                int e = mo15516e();
                MediaCodec am = mo16319am();
                if (am != null) {
                    if (aeu.f20466a < 23 || surface == null || this.f20539m) {
                        mo16321ao();
                        mo16314af();
                    } else {
                        am.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f20543q) {
                    m18582aR();
                    m18581aQ();
                    return;
                }
                m18584aT();
                m18581aQ();
                if (e == 2) {
                    m18580aP();
                }
            } else if (surface != null && surface != this.f20543q) {
                m18584aT();
                if (this.f20544r) {
                    this.f20534h.mo14683g(this.f20541o);
                }
            }
        } else if (i == 4) {
            int intValue = ((Integer) obj).intValue();
            this.f20545s = intValue;
            MediaCodec am2 = mo16319am();
            if (am2 != null) {
                am2.setVideoScalingMode(intValue);
            }
        } else if (i == 6) {
            this.f20530Q = (afg) obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo14647u(boolean z, boolean z2) {
        super.mo14647u(z, z2);
        int i = this.f20529P;
        int i2 = mo15502C().f21968b;
        this.f20529P = i2;
        this.f20528O = i2 != 0;
        if (i2 != i) {
            mo16321ao();
        }
        this.f20534h.mo14677a(this.f23615a);
        this.f20533g.mo14663a();
        this.f20547u = z2;
        this.f20548v = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo14648v(long j, boolean z) {
        super.mo14648v(j, z);
        m18581aQ();
        this.f20549w = -9223372036854775807L;
        this.f20514A = 0;
        if (z) {
            m18580aP();
        } else {
            this.f20550x = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo14649w() {
        this.f20552z = 0;
        this.f20551y = SystemClock.elapsedRealtime();
        this.f20516C = SystemClock.elapsedRealtime() * 1000;
        this.f20517D = 0;
        this.f20518E = 0;
        m18576aL(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14650x() {
        this.f20550x = -9223372036854775807L;
        m18585aU();
        int i = this.f20518E;
        if (i != 0) {
            this.f20534h.mo14681e(this.f20517D, i);
            this.f20517D = 0;
            this.f20518E = 0;
        }
        m18577aM();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo14651y() {
        m18582aR();
        m18581aQ();
        this.f20544r = false;
        this.f20533g.mo14664b();
        this.f20531b = null;
        try {
            super.mo14651y();
        } finally {
            this.f20534h.mo14684h(this.f23615a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo14652z() {
        try {
            super.mo14652z();
        } finally {
            Surface surface = this.f20543q;
            if (surface != null) {
                if (this.f20541o == surface) {
                    this.f20541o = null;
                }
                surface.release();
                this.f20543q = null;
            }
        }
    }
}
