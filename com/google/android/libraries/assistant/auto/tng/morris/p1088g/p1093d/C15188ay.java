package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14284dn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ay */
/* compiled from: PG */
public final class C15188ay {

    /* renamed from: c */
    private static final C58495hd f45581c;

    /* renamed from: a */
    public final Context f45582a;

    /* renamed from: b */
    public final C14986h f45583b;

    /* renamed from: d */
    private final C15346t f45584d;

    /* renamed from: e */
    private final C14132bf f45585e;

    /* renamed from: f */
    private final C14152v f45586f;

    /* renamed from: g */
    private ImageView f45587g;

    /* renamed from: h */
    private ImageView f45588h;

    /* renamed from: i */
    private TextView f45589i;

    /* renamed from: j */
    private TextView f45590j;

    /* renamed from: k */
    private ImageView f45591k;

    /* renamed from: l */
    private ImageView f45592l;

    /* renamed from: m */
    private ViewGroup f45593m;

    /* renamed from: n */
    private C14572oe f45594n;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C14284dn.PLAY, Integer.valueOf(R.drawable.media_task_play_button));
        gzVar.mo55429h(C14284dn.PAUSE, Integer.valueOf(R.drawable.media_task_pause_button));
        gzVar.mo55429h(C14284dn.STOP, Integer.valueOf(R.drawable.media_task_stop_button));
        gzVar.mo55429h(C14284dn.NEXT, Integer.valueOf(R.drawable.media_task_next_button));
        gzVar.mo55429h(C14284dn.FORWARD, Integer.valueOf(R.drawable.media_task_forward_30_button));
        gzVar.mo55429h(C14284dn.PREV, Integer.valueOf(R.drawable.quantum_ic_skip_previous_white_48));
        gzVar.mo55429h(C14284dn.BACKWARD, Integer.valueOf(R.drawable.quantum_ic_replay_10_white_48));
        f45581c = gzVar.mo55427f(false);
    }

    public C15188ay(Context context, C14986h hVar, C15346t tVar, C14132bf bfVar, C14152v vVar) {
        this.f45582a = context;
        this.f45583b = hVar;
        this.f45584d = tVar;
        this.f45585e = bfVar;
        this.f45586f = vVar;
    }

    /* renamed from: b */
    public final void mo22066b() {
        this.f45587g = null;
        this.f45588h = null;
        this.f45589i = null;
        this.f45590j = null;
        this.f45591k = null;
        this.f45593m = null;
        this.f45594n = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0100, code lost:
        if (r2.f44058b.equals(r1.f44058b) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x018d, code lost:
        if (r2.equals(r3) == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c2, code lost:
        if (r3.equals(r2) == false) goto L_0x01c4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22065a(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe r18, android.view.ViewGroup r19, android.view.ContextThemeWrapper r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.widget.TextView r3 = r0.f45589i
            r4 = 1
            if (r3 == 0) goto L_0x000d
            goto L_0x00da
        L_0x000d:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r20)
            r5 = 2131625926(0x7f0e07c6, float:1.8879074E38)
            r3.inflate(r5, r2, r4)
            r3 = 2131433187(0x7f0b16e3, float:1.8488153E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f45593m = r2
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r3 = r0.f45585e
            r5 = 105768(0x19d28, float:1.48213E-40)
            r3.mo21444a(r2, r5)
            android.view.ViewGroup r2 = r0.f45593m
            com.google.android.libraries.assistant.auto.tng.morris.g.d.aw r3 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.aw
            r3.<init>(r0)
            r2.setAccessibilityDelegate(r3)
            android.view.ViewGroup r2 = r0.f45593m
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r3 = r0.f45585e
            com.google.android.libraries.assistant.auto.tng.morris.g.d.au r5 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.au
            r5.<init>(r0)
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r7 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r7.<init>(r3, r6, r5)
            r2.setOnClickListener(r7)
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 2131433191(0x7f0b16e7, float:1.848816E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f45587g = r2
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r3 = r0.f45585e
            r5 = 105767(0x19d27, float:1.48211E-40)
            r6 = 2367(0x93f, float:3.317E-42)
            r3.mo21446c(r2, r5, r6)
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 2131433190(0x7f0b16e6, float:1.8488159E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f45588h = r2
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r3 = r0.f45585e
            r5 = 105766(0x19d26, float:1.4821E-40)
            r6 = 2363(0x93b, float:3.311E-42)
            r3.mo21446c(r2, r5, r6)
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 2131433192(0x7f0b16e8, float:1.8488163E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f45589i = r2
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 2131433189(0x7f0b16e5, float:1.8488157E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f45590j = r2
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 2131433188(0x7f0b16e4, float:1.8488155E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f45591k = r2
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 2131430274(0x7f0b0b82, float:1.8482244E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f45592l = r2
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r3 = r0.f45585e
            r5 = 110327(0x1aef7, float:1.54601E-40)
            r3.mo21444a(r2, r5)
            android.widget.ImageView r2 = r0.f45592l
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r3 = r0.f45585e
            com.google.android.libraries.assistant.auto.tng.morris.g.d.av r5 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.av
            r5.<init>(r0)
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.android.libraries.assistant.auto.tng.morris.c.bc r7 = new com.google.android.libraries.assistant.auto.tng.morris.c.bc
            r7.<init>(r3, r6, r5)
            r2.setOnClickListener(r7)
        L_0x00da:
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r0.f45594n
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0217
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r0.f45594n
            r3 = 158549(0x26b55, float:2.22174E-40)
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = r2.f44057a
            java.lang.String r5 = r1.f44057a
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0103
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r0.f45594n
            r2.getClass()
            java.lang.String r2 = r2.f44058b
            java.lang.String r5 = r1.f44058b
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0103
            goto L_0x0136
        L_0x0103:
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r2 = r0.f45585e
            android.widget.ImageView r5 = r0.f45591k
            r5.getClass()
            r2.mo21444a(r5, r3)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r2 = r0.f45585e
            android.widget.ImageView r5 = r0.f45591k
            r5.getClass()
            r2.mo21447d(r5)
        L_0x0117:
            java.lang.String r2 = r1.f44057a
            java.lang.String r5 = r1.f44058b
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r6 = r0.f45584d
            android.widget.ImageView r7 = r0.f45591k
            r7.getClass()
            r6.mo22221k(r7, r2, r5)
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r6 = r0.f45585e
            android.widget.ImageView r7 = r0.f45591k
            r7.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r8 = r0.f45584d
            r9 = 4
            com.google.android.libraries.logging.ve.e r2 = r8.mo22223m(r2, r5, r9)
            r6.mo21445b(r7, r3, r2)
        L_0x0136:
            android.widget.TextView r2 = r0.f45589i
            r2.getClass()
            java.lang.String r3 = r1.f44060d
            r2.setText(r3)
            android.widget.TextView r2 = r0.f45590j
            r2.getClass()
            java.lang.String r3 = r1.f44059c
            r2.setText(r3)
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            android.content.Context r3 = r0.f45582a
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r1.f44060d
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = r1.f44059c
            r5[r4] = r6
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r6 = r0.f45584d
            java.lang.String r8 = r1.f44057a
            java.lang.String r9 = r1.f44058b
            java.lang.String r6 = r6.mo22216f(r8, r9)
            r8 = 2
            r5[r8] = r6
            r6 = 2132089344(0x7f151a00, float:1.9818997E38)
            java.lang.String r3 = r3.getString(r6, r5)
            r2.setContentDescription(r3)
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r0.f45594n
            if (r2 == 0) goto L_0x018f
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = r1.f44061e
            if (r2 != 0) goto L_0x017e
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x017e:
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r3 = r0.f45594n
            r3.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r3 = r3.f44061e
            if (r3 != 0) goto L_0x0189
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x0189:
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01ae
        L_0x018f:
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r8 = r0.f45584d
            android.widget.ImageView r9 = r0.f45587g
            r9.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = r1.f44061e
            if (r2 != 0) goto L_0x019c
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x019c:
            r10 = r2
            java.lang.String r11 = r1.f44057a
            java.lang.String r12 = r1.f44058b
            com.google.common.b.hd r13 = f45581c
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r14 = r0.f45583b
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r15 = r0.f45585e
            com.google.android.libraries.assistant.auto.tng.morris.c.v r2 = r0.f45586f
            r16 = r2
            r8.mo22218h(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x01ae:
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r2 = r0.f45594n
            if (r2 == 0) goto L_0x01c4
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r3 = r1.f44064h
            if (r3 != 0) goto L_0x01b8
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x01b8:
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = r2.f44064h
            if (r2 != 0) goto L_0x01be
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x01be:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x01e3
        L_0x01c4:
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r8 = r0.f45584d
            android.widget.ImageView r9 = r0.f45588h
            r9.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = r1.f44064h
            if (r2 != 0) goto L_0x01d1
            com.google.android.libraries.assistant.auto.tng.morris.e.dp r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp.f43215f
        L_0x01d1:
            r10 = r2
            java.lang.String r11 = r1.f44057a
            java.lang.String r12 = r1.f44058b
            com.google.common.b.hd r13 = f45581c
            com.google.android.libraries.assistant.auto.tng.morris.framework.h r14 = r0.f45583b
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r15 = r0.f45585e
            com.google.android.libraries.assistant.auto.tng.morris.c.v r2 = r0.f45586f
            r16 = r2
            r8.mo22218h(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x01e3:
            android.widget.ImageView r2 = r0.f45592l
            r2.getClass()
            boolean r3 = r1.f44063g
            if (r4 == r3) goto L_0x01ee
            r7 = 8
        L_0x01ee:
            r2.setVisibility(r7)
            boolean r2 = r1.f44063g
            if (r2 == 0) goto L_0x020c
            com.google.android.libraries.assistant.auto.tng.morris.g.d.ax r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.d.ax
            r2.<init>(r0)
            android.view.ViewGroup r3 = r0.f45593m
            r3.getClass()
            com.google.android.libraries.assistant.auto.tng.morris.c.n r4 = new com.google.android.libraries.assistant.auto.tng.morris.c.n
            android.content.Context r5 = r0.f45582a
            com.google.android.libraries.assistant.auto.tng.morris.c.bf r6 = r0.f45585e
            r4.<init>(r5, r6, r2)
            r3.setOnTouchListener(r4)
            goto L_0x0215
        L_0x020c:
            android.view.ViewGroup r2 = r0.f45593m
            r2.getClass()
            r3 = 0
            r2.setOnTouchListener(r3)
        L_0x0215:
            r0.f45594n = r1
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15188ay.mo22065a(com.google.android.libraries.assistant.auto.tng.morris.e.oe, android.view.ViewGroup, android.view.ContextThemeWrapper):void");
    }
}
