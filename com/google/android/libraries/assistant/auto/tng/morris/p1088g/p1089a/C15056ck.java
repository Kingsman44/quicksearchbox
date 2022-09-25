package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13337u;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14284dn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.ck */
/* compiled from: PG */
public final class C15056ck implements C15006ao {

    /* renamed from: a */
    public static final C59071e f45140a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.a.ck");

    /* renamed from: A */
    private C60870cx f45141A;

    /* renamed from: B */
    private C60870cx f45142B;

    /* renamed from: C */
    private final C60888db f45143C;

    /* renamed from: D */
    private final C86124t f45144D;

    /* renamed from: E */
    private final C15352z f45145E;

    /* renamed from: F */
    private final C15346t f45146F;

    /* renamed from: G */
    private final C14132bf f45147G;

    /* renamed from: H */
    private final C69464a f45148H;

    /* renamed from: I */
    private final C14152v f45149I;

    /* renamed from: J */
    private final C47449e f45150J;

    /* renamed from: K */
    private final C21370a f45151K;

    /* renamed from: L */
    private final C60931s f45152L = new C15051cf(this);

    /* renamed from: M */
    private final C60845bz f45153M = new C15052cg(this);

    /* renamed from: b */
    public TextView f45154b;

    /* renamed from: c */
    public TextView f45155c;

    /* renamed from: d */
    public ViewGroup f45156d;

    /* renamed from: e */
    public ImageView f45157e;

    /* renamed from: f */
    public ImageView f45158f;

    /* renamed from: g */
    public TextView f45159g;

    /* renamed from: h */
    public ImageView f45160h;

    /* renamed from: i */
    public ImageButton f45161i;

    /* renamed from: j */
    public ImageButton f45162j;

    /* renamed from: k */
    public ImageButton f45163k;

    /* renamed from: l */
    public ImageButton f45164l;

    /* renamed from: m */
    public ImageButton f45165m;

    /* renamed from: n */
    public SeekBar f45166n;

    /* renamed from: o */
    public Drawable f45167o;

    /* renamed from: p */
    public TextView f45168p;

    /* renamed from: q */
    public TextView f45169q;

    /* renamed from: r */
    public TextView f45170r;

    /* renamed from: s */
    public ContextThemeWrapper f45171s;

    /* renamed from: t */
    public C14333fi f45172t;

    /* renamed from: u */
    public long f45173u;

    /* renamed from: v */
    public long f45174v;

    /* renamed from: w */
    public boolean f45175w;

    /* renamed from: x */
    public final C60887da f45176x;

    /* renamed from: y */
    public final C14986h f45177y;

    /* renamed from: z */
    public final C37215b f45178z;

    public C15056ck(C60887da daVar, C60888db dbVar, C14986h hVar, C86124t tVar, C15352z zVar, C15346t tVar2, C14132bf bfVar, C37215b bVar, C69464a aVar, C14152v vVar, C47449e eVar, C21370a aVar2) {
        this.f45176x = daVar;
        this.f45143C = dbVar;
        this.f45177y = hVar;
        this.f45144D = tVar;
        this.f45172t = null;
        this.f45173u = 0;
        this.f45174v = 0;
        this.f45141A = null;
        this.f45145E = zVar;
        this.f45146F = tVar2;
        this.f45171s = null;
        this.f45147G = bfVar;
        this.f45178z = bVar;
        this.f45148H = aVar;
        this.f45142B = null;
        this.f45149I = vVar;
        this.f45150J = eVar;
        this.f45151K = aVar2;
    }

    /* renamed from: f */
    private static String m31616f(long j) {
        if (j < 0) {
            return BuildConfig.FLAVOR;
        }
        Duration ofMillis = Duration.ofMillis(j);
        if (ofMillis.toHoursPart() > 0) {
            return String.format(Locale.getDefault(), "%d:%02d:%02d", new Object[]{Integer.valueOf(ofMillis.toHoursPart()), Integer.valueOf(ofMillis.toMinutesPart()), Integer.valueOf(ofMillis.toSecondsPart())});
        }
        return String.format(Locale.getDefault(), "%d:%02d", new Object[]{Integer.valueOf(ofMillis.toMinutesPart()), Integer.valueOf(ofMillis.toSecondsPart())});
    }

    /* renamed from: g */
    private final void m31617g(ImageView imageView, C14286dp dpVar, String str, String str2) {
        C14284dn a = C14284dn.m30595a(dpVar.f43218b);
        if (a == null) {
            a = C14284dn.UNRECOGNIZED;
        }
        if (a == C14284dn.CUSTOM_ACTION) {
            ContextThemeWrapper contextThemeWrapper = this.f45171s;
            contextThemeWrapper.getClass();
            ContextThemeWrapper contextThemeWrapper2 = this.f45171s;
            contextThemeWrapper2.getClass();
            int dimensionPixelSize = (int) (((float) contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.media_player_fullscreen_controllers_padding_for_custom_action)) / contextThemeWrapper2.getResources().getDisplayMetrics().density);
            imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        this.f45146F.mo22218h(imageView, dpVar, str, str2, C15346t.f46047a, this.f45177y, this.f45147G, this.f45149I);
    }

    /* renamed from: h */
    private final void m31618h(long j, long j2) {
        if (j2 > 0) {
            try {
                String b = C13337u.m29583b(Duration.ofMillis(j).toSeconds());
                String b2 = C13337u.m29583b(Duration.ofMillis(j2).toSeconds());
                SeekBar seekBar = this.f45166n;
                seekBar.getClass();
                ContextThemeWrapper contextThemeWrapper = this.f45171s;
                contextThemeWrapper.getClass();
                seekBar.setContentDescription(contextThemeWrapper.getString(R.string.media_player_fullscreen_seek_bar_description, new Object[]{b, b2}));
            } catch (IllegalArgumentException unused) {
                C59104x d = f45140a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.MediaFullRend");
                ((C59052c) ((C59052c) d).mo56372aa(45960)).mo56354G("Illegal time passed to TimeFormatUtils: %s elapsed, %s total", Duration.ofMillis(j), Duration.ofMillis(j2));
                SeekBar seekBar2 = this.f45166n;
                seekBar2.getClass();
                ContextThemeWrapper contextThemeWrapper2 = this.f45171s;
                contextThemeWrapper2.getClass();
                seekBar2.setContentDescription(contextThemeWrapper2.getString(R.string.media_player_fullscreen_seek_bar_description_default));
            }
        } else {
            SeekBar seekBar3 = this.f45166n;
            seekBar3.getClass();
            seekBar3.setContentDescription((CharSequence) null);
        }
    }

    /* renamed from: a */
    public final View mo21891a() {
        ViewGroup viewGroup = this.f45156d;
        viewGroup.getClass();
        return viewGroup;
    }

    /* renamed from: b */
    public final void mo21923b() {
        C60870cx cxVar = this.f45141A;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f45141A = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03d7, code lost:
        if (r11.equals(r14) == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0418, code lost:
        if (r5.equals(r11) == false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0483, code lost:
        if (r4 != r5) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04d8, code lost:
        if (r4.equals(r5) == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0296, code lost:
        if (r7.equals(r11) == false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x02c2, code lost:
        if ((r13.f43352a == 5 ? (java.lang.String) r13.f43353b : r12).equals(r11) == false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0303, code lost:
        if (r4.f43355d.equals(r2.f43355d) != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x035e, code lost:
        if (r11.equals(r13) == false) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0382, code lost:
        if (r11.equals(r13) == false) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03a6, code lost:
        if (r11.equals(r13) == false) goto L_0x03a8;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21924c(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14329fe r17, android.view.ViewGroup r18, android.view.ContextThemeWrapper r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r0.f45171s = r3
            android.view.ViewGroup r4 = r0.f45156d
            r5 = 8
            r6 = 2
            r7 = 5
            r8 = 3
            r9 = 0
            r10 = 1
            if (r4 != 0) goto L_0x0244
            r4 = 2131433154(0x7f0b16c2, float:1.8488086E38)
            android.view.View r11 = r2.findViewById(r4)
            if (r11 == 0) goto L_0x0025
            android.view.View r11 = r2.findViewById(r4)
            r2.removeView(r11)
        L_0x0025:
            android.view.ContextThemeWrapper r11 = r0.f45171s
            r11.getClass()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r12 = 2131625914(0x7f0e07ba, float:1.887905E38)
            r11.inflate(r12, r2, r10)
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f45156d = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45147G
            r12 = 104831(0x1997f, float:1.469E-40)
            r11.mo21444a(r4, r12)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ch r4 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ch
            r4.<init>(r0)
            android.view.ViewGroup r11 = r0.f45156d
            r11.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.n r12 = new com.google.android.libraries.assistant.auto.tng.morris.c.n
            android.view.ContextThemeWrapper r13 = r0.f45171s
            r13.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r14 = r0.f45147G
            r12.<init>(r13, r14, r4)
            r11.setOnTouchListener(r12)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131431129(0x7f0b0ed9, float:1.8483978E38)
            android.view.View r4 = r4.findViewById(r11)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r12 = r11.topMargin
            g.a.a r13 = r0.f45148H
            java.lang.Object r13 = r13.mo17428b()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r12 = r12 + r13
            r11.topMargin = r12
            r4.setLayoutParams(r11)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131436600(0x7f0b2438, float:1.8495075E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45154b = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131427918(0x7f0b024e, float:1.8477466E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45155c = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131427674(0x7f0b015a, float:1.847697E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f45157e = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131427864(0x7f0b0218, float:1.8477356E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f45158f = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131427875(0x7f0b0223, float:1.8477379E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45159g = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131429236(0x7f0b0774, float:1.848014E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f45160h = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131434572(0x7f0b1c4c, float:1.8490962E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0.f45161i = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45147G
            r12 = 105767(0x19d27, float:1.48211E-40)
            r13 = 2367(0x93f, float:3.317E-42)
            r11.mo21446c(r4, r12, r13)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131436671(0x7f0b247f, float:1.849522E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0.f45162j = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45147G
            r12 = 109859(0x1ad23, float:1.53945E-40)
            r13 = 2364(0x93c, float:3.313E-42)
            r11.mo21446c(r4, r12, r13)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131436676(0x7f0b2484, float:1.849523E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0.f45163k = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45147G
            r12 = 105766(0x19d26, float:1.4821E-40)
            r13 = 2363(0x93b, float:3.311E-42)
            r11.mo21446c(r4, r12, r13)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131429329(0x7f0b07d1, float:1.8480328E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0.f45164l = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45147G
            r12 = 112629(0x1b7f5, float:1.57827E-40)
            r11.mo21444a(r4, r12)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131429333(0x7f0b07d5, float:1.8480336E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0.f45165m = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45147G
            r12 = 112630(0x1b7f6, float:1.57828E-40)
            r11.mo21444a(r4, r12)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131435689(0x7f0b20a9, float:1.8493227E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            r0.f45166n = r4
            r4.getClass()
            android.graphics.drawable.Drawable r4 = r4.getThumb()
            r0.f45167o = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131430399(0x7f0b0bff, float:1.8482498E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45168p = r4
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131436691(0x7f0b2493, float:1.849526E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45169q = r4
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f45144D
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248824af
            boolean r4 = r4.mo79746e(r11)
            if (r4 == 0) goto L_0x01b3
            android.widget.ImageView r4 = r0.f45160h
            r4.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ci r11 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ci
            r11.<init>(r0)
            r4.addOnLayoutChangeListener(r11)
        L_0x01b3:
            android.widget.SeekBar r4 = r0.f45166n
            r4.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.g.a.cj r11 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.cj
            r11.<init>(r0)
            r4.setOnSeekBarChangeListener(r11)
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            r11 = 2131433102(0x7f0b168e, float:1.848798E38)
            android.view.View r4 = r4.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45170r = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r12 = r0.f45147G
            r13 = 109860(0x1ad24, float:1.53947E-40)
            r12.mo21444a(r4, r13)
            if (r20 == 0) goto L_0x0244
            android.view.ViewGroup r4 = r0.f45156d
            r4.getClass()
            android.view.ContextThemeWrapper r12 = r0.f45171s
            r12.getClass()
            android.view.animation.Animation r2 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31954f(r12, r2)
            r4.startAnimation(r2)
            int[] r2 = new int[r7]
            r2 = {2131427674, 2131427875, 2131427864, 2131436600, 2131427918} // fill-array
            int[] r4 = new int[r5]
            r4 = {2131436671, 2131434572, 2131436676, 2131435689, 2131430399, 2131436691, 2131429329, 2131429333} // fill-array
            r12 = 0
        L_0x01f6:
            if (r12 >= r7) goto L_0x0212
            r13 = r2[r12]
            android.view.ViewGroup r14 = r0.f45156d
            r14.getClass()
            android.view.View r13 = r14.findViewById(r13)
            android.view.ContextThemeWrapper r14 = r0.f45171s
            r14.getClass()
            android.view.animation.Animation r14 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31955g(r14, r10)
            r13.startAnimation(r14)
            int r12 = r12 + 1
            goto L_0x01f6
        L_0x0212:
            r2 = 0
        L_0x0213:
            if (r2 >= r5) goto L_0x022f
            r12 = r4[r2]
            android.view.ViewGroup r13 = r0.f45156d
            r13.getClass()
            android.view.View r12 = r13.findViewById(r12)
            android.view.ContextThemeWrapper r13 = r0.f45171s
            r13.getClass()
            android.view.animation.Animation r13 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31955g(r13, r6)
            r12.startAnimation(r13)
            int r2 = r2 + 1
            goto L_0x0213
        L_0x022f:
            android.view.ViewGroup r2 = r0.f45156d
            r2.getClass()
            android.view.View r2 = r2.findViewById(r11)
            android.view.ContextThemeWrapper r4 = r0.f45171s
            r4.getClass()
            android.view.animation.Animation r4 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31955g(r4, r8)
            r2.startAnimation(r4)
        L_0x0244:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r2 = r1.f43348b
            if (r2 != 0) goto L_0x024a
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi.f43350q
        L_0x024a:
            android.widget.TextView r4 = r0.f45154b
            r4.getClass()
            java.lang.String r11 = r2.f43358g
            r4.setText(r11)
            android.widget.TextView r4 = r0.f45155c
            r4.getClass()
            java.lang.String r11 = r2.f43357f
            r4.setText(r11)
            android.widget.ImageView r4 = r0.f45157e
            r4.getClass()
            int r11 = r2.f43352a
            int r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14331fg.m30609a(r11)
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x05ad
            java.lang.String r12 = ""
            if (r13 == 0) goto L_0x02a8
            if (r13 == r10) goto L_0x0279
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r7 = r0.f45146F
            r7.mo22219i(r4)
            goto L_0x02d3
        L_0x0279:
            r7 = 6
            if (r11 != r7) goto L_0x0281
            java.lang.Object r11 = r2.f43353b
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj) r11
            goto L_0x0283
        L_0x0281:
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0283:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r13 = r0.f45172t
            if (r13 == 0) goto L_0x0298
            int r15 = r13.f43352a
            if (r15 != r7) goto L_0x0290
            java.lang.Object r7 = r13.f43353b
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj) r7
            goto L_0x0292
        L_0x0290:
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0292:
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x02d3
        L_0x0298:
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r7 = r0.f45145E
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r13 = r0.f45146F
            p3186j$.util.Objects.requireNonNull(r13)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.cc r15 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.cc
            r15.<init>(r13)
            r7.mo22229l(r4, r11, r15)
            goto L_0x02d3
        L_0x02a8:
            if (r11 != r7) goto L_0x02af
            java.lang.Object r11 = r2.f43353b
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x02b0
        L_0x02af:
            r11 = r12
        L_0x02b0:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r13 = r0.f45172t
            if (r13 == 0) goto L_0x02c4
            int r15 = r13.f43352a
            if (r15 != r7) goto L_0x02bd
            java.lang.Object r7 = r13.f43353b
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x02be
        L_0x02bd:
            r7 = r12
        L_0x02be:
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x02d3
        L_0x02c4:
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r7 = r0.f45145E
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r13 = r0.f45146F
            p3186j$.util.Objects.requireNonNull(r13)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.cc r15 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.cc
            r15.<init>(r13)
            r7.mo22231n(r4, r11, r15)
        L_0x02d3:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f45144D
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248824af
            boolean r4 = r4.mo79746e(r7)
            if (r4 == 0) goto L_0x02e5
            android.widget.ImageView r4 = r0.f45160h
            r4.getClass()
            r0.mo21925d(r4, r2)
        L_0x02e5:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r4 = r0.f45172t
            r7 = 158549(0x26b55, float:2.22174E-40)
            if (r4 == 0) goto L_0x031a
            java.lang.String r4 = r4.f43354c
            java.lang.String r11 = r2.f43354c
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x0306
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r4 = r0.f45172t
            r4.getClass()
            java.lang.String r4 = r4.f43355d
            java.lang.String r11 = r2.f43355d
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x0306
            goto L_0x0346
        L_0x0306:
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r4 = r0.f45147G
            android.widget.ImageView r11 = r0.f45158f
            r11.getClass()
            r4.mo21444a(r11, r7)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r4 = r0.f45147G
            android.widget.ImageView r11 = r0.f45158f
            r11.getClass()
            r4.mo21447d(r11)
        L_0x031a:
            java.lang.String r4 = r2.f43354c
            java.lang.String r11 = r2.f43355d
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r13 = r0.f45146F
            android.widget.ImageView r15 = r0.f45158f
            r15.getClass()
            r13.mo22221k(r15, r4, r11)
            android.widget.TextView r13 = r0.f45159g
            r13.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r15 = r0.f45146F
            java.lang.String r15 = r15.mo22216f(r4, r11)
            r13.setText(r15)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r13 = r0.f45147G
            android.widget.ImageView r15 = r0.f45158f
            r15.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r14 = r0.f45146F
            com.google.android.libraries.logging.ve.e r4 = r14.mo22223m(r4, r11, r8)
            r13.mo21445b(r15, r7, r4)
        L_0x0346:
            java.lang.String r4 = r2.f43354c
            java.lang.String r7 = r2.f43355d
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r11 = r0.f45172t
            if (r11 == 0) goto L_0x0360
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r11.f43359h
            if (r11 != 0) goto L_0x0354
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x0354:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = r2.f43359h
            if (r13 != 0) goto L_0x035a
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x035a:
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x036e
        L_0x0360:
            android.widget.ImageButton r11 = r0.f45161i
            r11.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = r2.f43359h
            if (r13 != 0) goto L_0x036b
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x036b:
            r0.m31617g(r11, r13, r4, r7)
        L_0x036e:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r11 = r0.f45172t
            if (r11 == 0) goto L_0x0384
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r11.f43360i
            if (r11 != 0) goto L_0x0378
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x0378:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = r2.f43360i
            if (r13 != 0) goto L_0x037e
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x037e:
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x0392
        L_0x0384:
            android.widget.ImageButton r11 = r0.f45162j
            r11.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = r2.f43360i
            if (r13 != 0) goto L_0x038f
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x038f:
            r0.m31617g(r11, r13, r4, r7)
        L_0x0392:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r11 = r0.f45172t
            if (r11 == 0) goto L_0x03a8
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r11.f43361j
            if (r11 != 0) goto L_0x039c
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x039c:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = r2.f43361j
            if (r13 != 0) goto L_0x03a2
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x03a2:
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x03b6
        L_0x03a8:
            android.widget.ImageButton r11 = r0.f45163k
            r11.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = r2.f43361j
            if (r13 != 0) goto L_0x03b3
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r13 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x03b3:
            r0.m31617g(r11, r13, r4, r7)
        L_0x03b6:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r2.f43362k
            r13 = 4
            if (r11 == 0) goto L_0x03f0
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
            boolean r11 = r11.equals(r14)
            if (r11 != 0) goto L_0x03f0
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r11 = r0.f45172t
            if (r11 == 0) goto L_0x03d9
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r11.f43362k
            if (r11 != 0) goto L_0x03cd
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x03cd:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r14 = r2.f43362k
            if (r14 != 0) goto L_0x03d3
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x03d3:
            boolean r11 = r11.equals(r14)
            if (r11 != 0) goto L_0x03f8
        L_0x03d9:
            android.widget.ImageButton r11 = r0.f45164l
            r11.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r14 = r2.f43362k
            if (r14 != 0) goto L_0x03e4
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x03e4:
            r0.m31617g(r11, r14, r4, r7)
            android.widget.ImageButton r11 = r0.f45164l
            r11.getClass()
            r11.setVisibility(r9)
            goto L_0x03f8
        L_0x03f0:
            android.widget.ImageButton r11 = r0.f45164l
            r11.getClass()
            r11.setVisibility(r13)
        L_0x03f8:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r2.f43363l
            if (r11 == 0) goto L_0x0431
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
            boolean r11 = r11.equals(r14)
            if (r11 != 0) goto L_0x0431
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r5 = r0.f45172t
            if (r5 == 0) goto L_0x041a
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r5 = r5.f43363l
            if (r5 != 0) goto L_0x040e
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x040e:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r2.f43363l
            if (r11 != 0) goto L_0x0414
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x0414:
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x0439
        L_0x041a:
            android.widget.ImageButton r5 = r0.f45165m
            r5.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = r2.f43363l
            if (r11 != 0) goto L_0x0425
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x0425:
            r0.m31617g(r5, r11, r4, r7)
            android.widget.ImageButton r4 = r0.f45165m
            r4.getClass()
            r4.setVisibility(r9)
            goto L_0x0439
        L_0x0431:
            android.widget.ImageButton r4 = r0.f45165m
            r4.getClass()
            r4.setVisibility(r5)
        L_0x0439:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r4 = r0.f45172t
            if (r4 == 0) goto L_0x0447
            long r4 = r4.f43365n
            long r14 = r2.f43365n
            int r7 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0465
        L_0x0447:
            long r4 = r2.f43365n
            android.widget.SeekBar r7 = r0.f45166n
            r7.getClass()
            int r11 = (int) r4
            r7.setMax(r11)
            android.widget.TextView r7 = r0.f45169q
            r7.getClass()
            r14 = 0
            int r11 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x045e
            goto L_0x0462
        L_0x045e:
            java.lang.String r12 = m31616f(r4)
        L_0x0462:
            r7.setText(r12)
        L_0x0465:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r4 = r0.f45172t
            if (r4 == 0) goto L_0x0485
            long r11 = r4.f43366o
            long r14 = r2.f43366o
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0485
            int r4 = r4.f43367p
            int r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30606b(r4)
            if (r4 != 0) goto L_0x047a
            r4 = 1
        L_0x047a:
            int r5 = r2.f43367p
            int r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30606b(r5)
            if (r5 != 0) goto L_0x0483
            r5 = 1
        L_0x0483:
            if (r4 == r5) goto L_0x04c4
        L_0x0485:
            int r4 = r2.f43367p
            int r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14319ev.m30606b(r4)
            if (r4 != 0) goto L_0x048e
            r4 = 1
        L_0x048e:
            int r4 = r4 + -2
            if (r4 == r8) goto L_0x04b2
            r16.mo21923b()
            long r4 = r2.f43366o
            long r11 = r2.f43365n
            android.widget.TextView r7 = r0.f45168p
            r7.getClass()
            java.lang.String r14 = m31616f(r4)
            r7.setText(r14)
            android.widget.SeekBar r7 = r0.f45166n
            r7.getClass()
            int r14 = (int) r4
            r7.setProgress(r14)
            r0.m31618h(r4, r11)
            goto L_0x04c4
        L_0x04b2:
            r16.mo21923b()
            com.google.android.libraries.f.a r4 = r0.f45151K
            long r4 = r4.mo26871c()
            r0.f45173u = r4
            long r4 = r2.f43366o
            r0.f45174v = r4
            r16.mo21926e()
        L_0x04c4:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r4 = r0.f45172t
            if (r4 == 0) goto L_0x04da
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r4 = r4.f43364m
            if (r4 != 0) goto L_0x04ce
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x04ce:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r5 = r2.f43364m
            if (r5 != 0) goto L_0x04d4
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x04d4:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x050b
        L_0x04da:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r4 = r2.f43364m
            if (r4 != 0) goto L_0x04e0
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x04e0:
            android.widget.SeekBar r5 = r0.f45166n
            r5.getClass()
            int r7 = r4.f43217a
            int r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14283dm.m30594a(r7)
            if (r7 != 0) goto L_0x04ef
        L_0x04ed:
            r7 = 0
            goto L_0x04f2
        L_0x04ef:
            if (r7 != r8) goto L_0x04ed
            r7 = 1
        L_0x04f2:
            r5.setEnabled(r7)
            android.widget.SeekBar r5 = r0.f45166n
            r5.getClass()
            int r4 = r4.f43217a
            int r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14283dm.m30594a(r4)
            if (r4 != 0) goto L_0x0504
        L_0x0502:
            r14 = 0
            goto L_0x0508
        L_0x0504:
            if (r4 != r8) goto L_0x0502
            android.graphics.drawable.Drawable r14 = r0.f45167o
        L_0x0508:
            r5.setThumb(r14)
        L_0x050b:
            int r4 = r1.f43347a
            if (r4 == 0) goto L_0x0517
            if (r4 == r10) goto L_0x0518
            if (r4 == r6) goto L_0x0515
            r8 = 0
            goto L_0x0518
        L_0x0515:
            r8 = 4
            goto L_0x0518
        L_0x0517:
            r8 = 2
        L_0x0518:
            if (r8 != 0) goto L_0x051b
            r8 = 1
        L_0x051b:
            int r8 = r8 + -2
            r4 = 2132089313(0x7f1519e1, float:1.9818934E38)
            if (r8 == r10) goto L_0x056d
            if (r8 == r6) goto L_0x052d
            android.widget.TextView r2 = r0.f45170r
            r2.getClass()
            r2.setVisibility(r13)
            goto L_0x05a4
        L_0x052d:
            com.google.android.libraries.assistant.auto.tng.morris.g.a.by r5 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.by
            r5.<init>(r2)
            android.widget.TextView r6 = r0.f45170r
            r6.getClass()
            r6.setVisibility(r9)
            android.widget.TextView r6 = r0.f45170r
            r6.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r7 = r0.f45147G
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.bz r8 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.bz
            r8.<init>(r0, r2)
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r11 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r11.<init>(r7, r5, r8)
            r6.setOnClickListener(r11)
            android.widget.TextView r5 = r0.f45170r
            r5.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r10]
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r7 = r0.f45146F
            java.lang.String r8 = r2.f43354c
            java.lang.String r2 = r2.f43355d
            java.lang.String r2 = r7.mo22216f(r8, r2)
            r6[r9] = r2
            java.lang.String r2 = r3.getString(r4, r6)
            r5.setText(r2)
            goto L_0x05a4
        L_0x056d:
            android.widget.TextView r2 = r0.f45170r
            r2.getClass()
            r2.setVisibility(r9)
            android.widget.TextView r2 = r0.f45170r
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r5 = r0.f45147G
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ca r6 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ca
            r6.<init>(r0)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r8 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r8.<init>(r5, r7, r6)
            r2.setOnClickListener(r8)
            android.widget.TextView r2 = r0.f45170r
            r2.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r6 = 2132086926(0x7f15108e, float:1.9814093E38)
            java.lang.String r6 = r3.getString(r6)
            r5[r9] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            r2.setText(r3)
        L_0x05a4:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r1 = r1.f43348b
            if (r1 != 0) goto L_0x05aa
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi.f43350q
        L_0x05aa:
            r0.f45172t = r1
            return
        L_0x05ad:
            r1 = 0
            goto L_0x05b0
        L_0x05af:
            throw r1
        L_0x05b0:
            goto L_0x05af
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a.C15056ck.mo21924c(com.google.android.libraries.assistant.auto.tng.morris.e.fe, android.view.ViewGroup, android.view.ContextThemeWrapper, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21925d(android.widget.ImageView r7, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi r8) {
        /*
            r6 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r7.getWidth()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r8.f43352a
            int r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14331fg.m30609a(r0)
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x00c6
            r1 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r1) goto L_0x001b
            goto L_0x00b6
        L_0x001b:
            r2 = 6
            if (r0 != r2) goto L_0x0023
            java.lang.Object r8 = r8.f43353b
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r8 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj) r8
            goto L_0x0025
        L_0x0023:
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0025:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r0 = r6.f45172t
            if (r0 == 0) goto L_0x0040
            int r4 = r0.f43352a
            if (r4 != r2) goto L_0x0032
            java.lang.Object r0 = r0.f43353b
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj) r0
            goto L_0x0034
        L_0x0032:
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0034:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r6.f45175w
            if (r0 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            return
        L_0x0040:
            com.google.common.util.concurrent.cx r0 = r6.f45142B
            if (r0 == 0) goto L_0x0049
            r0.cancel(r1)
            r6.f45142B = r3
        L_0x0049:
            com.google.android.libraries.assistant.auto.tng.morris.g.a.bx r0 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.bx
            r0.<init>(r6, r8, r7)
            com.google.common.util.concurrent.da r7 = r6.f45176x
            java.util.concurrent.Callable r8 = com.google.apps.tiktok.tracing.C47810es.m84978r(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92904m(r8, r7)
            r6.f45142B = r7
            goto L_0x00b6
        L_0x005b:
            java.lang.String r2 = ""
            r4 = 5
            if (r0 != r4) goto L_0x0065
            java.lang.Object r8 = r8.f43353b
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0066
        L_0x0065:
            r8 = r2
        L_0x0066:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r0 = r6.f45172t
            if (r0 == 0) goto L_0x007f
            int r5 = r0.f43352a
            if (r5 != r4) goto L_0x0073
            java.lang.Object r0 = r0.f43353b
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0073:
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L_0x007f
            boolean r0 = r6.f45175w
            if (r0 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            return
        L_0x007f:
            com.google.common.util.concurrent.cx r0 = r6.f45142B
            if (r0 == 0) goto L_0x0088
            r0.cancel(r1)
            r6.f45142B = r3
        L_0x0088:
            boolean r0 = com.google.common.base.C58837ba.m90859h(r8)
            if (r0 == 0) goto L_0x0096
            r7.getClass()
            r8 = 4
            r7.setVisibility(r8)
            goto L_0x00b6
        L_0x0096:
            com.google.apps.tiktok.media.e r7 = r6.f45150J
            com.bumptech.glide.ad r7 = r7.mo51286a()
            com.bumptech.glide.z r7 = r7.mo11873k(r8)
            com.google.common.util.concurrent.cx r7 = com.bumptech.glide.p282c.p283a.C5528f.m14299a(r7)
            com.google.common.util.concurrent.cx r7 = com.bumptech.glide.p282c.p283a.C5528f.m14300b(r7)
            com.google.common.util.concurrent.s r8 = r6.f45152L
            com.google.common.util.concurrent.da r0 = r6.f45176x
            com.google.common.util.concurrent.s r8 = com.google.apps.tiktok.tracing.C47810es.m84966f(r8)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93045h(r7, r8, r0)
            r6.f45142B = r7
        L_0x00b6:
            com.google.common.util.concurrent.cx r7 = r6.f45142B
            if (r7 == 0) goto L_0x00c5
            com.google.common.util.concurrent.bz r8 = r6.f45153M
            com.google.common.util.concurrent.db r0 = r6.f45143C
            com.google.common.util.concurrent.bz r8 = com.google.apps.tiktok.tracing.C47810es.m84974n(r8)
            com.google.common.util.concurrent.C60856cj.m92911t(r7, r8, r0)
        L_0x00c5:
            return
        L_0x00c6:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a.C15056ck.mo21925d(android.widget.ImageView, com.google.android.libraries.assistant.auto.tng.morris.e.fi):void");
    }

    /* renamed from: e */
    public final void mo21926e() {
        this.f45141A = null;
        long c = this.f45174v + (this.f45151K.mo26871c() - this.f45173u);
        SeekBar seekBar = this.f45166n;
        seekBar.getClass();
        long max = (long) seekBar.getMax();
        if (((long) ((int) c)) > max) {
            c = max;
        }
        TextView textView = this.f45168p;
        textView.getClass();
        textView.setText(m31616f(c));
        SeekBar seekBar2 = this.f45166n;
        seekBar2.getClass();
        int i = (int) c;
        seekBar2.setProgress(i);
        m31618h(c, max);
        SeekBar seekBar3 = this.f45166n;
        seekBar3.getClass();
        if (i < seekBar3.getMax()) {
            this.f45141A = this.f45143C.mo29164d(new C15047cb(this), 1000, TimeUnit.MILLISECONDS);
        }
    }
}
