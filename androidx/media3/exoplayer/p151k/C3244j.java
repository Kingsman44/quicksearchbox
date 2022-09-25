package androidx.media3.exoplayer.p151k;

import android.content.Context;
import android.os.SystemClock;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2602aa;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2636x;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.k.j */
/* compiled from: PG */
public final class C3244j implements C3240f, C2495an {

    /* renamed from: a */
    public static final C58485gu f9745a = C58485gu.m89850r(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: b */
    public static final C58485gu f9746b = C58485gu.m89850r(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: c */
    public static final C58485gu f9747c = C58485gu.m89850r(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: d */
    public static final C58485gu f9748d = C58485gu.m89850r(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: e */
    public static final C58485gu f9749e = C58485gu.m89850r(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: f */
    public static final C58485gu f9750f = C58485gu.m89850r(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: h */
    private static C3244j f9751h;

    /* renamed from: g */
    public final C3238d f9752g;

    /* renamed from: i */
    private final C58495hd f9753i;

    /* renamed from: j */
    private final C3235ac f9754j;

    /* renamed from: k */
    private final boolean f9755k;

    /* renamed from: l */
    private int f9756l;

    /* renamed from: m */
    private long f9757m;

    /* renamed from: n */
    private long f9758n;

    /* renamed from: o */
    private int f9759o;

    /* renamed from: p */
    private long f9760p;

    /* renamed from: q */
    private long f9761q;

    /* renamed from: r */
    private long f9762r;

    /* renamed from: s */
    private long f9763s;

    @Deprecated
    public C3244j() {
        this((Context) null, C58729pv.f156485a, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017a, code lost:
        if (r3.equals("VA") != false) goto L_0x09cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0192, code lost:
        if (r3.equals("UY") != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01aa, code lost:
        if (r3.equals("UG") != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b4, code lost:
        if (r3.equals("UA") != false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01cc, code lost:
        if (r3.equals("TW") != false) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d6, code lost:
        if (r3.equals("TV") != false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fc, code lost:
        if (r3.equals("TO") != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0206, code lost:
        if (r3.equals("TN") != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0210, code lost:
        if (r3.equals("TM") != false) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x021a, code lost:
        if (r3.equals("TL") != false) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0232, code lost:
        if (r3.equals("TJ") != false) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x024a, code lost:
        if (r3.equals("TG") != false) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0254, code lost:
        if (r3.equals("TD") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x025e, code lost:
        if (r3.equals("TC") != false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0275, code lost:
        if (r3.equals("SY") != false) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x027f, code lost:
        if (r3.equals("SX") != false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0286, code lost:
        return new int[]{1, 2, 1, 0, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x028d, code lost:
        if (r3.equals("SV") != false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02c1, code lost:
        if (r3.equals("SO") != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02d9, code lost:
        if (r3.equals("SM") != false) goto L_0x0ba5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02e3, code lost:
        if (r3.equals("SL") != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02ea, code lost:
        return new int[]{3, 3, 4, 3, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02f1, code lost:
        if (r3.equals("SK") != false) goto L_0x0ab7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02fb, code lost:
        if (r3.equals("SI") != false) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0305, code lost:
        if (r3.equals("SH") != false) goto L_0x092e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x031d, code lost:
        if (r3.equals("SE") != false) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0327, code lost:
        if (r3.equals("SD") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0331, code lost:
        if (r3.equals("SC") != false) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0338, code lost:
        return new int[]{4, 2, 1, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0377, code lost:
        if (r3.equals("RS") != false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x038f, code lost:
        if (r3.equals("RE") != false) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03b5, code lost:
        if (r3.equals("PT") != false) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03db, code lost:
        if (r3.equals("PM") != false) goto L_0x0ba5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x03e5, code lost:
        if (r3.equals("PL") != false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03ee, code lost:
        if (r3.equals("PK") != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0406, code lost:
        if (r3.equals("PG") != false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0410, code lost:
        if (r3.equals("PF") != false) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x041a, code lost:
        if (r3.equals("PE") != false) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0424, code lost:
        if (r3.equals("PA") != false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r3.equals("CI") != false) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x043b, code lost:
        if (r3.equals("NZ") != false) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0442, code lost:
        return new int[]{1, 1, 2, 2, 4, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0449, code lost:
        if (r3.equals("NU") != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0452, code lost:
        if (r3.equals("NR") != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0459, code lost:
        return new int[]{4, 2, 2, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x046e, code lost:
        if (r3.equals("NO") != false) goto L_0x09b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0486, code lost:
        if (r3.equals("NI") != false) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x048d, code lost:
        return new int[]{2, 3, 3, 3, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x04a2, code lost:
        if (r3.equals("NE") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x04ba, code lost:
        if (r3.equals("NA") != false) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r3.equals("CG") != false) goto L_0x093c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0518, code lost:
        if (r3.equals("MT") != false) goto L_0x0ab7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0522, code lost:
        if (r3.equals("MS") != false) goto L_0x0ba5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x052c, code lost:
        if (r3.equals("MR") != false) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0533, code lost:
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x053a, code lost:
        if (r3.equals("MQ") != false) goto L_0x082e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0544, code lost:
        if (r3.equals("MP") != false) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x054d, code lost:
        if (r3.equals("MO") != false) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0554, code lost:
        return new int[]{0, 2, 4, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        if (r3.equals("CF") != false) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0577, code lost:
        if (r3.equals("ML") != false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x057e, code lost:
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0593, code lost:
        if (r3.equals("MH") != false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x059d, code lost:
        if (r3.equals("MG") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05a7, code lost:
        if (r3.equals("MF") != false) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x05ae, code lost:
        return new int[]{1, 2, 1, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x05c3, code lost:
        if (r3.equals("MD") != false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x05ca, code lost:
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x05ed, code lost:
        if (r3.equals("LY") != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x05f7, code lost:
        if (r3.equals("LV") != false) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x062b, code lost:
        if (r3.equals("LR") != false) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r3.equals("BN") != false) goto L_0x09db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0643, code lost:
        if (r3.equals("LI") != false) goto L_0x0ba5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x064d, code lost:
        if (r3.equals("LC") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0681, code lost:
        if (r3.equals("KY") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r3.equals("BM") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x068b, code lost:
        if (r3.equals("KW") != false) goto L_0x09bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x06a3, code lost:
        if (r3.equals("KP") != false) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x06ad, code lost:
        if (r3.equals("KN") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x06b7, code lost:
        if (r3.equals("KM") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x06c1, code lost:
        if (r3.equals("KI") != false) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x06c8, code lost:
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r3.equals("BL") != false) goto L_0x09cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x06dd, code lost:
        if (r3.equals("KG") != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x06e4, code lost:
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x06eb, code lost:
        if (r3.equals("KE") != false) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x071f, code lost:
        if (r3.equals("JE") != false) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0726, code lost:
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x073b, code lost:
        if (r3.equals("IS") != false) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0761, code lost:
        if (r3.equals("IO") != false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0768, code lost:
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x077d, code lost:
        if (r3.equals("IM") != false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0784, code lost:
        return new int[]{0, 2, 1, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x078b, code lost:
        if (r3.equals("IL") != false) goto L_0x0a3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0795, code lost:
        if (r3.equals("IE") != false) goto L_0x0920;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x07bb, code lost:
        if (r3.equals("HT") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x07c5, code lost:
        if (r3.equals("HR") != false) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x07ea, code lost:
        if (r3.equals("GW") != false) goto L_0x093c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x07f4, code lost:
        if (r3.equals("GU") != false) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x07fb, code lost:
        return new int[]{1, 2, 4, 4, 4, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0810, code lost:
        if (r3.equals("GR") != false) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0817, code lost:
        return new int[]{1, 0, 0, 0, 1, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x082c, code lost:
        if (r3.equals("GP") != false) goto L_0x082e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0833, code lost:
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0848, code lost:
        if (r3.equals("GM") != false) goto L_0x0b27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0852, code lost:
        if (r3.equals("GL") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x085c, code lost:
        if (r3.equals("GI") != false) goto L_0x0b89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0866, code lost:
        if (r3.equals("GH") != false) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x086d, code lost:
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0874, code lost:
        if (r3.equals("GG") != false) goto L_0x0876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x087b, code lost:
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0882, code lost:
        if (r3.equals("GF") != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x089a, code lost:
        if (r3.equals("GD") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x08b2, code lost:
        if (r3.equals("GA") != false) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x08b9, code lost:
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x08ce, code lost:
        if (r3.equals("FO") != false) goto L_0x0b89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x08e6, code lost:
        if (r3.equals("FK") != false) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c6, code lost:
        if (r3.equals("AR") != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x08ed, code lost:
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x091e, code lost:
        if (r3.equals("ES") != false) goto L_0x0920;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0925, code lost:
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x092c, code lost:
        if (r3.equals("ER") != false) goto L_0x092e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d0, code lost:
        if (r3.equals("AQ") != false) goto L_0x092e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0933, code lost:
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x093a, code lost:
        if (r3.equals("EG") != false) goto L_0x093c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0941, code lost:
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0948, code lost:
        if (r3.equals("EE") != false) goto L_0x094a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x094f, code lost:
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0964, code lost:
        if (r3.equals("DZ") != false) goto L_0x0966;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x096b, code lost:
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00da, code lost:
        if (r3.equals("ZW") != false) goto L_0x052e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0980, code lost:
        if (r3.equals("DM") != false) goto L_0x0b89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0998, code lost:
        if (r3.equals("DJ") != false) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x09af, code lost:
        if (r3.equals("CZ") != false) goto L_0x09b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x09b6, code lost:
        return new int[]{0, 0, 2, 0, 1, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x09bd, code lost:
        if (r3.equals("CY") != false) goto L_0x09bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x09c4, code lost:
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x09cb, code lost:
        if (r3.equals("CX") != false) goto L_0x09cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x09d2, code lost:
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x09d9, code lost:
        if (r3.equals("CW") != false) goto L_0x09db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x09e0, code lost:
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x09f5, code lost:
        if (r3.equals("CU") != false) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x09fc, code lost:
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0a3b, code lost:
        if (r3.equals("CL") != false) goto L_0x0a3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0a42, code lost:
        return new int[]{1, 2, 2, 2, 3, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0a49, code lost:
        if (r3.equals("CK") != false) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0a50, code lost:
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0a81, code lost:
        if (r3.equals("BQ") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0a99, code lost:
        if (r3.equals("BI") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0aa0, code lost:
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0ab5, code lost:
        if (r3.equals("BG") != false) goto L_0x0ab7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x0abc, code lost:
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0100, code lost:
        if (r3.equals("YT") != false) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x0aed, code lost:
        if (r3.equals("AZ") != false) goto L_0x0aef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x0af4, code lost:
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010a, code lost:
        if (r3.equals("YE") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0b25, code lost:
        if (r3.equals("AF") != false) goto L_0x0b27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0b2c, code lost:
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0b41, code lost:
        if (r3.equals("AD") != false) goto L_0x0b43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x0b48, code lost:
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0114, code lost:
        if (r3.equals("XK") != false) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x0b87, code lost:
        if (r3.equals("BB") != false) goto L_0x0b89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:0x0ba3, code lost:
        if (r3.equals("AX") != false) goto L_0x0ba5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x0bcd, code lost:
        if (r3.equals("AL") != false) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012c, code lost:
        if (r3.equals("WF") != false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0136, code lost:
        if (r3.equals("VU") != false) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x014e, code lost:
        if (r3.equals("VI") != false) goto L_0x0876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0166, code lost:
        if (r3.equals("VE") != false) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0170, code lost:
        if (r3.equals("VC") != false) goto L_0x0b43;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] m9456h(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 2091(0x82b, float:2.93E-42)
            r2 = 6
            if (r0 == r1) goto L_0x0bc7
            r1 = 2092(0x82c, float:2.932E-42)
            if (r0 == r1) goto L_0x0bb9
            r1 = 2102(0x836, float:2.946E-42)
            if (r0 == r1) goto L_0x0bab
            r1 = 2103(0x837, float:2.947E-42)
            if (r0 == r1) goto L_0x0b9d
            r1 = 2111(0x83f, float:2.958E-42)
            if (r0 == r1) goto L_0x0b8f
            r1 = 2112(0x840, float:2.96E-42)
            if (r0 == r1) goto L_0x0b81
            r1 = 2129(0x851, float:2.983E-42)
            if (r0 == r1) goto L_0x0b73
            r1 = 2130(0x852, float:2.985E-42)
            if (r0 == r1) goto L_0x0b65
            r1 = 2135(0x857, float:2.992E-42)
            if (r0 == r1) goto L_0x0b57
            r1 = 2136(0x858, float:2.993E-42)
            if (r0 == r1) goto L_0x0b49
            switch(r0) {
                case 2083: goto L_0x0b3b;
                case 2084: goto L_0x0b2d;
                case 2085: goto L_0x0b1f;
                case 2086: goto L_0x0b11;
                default: goto L_0x0030;
            }
        L_0x0030:
            switch(r0) {
                case 2088: goto L_0x0b03;
                case 2094: goto L_0x0af5;
                case 2105: goto L_0x0ae7;
                case 2114: goto L_0x0ad9;
                case 2115: goto L_0x0acb;
                case 2116: goto L_0x0abd;
                case 2117: goto L_0x0aaf;
                case 2118: goto L_0x0aa1;
                case 2119: goto L_0x0a93;
                case 2120: goto L_0x0a85;
                case 2127: goto L_0x0a7b;
                case 2133: goto L_0x0a6d;
                case 2142: goto L_0x0a5f;
                case 2145: goto L_0x0a51;
                case 2152: goto L_0x0a43;
                case 2153: goto L_0x0a35;
                case 2154: goto L_0x0a27;
                case 2155: goto L_0x0a19;
                case 2156: goto L_0x0a0b;
                case 2159: goto L_0x09fd;
                case 2162: goto L_0x09ef;
                case 2163: goto L_0x09e1;
                case 2164: goto L_0x09d3;
                case 2165: goto L_0x09c5;
                case 2166: goto L_0x09b7;
                case 2167: goto L_0x09a9;
                case 2177: goto L_0x099b;
                case 2182: goto L_0x0992;
                case 2183: goto L_0x0984;
                case 2185: goto L_0x097a;
                case 2187: goto L_0x096c;
                case 2198: goto L_0x095e;
                case 2206: goto L_0x0950;
                case 2208: goto L_0x0942;
                case 2210: goto L_0x0934;
                case 2221: goto L_0x0926;
                case 2222: goto L_0x0918;
                case 2223: goto L_0x090a;
                case 2243: goto L_0x08fc;
                case 2244: goto L_0x08ee;
                case 2245: goto L_0x08e0;
                case 2247: goto L_0x08d2;
                case 2249: goto L_0x08c8;
                case 2252: goto L_0x08ba;
                case 2266: goto L_0x08ac;
                case 2267: goto L_0x089e;
                case 2269: goto L_0x0894;
                case 2270: goto L_0x0886;
                case 2271: goto L_0x087c;
                case 2272: goto L_0x086e;
                case 2273: goto L_0x0860;
                case 2274: goto L_0x0856;
                case 2277: goto L_0x084c;
                case 2278: goto L_0x0842;
                case 2279: goto L_0x0834;
                case 2281: goto L_0x0826;
                case 2282: goto L_0x0818;
                case 2283: goto L_0x080a;
                case 2285: goto L_0x07fc;
                case 2286: goto L_0x07ee;
                case 2288: goto L_0x07e4;
                case 2290: goto L_0x07d6;
                case 2307: goto L_0x07c8;
                case 2314: goto L_0x07bf;
                case 2316: goto L_0x07b5;
                case 2317: goto L_0x07a7;
                case 2331: goto L_0x0799;
                case 2332: goto L_0x078f;
                case 2339: goto L_0x0785;
                case 2340: goto L_0x0777;
                case 2341: goto L_0x0769;
                case 2342: goto L_0x075b;
                case 2344: goto L_0x074d;
                case 2345: goto L_0x073f;
                case 2346: goto L_0x0735;
                case 2347: goto L_0x0727;
                case 2363: goto L_0x0719;
                case 2371: goto L_0x070b;
                case 2373: goto L_0x06fd;
                case 2374: goto L_0x06ef;
                case 2394: goto L_0x06e5;
                case 2396: goto L_0x06d7;
                case 2397: goto L_0x06c9;
                case 2398: goto L_0x06bb;
                case 2402: goto L_0x06b1;
                case 2403: goto L_0x06a7;
                case 2405: goto L_0x069d;
                case 2407: goto L_0x068f;
                case 2412: goto L_0x0685;
                case 2414: goto L_0x067b;
                case 2415: goto L_0x066d;
                case 2421: goto L_0x065f;
                case 2422: goto L_0x0651;
                case 2423: goto L_0x0647;
                case 2429: goto L_0x063d;
                case 2431: goto L_0x062f;
                case 2438: goto L_0x0625;
                case 2439: goto L_0x0617;
                case 2440: goto L_0x0609;
                case 2441: goto L_0x05fb;
                case 2442: goto L_0x05f1;
                case 2445: goto L_0x05e7;
                case 2452: goto L_0x05d9;
                case 2454: goto L_0x05cb;
                case 2455: goto L_0x05bd;
                case 2456: goto L_0x05af;
                case 2457: goto L_0x05a1;
                case 2458: goto L_0x0597;
                case 2459: goto L_0x058d;
                case 2462: goto L_0x057f;
                case 2463: goto L_0x0571;
                case 2464: goto L_0x0563;
                case 2465: goto L_0x0555;
                case 2466: goto L_0x0547;
                case 2467: goto L_0x053e;
                case 2468: goto L_0x0534;
                case 2469: goto L_0x0526;
                case 2470: goto L_0x051c;
                case 2471: goto L_0x0512;
                case 2472: goto L_0x0504;
                case 2473: goto L_0x04f6;
                case 2474: goto L_0x04e8;
                case 2475: goto L_0x04da;
                case 2476: goto L_0x04cc;
                case 2477: goto L_0x04be;
                case 2483: goto L_0x04b4;
                case 2485: goto L_0x04a6;
                case 2487: goto L_0x049c;
                case 2489: goto L_0x048e;
                case 2491: goto L_0x0480;
                case 2494: goto L_0x0472;
                case 2497: goto L_0x0468;
                case 2498: goto L_0x045a;
                case 2500: goto L_0x044c;
                case 2503: goto L_0x0443;
                case 2508: goto L_0x0435;
                case 2526: goto L_0x0427;
                case 2545: goto L_0x041e;
                case 2549: goto L_0x0414;
                case 2550: goto L_0x040a;
                case 2551: goto L_0x0400;
                case 2552: goto L_0x03f2;
                case 2555: goto L_0x03e8;
                case 2556: goto L_0x03df;
                case 2557: goto L_0x03d5;
                case 2562: goto L_0x03c7;
                case 2563: goto L_0x03b9;
                case 2564: goto L_0x03af;
                case 2567: goto L_0x03a1;
                case 2576: goto L_0x0393;
                case 2611: goto L_0x0389;
                case 2621: goto L_0x037b;
                case 2625: goto L_0x0371;
                case 2627: goto L_0x0363;
                case 2629: goto L_0x0355;
                case 2638: goto L_0x0347;
                case 2639: goto L_0x0339;
                case 2640: goto L_0x032b;
                case 2641: goto L_0x0321;
                case 2642: goto L_0x0317;
                case 2644: goto L_0x0309;
                case 2645: goto L_0x02ff;
                case 2646: goto L_0x02f5;
                case 2648: goto L_0x02eb;
                case 2649: goto L_0x02dd;
                case 2650: goto L_0x02d3;
                case 2651: goto L_0x02c5;
                case 2652: goto L_0x02bb;
                case 2655: goto L_0x02ad;
                case 2656: goto L_0x029f;
                case 2657: goto L_0x0291;
                case 2659: goto L_0x0287;
                case 2661: goto L_0x0279;
                case 2662: goto L_0x026f;
                case 2663: goto L_0x0261;
                case 2671: goto L_0x0258;
                case 2672: goto L_0x024e;
                case 2675: goto L_0x0244;
                case 2676: goto L_0x0236;
                case 2678: goto L_0x022c;
                case 2679: goto L_0x021e;
                case 2680: goto L_0x0214;
                case 2681: goto L_0x020a;
                case 2682: goto L_0x0200;
                case 2683: goto L_0x01f6;
                case 2686: goto L_0x01e8;
                case 2688: goto L_0x01da;
                case 2690: goto L_0x01d0;
                case 2691: goto L_0x01c6;
                case 2694: goto L_0x01b8;
                case 2700: goto L_0x01ae;
                case 2706: goto L_0x01a4;
                case 2718: goto L_0x0196;
                case 2724: goto L_0x018c;
                case 2725: goto L_0x017e;
                case 2731: goto L_0x0174;
                case 2733: goto L_0x016a;
                case 2735: goto L_0x0160;
                case 2737: goto L_0x0152;
                case 2739: goto L_0x0148;
                case 2744: goto L_0x013a;
                case 2751: goto L_0x0130;
                case 2767: goto L_0x0126;
                case 2780: goto L_0x0118;
                case 2803: goto L_0x010e;
                case 2828: goto L_0x0104;
                case 2843: goto L_0x00fa;
                case 2855: goto L_0x00ec;
                case 2867: goto L_0x00de;
                case 2877: goto L_0x00d4;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r0) {
                case 2096: goto L_0x00ca;
                case 2097: goto L_0x00c0;
                case 2098: goto L_0x00b2;
                case 2099: goto L_0x00a4;
                case 2100: goto L_0x0096;
                default: goto L_0x0036;
            }
        L_0x0036:
            switch(r0) {
                case 2122: goto L_0x008c;
                case 2123: goto L_0x0082;
                case 2124: goto L_0x0078;
                case 2125: goto L_0x006a;
                default: goto L_0x0039;
            }
        L_0x0039:
            switch(r0) {
                case 2147: goto L_0x0060;
                case 2148: goto L_0x0056;
                case 2149: goto L_0x0048;
                case 2150: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0bd5
        L_0x003e:
            java.lang.String r0 = "CI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0966
        L_0x0048:
            java.lang.String r0 = "CH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 1, 0, 2} // fill-array
            return r3
        L_0x0056:
            java.lang.String r0 = "CG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x093c
        L_0x0060:
            java.lang.String r0 = "CF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x06c3
        L_0x006a:
            java.lang.String r0 = "BO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 2, 3, 2, 2, 2} // fill-array
            return r3
        L_0x0078:
            java.lang.String r0 = "BN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09db
        L_0x0082:
            java.lang.String r0 = "BM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x008c:
            java.lang.String r0 = "BL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09cd
        L_0x0096:
            java.lang.String r0 = "AU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 1, 1, 2, 0} // fill-array
            return r3
        L_0x00a4:
            java.lang.String r0 = "AT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 0, 1, 1, 0, 0} // fill-array
            return r3
        L_0x00b2:
            java.lang.String r0 = "AS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 3, 3, 2, 2} // fill-array
            return r3
        L_0x00c0:
            java.lang.String r0 = "AR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x06df
        L_0x00ca:
            java.lang.String r0 = "AQ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x092e
        L_0x00d4:
            java.lang.String r0 = "ZW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x052e
        L_0x00de:
            java.lang.String r0 = "ZM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 4, 2, 2, 2} // fill-array
            return r3
        L_0x00ec:
            java.lang.String r0 = "ZA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 2, 2, 1, 1, 2} // fill-array
            return r3
        L_0x00fa:
            java.lang.String r0 = "YT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0721
        L_0x0104:
            java.lang.String r0 = "YE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x010e:
            java.lang.String r0 = "XK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0bcf
        L_0x0118:
            java.lang.String r0 = "WS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 3, 1, 2, 2} // fill-array
            return r3
        L_0x0126:
            java.lang.String r0 = "WF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0763
        L_0x0130:
            java.lang.String r0 = "VU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0868
        L_0x013a:
            java.lang.String r0 = "VN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 3, 3, 4, 2, 2} // fill-array
            return r3
        L_0x0148:
            java.lang.String r0 = "VI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0876
        L_0x0152:
            java.lang.String r0 = "VG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0160:
            java.lang.String r0 = "VE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x016a:
            java.lang.String r0 = "VC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x0174:
            java.lang.String r0 = "VA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09cd
        L_0x017e:
            java.lang.String r0 = "UZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 3, 4, 2, 2} // fill-array
            return r3
        L_0x018c:
            java.lang.String r0 = "UY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x06df
        L_0x0196:
            java.lang.String r0 = "US"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 0, 2, 2, 3, 1} // fill-array
            return r3
        L_0x01a4:
            java.lang.String r0 = "UG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x02e5
        L_0x01ae:
            java.lang.String r0 = "UA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x077f
        L_0x01b8:
            java.lang.String r0 = "TZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 4, 3, 2, 2, 2} // fill-array
            return r3
        L_0x01c6:
            java.lang.String r0 = "TW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x094a
        L_0x01d0:
            java.lang.String r0 = "TV"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0763
        L_0x01da:
            java.lang.String r0 = "TT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 4, 1, 3, 2, 2} // fill-array
            return r3
        L_0x01e8:
            java.lang.String r0 = "TR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 1, 0, 0, 2, 2} // fill-array
            return r3
        L_0x01f6:
            java.lang.String r0 = "TO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0aef
        L_0x0200:
            java.lang.String r0 = "TN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x06df
        L_0x020a:
            java.lang.String r0 = "TM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0333
        L_0x0214:
            java.lang.String r0 = "TL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09f7
        L_0x021e:
            java.lang.String r0 = "TK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 2, 4, 2, 2} // fill-array
            return r3
        L_0x022c:
            java.lang.String r0 = "TJ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09f7
        L_0x0236:
            java.lang.String r0 = "TH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 2, 2, 3, 3, 4} // fill-array
            return r3
        L_0x0244:
            java.lang.String r0 = "TG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x08b4
        L_0x024e:
            java.lang.String r0 = "TD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x0258:
            java.lang.String r0 = "TC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0281
        L_0x0261:
            java.lang.String r0 = "SZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 3, 4, 2, 2} // fill-array
            return r3
        L_0x026f:
            java.lang.String r0 = "SY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09f7
        L_0x0279:
            java.lang.String r0 = "SX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0281:
            int[] r3 = new int[r2]
            r3 = {1, 2, 1, 0, 2, 2} // fill-array
            return r3
        L_0x0287:
            java.lang.String r0 = "SV"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0488
        L_0x0291:
            java.lang.String r0 = "ST"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 1, 2, 2, 2} // fill-array
            return r3
        L_0x029f:
            java.lang.String r0 = "SS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 3, 2, 3, 2, 2} // fill-array
            return r3
        L_0x02ad:
            java.lang.String r0 = "SR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 3, 0, 2, 2} // fill-array
            return r3
        L_0x02bb:
            java.lang.String r0 = "SO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0aef
        L_0x02c5:
            java.lang.String r0 = "SN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 4, 4, 3, 2, 2} // fill-array
            return r3
        L_0x02d3:
            java.lang.String r0 = "SM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0ba5
        L_0x02dd:
            java.lang.String r0 = "SL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x02e5:
            int[] r3 = new int[r2]
            r3 = {3, 3, 4, 3, 2, 2} // fill-array
            return r3
        L_0x02eb:
            java.lang.String r0 = "SK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0ab7
        L_0x02f5:
            java.lang.String r0 = "SI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0812
        L_0x02ff:
            java.lang.String r0 = "SH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x092e
        L_0x0309:
            java.lang.String r0 = "SG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 1, 2, 2, 2, 1} // fill-array
            return r3
        L_0x0317:
            java.lang.String r0 = "SE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x094a
        L_0x0321:
            java.lang.String r0 = "SD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x032b:
            java.lang.String r0 = "SC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0333:
            int[] r3 = new int[r2]
            r3 = {4, 2, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0339:
            java.lang.String r0 = "SB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 2, 4, 3, 2, 2} // fill-array
            return r3
        L_0x0347:
            java.lang.String r0 = "SA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0355:
            java.lang.String r0 = "RW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 4, 2, 0, 2, 2} // fill-array
            return r3
        L_0x0363:
            java.lang.String r0 = "RU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 0, 0, 0, 4, 3} // fill-array
            return r3
        L_0x0371:
            java.lang.String r0 = "RS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x05c5
        L_0x037b:
            java.lang.String r0 = "RO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 1, 2, 1, 2} // fill-array
            return r3
        L_0x0389:
            java.lang.String r0 = "RE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x05a9
        L_0x0393:
            java.lang.String r0 = "QA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 4, 4, 4, 2} // fill-array
            return r3
        L_0x03a1:
            java.lang.String r0 = "PW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 4, 1, 2, 2} // fill-array
            return r3
        L_0x03af:
            java.lang.String r0 = "PT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x094a
        L_0x03b9:
            java.lang.String r0 = "PS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 4, 1, 2, 2, 2} // fill-array
            return r3
        L_0x03c7:
            java.lang.String r0 = "PR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 0, 2, 1, 2, 1} // fill-array
            return r3
        L_0x03d5:
            java.lang.String r0 = "PM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0ba5
        L_0x03df:
            java.lang.String r0 = "PL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x043d
        L_0x03e8:
            java.lang.String r0 = "PK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0aef
        L_0x03f2:
            java.lang.String r0 = "PH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 1, 3, 3, 3, 0} // fill-array
            return r3
        L_0x0400:
            java.lang.String r0 = "PG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0579
        L_0x040a:
            java.lang.String r0 = "PF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a4b
        L_0x0414:
            java.lang.String r0 = "PE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x07f6
        L_0x041e:
            java.lang.String r0 = "PA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0488
        L_0x0427:
            java.lang.String r0 = "OM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 3, 1, 3, 4, 2} // fill-array
            return r3
        L_0x0435:
            java.lang.String r0 = "NZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x043d:
            int[] r3 = new int[r2]
            r3 = {1, 1, 2, 2, 4, 2} // fill-array
            return r3
        L_0x0443:
            java.lang.String r0 = "NU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0454
        L_0x044c:
            java.lang.String r0 = "NR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0454:
            int[] r3 = new int[r2]
            r3 = {4, 2, 2, 1, 2, 2} // fill-array
            return r3
        L_0x045a:
            java.lang.String r0 = "NP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 2, 4, 3, 2, 2} // fill-array
            return r3
        L_0x0468:
            java.lang.String r0 = "NO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09b1
        L_0x0472:
            java.lang.String r0 = "NL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 2, 2, 3, 0, 3} // fill-array
            return r3
        L_0x0480:
            java.lang.String r0 = "NI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0488:
            int[] r3 = new int[r2]
            r3 = {2, 3, 3, 3, 2, 2} // fill-array
            return r3
        L_0x048e:
            java.lang.String r0 = "NG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 4, 2, 1, 2, 2} // fill-array
            return r3
        L_0x049c:
            java.lang.String r0 = "NE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x04a6:
            java.lang.String r0 = "NC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 4, 4, 2, 2} // fill-array
            return r3
        L_0x04b4:
            java.lang.String r0 = "NA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0868
        L_0x04be:
            java.lang.String r0 = "MZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 2, 1, 2, 2} // fill-array
            return r3
        L_0x04cc:
            java.lang.String r0 = "MY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 0, 3, 1, 3, 2} // fill-array
            return r3
        L_0x04da:
            java.lang.String r0 = "MX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 3, 4, 2, 2} // fill-array
            return r3
        L_0x04e8:
            java.lang.String r0 = "MW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 2, 3, 3, 2, 2} // fill-array
            return r3
        L_0x04f6:
            java.lang.String r0 = "MV"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 4, 1, 4, 2, 2} // fill-array
            return r3
        L_0x0504:
            java.lang.String r0 = "MU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 1, 2, 2, 2} // fill-array
            return r3
        L_0x0512:
            java.lang.String r0 = "MT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0ab7
        L_0x051c:
            java.lang.String r0 = "MS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0ba5
        L_0x0526:
            java.lang.String r0 = "MR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x052e:
            int[] r3 = new int[r2]
            r3 = {4, 2, 4, 4, 2, 2} // fill-array
            return r3
        L_0x0534:
            java.lang.String r0 = "MQ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x082e
        L_0x053e:
            java.lang.String r0 = "MP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x054f
        L_0x0547:
            java.lang.String r0 = "MO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x054f:
            int[] r3 = new int[r2]
            r3 = {0, 2, 4, 4, 2, 2} // fill-array
            return r3
        L_0x0555:
            java.lang.String r0 = "MN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 0, 1, 2, 2, 2} // fill-array
            return r3
        L_0x0563:
            java.lang.String r0 = "MM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 2, 3, 2, 2} // fill-array
            return r3
        L_0x0571:
            java.lang.String r0 = "ML"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0579:
            int[] r3 = new int[r2]
            r3 = {4, 3, 3, 2, 2, 2} // fill-array
            return r3
        L_0x057f:
            java.lang.String r0 = "MK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 0, 0, 1, 3, 2} // fill-array
            return r3
        L_0x058d:
            java.lang.String r0 = "MH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0763
        L_0x0597:
            java.lang.String r0 = "MG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x05a1:
            java.lang.String r0 = "MF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x05a9:
            int[] r3 = new int[r2]
            r3 = {1, 2, 1, 2, 2, 2} // fill-array
            return r3
        L_0x05af:
            java.lang.String r0 = "ME"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 0, 0, 1, 2, 2} // fill-array
            return r3
        L_0x05bd:
            java.lang.String r0 = "MD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x05c5:
            int[] r3 = new int[r2]
            r3 = {1, 0, 0, 0, 2, 2} // fill-array
            return r3
        L_0x05cb:
            java.lang.String r0 = "MC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 2, 2, 0, 2, 2} // fill-array
            return r3
        L_0x05d9:
            java.lang.String r0 = "MA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 1, 1, 2, 2} // fill-array
            return r3
        L_0x05e7:
            java.lang.String r0 = "LY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0aef
        L_0x05f1:
            java.lang.String r0 = "LV"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x094a
        L_0x05fb:
            java.lang.String r0 = "LU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 0, 3, 2, 1, 4} // fill-array
            return r3
        L_0x0609:
            java.lang.String r0 = "LT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 0, 2, 2} // fill-array
            return r3
        L_0x0617:
            java.lang.String r0 = "LS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 2, 2, 2, 2} // fill-array
            return r3
        L_0x0625:
            java.lang.String r0 = "LR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0966
        L_0x062f:
            java.lang.String r0 = "LK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 3, 3, 4, 2} // fill-array
            return r3
        L_0x063d:
            java.lang.String r0 = "LI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0ba5
        L_0x0647:
            java.lang.String r0 = "LC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x0651:
            java.lang.String r0 = "LB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 2, 4, 2, 2} // fill-array
            return r3
        L_0x065f:
            java.lang.String r0 = "LA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 2, 1, 3, 2, 2} // fill-array
            return r3
        L_0x066d:
            java.lang.String r0 = "KZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 1, 2, 2, 2, 2} // fill-array
            return r3
        L_0x067b:
            java.lang.String r0 = "KY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x0685:
            java.lang.String r0 = "KW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09bf
        L_0x068f:
            java.lang.String r0 = "KR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 1, 3, 4, 4} // fill-array
            return r3
        L_0x069d:
            java.lang.String r0 = "KP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x08e8
        L_0x06a7:
            java.lang.String r0 = "KN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x06b1:
            java.lang.String r0 = "KM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x06bb:
            java.lang.String r0 = "KI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x06c3:
            int[] r3 = new int[r2]
            r3 = {4, 2, 4, 2, 2, 2} // fill-array
            return r3
        L_0x06c9:
            java.lang.String r0 = "KH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 1, 4, 2, 2, 2} // fill-array
            return r3
        L_0x06d7:
            java.lang.String r0 = "KG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x06df:
            int[] r3 = new int[r2]
            r3 = {2, 1, 1, 1, 2, 2} // fill-array
            return r3
        L_0x06e5:
            java.lang.String r0 = "KE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x08e8
        L_0x06ef:
            java.lang.String r0 = "JP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 1, 2, 2, 4} // fill-array
            return r3
        L_0x06fd:
            java.lang.String r0 = "JO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 1, 1, 2, 2, 2} // fill-array
            return r3
        L_0x070b:
            java.lang.String r0 = "JM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 3, 2, 2, 2} // fill-array
            return r3
        L_0x0719:
            java.lang.String r0 = "JE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0721:
            int[] r3 = new int[r2]
            r3 = {4, 2, 2, 3, 2, 2} // fill-array
            return r3
        L_0x0727:
            java.lang.String r0 = "IT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 1, 1, 2} // fill-array
            return r3
        L_0x0735:
            java.lang.String r0 = "IS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x094a
        L_0x073f:
            java.lang.String r0 = "IR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 0, 1, 1, 4, 1} // fill-array
            return r3
        L_0x074d:
            java.lang.String r0 = "IQ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 2, 2, 3, 2, 2} // fill-array
            return r3
        L_0x075b:
            java.lang.String r0 = "IO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0763:
            int[] r3 = new int[r2]
            r3 = {4, 2, 2, 4, 2, 2} // fill-array
            return r3
        L_0x0769:
            java.lang.String r0 = "IN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 1, 3, 2, 3, 3} // fill-array
            return r3
        L_0x0777:
            java.lang.String r0 = "IM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x077f:
            int[] r3 = new int[r2]
            r3 = {0, 2, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0785:
            java.lang.String r0 = "IL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a3d
        L_0x078f:
            java.lang.String r0 = "IE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0920
        L_0x0799:
            java.lang.String r0 = "ID"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 2, 2, 3, 2} // fill-array
            return r3
        L_0x07a7:
            java.lang.String r0 = "HU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 1, 3, 2} // fill-array
            return r3
        L_0x07b5:
            java.lang.String r0 = "HT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0a9b
        L_0x07bf:
            java.lang.String r0 = "HR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0812
        L_0x07c8:
            java.lang.String r0 = "HK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 2, 3, 2, 0} // fill-array
            return r3
        L_0x07d6:
            java.lang.String r0 = "GY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 2, 2, 1, 2, 2} // fill-array
            return r3
        L_0x07e4:
            java.lang.String r0 = "GW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x093c
        L_0x07ee:
            java.lang.String r0 = "GU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x07f6:
            int[] r3 = new int[r2]
            r3 = {1, 2, 4, 4, 4, 2} // fill-array
            return r3
        L_0x07fc:
            java.lang.String r0 = "GT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 3, 2, 2, 2, 2} // fill-array
            return r3
        L_0x080a:
            java.lang.String r0 = "GR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0812:
            int[] r3 = new int[r2]
            r3 = {1, 0, 0, 0, 1, 2} // fill-array
            return r3
        L_0x0818:
            java.lang.String r0 = "GQ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 2, 1, 4, 2, 2} // fill-array
            return r3
        L_0x0826:
            java.lang.String r0 = "GP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x082e:
            int[] r3 = new int[r2]
            r3 = {2, 1, 2, 3, 2, 2} // fill-array
            return r3
        L_0x0834:
            java.lang.String r0 = "GN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 3, 4, 2, 2, 2} // fill-array
            return r3
        L_0x0842:
            java.lang.String r0 = "GM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b27
        L_0x084c:
            java.lang.String r0 = "GL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x0856:
            java.lang.String r0 = "GI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b89
        L_0x0860:
            java.lang.String r0 = "GH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0868:
            int[] r3 = new int[r2]
            r3 = {3, 3, 3, 2, 2, 2} // fill-array
            return r3
        L_0x086e:
            java.lang.String r0 = "GG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0876:
            int[] r3 = new int[r2]
            r3 = {0, 2, 0, 1, 2, 2} // fill-array
            return r3
        L_0x087c:
            java.lang.String r0 = "GF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0aef
        L_0x0886:
            java.lang.String r0 = "GE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 1, 1, 2, 2, 2} // fill-array
            return r3
        L_0x0894:
            java.lang.String r0 = "GD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x089e:
            java.lang.String r0 = "GB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 1, 1, 1, 1} // fill-array
            return r3
        L_0x08ac:
            java.lang.String r0 = "GA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x08b4:
            int[] r3 = new int[r2]
            r3 = {3, 4, 1, 0, 2, 2} // fill-array
            return r3
        L_0x08ba:
            java.lang.String r0 = "FR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 2, 3, 1, 0, 2} // fill-array
            return r3
        L_0x08c8:
            java.lang.String r0 = "FO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b89
        L_0x08d2:
            java.lang.String r0 = "FM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 2, 4, 1, 2, 2} // fill-array
            return r3
        L_0x08e0:
            java.lang.String r0 = "FK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x08e8:
            int[] r3 = new int[r2]
            r3 = {3, 2, 2, 2, 2, 2} // fill-array
            return r3
        L_0x08ee:
            java.lang.String r0 = "FJ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 2, 2, 2, 2} // fill-array
            return r3
        L_0x08fc:
            java.lang.String r0 = "FI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 3, 0, 2} // fill-array
            return r3
        L_0x090a:
            java.lang.String r0 = "ET"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 3, 3, 1, 2, 2} // fill-array
            return r3
        L_0x0918:
            java.lang.String r0 = "ES"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0920:
            int[] r3 = new int[r2]
            r3 = {0, 1, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0926:
            java.lang.String r0 = "ER"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x092e:
            int[] r3 = new int[r2]
            r3 = {4, 2, 2, 2, 2, 2} // fill-array
            return r3
        L_0x0934:
            java.lang.String r0 = "EG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x093c:
            int[] r3 = new int[r2]
            r3 = {3, 4, 3, 3, 2, 2} // fill-array
            return r3
        L_0x0942:
            java.lang.String r0 = "EE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x094a:
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 0, 0, 2} // fill-array
            return r3
        L_0x0950:
            java.lang.String r0 = "EC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 3, 2, 1, 2, 2} // fill-array
            return r3
        L_0x095e:
            java.lang.String r0 = "DZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0966:
            int[] r3 = new int[r2]
            r3 = {3, 4, 4, 4, 2, 2} // fill-array
            return r3
        L_0x096c:
            java.lang.String r0 = "DO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 4, 4, 4, 4, 2} // fill-array
            return r3
        L_0x097a:
            java.lang.String r0 = "DM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b89
        L_0x0984:
            java.lang.String r0 = "DK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 0, 3, 2, 0, 2} // fill-array
            return r3
        L_0x0992:
            java.lang.String r0 = "DJ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x09f7
        L_0x099b:
            java.lang.String r0 = "DE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 2, 2, 2, 3} // fill-array
            return r3
        L_0x09a9:
            java.lang.String r0 = "CZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x09b1:
            int[] r3 = new int[r2]
            r3 = {0, 0, 2, 0, 1, 2} // fill-array
            return r3
        L_0x09b7:
            java.lang.String r0 = "CY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x09bf:
            int[] r3 = new int[r2]
            r3 = {1, 0, 0, 0, 0, 2} // fill-array
            return r3
        L_0x09c5:
            java.lang.String r0 = "CX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x09cd:
            int[] r3 = new int[r2]
            r3 = {1, 2, 2, 2, 2, 2} // fill-array
            return r3
        L_0x09d3:
            java.lang.String r0 = "CW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x09db:
            int[] r3 = new int[r2]
            r3 = {2, 2, 0, 0, 2, 2} // fill-array
            return r3
        L_0x09e1:
            java.lang.String r0 = "CV"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 1, 0, 0, 2, 2} // fill-array
            return r3
        L_0x09ef:
            java.lang.String r0 = "CU"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x09f7:
            int[] r3 = new int[r2]
            r3 = {4, 3, 4, 4, 2, 2} // fill-array
            return r3
        L_0x09fd:
            java.lang.String r0 = "CR"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 3, 4, 4, 2, 2} // fill-array
            return r3
        L_0x0a0b:
            java.lang.String r0 = "CO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 3, 4, 3, 2, 2} // fill-array
            return r3
        L_0x0a19:
            java.lang.String r0 = "CN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 0, 1, 1, 3, 2} // fill-array
            return r3
        L_0x0a27:
            java.lang.String r0 = "CM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 3, 3, 3, 2, 2} // fill-array
            return r3
        L_0x0a35:
            java.lang.String r0 = "CL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0a3d:
            int[] r3 = new int[r2]
            r3 = {1, 2, 2, 2, 3, 2} // fill-array
            return r3
        L_0x0a43:
            java.lang.String r0 = "CK"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0a4b:
            int[] r3 = new int[r2]
            r3 = {2, 2, 2, 1, 2, 2} // fill-array
            return r3
        L_0x0a51:
            java.lang.String r0 = "CD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 2, 3, 2, 2, 2} // fill-array
            return r3
        L_0x0a5f:
            java.lang.String r0 = "CA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 2, 2, 2, 3, 2} // fill-array
            return r3
        L_0x0a6d:
            java.lang.String r0 = "BW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 2, 1, 0, 2, 2} // fill-array
            return r3
        L_0x0a7b:
            java.lang.String r0 = "BQ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            goto L_0x0b43
        L_0x0a85:
            java.lang.String r0 = "BJ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 4, 3, 3, 2, 2} // fill-array
            return r3
        L_0x0a93:
            java.lang.String r0 = "BI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0a9b:
            int[] r3 = new int[r2]
            r3 = {4, 4, 4, 4, 2, 2} // fill-array
            return r3
        L_0x0aa1:
            java.lang.String r0 = "BH"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 2, 1, 3, 4, 2} // fill-array
            return r3
        L_0x0aaf:
            java.lang.String r0 = "BG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0ab7:
            int[] r3 = new int[r2]
            r3 = {0, 0, 0, 0, 1, 2} // fill-array
            return r3
        L_0x0abd:
            java.lang.String r0 = "BF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 3, 4, 3, 2, 2} // fill-array
            return r3
        L_0x0acb:
            java.lang.String r0 = "BE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 4, 4, 3, 2} // fill-array
            return r3
        L_0x0ad9:
            java.lang.String r0 = "BD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 1, 3, 3, 2, 2} // fill-array
            return r3
        L_0x0ae7:
            java.lang.String r0 = "AZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0aef:
            int[] r3 = new int[r2]
            r3 = {3, 2, 3, 3, 2, 2} // fill-array
            return r3
        L_0x0af5:
            java.lang.String r0 = "AO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 4, 3, 2, 2, 2} // fill-array
            return r3
        L_0x0b03:
            java.lang.String r0 = "AI"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 2, 0, 3, 2, 2} // fill-array
            return r3
        L_0x0b11:
            java.lang.String r0 = "AG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 1, 2, 2, 2} // fill-array
            return r3
        L_0x0b1f:
            java.lang.String r0 = "AF"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0b27:
            int[] r3 = new int[r2]
            r3 = {4, 3, 3, 4, 2, 2} // fill-array
            return r3
        L_0x0b2d:
            java.lang.String r0 = "AE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 4, 4, 4, 4, 0} // fill-array
            return r3
        L_0x0b3b:
            java.lang.String r0 = "AD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0b43:
            int[] r3 = new int[r2]
            r3 = {1, 2, 0, 0, 2, 2} // fill-array
            return r3
        L_0x0b49:
            java.lang.String r0 = "BZ"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 4, 2, 1, 2, 2} // fill-array
            return r3
        L_0x0b57:
            java.lang.String r0 = "BY"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {0, 1, 2, 3, 2, 2} // fill-array
            return r3
        L_0x0b65:
            java.lang.String r0 = "BT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {3, 1, 3, 2, 2, 2} // fill-array
            return r3
        L_0x0b73:
            java.lang.String r0 = "BS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {4, 4, 2, 2, 2, 2} // fill-array
            return r3
        L_0x0b81:
            java.lang.String r0 = "BB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0b89:
            int[] r3 = new int[r2]
            r3 = {0, 2, 0, 0, 2, 2} // fill-array
            return r3
        L_0x0b8f:
            java.lang.String r0 = "BA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 2, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0b9d:
            java.lang.String r0 = "AX"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0ba5:
            int[] r3 = new int[r2]
            r3 = {0, 2, 2, 2, 2, 2} // fill-array
            return r3
        L_0x0bab:
            java.lang.String r0 = "AW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {1, 3, 4, 4, 2, 2} // fill-array
            return r3
        L_0x0bb9:
            java.lang.String r0 = "AM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
            int[] r3 = new int[r2]
            r3 = {2, 3, 2, 3, 2, 2} // fill-array
            return r3
        L_0x0bc7:
            java.lang.String r0 = "AL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0bd5
        L_0x0bcf:
            int[] r3 = new int[r2]
            r3 = {1, 1, 1, 1, 2, 2} // fill-array
            return r3
        L_0x0bd5:
            int[] r3 = new int[r2]
            r3 = {2, 2, 2, 2, 2, 2} // fill-array
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p151k.C3244j.m9456h(java.lang.String):int[]");
    }

    /* renamed from: i */
    private final long m9457i(int i) {
        Long l = (Long) this.f9753i.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.f9753i.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: j */
    private final void m9458j(int i, long j, long j2) {
        if (i == 0) {
            i = 0;
            if (j == 0) {
                if (j2 != this.f9763s) {
                    j = 0;
                } else {
                    return;
                }
            }
        }
        this.f9763s = j2;
        Iterator it = this.f9752g.f9739a.iterator();
        while (it.hasNext()) {
            C3237c cVar = (C3237c) it.next();
            if (!cVar.f9738c) {
                cVar.f9736a.post(new C3236b(cVar, i, j, j2));
            }
        }
    }

    /* renamed from: k */
    private static boolean m9459k(C2510n nVar, boolean z) {
        return z && !nVar.mo5938c(8);
    }

    /* renamed from: a */
    public final synchronized void mo5923a(C2505i iVar, C2510n nVar, boolean z, int i) {
        if (m9459k(nVar, z)) {
            this.f9758n += (long) i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo5924b(C2505i iVar, C2510n nVar, boolean z) {
        C3234ab abVar;
        float f;
        if (m9459k(nVar, z)) {
            int i = 0;
            C2601a.m6832d(this.f9756l > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.f9757m);
            this.f9760p += (long) i2;
            long j = this.f9761q;
            long j2 = this.f9758n;
            this.f9761q = j + j2;
            if (i2 > 0) {
                float f2 = (((float) j2) * 8000.0f) / ((float) i2);
                C3235ac acVar = this.f9754j;
                int sqrt = (int) Math.sqrt((double) j2);
                if (acVar.f9728e != 1) {
                    Collections.sort(acVar.f9726c, C3235ac.f9724a);
                    acVar.f9728e = 1;
                }
                int i3 = acVar.f9731h;
                if (i3 > 0) {
                    C3234ab[] abVarArr = acVar.f9727d;
                    int i4 = i3 - 1;
                    acVar.f9731h = i4;
                    abVar = abVarArr[i4];
                } else {
                    abVar = new C3234ab();
                }
                int i5 = acVar.f9729f;
                acVar.f9729f = i5 + 1;
                abVar.f9721a = i5;
                abVar.f9722b = sqrt;
                abVar.f9723c = f2;
                acVar.f9726c.add(abVar);
                acVar.f9730g += sqrt;
                while (true) {
                    int i6 = acVar.f9730g;
                    if (i6 <= 2000) {
                        break;
                    }
                    int i7 = i6 - 2000;
                    C3234ab abVar2 = (C3234ab) acVar.f9726c.get(0);
                    int i8 = abVar2.f9722b;
                    if (i8 <= i7) {
                        acVar.f9730g -= i8;
                        acVar.f9726c.remove(0);
                        int i9 = acVar.f9731h;
                        if (i9 < 5) {
                            C3234ab[] abVarArr2 = acVar.f9727d;
                            acVar.f9731h = i9 + 1;
                            abVarArr2[i9] = abVar2;
                        }
                    } else {
                        abVar2.f9722b = i8 - i7;
                        acVar.f9730g -= i7;
                    }
                }
                if (this.f9760p >= 2000 || this.f9761q >= 524288) {
                    C3235ac acVar2 = this.f9754j;
                    if (acVar2.f9728e != 0) {
                        Collections.sort(acVar2.f9726c, C3235ac.f9725b);
                        acVar2.f9728e = 0;
                    }
                    float f3 = ((float) acVar2.f9730g) * 0.5f;
                    int i10 = 0;
                    while (true) {
                        if (i < acVar2.f9726c.size()) {
                            C3234ab abVar3 = (C3234ab) acVar2.f9726c.get(i);
                            i10 += abVar3.f9722b;
                            if (((float) i10) >= f3) {
                                f = abVar3.f9723c;
                                break;
                            }
                            i++;
                        } else if (acVar2.f9726c.isEmpty()) {
                            f = Float.NaN;
                        } else {
                            ArrayList arrayList = acVar2.f9726c;
                            f = ((C3234ab) arrayList.get(arrayList.size() - 1)).f9723c;
                        }
                    }
                    this.f9762r = (long) f;
                }
                m9458j(i2, this.f9758n, this.f9762r);
                this.f9757m = elapsedRealtime;
                this.f9758n = 0;
            }
            this.f9756l--;
        }
    }

    /* renamed from: c */
    public final void mo5925c(C2505i iVar, C2510n nVar, boolean z) {
    }

    /* renamed from: d */
    public final synchronized void mo5926d(C2505i iVar, C2510n nVar, boolean z) {
        if (m9459k(nVar, z)) {
            if (this.f9756l == 0) {
                this.f9757m = SystemClock.elapsedRealtime();
            }
            this.f9756l++;
        }
    }

    /* renamed from: e */
    public final synchronized long mo7233e() {
        return this.f9762r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7241g(int r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f9759o     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r9.f9755k     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            monitor-exit(r9)
            return
        L_0x000c:
            if (r0 != r10) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            r9.f9759o = r10     // Catch:{ all -> 0x0057 }
            r0 = 1
            if (r10 == r0) goto L_0x0055
            if (r10 == 0) goto L_0x0055
            r0 = 8
            if (r10 != r0) goto L_0x001c
            goto L_0x0055
        L_0x001c:
            long r0 = r9.m9457i(r10)     // Catch:{ all -> 0x0057 }
            r9.f9762r = r0     // Catch:{ all -> 0x0057 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0057 }
            int r10 = r9.f9756l     // Catch:{ all -> 0x0057 }
            r2 = 0
            if (r10 <= 0) goto L_0x0032
            long r3 = r9.f9757m     // Catch:{ all -> 0x0057 }
            long r3 = r0 - r3
            int r10 = (int) r3     // Catch:{ all -> 0x0057 }
            r4 = r10
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            long r5 = r9.f9758n     // Catch:{ all -> 0x0057 }
            long r7 = r9.f9762r     // Catch:{ all -> 0x0057 }
            r3 = r9
            r3.m9458j(r4, r5, r7)     // Catch:{ all -> 0x0057 }
            r9.f9757m = r0     // Catch:{ all -> 0x0057 }
            r0 = 0
            r9.f9758n = r0     // Catch:{ all -> 0x0057 }
            r9.f9761q = r0     // Catch:{ all -> 0x0057 }
            r9.f9760p = r0     // Catch:{ all -> 0x0057 }
            androidx.media3.exoplayer.k.ac r10 = r9.f9754j     // Catch:{ all -> 0x0057 }
            java.util.ArrayList r0 = r10.f9726c     // Catch:{ all -> 0x0057 }
            r0.clear()     // Catch:{ all -> 0x0057 }
            r0 = -1
            r10.f9728e = r0     // Catch:{ all -> 0x0057 }
            r10.f9729f = r2     // Catch:{ all -> 0x0057 }
            r10.f9730g = r2     // Catch:{ all -> 0x0057 }
            monitor-exit(r9)
            return
        L_0x0055:
            monitor-exit(r9)
            return
        L_0x0057:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p151k.C3244j.mo7241g(int):void");
    }

    public C3244j(Context context, Map map, boolean z) {
        this.f9753i = C58495hd.m89898l(map);
        this.f9752g = new C3238d();
        this.f9754j = new C3235ac();
        this.f9755k = z;
        if (context != null) {
            C2602aa b = C2602aa.m6836b(context);
            int a = b.mo6114a();
            this.f9759o = a;
            this.f9762r = m9457i(a);
            C3242h hVar = new C3242h(this);
            Iterator it = b.f7227b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    b.f7227b.remove(weakReference);
                }
            }
            b.f7227b.add(new WeakReference(hVar));
            b.f7226a.post(new C2636x(b, hVar));
            return;
        }
        this.f9759o = 0;
        this.f9762r = m9457i(0);
    }

    /* renamed from: f */
    public static synchronized C3244j m9455f(Context context) {
        C3244j jVar;
        Context context2;
        synchronized (C3244j.class) {
            if (f9751h == null) {
                if (context == null) {
                    context2 = null;
                } else {
                    context2 = context.getApplicationContext();
                }
                int[] h = m9456h(C2612ak.m6933P(context));
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                C58485gu guVar = f9745a;
                hashMap.put(2, (Long) guVar.get(h[0]));
                hashMap.put(3, (Long) f9746b.get(h[1]));
                hashMap.put(4, (Long) f9747c.get(h[2]));
                hashMap.put(5, (Long) f9748d.get(h[3]));
                hashMap.put(10, (Long) f9749e.get(h[4]));
                hashMap.put(9, (Long) f9750f.get(h[5]));
                hashMap.put(7, (Long) guVar.get(h[0]));
                f9751h = C3243i.m9454a(context2, hashMap);
            }
            jVar = f9751h;
        }
        return jVar;
    }
}
