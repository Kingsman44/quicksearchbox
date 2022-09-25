package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14731a;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14288dr;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15183at;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15188ay;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.az */
/* compiled from: PG */
public final class C15017az implements C15006ao {

    /* renamed from: w */
    private static final C59071e f45003w = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.a.az");

    /* renamed from: A */
    private final C37215b f45004A;

    /* renamed from: B */
    private final C15346t f45005B;

    /* renamed from: a */
    public final C14986h f45006a;

    /* renamed from: b */
    public final C15188ay f45007b;

    /* renamed from: c */
    public final C15183at f45008c;

    /* renamed from: d */
    public final C86124t f45009d;

    /* renamed from: e */
    public final C14152v f45010e;

    /* renamed from: f */
    public ViewGroup f45011f;

    /* renamed from: g */
    public ImageView f45012g;

    /* renamed from: h */
    public TextView f45013h;

    /* renamed from: i */
    public ViewGroup f45014i;

    /* renamed from: j */
    public View f45015j;

    /* renamed from: k */
    public View f45016k;

    /* renamed from: l */
    public RecyclerView f45017l;

    /* renamed from: m */
    public C15016ay f45018m;

    /* renamed from: n */
    public ViewGroup f45019n;

    /* renamed from: o */
    public ProgressBar f45020o;

    /* renamed from: p */
    public C14288dr f45021p;

    /* renamed from: q */
    public ViewGroup f45022q;

    /* renamed from: r */
    public TextView f45023r;

    /* renamed from: s */
    public TextView f45024s;

    /* renamed from: t */
    public ContextThemeWrapper f45025t;

    /* renamed from: u */
    public List f45026u = new ArrayList();

    /* renamed from: v */
    public boolean f45027v = false;

    /* renamed from: x */
    private final C15352z f45028x;

    /* renamed from: y */
    private final C14132bf f45029y;

    /* renamed from: z */
    private final C69464a f45030z;

    public C15017az(C86124t tVar, C14986h hVar, C15352z zVar, C15346t tVar2, C14132bf bfVar, C37215b bVar, C15188ay ayVar, C69464a aVar, C15183at atVar, C14152v vVar) {
        this.f45009d = tVar;
        this.f45006a = hVar;
        this.f45028x = zVar;
        this.f45007b = ayVar;
        this.f45004A = bVar;
        this.f45029y = bfVar;
        this.f45030z = aVar;
        this.f45008c = atVar;
        this.f45010e = vVar;
        this.f45005B = tVar2;
    }

    /* renamed from: e */
    private final void m31571e(View view, C14216b bVar) {
        view.setOnClickListener(new C14129bc(this.f45029y, Optional.empty(), new C15010as(this, bVar)));
    }

    /* renamed from: f */
    private static boolean m31572f(C14288dr drVar) {
        C14216b bVar = drVar.f43225a;
        return bVar != null && !bVar.equals(C14216b.f43007f);
    }

    /* renamed from: g */
    private final boolean m31573g(C14288dr drVar) {
        C58485gu c = this.f45009d.mo79745c(C90051dc.f248882bk);
        C14216b bVar = drVar.f43225a;
        if (bVar == null) {
            bVar = C14216b.f43007f;
        }
        return !c.contains(bVar.f43011c);
    }

    /* renamed from: h */
    private static boolean m31574h(C14288dr drVar) {
        return Collection.EL.stream(drVar.f43230f).anyMatch(C15011at.f44991a);
    }

    /* renamed from: a */
    public final View mo21891a() {
        ViewGroup viewGroup = this.f45011f;
        viewGroup.getClass();
        return viewGroup;
    }

    /* renamed from: b */
    public final int mo21897b() {
        return this.f45026u.size();
    }

    /* renamed from: c */
    public final void mo21898c() {
        this.f45010e.mo21478c(C37182a.f98188hw.mo40813g(), BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        C14986h hVar = this.f45006a;
        ContextThemeWrapper contextThemeWrapper = this.f45025t;
        contextThemeWrapper.getClass();
        hVar.mo21875g(C14731a.m31008e(contextThemeWrapper.getResources().getString(R.string.find_something_else_button_text)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03c4, code lost:
        if (r0.f45026u.equals(r1.f43230f) != false) goto L_0x0551;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0599  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21899d(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14288dr r22, android.view.ViewGroup r23, android.view.ContextThemeWrapper r24, boolean r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r0.f45025t = r3
            boolean r4 = r0.f45027v
            r4 = r4 | r25
            r0.f45027v = r4
            android.view.ViewGroup r4 = r0.f45011f
            r5 = 3
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x0220
            r4 = 2131433104(0x7f0b1690, float:1.8487984E38)
            android.view.View r8 = r2.findViewById(r4)
            if (r8 == 0) goto L_0x0027
            android.view.View r8 = r2.findViewById(r4)
            r2.removeView(r8)
        L_0x0027:
            com.google.android.apps.gsa.search.core.i.t r8 = r0.f45009d
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248821ac
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0041
            android.view.ContextThemeWrapper r9 = r0.f45025t
            r9.getClass()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131625902(0x7f0e07ae, float:1.8879025E38)
            r9.inflate(r10, r2, r6)
            goto L_0x0050
        L_0x0041:
            android.view.ContextThemeWrapper r9 = r0.f45025t
            r9.getClass()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131625900(0x7f0e07ac, float:1.887902E38)
            r9.inflate(r10, r2, r6)
        L_0x0050:
            android.view.View r4 = r2.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f45011f = r4
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r4 = r0.f45005B
            com.google.android.libraries.assistant.auto.tng.morris.e.b r9 = r1.f43225a
            if (r9 != 0) goto L_0x0060
            com.google.android.libraries.assistant.auto.tng.morris.e.b r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x0060:
            java.lang.String r9 = r9.f43011c
            com.google.android.libraries.assistant.auto.tng.morris.e.b r10 = r1.f43225a
            if (r10 != 0) goto L_0x0068
            com.google.android.libraries.assistant.auto.tng.morris.e.b r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x0068:
            java.lang.String r10 = r10.f43012d
            com.google.android.libraries.logging.ve.e r4 = r4.mo22213b(r9, r10)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r9 = r0.f45029y
            android.view.ViewGroup r10 = r0.f45011f
            r10.getClass()
            r11 = 108729(0x1a8b9, float:1.52362E-40)
            r9.mo21445b(r10, r11, r4)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.au r4 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.au
            r4.<init>(r0)
            android.view.ViewGroup r9 = r0.f45011f
            r9.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.n r10 = new com.google.android.libraries.assistant.auto.tng.morris.c.n
            android.view.ContextThemeWrapper r11 = r0.f45025t
            r11.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r12 = r0.f45029y
            r10.<init>(r11, r12, r4)
            r9.setOnTouchListener(r10)
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131427864(0x7f0b0218, float:1.8477356E38)
            android.view.View r4 = r4.findViewById(r9)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f45012g = r4
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131427875(0x7f0b0223, float:1.8477379E38)
            android.view.View r4 = r4.findViewById(r9)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f45013h = r4
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131434165(0x7f0b1ab5, float:1.8490136E38)
            android.view.View r4 = r4.findViewById(r9)
            r0.f45015j = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r9 = r0.f45029y
            r10 = 109858(0x1ad22, float:1.53944E-40)
            r9.mo21444a(r4, r10)
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131434175(0x7f0b1abf, float:1.8490157E38)
            android.view.View r4 = r4.findViewById(r9)
            r0.f45016k = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r9 = r0.f45029y
            r11 = 126447(0x1edef, float:1.7719E-40)
            r9.mo21444a(r4, r11)
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131433174(0x7f0b16d6, float:1.8488126E38)
            android.view.View r4 = r4.findViewById(r9)
            android.support.v7.widget.RecyclerView r4 = (android.support.p033v7.widget.RecyclerView) r4
            r0.f45017l = r4
            if (r8 == 0) goto L_0x011d
            android.view.ContextThemeWrapper r4 = r0.f45025t
            r4.getClass()
            android.content.res.Resources r4 = r4.getResources()
            r8 = 2131169962(0x7f0712aa, float:1.7954269E38)
            int r4 = r4.getDimensionPixelSize(r8)
            android.view.ContextThemeWrapper r8 = r0.f45025t
            r8.getClass()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131169988(0x7f0712c4, float:1.7954322E38)
            int r8 = r8.getDimensionPixelSize(r9)
            com.google.android.libraries.assistant.auto.tng.morris.g.f.ab r9 = new com.google.android.libraries.assistant.auto.tng.morris.g.f.ab
            int r4 = r4 + r8
            r9.<init>(r4)
            android.support.v7.widget.RecyclerView r4 = r0.f45017l
            r9.mo3197g(r4)
        L_0x011d:
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r8 = 2131433106(0x7f0b1692, float:1.8487988E38)
            android.view.View r4 = r4.findViewById(r8)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f45019n = r4
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131433130(0x7f0b16aa, float:1.8488037E38)
            android.view.View r4 = r4.findViewById(r9)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r0.f45020o = r4
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131433103(0x7f0b168f, float:1.8487982E38)
            android.view.View r4 = r4.findViewById(r9)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x01af
            android.view.ContextThemeWrapper r9 = r0.f45025t
            r9.getClass()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r11 = 2131625899(0x7f0e07ab, float:1.8879019E38)
            android.view.View r9 = r9.inflate(r11, r4, r7)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r11 = 2131433115(0x7f0b169b, float:1.8488007E38)
            android.view.View r11 = r9.findViewById(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r0.f45022q = r11
            r11 = 2131433116(0x7f0b169c, float:1.8488009E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0.f45023r = r11
            r11 = 2131434169(0x7f0b1ab9, float:1.8490144E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0.f45024s = r11
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r12 = r0.f45029y
            r12.mo21444a(r11, r10)
            android.view.ViewGroup r11 = r0.f45022q
            r11.getClass()
            r12 = 2131433114(0x7f0b169a, float:1.8488005E38)
            android.view.View r11 = r11.findViewById(r12)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r12 = r0.f45029y
            r13 = 110271(0x1aebf, float:1.54523E-40)
            r12.mo21444a(r11, r13)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r12 = r0.f45029y
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ar r13 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ar
            r13.<init>(r0)
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r15 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r15.<init>(r12, r14, r13)
            r11.setOnClickListener(r15)
            r4.addView(r9)
        L_0x01af:
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            r9 = 2131427868(0x7f0b021c, float:1.8477364E38)
            android.view.View r4 = r4.findViewById(r9)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f45014i = r4
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r11 = r0.f45029y
            r11.mo21444a(r4, r10)
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            g.a.a r10 = r0.f45030z
            java.lang.Object r10 = r10.mo17428b()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4.setPadding(r7, r10, r7, r7)
            boolean r4 = r0.f45027v
            if (r4 == 0) goto L_0x0220
            android.view.ViewGroup r4 = r0.f45011f
            r4.getClass()
            android.view.ContextThemeWrapper r10 = r0.f45025t
            r10.getClass()
            android.view.animation.Animation r2 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31954f(r10, r2)
            r4.startAnimation(r2)
            android.view.ViewGroup r2 = r0.f45011f
            r2.getClass()
            android.view.View r2 = r2.findViewById(r9)
            android.view.ContextThemeWrapper r4 = r0.f45025t
            r4.getClass()
            android.view.animation.Animation r4 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31955g(r4, r6)
            r2.startAnimation(r4)
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r1.f43226b
            if (r2 == 0) goto L_0x0207
            goto L_0x020b
        L_0x0207:
            com.google.android.libraries.assistant.auto.tng.morris.e.oc r2 = r1.f43227c
            if (r2 == 0) goto L_0x0220
        L_0x020b:
            android.view.ViewGroup r2 = r0.f45011f
            r2.getClass()
            android.view.View r2 = r2.findViewById(r8)
            android.view.ContextThemeWrapper r4 = r0.f45025t
            r4.getClass()
            android.view.animation.Animation r4 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31955g(r4, r5)
            r2.startAnimation(r4)
        L_0x0220:
            com.google.android.libraries.assistant.auto.tng.morris.e.dr r2 = r0.f45021p
            if (r2 == 0) goto L_0x022a
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x05e7
        L_0x022a:
            boolean r2 = m31572f(r22)
            if (r2 != 0) goto L_0x0246
            android.widget.ImageView r2 = r0.f45012g
            r2.getClass()
            boolean r4 = m31574h(r22)
            if (r6 == r4) goto L_0x023f
            r4 = 2131232662(0x7f080796, float:1.808144E38)
            goto L_0x0242
        L_0x023f:
            r4 = 2131232918(0x7f080896, float:1.8081959E38)
        L_0x0242:
            r2.setImageResource(r4)
            goto L_0x026d
        L_0x0246:
            com.google.android.libraries.assistant.auto.tng.morris.e.b r2 = r1.f43225a
            if (r2 != 0) goto L_0x024c
            com.google.android.libraries.assistant.auto.tng.morris.e.b r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x024c:
            int r2 = r2.f43009a
            if (r2 != r5) goto L_0x026d
            com.google.android.libraries.assistant.auto.tng.morris.g.f.z r2 = r0.f45028x
            android.widget.ImageView r4 = r0.f45012g
            r4.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r8 = r1.f43225a
            if (r8 != 0) goto L_0x025d
            com.google.android.libraries.assistant.auto.tng.morris.e.b r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x025d:
            int r9 = r8.f43009a
            if (r9 != r5) goto L_0x0266
            java.lang.Object r8 = r8.f43010b
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r8 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj) r8
            goto L_0x0268
        L_0x0266:
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj.f43456e
        L_0x0268:
            com.google.android.libraries.assistant.auto.tng.morris.g.a.aq r9 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a.C15008aq.f44987a
            r2.mo22229l(r4, r8, r9)
        L_0x026d:
            int r2 = r1.f43229e
            int r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r2)
            r8 = 4
            if (r4 != 0) goto L_0x0277
            goto L_0x0279
        L_0x0277:
            if (r4 == r8) goto L_0x0282
        L_0x0279:
            int r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r2)
            if (r2 != 0) goto L_0x0280
            goto L_0x02b7
        L_0x0280:
            if (r2 != r5) goto L_0x02b7
        L_0x0282:
            boolean r2 = m31572f(r22)
            if (r2 == 0) goto L_0x0299
            android.widget.TextView r2 = r0.f45013h
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r4 = r1.f43225a
            if (r4 != 0) goto L_0x0293
            com.google.android.libraries.assistant.auto.tng.morris.e.b r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x0293:
            java.lang.String r4 = r4.f43013e
            r2.setText(r4)
            goto L_0x02b7
        L_0x0299:
            android.widget.TextView r2 = r0.f45013h
            r2.getClass()
            android.view.ContextThemeWrapper r4 = r0.f45025t
            r4.getClass()
            boolean r9 = m31574h(r22)
            if (r6 == r9) goto L_0x02ad
            r9 = 2132086926(0x7f15108e, float:1.9814093E38)
            goto L_0x02b0
        L_0x02ad:
            r9 = 2132091317(0x7f1521b5, float:1.9822999E38)
        L_0x02b0:
            java.lang.String r4 = r4.getString(r9)
            r2.setText(r4)
        L_0x02b7:
            boolean r2 = r21.m31573g(r22)
            if (r2 == 0) goto L_0x02c5
            boolean r2 = m31572f(r22)
            if (r2 == 0) goto L_0x02c5
            r2 = 1
            goto L_0x02c6
        L_0x02c5:
            r2 = 0
        L_0x02c6:
            if (r2 == 0) goto L_0x02d9
            android.view.ContextThemeWrapper r4 = r0.f45025t
            r4.getClass()
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2131169957(0x7f0712a5, float:1.7954259E38)
            int r4 = r4.getDimensionPixelSize(r9)
            goto L_0x02da
        L_0x02d9:
            r4 = 0
        L_0x02da:
            android.widget.TextView r9 = r0.f45013h
            r9.getClass()
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.leftMargin
            int r11 = r9.topMargin
            int r12 = r9.bottomMargin
            r9.setMargins(r10, r11, r4, r12)
            if (r6 == r2) goto L_0x02f2
            r4 = 0
            goto L_0x02f5
        L_0x02f2:
            r4 = 2131233263(0x7f0809ef, float:1.8082659E38)
        L_0x02f5:
            android.view.ViewGroup r9 = r0.f45014i
            r9.getClass()
            r9.setBackgroundResource(r4)
            if (r2 == 0) goto L_0x032e
            android.view.ViewGroup r2 = r0.f45014i
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r4 = r1.f43225a
            if (r4 != 0) goto L_0x030a
            com.google.android.libraries.assistant.auto.tng.morris.e.b r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x030a:
            r0.m31571e(r2, r4)
            android.view.ViewGroup r2 = r0.f45014i
            r2.getClass()
            android.view.ContextThemeWrapper r4 = r0.f45025t
            r4.getClass()
            java.lang.Object[] r9 = new java.lang.Object[r6]
            com.google.android.libraries.assistant.auto.tng.morris.e.b r10 = r1.f43225a
            if (r10 != 0) goto L_0x031f
            com.google.android.libraries.assistant.auto.tng.morris.e.b r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x031f:
            java.lang.String r10 = r10.f43013e
            r9[r7] = r10
            r10 = 2132090857(0x7f151fe9, float:1.9822066E38)
            java.lang.String r4 = r4.getString(r10, r9)
            r2.setContentDescription(r4)
            goto L_0x0337
        L_0x032e:
            android.view.ViewGroup r2 = r0.f45014i
            r2.getClass()
            r4 = 0
            r2.setOnClickListener(r4)
        L_0x0337:
            boolean r2 = r21.m31573g(r22)
            r4 = 8
            if (r2 == 0) goto L_0x0377
            android.view.View r2 = r0.f45015j
            r2.getClass()
            r2.setVisibility(r4)
            boolean r2 = m31572f(r22)
            if (r2 == 0) goto L_0x036e
            android.view.View r2 = r0.f45016k
            r2.getClass()
            r2.setVisibility(r7)
            android.view.View r2 = r0.f45016k
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r9 = r0.f45029y
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ap r10 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ap
            r10.<init>(r0)
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r12 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r12.<init>(r9, r11, r10)
            r2.setOnClickListener(r12)
            goto L_0x03a4
        L_0x036e:
            android.view.View r2 = r0.f45016k
            r2.getClass()
            r2.setVisibility(r4)
            goto L_0x03a4
        L_0x0377:
            android.view.View r2 = r0.f45016k
            r2.getClass()
            r2.setVisibility(r4)
            boolean r2 = m31572f(r22)
            if (r2 == 0) goto L_0x039c
            android.view.View r2 = r0.f45015j
            r2.getClass()
            r2.setVisibility(r7)
            android.view.View r2 = r0.f45015j
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r9 = r1.f43225a
            if (r9 != 0) goto L_0x0398
            com.google.android.libraries.assistant.auto.tng.morris.e.b r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x0398:
            r0.m31571e(r2, r9)
            goto L_0x03a4
        L_0x039c:
            android.view.View r2 = r0.f45015j
            r2.getClass()
            r2.setVisibility(r4)
        L_0x03a4:
            com.google.android.libraries.assistant.auto.tng.morris.e.dr r2 = r0.f45021p
            if (r2 == 0) goto L_0x03c6
            int r2 = r2.f43229e
            int r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r2)
            if (r2 != 0) goto L_0x03b1
            r2 = 1
        L_0x03b1:
            int r9 = r1.f43229e
            int r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r9)
            if (r9 != 0) goto L_0x03ba
            r9 = 1
        L_0x03ba:
            if (r2 != r9) goto L_0x03c6
            java.util.List r2 = r0.f45026u
            com.google.protobuf.cq r9 = r1.f43230f
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0551
        L_0x03c6:
            com.google.protobuf.cq r2 = r1.f43230f
            r0.f45026u = r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x04a5
            int r2 = r1.f43229e
            int r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r2)
            if (r2 != 0) goto L_0x03da
            goto L_0x04a5
        L_0x03da:
            if (r2 != r8) goto L_0x04a5
            com.google.android.libraries.assistant.auto.tng.morris.e.qf r2 = r1.f43231g
            if (r2 != 0) goto L_0x03e2
            com.google.android.libraries.assistant.auto.tng.morris.e.qf r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14627qf.f44206b
        L_0x03e2:
            int r2 = r2.f44208a
            com.google.android.libraries.assistant.auto.tng.morris.e.qe r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe.m30646a(r2)
            if (r2 != 0) goto L_0x03ec
            com.google.android.libraries.assistant.auto.tng.morris.e.qe r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe.UNRECOGNIZED
        L_0x03ec:
            com.google.common.f.e r9 = f45003w
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r11 = "Morris.MediaBrowseFsRnd"
            r9.mo56378ag(r10, r11)
            java.lang.String r10 = "show premium user status. %s"
            r11 = 45954(0xb382, float:6.4395E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56389s(r10, r2)
            com.google.android.apps.gsa.search.core.i.t r9 = r0.f45009d
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248856bK
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x042c
            com.google.android.libraries.assistant.auto.tng.morris.e.qe r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe.YOUTUBE_FREE_USER
            if (r2 != r9) goto L_0x042c
            android.widget.TextView r2 = r0.f45023r
            r2.getClass()
            r9 = 2132089289(0x7f1519c9, float:1.9818886E38)
            java.lang.String r9 = r3.getString(r9)
            r2.setText(r9)
            com.google.android.libraries.search.b.b r2 = r0.f45004A
            com.google.android.libraries.search.b.i.f r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97790aV
            com.google.net.a.a.b r10 = com.google.net.p4726a.p4727a.C62722b.NOT_FOUND
            com.google.android.libraries.search.b.i.a r9 = r9.mo40805c(r10)
            r2.mo19974a(r9)
            goto L_0x0448
        L_0x042c:
            android.widget.TextView r2 = r0.f45023r
            r2.getClass()
            r9 = 2132086800(0x7f151010, float:1.9813837E38)
            java.lang.String r9 = r3.getString(r9)
            r2.setText(r9)
            com.google.android.libraries.search.b.b r2 = r0.f45004A
            com.google.android.libraries.search.b.i.f r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97789aU
            com.google.net.a.a.b r10 = com.google.net.p4726a.p4727a.C62722b.NOT_FOUND
            com.google.android.libraries.search.b.i.a r9 = r9.mo40805c(r10)
            r2.mo19974a(r9)
        L_0x0448:
            boolean r2 = r21.m31573g(r22)
            if (r2 == 0) goto L_0x048b
            boolean r2 = m31572f(r22)
            if (r2 == 0) goto L_0x048b
            android.widget.TextView r2 = r0.f45024s
            r2.getClass()
            r2.setVisibility(r7)
            android.widget.TextView r2 = r0.f45024s
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r9 = r1.f43225a
            if (r9 != 0) goto L_0x0467
            com.google.android.libraries.assistant.auto.tng.morris.e.b r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x0467:
            android.view.ContextThemeWrapper r10 = r0.f45025t
            r10.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r9 = r9.f43013e
            r6[r7] = r9
            r9 = 2132090861(0x7f151fed, float:1.9822074E38)
            java.lang.String r6 = r10.getString(r9, r6)
            r2.setText(r6)
            android.widget.TextView r2 = r0.f45024s
            r2.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r6 = r1.f43225a
            if (r6 != 0) goto L_0x0487
            com.google.android.libraries.assistant.auto.tng.morris.e.b r6 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
        L_0x0487:
            r0.m31571e(r2, r6)
            goto L_0x0493
        L_0x048b:
            android.widget.TextView r2 = r0.f45024s
            r2.getClass()
            r2.setVisibility(r4)
        L_0x0493:
            android.view.ViewGroup r2 = r0.f45022q
            r2.getClass()
            r2.setVisibility(r7)
            android.support.v7.widget.RecyclerView r2 = r0.f45017l
            r2.getClass()
            r2.setVisibility(r4)
            goto L_0x0551
        L_0x04a5:
            int r2 = r1.f43229e
            int r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r2)
            if (r2 != 0) goto L_0x04ae
            goto L_0x04c7
        L_0x04ae:
            if (r2 != r8) goto L_0x04c7
            com.google.android.libraries.search.b.b r2 = r0.f45004A
            com.google.android.libraries.search.b.i.f r9 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97788aT
            com.google.android.libraries.search.b.i.h r9 = r9.mo40806d()
            com.google.protobuf.cq r10 = r1.f43230f
            int r10 = r10.size()
            com.google.net.a.a.b r11 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.c r9 = com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14146p.m30447a(r9, r10, r11)
            r2.mo19974a(r9)
        L_0x04c7:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f45009d
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248821ac
            boolean r2 = r2.mo79746e(r9)
            android.support.v7.widget.GridLayoutManager r9 = new android.support.v7.widget.GridLayoutManager
            android.view.ContextThemeWrapper r10 = r0.f45025t
            r10.getClass()
            r11 = 2
            r9.<init>(r10, r11, r2)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.av r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.av
            r2.<init>(r0, r1)
            r9.mSpanSizeLookup = r2
            android.support.v7.widget.RecyclerView r2 = r0.f45017l
            r2.getClass()
            r2.setLayoutManager(r9)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ay r2 = r0.f45018m
            if (r2 != 0) goto L_0x0501
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ay r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ay
            android.view.ContextThemeWrapper r9 = r0.f45025t
            r9.getClass()
            r2.<init>(r0, r9)
            r0.f45018m = r2
            android.support.v7.widget.RecyclerView r9 = r0.f45017l
            r9.getClass()
            r9.addItemDecoration$ar$ds(r2)
        L_0x0501:
            com.google.android.libraries.assistant.auto.tng.morris.g.a.bf r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.bf
            com.google.android.apps.gsa.search.core.i.t r11 = r0.f45009d
            android.view.ContextThemeWrapper r12 = r0.f45025t
            r12.getClass()
            int r9 = r1.f43229e
            int r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14303ef.m30600a(r9)
            if (r9 != 0) goto L_0x0514
            r13 = 1
            goto L_0x0515
        L_0x0514:
            r13 = r9
        L_0x0515:
            java.util.List r14 = r0.f45026u
            com.google.android.libraries.assistant.auto.tng.morris.g.a.aw r15 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.aw
            r15.<init>(r0)
            com.google.android.libraries.assistant.auto.tng.morris.g.a.ax r9 = new com.google.android.libraries.assistant.auto.tng.morris.g.a.ax
            r9.<init>(r0)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r10 = r0.f45029y
            boolean r8 = r0.f45027v
            boolean r16 = m31572f(r22)
            r19 = r16 ^ 1
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r6 = r0.f45005B
            r17 = r10
            r10 = r2
            r16 = r9
            r18 = r8
            r20 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.support.v7.widget.RecyclerView r6 = r0.f45017l
            r6.getClass()
            r6.setAdapter(r2)
            android.view.ViewGroup r2 = r0.f45022q
            r2.getClass()
            r2.setVisibility(r4)
            android.support.v7.widget.RecyclerView r2 = r0.f45017l
            r2.getClass()
            r2.setVisibility(r7)
        L_0x0551:
            android.widget.ProgressBar r2 = r0.f45020o
            r2.getClass()
            int r6 = r1.f43228d
            int r6 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14330ff.m30608b(r6)
            if (r6 != 0) goto L_0x0561
        L_0x055e:
            r5 = 8
            goto L_0x0564
        L_0x0561:
            if (r6 != r5) goto L_0x055e
            r5 = 0
        L_0x0564:
            r2.setVisibility(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r1.f43226b
            if (r2 == 0) goto L_0x0599
            com.google.android.libraries.assistant.auto.tng.morris.e.dr r2 = r0.f45021p
            if (r2 == 0) goto L_0x0580
            com.google.android.libraries.assistant.auto.tng.morris.e.oc r2 = r2.f43227c
            if (r2 == 0) goto L_0x0580
            android.view.ViewGroup r2 = r0.f45019n
            r2.getClass()
            r2.removeAllViews()
            com.google.android.libraries.assistant.auto.tng.morris.g.d.at r2 = r0.f45008c
            r2.mo22061b()
        L_0x0580:
            android.view.ViewGroup r2 = r0.f45019n
            r2.getClass()
            r2.setVisibility(r7)
            com.google.android.libraries.assistant.auto.tng.morris.g.d.ay r2 = r0.f45007b
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r4 = r1.f43226b
            if (r4 != 0) goto L_0x0590
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe.f44055i
        L_0x0590:
            android.view.ViewGroup r5 = r0.f45019n
            r5.getClass()
            r2.mo22065a(r4, r5, r3)
            goto L_0x05e7
        L_0x0599:
            com.google.android.libraries.assistant.auto.tng.morris.e.oc r2 = r1.f43227c
            if (r2 == 0) goto L_0x05cb
            com.google.android.libraries.assistant.auto.tng.morris.e.dr r2 = r0.f45021p
            if (r2 == 0) goto L_0x05b2
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r2.f43226b
            if (r2 == 0) goto L_0x05b2
            android.view.ViewGroup r2 = r0.f45019n
            r2.getClass()
            r2.removeAllViews()
            com.google.android.libraries.assistant.auto.tng.morris.g.d.ay r2 = r0.f45007b
            r2.mo22066b()
        L_0x05b2:
            android.view.ViewGroup r2 = r0.f45019n
            r2.getClass()
            r2.setVisibility(r7)
            com.google.android.libraries.assistant.auto.tng.morris.g.d.at r2 = r0.f45008c
            com.google.android.libraries.assistant.auto.tng.morris.e.oc r4 = r1.f43227c
            if (r4 != 0) goto L_0x05c2
            com.google.android.libraries.assistant.auto.tng.morris.e.oc r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14570oc.f44050d
        L_0x05c2:
            android.view.ViewGroup r5 = r0.f45019n
            r5.getClass()
            r2.mo22060a(r4, r5, r3)
            goto L_0x05e7
        L_0x05cb:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f45009d
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248821ac
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x05de
            android.view.ViewGroup r2 = r0.f45019n
            r2.getClass()
            r2.setVisibility(r4)
            goto L_0x05e7
        L_0x05de:
            android.view.ViewGroup r2 = r0.f45019n
            r2.getClass()
            r3 = 4
            r2.setVisibility(r3)
        L_0x05e7:
            r0.f45021p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a.C15017az.mo21899d(com.google.android.libraries.assistant.auto.tng.morris.e.dr, android.view.ViewGroup, android.view.ContextThemeWrapper, boolean):void");
    }
}
