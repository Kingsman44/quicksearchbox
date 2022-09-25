package com.facebook.litho;

import android.graphics.Rect;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.p098j.C2043bi;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.widget.C6457bp;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
public class ComponentTree {

    /* renamed from: M */
    private static final AtomicInteger f17866M = new AtomicInteger(0);

    /* renamed from: N */
    private static volatile Looper f17867N = null;

    /* renamed from: a */
    public static final String f17868a = "ComponentTree";

    /* renamed from: b */
    public static final ThreadLocal f17869b = new ThreadLocal();

    /* renamed from: A */
    public int f17870A = -1;

    /* renamed from: B */
    public C6187dg f17871B;

    /* renamed from: C */
    public C6187dg f17872C;

    /* renamed from: D */
    public C6280fw f17873D;

    /* renamed from: E */
    public C6266fi f17874E;

    /* renamed from: F */
    protected final int f17875F;

    /* renamed from: G */
    public final C6144by f17876G;

    /* renamed from: H */
    public final C6156cd f17877H = new C6156cd();

    /* renamed from: I */
    public final boolean f17878I;

    /* renamed from: J */
    public final String f17879J;

    /* renamed from: K */
    public volatile C6457bp f17880K;

    /* renamed from: L */
    public final C21215m f17881L;

    /* renamed from: O */
    private String f17882O;

    /* renamed from: P */
    private volatile C6146c f17883P;

    /* renamed from: Q */
    private Deque f17884Q;

    /* renamed from: R */
    private C6114ay f17885R;

    /* renamed from: S */
    private int f17886S;

    /* renamed from: T */
    private final C6174cv f17887T;

    /* renamed from: U */
    private final boolean f17888U;

    /* renamed from: V */
    private C6193dm f17889V = new C6192dl(Looper.getMainLooper());

    /* renamed from: W */
    private final Runnable f17890W = new C6094ae(this);

    /* renamed from: X */
    private final Object f17891X = new Object();

    /* renamed from: Y */
    private final List f17892Y = new ArrayList();

    /* renamed from: Z */
    private int f17893Z = -1;

    /* renamed from: aa */
    private int f17894aa;

    /* renamed from: ab */
    private int f17895ab = -1;

    /* renamed from: ac */
    private C6381hf f17896ac;

    /* renamed from: ad */
    private int f17897ad = -1;

    /* renamed from: ae */
    private final C6158cf f17898ae = new C6158cf();

    /* renamed from: af */
    private final C6392hq f17899af = new C6392hq();

    /* renamed from: c */
    public final boolean f17900c;

    /* renamed from: d */
    public boolean f17901d;

    /* renamed from: e */
    public final C6175cw f17902e = new C6175cw();

    /* renamed from: f */
    public C6202dv f17903f;

    /* renamed from: g */
    public List f17904g;

    /* renamed from: h */
    public final Object f17905h = new Object();

    /* renamed from: i */
    public C6101al f17906i;

    /* renamed from: j */
    public final C6411u f17907j;

    /* renamed from: k */
    public boolean f17908k;

    /* renamed from: l */
    public boolean f17909l;

    /* renamed from: m */
    public final boolean f17910m;

    /* renamed from: n */
    public final boolean f17911n;

    /* renamed from: o */
    public boolean f17912o;

    /* renamed from: p */
    public final boolean f17913p;

    /* renamed from: q */
    public LithoView f17914q;

    /* renamed from: r */
    public C6193dm f17915r;

    /* renamed from: s */
    public final Object f17916s = new Object();

    /* renamed from: t */
    public C6096ag f17917t;

    /* renamed from: u */
    public volatile boolean f17918u;

    /* renamed from: v */
    public volatile boolean f17919v;

    /* renamed from: w */
    C6358gk f17920w;

    /* renamed from: x */
    C6358gk f17921x;

    /* renamed from: y */
    public C6407q f17922y;

    /* renamed from: z */
    public int f17923z = -1;

    protected ComponentTree(C6095af afVar) {
        boolean z;
        C6411u uVar = new C6411u(afVar.f17995a, new C6280fw((C6280fw) null), (C6381hf) null, (C6188dh) null);
        uVar.f19017j = this;
        uVar.f19012e = null;
        this.f17907j = uVar;
        this.f17922y = afVar.f17997c;
        if (afVar.f17998d) {
            boolean z2 = C6180a.f18234a;
            z = true;
        } else {
            z = false;
        }
        this.f17910m = z;
        this.f17911n = afVar.f17996b;
        this.f17888U = afVar.f17999e;
        this.f17915r = afVar.f18000f;
        this.f17913p = true;
        this.f17918u = afVar.f18002h;
        this.f17919v = false;
        mo12711g(afVar.f18003i);
        boolean z3 = C6180a.f18234a;
        this.f17878I = afVar.f18004j;
        this.f17876G = afVar.f18005k;
        C6280fw fwVar = afVar.f18001g;
        this.f17873D = fwVar == null ? new C6280fw((C6280fw) null) : fwVar;
        this.f17875F = f17866M.getAndIncrement();
        this.f17887T = new C6174cv(this);
        C6193dm dmVar = this.f17889V;
        C6165cm cmVar = C6166cn.f18209a;
        this.f17889V = dmVar;
        C6193dm dmVar2 = this.f17915r;
        C6275fr frVar = new C6275fr(dmVar2 == null ? new C6192dl(m15675y()) : dmVar2);
        C6165cm cmVar2 = C6166cn.f18209a;
        this.f17915r = frVar;
        this.f17881L = afVar.f18007m;
        this.f17879J = afVar.f18006l;
        this.f17900c = C6116b.m15917a(uVar.f19009b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x014e, code lost:
        if (r12.f17743a.top >= 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01eb, code lost:
        if (r12.f17743a.bottom < r5) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0559, code lost:
        if (r4.f18443i.bottom < r11) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0752, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0753, code lost:
        r2 = false;
        r3 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x08c3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x08c4, code lost:
        r3 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x08c7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x08c8, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x08cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x08cd, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0303 A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0326 A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03b5 A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03c0 A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03df A[SYNTHETIC, Splitter:B:209:0x03df] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055 A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[SYNTHETIC, Splitter:B:26:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04b6 A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x050b A[Catch:{ Exception -> 0x08cc, all -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[SYNTHETIC, Splitter:B:30:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x06d4 A[Catch:{ Exception -> 0x08c3, all -> 0x0752 }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x07c4 A[SYNTHETIC, Splitter:B:407:0x07c4] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x07cf A[Catch:{ Exception -> 0x08c3, all -> 0x0752 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x07e9 A[SYNTHETIC, Splitter:B:421:0x07e9] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x07f8 A[Catch:{ Exception -> 0x08c3, all -> 0x08bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x07f9 A[Catch:{ Exception -> 0x08c3, all -> 0x08bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A[SYNTHETIC, Splitter:B:42:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0863 A[Catch:{ Exception -> 0x08c3, all -> 0x0752 }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0872 A[Catch:{ Exception -> 0x08c3, all -> 0x08bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0876 A[Catch:{ Exception -> 0x08c3, all -> 0x08bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x08c3 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:321:0x0656] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x08cc A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:8:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x08d3 A[Catch:{ all -> 0x08de }] */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x08d6 A[Catch:{ all -> 0x08de }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6 A[SYNTHETIC, Splitter:B:71:0x00c6] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15669A(android.graphics.Rect r32, boolean r33) {
        /*
            r31 = this;
            r1 = r31
            com.facebook.litho.dg r2 = r1.f17871B
            if (r2 != 0) goto L_0x000e
            java.lang.String r2 = f17868a
            java.lang.String r3 = "Main Thread Layout state is not found"
            android.util.Log.w(r2, r3)
            return
        L_0x000e:
            com.facebook.litho.LithoView r3 = r1.f17914q
            boolean r3 = r3.mo12733G()
            r4 = 1
            r1.f17908k = r4
            boolean r5 = r1.f17918u
            if (r5 != 0) goto L_0x001f
            r1.f17919v = r4
            r1.f17918u = r4
        L_0x001f:
            r5 = 0
            r6 = 0
            com.facebook.litho.LithoView r7 = r1.f17914q     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            int r8 = r7.f17945u     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r8 <= 0) goto L_0x004f
            com.facebook.litho.ComponentTree r8 = r7.f17938n     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r8 == 0) goto L_0x004f
            boolean r8 = r8.f17910m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r8 == 0) goto L_0x004f
            boolean r8 = r7.mo12733G()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r8 != 0) goto L_0x003a
            r7 = r2
            r19 = r3
            goto L_0x0870
        L_0x003a:
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r9 = r7.getWidth()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r10 = r7.getHeight()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r8.<init>(r6, r6, r9, r10)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r9 = 0
            goto L_0x0053
        L_0x0049:
            r0 = move-exception
            r3 = r1
            r2 = 0
        L_0x004c:
            r1 = r0
            goto L_0x08e0
        L_0x004f:
            r8 = r32
            r9 = r33
        L_0x0053:
            if (r8 != 0) goto L_0x005b
            android.graphics.Rect r10 = r7.f17941q     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r10.setEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x0060
        L_0x005b:
            android.graphics.Rect r10 = r7.f17941q     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            r10.set(r8)     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
        L_0x0060:
            com.facebook.litho.dz r10 = r7.f17946v     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r10 == 0) goto L_0x0074
            boolean r11 = com.facebook.litho.C6203dw.m16458b(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 == 0) goto L_0x0074
            boolean[] r10 = r10.f18348a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r10 == 0) goto L_0x0074
            boolean r10 = r10[r6]     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r10 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            throw r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0074:
            com.facebook.litho.dz r10 = r7.f17946v     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r10 == 0) goto L_0x00c0
            boolean r11 = com.facebook.litho.C6203dw.m16458b(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 == 0) goto L_0x00c0
            boolean[] r11 = r10.f18348a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 == 0) goto L_0x00c0
            boolean r11 = r11[r6]     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 == 0) goto L_0x00c0
            boolean[] r11 = r10.f18349b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 == 0) goto L_0x00c0
            boolean r11 = r11[r6]     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 != 0) goto L_0x00c0
            android.view.ViewParent r11 = r7.getParent()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 != 0) goto L_0x0097
            goto L_0x00c0
        L_0x0097:
            boolean r12 = r10.f18350c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 != 0) goto L_0x00bf
            boolean r10 = r10.f18351d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r10 == 0) goto L_0x00af
            int r10 = r7.getBottom()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r11.getHeight()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r11 = r11.getPaddingBottom()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r12 - r11
            if (r10 >= r12) goto L_0x00bf
            goto L_0x00c0
        L_0x00af:
            int r10 = r7.getRight()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r11.getWidth()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r11 = r11.getPaddingRight()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r12 - r11
            if (r10 >= r12) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            throw r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x00c0:
            boolean r10 = r7.f17935k     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            r11 = 0
            if (r10 == 0) goto L_0x03df
            boolean r9 = r7.mo12733G()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r9 != 0) goto L_0x00d5
            boolean r9 = r7.mo12734H()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r9 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r9 = 0
            goto L_0x00d6
        L_0x00d5:
            r9 = 1
        L_0x00d6:
            if (r8 == 0) goto L_0x02ff
            if (r9 != 0) goto L_0x02ff
            com.facebook.litho.dn r9 = r7.f17947w     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.b r10 = r9.f18329c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r10 == 0) goto L_0x02d6
            com.facebook.c.i r11 = r9.f18328b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.a r10 = r11.mo12631j(r10)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r10 == 0) goto L_0x02d6
            com.facebook.c.b.b r11 = r9.f18329c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.p313c.p317d.C6039b.m15532a()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r8.toString()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.p313c.C6058q.m15623a()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r11 = r10.f17741b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.a r11 = (com.facebook.p313c.p315b.C6025a) r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.c r12 = r11.f17747e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 != 0) goto L_0x00ff
            com.facebook.c.p r4 = com.facebook.p313c.C6058q.f17821a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x02d3
        L_0x00ff:
            boolean r12 = r8.isEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 == 0) goto L_0x0111
            android.graphics.Rect r12 = r11.f17743a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 == 0) goto L_0x0111
            com.facebook.c.p r4 = com.facebook.p313c.C6058q.f17821a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x02d3
        L_0x0111:
            android.graphics.Rect r12 = r11.f17743a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 != 0) goto L_0x02ac
            boolean r12 = r8.isEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 != 0) goto L_0x02ac
            int r12 = r8.left     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r14 = r11.f17743a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.left     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 != r14) goto L_0x02ac
            int r12 = r8.right     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r14 = r11.f17743a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.right     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r12 == r14) goto L_0x0131
            goto L_0x02ac
        L_0x0131:
            java.lang.Object r12 = r10.f17741b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.a r12 = (com.facebook.p313c.p315b.C6025a) r12     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.c r14 = r12.f17747e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r15 = r14
            com.facebook.litho.dg r15 = (com.facebook.litho.C6187dg) r15     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.ArrayList r15 = r15.f18306k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6 = r14
            com.facebook.litho.dg r6 = (com.facebook.litho.C6187dg) r6     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.ArrayList r6 = r6.f18307l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.mo12586e()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 < 0) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            android.graphics.Rect r5 = r12.f17743a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r5.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 < 0) goto L_0x01d4
        L_0x0150:
            int r5 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 < r14) goto L_0x0155
            goto L_0x0182
        L_0x0155:
            int r5 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r13 = r6.get(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r13 = (com.facebook.p313c.p315b.C6028d) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r13 = r13.f17755c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 < r13) goto L_0x0182
            int r5 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r5 = (com.facebook.p313c.p315b.C6028d) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r4 = r5.f17756d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r16 = r10.mo12573e(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r16 == 0) goto L_0x017a
            r13 = 1
            r10.mo12572d(r4, r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x017b
        L_0x017a:
            r13 = 1
        L_0x017b:
            int r4 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r4 = r4 + r13
            r12.f17749g = r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4 = 1
            goto L_0x0150
        L_0x0182:
            int r4 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 <= 0) goto L_0x01d4
            int r4 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r16 = -1
            int r5 = r5 + -1
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r5 = (com.facebook.p313c.p315b.C6028d) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r5 = r5.f17755c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r5.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 > r5) goto L_0x01d4
            int r4 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r16 = -1
            int r5 = r5 + -1
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r5 = (com.facebook.p313c.p315b.C6028d) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r5 = r5.f17755c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r5.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 <= r5) goto L_0x01d4
            int r4 = r12.f17749g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r5 = -1
            int r4 = r4 + r5
            r12.f17749g = r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r4 = r6.get(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r4 = (com.facebook.p313c.p315b.C6028d) r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r33 = r14
            long r13 = r4.f17756d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r16 = r10.mo12573e(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r16 != 0) goto L_0x01d1
            r5 = 1
            com.facebook.p313c.p315b.C6026b.m15489h(r8, r10, r4, r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Set r5 = r12.f17744b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r5.add(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x01d1:
            r14 = r33
            goto L_0x0182
        L_0x01d4:
            r33 = r14
            com.facebook.c.e r5 = r10.mo12569a()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 == 0) goto L_0x01e1
            int r5 = r5.getHeight()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x01e2
        L_0x01e1:
            r5 = 0
        L_0x01e2:
            int r6 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r6 >= r5) goto L_0x01e7
            goto L_0x01ed
        L_0x01e7:
            android.graphics.Rect r6 = r12.f17743a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r6 = r6.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r6 >= r5) goto L_0x026a
        L_0x01ed:
            int r5 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6 = r33
            if (r5 < r6) goto L_0x01f4
            goto L_0x023b
        L_0x01f4:
            int r5 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r13 = r15.get(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r13 = (com.facebook.p313c.p315b.C6028d) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r13 = r13.f17755c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 < r13) goto L_0x023b
            int r5 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r13 = r15.get(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r13 = (com.facebook.p313c.p315b.C6028d) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r13 = r13.f17755c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 > r13) goto L_0x023b
            int r5 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r5 = r15.get(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r5 = (com.facebook.p313c.p315b.C6028d) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r13 = r5.f17756d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r16 = r10.mo12573e(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r16 != 0) goto L_0x0232
            r4 = 1
            com.facebook.p313c.p315b.C6026b.m15489h(r8, r10, r5, r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4 = r13
            java.util.Set r14 = r12.f17744b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r14.add(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0232:
            int r4 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r5 = 1
            int r4 = r4 + r5
            r12.f17748f = r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r33 = r6
            goto L_0x01ed
        L_0x023b:
            int r4 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 <= 0) goto L_0x026a
            int r4 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6 = -1
            int r5 = r5 + r6
            java.lang.Object r5 = r15.get(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r5 = (com.facebook.p313c.p315b.C6028d) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r5 = r5.f17755c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r5.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 >= r5) goto L_0x026a
            int r4 = r12.f17748f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r5 = -1
            int r4 = r4 + r5
            r12.f17748f = r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r4 = r15.get(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r4 = (com.facebook.p313c.p315b.C6028d) r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r4 = r4.f17756d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r6 = r10.mo12573e(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r6 == 0) goto L_0x023b
            r6 = 1
            r10.mo12572d(r4, r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x023b
        L_0x026a:
            com.facebook.c.b.c r4 = r12.f17747e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Collection r4 = r4.mo12588k()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0274:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 == 0) goto L_0x02a6
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r5 = (com.facebook.p313c.p315b.C6028d) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r5 = r5.f17756d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Set r13 = r12.f17744b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Long r14 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r13 = r13.contains(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 != 0) goto L_0x0274
            com.facebook.c.g r13 = r10.f17740a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r13 = r13.mo12618h(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 == 0) goto L_0x0274
            com.facebook.c.g r13 = r10.f17740a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.i r13 = r13.f17798b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r13 = r13.mo12633l(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 == 0) goto L_0x0274
            com.facebook.c.b.c r14 = r12.f17747e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.p313c.p315b.C6026b.m15491j(r14, r5, r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x0274
        L_0x02a6:
            java.util.Set r4 = r12.f17744b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4.clear()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x02ce
        L_0x02ac:
            java.lang.Object r4 = r10.f17741b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.a r4 = (com.facebook.p313c.p315b.C6025a) r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.c r5 = r4.f17747e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Collection r5 = r5.mo12588k()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x02ba:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r6 == 0) goto L_0x02cb
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r6 = (com.facebook.p313c.p315b.C6028d) r6     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r12 = 1
            com.facebook.p313c.p315b.C6026b.m15490i(r10, r8, r6, r12)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x02ba
        L_0x02cb:
            com.facebook.p313c.p315b.C6026b.m15493l(r4, r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x02ce:
            com.facebook.p313c.p315b.C6026b.m15492k(r11, r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.p r4 = com.facebook.p313c.C6058q.f17821a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x02d3:
            com.facebook.litho.p332h.C6375a.m17086a()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x02d6:
            com.facebook.litho.he r4 = r9.f18331e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x02e4
            com.facebook.c.i r5 = r9.f18328b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.a r4 = r5.mo12631j(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x02e4
            com.facebook.litho.he r4 = r9.f18331e     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x02e4:
            com.facebook.c.e.d r4 = r9.f18330d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x02f5
            com.facebook.c.i r5 = r9.f18328b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.a r4 = r5.mo12631j(r4)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x02f5
            com.facebook.c.e.d r5 = r9.f18330d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r5.mo12610i(r4, r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x02f5:
            r19 = r3
            r1 = 0
            r30 = r7
            r7 = r2
            r2 = r30
            goto L_0x086e
        L_0x02ff:
            com.facebook.litho.dn r4 = r7.f17947w     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x0322
            java.util.List r5 = r4.f18327a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6 = 0
        L_0x030a:
            if (r6 >= r5) goto L_0x0322
            java.util.List r9 = r4.f18327a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.b r9 = (com.facebook.p313c.p314a.C6022b) r9     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.i r10 = r4.f18328b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.a r10 = r10.mo12631j(r9)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r10 == 0) goto L_0x031f
            r9.mo12578e(r10, r2, r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x031f:
            int r6 = r6 + 1
            goto L_0x030a
        L_0x0322:
            boolean r4 = r7.f17936l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x03b5
            com.facebook.c.i r4 = r7.f17937m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.List r5 = r2.f18303h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 == 0) goto L_0x0383
            com.facebook.litho.u r5 = r2.f18298c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.h r5 = com.facebook.litho.C6395i.m17143b(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.i r5 = r5.f18849a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.u r6 = r2.f18298c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.u r6 = r5.mo13455I(r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r8 = new com.facebook.litho.de     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.String r20 = r6.mo13348e()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r21 = new android.graphics.Rect     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r21.<init>()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            com.facebook.litho.u r6 = r2.f18298c     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.content.Context r6 = r6.f19009b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r6 = r6.orientation     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r29 = 0
            r16 = r8
            r19 = r5
            r28 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r8.f18263m = r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r5 = 0
            com.facebook.litho.C6187dg.m16344h(r2, r8, r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            androidx.c.k r5 = r2.f18305j     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.List r6 = r2.f18303h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r9 = -1
            int r6 = r6 + r9
            com.facebook.litho.C6187dg.m16346l(r5, r8, r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0383:
            java.util.List r5 = r2.f18303h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r5 = (com.facebook.p313c.C6060s) r5     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.List r6 = r2.f18303h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s[] r6 = new com.facebook.p313c.C6060s[r6]     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.List r8 = r2.f18303h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r9 = 0
        L_0x039b:
            if (r9 >= r8) goto L_0x03aa
            java.util.List r10 = r2.f18303h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r10 = (com.facebook.p313c.C6060s) r10     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6[r9] = r10     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r9 = r9 + 1
            goto L_0x039b
        L_0x03aa:
            com.facebook.c.r r8 = new com.facebook.c.r     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r8.<init>(r5, r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r8.f17825c = r2     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4.mo12636q(r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x03bc
        L_0x03b5:
            com.facebook.c.i r4 = r7.f17937m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.em r4 = (com.facebook.litho.C6239em) r4     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4.mo13225K(r2)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x03bc:
            com.facebook.litho.dn r4 = r7.f17947w     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r4 == 0) goto L_0x02f5
            java.util.List r5 = r4.f18327a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6 = 0
        L_0x03c7:
            if (r6 >= r5) goto L_0x02f5
            java.util.List r8 = r4.f18327a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.b r8 = (com.facebook.p313c.p314a.C6022b) r8     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.i r9 = r4.f18328b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.a.a r9 = r9.mo12631j(r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r9 == 0) goto L_0x03dc
            r8.mo12577d(r9)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x03dc:
            int r6 = r6 + 1
            goto L_0x03c7
        L_0x03df:
            com.facebook.litho.em r4 = r7.f17939o     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.litho.LithoView r5 = r4.f18442h     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.litho.ComponentTree r5 = r5.f17938n     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            boolean r6 = r5.f17910m     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            boolean r10 = r5.f17911n     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.litho.C6349gb.m17045a()     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.c.e.d r14 = r4.f18451q     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            boolean r14 = r4.f18438d     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r14 == 0) goto L_0x03f7
            com.facebook.c.a.a r14 = r4.f18452r     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.p313c.p318e.C6044d.m15545k(r14, r2, r8)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x03f7:
            com.facebook.litho.he r14 = r4.f18454t     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r14 == 0) goto L_0x0404
            boolean r14 = r4.f18438d     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r14 == 0) goto L_0x0404
            com.facebook.c.a.a r14 = r4.f18455u     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.C6380he.m17103o(r14, r2)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0404:
            r4.f18448n = r2     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            boolean r14 = r4.f18439e     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r14 == 0) goto L_0x041c
            java.lang.String r14 = "MountState:InvalidReentrantMounts"
            java.lang.String r15 = "Trying to mount while already mounting! "
            com.facebook.c.j r13 = r4.f18450p     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.String r13 = r4.mo13231m(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.String r13 = r15.concat(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r15 = 3
            com.facebook.litho.C6106aq.m15891b(r15, r14, r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x041c:
            r13 = 1
            r4.f18439e = r13     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.litho.u r14 = r5.f17907j     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.google.android.libraries.elements.h.m r14 = r14.mo13475m()     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            int r15 = r2.f18315t     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            int r13 = r4.f18447m     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r15 == r13) goto L_0x042e
            r13 = 0
            r4.f18449o = r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x042e:
            if (r14 != 0) goto L_0x0432
            r5 = 0
            goto L_0x043d
        L_0x0432:
            com.facebook.litho.u r5 = r5.f17907j     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            r13 = 6
            com.facebook.litho.fd r13 = r14.mo26269a(r5, r13)     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.litho.fd r5 = com.facebook.litho.C6231ee.m16500a(r5, r14, r13)     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
        L_0x043d:
            boolean r13 = r4.f18438d     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r13 == 0) goto L_0x0452
            if (r5 == 0) goto L_0x0448
            java.lang.String r13 = "PREPARE_MOUNT_START"
            r5.mo13236b(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0448:
            r4.mo13229O(r2)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r5 == 0) goto L_0x0452
            java.lang.String r13 = "PREPARE_MOUNT_END"
            r5.mo13236b(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0452:
            com.facebook.litho.ek r13 = r4.f18444j     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            r13.mo13220b()     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            if (r5 == 0) goto L_0x0464
            boolean r13 = com.google.android.libraries.elements.p1729h.C21215m.m39905d(r5)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 == 0) goto L_0x0464
            com.facebook.litho.ek r13 = r4.f18444j     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r13.mo13219a()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x0464:
            if (r6 == 0) goto L_0x0645
            android.graphics.Rect r13 = r4.f18443i     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r13 = r13.isEmpty()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 == 0) goto L_0x0470
            goto L_0x0645
        L_0x0470:
            int r13 = r8.left     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r14 = r4.f18443i     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.left     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 != r14) goto L_0x0645
            int r13 = r8.right     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r14 = r4.f18443i     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.right     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 != r14) goto L_0x0645
            java.util.ArrayList r6 = r2.f18306k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.ArrayList r11 = r2.f18307l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r2.mo12597a()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 < 0) goto L_0x048d
            goto L_0x0493
        L_0x048d:
            android.graphics.Rect r13 = r4.f18443i     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 < 0) goto L_0x0548
        L_0x0493:
            int r13 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 < r12) goto L_0x049a
        L_0x0497:
            r16 = r15
            goto L_0x04e7
        L_0x049a:
            int r13 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r14 = r11.get(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r14 = (com.facebook.p313c.p315b.C6028d) r14     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r14 = r2.mo12598d(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r14 = r14.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r14 = (com.facebook.litho.C6201du) r14     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r14 = r14.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r14 = r14.f18256f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 < r14) goto L_0x0497
            int r13 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r13 = r11.get(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r13 = (com.facebook.p313c.p315b.C6028d) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r13 = r2.mo12598d(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r14 = r13.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r14 = (com.facebook.litho.C6201du) r14     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r14 = r14.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r16 = r15
            long r14 = r14.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r2.mo12622f(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r13 = r4.mo13223G(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 != 0) goto L_0x04dd
            androidx.c.k r13 = r4.f18441g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4.mo13222D(r14, r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x04dd:
            int r13 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r14 = 1
            int r15 = r13 + 1
            r4.f18446l = r15     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r15 = r16
            goto L_0x0493
        L_0x04e7:
            int r14 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r14 <= 0) goto L_0x054a
            int r14 = r8.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r15 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r17 = -1
            int r15 = r15 + -1
            java.lang.Object r15 = r11.get(r15)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r15 = (com.facebook.p313c.p315b.C6028d) r15     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r15 = r15.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r15 = r2.mo12598d(r15)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r15 = r15.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r15 = (com.facebook.litho.C6201du) r15     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r15 = r15.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r15 = r15.f18256f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r15 = r15.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r14 > r15) goto L_0x054a
            int r14 = r4.f18446l     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r15 = -1
            int r14 = r14 + r15
            r4.f18446l = r14     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r14 = r11.get(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r14 = (com.facebook.p313c.p315b.C6028d) r14     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r14.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r14 = r2.mo12598d(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r15 = r14.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r15 = (com.facebook.litho.C6201du) r15     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r15 = r15.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r17 = r14
            long r13 = r15.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r2.mo12622f(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.j r13 = r4.mo13230g(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 != 0) goto L_0x04e7
            long r13 = r15.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r2.mo12622f(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r14 = r17
            r4.mo13233s(r13, r14, r15, r2)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Set r13 = r4.f18453s     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r14 = r15.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r13.add(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x04e7
        L_0x0548:
            r16 = r15
        L_0x054a:
            com.facebook.litho.LithoView r11 = r4.f18442h     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r11 = r11.getHeight()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 >= r11) goto L_0x0555
            goto L_0x055b
        L_0x0555:
            android.graphics.Rect r13 = r4.f18443i     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r13 >= r11) goto L_0x0603
        L_0x055b:
            int r11 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 < r12) goto L_0x0560
            goto L_0x05b7
        L_0x0560:
            int r11 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r13 = r6.get(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r13 = (com.facebook.p313c.p315b.C6028d) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r13 = r2.mo12598d(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r13 = r13.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r13 = (com.facebook.litho.C6201du) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r13 = r13.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r13 = r13.f18256f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r13 = r13.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 < r13) goto L_0x05b7
            int r11 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r11 = (com.facebook.p313c.p315b.C6028d) r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r11 = r11.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r11 = r2.mo12598d(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r13 = r11.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r13 = (com.facebook.litho.C6201du) r13     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r13 = r13.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r14 = r13.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r2.mo12622f(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.j r14 = r4.mo13230g(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r14 != 0) goto L_0x05b0
            long r14 = r13.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r14 = r2.mo12622f(r14)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4.mo13233s(r14, r11, r13, r2)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Set r11 = r4.f18453s     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r13 = r13.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r11.add(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
        L_0x05b0:
            int r11 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r13 = 1
            int r11 = r11 + r13
            r4.f18445k = r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x055b
        L_0x05b7:
            int r11 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 <= 0) goto L_0x0603
            int r11 = r8.bottom     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r13 = -1
            int r12 = r12 + r13
            java.lang.Object r12 = r6.get(r12)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r12 = (com.facebook.p313c.p315b.C6028d) r12     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r12.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r12 = r2.mo12598d(r12)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r12 = r12.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r12 = (com.facebook.litho.C6201du) r12     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r12 = r12.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            android.graphics.Rect r12 = r12.f18256f     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r12.top     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 >= r12) goto L_0x0603
            int r11 = r4.f18445k     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r12 = -1
            int r11 = r11 + r12
            r4.f18445k = r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.b.d r11 = (com.facebook.p313c.p315b.C6028d) r11     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r11 = r11.f17753a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.s r11 = r2.mo12598d(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.v r12 = r11.f17827b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.du r12 = (com.facebook.litho.C6201du) r12     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.litho.de r12 = r12.f18345a     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r12 = r12.f18263m     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r12 = r2.mo12622f(r12)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r11 = r4.mo13223G(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r11 != 0) goto L_0x05b7
            androidx.c.k r11 = r4.f18441g     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r4.mo13222D(r12, r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x05b7
        L_0x0603:
            androidx.c.k r6 = r4.f18436b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            int r6 = r6.mo3675c()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r11 = 0
        L_0x060a:
            if (r11 >= r6) goto L_0x0639
            androidx.c.k r12 = r4.f18436b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.lang.Object r12 = r12.mo3680g(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            com.facebook.c.j r12 = (com.facebook.p313c.C6051j) r12     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            androidx.c.k r13 = r4.f18436b     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            long r13 = r13.mo3677d(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            java.util.Set r15 = r4.f18453s     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r33 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            boolean r6 = r15.contains(r6)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            if (r6 != 0) goto L_0x0633
            int r6 = r2.mo12622f(r13)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r13 = -1
            if (r6 == r13) goto L_0x0634
            com.facebook.litho.C6239em.m16527r(r12, r9)     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            goto L_0x0634
        L_0x0633:
            r13 = -1
        L_0x0634:
            int r11 = r11 + 1
            r6 = r33
            goto L_0x060a
        L_0x0639:
            java.util.Set r6 = r4.f18453s     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r6.clear()     // Catch:{ Exception -> 0x08cc, all -> 0x0049 }
            r19 = r3
            r20 = r7
            r7 = r2
            goto L_0x07c0
        L_0x0645:
            r16 = r15
            androidx.c.k r14 = r4.f18435a     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            java.lang.Object r11 = r14.mo3678e(r11)     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            com.facebook.c.j r11 = (com.facebook.p313c.C6051j) r11     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            int r12 = r2.mo12597a()     // Catch:{ Exception -> 0x08cc, all -> 0x08c7 }
            r14 = 0
        L_0x0654:
            if (r14 >= r12) goto L_0x0758
            com.facebook.c.s r15 = r2.mo12598d(r14)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.v r13 = r15.f17827b     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.du r13 = (com.facebook.litho.C6201du) r13     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.de r13 = r13.f18345a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r32 = r12
            com.facebook.litho.q r12 = r13.f18255e     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.j r1 = r4.mo13230g(r14)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r1 == 0) goto L_0x066d
            r17 = 1
            goto L_0x066f
        L_0x066d:
            r17 = 0
        L_0x066f:
            if (r1 == 0) goto L_0x067d
            if (r1 != r11) goto L_0x0678
            r18 = r11
            r11 = r1
            r1 = 1
            goto L_0x0681
        L_0x0678:
            r18 = r11
            r11 = r1
            r1 = 0
            goto L_0x0681
        L_0x067d:
            r18 = r11
            r1 = 0
            r11 = 0
        L_0x0681:
            if (r6 == 0) goto L_0x06b0
            if (r11 != 0) goto L_0x068a
            r19 = r3
            r20 = r7
            goto L_0x069d
        L_0x068a:
            r19 = r3
            java.lang.Object r3 = r11.f17803a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r20 = r7
            boolean r7 = r3 instanceof com.facebook.litho.ComponentHost     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r7 == 0) goto L_0x069d
            com.facebook.litho.ComponentHost r3 = (com.facebook.litho.ComponentHost) r3     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r3 = r3.mo12601a()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r3 <= 0) goto L_0x069d
            goto L_0x06b4
        L_0x069d:
            android.graphics.Rect r3 = r13.f18256f     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            boolean r3 = android.graphics.Rect.intersects(r8, r3)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r3 != 0) goto L_0x06b4
            boolean r3 = r4.mo13223G(r15)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r3 != 0) goto L_0x06b4
            if (r1 == 0) goto L_0x06ae
            goto L_0x06b4
        L_0x06ae:
            r3 = 0
            goto L_0x06b5
        L_0x06b0:
            r19 = r3
            r20 = r7
        L_0x06b4:
            r3 = 1
        L_0x06b5:
            if (r3 == 0) goto L_0x06c7
            if (r17 != 0) goto L_0x06c7
            r4.mo13233s(r14, r15, r13, r2)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r6 == 0) goto L_0x0741
            com.facebook.c.j r1 = r4.mo13230g(r14)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r4.mo13224J(r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            goto L_0x0741
        L_0x06c7:
            if (r3 != 0) goto L_0x06d2
            if (r17 == 0) goto L_0x06d2
            androidx.c.k r1 = r4.f18441g     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r4.mo13222D(r14, r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            goto L_0x0741
        L_0x06d2:
            if (r17 == 0) goto L_0x0741
            boolean r3 = r4.f18438d     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r3 != 0) goto L_0x06e2
            if (r1 == 0) goto L_0x06df
            boolean r1 = r4.f18440f     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r1 == 0) goto L_0x06df
            goto L_0x06e2
        L_0x06df:
            r7 = r2
        L_0x06e0:
            r2 = 1
            goto L_0x0735
        L_0x06e2:
            com.facebook.litho.dg r1 = r4.f18449o     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r1 == 0) goto L_0x06ee
            int r1 = r1.f18316u     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r3 = r2.f18317v     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r1 != r3) goto L_0x06ee
            r1 = 1
            goto L_0x06ef
        L_0x06ee:
            r1 = 0
        L_0x06ef:
            long r21 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            boolean r1 = r4.mo13227M(r15, r11, r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.ek r3 = r4.f18444j     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            boolean r7 = r3.f18426n     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r7 == 0) goto L_0x06df
            if (r1 == 0) goto L_0x072e
            java.util.List r1 = r3.f18415c     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.String r3 = r12.mo13461q()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r1.add(r3)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.ek r1 = r4.f18444j     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.util.List r1 = r1.f18420h     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            long r23 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r7 = r2
            long r2 = r23 - r21
            double r2 = (double) r2
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 / r21
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r1.add(r2)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.ek r1 = r4.f18444j     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r2 = r1.f18424l     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r3 = 1
            int r2 = r2 + r3
            r1.f18424l = r2     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            goto L_0x06e0
        L_0x072e:
            r7 = r2
            int r1 = r3.f18425m     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r2 = 1
            int r1 = r1 + r2
            r3.f18425m = r1     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x0735:
            if (r6 == 0) goto L_0x0743
            boolean r1 = r12.mo12817ah()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r1 == 0) goto L_0x0743
            com.facebook.litho.C6239em.m16527r(r11, r9)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            goto L_0x0743
        L_0x0741:
            r7 = r2
            r2 = 1
        L_0x0743:
            int r14 = r14 + 1
            r1 = r31
            r12 = r32
            r2 = r7
            r11 = r18
            r3 = r19
            r7 = r20
            goto L_0x0654
        L_0x0752:
            r0 = move-exception
            r2 = 0
            r3 = r31
            goto L_0x004c
        L_0x0758:
            r19 = r3
            r20 = r7
            r7 = r2
            if (r6 == 0) goto L_0x07c0
            boolean r1 = r8.isEmpty()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r1 == 0) goto L_0x0766
            goto L_0x07c0
        L_0x0766:
            java.util.ArrayList r1 = r7.f18306k     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.util.ArrayList r2 = r7.f18307l     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r3 = r7.mo12597a()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r6 = r7.mo12597a()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r4.f18445k = r6     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r6 = 0
        L_0x0775:
            if (r6 >= r3) goto L_0x0797
            int r9 = r8.bottom     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.Object r11 = r1.get(r6)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.b.d r11 = (com.facebook.p313c.p315b.C6028d) r11     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r11 = r11.f17753a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.s r11 = r7.mo12598d(r11)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.v r11 = r11.f17827b     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.du r11 = (com.facebook.litho.C6201du) r11     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.de r11 = r11.f18345a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            android.graphics.Rect r11 = r11.f18256f     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r11 = r11.top     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r9 > r11) goto L_0x0794
            r4.f18445k = r6     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            goto L_0x0797
        L_0x0794:
            int r6 = r6 + 1
            goto L_0x0775
        L_0x0797:
            int r1 = r7.mo12597a()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r4.f18446l = r1     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r1 = 0
        L_0x079e:
            if (r1 >= r3) goto L_0x07c0
            int r6 = r8.top     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.Object r9 = r2.get(r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.b.d r9 = (com.facebook.p313c.p315b.C6028d) r9     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r9 = r9.f17753a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.s r9 = r7.mo12598d(r9)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.v r9 = r9.f17827b     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.du r9 = (com.facebook.litho.C6201du) r9     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.de r9 = r9.f18345a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            android.graphics.Rect r9 = r9.f18256f     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r9 = r9.bottom     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r6 >= r9) goto L_0x07bd
            r4.f18446l = r1     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            goto L_0x07c0
        L_0x07bd:
            int r1 = r1 + 1
            goto L_0x079e
        L_0x07c0:
            com.facebook.litho.he r1 = r4.f18454t     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            if (r1 == 0) goto L_0x07cd
            boolean r2 = r4.f18438d     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r2 == 0) goto L_0x07cd
            com.facebook.c.a.a r2 = r4.f18455u     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r1.mo12577d(r2)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x07cd:
            if (r10 == 0) goto L_0x07e2
            if (r5 == 0) goto L_0x07d6
            java.lang.String r1 = "EVENT_PROCESS_VISIBILITY_OUTPUTS_START"
            r5.mo13236b(r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x07d6:
            boolean r1 = r4.f18438d     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r4.mo13226L(r8, r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r5 == 0) goto L_0x07e2
            java.lang.String r1 = "EVENT_PROCESS_VISIBILITY_OUTPUTS_END"
            r5.mo13236b(r1)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x07e2:
            r1 = 0
            r4.f18438d = r1     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            r4.f18440f = r1     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            if (r8 == 0) goto L_0x07ee
            android.graphics.Rect r1 = r4.f18443i     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r1.set(r8)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x07ee:
            r1 = r16
            r4.f18447m = r1     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            r4.f18449o = r7     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            java.util.Map r1 = r4.f18437c     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            if (r1 != 0) goto L_0x07f9
            goto L_0x0861
        L_0x07f9:
            r1.clear()     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            int r1 = r7.mo13124b()     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            r2 = 0
        L_0x0801:
            if (r2 >= r1) goto L_0x0861
            com.facebook.litho.fy r3 = r7.mo13125c(r2)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            long r8 = r3.f18547b     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            long r10 = r3.f18548c     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r12 = -1
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0813
            r6 = 0
            goto L_0x081b
        L_0x0813:
            androidx.c.k r6 = r4.f18435a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.Object r6 = r6.mo3678e(r10)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.c.j r6 = (com.facebook.p313c.C6051j) r6     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x081b:
            com.facebook.litho.TestItem r10 = new com.facebook.litho.TestItem     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r10.<init>()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0826
            r8 = 0
            goto L_0x082e
        L_0x0826:
            androidx.c.k r11 = r4.f18441g     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.Object r8 = r11.mo3678e(r8)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            com.facebook.litho.ComponentHost r8 = (com.facebook.litho.ComponentHost) r8     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x082e:
            r10.f17951c = r8     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            android.graphics.Rect r8 = r3.f18549d     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            android.graphics.Rect r9 = r10.f17950b     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r9.set(r8)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.String r8 = r3.f18546a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r10.f17949a = r8     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r6 != 0) goto L_0x083f
            r6 = 0
            goto L_0x0841
        L_0x083f:
            java.lang.Object r6 = r6.f17803a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x0841:
            r10.f17952d = r6     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.util.Map r6 = r4.f18437c     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.String r8 = r3.f18546a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.Object r6 = r6.get(r8)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.util.Deque r6 = (java.util.Deque) r6     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            if (r6 != 0) goto L_0x0854
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r6.<init>()     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x0854:
            r6.add(r10)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.util.Map r8 = r4.f18437c     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            java.lang.String r3 = r3.f18546a     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            r8.put(r3, r6)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
            int r2 = r2 + 1
            goto L_0x0801
        L_0x0861:
            if (r5 == 0) goto L_0x0866
            r4.mo13228N(r5)     // Catch:{ Exception -> 0x08c3, all -> 0x0752 }
        L_0x0866:
            com.facebook.litho.p332h.C6375a.m17086a()     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            r1 = 0
            r4.f18439e = r1     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            r2 = r20
        L_0x086e:
            r2.f17934j = r1     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
        L_0x0870:
            if (r19 != 0) goto L_0x0876
            r1 = 0
            r3 = r31
            goto L_0x08b7
        L_0x0876:
            java.util.List r1 = r7.f18320y     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            java.util.List r2 = r7.f18321z     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            if (r1 == 0) goto L_0x08b4
            boolean r3 = r1.isEmpty()     // Catch:{ Exception -> 0x08c3, all -> 0x08bf }
            if (r3 != 0) goto L_0x08b4
            r3 = r31
            com.facebook.litho.fi r4 = r3.f17874E     // Catch:{ Exception -> 0x08b2 }
            if (r4 != 0) goto L_0x088f
            com.facebook.litho.fi r4 = new com.facebook.litho.fi     // Catch:{ Exception -> 0x08b2 }
            r4.<init>()     // Catch:{ Exception -> 0x08b2 }
            r3.f17874E = r4     // Catch:{ Exception -> 0x08b2 }
        L_0x088f:
            com.facebook.litho.fi r4 = r3.f17874E     // Catch:{ Exception -> 0x08b2 }
            int r5 = r1.size()     // Catch:{ Exception -> 0x08b2 }
            if (r5 > 0) goto L_0x089d
            java.util.Set r1 = r4.f18507a     // Catch:{ Exception -> 0x08b2 }
            r1.clear()     // Catch:{ Exception -> 0x08b2 }
            goto L_0x08b6
        L_0x089d:
            r4 = 0
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x08b2 }
            com.facebook.litho.q r1 = (com.facebook.litho.C6407q) r1     // Catch:{ Exception -> 0x08b2 }
            java.lang.Object r1 = r2.get(r4)     // Catch:{ Exception -> 0x08b2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x08b2 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x08b2 }
            java.lang.String r2 = "Trying to record previous render data for component that doesn't support it"
            r1.<init>(r2)     // Catch:{ Exception -> 0x08b2 }
            throw r1     // Catch:{ Exception -> 0x08b2 }
        L_0x08b2:
            r0 = move-exception
            goto L_0x08ce
        L_0x08b4:
            r3 = r31
        L_0x08b6:
            r1 = 0
        L_0x08b7:
            r3.f17908k = r1
            r1 = 0
            r3.f17921x = r1
            r3.f17920w = r1
            return
        L_0x08bf:
            r0 = move-exception
            r3 = r31
            goto L_0x08c9
        L_0x08c3:
            r0 = move-exception
            r3 = r31
            goto L_0x08ce
        L_0x08c7:
            r0 = move-exception
            r3 = r1
        L_0x08c9:
            r1 = r0
            r2 = 0
            goto L_0x08e0
        L_0x08cc:
            r0 = move-exception
            r3 = r1
        L_0x08ce:
            r1 = r0
            boolean r2 = r1 instanceof com.facebook.litho.C6196dp     // Catch:{ all -> 0x08de }
            if (r2 == 0) goto L_0x08d6
            com.facebook.litho.dp r1 = (com.facebook.litho.C6196dp) r1     // Catch:{ all -> 0x08de }
            goto L_0x08dd
        L_0x08d6:
            com.facebook.litho.dp r2 = new com.facebook.litho.dp     // Catch:{ all -> 0x08de }
            r4 = 0
            r2.<init>(r4, r3, r1)     // Catch:{ all -> 0x08de }
            r1 = r2
        L_0x08dd:
            throw r1     // Catch:{ all -> 0x08de }
        L_0x08de:
            r0 = move-exception
            goto L_0x08c9
        L_0x08e0:
            r3.f17908k = r2
            r2 = 0
            r3.f17921x = r2
            r3.f17920w = r2
            goto L_0x08e9
        L_0x08e8:
            throw r1
        L_0x08e9:
            goto L_0x08e8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.m15669A(android.graphics.Rect, boolean):void");
    }

    /* renamed from: B */
    private final void m15670B() {
        C6187dg dgVar = this.f17872C;
        if (dgVar == null) {
            throw new RuntimeException("Cannot promote null LayoutState!");
        } else if (dgVar != this.f17871B) {
            this.f17871B = dgVar;
            LithoView lithoView = this.f17914q;
            if (lithoView != null) {
                lithoView.mo12730C();
            }
        }
    }

    /* renamed from: C */
    private static boolean m15671C(C6187dg dgVar, int i, int i2, int i3) {
        return dgVar != null && dgVar.mo13160o(i, i2, i3) && dgVar.mo13159n();
    }

    /* renamed from: D */
    private static boolean m15672D(C6187dg dgVar, int i, int i2) {
        return dgVar.mo13161p(i, i2) && dgVar.mo13159n();
    }

    /* renamed from: b */
    public static C6095af m15673b(C6411u uVar, C6407q qVar) {
        C6095af afVar = new C6095af(uVar);
        if (qVar != null) {
            afVar.f17997c = qVar;
            return afVar;
        }
        throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
    }

    /* renamed from: r */
    public static boolean m15674r(int i) {
        return i == 0 || i == 2 || i == 4 || i == 6;
    }

    /* renamed from: y */
    private static synchronized Looper m15675y() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (f17867N == null) {
                boolean z = C6180a.f18234a;
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                handlerThread.start();
                f17867N = handlerThread.getLooper();
            }
            looper = f17867N;
        }
        return looper;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C6407q mo12706a() {
        return this.f17922y;
    }

    /* renamed from: c */
    public final synchronized C6280fw mo12707c() {
        return new C6280fw(this.f17873D);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized String mo12708d() {
        return this.f17882O;
    }

    /* renamed from: e */
    public final synchronized String mo12709e() {
        C6407q qVar = this.f17922y;
        if (qVar == null) {
            return null;
        }
        return qVar.mo13461q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized List mo12710f() {
        ArrayList arrayList;
        C6280fw fwVar = this.f17873D;
        arrayList = null;
        if (!(fwVar == null || fwVar.mo13278c() == null)) {
            Map c = fwVar.mo13278c();
            arrayList = new ArrayList();
            for (List addAll : c.values()) {
                arrayList.addAll(addAll);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo12711g(C6099aj ajVar) {
        if (ajVar != null) {
            synchronized (this) {
                if (this.f17904g == null) {
                    this.f17904g = new ArrayList();
                }
                this.f17904g.add(ajVar);
            }
        }
    }

    public LithoView getLithoView() {
        return this.f17914q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12713h() {
        C6349gb.m17045a();
        LithoView lithoView = this.f17914q;
        if (lithoView != null) {
            C6174cv cvVar = this.f17887T;
            if (cvVar != null) {
                cvVar.mo13148a(lithoView);
            }
            synchronized (this) {
                this.f17912o = true;
                C6187dg dgVar = this.f17872C;
                if (!(dgVar == null || this.f17871B == dgVar)) {
                    m15670B();
                }
                if (this.f17922y == null) {
                    boolean z = this.f17901d;
                    String str = this.f17882O;
                    throw new IllegalStateException("Trying to attach a ComponentTree with a null root. Is released: " + z + ", Released Component name is: " + str);
                }
            }
            int measuredWidth = this.f17914q.getMeasuredWidth();
            int measuredHeight = this.f17914q.getMeasuredHeight();
            if (measuredWidth == 0) {
                if (measuredHeight != 0) {
                    measuredWidth = 0;
                } else {
                    return;
                }
            }
            C6187dg dgVar2 = this.f17871B;
            if (dgVar2 == null || dgVar2.f18313r != measuredWidth || dgVar2.f18314s != measuredHeight || this.f17914q.mo12733G()) {
                this.f17914q.requestLayout();
            } else {
                this.f17914q.mo12752x();
            }
        } else {
            throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r4.f17912o == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        if (r4.f17909l == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r0 = r4.f17914q.getMeasuredWidth();
        r1 = r4.f17914q.getMeasuredHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r0 != 0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        if (r1 == 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r0 = r4.f17871B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r0.f18313r != r2) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        if (r0.f18314s == r1) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        mo12724t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        r4.f17914q.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12714i() {
        /*
            r4 = this;
            com.facebook.litho.C6349gb.m17045a()
            monitor-enter(r4)
            com.facebook.litho.q r0 = r4.f17922y     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x000a
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x000a:
            com.facebook.litho.dg r0 = r4.f17872C     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004d
            com.facebook.litho.dg r1 = r4.f17871B     // Catch:{ all -> 0x0055 }
            r2 = 0
            if (r1 == r0) goto L_0x0018
            r4.m15670B()     // Catch:{ all -> 0x0055 }
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r4.f17912o
            if (r0 == 0) goto L_0x004c
            boolean r0 = r4.f17909l
            if (r0 == 0) goto L_0x0025
            goto L_0x004c
        L_0x0025:
            com.facebook.litho.LithoView r0 = r4.f17914q
            int r0 = r0.getMeasuredWidth()
            com.facebook.litho.LithoView r1 = r4.f17914q
            int r1 = r1.getMeasuredHeight()
            if (r0 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            return
        L_0x0037:
            r2 = r0
        L_0x0038:
            com.facebook.litho.dg r0 = r4.f17871B
            int r3 = r0.f18313r
            if (r3 != r2) goto L_0x0047
            int r0 = r0.f18314s
            if (r0 == r1) goto L_0x0043
            goto L_0x0047
        L_0x0043:
            r4.mo12724t()
            return
        L_0x0047:
            com.facebook.litho.LithoView r0 = r4.f17914q
            r0.requestLayout()
        L_0x004c:
            return
        L_0x004d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "Unexpected null mCommittedLayoutState"
            r0.<init>(r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.mo12714i():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.facebook.litho.ai} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e3, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r6 = r6.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f0, code lost:
        if (r6.hasNext() == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f2, code lost:
        r7 = (java.util.Map.Entry) r6.next();
        r8 = (java.lang.String) r7.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fe, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r9 = (java.util.List) r1.f18539a.get(r8);
        r10 = r1.f18540b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0209, code lost:
        if (r10 != null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020b, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020d, code lost:
        r10 = (java.util.List) r10.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0213, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0214, code lost:
        if (r9 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r7 = (java.util.List) r7.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0224, code lost:
        if (r9.size() != r7.size()) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0226, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1.f18539a.remove(r8);
        r7 = r1.f18540b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022e, code lost:
        if (r7 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0230, code lost:
        r7.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0233, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0238, code lost:
        r9.removeAll(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023b, code lost:
        if (r10 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x023d, code lost:
        r10.removeAll(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r6 = r0.f18544f;
        r7 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024c, code lost:
        if (r6 == null) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x024e, code lost:
        r8 = r0.f18543e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0250, code lost:
        if (r8 != null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0253, code lost:
        r7.addAll(r8.keySet());
        r8 = r7.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x025f, code lost:
        if (r9 >= r8) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0261, code lost:
        r10 = (java.lang.String) r7.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026b, code lost:
        if (r6.contains(r10) != false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x026d, code lost:
        r0.f18543e.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0272, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0275, code lost:
        r1.mo13282g(r0.mo13280e());
        r1.mo13283h(r0.mo13278c());
        r6 = r1.f18545g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0285, code lost:
        if (r6 == null) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0287, code lost:
        r6.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x028a, code lost:
        r6 = r0.f18545g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x028c, code lost:
        if (r6 == null) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0292, code lost:
        if (r6.isEmpty() != false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0294, code lost:
        r6 = r1.f18545g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0296, code lost:
        if (r6 != null) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0298, code lost:
        r1.f18545g = new java.util.HashMap(r0.f18545g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a2, code lost:
        r6.putAll(r0.f18545g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02ad, code lost:
        if (r11.f17904g == null) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02af, code lost:
        r1 = r3.f18313r;
        r6 = r3.f18314s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b4, code lost:
        r1 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b6, code lost:
        r7 = r3.f18272E;
        r8 = null;
        r3.f18272E = null;
        r3 = r1;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02be, code lost:
        r8 = null;
        r4 = null;
        r3 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02c2, code lost:
        if (r0 == null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c4, code lost:
        r11.f17902e.mo13150b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c9, code lost:
        if (r21 != false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02cb, code lost:
        r11.f17886S = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02cd, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02ce, code lost:
        if (r5 == false) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d0, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r0 = r11.f17904g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02d3, code lost:
        if (r0 != null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02d5, code lost:
        r12 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02d7, code lost:
        r12 = new java.util.ArrayList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02dc, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02dd, code lost:
        if (r12 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02df, code lost:
        r0 = r12.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02e4, code lost:
        if (r7 >= r0) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02e6, code lost:
        ((com.facebook.litho.C6099aj) r12.get(r7)).mo12848a(r3, r6);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02f4, code lost:
        if (r11.f17883P == null) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02f6, code lost:
        r11.f17883P.mo13128a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02fc, code lost:
        if (r1 == null) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02fe, code lost:
        r0 = r11.f17883P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0300, code lost:
        if (r0 != null) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0302, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r0 = r11.f17883P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0305, code lost:
        if (r0 != null) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0307, code lost:
        r0 = new com.facebook.litho.C6146c();
        r11.f17883P = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x030e, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0313, code lost:
        r0.mo13128a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x031a, code lost:
        if (r4 == null) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x031c, code lost:
        r11.f17898ae.mo13141a();
        r0 = r4.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0325, code lost:
        if (r2 >= r0) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0327, code lost:
        r1 = (com.facebook.litho.C6407q) r4.get(r2);
        r11.f17877H.mo13138b(r1.f18995r, r1, com.facebook.litho.C6103an.m15882i(r1));
        r3 = r11.f17898ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x033a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r1.mo13317H(r11.f17898ae);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0340, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0341, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0347, code lost:
        r11.f17877H.mo13139c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x034c, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0352, code lost:
        if (com.facebook.litho.C6349gb.m17046b() == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0354, code lost:
        mo12714i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0357, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0358, code lost:
        ((com.facebook.litho.C6192dl) r11.f17889V).post(r11.f17890W);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x036c, code lost:
        throw new java.lang.IllegalStateException("LayoutStateFuture ref count is below 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r10 = r11.f17907j;
        r13 = r1;
        r12 = r10;
        r1 = new com.facebook.litho.C6098ai(r16, r10, r14, r5, r6, r11.f17888U, r20, r18, r19);
        r1 = r11.f17891X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r3 >= r11.f17892Y.size()) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        r9 = r11.f17892Y.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r9.f18024k != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r9.equals(r13) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r9 = r13;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r3 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r11.f17892Y.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        r9.f18020g.incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r3 = r9.mo12844a(r18);
        r4 = r11.f17891X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        if (r9.f18020g.decrementAndGet() < 0) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00af, code lost:
        if (r9.f18020g.get() != 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        r9.mo12845b();
        r11.f17892Y.remove(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        r4 = r14.f18998u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        if (r4 == null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00be, code lost:
        r6 = r12.f19009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r4 == r6) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        com.facebook.litho.C6106aq.m15891b(2, "ComponentTree:CTContextIsDifferentFromRootBuilderContext", "ComponentTree context is different from root builder context, ComponentTree context=" + java.lang.String.valueOf(r6) + ", root builder context=" + java.lang.String.valueOf(r14.f18998u) + ", root=" + r14.mo13461q() + ", ContextTree=" + com.facebook.litho.C6102am.m15872a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r3 != null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        if (mo12723s() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        if (m15674r(r18) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        r0 = com.facebook.litho.C6187dg.m16345j(r18);
        r1 = java.lang.Thread.currentThread().getName();
        r2 = r11.f17922y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        if (r2 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011e, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0121, code lost:
        r2 = r2.mo13461q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0125, code lost:
        r0 = "LayoutState is null, but only async operations can return a null LayoutState. Source: " + r0 + ", current thread: " + r1 + ". Root: " + r2 + ". Interruptible layouts: false";
        r1 = com.facebook.litho.p325d.C6180a.f18234a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0151, code lost:
        if (r0 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        r0.f18535a = r3.f18313r;
        r0.f18536b = r3.f18314s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015b, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015e, code lost:
        if (r15 <= r11.f17895ab) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        if (r3.f18275H != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016c, code lost:
        if (m15672D(r3, r11.f17923z, r11.f17870A) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016e, code lost:
        r11.f17895ab = r15;
        r11.f17872C = r3;
        r3.f18275H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0175, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0176, code lost:
        r0 = r3.f18319x;
        r1 = null;
        r3.f18319x = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017b, code lost:
        if (r5 == false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017d, code lost:
        r4 = r3.f18293a;
        r3.f18293a = null;
        r3.f18297b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0183, code lost:
        if (r0 == null) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0185, code lost:
        r1 = r11.f17873D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        if (r1 == null) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018b, code lost:
        if (com.facebook.litho.p325d.C6180a.f18248o == false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018d, code lost:
        r4.indexOf(r14);
        com.facebook.litho.C6103an.m15882i(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019f, code lost:
        if (com.facebook.litho.C6115az.f18046a.remove(java.lang.Integer.valueOf(r11.f17875F)) != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a1, code lost:
        new com.facebook.litho.C6280fw(r1);
        r6 = r11.f17885R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a8, code lost:
        if (r6 != null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01aa, code lost:
        r11.f17885R = new com.facebook.litho.C6114ay(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b2, code lost:
        r7 = r6.f18045a;
        r6.mo12870a(new com.facebook.litho.C6113ax(java.lang.System.currentTimeMillis(), ((com.facebook.litho.C6113ax) r7.get(r7.size() - 1)).f18044a + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d1, code lost:
        r6 = r0.mo13276a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d5, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        if (r6 == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r7 = r1.f18539a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01da, code lost:
        if (r7 == null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e0, code lost:
        if (r7.isEmpty() == false) goto L_0x01e3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12715j(com.facebook.litho.C6276fs r17, int r18, java.lang.String r19, com.facebook.litho.C6381hf r20, boolean r21) {
        /*
            r16 = this;
            r11 = r16
            r0 = r17
            java.lang.Object r1 = r11.f17916s
            monitor-enter(r1)
            com.facebook.litho.ag r2 = r11.f17917t     // Catch:{ all -> 0x0378 }
            r12 = 0
            if (r2 == 0) goto L_0x0013
            com.facebook.litho.dm r3 = r11.f17915r     // Catch:{ all -> 0x0378 }
            r3.mo13164b(r2)     // Catch:{ all -> 0x0378 }
            r11.f17917t = r12     // Catch:{ all -> 0x0378 }
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            monitor-enter(r16)
            int r1 = r11.f17923z     // Catch:{ all -> 0x0375 }
            r13 = -1
            if (r1 == r13) goto L_0x0373
            int r2 = r11.f17870A     // Catch:{ all -> 0x0375 }
            if (r2 == r13) goto L_0x0373
            com.facebook.litho.q r3 = r11.f17922y     // Catch:{ all -> 0x0375 }
            if (r3 != 0) goto L_0x0024
            goto L_0x0373
        L_0x0024:
            com.facebook.litho.dg r4 = r11.f17872C     // Catch:{ all -> 0x0375 }
            int r3 = r3.f18989l     // Catch:{ all -> 0x0375 }
            boolean r1 = m15671C(r4, r3, r1, r2)     // Catch:{ all -> 0x0375 }
            if (r1 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x003a
            com.facebook.litho.dg r1 = r11.f17872C     // Catch:{ all -> 0x0375 }
            int r2 = r1.f18313r     // Catch:{ all -> 0x0375 }
            r0.f18535a = r2     // Catch:{ all -> 0x0375 }
            int r1 = r1.f18314s     // Catch:{ all -> 0x0375 }
            r0.f18536b = r1     // Catch:{ all -> 0x0375 }
        L_0x003a:
            monitor-exit(r16)     // Catch:{ all -> 0x0375 }
            return
        L_0x003c:
            int r5 = r11.f17923z     // Catch:{ all -> 0x0375 }
            int r6 = r11.f17870A     // Catch:{ all -> 0x0375 }
            com.facebook.litho.q r1 = r11.f17922y     // Catch:{ all -> 0x0375 }
            com.facebook.litho.q r14 = r1.mo13318j()     // Catch:{ all -> 0x0375 }
            int r15 = r11.f17894aa     // Catch:{ all -> 0x0375 }
            int r1 = r15 + 1
            r11.f17894aa = r1     // Catch:{ all -> 0x0375 }
            monitor-exit(r16)     // Catch:{ all -> 0x0375 }
            com.facebook.litho.u r10 = r11.f17907j
            boolean r7 = r11.f17888U
            com.facebook.litho.ai r9 = new com.facebook.litho.ai
            r1 = r9
            r2 = r16
            r3 = r10
            r4 = r14
            r8 = r20
            r13 = r9
            r9 = r18
            r12 = r10
            r10 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r11.f17891X
            monitor-enter(r1)
            r2 = 0
            r3 = 0
        L_0x0068:
            java.util.List r4 = r11.f17892Y     // Catch:{ all -> 0x0370 }
            int r4 = r4.size()     // Catch:{ all -> 0x0370 }
            r5 = 1
            if (r3 >= r4) goto L_0x0089
            java.util.List r4 = r11.f17892Y     // Catch:{ all -> 0x0370 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0370 }
            r9 = r4
            com.facebook.litho.ai r9 = (com.facebook.litho.C6098ai) r9     // Catch:{ all -> 0x0370 }
            boolean r4 = r9.f18024k     // Catch:{ all -> 0x0370 }
            if (r4 != 0) goto L_0x0086
            boolean r4 = r9.equals(r13)     // Catch:{ all -> 0x0370 }
            if (r4 == 0) goto L_0x0086
            r3 = 1
            goto L_0x008b
        L_0x0086:
            int r3 = r3 + 1
            goto L_0x0068
        L_0x0089:
            r9 = r13
            r3 = 0
        L_0x008b:
            if (r3 != 0) goto L_0x0092
            java.util.List r3 = r11.f17892Y     // Catch:{ all -> 0x0370 }
            r3.add(r9)     // Catch:{ all -> 0x0370 }
        L_0x0092:
            java.util.concurrent.atomic.AtomicInteger r3 = r9.f18020g     // Catch:{ all -> 0x0370 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0370 }
            monitor-exit(r1)     // Catch:{ all -> 0x0370 }
            r1 = r18
            com.facebook.litho.dg r3 = r9.mo12844a(r1)
            java.lang.Object r4 = r11.f17891X
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r6 = r9.f18020g     // Catch:{ all -> 0x036d }
            int r6 = r6.decrementAndGet()     // Catch:{ all -> 0x036d }
            if (r6 < 0) goto L_0x0365
            java.util.concurrent.atomic.AtomicInteger r6 = r9.f18020g     // Catch:{ all -> 0x036d }
            int r6 = r6.get()     // Catch:{ all -> 0x036d }
            if (r6 != 0) goto L_0x00b9
            r9.mo12845b()     // Catch:{ all -> 0x036d }
            java.util.List r6 = r11.f17892Y     // Catch:{ all -> 0x036d }
            r6.remove(r9)     // Catch:{ all -> 0x036d }
        L_0x00b9:
            monitor-exit(r4)     // Catch:{ all -> 0x036d }
            android.content.Context r4 = r14.f18998u
            if (r4 == 0) goto L_0x0100
            android.content.Context r6 = r12.f19009b
            if (r4 == r6) goto L_0x0100
            java.lang.String r4 = java.lang.String.valueOf(r6)
            android.content.Context r6 = r14.f18998u
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = r14.mo13461q()
            java.lang.String r8 = com.facebook.litho.C6102am.m15872a(r12)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "ComponentTree context is different from root builder context, ComponentTree context="
            r9.<init>(r10)
            r9.append(r4)
            java.lang.String r4 = ", root builder context="
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = ", root="
            r9.append(r4)
            r9.append(r7)
            java.lang.String r4 = ", ContextTree="
            r9.append(r4)
            r9.append(r8)
            java.lang.String r4 = "ComponentTree:CTContextIsDifferentFromRootBuilderContext"
            java.lang.String r6 = r9.toString()
            r7 = 2
            com.facebook.litho.C6106aq.m15891b(r7, r4, r6)
        L_0x0100:
            if (r3 != 0) goto L_0x0151
            boolean r0 = r16.mo12723s()
            if (r0 != 0) goto L_0x0150
            boolean r0 = m15674r(r18)
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = com.facebook.litho.C6187dg.m16345j(r18)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            com.facebook.litho.q r2 = r11.f17922y
            if (r2 != 0) goto L_0x0121
            java.lang.String r2 = "null"
            goto L_0x0125
        L_0x0121:
            java.lang.String r2 = r2.mo13461q()
        L_0x0125:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "LayoutState is null, but only async operations can return a null LayoutState. Source: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", current thread: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ". Root: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ". Interruptible layouts: false"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r1 = com.facebook.litho.p325d.C6180a.f18234a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0150:
            return
        L_0x0151:
            if (r0 == 0) goto L_0x015b
            int r1 = r3.f18313r
            r0.f18535a = r1
            int r1 = r3.f18314s
            r0.f18536b = r1
        L_0x015b:
            monitor-enter(r16)
            int r0 = r11.f17895ab     // Catch:{ all -> 0x0362 }
            if (r15 <= r0) goto L_0x0175
            boolean r0 = r3.f18275H     // Catch:{ all -> 0x0362 }
            if (r0 != 0) goto L_0x0175
            int r0 = r11.f17923z     // Catch:{ all -> 0x0362 }
            int r1 = r11.f17870A     // Catch:{ all -> 0x0362 }
            boolean r0 = m15672D(r3, r0, r1)     // Catch:{ all -> 0x0362 }
            if (r0 == 0) goto L_0x0175
            r11.f17895ab = r15     // Catch:{ all -> 0x0362 }
            r11.f17872C = r3     // Catch:{ all -> 0x0362 }
            r3.f18275H = r5     // Catch:{ all -> 0x0362 }
            goto L_0x0176
        L_0x0175:
            r5 = 0
        L_0x0176:
            com.facebook.litho.fw r0 = r3.f18319x     // Catch:{ all -> 0x0362 }
            r1 = 0
            r3.f18319x = r1     // Catch:{ all -> 0x0362 }
            if (r5 == 0) goto L_0x02be
            java.util.List r4 = r3.f18293a     // Catch:{ all -> 0x0362 }
            r3.f18293a = r1     // Catch:{ all -> 0x0362 }
            r3.f18297b = r1     // Catch:{ all -> 0x0362 }
            if (r0 == 0) goto L_0x02ab
            com.facebook.litho.fw r1 = r11.f17873D     // Catch:{ all -> 0x0362 }
            if (r1 == 0) goto L_0x02ab
            boolean r6 = com.facebook.litho.p325d.C6180a.f18248o     // Catch:{ all -> 0x0362 }
            if (r6 == 0) goto L_0x01d1
            r4.indexOf(r14)     // Catch:{ all -> 0x0362 }
            com.facebook.litho.C6103an.m15882i(r14)     // Catch:{ all -> 0x0362 }
            java.util.HashSet r6 = com.facebook.litho.C6115az.f18046a     // Catch:{ all -> 0x0362 }
            int r7 = r11.f17875F     // Catch:{ all -> 0x0362 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0362 }
            boolean r6 = r6.remove(r7)     // Catch:{ all -> 0x0362 }
            if (r6 != 0) goto L_0x01d1
            com.facebook.litho.fw r6 = new com.facebook.litho.fw     // Catch:{ all -> 0x0362 }
            r6.<init>(r1)     // Catch:{ all -> 0x0362 }
            com.facebook.litho.ay r6 = r11.f17885R     // Catch:{ all -> 0x0362 }
            if (r6 != 0) goto L_0x01b2
            com.facebook.litho.ay r6 = new com.facebook.litho.ay     // Catch:{ all -> 0x0362 }
            r6.<init>(r14)     // Catch:{ all -> 0x0362 }
            r11.f17885R = r6     // Catch:{ all -> 0x0362 }
            goto L_0x01d1
        L_0x01b2:
            java.util.List r7 = r6.f18045a     // Catch:{ all -> 0x0362 }
            int r8 = r7.size()     // Catch:{ all -> 0x0362 }
            r9 = -1
            int r8 = r8 + r9
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0362 }
            com.facebook.litho.ax r7 = (com.facebook.litho.C6113ax) r7     // Catch:{ all -> 0x0362 }
            long r7 = r7.f18044a     // Catch:{ all -> 0x0362 }
            r9 = 1
            long r7 = r7 + r9
            com.facebook.litho.ax r9 = new com.facebook.litho.ax     // Catch:{ all -> 0x0362 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0362 }
            r9.<init>(r12, r7)     // Catch:{ all -> 0x0362 }
            r6.mo12870a(r9)     // Catch:{ all -> 0x0362 }
        L_0x01d1:
            java.util.Map r6 = r0.mo13276a()     // Catch:{ all -> 0x0362 }
            monitor-enter(r1)     // Catch:{ all -> 0x0362 }
            if (r6 == 0) goto L_0x0244
            java.util.Map r7 = r1.f18539a     // Catch:{ all -> 0x02a8 }
            if (r7 == 0) goto L_0x0244
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x02a8 }
            if (r7 == 0) goto L_0x01e3
            goto L_0x0244
        L_0x01e3:
            monitor-exit(r1)     // Catch:{ all -> 0x02a8 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0362 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0362 }
        L_0x01ec:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0362 }
            if (r7 == 0) goto L_0x0245
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0362 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x0362 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x0362 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0362 }
            monitor-enter(r1)     // Catch:{ all -> 0x0362 }
            java.util.Map r9 = r1.f18539a     // Catch:{ all -> 0x0241 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0241 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0241 }
            java.util.Map r10 = r1.f18540b     // Catch:{ all -> 0x0241 }
            if (r10 != 0) goto L_0x020d
            r10 = 0
            goto L_0x0213
        L_0x020d:
            java.lang.Object r10 = r10.get(r8)     // Catch:{ all -> 0x0241 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0241 }
        L_0x0213:
            monitor-exit(r1)     // Catch:{ all -> 0x0241 }
            if (r9 == 0) goto L_0x01ec
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0362 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0362 }
            int r12 = r9.size()     // Catch:{ all -> 0x0362 }
            int r13 = r7.size()     // Catch:{ all -> 0x0362 }
            if (r12 != r13) goto L_0x0238
            monitor-enter(r1)     // Catch:{ all -> 0x0362 }
            java.util.Map r7 = r1.f18539a     // Catch:{ all -> 0x0235 }
            r7.remove(r8)     // Catch:{ all -> 0x0235 }
            java.util.Map r7 = r1.f18540b     // Catch:{ all -> 0x0235 }
            if (r7 == 0) goto L_0x0233
            r7.remove(r8)     // Catch:{ all -> 0x0235 }
        L_0x0233:
            monitor-exit(r1)     // Catch:{ all -> 0x0235 }
            goto L_0x01ec
        L_0x0235:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0235 }
            throw r0     // Catch:{ all -> 0x0362 }
        L_0x0238:
            r9.removeAll(r7)     // Catch:{ all -> 0x0362 }
            if (r10 == 0) goto L_0x01ec
            r10.removeAll(r7)     // Catch:{ all -> 0x0362 }
            goto L_0x01ec
        L_0x0241:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0241 }
            throw r0     // Catch:{ all -> 0x0362 }
        L_0x0244:
            monitor-exit(r1)     // Catch:{ all -> 0x02a8 }
        L_0x0245:
            java.util.HashSet r6 = r0.f18544f     // Catch:{ all -> 0x0362 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0362 }
            r7.<init>()     // Catch:{ all -> 0x0362 }
            if (r6 == 0) goto L_0x0275
            java.util.Map r8 = r0.f18543e     // Catch:{ all -> 0x0362 }
            if (r8 != 0) goto L_0x0253
            goto L_0x0275
        L_0x0253:
            java.util.Set r8 = r8.keySet()     // Catch:{ all -> 0x0362 }
            r7.addAll(r8)     // Catch:{ all -> 0x0362 }
            int r8 = r7.size()     // Catch:{ all -> 0x0362 }
            r9 = 0
        L_0x025f:
            if (r9 >= r8) goto L_0x0275
            java.lang.Object r10 = r7.get(r9)     // Catch:{ all -> 0x0362 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0362 }
            boolean r12 = r6.contains(r10)     // Catch:{ all -> 0x0362 }
            if (r12 != 0) goto L_0x0272
            java.util.Map r12 = r0.f18543e     // Catch:{ all -> 0x0362 }
            r12.remove(r10)     // Catch:{ all -> 0x0362 }
        L_0x0272:
            int r9 = r9 + 1
            goto L_0x025f
        L_0x0275:
            java.util.Map r6 = r0.mo13280e()     // Catch:{ all -> 0x0362 }
            r1.mo13282g(r6)     // Catch:{ all -> 0x0362 }
            java.util.Map r6 = r0.mo13278c()     // Catch:{ all -> 0x0362 }
            r1.mo13283h(r6)     // Catch:{ all -> 0x0362 }
            java.util.Map r6 = r1.f18545g     // Catch:{ all -> 0x0362 }
            if (r6 == 0) goto L_0x028a
            r6.clear()     // Catch:{ all -> 0x0362 }
        L_0x028a:
            java.util.Map r6 = r0.f18545g     // Catch:{ all -> 0x0362 }
            if (r6 == 0) goto L_0x02ab
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0362 }
            if (r6 != 0) goto L_0x02ab
            java.util.Map r6 = r1.f18545g     // Catch:{ all -> 0x0362 }
            if (r6 != 0) goto L_0x02a2
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0362 }
            java.util.Map r7 = r0.f18545g     // Catch:{ all -> 0x0362 }
            r6.<init>(r7)     // Catch:{ all -> 0x0362 }
            r1.f18545g = r6     // Catch:{ all -> 0x0362 }
            goto L_0x02ab
        L_0x02a2:
            java.util.Map r1 = r0.f18545g     // Catch:{ all -> 0x0362 }
            r6.putAll(r1)     // Catch:{ all -> 0x0362 }
            goto L_0x02ab
        L_0x02a8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02a8 }
            throw r0     // Catch:{ all -> 0x0362 }
        L_0x02ab:
            java.util.List r1 = r11.f17904g     // Catch:{ all -> 0x0362 }
            if (r1 == 0) goto L_0x02b4
            int r1 = r3.f18313r     // Catch:{ all -> 0x0362 }
            int r6 = r3.f18314s     // Catch:{ all -> 0x0362 }
            goto L_0x02b6
        L_0x02b4:
            r1 = 0
            r6 = 0
        L_0x02b6:
            java.util.Map r7 = r3.f18272E     // Catch:{ all -> 0x0362 }
            r8 = 0
            r3.f18272E = r8     // Catch:{ all -> 0x0362 }
            r3 = r1
            r1 = r7
            goto L_0x02c2
        L_0x02be:
            r8 = r1
            r4 = r1
            r3 = 0
            r6 = 0
        L_0x02c2:
            if (r0 == 0) goto L_0x02c9
            com.facebook.litho.cw r7 = r11.f17902e     // Catch:{ all -> 0x0362 }
            r7.mo13150b(r0)     // Catch:{ all -> 0x0362 }
        L_0x02c9:
            if (r21 != 0) goto L_0x02cd
            r11.f17886S = r2     // Catch:{ all -> 0x0362 }
        L_0x02cd:
            monitor-exit(r16)     // Catch:{ all -> 0x0362 }
            if (r5 == 0) goto L_0x031a
            monitor-enter(r16)
            java.util.List r0 = r11.f17904g     // Catch:{ all -> 0x0317 }
            if (r0 != 0) goto L_0x02d7
            r12 = r8
            goto L_0x02dc
        L_0x02d7:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0317 }
            r12.<init>(r0)     // Catch:{ all -> 0x0317 }
        L_0x02dc:
            monitor-exit(r16)     // Catch:{ all -> 0x0317 }
            if (r12 == 0) goto L_0x02f2
            int r0 = r12.size()
            r7 = 0
        L_0x02e4:
            if (r7 >= r0) goto L_0x02f2
            java.lang.Object r8 = r12.get(r7)
            com.facebook.litho.aj r8 = (com.facebook.litho.C6099aj) r8
            r8.mo12848a(r3, r6)
            int r7 = r7 + 1
            goto L_0x02e4
        L_0x02f2:
            com.facebook.litho.c r0 = r11.f17883P
            if (r0 == 0) goto L_0x02fc
            com.facebook.litho.c r0 = r11.f17883P
            r0.mo13128a(r1)
            goto L_0x031a
        L_0x02fc:
            if (r1 == 0) goto L_0x031a
            com.facebook.litho.c r0 = r11.f17883P
            if (r0 != 0) goto L_0x0313
            monitor-enter(r16)
            com.facebook.litho.c r0 = r11.f17883P     // Catch:{ all -> 0x0310 }
            if (r0 != 0) goto L_0x030e
            com.facebook.litho.c r0 = new com.facebook.litho.c     // Catch:{ all -> 0x0310 }
            r0.<init>()     // Catch:{ all -> 0x0310 }
            r11.f17883P = r0     // Catch:{ all -> 0x0310 }
        L_0x030e:
            monitor-exit(r16)     // Catch:{ all -> 0x0310 }
            goto L_0x0313
        L_0x0310:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0310 }
            throw r0
        L_0x0313:
            r0.mo13128a(r1)
            goto L_0x031a
        L_0x0317:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0317 }
            throw r0
        L_0x031a:
            if (r4 == 0) goto L_0x034c
            com.facebook.litho.cf r0 = r11.f17898ae
            r0.mo13141a()
            int r0 = r4.size()
        L_0x0325:
            if (r2 >= r0) goto L_0x0347
            java.lang.Object r1 = r4.get(r2)
            com.facebook.litho.q r1 = (com.facebook.litho.C6407q) r1
            java.lang.String r3 = com.facebook.litho.C6103an.m15882i(r1)
            com.facebook.litho.u r6 = r1.f18995r
            com.facebook.litho.cd r7 = r11.f17877H
            r7.mo13138b(r6, r1, r3)
            com.facebook.litho.cf r3 = r11.f17898ae
            monitor-enter(r3)
            com.facebook.litho.cf r6 = r11.f17898ae     // Catch:{ all -> 0x0344 }
            r1.mo13317H(r6)     // Catch:{ all -> 0x0344 }
            monitor-exit(r3)     // Catch:{ all -> 0x0344 }
            int r2 = r2 + 1
            goto L_0x0325
        L_0x0344:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0344 }
            throw r0
        L_0x0347:
            com.facebook.litho.cd r0 = r11.f17877H
            r0.mo13139c()
        L_0x034c:
            if (r5 == 0) goto L_0x0361
            boolean r0 = com.facebook.litho.C6349gb.m17046b()
            if (r0 == 0) goto L_0x0358
            r16.mo12714i()
            return
        L_0x0358:
            com.facebook.litho.dm r0 = r11.f17889V
            java.lang.Runnable r1 = r11.f17890W
            com.facebook.litho.dl r0 = (com.facebook.litho.C6192dl) r0
            r0.post(r1)
        L_0x0361:
            return
        L_0x0362:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0362 }
            throw r0
        L_0x0365:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x036d }
            java.lang.String r1 = "LayoutStateFuture ref count is below 0"
            r0.<init>(r1)     // Catch:{ all -> 0x036d }
            throw r0     // Catch:{ all -> 0x036d }
        L_0x036d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x036d }
            throw r0
        L_0x0370:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0370 }
            throw r0
        L_0x0373:
            monitor-exit(r16)     // Catch:{ all -> 0x0375 }
            return
        L_0x0375:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0375 }
            throw r0
        L_0x0378:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            goto L_0x037c
        L_0x037b:
            throw r0
        L_0x037c:
            goto L_0x037b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.mo12715j(com.facebook.litho.fs, int, java.lang.String, com.facebook.litho.hf, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12716k() {
        C6349gb.m17045a();
        C6174cv cvVar = this.f17887T;
        if (cvVar != null) {
            int size = cvVar.f18218a.size();
            for (int i = 0; i < size; i++) {
                C6173cu cuVar = (C6173cu) cvVar.f18218a.get(i);
                cuVar.f18216a.clear();
                ViewPager viewPager = (ViewPager) cuVar.f18217b.get();
                if (viewPager != null) {
                    C2043bi.m5520N(viewPager, new C6172ct(cuVar, viewPager));
                }
            }
            cvVar.f18218a.clear();
        }
        synchronized (this) {
            this.f17912o = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo12717l() {
        C6349gb.m17045a();
        if (!this.f17910m) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        } else if (this.f17914q != null) {
            Rect rect = new Rect();
            if (!this.f17914q.getLocalVisibleRect(rect)) {
                if (this.f17918u) {
                    return;
                }
                if ((this.f17921x == null || rect.height() != 0) && (this.f17920w == null || rect.width() != 0)) {
                    return;
                }
            }
            mo12719n(rect, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0123, code lost:
        r0 = th;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12718m(int r20, int r21, int[] r22, boolean r23) {
        /*
            r19 = this;
            r12 = r19
            r0 = r20
            r13 = r21
            java.lang.String r14 = "Measure Specs: ["
            com.facebook.litho.C6349gb.m17045a()
            r15 = 1
            r12.f17909l = r15
            r11 = 0
            monitor-enter(r19)     // Catch:{ all -> 0x0125 }
            com.facebook.litho.dg r1 = r12.f17872C     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0021
            com.facebook.litho.dg r2 = r12.f17871B     // Catch:{ all -> 0x011d }
            if (r1 == r2) goto L_0x0021
            boolean r1 = m15672D(r1, r0, r13)     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0021
            r19.m15670B()     // Catch:{ all -> 0x011d }
        L_0x0021:
            com.facebook.litho.dg r1 = r12.f17871B     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x002f
            int r2 = r1.f18300e     // Catch:{ all -> 0x011d }
            if (r2 != r0) goto L_0x002f
            int r2 = r1.f18301f     // Catch:{ all -> 0x011d }
            if (r2 != r13) goto L_0x002f
            r2 = 1
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            com.facebook.litho.q r3 = r12.f17922y     // Catch:{ all -> 0x011d }
            int r3 = r3.f18989l     // Catch:{ all -> 0x011d }
            boolean r1 = m15671C(r1, r3, r0, r13)     // Catch:{ all -> 0x011d }
            if (r2 != 0) goto L_0x003f
            if (r1 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r1 = 1
            goto L_0x004a
        L_0x003f:
            com.facebook.litho.dg r1 = r12.f17871B     // Catch:{ all -> 0x011d }
            int r2 = r1.f18313r     // Catch:{ all -> 0x011d }
            r22[r11] = r2     // Catch:{ all -> 0x011d }
            int r1 = r1.f18314s     // Catch:{ all -> 0x011d }
            r22[r15] = r1     // Catch:{ all -> 0x011d }
            r1 = 0
        L_0x004a:
            monitor-exit(r19)     // Catch:{ all -> 0x011d }
            if (r1 != 0) goto L_0x0068
            if (r23 == 0) goto L_0x0052
            r16 = 1
            goto L_0x006a
        L_0x0052:
            r2 = 0
            r5 = 1
            r6 = 0
            r7 = 7
            r8 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            r1 = r19
            r3 = r20
            r4 = r21
            r13 = 0
            r11 = r14
            r1.mo12726v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0125 }
            r15 = 0
            goto L_0x010f
        L_0x0068:
            r16 = r23
        L_0x006a:
            com.facebook.litho.fs r10 = new com.facebook.litho.fs     // Catch:{ all -> 0x0125 }
            r10.<init>()     // Catch:{ all -> 0x0125 }
            r2 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r9 = 0
            r17 = 0
            r1 = r19
            r3 = r20
            r4 = r21
            r6 = r10
            r18 = r10
            r10 = r17
            r15 = 0
            r11 = r16
            r1.mo12726v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0121 }
            monitor-enter(r19)     // Catch:{ all -> 0x0121 }
            boolean r1 = r12.f17901d     // Catch:{ all -> 0x011a }
            if (r1 != 0) goto L_0x0112
            com.facebook.litho.dg r1 = r12.f17872C     // Catch:{ all -> 0x011a }
            com.facebook.litho.dg r2 = r12.f17871B     // Catch:{ all -> 0x011a }
            if (r1 == r2) goto L_0x0095
            r19.m15670B()     // Catch:{ all -> 0x011a }
        L_0x0095:
            com.facebook.litho.dg r1 = r12.f17871B     // Catch:{ all -> 0x011a }
            if (r1 == 0) goto L_0x00a3
            int r0 = r1.f18313r     // Catch:{ all -> 0x011a }
            r22[r15] = r0     // Catch:{ all -> 0x011a }
            int r0 = r1.f18314s     // Catch:{ all -> 0x011a }
            r1 = 1
            r22[r1] = r0     // Catch:{ all -> 0x011a }
            goto L_0x010e
        L_0x00a3:
            r1 = r18
            int r2 = r1.f18535a     // Catch:{ all -> 0x011a }
            r22[r15] = r2     // Catch:{ all -> 0x011a }
            int r2 = r1.f18536b     // Catch:{ all -> 0x011a }
            r3 = 1
            r22[r3] = r2     // Catch:{ all -> 0x011a }
            java.lang.String r0 = android.view.View.MeasureSpec.toString(r20)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = android.view.View.MeasureSpec.toString(r21)     // Catch:{ all -> 0x011a }
            int r3 = r12.f17923z     // Catch:{ all -> 0x011a }
            java.lang.String r3 = android.view.View.MeasureSpec.toString(r3)     // Catch:{ all -> 0x011a }
            int r4 = r12.f17870A     // Catch:{ all -> 0x011a }
            java.lang.String r4 = android.view.View.MeasureSpec.toString(r4)     // Catch:{ all -> 0x011a }
            int r5 = r1.f18535a     // Catch:{ all -> 0x011a }
            int r1 = r1.f18536b     // Catch:{ all -> 0x011a }
            int r6 = r12.f17897ad     // Catch:{ all -> 0x011a }
            java.lang.String r6 = com.facebook.litho.C6187dg.m16345j(r6)     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r7.<init>(r14)     // Catch:{ all -> 0x011a }
            r7.append(r0)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = ", "
            r7.append(r0)     // Catch:{ all -> 0x011a }
            r7.append(r2)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "], Current Specs: ["
            r7.append(r0)     // Catch:{ all -> 0x011a }
            r7.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = ", "
            r7.append(r0)     // Catch:{ all -> 0x011a }
            r7.append(r4)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "], Output [W: "
            r7.append(r0)     // Catch:{ all -> 0x011a }
            r7.append(r5)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = ", H:"
            r7.append(r0)     // Catch:{ all -> 0x011a }
            r7.append(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "], Last Layout Source: "
            r7.append(r0)     // Catch:{ all -> 0x011a }
            r7.append(r6)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "NullLayoutStateInMeasure"
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x011a }
            r2 = 2
            com.facebook.litho.C6106aq.m15891b(r2, r0, r1)     // Catch:{ all -> 0x011a }
        L_0x010e:
            monitor-exit(r19)     // Catch:{ all -> 0x011a }
        L_0x010f:
            r12.f17909l = r15
            return
        L_0x0112:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "Tree is released during measure!"
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x011d:
            r0 = move-exception
            r15 = 0
        L_0x011f:
            monitor-exit(r19)     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r0 = move-exception
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            goto L_0x011f
        L_0x0125:
            r0 = move-exception
            r15 = 0
        L_0x0127:
            r12.f17909l = r15
            goto L_0x012b
        L_0x012a:
            throw r0
        L_0x012b:
            goto L_0x012a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.mo12718m(int, int, int[], boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12719n(Rect rect, boolean z) {
        String str;
        C6349gb.m17045a();
        if (this.f17908k) {
            C6100ak akVar = new C6100ak(rect, z);
            Deque deque = this.f17884Q;
            if (deque == null) {
                this.f17884Q = new ArrayDeque();
            } else if (deque.size() > 25) {
                LithoView lithoView = this.f17914q;
                if (lithoView != null) {
                    str = LithoViewTestHelper.viewToString(lithoView, true);
                    if (TextUtils.isEmpty(str)) {
                        str = "(" + lithoView.getLeft() + "," + lithoView.getTop() + "-" + lithoView.getRight() + "," + lithoView.getBottom() + ")";
                    }
                } else {
                    str = null;
                }
                Object obj = this.f17922y;
                if (obj == null) {
                    obj = mo12709e();
                }
                C6106aq.m15891b(3, "ComponentTree:ReentrantMountsExceedMaxAttempts", "Reentrant mounts exceed max attempts, view=" + str + ", component=" + String.valueOf(obj));
                this.f17884Q.clear();
                return;
            }
            this.f17884Q.add(akVar);
            return;
        }
        m15669A(rect, z);
        Deque deque2 = this.f17884Q;
        if (deque2 != null) {
            ArrayDeque arrayDeque = new ArrayDeque(deque2);
            this.f17884Q.clear();
            while (!arrayDeque.isEmpty()) {
                C6100ak akVar2 = (C6100ak) arrayDeque.pollFirst();
                this.f17914q.mo12730C();
                m15669A(akVar2.f18030a, akVar2.f18031b);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c1, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c5, code lost:
        if (r1 >= r0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c7, code lost:
        r4 = (com.facebook.litho.C6407q) r2.get(r1);
        r5 = (java.lang.String) r3.get(r1);
        r5 = r4.f18995r;
        r4.mo12832ax();
        r1 = r1 + 1;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12720o() {
        /*
            r7 = this;
            boolean r0 = r7.f17908k
            if (r0 != 0) goto L_0x00ee
            monitor-enter(r7)
            com.facebook.litho.dm r0 = r7.f17889V     // Catch:{ all -> 0x00eb }
            java.lang.Runnable r1 = r7.f17890W     // Catch:{ all -> 0x00eb }
            com.facebook.litho.dl r0 = (com.facebook.litho.C6192dl) r0     // Catch:{ all -> 0x00eb }
            r0.removeCallbacks(r1)     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = r7.f17916s     // Catch:{ all -> 0x00eb }
            monitor-enter(r0)     // Catch:{ all -> 0x00eb }
            com.facebook.litho.ag r1 = r7.f17917t     // Catch:{ all -> 0x00e8 }
            r2 = 0
            if (r1 == 0) goto L_0x001d
            com.facebook.litho.dm r3 = r7.f17915r     // Catch:{ all -> 0x00e8 }
            r3.mo13164b(r1)     // Catch:{ all -> 0x00e8 }
            r7.f17917t = r2     // Catch:{ all -> 0x00e8 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r7.f17905h     // Catch:{ all -> 0x00eb }
            monitor-enter(r0)     // Catch:{ all -> 0x00eb }
            com.facebook.litho.al r1 = r7.f17906i     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x002c
            com.facebook.litho.dm r3 = r7.f17915r     // Catch:{ all -> 0x00e5 }
            r3.mo13164b(r1)     // Catch:{ all -> 0x00e5 }
            r7.f17906i = r2     // Catch:{ all -> 0x00e5 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r7.f17891X     // Catch:{ all -> 0x00eb }
            monitor-enter(r0)     // Catch:{ all -> 0x00eb }
            r1 = 0
            r3 = 0
        L_0x0032:
            java.util.List r4 = r7.f17892Y     // Catch:{ all -> 0x00e2 }
            int r4 = r4.size()     // Catch:{ all -> 0x00e2 }
            if (r3 >= r4) goto L_0x0048
            java.util.List r4 = r7.f17892Y     // Catch:{ all -> 0x00e2 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x00e2 }
            com.facebook.litho.ai r4 = (com.facebook.litho.C6098ai) r4     // Catch:{ all -> 0x00e2 }
            r4.mo12845b()     // Catch:{ all -> 0x00e2 }
            int r3 = r3 + 1
            goto L_0x0032
        L_0x0048:
            java.util.List r3 = r7.f17892Y     // Catch:{ all -> 0x00e2 }
            r3.clear()     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            r0 = 1
            r7.f17901d = r0     // Catch:{ all -> 0x00eb }
            com.facebook.litho.q r0 = r7.f17922y     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.mo13461q()     // Catch:{ all -> 0x00eb }
            r7.f17882O = r0     // Catch:{ all -> 0x00eb }
        L_0x005b:
            com.facebook.litho.LithoView r0 = r7.f17914q     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0062
            r0.mo12729B(r2)     // Catch:{ all -> 0x00eb }
        L_0x0062:
            r7.f17922y = r2     // Catch:{ all -> 0x00eb }
            r7.m15676z()     // Catch:{ all -> 0x00eb }
            r7.f17871B = r2     // Catch:{ all -> 0x00eb }
            r7.f17872C = r2     // Catch:{ all -> 0x00eb }
            r7.f17873D = r2     // Catch:{ all -> 0x00eb }
            r7.f17874E = r2     // Catch:{ all -> 0x00eb }
            r7.f17904g = r2     // Catch:{ all -> 0x00eb }
            monitor-exit(r7)     // Catch:{ all -> 0x00eb }
            com.facebook.litho.cf r0 = r7.f17898ae
            monitor-enter(r0)
            com.facebook.litho.cf r2 = r7.f17898ae     // Catch:{ all -> 0x00df }
            r2.mo13141a()     // Catch:{ all -> 0x00df }
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            com.facebook.litho.c r0 = r7.f17883P
            if (r0 == 0) goto L_0x00de
            com.facebook.litho.c r0 = r7.f17883P
            monitor-enter(r0)
            java.util.Map r2 = r0.f18173a     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x0088
            monitor-exit(r0)     // Catch:{ all -> 0x00db }
            return
        L_0x0088:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00db }
            r2.<init>()     // Catch:{ all -> 0x00db }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00db }
            r3.<init>()     // Catch:{ all -> 0x00db }
            java.util.Map r4 = r0.f18173a     // Catch:{ all -> 0x00db }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00db }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00db }
        L_0x009c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00db }
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00db }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00db }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x00db }
            com.facebook.litho.q r6 = (com.facebook.litho.C6407q) r6     // Catch:{ all -> 0x00db }
            r2.add(r6)     // Catch:{ all -> 0x00db }
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00db }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00db }
            r3.add(r5)     // Catch:{ all -> 0x00db }
            goto L_0x009c
        L_0x00bb:
            java.util.Map r4 = r0.f18173a     // Catch:{ all -> 0x00db }
            r4.clear()     // Catch:{ all -> 0x00db }
            monitor-exit(r0)     // Catch:{ all -> 0x00db }
            int r0 = r2.size()
        L_0x00c5:
            if (r1 >= r0) goto L_0x00de
            java.lang.Object r4 = r2.get(r1)
            com.facebook.litho.q r4 = (com.facebook.litho.C6407q) r4
            java.lang.Object r5 = r3.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.litho.u r5 = r4.f18995r
            r4.mo12832ax()
            int r1 = r1 + 1
            goto L_0x00c5
        L_0x00db:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00db }
            throw r1
        L_0x00de:
            return
        L_0x00df:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            throw r1
        L_0x00e2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e2 }
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00e8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00eb }
            throw r0
        L_0x00ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Releasing a ComponentTree that is currently being mounted"
            r0.<init>(r1)
            goto L_0x00f7
        L_0x00f6:
            throw r0
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.mo12720o():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (true == r13) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        mo12726v(r2, -1, -1, r13, (com.facebook.litho.C6276fs) null, r7, r14, r9, r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12722q(boolean r13, java.lang.String r14, boolean r15) {
        /*
            r12 = this;
            boolean r0 = com.facebook.litho.p325d.C6180a.f18234a
            monitor-enter(r12)
            com.facebook.litho.q r0 = r12.f17922y     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0039
            com.facebook.litho.q r2 = r0.mo13318j()     // Catch:{ all -> 0x003b }
            com.facebook.litho.hf r0 = r12.f17896ac     // Catch:{ all -> 0x003b }
            com.facebook.litho.hf r9 = com.facebook.litho.C6381hf.m17120b(r0)     // Catch:{ all -> 0x003b }
            r0 = 1
            if (r15 == 0) goto L_0x0025
            int r1 = r12.f17886S     // Catch:{ all -> 0x003b }
            int r1 = r1 + r0
            r12.f17886S = r1     // Catch:{ all -> 0x003b }
            r3 = 50
            if (r1 != r3) goto L_0x0025
            java.lang.String r1 = "ComponentTree:StateUpdatesWhenLayoutInProgressExceedsThreshold"
            java.lang.String r3 = "State Updates when create layout in progress exceeds threshold"
            r4 = 3
            com.facebook.litho.C6106aq.m15891b(r4, r1, r3)     // Catch:{ all -> 0x003b }
        L_0x0025:
            monitor-exit(r12)     // Catch:{ all -> 0x003b }
            if (r0 == r13) goto L_0x002b
            r0 = 4
            r7 = 4
            goto L_0x002d
        L_0x002b:
            r0 = 5
            r7 = 5
        L_0x002d:
            r3 = -1
            r4 = -1
            r6 = 0
            r11 = 0
            r1 = r12
            r5 = r13
            r8 = r14
            r10 = r15
            r1.mo12726v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0039:
            monitor-exit(r12)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x003b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.mo12722q(boolean, java.lang.String, boolean):void");
    }

    /* renamed from: s */
    public final synchronized boolean mo12723s() {
        return this.f17901d;
    }

    /* renamed from: t */
    public final boolean mo12724t() {
        if (!this.f17914q.mo12733G() && !this.f17914q.mo12734H()) {
            return false;
        }
        if (this.f17910m) {
            mo12717l();
        } else {
            Rect rect = new Rect();
            this.f17914q.getLocalVisibleRect(rect);
            mo12719n(rect, true);
        }
        return true;
    }

    /* renamed from: u */
    public final C21215m mo12725u() {
        C21215m mVar = this.f17881L;
        return mVar == null ? this.f17907j.mo13475m() : mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008d, code lost:
        if (r19 == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x008f, code lost:
        if (r2 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0099, code lost:
        throw new java.lang.IllegalArgumentException("The layout can't be calculated asynchronously if we need the Size back");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009a, code lost:
        if (r19 == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x009c, code lost:
        r9 = r7.f17916s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009e, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r0 = r7.f17917t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a1, code lost:
        if (r0 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a3, code lost:
        r7.f17915r.mo13164b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00a8, code lost:
        r7.f17917t = new com.facebook.litho.C6096ag(r15, r21, r5, r22, r24);
        r0 = com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c0, code lost:
        if (r7.f17915r.mo13165c() == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c2, code lost:
        r0 = "calculateLayout ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c4, code lost:
        if (r10 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c6, code lost:
        r0 = "calculateLayout " + r10.mo13461q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d6, code lost:
        r7.f17915r.mo13163a(r7.f17917t, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dd, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00e2, code lost:
        mo12715j(r20, r21, r22, r5, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ee, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12726v(com.facebook.litho.C6407q r16, int r17, int r18, boolean r19, com.facebook.litho.C6276fs r20, int r21, java.lang.String r22, com.facebook.litho.C6381hf r23, boolean r24, boolean r25) {
        /*
            r15 = this;
            r7 = r15
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            r4 = r23
            java.lang.String r8 = "calculateLayout "
            monitor-enter(r15)
            boolean r5 = r7.f17901d     // Catch:{ all -> 0x00f7 }
            if (r5 == 0) goto L_0x0014
            monitor-exit(r15)     // Catch:{ all -> 0x00f7 }
            return
        L_0x0014:
            r5 = -1
            r6 = 1
            if (r3 == 0) goto L_0x001a
            if (r3 != r6) goto L_0x0020
        L_0x001a:
            int r9 = r7.f17893Z     // Catch:{ all -> 0x00f7 }
            if (r9 >= 0) goto L_0x00ef
            r7.f17893Z = r5     // Catch:{ all -> 0x00f7 }
        L_0x0020:
            if (r16 == 0) goto L_0x002f
            com.facebook.litho.fw r9 = r7.f17873D     // Catch:{ all -> 0x00f7 }
            boolean r9 = r9.mo13288m()     // Catch:{ all -> 0x00f7 }
            if (r9 == 0) goto L_0x002f
            com.facebook.litho.q r9 = r16.mo13458k()     // Catch:{ all -> 0x00f7 }
            goto L_0x0031
        L_0x002f:
            r9 = r16
        L_0x0031:
            r10 = 0
            if (r0 == r5) goto L_0x0036
            r11 = 1
            goto L_0x0037
        L_0x0036:
            r11 = 0
        L_0x0037:
            if (r1 == r5) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r9 == 0) goto L_0x0040
            r5 = r9
            r10 = r5
            goto L_0x0043
        L_0x0040:
            com.facebook.litho.q r5 = r7.f17922y     // Catch:{ all -> 0x00f7 }
            r10 = 0
        L_0x0043:
            if (r11 == 0) goto L_0x0047
            r12 = r0
            goto L_0x0049
        L_0x0047:
            int r12 = r7.f17923z     // Catch:{ all -> 0x00f7 }
        L_0x0049:
            if (r6 == 0) goto L_0x004d
            r13 = r1
            goto L_0x004f
        L_0x004d:
            int r13 = r7.f17870A     // Catch:{ all -> 0x00f7 }
        L_0x004f:
            com.facebook.litho.dg r14 = r7.f17872C     // Catch:{ all -> 0x00f7 }
            if (r25 != 0) goto L_0x006b
            if (r5 == 0) goto L_0x006b
            if (r14 == 0) goto L_0x006b
            int r5 = r5.f18989l     // Catch:{ all -> 0x00f7 }
            boolean r5 = r14.mo13160o(r5, r12, r13)     // Catch:{ all -> 0x00f7 }
            if (r5 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x0069
            int r0 = r14.f18314s     // Catch:{ all -> 0x00f7 }
            r2.f18536b = r0     // Catch:{ all -> 0x00f7 }
            int r0 = r14.f18313r     // Catch:{ all -> 0x00f7 }
            r2.f18535a = r0     // Catch:{ all -> 0x00f7 }
        L_0x0069:
            monitor-exit(r15)     // Catch:{ all -> 0x00f7 }
            return
        L_0x006b:
            if (r11 == 0) goto L_0x006f
            r7.f17923z = r0     // Catch:{ all -> 0x00f7 }
        L_0x006f:
            if (r6 == 0) goto L_0x0073
            r7.f17870A = r1     // Catch:{ all -> 0x00f7 }
        L_0x0073:
            if (r9 == 0) goto L_0x0077
            r7.f17922y = r10     // Catch:{ all -> 0x00f7 }
        L_0x0077:
            if (r25 == 0) goto L_0x0081
            com.facebook.litho.q r0 = r7.f17922y     // Catch:{ all -> 0x00f7 }
            com.facebook.litho.q r0 = r0.mo13458k()     // Catch:{ all -> 0x00f7 }
            r7.f17922y = r0     // Catch:{ all -> 0x00f7 }
        L_0x0081:
            if (r4 == 0) goto L_0x0087
            r7.f17896ac = r4     // Catch:{ all -> 0x00f7 }
            r5 = r4
            goto L_0x008a
        L_0x0087:
            com.facebook.litho.hf r0 = r7.f17896ac     // Catch:{ all -> 0x00f7 }
            r5 = r0
        L_0x008a:
            r7.f17897ad = r3     // Catch:{ all -> 0x00f7 }
            monitor-exit(r15)     // Catch:{ all -> 0x00f7 }
            if (r19 == 0) goto L_0x009a
            if (r2 != 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The layout can't be calculated asynchronously if we need the Size back"
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r19 == 0) goto L_0x00e2
            java.lang.Object r9 = r7.f17916s
            monitor-enter(r9)
            com.facebook.litho.ag r0 = r7.f17917t     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00a8
            com.facebook.litho.dm r1 = r7.f17915r     // Catch:{ all -> 0x00df }
            r1.mo13164b(r0)     // Catch:{ all -> 0x00df }
        L_0x00a8:
            com.facebook.litho.ag r0 = new com.facebook.litho.ag     // Catch:{ all -> 0x00df }
            r1 = r0
            r2 = r15
            r3 = r21
            r4 = r5
            r5 = r22
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00df }
            r7.f17917t = r0     // Catch:{ all -> 0x00df }
            java.lang.String r0 = ""
            com.facebook.litho.dm r1 = r7.f17915r     // Catch:{ all -> 0x00df }
            boolean r1 = r1.mo13165c()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = "calculateLayout "
            if (r10 == 0) goto L_0x00d6
            java.lang.String r0 = r10.mo13461q()     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r1.<init>(r8)     // Catch:{ all -> 0x00df }
            r1.append(r0)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00df }
        L_0x00d6:
            com.facebook.litho.dm r1 = r7.f17915r     // Catch:{ all -> 0x00df }
            com.facebook.litho.ag r2 = r7.f17917t     // Catch:{ all -> 0x00df }
            r1.mo13163a(r2, r0)     // Catch:{ all -> 0x00df }
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            return
        L_0x00df:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00df }
            throw r0
        L_0x00e2:
            r1 = r15
            r2 = r20
            r3 = r21
            r4 = r22
            r6 = r24
            r1.mo12715j(r2, r3, r4, r5, r6)
            return
        L_0x00ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "Setting an unversioned root after calling setVersionedRootAndSizeSpec is not supported. If this ComponentTree takes its version from a parent tree make sure to always call setVersionedRootAndSizeSpec"
            r0.<init>(r1)     // Catch:{ all -> 0x00f7 }
            throw r0     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.mo12726v(com.facebook.litho.q, int, int, boolean, com.facebook.litho.fs, int, java.lang.String, com.facebook.litho.hf, boolean, boolean):void");
    }

    /* renamed from: w */
    public final synchronized void mo12727w(int i, int i2, int i3) {
        C6187dg dgVar = this.f17872C;
        if (dgVar != null) {
            C6392hq hqVar = this.f17899af;
            C6391hp hpVar = dgVar.f18271D;
            if (hpVar != null) {
                Map map = hpVar.f18914a;
                if (map != null) {
                    for (String str : map.keySet()) {
                        C6389hn hnVar = (C6389hn) hpVar.f18914a.get(str);
                        int size = hnVar.f18908c.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C6407q qVar = (C6407q) hnVar.f18908c.get(i4);
                            String str2 = (String) hnVar.f18909d.get(i4);
                            if (!hqVar.mo13401a(hnVar.f18906a, qVar) && hnVar.f18907b.mo13237a(i, i2, i3)) {
                                C6411u uVar = qVar.f18995r;
                                qVar.mo12829at(hnVar.f18906a);
                                hqVar.mo13402b(hnVar.f18906a, qVar, 1);
                            } else if (hqVar.mo13401a(hnVar.f18906a, qVar) && hnVar.f18907b.mo13238b(i, i2, i3)) {
                                C6411u uVar2 = qVar.f18995r;
                                qVar.mo12825ap(hnVar.f18906a);
                                hqVar.mo13402b(hnVar.f18906a, qVar, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final int mo12728x(int i, boolean z, C6358gk gkVar) {
        C6363gp gpVar;
        if (gkVar == null) {
            return -1;
        }
        if (!this.f17918u && (gpVar = gkVar.f18809b) != null) {
            return (int) C6365gr.m17058f(gpVar, this.f17871B);
        }
        if (!this.f17918u || z) {
            return -1;
        }
        return i;
    }

    /* renamed from: p */
    public final void mo12721p(C6407q qVar, int i, int i2, C6276fs fsVar) {
        if (qVar != null) {
            mo12726v(qVar, i, i2, false, fsVar, 0, (String) null, (C6381hf) null, false, false);
            return;
        }
        throw new IllegalArgumentException("Root component can't be null");
    }

    /* renamed from: z */
    private final synchronized void m15676z() {
        C6187dg dgVar = this.f17872C;
        if (dgVar != null) {
            C6392hq hqVar = this.f17899af;
            C6391hp hpVar = dgVar.f18271D;
            if (hpVar != null) {
                Map map = hpVar.f18914a;
                if (map != null) {
                    for (String str : map.keySet()) {
                        C6389hn hnVar = (C6389hn) hpVar.f18914a.get(str);
                        int size = hnVar.f18908c.size();
                        for (int i = 0; i < size; i++) {
                            C6407q qVar = (C6407q) hnVar.f18908c.get(i);
                            String str2 = (String) hnVar.f18909d.get(i);
                            if (hqVar.mo13401a(hnVar.f18906a, qVar)) {
                                C6411u uVar = qVar.f18995r;
                                qVar.mo12825ap(hnVar.f18906a);
                            }
                        }
                    }
                }
            }
        }
        this.f17899af.f18915a.clear();
    }
}
