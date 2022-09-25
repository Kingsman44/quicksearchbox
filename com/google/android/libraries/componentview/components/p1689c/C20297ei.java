package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19903ad;
import com.google.android.libraries.componentview.components.base.p1687a.C19904ae;
import com.google.android.libraries.componentview.components.base.p1687a.C19909aj;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19994q;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1685b.C19893b;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19889a;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19892d;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20114ak;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20119ap;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20150bt;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20153bw;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4535g.C59203do;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.componentview.components.c.ei */
/* compiled from: PG */
public class C20297ei extends C20061bs {

    /* renamed from: w */
    private static final Pattern f57009w = Pattern.compile("(?i)e[+-]*\\d+");

    /* renamed from: x */
    private static final Pattern f57010x = Pattern.compile("[0\\.]*$");

    /* renamed from: A */
    private final C20537f f57011A;

    /* renamed from: B */
    private final C20601ca f57012B;

    /* renamed from: a */
    public C20301em f57013a;

    /* renamed from: b */
    public C19893b f57014b;

    /* renamed from: c */
    public C20205ay f57015c;

    /* renamed from: d */
    public C20205ay f57016d;

    /* renamed from: e */
    public C19893b f57017e;

    /* renamed from: f */
    public C19893b f57018f;

    /* renamed from: g */
    public final Handler f57019g;

    /* renamed from: h */
    public final Handler f57020h;

    /* renamed from: i */
    public boolean f57021i = false;

    /* renamed from: j */
    public boolean f57022j = false;

    /* renamed from: k */
    public boolean f57023k = false;

    /* renamed from: l */
    public boolean f57024l = false;

    /* renamed from: m */
    public int f57025m;

    /* renamed from: u */
    public int f57026u;

    /* renamed from: v */
    public int f57027v;

    public C20297ei(Context context, C56425d dVar, C20601ca caVar, C20537f fVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f57011A = fVar;
        this.f57012B = caVar;
        this.f57019g = new Handler();
        this.f57020h = new Handler();
    }

    /* renamed from: B */
    public static final double m38167B(double d, C20150bt btVar) {
        double d2 = btVar.f56521d;
        if (d2 != C59203do.f157270a) {
            return d == C59203do.f157270a ? C59203do.f157270a : d2 / d;
        }
        double d3 = btVar.f56519b;
        return d3 == C59203do.f157270a ? C59203do.f157270a : (d - btVar.f56520c) / d3;
    }

    /* renamed from: C */
    public static final double m38168C(double d, C20150bt btVar) {
        double d2 = btVar.f56521d;
        double d3 = C59203do.f157270a;
        if (d2 == C59203do.f157270a) {
            return (d * btVar.f56519b) + btVar.f56520c;
        }
        if (d != C59203do.f157270a) {
            d3 = d2 / d;
        }
        return d3;
    }

    /* renamed from: D */
    private static int m38169D(double d) {
        double abs = Math.abs(d);
        if (abs < 1.0d || Double.isInfinite(abs)) {
            return 1;
        }
        return (int) Math.ceil(Math.abs(Math.log10(abs)));
    }

    /* renamed from: E */
    private final LinearLayout.LayoutParams m38170E() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.61f);
        layoutParams.setMargins(0, 0, (int) (C20482m.m38433a(this.f56304o) * 7.0f), 0);
        return layoutParams;
    }

    /* renamed from: F */
    private final LinearLayout.LayoutParams m38171F() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.39f);
        layoutParams.setMargins((int) (C20482m.m38433a(this.f56304o) * 7.0f), 0, 0, 0);
        return layoutParams;
    }

    /* renamed from: L */
    private final LinearLayout m38172L() {
        LinearLayout linearLayout = new LinearLayout(this.f56304o);
        linearLayout.setPadding(0, (int) (C20482m.m38433a(this.f56304o) * 9.0f), 0, (int) (C20482m.m38433a(this.f56304o) * 10.0f));
        return linearLayout;
    }

    /* renamed from: M */
    private final C19904ae m38173M() {
        C19903ad adVar = (C19903ad) C19904ae.f55685f.createBuilder();
        float a = C20482m.m38433a(this.f56304o);
        adVar.copyOnWrite();
        C19904ae aeVar = (C19904ae) adVar.instance;
        aeVar.f55687a |= 2;
        aeVar.f55689c = (float) ((int) (a + a));
        float a2 = C20482m.m38433a(this.f56304o);
        adVar.copyOnWrite();
        C19904ae aeVar2 = (C19904ae) adVar.instance;
        aeVar2.f55687a |= 8;
        aeVar2.f55691e = (float) ((int) (a2 + a2));
        float a3 = C20482m.m38433a(this.f56304o);
        adVar.copyOnWrite();
        C19904ae aeVar3 = (C19904ae) adVar.instance;
        aeVar3.f55687a |= 1;
        aeVar3.f55688b = (float) ((int) (a3 + a3));
        float a4 = C20482m.m38433a(this.f56304o);
        adVar.copyOnWrite();
        C19904ae aeVar4 = (C19904ae) adVar.instance;
        aeVar4.f55687a |= 4;
        aeVar4.f55690d = (float) ((int) (a4 + a4));
        return (C19904ae) adVar.build();
    }

    /* renamed from: N */
    private final C19892d m38174N(int i, List list) {
        C19889a aVar = (C19889a) C19892d.f55637k.createBuilder();
        aVar.copyOnWrite();
        C19892d dVar = (C19892d) aVar.instance;
        dVar.f55640a |= 1;
        dVar.f55642c = i;
        aVar.copyOnWrite();
        C19892d dVar2 = (C19892d) aVar.instance;
        dVar2.f55645f = 3;
        dVar2.f55640a |= 8;
        aVar.copyOnWrite();
        C19892d dVar3 = (C19892d) aVar.instance;
        dVar3.f55640a |= 32;
        dVar3.f55647h = true;
        aVar.copyOnWrite();
        C19892d dVar4 = (C19892d) aVar.instance;
        dVar4.f55643d = 2;
        dVar4.f55640a |= 2;
        aVar.copyOnWrite();
        C19892d dVar5 = (C19892d) aVar.instance;
        dVar5.f55640a |= 16;
        dVar5.f55646g = 13.0f;
        aVar.copyOnWrite();
        C19892d dVar6 = (C19892d) aVar.instance;
        dVar6.f55648i = 0;
        dVar6.f55640a |= 64;
        aVar.mo25165a(list);
        C19909aj ajVar = (C19909aj) C19916aq.f55703s.createBuilder();
        C19904ae M = m38173M();
        ajVar.copyOnWrite();
        C19916aq aqVar = (C19916aq) ajVar.instance;
        M.getClass();
        aqVar.f55712h = M;
        aqVar.f55705a |= 32;
        C19994q qVar = (C19994q) C19995r.f56032g.createBuilder();
        qVar.copyOnWrite();
        C19995r rVar = (C19995r) qVar.instance;
        rVar.f56034a |= 1;
        rVar.f56035b = 0.0f;
        qVar.copyOnWrite();
        C19995r rVar2 = (C19995r) qVar.instance;
        rVar2.f56034a |= 2;
        rVar2.f56036c = 0.0f;
        qVar.copyOnWrite();
        C19995r rVar3 = (C19995r) qVar.instance;
        rVar3.f56034a |= 4;
        rVar3.f56037d = 0.0f;
        qVar.copyOnWrite();
        C19995r rVar4 = (C19995r) qVar.instance;
        rVar4.f56034a |= 8;
        rVar4.f56038e = 0.05f;
        C19995r rVar5 = (C19995r) qVar.build();
        ajVar.copyOnWrite();
        C19916aq aqVar2 = (C19916aq) ajVar.instance;
        rVar5.getClass();
        aqVar2.f55710f = rVar5;
        aqVar2.f55705a |= 1;
        ajVar.copyOnWrite();
        C19916aq aqVar3 = (C19916aq) ajVar.instance;
        aqVar3.f55706b = 2;
        aqVar3.f55707c = Float.valueOf(2.0f);
        aVar.copyOnWrite();
        C19892d dVar7 = (C19892d) aVar.instance;
        C19916aq aqVar4 = (C19916aq) ajVar.build();
        aqVar4.getClass();
        dVar7.f55649j = aqVar4;
        dVar7.f55640a |= 128;
        return (C19892d) aVar.build();
    }

    /* renamed from: O */
    private final C20119ap m38175O(String str) {
        C20114ak akVar = (C20114ak) C20119ap.f56375r.createBuilder();
        akVar.copyOnWrite();
        C20119ap apVar = (C20119ap) akVar.instance;
        str.getClass();
        apVar.f56378a |= 1;
        apVar.f56379b = str;
        akVar.copyOnWrite();
        C20119ap apVar2 = (C20119ap) akVar.instance;
        apVar2.f56391n = 0;
        apVar2.f56378a |= 4096;
        akVar.copyOnWrite();
        C20119ap apVar3 = (C20119ap) akVar.instance;
        apVar3.f56383f = 3;
        apVar3.f56378a |= 16;
        akVar.copyOnWrite();
        C20119ap apVar4 = (C20119ap) akVar.instance;
        apVar4.f56381d = 3;
        apVar4.f56378a |= 4;
        akVar.copyOnWrite();
        C20119ap apVar5 = (C20119ap) akVar.instance;
        apVar5.f56378a |= 32;
        apVar5.f56384g = 13.0f;
        akVar.copyOnWrite();
        C20119ap apVar6 = (C20119ap) akVar.instance;
        apVar6.f56378a |= 128;
        apVar6.f56386i = true;
        akVar.copyOnWrite();
        C20119ap apVar7 = (C20119ap) akVar.instance;
        apVar7.f56378a |= 8192;
        apVar7.f56392o = true;
        akVar.copyOnWrite();
        C20119ap apVar8 = (C20119ap) akVar.instance;
        apVar8.f56387j = 2;
        apVar8.f56378a |= 256;
        C19909aj ajVar = (C19909aj) C19916aq.f55703s.createBuilder();
        C19904ae M = m38173M();
        ajVar.copyOnWrite();
        C19916aq aqVar = (C19916aq) ajVar.instance;
        M.getClass();
        aqVar.f55712h = M;
        aqVar.f55705a |= 32;
        ajVar.copyOnWrite();
        C19916aq aqVar2 = (C19916aq) ajVar.instance;
        aqVar2.f55706b = 2;
        aqVar2.f55707c = Float.valueOf(2.0f);
        C19916aq aqVar3 = (C19916aq) ajVar.build();
        akVar.copyOnWrite();
        C20119ap apVar9 = (C20119ap) akVar.instance;
        aqVar3.getClass();
        apVar9.f56394q = aqVar3;
        apVar9.f56378a |= 32768;
        return (C20119ap) akVar.build();
    }

    /* renamed from: P */
    private static final C56425d m38176P(C19892d dVar) {
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.mo58885m(C19892d.f55638l, dVar);
        cVar.copyOnWrite();
        C56425d dVar2 = (C56425d) cVar.instance;
        dVar2.f150539a |= 1;
        dVar2.f150540b = "android-drop-down";
        return (C56425d) cVar.build();
    }

    /* renamed from: Q */
    private static final C56425d m38177Q(C20119ap apVar) {
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.mo58885m(C20119ap.f56376s, apVar);
        cVar.copyOnWrite();
        C56425d dVar = (C56425d) cVar.instance;
        dVar.f150539a |= 1;
        dVar.f150540b = "android-edit-text";
        return (C56425d) cVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d1, code lost:
        r12 = r11 + 1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m38178i(double r10, double r12) {
        /*
            double r0 = java.lang.Math.abs(r10)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4 = 1
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x003f
            boolean r7 = java.lang.Double.isInfinite(r0)
            if (r7 == 0) goto L_0x0014
            goto L_0x003f
        L_0x0014:
            java.util.regex.Pattern r7 = f57010x
            java.util.regex.Pattern r8 = f57009w
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.util.regex.Matcher r8 = r8.matcher(r9)
            java.lang.String r9 = ""
            java.lang.String r8 = r8.replaceFirst(r9)
            java.util.regex.Matcher r7 = r7.matcher(r8)
            java.lang.String r7 = r7.replaceFirst(r9)
            int r7 = r7.length()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0040
            int r10 = m38169D(r10)
            int r7 = java.lang.Math.max(r7, r10)
            goto L_0x0040
        L_0x003f:
            r7 = 1
        L_0x0040:
            int r7 = r7 + 3
            r10 = 20
            int r10 = java.lang.Math.min(r7, r10)
            r11 = 6
            int r10 = java.lang.Math.max(r10, r11)
            int r11 = m38169D(r12)
            if (r10 >= r11) goto L_0x0055
            int r10 = r10 + -2
        L_0x0055:
            if (r10 > 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r4 = r10
        L_0x0059:
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r12)
            java.math.MathContext r11 = new java.math.MathContext
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            r11.<init>(r4, r12)
            java.math.BigDecimal r10 = r10.round(r11)
            java.math.BigDecimal r10 = r10.stripTrailingZeros()
            double r10 = r10.doubleValue()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            double r0 = r10 % r2
            java.lang.String r13 = "#"
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x008d
            java.lang.String r0 = "0.0"
            r12.append(r0)
            int r0 = r4 + -1
        L_0x0085:
            if (r0 <= 0) goto L_0x0090
            r12.append(r13)
            int r0 = r0 + -1
            goto L_0x0085
        L_0x008d:
            r12.append(r13)
        L_0x0090:
            double r0 = java.lang.Math.abs(r10)
            r7 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r13 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x00ab
        L_0x00a1:
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b0
            int r13 = m38169D(r0)
            if (r13 <= r4) goto L_0x00b0
        L_0x00ab:
            java.lang.String r13 = "E0"
            r12.append(r13)
        L_0x00b0:
            java.text.DecimalFormat r13 = new java.text.DecimalFormat
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            r12 = 0
            r13.setGroupingUsed(r12)
            java.lang.String r10 = r13.format(r10)
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.toLowerCase(r11)
            r11 = 101(0x65, float:1.42E-43)
            int r11 = r10.indexOf(r11)
            if (r11 <= 0) goto L_0x00ef
            int r12 = r11 + 1
            int r13 = r10.length()
            if (r13 <= r12) goto L_0x00ef
            int r11 = r11 + 2
            java.lang.String r11 = r10.substring(r12, r11)
            java.lang.String r12 = "-"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00ef
            java.lang.String r11 = "e"
            java.lang.String r12 = "e+"
            java.lang.String r10 = r10.replaceAll(r11, r12)
        L_0x00ef:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.p1689c.C20297ei.m38178i(double, double):java.lang.String");
    }

    /* renamed from: m */
    public static String m38179m(double d) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingUsed(false);
        return decimalFormat.format(d).toLowerCase(Locale.getDefault());
    }

    /* renamed from: A */
    public final void mo25342A(C20150bt btVar, C20150bt btVar2, double d, double d2) {
        C20153bw bwVar = this.f57013a.f57041a;
        bwVar.copyOnWrite();
        C20154bx bxVar = (C20154bx) bwVar.instance;
        C20154bx bxVar2 = C20154bx.f56530h;
        bxVar.f56537f = btVar2;
        bxVar.f56532a |= 16;
        C20153bw bwVar2 = this.f57013a.f57041a;
        bwVar2.copyOnWrite();
        C20154bx bxVar3 = (C20154bx) bwVar2.instance;
        bxVar3.f56532a |= 8;
        bxVar3.f56536e = d2;
        C20153bw bwVar3 = this.f57013a.f57041a;
        bwVar3.copyOnWrite();
        C20154bx bxVar4 = (C20154bx) bwVar3.instance;
        bxVar4.f56535d = btVar;
        bxVar4.f56532a |= 4;
        C20153bw bwVar4 = this.f57013a.f57041a;
        bwVar4.copyOnWrite();
        C20154bx bxVar5 = (C20154bx) bwVar4.instance;
        bxVar5.f56532a |= 2;
        bxVar5.f56534c = d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25111g(com.google.p4271bq.C56425d r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            com.google.protobuf.bt r2 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20152bv.f56524e
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r3 = r0.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x001a
            java.lang.Object r2 = r2.f169969b
            goto L_0x001e
        L_0x001a:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x001e:
            com.google.android.libraries.componentview.components.c.a.bv r2 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20152bv) r2
            int r3 = r2.f56526a
            r4 = 1
            r3 = r3 & r4
            r5 = -2
            r6 = -1
            r7 = 0
            java.lang.String r8 = "UnitConverterComponent"
            r9 = 6
            r10 = 0
            if (r3 == 0) goto L_0x0067
            com.google.bq.d r3 = r2.f56527b
            if (r3 != 0) goto L_0x0033
            com.google.bq.d r3 = com.google.p4271bq.C56425d.f150537g
        L_0x0033:
            com.google.android.libraries.componentview.services.a.f r11 = r1.f57011A
            com.google.android.libraries.componentview.d.a r11 = r11.mo25450a(r1, r3)
            if (r11 == 0) goto L_0x004a
            android.view.View r3 = r11.mo25098kH()
            if (r3 == 0) goto L_0x005d
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r6, r5)
            r3.setLayoutParams(r11)
            goto L_0x005e
        L_0x004a:
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r11 = "Cannot inflate quick answer section: "
            java.lang.String r3 = r11.concat(r3)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r11)
        L_0x005d:
            r3 = r10
        L_0x005e:
            if (r3 == 0) goto L_0x0067
            android.view.View r11 = r1.f56305p
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r11.addView(r3)
        L_0x0067:
            com.google.android.libraries.componentview.components.c.em r3 = new com.google.android.libraries.componentview.components.c.em
            com.google.android.libraries.componentview.components.c.a.bx r2 = r2.f56528c
            if (r2 != 0) goto L_0x006f
            com.google.android.libraries.componentview.components.c.a.bx r2 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx.f56530h
        L_0x006f:
            r3.<init>(r2)
            r1.f57013a = r3
            boolean r2 = r3.mo25347c()
            if (r2 == 0) goto L_0x0369
            com.google.android.libraries.componentview.components.c.em r2 = r1.f57013a
            java.util.List r3 = r2.f57043c
            com.google.android.libraries.componentview.components.c.a.bw r11 = r2.f57041a
            com.google.protobuf.bv r11 = r11.instance
            com.google.android.libraries.componentview.components.c.a.bx r11 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx) r11
            java.lang.String r11 = r11.f56533b
            java.util.List r2 = r2.mo25346b(r11)
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x030b
            boolean r11 = r2.isEmpty()
            if (r11 == 0) goto L_0x0098
            goto L_0x030b
        L_0x0098:
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r13 = r1.f56304o
            r11.<init>(r13)
            android.content.Context r13 = r1.f56304o
            float r13 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r13)
            r14 = 1098907648(0x41800000, float:16.0)
            float r13 = r13 * r14
            int r13 = (int) r13
            android.content.Context r15 = r1.f56304o
            float r15 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r15)
            r16 = 1091567616(0x41100000, float:9.0)
            float r15 = r15 * r16
            int r15 = (int) r15
            android.content.Context r12 = r1.f56304o
            float r12 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r12)
            float r12 = r12 * r14
            int r12 = (int) r12
            android.content.Context r14 = r1.f56304o
            float r14 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r14)
            r17 = 1092616192(0x41200000, float:10.0)
            float r14 = r14 * r17
            int r14 = (int) r14
            androidx.core.p098j.C2043bi.m5556aj(r11, r13, r15, r12, r14)
            r11.setOrientation(r4)
            com.google.android.libraries.componentview.components.c.em r12 = r1.f57013a
            com.google.android.libraries.componentview.components.c.a.bw r12 = r12.f57041a
            com.google.protobuf.bv r12 = r12.instance
            com.google.android.libraries.componentview.components.c.a.bx r12 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx) r12
            java.lang.String r12 = r12.f56533b
            int r12 = r3.indexOf(r12)
            android.widget.LinearLayout r13 = r18.m38172L()
            com.google.android.libraries.componentview.components.b.a.d r3 = r1.m38174N(r12, r3)
            com.google.bq.d r3 = m38176P(r3)
            com.google.android.libraries.componentview.services.a.f r12 = r1.f57011A
            com.google.android.libraries.componentview.d.a r12 = r12.mo25450a(r1, r3)
            java.lang.String r14 = "Cannot inflate category component: "
            if (r12 != 0) goto L_0x0105
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r14.concat(r3)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r5)
            goto L_0x012d
        L_0x0105:
            android.view.View r3 = r12.mo25098kH()
            if (r3 != 0) goto L_0x0113
            java.lang.String r3 = "Missing category view."
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r5)
            goto L_0x012d
        L_0x0113:
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r6, r5)
            r13.addView(r3, r15)
            com.google.android.libraries.logging.j r5 = new com.google.android.libraries.logging.j
            r6 = 13673(0x3569, float:1.916E-41)
            r5.<init>(r6)
            r6 = 5
            r5.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r3, r5)
            com.google.android.libraries.componentview.components.b.b r12 = (com.google.android.libraries.componentview.components.p1685b.C19893b) r12
            r1.f57014b = r12
        L_0x012d:
            r11.addView(r13)
            com.google.android.libraries.componentview.components.c.em r3 = r1.f57013a
            com.google.android.libraries.componentview.components.c.a.bw r3 = r3.f57041a
            com.google.protobuf.bv r3 = r3.instance
            com.google.android.libraries.componentview.components.c.a.bx r3 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx) r3
            double r5 = r3.f56534c
            java.lang.String r3 = m38179m(r5)
            com.google.android.libraries.componentview.components.c.em r5 = r1.f57013a
            com.google.android.libraries.componentview.components.c.a.bw r5 = r5.f57041a
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.componentview.components.c.a.bx r5 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx) r5
            com.google.android.libraries.componentview.components.c.a.bt r5 = r5.f56535d
            if (r5 != 0) goto L_0x014c
            com.google.android.libraries.componentview.components.c.a.bt r5 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20150bt.f56516e
        L_0x014c:
            java.lang.String r5 = r5.f56518a
            int r5 = r2.indexOf(r5)
            android.widget.LinearLayout r6 = r18.m38172L()
            com.google.android.libraries.componentview.components.c.a.ap r3 = r1.m38175O(r3)
            com.google.bq.d r3 = m38177Q(r3)
            com.google.android.libraries.componentview.services.a.f r12 = r1.f57011A
            com.google.android.libraries.componentview.d.a r12 = r12.mo25450a(r1, r3)
            if (r12 != 0) goto L_0x0178
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r14.concat(r3)
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r12)
            goto L_0x019f
        L_0x0178:
            android.view.View r3 = r12.mo25098kH()
            if (r3 != 0) goto L_0x0186
            java.lang.String r3 = "Cannot create source input view."
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r12)
            goto L_0x019f
        L_0x0186:
            android.widget.LinearLayout$LayoutParams r13 = r18.m38170E()
            r6.addView(r3, r13)
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j
            r14 = 13669(0x3565, float:1.9154E-41)
            r13.<init>(r14)
            r14 = 5
            r13.mo33795i(r14)
            com.google.android.libraries.logging.C28295m.m52919e(r3, r13)
            com.google.android.libraries.componentview.components.c.ay r12 = (com.google.android.libraries.componentview.components.p1689c.C20205ay) r12
            r1.f57015c = r12
        L_0x019f:
            com.google.android.libraries.componentview.components.b.a.d r3 = r1.m38174N(r5, r2)
            com.google.bq.d r3 = m38176P(r3)
            com.google.android.libraries.componentview.services.a.f r5 = r1.f57011A
            com.google.android.libraries.componentview.d.a r5 = r5.mo25450a(r1, r3)
            if (r5 != 0) goto L_0x01c3
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "Cannot inflate source input component:"
            java.lang.String r3 = r5.concat(r3)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r5)
            goto L_0x01ea
        L_0x01c3:
            android.view.View r3 = r5.mo25098kH()
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = "Cannot create source type view."
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r5)
            goto L_0x01ea
        L_0x01d1:
            android.widget.LinearLayout$LayoutParams r12 = r18.m38171F()
            r6.addView(r3, r12)
            com.google.android.libraries.logging.j r12 = new com.google.android.libraries.logging.j
            r13 = 13670(0x3566, float:1.9156E-41)
            r12.<init>(r13)
            r13 = 5
            r12.mo33795i(r13)
            com.google.android.libraries.logging.C28295m.m52919e(r3, r12)
            com.google.android.libraries.componentview.components.b.b r5 = (com.google.android.libraries.componentview.components.p1685b.C19893b) r5
            r1.f57017e = r5
        L_0x01ea:
            r11.addView(r6)
            com.google.android.libraries.componentview.components.c.em r3 = r1.f57013a
            com.google.android.libraries.componentview.components.c.a.bw r3 = r3.f57041a
            com.google.protobuf.bv r3 = r3.instance
            com.google.android.libraries.componentview.components.c.a.bx r3 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx) r3
            double r5 = r3.f56534c
            double r12 = r3.f56536e
            java.lang.String r3 = m38178i(r5, r12)
            com.google.android.libraries.componentview.components.c.em r5 = r1.f57013a
            com.google.android.libraries.componentview.components.c.a.bw r5 = r5.f57041a
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.componentview.components.c.a.bx r5 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx) r5
            com.google.android.libraries.componentview.components.c.a.bt r5 = r5.f56537f
            if (r5 != 0) goto L_0x020b
            com.google.android.libraries.componentview.components.c.a.bt r5 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20150bt.f56516e
        L_0x020b:
            java.lang.String r5 = r5.f56518a
            int r5 = r2.indexOf(r5)
            android.widget.LinearLayout r6 = r18.m38172L()
            com.google.android.libraries.componentview.components.c.a.ap r3 = r1.m38175O(r3)
            com.google.bq.d r3 = m38177Q(r3)
            com.google.android.libraries.componentview.services.a.f r12 = r1.f57011A
            com.google.android.libraries.componentview.d.a r12 = r12.mo25450a(r1, r3)
            if (r12 != 0) goto L_0x0239
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r12 = "Cannot inflate destination input component: "
            java.lang.String r3 = r12.concat(r3)
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r12)
            goto L_0x0260
        L_0x0239:
            android.view.View r3 = r12.mo25098kH()
            if (r3 != 0) goto L_0x0247
            java.lang.String r3 = "Cannot create destination input view."
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r3, r12)
            goto L_0x0260
        L_0x0247:
            android.widget.LinearLayout$LayoutParams r13 = r18.m38170E()
            r6.addView(r3, r13)
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j
            r14 = 13671(0x3567, float:1.9157E-41)
            r13.<init>(r14)
            r14 = 5
            r13.mo33795i(r14)
            com.google.android.libraries.logging.C28295m.m52919e(r3, r13)
            com.google.android.libraries.componentview.components.c.ay r12 = (com.google.android.libraries.componentview.components.p1689c.C20205ay) r12
            r1.f57016d = r12
        L_0x0260:
            com.google.android.libraries.componentview.components.b.a.d r2 = r1.m38174N(r5, r2)
            com.google.bq.d r2 = m38176P(r2)
            com.google.android.libraries.componentview.services.a.f r3 = r1.f57011A
            com.google.android.libraries.componentview.d.a r3 = r3.mo25450a(r1, r2)
            if (r3 != 0) goto L_0x0284
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Cannot inflate destination type component: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r2, r3)
            goto L_0x02ab
        L_0x0284:
            android.view.View r2 = r3.mo25098kH()
            if (r2 != 0) goto L_0x0292
            java.lang.String r2 = "Cannot create destination type view."
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r2, r3)
            goto L_0x02ab
        L_0x0292:
            android.widget.LinearLayout$LayoutParams r5 = r18.m38171F()
            r6.addView(r2, r5)
            com.google.android.libraries.logging.j r5 = new com.google.android.libraries.logging.j
            r12 = 13672(0x3568, float:1.9159E-41)
            r5.<init>(r12)
            r12 = 5
            r5.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r5)
            com.google.android.libraries.componentview.components.b.b r3 = (com.google.android.libraries.componentview.components.p1685b.C19893b) r3
            r1.f57018f = r3
        L_0x02ab:
            r11.addView(r6)
            com.google.android.libraries.componentview.components.b.b r2 = r1.f57014b
            if (r2 == 0) goto L_0x030c
            com.google.android.libraries.componentview.components.c.ay r3 = r1.f57015c
            if (r3 == 0) goto L_0x030c
            com.google.android.libraries.componentview.components.b.b r3 = r1.f57017e
            if (r3 == 0) goto L_0x030c
            com.google.android.libraries.componentview.components.c.ay r3 = r1.f57016d
            if (r3 == 0) goto L_0x030c
            com.google.android.libraries.componentview.components.b.b r3 = r1.f57018f
            if (r3 == 0) goto L_0x030c
            int r2 = r2.mo25170i()
            r1.f57025m = r2
            com.google.android.libraries.componentview.components.b.b r2 = r1.f57014b
            com.google.android.libraries.componentview.components.c.eb r3 = new com.google.android.libraries.componentview.components.c.eb
            r3.<init>(r1)
            r2.mo25166A(r3)
            com.google.android.libraries.componentview.components.c.ay r2 = r1.f57015c
            com.google.android.libraries.componentview.components.c.ed r3 = new com.google.android.libraries.componentview.components.c.ed
            r3.<init>(r1)
            r2.mo25291n(r3)
            com.google.android.libraries.componentview.components.b.b r2 = r1.f57017e
            int r2 = r2.mo25170i()
            r1.f57026u = r2
            com.google.android.libraries.componentview.components.b.b r2 = r1.f57017e
            com.google.android.libraries.componentview.components.c.ee r3 = new com.google.android.libraries.componentview.components.c.ee
            r3.<init>(r1)
            r2.mo25166A(r3)
            com.google.android.libraries.componentview.components.c.ay r2 = r1.f57016d
            com.google.android.libraries.componentview.components.c.eg r3 = new com.google.android.libraries.componentview.components.c.eg
            r3.<init>(r1)
            r2.mo25291n(r3)
            com.google.android.libraries.componentview.components.b.b r2 = r1.f57018f
            int r2 = r2.mo25170i()
            r1.f57027v = r2
            com.google.android.libraries.componentview.components.b.b r2 = r1.f57018f
            com.google.android.libraries.componentview.components.c.eh r3 = new com.google.android.libraries.componentview.components.c.eh
            r3.<init>(r1)
            r2.mo25166A(r3)
            goto L_0x030c
        L_0x030b:
            r11 = r10
        L_0x030c:
            if (r11 == 0) goto L_0x0368
            com.google.bq.h r2 = r0.f150542d
            if (r2 != 0) goto L_0x0314
            com.google.bq.h r2 = com.google.p4271bq.C56429h.f150547k
        L_0x0314:
            int r2 = r2.f150549a
            r2 = r2 & r4
            if (r2 == 0) goto L_0x035a
            com.google.android.libraries.logging.j r2 = new com.google.android.libraries.logging.j
            r3 = 22449(0x57b1, float:3.1458E-41)
            r2.<init>(r3)
            r3 = 5
            r2.mo33795i(r3)
            com.google.android.libraries.logging.C28295m.m52919e(r11, r2)
            com.google.bq.h r2 = r0.f150542d     // Catch:{ IOException -> 0x034f }
            if (r2 != 0) goto L_0x032d
            com.google.bq.h r2 = com.google.p4271bq.C56429h.f150547k     // Catch:{ IOException -> 0x034f }
        L_0x032d:
            java.lang.String r2 = r2.f150557i     // Catch:{ IOException -> 0x034f }
            com.google.common.o.l.t r2 = com.google.android.libraries.logging.C28294l.m52912b(r2)     // Catch:{ IOException -> 0x034f }
            com.google.bq.h r0 = r0.f150542d     // Catch:{ IOException -> 0x034f }
            if (r0 != 0) goto L_0x0339
            com.google.bq.h r0 = com.google.p4271bq.C56429h.f150547k     // Catch:{ IOException -> 0x034f }
        L_0x0339:
            java.lang.String r0 = r0.f150556h     // Catch:{ IOException -> 0x034f }
            com.google.common.o.oe r0 = com.google.android.libraries.logging.C28285c.m52878e(r11, r2, r0)     // Catch:{ IOException -> 0x034f }
            if (r0 == 0) goto L_0x0347
            com.google.android.libraries.componentview.services.application.ca r2 = r1.f57012B     // Catch:{ IOException -> 0x034f }
            r2.mo25490e(r0)     // Catch:{ IOException -> 0x034f }
            goto L_0x0361
        L_0x0347:
            java.lang.String r0 = "Cannot create ClientVisualElementsProto"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x034f }
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r0, r2)     // Catch:{ IOException -> 0x034f }
            goto L_0x0361
        L_0x034f:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r7] = r0
            java.lang.String r0 = "RemoteException while decode base64Ei: "
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r0, r2)
            goto L_0x0361
        L_0x035a:
            java.lang.String r0 = "Cannot log client VE, missing logInfo."
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r0, r2)
        L_0x0361:
            android.view.View r0 = r1.f56305p
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r11)
        L_0x0368:
            return
        L_0x0369:
            java.lang.String r0 = "Incomplete UnitConverterData"
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r9, r8, r10, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.p1689c.C20297ei.mo25111g(com.google.bq.d):void");
    }

    /* renamed from: n */
    public final void mo25343n() {
        int i = this.f57027v;
        int i2 = this.f57026u;
        this.f57022j = true;
        this.f57017e.mo25167B(i);
        this.f57024l = true;
        this.f57018f.mo25167B(i2);
        this.f57027v = i2;
        this.f57026u = i;
        this.f57022j = false;
        this.f57024l = false;
        mo25344o();
    }

    /* renamed from: o */
    public final void mo25344o() {
        String str;
        double d;
        this.f57023k = true;
        C20150bt a = this.f57013a.mo25345a(this.f57014b.mo25171n(), this.f57017e.mo25171n());
        C20150bt a2 = this.f57013a.mo25345a(this.f57014b.mo25171n(), this.f57018f.mo25171n());
        if (!(a2 == null || a == null)) {
            double d2 = C59203do.f157270a;
            try {
                d = new BigDecimal(this.f57015c.mo25290m()).doubleValue();
                try {
                    d2 = m38167B(m38168C(d, a), a2);
                    str = m38178i(d, d2);
                } catch (NumberFormatException unused) {
                    str = BuildConfig.FLAVOR;
                    this.f57016d.mo25289A(str);
                    mo25342A(a, a2, d, d2);
                    this.f57023k = false;
                }
            } catch (NumberFormatException unused2) {
                d = 0.0d;
                str = BuildConfig.FLAVOR;
                this.f57016d.mo25289A(str);
                mo25342A(a, a2, d, d2);
                this.f57023k = false;
            }
            this.f57016d.mo25289A(str);
            mo25342A(a, a2, d, d2);
        }
        this.f57023k = false;
    }
}
