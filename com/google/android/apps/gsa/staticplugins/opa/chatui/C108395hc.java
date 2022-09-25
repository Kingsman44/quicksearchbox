package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.material.chip.Chip;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hc */
/* compiled from: PG */
public final class C108395hc {

    /* renamed from: g */
    private static final C59071e f301487g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.hc");

    /* renamed from: a */
    public final List f301488a;

    /* renamed from: b */
    public final List f301489b;

    /* renamed from: c */
    public final C108226ax f301490c;

    /* renamed from: d */
    public C108237bh f301491d;

    /* renamed from: e */
    public String f301492e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f301493f;

    /* renamed from: h */
    private final Activity f301494h;

    /* renamed from: i */
    private final ContextThemeWrapper f301495i;

    /* renamed from: j */
    private final LayoutInflater f301496j;

    /* renamed from: k */
    private final C22871g f301497k;

    /* renamed from: l */
    private final C58833ax f301498l;

    /* renamed from: m */
    private final boolean f301499m;

    /* renamed from: n */
    private final boolean f301500n;

    public C108395hc(C108237bh bhVar, C108226ax axVar, Activity activity, C86124t tVar, C104149a aVar, C22871g gVar, C58833ax axVar2) {
        this.f301491d = bhVar;
        this.f301490c = axVar;
        this.f301494h = activity;
        ContextThemeWrapper a = C108435ip.m180256a(aVar, activity);
        this.f301495i = a;
        this.f301496j = LayoutInflater.from(a);
        this.f301497k = gVar;
        this.f301498l = axVar2;
        this.f301488a = new ArrayList();
        this.f301489b = new ArrayList();
        this.f301499m = aVar.mo93971b();
        this.f301500n = tVar.mo79746e(C90029ch.f248225aL);
    }

    /* renamed from: f */
    private static C28293k m180170f(C28292j jVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C108400hh hhVar = (C108400hh) it.next();
            int b = hhVar.mo96841b();
            int i2 = b - 1;
            C28292j jVar2 = null;
            if (b != 0) {
                if (i2 != 0) {
                    if (i2 == 1) {
                        jVar2 = new C28292j(137500);
                    } else if (i2 == 2) {
                        jVar2 = hhVar.mo96843d().f301597d;
                    }
                }
                if (jVar2 != null) {
                    aqp aqp = jVar2.f76974b;
                    aqp.copyOnWrite();
                    aqs aqs = (aqs) aqp.instance;
                    aqs aqs2 = aqs.f159780k;
                    aqs.f159782a = 2 | aqs.f159782a;
                    aqs.f159784c = i;
                    arrayList.add(C28293k.m52908e(jVar2, new C28293k[0]));
                    i++;
                }
            } else {
                throw null;
            }
        }
        return C28293k.m52907d(jVar, arrayList);
    }

    /* renamed from: g */
    private final void m180171g(ViewGroup viewGroup, int i) {
        View view;
        if (this.f301499m) {
            view = new Chip(this.f301495i);
        } else {
            view = new TextView(this.f301495i, (AttributeSet) null, 0, this.f301491d.mo96641N());
        }
        view.setClickable(false);
        view.setFocusable(false);
        view.setLayoutParams(new LinearLayout.LayoutParams(i, (int) C91115n.m148870b(40.0f, this.f301495i)));
        viewGroup.addView(view);
    }

    /* renamed from: a */
    public final int mo96835a() {
        return this.f301489b.size();
    }

    /* renamed from: b */
    public final C28293k mo96836b(boolean z) {
        if (z) {
            return m180170f(new C28292j(137448), this.f301488a);
        }
        return m180170f(new C28292j(141563), this.f301489b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.android.material.chip.Chip} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: com.google.android.material.chip.Chip} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.google.android.material.chip.Chip} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: com.google.android.material.chip.Chip} */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.Throwable, android.util.AttributeSet] */
    /* JADX WARNING: type inference failed for: r3v11, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96837c(android.view.ViewGroup r24, boolean r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            if (r25 == 0) goto L_0x0009
            java.util.List r2 = r0.f301488a
            goto L_0x000b
        L_0x0009:
            java.util.List r2 = r0.f301489b
        L_0x000b:
            boolean r3 = r2.isEmpty()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0016
            goto L_0x0352
        L_0x0016:
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r7 = r3
        L_0x001c:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0352
            java.lang.Object r8 = r2.next()
            com.google.android.apps.gsa.staticplugins.opa.chatui.hh r8 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108400hh) r8
            int r9 = r8.mo96841b()
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x0351
            if (r10 == 0) goto L_0x0329
            java.lang.String r9 = "RichSuggestCtrl"
            if (r10 == r5) goto L_0x02a4
            if (r10 == r4) goto L_0x003a
            goto L_0x0324
        L_0x003a:
            if (r7 != 0) goto L_0x0050
            com.google.common.f.e r8 = f301487g
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r9)
            java.lang.String r9 = "No section view found for suggestion chip"
            r10 = 24029(0x5ddd, float:3.3672E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            goto L_0x0324
        L_0x0050:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ik r8 = r8.mo96843d()
            boolean r10 = r8.f301614u
            if (r10 == 0) goto L_0x006c
            com.google.common.f.e r8 = f301487g
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r9)
            java.lang.String r9 = "Suggestion chip is repressed."
            r10 = 24028(0x5ddc, float:3.367E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            goto L_0x0324
        L_0x006c:
            r9 = 2131436274(0x7f0b22f2, float:1.8494414E38)
            android.view.View r9 = r7.findViewById(r9)
            com.google.android.material.chip.ChipGroup r9 = (com.google.android.material.chip.ChipGroup) r9
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.view.ContextThemeWrapper r11 = r0.f301495i
            r10.<init>(r11)
            r10.setOrientation(r6)
            r11 = 17
            r10.setGravity(r11)
            boolean r12 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt
            if (r12 == 0) goto L_0x0094
            r13 = r8
            com.google.android.apps.gsa.staticplugins.opa.chatui.bt r13 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt) r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.bs r13 = r13.f301136a
            boolean r13 = r13.mo96699a()
            if (r13 == 0) goto L_0x0094
            goto L_0x009f
        L_0x0094:
            boolean r13 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108344ff
            if (r13 != 0) goto L_0x009f
            java.lang.String r13 = r8.mo96708f()
            android.text.TextUtils.isEmpty(r13)
        L_0x009f:
            boolean r13 = r0.f301499m
            if (r13 == 0) goto L_0x00c9
            android.view.LayoutInflater r13 = r0.f301496j
            r14 = 2131625886(0x7f0e079e, float:1.8878993E38)
            android.view.View r13 = r13.inflate(r14, r10, r6)
            com.google.android.material.chip.Chip r13 = (com.google.android.material.chip.Chip) r13
            java.lang.String r14 = r8.mo96708f()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x00dc
            android.app.Activity r14 = r0.f301494h
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131166734(0x7f07060e, float:1.7947722E38)
            int r14 = r14.getDimensionPixelSize(r15)
            com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id.m180228f(r13, r14)
            goto L_0x00dc
        L_0x00c9:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r13 = r0.f301491d
            int r13 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id.m180227a(r8, r13)
            android.widget.TextView r14 = new android.widget.TextView
            android.view.ContextThemeWrapper r15 = r0.f301495i
            r14.<init>(r15, r3, r6, r13)
            r13 = 1098907648(0x41800000, float:16.0)
            r14.setTextSize(r13)
            r13 = r14
        L_0x00dc:
            boolean r14 = r8.f301615v
            if (r14 == 0) goto L_0x00e8
            com.google.android.libraries.logging.j r8 = r8.f301597d
            com.google.android.libraries.logging.C28295m.m52919e(r13, r8)
            r11 = -2
            goto L_0x028b
        L_0x00e8:
            java.lang.String r14 = r8.mo96708f()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x00ff
            java.lang.String r14 = r8.f301601h
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x00ff
            java.lang.String r14 = r8.f301601h
            r13.setContentDescription(r14)
        L_0x00ff:
            android.app.Activity r14 = r0.f301494h
            android.content.res.Resources r14 = r14.getResources()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r15 = r0.f301491d
            int r15 = r15.mo96637J()
            int r14 = r14.getDimensionPixelSize(r15)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r15 = r0.f301491d
            com.google.common.base.ax r15 = r15.mo96653Z()
            java.lang.String r4 = r8.mo96708f()
            r13.setText(r4)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r0.f301491d
            int r4 = r4.mo96636I()
            float r4 = (float) r4
            r13.setElevation(r4)
            boolean r4 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108431il
            if (r4 == 0) goto L_0x014d
            r4 = r8
            com.google.android.apps.gsa.staticplugins.opa.chatui.il r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108431il) r4
            com.google.common.util.concurrent.cx r12 = r4.f301623c
            com.google.android.apps.gsa.shared.y.au r4 = r4.f301620B
            if (r12 == 0) goto L_0x014b
            if (r4 == 0) goto L_0x014b
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r3 = r0.f301491d
            r21 = 0
            r22 = 0
            r19 = r15
            r11 = -2
            r15 = r13
            r16 = r12
            r17 = r4
            r18 = r14
            r20 = r3
            com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id.m180230l(r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x019c
        L_0x014b:
            r11 = -2
            goto L_0x019c
        L_0x014d:
            r19 = r15
            r11 = -2
            if (r12 == 0) goto L_0x0161
            r3 = r8
            com.google.android.apps.gsa.staticplugins.opa.chatui.bt r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt) r3
            android.graphics.drawable.Drawable r3 = r3.f301137b
            if (r3 == 0) goto L_0x019c
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r0.f301491d
            r12 = r19
            com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id.m180229k(r13, r3, r14, r12, r4)
            goto L_0x019c
        L_0x0161:
            r12 = r19
            boolean r3 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108344ff
            if (r3 == 0) goto L_0x019c
            r3 = r8
            com.google.android.apps.gsa.staticplugins.opa.chatui.ff r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108344ff) r3
            android.graphics.drawable.Drawable r3 = r3.mo96804a()
            if (r3 == 0) goto L_0x0175
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r4 = r0.f301491d
            com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id.m180229k(r13, r3, r14, r12, r4)
        L_0x0175:
            boolean r3 = r0.f301499m
            if (r3 == 0) goto L_0x0189
            android.app.Activity r3 = r0.f301494h
            r4 = 2130969125(0x7f040225, float:1.7546923E38)
            int r3 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r3, r4)
            j$.util.OptionalInt r3 = p3186j$.util.OptionalInt.m71640of(r3)
            r8.f301607n = r3
            goto L_0x019c
        L_0x0189:
            android.app.Activity r3 = r0.f301494h
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100236(0x7f06024c, float:1.7812848E38)
            int r3 = r3.getColor(r4)
            j$.util.OptionalInt r3 = p3186j$.util.OptionalInt.m71640of(r3)
            r8.f301607n = r3
        L_0x019c:
            boolean r3 = r0.f301499m
            if (r5 == r3) goto L_0x01a2
            r3 = r10
            goto L_0x01a3
        L_0x01a2:
            r3 = r13
        L_0x01a3:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ha r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ha
            r4.<init>(r0, r8)
            r3.setOnClickListener(r4)
            com.google.android.apps.gsa.staticplugins.opa.chatui.hb r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.hb
            r4.<init>(r0, r8)
            r3.setOnLongClickListener(r4)
            j$.util.OptionalInt r3 = r8.f301607n
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x01c4
            j$.util.OptionalInt r3 = r8.f301607n
            int r3 = r3.getAsInt()
            r13.setTextColor(r3)
        L_0x01c4:
            j$.util.OptionalInt r3 = r8.f301608o
            boolean r3 = r3.isPresent()
            if (r3 != 0) goto L_0x01d4
            j$.util.OptionalInt r3 = r8.f301609p
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x0279
        L_0x01d4:
            boolean r3 = r0.f301499m
            r4 = 2131166609(0x7f070591, float:1.7947468E38)
            if (r3 == 0) goto L_0x021e
            j$.util.OptionalInt r3 = r8.f301608o
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x01f3
            r3 = r13
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            j$.util.OptionalInt r12 = r8.f301608o
            int r12 = r12.getAsInt()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r3.mo47684o(r12)
        L_0x01f3:
            j$.util.OptionalInt r3 = r8.f301609p
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x0279
            r3 = r13
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            android.app.Activity r12 = r0.f301494h
            android.content.res.Resources r12 = r12.getResources()
            int r4 = r12.getDimensionPixelSize(r4)
            float r4 = (float) r4
            com.google.android.material.chip.f r12 = r3.f116093d
            if (r12 == 0) goto L_0x0210
            r12.mo47776s(r4)
        L_0x0210:
            j$.util.OptionalInt r4 = r8.f301609p
            int r4 = r4.getAsInt()
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r3.mo47721v(r4)
            goto L_0x0279
        L_0x021e:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r3.setShape(r6)
            android.app.Activity r12 = r0.f301494h
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131166606(0x7f07058e, float:1.7947462E38)
            int r12 = r12.getDimensionPixelSize(r14)
            float r12 = (float) r12
            r3.setCornerRadius(r12)
            j$.util.OptionalInt r12 = r8.f301608o
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x0248
            j$.util.OptionalInt r12 = r8.f301608o
            int r12 = r12.getAsInt()
            r3.setColor(r12)
        L_0x0248:
            j$.util.OptionalInt r12 = r8.f301609p
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x0263
            android.app.Activity r12 = r0.f301494h
            android.content.res.Resources r12 = r12.getResources()
            int r4 = r12.getDimensionPixelSize(r4)
            j$.util.OptionalInt r12 = r8.f301609p
            int r12 = r12.getAsInt()
            r3.setStroke(r4, r12)
        L_0x0263:
            int r4 = r13.getPaddingLeft()
            int r12 = r13.getPaddingRight()
            int r14 = r13.getPaddingTop()
            int r15 = r13.getPaddingBottom()
            r13.setBackground(r3)
            r13.setPadding(r4, r14, r12, r15)
        L_0x0279:
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r11, r11)
            r13.setLayoutParams(r3)
            r3 = 17
            r13.setGravity(r3)
            com.google.android.libraries.logging.j r3 = r8.f301597d
            com.google.android.libraries.logging.C28295m.m52919e(r13, r3)
        L_0x028b:
            r10.addView(r13)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1111490560(0x42400000, float:48.0)
            android.view.ContextThemeWrapper r8 = r0.f301495i
            float r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r4, r8)
            int r4 = (int) r4
            r3.<init>(r11, r4)
            r10.setLayoutParams(r3)
            r9.addView(r10)
            goto L_0x0324
        L_0x02a4:
            if (r7 != 0) goto L_0x02b9
            com.google.common.f.e r3 = f301487g
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r9)
            java.lang.String r4 = "No section view found for rich suggestion"
            r8 = 24027(0x5ddb, float:3.3669E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56386p(r4)
            goto L_0x0324
        L_0x02b9:
            r3 = 2131435376(0x7f0b1f70, float:1.8492592E38)
            android.view.View r3 = r7.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.LayoutInflater r4 = r0.f301496j
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r9 = r0.f301491d
            int r9 = r9.mo96659b()
            android.view.View r4 = r4.inflate(r9, r7, r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r15 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ka
            android.app.Activity r10 = r0.f301494h
            com.google.android.libraries.gsa.k.g r13 = r0.f301497k
            com.google.at.h.b.a.r r14 = r8.mo96840a()
            com.google.common.base.b r16 = com.google.common.base.C58836b.f156633a
            com.google.android.apps.gsa.staticplugins.opa.s.b.a r9 = new com.google.android.apps.gsa.staticplugins.opa.s.b.a
            r9.<init>()
            java.lang.String r11 = r0.f301492e
            r9.f306452b = r11
            r11 = 0
            r12 = 0
            com.google.android.apps.gsa.staticplugins.opa.s.b.f r17 = r9.mo98278a()
            r9 = r15
            r5 = r15
            r15 = r16
            r16 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            com.google.common.base.ax r9 = r0.f301498l
            java.lang.Object r9 = r9.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.s.b.d r9 = (com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109990d) r9
            com.google.at.h.b.a.r r8 = r8.mo96840a()
            com.google.android.apps.gsa.staticplugins.opa.s.b.c r8 = r9.mo98287a(r8)
            r5.f301719c = r8
            r5.f301721e = r6
            r8 = 2131429636(0x7f0b0904, float:1.848095E38)
            android.view.View r8 = r4.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r9 = r8.getPaddingLeft()
            int r10 = r8.getPaddingRight()
            r8.setPadding(r9, r6, r10, r6)
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r9 = r0.f301491d
            r5.mo96900e(r8, r9)
            r3.addView(r4)
        L_0x0324:
            r3 = 0
            r4 = 2
            r5 = 1
            goto L_0x001c
        L_0x0329:
            android.view.LayoutInflater r3 = r0.f301496j
            r4 = 2131626260(0x7f0e0914, float:1.8879751E38)
            android.view.View r3 = r3.inflate(r4, r1, r6)
            r7 = r3
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r1.addView(r7)
            r3 = 2131436308(0x7f0b2314, float:1.8494483E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = r8.mo96842c()
            r3.setText(r4)
            com.google.android.apps.gsa.staticplugins.opa.chatui.gz r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.gz
            r4.<init>(r0)
            r3.setOnClickListener(r4)
            goto L_0x0324
        L_0x0351:
            throw r3
        L_0x0352:
            boolean r2 = r0.f301500n
            if (r2 == 0) goto L_0x03f0
            if (r25 == 0) goto L_0x03f0
            java.util.List r2 = r0.f301488a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x03f0
            java.util.List r2 = r0.f301489b
            int r2 = r2.size()
            java.util.List r3 = r0.f301488a
            int r3 = r3.size()
            if (r2 <= r3) goto L_0x03f0
            java.util.List r2 = r0.f301488a
            java.util.Iterator r2 = r2.iterator()
        L_0x0374:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0389
            java.lang.Object r3 = r2.next()
            com.google.android.apps.gsa.staticplugins.opa.chatui.hh r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108400hh) r3
            int r3 = r3.mo96841b()
            r4 = 2
            if (r3 != r4) goto L_0x0374
            r2 = 1
            goto L_0x038a
        L_0x0389:
            r2 = 0
        L_0x038a:
            com.google.android.material.chip.ChipGroup r3 = new com.google.android.material.chip.ChipGroup
            android.view.ContextThemeWrapper r4 = r0.f301495i
            r3.<init>(r4)
            r4 = 1
            if (r4 == r2) goto L_0x0397
            r4 = 1094713344(0x41400000, float:12.0)
            goto L_0x0399
        L_0x0397:
            r4 = 1088421888(0x40e00000, float:7.0)
        L_0x0399:
            android.view.ContextThemeWrapper r5 = r0.f301495i
            float r4 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r4, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            int r4 = (int) r4
            r7 = -1
            r5.<init>(r7, r4)
            android.app.Activity r4 = r0.f301494h
            android.content.res.Resources r4 = r4.getResources()
            r8 = 2131166677(0x7f0705d5, float:1.7947606E38)
            int r4 = r4.getDimensionPixelSize(r8)
            r8 = 1
            if (r8 == r2) goto L_0x03b9
            r9 = 1090519040(0x41000000, float:8.0)
            goto L_0x03ba
        L_0x03b9:
            r9 = 0
        L_0x03ba:
            android.view.ContextThemeWrapper r10 = r0.f301495i
            float r9 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r9, r10)
            int r9 = (int) r9
            r5.setMargins(r4, r9, r4, r6)
            r3.setLayoutParams(r5)
            r3.f116687f = r8
            r3.setClickable(r6)
            r3.setFocusable(r6)
            if (r2 == 0) goto L_0x03d5
            r0.m180171g(r3, r7)
            goto L_0x03ed
        L_0x03d5:
            r2 = 1123024896(0x42f00000, float:120.0)
            android.view.ContextThemeWrapper r4 = r0.f301495i
            float r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r2, r4)
            int r2 = (int) r2
            r0.m180171g(r3, r2)
            r2 = 1125515264(0x43160000, float:150.0)
            android.view.ContextThemeWrapper r4 = r0.f301495i
            float r2 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r2, r4)
            int r2 = (int) r2
            r0.m180171g(r3, r2)
        L_0x03ed:
            r1.addView(r3)
        L_0x03f0:
            java.lang.String r1 = r0.f301492e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0409
            com.google.android.apps.gsa.staticplugins.opa.chatui.ax r1 = r0.f301490c
            long r2 = r0.f301493f
            java.lang.String r4 = r0.f301492e
            com.google.android.libraries.gsa.conversation.h.u r4 = com.google.android.libraries.gsa.conversation.p1855h.C22704h.m42283b(r4)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            r1.mo96390c(r2, r4)
        L_0x0409:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108395hc.mo96837c(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: d */
    public final void mo96838d() {
        this.f301488a.clear();
        this.f301490c.mo96388a();
    }

    /* renamed from: e */
    public final void mo96839e() {
        this.f301489b.clear();
        this.f301490c.mo96404q();
    }
}
