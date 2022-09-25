package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.p060c.C0977g;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116161ad;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116182k;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116185n;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116186o;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116187p;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116190s;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116018a;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116023f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.p576aq.C10485ab;
import com.google.android.libraries.p576aq.C10558u;
import com.google.android.libraries.p576aq.C10563z;
import com.google.android.libraries.p576aq.p578b.C10503aj;
import com.google.android.libraries.p576aq.p578b.C10504ak;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class RecentlyView extends ViewGroup {

    /* renamed from: a */
    public static final Property f322190a = C10503aj.m25470a(Integer.class, "scrollTo", C116230v.f322306a, C116231w.f322307a);

    /* renamed from: b */
    public static final Property f322191b = C10503aj.m25470a(Integer.class, "jumpTo", C116232x.f322308a, C116233y.f322309a);

    /* renamed from: A */
    public C116161ad f322192A;

    /* renamed from: B */
    public C116186o f322193B;

    /* renamed from: C */
    public C116187p f322194C;

    /* renamed from: D */
    public C116182k f322195D;

    /* renamed from: E */
    public C116208ae f322196E;

    /* renamed from: F */
    public C116190s f322197F;

    /* renamed from: G */
    private final int f322198G;

    /* renamed from: H */
    private float f322199H;

    /* renamed from: I */
    private float f322200I;

    /* renamed from: J */
    private float f322201J;

    /* renamed from: K */
    private float f322202K;

    /* renamed from: L */
    private VelocityTracker f322203L;

    /* renamed from: M */
    private ScaleGestureDetector f322204M;

    /* renamed from: N */
    private C116226r f322205N;

    /* renamed from: O */
    private C116214f f322206O;

    /* renamed from: P */
    private boolean f322207P;

    /* renamed from: Q */
    private boolean f322208Q;

    /* renamed from: R */
    private int f322209R;

    /* renamed from: S */
    private int f322210S;

    /* renamed from: T */
    private boolean f322211T;

    /* renamed from: U */
    private int f322212U;

    /* renamed from: V */
    private boolean f322213V;

    /* renamed from: W */
    private C116207ad f322214W;

    /* renamed from: c */
    public C58485gu f322215c = C58485gu.m89845m();

    /* renamed from: d */
    public C58485gu f322216d = C58485gu.m89845m();

    /* renamed from: e */
    public int f322217e;

    /* renamed from: f */
    public int f322218f;

    /* renamed from: g */
    public int f322219g;

    /* renamed from: h */
    public int f322220h;

    /* renamed from: i */
    public int f322221i;

    /* renamed from: j */
    public int f322222j;

    /* renamed from: k */
    public final Deque f322223k = new ArrayDeque();

    /* renamed from: l */
    public final Map f322224l = new C0977g();

    /* renamed from: m */
    public final C147446j f322225m;

    /* renamed from: n */
    public C116203a f322226n;

    /* renamed from: o */
    public final C10558u f322227o;

    /* renamed from: p */
    public final C10558u f322228p;

    /* renamed from: q */
    public final C10563z f322229q;

    /* renamed from: r */
    public C116226r f322230r;

    /* renamed from: s */
    public final C10558u f322231s;

    /* renamed from: t */
    public boolean f322232t;

    /* renamed from: u */
    public final List f322233u;

    /* renamed from: v */
    public Bundle f322234v;

    /* renamed from: w */
    public int f322235w = -1;

    /* renamed from: x */
    public int f322236x = -1;

    /* renamed from: y */
    public boolean f322237y;

    /* renamed from: z */
    public C116185n f322238z;

    public RecentlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
        this.f322198G = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        C147446j jVar = new C147446j(0.0f);
        jVar.f397996b = new C147454r(200.0f, 0.8f);
        this.f322225m = jVar;
        this.f322233u = new ArrayList();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C10485ab a = C10485ab.m25462a("RecentlyView");
        a.mo18522d();
        C10558u j = C10563z.m25518j(false);
        this.f322227o = j;
        C10558u j2 = C10563z.m25518j(false);
        this.f322228p = j2;
        C10558u j3 = C10563z.m25518j(false);
        this.f322231s = j3;
        this.f322229q = C10563z.m25517i(new C10504ak(new C10563z[]{j, j2, j3}));
        a.mo18521c();
    }

    /* renamed from: A */
    private final void m192678A(C116226r rVar) {
        mo102594q();
        rVar.mo102618i();
        C116182k kVar = this.f322195D;
        if (kVar != null) {
            int i = rVar.f322281b;
            C116129b bVar = kVar.f322152a;
            Bundle bundle = new Bundle();
            bundle.putInt("groupIndex", Integer.valueOf(i).intValue());
            ((C116130c) bVar).f322041a.mo28345s("onGroupDetached_int", "RecentlyEventsDispatcher", bundle);
        }
    }

    /* renamed from: B */
    private final void m192679B() {
        VelocityTracker velocityTracker = this.f322203L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f322203L = null;
        }
        this.f322227o.mo18619f(false);
        this.f322228p.mo18619f(false);
        this.f322207P = false;
        this.f322205N = null;
        this.f322206O = null;
    }

    /* renamed from: C */
    private final void m192680C(MotionEvent motionEvent, float f, float f2) {
        int pointerCount = motionEvent.getPointerCount() - 2;
        float x = motionEvent.getX(pointerCount);
        float y = motionEvent.getY(pointerCount);
        this.f322201J += f - x;
        this.f322202K += f2 - y;
    }

    /* renamed from: D */
    private final void m192681D(C116226r rVar, C116214f fVar, View view) {
        m192682E(view, m192697u(rVar.f322291l + fVar.f322261j + fVar.f322262k), getPaddingTop() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin);
    }

    /* renamed from: E */
    private static void m192682E(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0237, code lost:
        r13 = com.google.android.googlequicksearchbox.R.style.recent_title_normal;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06ca A[LOOP:12: B:261:0x06c4->B:263:0x06ca, LOOP_END] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m192683F() {
        /*
            r25 = this;
            r0 = r25
            boolean r1 = r0.f322213V
            if (r1 == 0) goto L_0x0730
            com.google.android.apps.gsa.staticplugins.recently.monet.ui.n r1 = r0.f322238z
            if (r1 == 0) goto L_0x0730
            com.google.android.apps.gsa.staticplugins.recently.monet.ui.ai r1 = r1.f322156a
            com.google.android.apps.gsa.staticplugins.recently.monet.shared.e r2 = r1.f322099a
            com.google.android.libraries.gsa.monet.tools.model.shared.b r2 = r2.mo102513l()
            com.google.android.libraries.gsa.monet.tools.model.shared.a.a r2 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a) r2
            java.lang.Object r2 = r2.mo28725a()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r3 = r2.mo56113h()
            r4 = 0
            if (r3 == 0) goto L_0x0724
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline r2 = (com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline) r2
            com.google.android.apps.gsa.staticplugins.recently.h.d r3 = r1.f322105g
            r5 = 4
            r6 = 1
            if (r3 == 0) goto L_0x0164
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.TimelineView r7 = r3.f321926a
            java.util.List r7 = r7.f322312b
            com.google.common.b.gu r8 = r0.f322216d
            int r9 = r8.size()
            java.lang.String r10 = ""
            r11 = 0
            r12 = 0
        L_0x003b:
            if (r11 < r9) goto L_0x00b1
        L_0x003d:
            int r8 = r7.size()
            if (r8 <= r12) goto L_0x004d
            int r8 = r7.size()
            int r8 = r8 + -1
            r7.remove(r8)
            goto L_0x003d
        L_0x004d:
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.TimelineView r3 = r3.f321926a
            java.util.List r7 = r3.f322312b
            int r7 = r7.size()
        L_0x0055:
            int r8 = r3.getChildCount()
            if (r7 <= r8) goto L_0x0069
            android.content.Context r8 = r3.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r9 = r3.f322313c
            r8.inflate(r9, r3, r6)
            goto L_0x0055
        L_0x0069:
            r7 = 0
        L_0x006a:
            int r8 = r3.getChildCount()
            if (r7 >= r8) goto L_0x00a3
            android.view.View r8 = r3.getChildAt(r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.util.List r9 = r3.f322312b
            int r9 = r9.size()
            if (r7 >= r9) goto L_0x009d
            java.util.List r9 = r3.f322312b
            java.lang.Object r9 = r9.get(r7)
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.a r9 = (com.google.android.apps.gsa.staticplugins.recently.view.timeline.C116235a) r9
            java.lang.String r9 = r9.f322316a
            java.lang.CharSequence r10 = r8.getText()
            java.lang.String r10 = r10.toString()
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x0099
            r8.setText(r9)
        L_0x0099:
            r8.setVisibility(r4)
            goto L_0x00a0
        L_0x009d:
            r8.setVisibility(r5)
        L_0x00a0:
            int r7 = r7 + 1
            goto L_0x006a
        L_0x00a3:
            r3.invalidate()
            boolean r7 = r3.isLayoutRequested()
            if (r7 != 0) goto L_0x0164
            r3.mo102629a()
            goto L_0x0164
        L_0x00b1:
            java.lang.Object r13 = r8.get(r11)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r13 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r13
            int r14 = r13.f322281b
            boolean r14 = com.google.android.apps.gsa.staticplugins.recently.p8685h.C116097d.m192508b(r2, r14)
            if (r14 == 0) goto L_0x00c1
            goto L_0x015f
        L_0x00c1:
            int r14 = r13.f322281b
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r15 = r2.f322178a
            r14 = r15[r14]
            java.lang.String r14 = r14.f322171b
            boolean r15 = r14.equals(r10)
            if (r15 != 0) goto L_0x010a
            int r10 = r7.size()
            if (r10 < r12) goto L_0x00dd
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.a r10 = new com.google.android.apps.gsa.staticplugins.recently.view.timeline.a
            r10.<init>()
            r7.add(r10)
        L_0x00dd:
            java.lang.Object r10 = r7.get(r12)
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.a r10 = (com.google.android.apps.gsa.staticplugins.recently.view.timeline.C116235a) r10
            r10.f322316a = r14
            int r15 = r13.f322281b
            if (r15 != 0) goto L_0x00ee
            int r15 = r13.mo102612c()
            goto L_0x0103
        L_0x00ee:
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r5 = r2.f322178a
            int r15 = r15 + -1
            r5 = r5[r15]
            java.lang.String r5 = r5.f322171b
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L_0x0101
            int r15 = r13.mo102612c()
            goto L_0x0103
        L_0x0101:
            int r15 = r13.f322292m
        L_0x0103:
            r10.f322317b = r15
            r10.f322319d = r4
            int r12 = r12 + 1
            r10 = r14
        L_0x010a:
            int r5 = r12 + -1
            java.lang.Object r5 = r7.get(r5)
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.a r5 = (com.google.android.apps.gsa.staticplugins.recently.view.timeline.C116235a) r5
            int r14 = r13.f322292m
            int r15 = r3.mo102487a(r13)
            int r14 = r14 + r15
            r5.f322318c = r14
            int r5 = r13.f322281b
            boolean r14 = com.google.android.apps.gsa.staticplugins.recently.p8685h.C116097d.m192508b(r2, r5)
            if (r14 != 0) goto L_0x012b
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r14 = r2.f322178a
            int r14 = r14.length
            int r14 = r14 + -1
            if (r5 != r14) goto L_0x012b
            goto L_0x013a
        L_0x012b:
            int r5 = r5 + 1
            boolean r14 = com.google.android.apps.gsa.staticplugins.recently.p8685h.C116097d.m192508b(r2, r5)
            if (r14 == 0) goto L_0x015f
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r14 = r2.f322178a
            int r14 = r14.length
            int r14 = r14 + -1
            if (r5 != r14) goto L_0x015f
        L_0x013a:
            int r5 = r7.size()
            if (r5 < r12) goto L_0x0148
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.a r5 = new com.google.android.apps.gsa.staticplugins.recently.view.timeline.a
            r5.<init>()
            r7.add(r5)
        L_0x0148:
            java.lang.Object r5 = r7.get(r12)
            com.google.android.apps.gsa.staticplugins.recently.view.timeline.a r5 = (com.google.android.apps.gsa.staticplugins.recently.view.timeline.C116235a) r5
            java.lang.String r14 = r3.f321927b
            r5.f322316a = r14
            int r14 = r13.f322292m
            int r13 = r3.mo102487a(r13)
            int r14 = r14 + r13
            r5.f322317b = r14
            r5.f322319d = r6
            int r12 = r12 + 1
        L_0x015f:
            int r11 = r11 + 1
            r5 = 4
            goto L_0x003b
        L_0x0164:
            com.google.android.apps.gsa.staticplugins.recently.h.c r3 = r1.f322106h
            if (r3 == 0) goto L_0x0658
            if (r2 == 0) goto L_0x0658
            android.widget.FrameLayout r5 = r3.f321912a
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L_0x0174
            goto L_0x0658
        L_0x0174:
            java.util.Set r5 = r3.f321921j
            r5.clear()
            java.util.Set r5 = r3.f321922k
            r5.clear()
            com.google.common.b.gu r5 = r0.f322216d
            int r7 = r5.size()
            r8 = 0
        L_0x0185:
            if (r8 >= r7) goto L_0x05a7
            java.lang.Object r9 = r5.get(r8)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r9 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r9
            int r10 = r9.f322281b
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r11 = r2.f322178a
            r10 = r11[r10]
            boolean r10 = r10.f322175f
            if (r10 != 0) goto L_0x019f
            r21 = r1
            r20 = r5
            r23 = r7
            goto L_0x0599
        L_0x019f:
            java.util.Map r10 = r3.f321915d
            java.lang.Object r10 = r10.get(r9)
            android.view.View r10 = (android.view.View) r10
            r12 = 13
            r13 = 2131432199(0x7f0b1307, float:1.8486149E38)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            if (r10 != 0) goto L_0x0261
            java.util.Deque r10 = r3.f321918g
            java.lang.Object r10 = r10.pollFirst()
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L_0x01cf
            android.widget.FrameLayout r10 = r3.f321912a
            android.content.Context r10 = r10.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r6 = 2131625502(0x7f0e061e, float:1.8878214E38)
            android.widget.FrameLayout r11 = r3.f321912a
            android.view.View r6 = r10.inflate(r6, r11, r4)
            r10 = r6
        L_0x01cf:
            r10.setVisibility(r4)
            r10.setAlpha(r14)
            r10.setTranslationX(r15)
            android.view.View r6 = r10.findViewById(r13)
            r6.setTranslationY(r15)
            r6 = 2131432186(0x7f0b12fa, float:1.8486122E38)
            android.view.View r6 = r10.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            int r11 = r9.f322281b
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r15 = r2.f322178a
            r11 = r15[r11]
            int r11 = r11.f322173d
            r6.setImageResource(r11)
            android.view.View r6 = r10.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r11 = r9.f322281b
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r15 = r2.f322178a
            r11 = r15[r11]
            java.lang.String r11 = r11.f322170a
            r6.setText(r11)
            r10.setContentDescription(r11)
            com.google.android.apps.gsa.staticplugins.recently.h.a r11 = new com.google.android.apps.gsa.staticplugins.recently.h.a
            r11.<init>(r3, r9)
            r10.setOnClickListener(r11)
            int r11 = r9.f322281b
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r15 = r2.f322178a
            r11 = r15[r11]
            com.google.android.apps.gsa.staticplugins.recently.timeline.b r15 = new com.google.android.apps.gsa.staticplugins.recently.timeline.b
            r15.<init>(r11)
        L_0x021a:
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x0244
            com.google.android.libraries.gsa.j.p r11 = r15.next()
            int r13 = r11.f62894c
            int r13 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r13)
            if (r13 != 0) goto L_0x022d
            goto L_0x022f
        L_0x022d:
            if (r13 == r12) goto L_0x0240
        L_0x022f:
            int r11 = r11.f62894c
            int r11 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r11)
            if (r11 != 0) goto L_0x023b
        L_0x0237:
            r13 = 2132152978(0x7f161292, float:1.9948062E38)
            goto L_0x0247
        L_0x023b:
            r13 = 12
            if (r11 == r13) goto L_0x0240
            goto L_0x0237
        L_0x0240:
            r13 = 2131432199(0x7f0b1307, float:1.8486149E38)
            goto L_0x021a
        L_0x0244:
            r13 = 2132152977(0x7f161291, float:1.994806E38)
        L_0x0247:
            r6.setTextAppearance(r13)
            android.widget.FrameLayout r6 = r3.f321912a
            r6.addView(r10)
            java.util.Map r6 = r3.f321915d
            r6.put(r9, r10)
            android.widget.FrameLayout r6 = r3.f321912a
            p3186j$.util.Objects.requireNonNull(r6)
            com.google.android.apps.gsa.staticplugins.recently.h.b r11 = new com.google.android.apps.gsa.staticplugins.recently.h.b
            r11.<init>(r6)
            r6.post(r11)
        L_0x0261:
            int r6 = r10.getWidth()
            int r11 = r9.mo102614e()
            int r13 = r6 / 2
            if (r11 >= r13) goto L_0x0272
            r13 = 4
            r10.setVisibility(r13)
            goto L_0x0283
        L_0x0272:
            r13 = 4
            int r15 = r10.getVisibility()
            if (r15 != r13) goto L_0x0283
            r10.setVisibility(r4)
            android.view.ViewPropertyAnimator r13 = r10.animate()
            r13.alpha(r14)
        L_0x0283:
            com.google.android.libraries.ad.j r13 = r9.f322290k
            float r13 = r13.mo124175a()
            r15 = 2131432199(0x7f0b1307, float:1.8486149E38)
            android.view.View r12 = r10.findViewById(r15)
            float r15 = com.google.android.apps.gsa.staticplugins.recently.p8685h.C116096c.m192503a(r13)
            float r15 = r3.mo102483b(r2, r9, r15)
            r12.setTranslationY(r15)
            int r12 = r9.mo102612c()
            boolean r15 = r3.f321914c
            if (r15 == 0) goto L_0x02da
            int r15 = r12 - r6
            android.widget.FrameLayout r4 = r3.f321912a
            int r4 = r4.getWidth()
            int r14 = r3.f321913b
            int r4 = r4 - r14
            int r4 = r4 - r6
            if (r15 <= r4) goto L_0x02d1
            com.google.common.b.gu r14 = r9.f322282c
            int r14 = r14.size()
            r20 = r5
            r5 = 1
            if (r14 <= r5) goto L_0x02d3
            r5 = 0
            int r14 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x02d3
            r5 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x02c9
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x02c9:
            float r5 = (float) r15
            int r4 = r4 - r15
            float r4 = (float) r4
            float r13 = r13 * r4
            float r5 = r5 + r13
            int r15 = (int) r5
            goto L_0x02d3
        L_0x02d1:
            r20 = r5
        L_0x02d3:
            int r12 = r12 - r11
            if (r15 >= r12) goto L_0x030b
            if (r11 <= r6) goto L_0x030b
            r15 = r12
            goto L_0x030b
        L_0x02da:
            r20 = r5
            int r4 = r3.f321913b
            if (r12 >= r4) goto L_0x0301
            com.google.common.b.gu r4 = r9.f322282c
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0301
            r4 = 0
            int r5 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0301
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f6
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x02f6:
            float r4 = (float) r12
            int r5 = r3.f321913b
            int r5 = r5 - r12
            float r5 = (float) r5
            float r13 = r13 * r5
            float r4 = r4 + r13
            int r4 = (int) r4
            r15 = r4
            goto L_0x0302
        L_0x0301:
            r15 = r12
        L_0x0302:
            int r12 = r12 + r11
            int r4 = r15 + r6
            if (r4 <= r12) goto L_0x030b
            if (r11 <= r6) goto L_0x030b
            int r15 = r12 - r6
        L_0x030b:
            float r4 = (float) r15
            r10.setTranslationX(r4)
            java.util.Map r4 = r3.f321915d
            java.lang.Object r4 = r4.get(r9)
            android.view.View r4 = (android.view.View) r4
            r4.getClass()
            com.google.android.libraries.ad.j r5 = r9.f322290k
            float r5 = r5.mo124175a()
            com.google.common.b.gu r6 = r9.f322283d
            int r10 = r6.size()
            r11 = 0
        L_0x0327:
            if (r11 >= r10) goto L_0x044f
            java.lang.Object r12 = r6.get(r11)
            com.google.android.apps.gsa.staticplugins.recently.view.group.f r12 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f) r12
            java.util.Set r13 = r3.f321922k
            r13.add(r12)
            java.util.Map r13 = r3.f321917f
            java.lang.Object r13 = r13.get(r12)
            android.view.View r13 = (android.view.View) r13
            if (r13 != 0) goto L_0x037d
            java.util.Deque r13 = r3.f321920i
            java.lang.Object r13 = r13.pollFirst()
            android.view.View r13 = (android.view.View) r13
            if (r13 != 0) goto L_0x035f
            android.widget.FrameLayout r13 = r3.f321912a
            android.content.Context r13 = r13.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            r15 = 2131625500(0x7f0e061c, float:1.887821E38)
            android.widget.FrameLayout r14 = r3.f321912a
            r22 = r6
            r6 = 0
            android.view.View r13 = r13.inflate(r15, r14, r6)
            goto L_0x0361
        L_0x035f:
            r22 = r6
        L_0x0361:
            r6 = 1065353216(0x3f800000, float:1.0)
            r13.setAlpha(r6)
            r6 = 0
            r13.setTranslationX(r6)
            r13.setTranslationY(r6)
            r6 = 8
            r13.setVisibility(r6)
            android.widget.FrameLayout r6 = r3.f321912a
            r6.addView(r13)
            java.util.Map r6 = r3.f321917f
            r6.put(r12, r13)
            goto L_0x037f
        L_0x037d:
            r22 = r6
        L_0x037f:
            r6 = r13
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            int r14 = r9.f322281b
            int r15 = r12.f322256e
            r23 = r7
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r7 = r2.f322178a
            r7 = r7[r14]
            com.google.android.libraries.gsa.j.p[] r7 = r7.f322177h
            r7 = r7[r15]
            int r14 = r7.f62894c
            int r14 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r14)
            if (r14 != 0) goto L_0x03a2
        L_0x0398:
            r24 = r10
            r7 = 8
            r10 = 12
            r14 = 13
            goto L_0x040b
        L_0x03a2:
            r15 = 2
            if (r14 != r15) goto L_0x0398
            com.google.android.libraries.ad.j r14 = r9.f322290k
            float r14 = r14.mo124175a()
            r15 = 1058642330(0x3f19999a, float:0.6)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x03be
            r14 = 8
            r6.setVisibility(r14)
            r24 = r10
            r10 = 12
        L_0x03bb:
            r14 = 13
            goto L_0x040e
        L_0x03be:
            int r14 = r7.f62894c
            int r15 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r14)
            if (r15 != 0) goto L_0x03cb
            r24 = r10
            r10 = 12
            goto L_0x03dc
        L_0x03cb:
            r24 = r10
            r10 = 12
            if (r15 != r10) goto L_0x03dc
            r7 = 2131234765(0x7f080fcd, float:1.8085705E38)
            r6.setImageResource(r7)
            r7 = 0
            r6.setVisibility(r7)
            goto L_0x03bb
        L_0x03dc:
            int r7 = r7.f62902k
            int r7 = com.google.android.libraries.gsa.p1875j.C22834e.m42692a(r7)
            if (r7 != 0) goto L_0x03e5
            goto L_0x03e8
        L_0x03e5:
            r15 = 3
            if (r7 == r15) goto L_0x03fe
        L_0x03e8:
            int r7 = com.google.android.libraries.gsa.p1875j.C22840k.m42693a(r14)
            if (r7 != 0) goto L_0x03f3
            r7 = 8
            r14 = 13
            goto L_0x03fa
        L_0x03f3:
            r14 = 13
            if (r7 != r14) goto L_0x03f8
            goto L_0x0400
        L_0x03f8:
            r7 = 8
        L_0x03fa:
            r6.setVisibility(r7)
            goto L_0x040e
        L_0x03fe:
            r14 = 13
        L_0x0400:
            r7 = 2131234962(0x7f081092, float:1.8086105E38)
            r6.setImageResource(r7)
            r7 = 0
            r6.setVisibility(r7)
            goto L_0x040e
        L_0x040b:
            r6.setVisibility(r7)
        L_0x040e:
            float r6 = com.google.android.apps.gsa.staticplugins.recently.p8685h.C116096c.m192503a(r5)
            int r7 = r9.mo102612c()
            int r15 = r12.f322261j
            int r12 = r12.f322262k
            int r15 = r15 + r12
            r12 = 2131432199(0x7f0b1307, float:1.8486149E38)
            android.view.View r17 = r4.findViewById(r12)
            int r17 = r17.getWidth()
            if (r17 != 0) goto L_0x042b
            r10 = 1
            r3.f321923l = r10
        L_0x042b:
            boolean r10 = r3.f321914c
            if (r10 == 0) goto L_0x0436
            int r7 = r7 - r15
            int r10 = r13.getWidth()
            int r7 = r7 - r10
            goto L_0x0437
        L_0x0436:
            int r7 = r7 + r15
        L_0x0437:
            float r7 = (float) r7
            r13.setTranslationX(r7)
            float r7 = r3.mo102483b(r2, r9, r6)
            r13.setTranslationY(r7)
            r13.setAlpha(r6)
            int r11 = r11 + 1
            r6 = r22
            r7 = r23
            r10 = r24
            goto L_0x0327
        L_0x044f:
            r23 = r7
            java.util.Map r4 = r3.f321915d
            java.lang.Object r4 = r4.get(r9)
            android.view.View r4 = (android.view.View) r4
            r4.getClass()
            com.google.android.libraries.ad.j r5 = r9.f322290k
            float r5 = r5.mo124175a()
            r6 = 0
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x0597
            int r6 = r4.getVisibility()
            r7 = 4
            if (r6 == r7) goto L_0x0597
            com.google.common.b.gu r6 = r9.f322283d
            int r10 = r6.size()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0478:
            if (r12 >= r10) goto L_0x0597
            java.lang.Object r16 = r6.get(r12)
            r7 = r16
            com.google.android.apps.gsa.staticplugins.recently.view.group.f r7 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f) r7
            float r11 = com.google.android.apps.gsa.staticplugins.recently.p8685h.C116096c.m192503a(r5)
            r18 = r6
            int r6 = r9.f322281b
            r19 = r10
            int r10 = r7.f322256e
            r21 = r1
            com.google.android.apps.gsa.staticplugins.recently.timeline.Group[] r1 = r2.f322178a
            r1 = r1[r6]
            com.google.android.libraries.gsa.j.p[] r1 = r1.f322177h
            r1 = r1[r10]
            if (r1 != 0) goto L_0x049c
        L_0x049a:
            r1 = 0
            goto L_0x04c4
        L_0x049c:
            int r6 = r1.f62892a
            r10 = r6 & 64
            if (r10 == 0) goto L_0x04ab
            com.google.android.libraries.gsa.j.m r1 = r1.f62898g
            if (r1 != 0) goto L_0x04a8
            com.google.android.libraries.gsa.j.m r1 = com.google.android.libraries.gsa.p1875j.C22842m.f62879d
        L_0x04a8:
            java.lang.String r1 = r1.f62883c
            goto L_0x04c4
        L_0x04ab:
            r10 = r6 & 32
            if (r10 == 0) goto L_0x04b8
            com.google.android.libraries.gsa.j.o r1 = r1.f62897f
            if (r1 != 0) goto L_0x04b5
            com.google.android.libraries.gsa.j.o r1 = com.google.android.libraries.gsa.p1875j.C22844o.f62884e
        L_0x04b5:
            java.lang.String r1 = r1.f62888c
            goto L_0x04c4
        L_0x04b8:
            r6 = r6 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x049a
            com.google.android.libraries.gsa.j.i r1 = r1.f62901j
            if (r1 != 0) goto L_0x04c2
            com.google.android.libraries.gsa.j.i r1 = com.google.android.libraries.gsa.p1875j.C22838i.f62869h
        L_0x04c2:
            java.lang.String r1 = r1.f62874d
        L_0x04c4:
            if (r1 == 0) goto L_0x04ee
            boolean r6 = r1.equals(r13)
            if (r6 == 0) goto L_0x04ee
            if (r14 == 0) goto L_0x058a
            if (r15 == 0) goto L_0x058a
            int r1 = r3.mo102484c(r9, r7, r4, r15)
            int r6 = r15.getWidth()
            boolean r6 = r3.mo102485d(r5, r15, r1, r6)
            if (r6 == 0) goto L_0x058a
            int r6 = r15.getWidth()
            float[] r1 = r3.mo102486e(r15, r1, r11, r6)
            r6 = 0
            r1 = r1[r6]
            r14.setAlpha(r1)
            goto L_0x058a
        L_0x04ee:
            java.util.Set r6 = r3.f321921j
            r6.add(r7)
            java.util.Map r6 = r3.f321916e
            java.lang.Object r6 = r6.get(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L_0x0537
            java.util.Deque r6 = r3.f321919h
            java.lang.Object r6 = r6.pollFirst()
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L_0x051d
            android.widget.FrameLayout r6 = r3.f321912a
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r10 = 2131625499(0x7f0e061b, float:1.8878208E38)
            android.widget.FrameLayout r13 = r3.f321912a
            r0 = 0
            android.view.View r6 = r6.inflate(r10, r13, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
        L_0x051d:
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            r10 = 0
            r6.setTranslationX(r10)
            r6.setTranslationY(r10)
            r6.setText(r1)
            android.widget.FrameLayout r13 = r3.f321912a
            r13.addView(r6)
            java.util.Map r13 = r3.f321916e
            r13.put(r7, r6)
            goto L_0x053a
        L_0x0537:
            r0 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
        L_0x053a:
            int r13 = r3.mo102484c(r9, r7, r4, r6)
            int r0 = r6.getWidth()
            boolean r0 = r3.mo102485d(r5, r15, r13, r0)
            if (r0 == 0) goto L_0x056a
            r15.getClass()
            int r0 = r6.getWidth()
            float[] r0 = r3.mo102486e(r15, r13, r11, r0)
            r22 = r1
            r10 = 0
            r1 = r0[r10]
            r15.setAlpha(r1)
            r1 = 1
            r10 = r0[r1]
            r15.setTranslationX(r10)
            r1 = 0
            if (r14 == 0) goto L_0x056d
            r0 = r0[r1]
            r14.setAlpha(r0)
            goto L_0x056d
        L_0x056a:
            r22 = r1
            r1 = 0
        L_0x056d:
            float r0 = (float) r13
            r6.setTranslationX(r0)
            float r0 = r3.mo102483b(r2, r9, r11)
            r6.setTranslationY(r0)
            r6.setAlpha(r11)
            r6.setVisibility(r1)
            java.util.Map r0 = r3.f321917f
            java.lang.Object r0 = r0.get(r7)
            r14 = r0
            android.view.View r14 = (android.view.View) r14
            r15 = r6
            r13 = r22
        L_0x058a:
            int r12 = r12 + 1
            r7 = 4
            r0 = r25
            r6 = r18
            r10 = r19
            r1 = r21
            goto L_0x0478
        L_0x0597:
            r21 = r1
        L_0x0599:
            int r8 = r8 + 1
            r4 = 0
            r6 = 1
            r0 = r25
            r5 = r20
            r1 = r21
            r7 = r23
            goto L_0x0185
        L_0x05a7:
            r21 = r1
            com.google.common.b.gu r1 = r0.f322216d
            java.util.Map r2 = r3.f321915d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x05b5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x05df
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L_0x05b5
            r2.remove()
            java.lang.Object r4 = r4.getValue()
            android.view.View r4 = (android.view.View) r4
            android.widget.FrameLayout r5 = r3.f321912a
            r5.removeView(r4)
            java.util.Deque r5 = r3.f321918g
            r5.add(r4)
            goto L_0x05b5
        L_0x05df:
            java.util.Map r1 = r3.f321916e
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05e9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0615
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Set r4 = r3.f321921j
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x05e9
            r1.remove()
            java.lang.Object r2 = r2.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.widget.FrameLayout r4 = r3.f321912a
            r4.removeView(r2)
            java.util.Deque r4 = r3.f321919h
            r4.add(r2)
            goto L_0x05e9
        L_0x0615:
            java.util.Map r1 = r3.f321917f
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x061f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x064b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Set r4 = r3.f321922k
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x061f
            r1.remove()
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout r4 = r3.f321912a
            r4.removeView(r2)
            java.util.Deque r4 = r3.f321920i
            r4.add(r2)
            goto L_0x061f
        L_0x064b:
            boolean r1 = r3.f321923l
            if (r1 == 0) goto L_0x0656
            r1 = 0
            r3.f321923l = r1
            r1 = r21
            r5 = 1
            goto L_0x0659
        L_0x0656:
            r1 = r21
        L_0x0658:
            r5 = 0
        L_0x0659:
            android.os.Bundle r2 = r1.f322104f
            java.lang.String r3 = "KEY_FIRST_ATTACHED_GROUP"
            int r4 = r0.f322217e
            r2.putInt(r3, r4)
            com.google.common.b.gu r3 = r0.f322216d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0687
            com.google.common.b.gu r3 = r0.f322216d
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r3 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r3
            int r4 = r3.mo102614e()
            int r7 = r3.f322292m
            int r4 = r4 + r7
            float r4 = (float) r4
            int r3 = r3.mo102614e()
            float r3 = (float) r3
            float r4 = r4 / r3
            java.lang.String r3 = "KEY_FIRST_ATTACHED_GROUP_PERCENT_VISIBLE"
            r2.putFloat(r3, r4)
            goto L_0x0688
        L_0x0687:
            r6 = 0
        L_0x0688:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.common.b.gu r4 = r0.f322215c
            r7 = r4
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
            r8 = 0
        L_0x0695:
            if (r8 >= r7) goto L_0x06be
            java.lang.Object r9 = r4.get(r8)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r9 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r9
            com.google.android.libraries.ad.j r10 = r9.f322290k
            float r10 = r10.mo124175a()
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x06bb
            com.google.common.b.gu r10 = r9.f322282c
            int r10 = r10.size()
            r11 = 1
            if (r10 <= r11) goto L_0x06bb
            int r9 = r9.f322281b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.add(r9)
        L_0x06bb:
            int r8 = r8 + 1
            goto L_0x0695
        L_0x06be:
            int r4 = r3.size()
            int[] r4 = new int[r4]
        L_0x06c4:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x06d9
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x06c4
        L_0x06d9:
            java.lang.String r3 = "KEY_EXPANDED_GROUPS"
            r2.putIntArray(r3, r4)
            java.lang.String r3 = "VALID_RECENTLY_SAVED_STATE_BUNDLE"
            r4 = 1
            r2.putBoolean(r3, r4)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r6 = r1.f322107i
            r8 = 500(0x1f4, double:2.47E-321)
            long r6 = r6 + r8
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0722
            com.google.android.libraries.gsa.monet.a.j r4 = r1.f63126Q
            boolean r4 = r4.mo28316z()
            if (r4 == 0) goto L_0x0722
            com.google.android.apps.gsa.staticplugins.recently.monet.shared.b r4 = r1.f322100b
            android.os.Bundle r6 = r1.f322104f
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            com.google.android.libraries.gsa.monet.tools.model.shared.types.m r8 = new com.google.android.libraries.gsa.monet.tools.model.shared.types.m
            com.google.android.libraries.gsa.monet.tools.model.shared.types.n r9 = new com.google.android.libraries.gsa.monet.tools.model.shared.types.n
            r9.<init>()
            r8.<init>(r9)
            java.lang.String r9 = "stateBundleOptional"
            r8.mo28734c(r9, r6, r7)
            com.google.android.apps.gsa.staticplugins.recently.monet.shared.c r4 = (com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116130c) r4
            com.google.android.libraries.gsa.monet.shared.h r4 = r4.f322041a
            java.lang.String r6 = "onRequestSaveState_com.google.common.base.Optional<android.os.Bundle>"
            java.lang.String r8 = "RecentlyEventsDispatcher"
            r4.mo28345s(r6, r8, r7)
            r1.f322107i = r2
        L_0x0722:
            r4 = r5
            goto L_0x0726
        L_0x0724:
            r6 = 0
            r4 = 0
        L_0x0726:
            if (r4 == 0) goto L_0x0730
            com.google.android.apps.gsa.staticplugins.recently.view.group.z r1 = new com.google.android.apps.gsa.staticplugins.recently.view.group.z
            r1.<init>(r0)
            r0.post(r1)
        L_0x0730:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.recently.view.group.RecentlyView.m192683F():void");
    }

    /* renamed from: G */
    private final void m192684G(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f322219g, 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), LinearLayoutManager.INVALID_OFFSET));
    }

    /* renamed from: H */
    private final void m192685H(C116226r rVar) {
        if (!this.f322237y) {
            C58485gu guVar = rVar.f322283d;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C116214f fVar = (C116214f) guVar.get(i);
                View view = fVar.f322258g;
                if (view != null) {
                    this.f322226n.mo102423e(rVar, fVar, view);
                }
            }
            View view2 = rVar.f322286g.f322258g;
            float a = rVar.f322290k.mo124175a();
            if (view2 != null) {
                this.f322226n.mo102422d(a, view2);
            }
        }
    }

    /* renamed from: I */
    private final void m192686I(C116226r rVar) {
        while (true) {
            int i = rVar.f322281b;
            if (i > 0) {
                C116226r rVar2 = (C116226r) this.f322215c.get(i - 1);
                int i2 = rVar.f322291l;
                int i3 = this.f322221i;
                int e = rVar2.mo102614e();
                int i4 = rVar2.f322291l;
                rVar2.f322291l = i4 + (((i2 - i3) - e) - i4);
                rVar = rVar2;
            } else {
                m192692O();
                return;
            }
        }
    }

    /* renamed from: J */
    private final void m192687J(C116226r rVar) {
        while (true) {
            int i = rVar.f322281b;
            C58485gu guVar = this.f322215c;
            if (i < ((C58724pq) guVar).f156474d - 1) {
                C116226r rVar2 = (C116226r) guVar.get(i + 1);
                int i2 = rVar.f322291l;
                int e = rVar.mo102614e();
                int i3 = this.f322221i;
                int i4 = rVar2.f322291l;
                rVar2.f322291l = i4 + (((i2 + e) + i3) - i4);
                rVar = rVar2;
            } else {
                m192692O();
                return;
            }
        }
    }

    /* renamed from: K */
    private final void m192688K(float f, float f2) {
        C116214f fVar;
        C116226r e = mo102567e(f, f2);
        this.f322205N = e;
        if (e != null && ((double) e.f322290k.mo124175a()) > 0.5d && this.f322205N.f322282c.size() > 1) {
            C116226r rVar = this.f322205N;
            int t = m192696t(f);
            C58485gu guVar = rVar.f322283d;
            int size = guVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    fVar = null;
                    break;
                }
                fVar = (C116214f) guVar.get(i);
                int i2 = rVar.f322291l + fVar.f322261j + fVar.f322262k;
                if (i2 < t && t < i2 + rVar.f322287h) {
                    break;
                }
                i++;
            }
            this.f322206O = fVar;
            if (fVar == null) {
                this.f322205N = null;
            }
        }
    }

    /* renamed from: M */
    private final void m192690M(float f) {
        if (Math.abs(f) <= 500.0f || this.f322232t) {
            this.f322225m.mo124183i(0.0f).mo124171a();
            return;
        }
        C147446j jVar = this.f322225m;
        if (m192693P()) {
            f = -f;
        }
        jVar.mo124183i(f).mo124171a();
    }

    /* renamed from: N */
    private final void m192691N(float f, float f2) {
        this.f322201J = f;
        this.f322202K = f2;
        C147446j jVar = this.f322225m;
        jVar.mo124186l(jVar.mo124175a());
    }

    /* renamed from: O */
    private final void m192692O() {
        if (this.f322215c.isEmpty()) {
            C147446j jVar = this.f322225m;
            jVar.mo124187m(jVar.mo124175a(), this.f322225m.mo124175a());
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        C116226r f = mo102568f();
        int i = ((C116226r) this.f322215c.get(0)).f322291l - this.f322221i;
        int e = ((f.f322291l + f.mo102614e()) + this.f322221i) - ((measuredWidth - paddingLeft) - paddingRight);
        if (e < i) {
            e = i;
        }
        this.f322225m.mo124187m((float) i, (float) e);
    }

    /* renamed from: P */
    private final boolean m192693P() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: Q */
    private final boolean m192694Q(float f) {
        return Math.abs(f - this.f322201J) > ((float) this.f322198G);
    }

    /* renamed from: R */
    private final boolean m192695R(float f) {
        return !this.f322207P && f - this.f322202K < ((float) (-this.f322198G));
    }

    /* renamed from: t */
    private final int m192696t(float f) {
        if (m192693P()) {
            return (int) (((((float) getMeasuredWidth()) - f) + this.f322225m.mo124175a()) - ((float) getPaddingRight()));
        }
        return (int) ((f + this.f322225m.mo124175a()) - ((float) getPaddingLeft()));
    }

    /* renamed from: u */
    private final int m192697u(int i) {
        if (m192693P()) {
            return getMeasuredWidth() - ((int) ((((float) i) - this.f322225m.mo124175a()) + ((float) getPaddingRight())));
        }
        return (int) ((((float) i) - this.f322225m.mo124175a()) + ((float) getPaddingLeft()));
    }

    /* renamed from: v */
    private final int m192698v() {
        return m192696t(m192693P() ? (float) getMeasuredWidth() : 0.0f);
    }

    /* renamed from: w */
    private final int m192699w() {
        return m192696t(m192693P() ? 0.0f : (float) getMeasuredWidth());
    }

    /* renamed from: x */
    private final VelocityTracker m192700x() {
        if (this.f322203L == null) {
            this.f322203L = VelocityTracker.obtain();
        }
        return this.f322203L;
    }

    /* renamed from: y */
    private final C116226r m192701y() {
        return (C116226r) this.f322215c.get(this.f322217e - 1);
    }

    /* renamed from: z */
    private final C116226r m192702z() {
        return (C116226r) this.f322215c.get(this.f322218f + 1);
    }

    /* renamed from: a */
    public final float mo102562a(float f) {
        float a = this.f322225m.mo124175a();
        C147446j jVar = this.f322225m;
        return ((a >= jVar.f397998d || f >= 0.0f) && (a <= jVar.f397999e || f <= 0.0f)) ? f : f * 0.4f;
    }

    /* renamed from: b */
    public final float mo102563b(C116226r rVar, float f) {
        if (rVar.f322290k.mo124175a() < 0.01f) {
            return 0.0f;
        }
        int u = m192697u(rVar.f322291l);
        boolean P = m192693P();
        if ((!P && u > 0) || (P && u < getMeasuredWidth())) {
            return 0.0f;
        }
        int e = rVar.mo102614e();
        if (!P && u + e < getMeasuredWidth()) {
            return 1.0f;
        }
        if (P && u - e > 0) {
            return 1.0f;
        }
        float f2 = (float) u;
        return (P ? f2 - f : f - f2) / ((float) e);
    }

    /* renamed from: c */
    public final C116214f mo102564c(int i, int i2) {
        C116018a b = ((C116023f) this.f322226n).mo102420b(i, i2);
        C116018a b2 = ((C116023f) this.f322226n).mo102420b(i, i2);
        float b3 = ((C116023f) this.f322226n).mo102420b(i, i2).mo102409b();
        return new C116214f(i2, b.mo102410c(), b2.mo102408a(), new C116227s(), b3);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    /* renamed from: d */
    public final C116226r mo102566d(int i, int i2) {
        C58480gp e = C58485gu.m89837e();
        int a = this.f322226n.mo102419a(i2);
        for (int i3 = 0; i3 < a; i3++) {
            e.mo55395g(mo102564c(i2, i3));
        }
        C58485gu f = e.mo55394f();
        int i4 = this.f322219g;
        int i5 = this.f322220h;
        int i6 = this.f322222j;
        boolean P = m192693P();
        boolean f2 = this.f322226n.mo102424f(i2);
        if (this.f322214W == null) {
            this.f322214W = new C116207ad(this);
        }
        return new C116226r(i2, i, f, i4, i5, 0.0f, i6, P, f2, this.f322214W);
    }

    /* renamed from: e */
    public final C116226r mo102567e(float f, float f2) {
        if (f >= 0.0f && f <= ((float) getMeasuredWidth()) && f2 >= 0.0f && f2 <= ((float) getMeasuredHeight())) {
            int t = m192696t(f);
            C58485gu guVar = this.f322216d;
            int size = guVar.size();
            int i = 0;
            while (i < size) {
                C116226r rVar = (C116226r) guVar.get(i);
                C116214f fVar = (C116214f) rVar.f322282c.get(0);
                C58485gu guVar2 = rVar.f322282c;
                C116214f fVar2 = (C116214f) guVar2.get(guVar2.size() - 1);
                int i2 = rVar.f322291l;
                i++;
                if (i2 + (fVar.f322261j + fVar.f322262k) < t && t < ((fVar2.f322261j + fVar2.f322262k) + i2) + rVar.f322287h) {
                    return rVar;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final C116226r mo102568f() {
        C58485gu guVar = this.f322215c;
        return (C116226r) guVar.get(((C58724pq) guVar).f156474d - 1);
    }

    /* renamed from: g */
    public final Deque mo102569g(int i) {
        Map map = this.f322224l;
        Integer valueOf = Integer.valueOf(i);
        Deque deque = (Deque) map.get(valueOf);
        if (deque != null) {
            return deque;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f322224l.put(valueOf, arrayDeque);
        return arrayDeque;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final CharSequence getAccessibilityClassName() {
        return RecentlyView.class.getName();
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    /* renamed from: h */
    public final void mo102575h(C116226r rVar) {
        boolean z = true;
        rVar.f322296q = true;
        if (!rVar.f322283d.isEmpty()) {
            C59104x c = C116226r.f322280a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Recently.Group");
            ((C59052c) ((C59052c) c).mo56372aa(30961)).mo56386p("Attaching a group with already attached entries.");
            rVar.mo102615f();
        }
        C116207ad adVar = rVar.f322298s;
        C116214f fVar = rVar.f322286g;
        RecentlyView recentlyView = adVar.f322245a;
        View view = (View) recentlyView.f322223k.poll();
        if (view == null) {
            view = LayoutInflater.from(((C116023f) recentlyView.f322226n).f321704b).inflate(R.layout.expand_group_button, recentlyView, false);
        }
        recentlyView.f322226n.mo102421c(view, rVar);
        recentlyView.f322226n.mo102422d(rVar.f322290k.mo124175a(), view);
        recentlyView.addViewInLayout(view, 0, view.getLayoutParams(), true);
        recentlyView.measureChild(view, recentlyView.f322209R, recentlyView.f322210S);
        m192682E(view, 0, 0);
        rVar.f322286g.mo102605b(view);
        view.setOnClickListener(new C116220l(rVar));
        if (rVar.f322282c.size() <= 1) {
            z = false;
        }
        view.setClickable(z);
        rVar.f322296q = false;
        rVar.mo102616g(m192698v(), m192699w());
        m192685H(rVar);
    }

    /* renamed from: i */
    public final void mo102576i() {
        C58480gp e = C58485gu.m89837e();
        int length = ((C116023f) this.f322226n).f321706d.f322178a.length;
        int paddingLeft = this.f322221i + getPaddingLeft();
        for (int i = 0; i < length; i++) {
            C116226r d = mo102566d(paddingLeft, i);
            d.mo102620k();
            paddingLeft += d.mo102614e() + this.f322221i;
            e.mo55395g(d);
        }
        this.f322215c = e.mo55394f();
    }

    /* renamed from: j */
    public final void mo102577j() {
        this.f322215c = C58485gu.m89845m();
        this.f322216d = C58485gu.m89845m();
        this.f322217e = 0;
        this.f322218f = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[LOOP:0: B:11:0x0034->B:12:0x0036, LOOP_END] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102578k(com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r r6) {
        /*
            r5 = this;
            com.google.common.b.gu r0 = r5.f322216d
            boolean r0 = r0.contains(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0048
            r5.m192685H(r6)
            r5.m192686I(r6)
            r5.m192687J(r6)
            com.google.android.libraries.ad.j r6 = r5.f322225m
            float r6 = r6.mo124175a()
            com.google.android.libraries.ad.j r0 = r5.f322225m
            float r2 = r0.f397999e
            float r0 = r0.f397998d
            int r6 = (int) r6
            float r6 = (float) r6
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0027
            float r6 = r6 - r2
        L_0x0025:
            int r6 = (int) r6
            goto L_0x002e
        L_0x0027:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x002d
            float r6 = r6 - r0
            goto L_0x0025
        L_0x002d:
            r6 = 0
        L_0x002e:
            com.google.common.b.gu r0 = r5.f322216d
            int r2 = r0.size()
        L_0x0034:
            if (r1 >= r2) goto L_0x0044
            java.lang.Object r3 = r0.get(r1)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r3 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r3
            int r4 = r3.f322291l
            int r4 = r4 + r6
            r3.f322291l = r4
            int r1 = r1 + 1
            goto L_0x0034
        L_0x0044:
            r5.m192692O()
            goto L_0x0072
        L_0x0048:
            com.google.common.b.gu r6 = r5.f322216d
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x005f
            com.google.common.b.gu r6 = r5.f322216d
            java.lang.Object r6 = r6.get(r1)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r6 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r6
            r5.m192686I(r6)
            r5.m192687J(r6)
            goto L_0x0072
        L_0x005f:
            com.google.common.b.gu r6 = r5.f322215c
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0072
            com.google.common.b.gu r6 = r5.f322215c
            java.lang.Object r6 = r6.get(r1)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r6 = (com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r) r6
            r5.m192687J(r6)
        L_0x0072:
            r5.mo102595r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.recently.view.group.RecentlyView.mo102578k(com.google.android.apps.gsa.staticplugins.recently.view.group.r):void");
    }

    /* renamed from: l */
    public final void mo102579l(int i) {
        if (i >= 0) {
            C58485gu guVar = this.f322215c;
            if (i < ((C58724pq) guVar).f156474d) {
                this.f322236x = -1;
                this.f322225m.mo124186l((float) (((C116226r) guVar.get(i)).f322291l - this.f322221i));
                C116190s sVar = this.f322197F;
                if (sVar != null) {
                    C116129b bVar = sVar.f322161a;
                    ((C116130c) bVar).f322041a.mo28345s("onJumpToGroupDone", "RecentlyEventsDispatcher", new Bundle());
                    return;
                }
                return;
            }
        }
        this.f322236x = i;
    }

    /* renamed from: m */
    public final void mo102580m(C116226r rVar) {
        if (this.f322216d.contains(rVar)) {
            View view = rVar.f322286g.f322258g;
            view.getClass();
            this.f322226n.mo102421c(view, rVar);
        }
    }

    /* renamed from: n */
    public final void mo102581n(float f) {
        C147446j jVar = this.f322225m;
        jVar.mo124186l(jVar.mo124175a() + f);
    }

    /* renamed from: o */
    public final void mo102582o() {
        m192692O();
        Bundle bundle = this.f322234v;
        this.f322234v = null;
        if (bundle == null || !bundle.getBoolean("VALID_RECENTLY_SAVED_STATE_BUNDLE")) {
            this.f322225m.mo124186l(0.0f);
            return;
        }
        int i = bundle.getInt("KEY_FIRST_ATTACHED_GROUP");
        this.f322217e = i;
        this.f322218f = i - 1;
        C116226r rVar = (C116226r) this.f322215c.get(i);
        this.f322225m.mo124186l((float) rVar.f322291l);
        int[] intArray = bundle.getIntArray("KEY_EXPANDED_GROUPS");
        if (intArray != null) {
            for (int i2 : intArray) {
                ((C116226r) this.f322215c.get(i2)).f322290k.mo124186l(1.0f);
            }
        }
        int e = (int) (((float) rVar.mo102614e()) * (1.0f - bundle.getFloat("KEY_FIRST_ATTACHED_GROUP_PERCENT_VISIBLE")));
        if (e >= 0 || getMeasuredWidth() != 0) {
            C147446j jVar = this.f322225m;
            jVar.mo124186l(jVar.mo124175a() + ((float) e));
            return;
        }
        this.f322211T = true;
        this.f322212U = e;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f322213V = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f322213V = false;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f322225m.mo124188n(new C116228t(this));
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setEnabled(true);
        accessibilityEvent.setItemCount(((C58724pq) this.f322215c).f156474d);
        accessibilityEvent.setFromIndex(this.f322217e);
        accessibilityEvent.setToIndex(this.f322218f);
        accessibilityEvent.setCurrentItemIndex(this.f322217e);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(((C58724pq) this.f322215c).f156474d, 1, false));
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS);
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setFocusable(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.google.common.b.gu r0 = r7.f322215c
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = r8.getPointerCount()
            int r0 = r0 + -1
            float r2 = r8.getX(r0)
            float r0 = r8.getY(r0)
            int r3 = r8.getActionMasked()
            r4 = 1
            if (r3 == 0) goto L_0x008f
            if (r3 == r4) goto L_0x008b
            r5 = 2
            if (r3 == r5) goto L_0x005f
            r5 = 3
            if (r3 == r5) goto L_0x008b
            r5 = 5
            if (r3 == r5) goto L_0x0059
            r5 = 6
            if (r3 == r5) goto L_0x002e
            goto L_0x0092
        L_0x002e:
            int r3 = r8.getActionIndex()
            int r5 = r8.getPointerCount()
            int r5 = r5 + -1
            if (r3 != r5) goto L_0x0092
            int r3 = r8.getPointerCount()
            int r3 = r3 + -2
            float r5 = r8.getX(r3)
            float r3 = r8.getY(r3)
            float r6 = r7.f322201J
            float r2 = r5 - r2
            float r6 = r6 + r2
            r7.f322201J = r6
            float r2 = r7.f322202K
            float r0 = r3 - r0
            float r2 = r2 + r0
            r7.f322202K = r2
            r0 = r3
            r2 = r5
            goto L_0x0092
        L_0x0059:
            r7.f322207P = r4
            r7.m192680C(r8, r2, r0)
            goto L_0x0092
        L_0x005f:
            boolean r3 = r7.m192694Q(r2)
            if (r3 == 0) goto L_0x0070
            com.google.android.libraries.aq.u r3 = r7.f322227o
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r3.mo18619f(r5)
        L_0x006e:
            r3 = 1
            goto L_0x0093
        L_0x0070:
            boolean r3 = r7.m192695R(r0)
            if (r3 == 0) goto L_0x0092
            r7.m192688K(r2, r0)
            com.google.android.apps.gsa.staticplugins.recently.view.group.r r3 = r7.f322205N
            if (r3 == 0) goto L_0x0092
            float r3 = r7.f322200I
            r7.f322202K = r3
            com.google.android.libraries.aq.u r3 = r7.f322228p
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r3.mo18619f(r5)
            goto L_0x006e
        L_0x008b:
            r7.m192679B()
            goto L_0x0092
        L_0x008f:
            r7.m192691N(r2, r0)
        L_0x0092:
            r3 = 0
        L_0x0093:
            int r5 = r8.getPointerCount()
            if (r5 <= r4) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r1 = 1
        L_0x009b:
            r1 = r1 ^ r4
            r1 = r1 | r3
            if (r1 != 0) goto L_0x00aa
            android.view.VelocityTracker r3 = r7.m192700x()
            r3.addMovement(r8)
            r7.f322199H = r2
            r7.f322200I = r0
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.recently.view.group.RecentlyView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredWidth() > 0) {
            m192692O();
            if (this.f322211T) {
                C147446j jVar = this.f322225m;
                jVar.mo124186l(jVar.mo124175a() + ((float) this.f322212U));
                this.f322211T = false;
                this.f322212U = 0;
            }
        }
        if (z && !this.f322215c.isEmpty()) {
            mo102595r();
        }
        C58485gu guVar = this.f322216d;
        int size = guVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            C116226r rVar = (C116226r) guVar.get(i5);
            C58485gu guVar2 = rVar.f322283d;
            int size2 = guVar2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                C116214f fVar = (C116214f) guVar2.get(i6);
                View view = fVar.f322258g;
                view.getClass();
                m192681D(rVar, fVar, view);
            }
            View view2 = rVar.f322286g.f322258g;
            view2.getClass();
            m192682E(view2, 0, 0);
            rVar.mo102621l(m192697u(rVar.f322291l));
        }
        m192683F();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f322209R = i;
        this.f322210S = i2;
        int i3 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i4 = getContext().getResources().getDisplayMetrics().heightPixels;
        int defaultSize = getDefaultSize(i3, i);
        setMeasuredDimension(defaultSize, getDefaultSize(i4, i2));
        if (this.f322216d.isEmpty() && !this.f322215c.isEmpty()) {
            mo102595r();
        }
        C58485gu guVar = this.f322216d;
        int size = guVar.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C116226r rVar = (C116226r) guVar.get(i6);
            C58485gu guVar2 = rVar.f322283d;
            int size2 = guVar2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                View view = ((C116214f) guVar2.get(i7)).f322258g;
                view.getClass();
                m192684G(view);
                int measuredHeight = view.getMeasuredHeight();
                if (i5 < measuredHeight) {
                    i5 = measuredHeight;
                }
            }
            View view2 = rVar.f322286g.f322258g;
            view2.getClass();
            measureChild(view2, this.f322209R, this.f322210S);
        }
        setMeasuredDimension(defaultSize, getPaddingTop() + i5 + getPaddingBottom());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int i = 0;
        if (this.f322215c.isEmpty()) {
            return false;
        }
        m192700x().addMovement(motionEvent);
        if (this.f322204M == null) {
            this.f322204M = new ScaleGestureDetector(getContext(), new C116209af(this));
        }
        this.f322204M.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount() - 1;
        float x = motionEvent.getX(pointerCount);
        float y = motionEvent.getY(pointerCount);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m192691N(x, y);
        } else if (actionMasked == 1) {
            if (((Boolean) this.f322227o.mo18622m()).booleanValue()) {
                VelocityTracker x2 = m192700x();
                x2.computeCurrentVelocity(1000);
                m192690M(-x2.getXVelocity());
            }
            if (((Boolean) this.f322228p.mo18622m()).booleanValue()) {
                VelocityTracker x3 = m192700x();
                x3.computeCurrentVelocity(1000);
                float yVelocity = x3.getYVelocity();
                C116226r rVar = this.f322205N;
                C116161ad adVar = this.f322192A;
                if (!(yVelocity >= -1000.0f || rVar == null || adVar == null)) {
                    int i2 = rVar.f322281b;
                    if (((C116023f) this.f322226n).f321706d.f322178a[i2].f322174e) {
                        C116214f fVar = this.f322206O;
                        if (fVar != null) {
                            int i3 = fVar.f322256e;
                            C116129b bVar = adVar.f322095a.f322100b;
                            Bundle bundle = new Bundle();
                            bundle.putInt("groupIndex", Integer.valueOf(i2).intValue());
                            bundle.putInt("entryIndex", Integer.valueOf(i3).intValue());
                            ((C116130c) bVar).f322041a.mo28345s("onEntrySwipedUp_int_int", "RecentlyEventsDispatcher", bundle);
                        } else {
                            C116129b bVar2 = adVar.f322095a.f322100b;
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("groupIndex", Integer.valueOf(i2).intValue());
                            ((C116130c) bVar2).f322041a.mo28345s("onGroupSwipedUp_int", "RecentlyEventsDispatcher", bundle2);
                        }
                        i = (-getMeasuredHeight()) * 3;
                    }
                }
                m192689L(i, yVelocity);
            }
            m192679B();
        } else if (actionMasked == 2) {
            if (!((Boolean) this.f322227o.mo18622m()).booleanValue() && !((Boolean) this.f322228p.mo18622m()).booleanValue() && m192694Q(x)) {
                this.f322227o.mo18619f(true);
            } else if (!((Boolean) this.f322227o.mo18622m()).booleanValue() && !((Boolean) this.f322228p.mo18622m()).booleanValue() && !((Boolean) this.f322231s.mo18622m()).booleanValue() && m192695R(y)) {
                m192688K(x, y);
                if (this.f322205N != null) {
                    this.f322201J = this.f322199H;
                    this.f322228p.mo18619f(true);
                }
            }
            if (((Boolean) this.f322227o.mo18622m()).booleanValue() && !((Boolean) this.f322231s.mo18622m()).booleanValue()) {
                if (m192693P()) {
                    f = this.f322199H - x;
                } else {
                    f = x - this.f322199H;
                }
                mo102581n(mo102562a(-f));
            }
            if (((Boolean) this.f322228p.mo18622m()).booleanValue() && !((Boolean) this.f322231s.mo18622m()).booleanValue()) {
                int min = Math.min((int) (y - this.f322202K), 0);
                C116226r rVar2 = this.f322205N;
                if (rVar2 != null) {
                    C116214f fVar2 = this.f322206O;
                    if (fVar2 != null) {
                        fVar2.f322264m.mo124186l((float) min);
                    } else {
                        rVar2.f322295p.mo124186l((float) min);
                    }
                }
            }
        } else if (actionMasked == 3) {
            if (((Boolean) this.f322227o.mo18622m()).booleanValue()) {
                m192690M(0.0f);
            }
            if (((Boolean) this.f322228p.mo18622m()).booleanValue()) {
                m192689L(0, 0.0f);
            }
            m192679B();
        } else if (actionMasked == 5) {
            this.f322207P = true;
            m192680C(motionEvent, x, y);
        } else if (actionMasked == 6 && motionEvent.getActionIndex() == motionEvent.getPointerCount() - 1) {
            int pointerCount2 = motionEvent.getPointerCount() - 2;
            float x4 = motionEvent.getX(pointerCount2);
            float y2 = motionEvent.getY(pointerCount2);
            this.f322201J += x4 - x;
            this.f322202K += y2 - y;
            y = y2;
            x = x4;
        }
        this.f322199H = x;
        this.f322200I = y;
        return true;
    }

    /* renamed from: p */
    public final void mo102592p(int i) {
        if (i >= 0) {
            C58485gu guVar = this.f322215c;
            if (i < ((C58724pq) guVar).f156474d) {
                this.f322225m.mo124179e((float) (((C116226r) guVar.get(i)).f322291l - this.f322221i));
                if (i < this.f322217e || i > this.f322218f) {
                    this.f322235w = i;
                } else {
                    this.f322235w = -1;
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo102594q() {
        this.f322216d = this.f322215c.subList(this.f322217e, this.f322218f + 1);
    }

    /* renamed from: r */
    public final void mo102595r() {
        if (!this.f322237y && !this.f322208Q) {
            this.f322208Q = true;
            int v = m192698v();
            int w = m192699w();
            C58485gu guVar = this.f322216d;
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                ((C116226r) guVar.get(i)).mo102616g(v, w);
            }
            while (!this.f322216d.isEmpty() && ((C116226r) this.f322216d.get(0)).f322283d.isEmpty()) {
                this.f322217e++;
                m192678A((C116226r) this.f322216d.get(0));
            }
            while (!this.f322216d.isEmpty()) {
                C58485gu guVar2 = this.f322216d;
                if (!((C116226r) guVar2.get(guVar2.size() - 1)).f322283d.isEmpty()) {
                    break;
                }
                C58485gu guVar3 = this.f322216d;
                this.f322218f--;
                m192678A((C116226r) guVar3.get(guVar3.size() - 1));
            }
            if (this.f322218f - this.f322217e < 0) {
                C58838bb.m90868c(this.f322216d.isEmpty());
                C58485gu guVar4 = this.f322215c;
                int i2 = ((C58724pq) guVar4).f156474d;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    C116226r rVar = (C116226r) guVar4.get(i3);
                    i3++;
                    if (rVar.mo102625p(v, w)) {
                        int i4 = rVar.f322281b;
                        this.f322217e = i4;
                        this.f322218f = i4;
                        mo102575h(rVar);
                        mo102594q();
                        break;
                    }
                }
            }
            while (this.f322217e != 0 && m192701y().mo102625p(v, w)) {
                mo102575h(m192701y());
                this.f322217e--;
                mo102594q();
            }
            while (this.f322218f != ((C58724pq) this.f322215c).f156474d - 1 && m192702z().mo102625p(v, w)) {
                mo102575h(m192702z());
                this.f322218f++;
                mo102594q();
            }
            C58485gu guVar5 = this.f322216d;
            int size2 = guVar5.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C116226r rVar2 = (C116226r) guVar5.get(i5);
                rVar2.mo102621l(m192697u(rVar2.f322291l));
            }
            m192683F();
            this.f322208Q = false;
        }
    }

    /* renamed from: s */
    public final View mo102596s(C116226r rVar, C116214f fVar, int i) {
        int i2 = fVar.f322252a;
        View view = (View) mo102569g(i2).poll();
        int i3 = 0;
        if (view == null) {
            view = LayoutInflater.from(((C116023f) this.f322226n).f321704b).inflate(i2, this, false);
        }
        C116023f fVar2 = (C116023f) this.f322226n;
        fVar2.mo102420b(rVar.f322281b, fVar.f322256e).mo102413f(view, new C116019b(fVar2), rVar, fVar);
        this.f322226n.mo102423e(rVar, fVar, view);
        int i4 = -1;
        if (i == 3) {
            C58485gu guVar = rVar.f322283d;
            int indexOf = guVar.indexOf(fVar);
            if (indexOf == 0) {
                i4 = this.f322216d.size();
            } else {
                View view2 = ((C116214f) guVar.get(indexOf - 1)).f322258g;
                while (true) {
                    if (i3 >= getChildCount()) {
                        break;
                    } else if (getChildAt(i3) == view2) {
                        i4 = i3 + 1;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        } else if (i == 1) {
            i4 = this.f322216d.size();
        }
        addViewInLayout(view, i4, view.getLayoutParams(), true);
        if (getMeasuredHeight() == 0) {
            requestLayout();
        }
        m192684G(view);
        m192681D(rVar, fVar, view);
        return view;
    }

    /* renamed from: L */
    private final void m192689L(int i, float f) {
        C116226r rVar = this.f322205N;
        if (rVar != null) {
            C116214f fVar = this.f322206O;
            if (fVar != null) {
                fVar.f322264m.mo124183i(f).mo124172b((float) i);
            } else {
                rVar.f322295p.mo124183i(f).mo124172b((float) i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096) {
            if (this.f322225m.mo124175a() < this.f322225m.f397999e) {
                sendAccessibilityEvent(4096);
            }
            C147446j jVar = this.f322225m;
            jVar.mo124179e(jVar.mo124175a() + ((float) this.f322219g));
            return true;
        } else if (i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        } else {
            if (this.f322225m.mo124175a() > 0.0f) {
                sendAccessibilityEvent(4096);
            }
            C147446j jVar2 = this.f322225m;
            jVar2.mo124179e(jVar2.mo124175a() - ((float) this.f322219g));
            return true;
        }
    }
}
