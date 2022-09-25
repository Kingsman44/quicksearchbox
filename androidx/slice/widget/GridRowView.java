package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.C4093a;
import androidx.slice.C4102b;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4101h;
import com.google.android.googlequicksearchbox.R;
import java.util.Date;

/* compiled from: PG */
public class GridRowView extends C4129ag implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: A */
    private final ViewTreeObserver.OnPreDrawListener f13168A;

    /* renamed from: a */
    boolean f13169a;

    /* renamed from: b */
    protected final View f13170b;

    /* renamed from: c */
    protected int f13171c;

    /* renamed from: d */
    protected int f13172d;

    /* renamed from: e */
    protected int f13173e;

    /* renamed from: f */
    protected C4149e f13174f;

    /* renamed from: g */
    protected final int f13175g;

    /* renamed from: h */
    protected final int f13176h;

    /* renamed from: i */
    protected final int f13177i;

    /* renamed from: j */
    protected final int f13178j;

    /* renamed from: k */
    protected final LinearLayout f13179k;

    /* renamed from: l */
    private final int f13180l;

    /* renamed from: m */
    private final int f13181m;

    /* renamed from: n */
    private final int[] f13182n;

    public GridRowView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: q */
    private final int m11796q(SliceItem sliceItem) {
        C4137ao aoVar;
        if (sliceItem == null) {
            return 0;
        }
        if ("image".equals(sliceItem.f13092b)) {
            return this.f13181m;
        }
        if (("text".equals(sliceItem.f13092b) || "long".equals(sliceItem.f13092b)) && (aoVar = this.f13265x) != null) {
            return aoVar.f13306l;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11797r(androidx.slice.widget.C4148d r31, int r32, int r33) {
        /*
            r30 = this;
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            int r0 = r30.mo8706fy()
            r11 = 1
            if (r0 != r11) goto L_0x0019
            androidx.slice.widget.e r0 = r6.f13174f
            boolean r0 = r0.mo8739c()
            if (r0 == 0) goto L_0x0019
            r12 = 1
            goto L_0x001a
        L_0x0019:
            r12 = 2
        L_0x001a:
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            android.content.Context r0 = r30.getContext()
            r13.<init>(r0)
            r13.setOrientation(r11)
            r13.setGravity(r11)
            java.util.ArrayList r14 = r7.f13347c
            androidx.slice.SliceItem r15 = r7.f13345a
            androidx.slice.SliceItem r5 = r7.f13346b
            androidx.slice.SliceItem r4 = r7.f13354j
            int r0 = r14.size()
            if (r0 != r11) goto L_0x003a
            r16 = 1
            goto L_0x003c
        L_0x003a:
            r16 = 0
        L_0x003c:
            java.lang.String r17 = "large"
            java.lang.String r18 = "title"
            java.lang.String r2 = "text"
            if (r16 != 0) goto L_0x0091
            int r0 = r30.mo8706fy()
            if (r0 != r11) goto L_0x0091
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r14.size()
            r11 = 0
        L_0x0054:
            if (r11 >= r1) goto L_0x006c
            java.lang.Object r20 = r14.get(r11)
            r3 = r20
            androidx.slice.SliceItem r3 = (androidx.slice.SliceItem) r3
            java.lang.String r10 = r3.f13092b
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L_0x0069
            r0.add(r3)
        L_0x0069:
            int r11 = r11 + 1
            goto L_0x0054
        L_0x006c:
            java.util.Iterator r1 = r0.iterator()
        L_0x0070:
            int r3 = r0.size()
            if (r3 <= r12) goto L_0x008f
            java.lang.Object r3 = r1.next()
            androidx.slice.SliceItem r3 = (androidx.slice.SliceItem) r3
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]
            r10 = 0
            r11[r10] = r18
            r10 = 1
            r11[r10] = r17
            boolean r3 = r3.mo8600h(r11)
            if (r3 != 0) goto L_0x0070
            r1.remove()
            goto L_0x0070
        L_0x008f:
            r10 = r0
            goto L_0x0092
        L_0x0091:
            r10 = 0
        L_0x0092:
            r1 = 0
            r3 = 0
            r11 = 0
            r22 = 0
            r23 = 0
        L_0x0099:
            int r0 = r14.size()
            if (r11 >= r0) goto L_0x01d5
            java.lang.Object r0 = r14.get(r11)
            androidx.slice.SliceItem r0 = (androidx.slice.SliceItem) r0
            r24 = r4
            java.lang.String r4 = r0.f13092b
            r25 = r5
            int r5 = r6.m11796q(r1)
            if (r3 >= r12) goto L_0x0177
            boolean r26 = r2.equals(r4)
            r27 = r1
            java.lang.String r1 = "long"
            if (r26 != 0) goto L_0x00c1
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0179
        L_0x00c1:
            if (r10 == 0) goto L_0x00dc
            boolean r4 = r10.contains(r0)
            if (r4 != 0) goto L_0x00dc
        L_0x00c9:
            r21 = r2
            r26 = r3
            r28 = r10
            r29 = r12
            r19 = r14
            r12 = r15
            r10 = r24
            r14 = r25
            r15 = r27
            goto L_0x01c3
        L_0x00dc:
            java.lang.String r4 = r0.f13092b
            boolean r26 = r2.equals(r4)
            if (r26 != 0) goto L_0x00eb
            boolean r26 = r1.equals(r4)
            if (r26 != 0) goto L_0x00eb
            goto L_0x00c9
        L_0x00eb:
            r26 = r2
            r28 = r10
            r2 = 2
            java.lang.String[] r10 = new java.lang.String[r2]
            r2 = 0
            r10[r2] = r17
            r2 = 1
            r10[r2] = r18
            boolean r2 = androidx.slice.p194a.C4101h.m11755h(r0, r10)
            android.content.Context r10 = r30.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            if (r2 == 0) goto L_0x0111
            int r22 = r30.mo8640d()
            r29 = r12
            r19 = r14
            r12 = r22
            goto L_0x011b
        L_0x0111:
            r22 = 2131624003(0x7f0e0043, float:1.8875173E38)
            r29 = r12
            r19 = r14
            r12 = 2131624003(0x7f0e0043, float:1.8875173E38)
        L_0x011b:
            r14 = 0
            android.view.View r10 = r10.inflate(r12, r14)
            android.widget.TextView r10 = (android.widget.TextView) r10
            androidx.slice.widget.ao r12 = r6.f13265x
            if (r12 == 0) goto L_0x0148
            androidx.slice.widget.q r14 = r6.f13266y
            if (r14 == 0) goto L_0x0148
            if (r2 == 0) goto L_0x012f
            int r12 = r12.f13304j
            goto L_0x0131
        L_0x012f:
            int r12 = r12.f13305k
        L_0x0131:
            float r12 = (float) r12
            r14 = 0
            r10.setTextSize(r14, r12)
            if (r2 == 0) goto L_0x013f
            androidx.slice.widget.q r2 = r6.f13266y
            int r2 = r2.mo8755c()
            goto L_0x0145
        L_0x013f:
            androidx.slice.widget.q r2 = r6.f13266y
            int r2 = r2.mo8753a()
        L_0x0145:
            r10.setTextColor(r2)
        L_0x0148:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x015c
            android.content.Context r1 = r30.getContext()
            r12 = r15
            long r14 = r0.mo8594b()
            java.lang.CharSequence r1 = androidx.slice.widget.C4144av.m11884d(r1, r14)
            goto L_0x0161
        L_0x015c:
            r12 = r15
            java.lang.CharSequence r1 = r0.mo8597e()
        L_0x0161:
            r10.setText(r1)
            r13.addView(r10)
            r4 = 0
            r10.setPadding(r4, r5, r4, r4)
            int r3 = r3 + 1
            r1 = r0
            r10 = r24
            r14 = r25
            r21 = r26
            r22 = 1
            goto L_0x01c6
        L_0x0177:
            r27 = r1
        L_0x0179:
            r26 = r2
            r28 = r10
            r29 = r12
            r19 = r14
            r12 = r15
            r4 = 0
            if (r23 > 0) goto L_0x01b9
            java.lang.String r1 = "image"
            java.lang.String r2 = r0.f13092b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01b9
            androidx.slice.SliceItem r2 = r7.f13351g
            int r5 = r6.f13257p
            r10 = r0
            r0 = r30
            r15 = r27
            r14 = 0
            r1 = r10
            r21 = r26
            r26 = r3
            r3 = r5
            r5 = r24
            r14 = 0
            r4 = r13
            r14 = r25
            r25 = r10
            r10 = r5
            r5 = r16
            boolean r0 = r0.mo8646j(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x01c3
            r1 = r25
            r3 = r26
            r22 = 1
            r23 = 1
            goto L_0x01c6
        L_0x01b9:
            r10 = r24
            r14 = r25
            r21 = r26
            r15 = r27
            r26 = r3
        L_0x01c3:
            r1 = r15
            r3 = r26
        L_0x01c6:
            int r11 = r11 + 1
            r4 = r10
            r15 = r12
            r5 = r14
            r14 = r19
            r2 = r21
            r10 = r28
            r12 = r29
            goto L_0x0099
        L_0x01d5:
            r10 = r4
            r14 = r5
            r12 = r15
            r15 = r1
            if (r14 == 0) goto L_0x0203
            java.lang.String r0 = "date_picker"
            java.lang.String r1 = r14.f13093c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ef
            int r0 = r6.m11796q(r15)
            r1 = 1
            boolean r0 = r6.m11799t(r14, r13, r0, r1)
            goto L_0x0205
        L_0x01ef:
            java.lang.String r0 = "time_picker"
            java.lang.String r1 = r14.f13093c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0203
            int r0 = r6.m11796q(r15)
            r1 = 0
            boolean r0 = r6.m11799t(r14, r13, r0, r1)
            goto L_0x0205
        L_0x0203:
            r0 = r22
        L_0x0205:
            if (r10 == 0) goto L_0x0218
            androidx.slice.widget.ab r1 = new androidx.slice.widget.ab
            android.content.Context r0 = r30.getContext()
            androidx.slice.widget.q r2 = r6.f13266y
            r1.<init>(r0, r2)
            r13.addView(r1)
            r14 = r1
            r0 = 1
            goto L_0x0219
        L_0x0218:
            r14 = 0
        L_0x0219:
            if (r0 == 0) goto L_0x0292
            androidx.slice.SliceItem r0 = r7.f13348d
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r0.f13094d
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            if (r1 == 0) goto L_0x022b
            r13.setContentDescription(r1)
        L_0x022b:
            android.widget.LinearLayout r0 = r6.f13179k
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r1.<init>(r4, r2, r3)
            r0.addView(r13, r1)
            int r0 = r9 + -1
            if (r8 == r0) goto L_0x024b
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r6.f13180l
            r0.setMarginEnd(r1)
            r13.setLayoutParams(r0)
        L_0x024b:
            if (r12 == 0) goto L_0x0269
            androidx.slice.widget.c r0 = new androidx.slice.widget.c
            int r1 = r30.mo8706fy()
            int r2 = r6.f13171c
            r3 = 1
            r0.<init>(r1, r3, r3, r2)
            r1 = 2
            r0.mo8735a(r1, r8, r9)
            android.util.Pair r1 = new android.util.Pair
            r2 = r12
            r1.<init>(r2, r0)
            r13.setTag(r1)
            r6.m11800u(r13)
        L_0x0269:
            if (r10 == 0) goto L_0x0292
            androidx.slice.widget.c r0 = new androidx.slice.widget.c
            int r1 = r30.mo8706fy()
            r2 = 3
            int r3 = r6.f13171c
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            androidx.slice.a.a r15 = new androidx.slice.a.a
            r15.<init>(r10)
            androidx.slice.widget.as r1 = r6.f13256o
            int r2 = r6.f13257p
            androidx.slice.widget.aa r3 = r6.f13264w
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r3
            r14.mo8688b(r15, r16, r17, r18, r19)
            r1 = 2
            r0.mo8735a(r1, r8, r9)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.GridRowView.m11797r(androidx.slice.widget.d, int, int):void");
    }

    /* renamed from: s */
    private final void m11798s(boolean z) {
        LinearLayout linearLayout = this.f13179k;
        Drawable drawable = null;
        GridRowView gridRowView = true != z ? null : this;
        linearLayout.setOnTouchListener(gridRowView);
        this.f13179k.setOnClickListener(gridRowView);
        View view = this.f13170b;
        if (z) {
            drawable = C4144av.m11883c(getContext(), 16843534);
        }
        view.setBackground(drawable);
        this.f13179k.setClickable(z);
        setClickable(z);
    }

    /* renamed from: t */
    private final boolean m11799t(SliceItem sliceItem, ViewGroup viewGroup, int i, boolean z) {
        SliceItem d = C4101h.m11751d(sliceItem, "long", "millis");
        if (d == null) {
            return false;
        }
        long b = d.mo8594b();
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(mo8640d(), (ViewGroup) null);
        C4137ao aoVar = this.f13265x;
        if (aoVar != null) {
            textView.setTextSize(0, (float) aoVar.f13304j);
            textView.setTextColor(this.f13265x.f13296b);
        }
        Date date = new Date(b);
        SliceItem l = C4101h.m11759l(sliceItem, "text", "title");
        if (l != null) {
            textView.setText((CharSequence) l.f13094d);
        }
        viewGroup.setOnClickListener(new C4150f(this, date, z, sliceItem, this.f13171c));
        viewGroup.setClickable(true);
        viewGroup.setBackground(C4144av.m11883c(getContext(), 16843868));
        viewGroup.addView(textView);
        textView.setPadding(0, i, 0, 0);
        return true;
    }

    /* renamed from: u */
    private final void m11800u(View view) {
        view.setOnClickListener(this);
        view.setBackground(C4144av.m11883c(getContext(), 16843868));
        view.setClickable(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo8637a() {
        C4137ao aoVar;
        C4149e eVar = this.f13174f;
        if (eVar == null || !eVar.f13356a || ((this.f13171c != this.f13172d - 1 && mo8706fy() != 1) || (aoVar = this.f13265x) == null)) {
            return 0;
        }
        return aoVar.f13308n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo8638b() {
        C4137ao aoVar;
        C4149e eVar = this.f13174f;
        if (eVar == null || !eVar.f13356a || this.f13171c != 0 || (aoVar = this.f13265x) == null) {
            return 0;
        }
        return aoVar.f13307m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo8639c() {
        int i;
        C4149e eVar = this.f13174f;
        if (eVar == null || !eVar.mo8711d() || getWidth() == 0) {
            return -1;
        }
        if (this.f13174f.f13358c.size() <= 1) {
            return 1;
        }
        C4149e eVar2 = this.f13174f;
        int i2 = eVar2.f13361f;
        if (i2 != 2) {
            i = i2 != 4 ? this.f13177i : eVar2.mo8738b(getContext()).x;
        } else {
            i = this.f13175g;
        }
        return getWidth() / (i + this.f13180l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo8640d() {
        return R.layout.abc_slice_title;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [android.view.View] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8641e() {
        /*
            r15 = this;
            androidx.slice.widget.e r0 = r15.f13174f
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r0.mo8711d()
            if (r0 != 0) goto L_0x000c
            goto L_0x01a5
        L_0x000c:
            boolean r0 = r15.mo8647k()
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            androidx.slice.widget.e r0 = r15.f13174f
            int r0 = r0.mo8712g()
            r1 = -1
            if (r0 == r1) goto L_0x0025
            androidx.slice.widget.e r0 = r15.f13174f
            int r0 = r0.mo8712g()
            r15.setLayoutDirection(r0)
        L_0x0025:
            androidx.slice.widget.e r0 = r15.f13174f
            androidx.slice.SliceItem r0 = r0.f13357b
            r2 = 1
            if (r0 == 0) goto L_0x0049
            androidx.slice.widget.c r0 = new androidx.slice.widget.c
            int r3 = r15.mo8706fy()
            r4 = 3
            int r5 = r15.f13171c
            r0.<init>(r3, r4, r2, r5)
            android.util.Pair r3 = new android.util.Pair
            androidx.slice.widget.e r4 = r15.f13174f
            androidx.slice.SliceItem r4 = r4.f13357b
            r3.<init>(r4, r0)
            android.widget.LinearLayout r0 = r15.f13179k
            r0.setTag(r3)
            r15.m11798s(r2)
        L_0x0049:
            androidx.slice.widget.e r0 = r15.f13174f
            java.lang.CharSequence r0 = r0.mo8713h()
            if (r0 == 0) goto L_0x0056
            android.widget.LinearLayout r3 = r15.f13179k
            r3.setContentDescription(r0)
        L_0x0056:
            androidx.slice.widget.e r0 = r15.f13174f
            java.util.ArrayList r3 = r0.f13358c
            int r0 = r0.f13361f
            r4 = 4
            r5 = 2
            if (r0 == r5) goto L_0x006b
            if (r0 != r4) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            android.widget.LinearLayout r0 = r15.f13179k
            r6 = 16
            r0.setGravity(r6)
            goto L_0x0072
        L_0x006b:
            android.widget.LinearLayout r0 = r15.f13179k
            r6 = 48
            r0.setGravity(r6)
        L_0x0072:
            int r0 = r15.f13173e
            androidx.slice.widget.e r6 = r15.f13174f
            androidx.slice.SliceItem r6 = r6.f13359d
            r7 = 0
            r8 = 0
        L_0x007a:
            int r9 = r3.size()
            if (r8 >= r9) goto L_0x01a4
            android.widget.LinearLayout r9 = r15.f13179k
            int r9 = r9.getChildCount()
            if (r9 < r0) goto L_0x018f
            int r3 = r3.size()
            int r3 = r3 - r0
            if (r6 == 0) goto L_0x01a4
            android.widget.LinearLayout r0 = r15.f13179k
            int r6 = r0.getChildCount()
            int r6 = r6 + r1
            android.view.View r0 = r0.getChildAt(r6)
            android.widget.LinearLayout r6 = r15.f13179k
            r6.removeView(r0)
            androidx.slice.widget.e r6 = r15.f13174f
            androidx.slice.SliceItem r6 = r6.f13359d
            android.widget.LinearLayout r8 = r15.f13179k
            int r8 = r8.getChildCount()
            int r9 = r15.f13173e
            java.lang.String r10 = "slice"
            java.lang.String r11 = r6.f13092b
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00bf
            java.lang.String r10 = "action"
            java.lang.String r11 = r6.f13092b
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00cf
        L_0x00bf:
            androidx.slice.Slice r10 = r6.mo8596d()
            androidx.slice.SliceItem[] r10 = r10.f13088d
            java.util.List r10 = java.util.Arrays.asList(r10)
            int r10 = r10.size()
            if (r10 > 0) goto L_0x0186
        L_0x00cf:
            android.content.Context r10 = r15.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            androidx.slice.widget.e r11 = r15.f13174f
            boolean r11 = r11.f13356a
            r12 = 2131436524(0x7f0b23ec, float:1.849492E38)
            if (r11 == 0) goto L_0x0118
            r11 = 2131623991(0x7f0e0037, float:1.887515E38)
            android.widget.LinearLayout r13 = r15.f13179k
            android.view.View r10 = r10.inflate(r11, r13, r7)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r1, r1)
            r10.addView(r0, r7, r11)
            android.view.View r0 = r10.findViewById(r12)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11 = 2131434240(0x7f0b1b00, float:1.8490288E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.slice.b r12 = new androidx.slice.b
            android.content.Context r13 = r15.getContext()
            r14 = 16842800(0x1010030, float:2.3693693E-38)
            android.graphics.drawable.Drawable r13 = androidx.slice.widget.C4144av.m11883c(r13, r14)
            androidx.slice.widget.ao r14 = r15.f13265x
            float r14 = r14.f13313s
            r12.<init>(r13, r14)
            r11.setBackground(r12)
            goto L_0x014a
        L_0x0118:
            r0 = 2131623990(0x7f0e0036, float:1.8875147E38)
            android.widget.LinearLayout r11 = r15.f13179k
            android.view.View r0 = r10.inflate(r0, r11, r7)
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            android.view.View r0 = r10.findViewById(r12)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11 = 2131436523(0x7f0b23eb, float:1.8494919E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            androidx.slice.widget.ao r12 = r15.f13265x
            if (r12 == 0) goto L_0x014a
            androidx.slice.widget.q r13 = r15.f13266y
            if (r13 == 0) goto L_0x014a
            int r12 = r12.f13304j
            float r12 = (float) r12
            r11.setTextSize(r7, r12)
            androidx.slice.widget.q r12 = r15.f13266y
            int r12 = r12.mo8755c()
            r11.setTextColor(r12)
        L_0x014a:
            android.widget.LinearLayout r11 = r15.f13179k
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r7, r1, r13)
            r11.addView(r10, r12)
            android.content.res.Resources r1 = r15.getResources()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11[r7] = r3
            r3 = 2132082773(0x7f150055, float:1.980567E38)
            java.lang.String r1 = r1.getString(r3, r11)
            r0.setText(r1)
            androidx.slice.widget.c r0 = new androidx.slice.widget.c
            int r1 = r15.mo8706fy()
            int r3 = r15.f13171c
            r0.<init>(r1, r4, r2, r3)
            r0.mo8735a(r5, r8, r9)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r6, r0)
            r10.setTag(r1)
            r15.m11800u(r10)
            return
        L_0x0186:
            androidx.slice.widget.d r0 = new androidx.slice.widget.d
            r0.<init>(r6)
            r15.m11797r(r0, r8, r9)
            return
        L_0x018f:
            java.lang.Object r9 = r3.get(r8)
            androidx.slice.widget.d r9 = (androidx.slice.widget.C4148d) r9
            int r10 = r3.size()
            int r10 = java.lang.Math.min(r10, r0)
            r15.m11797r(r9, r8, r10)
            int r8 = r8 + 1
            goto L_0x007a
        L_0x01a4:
            return
        L_0x01a5:
            r15.mo8642f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.GridRowView.mo8641e():void");
    }

    /* renamed from: f */
    public final void mo8642f() {
        if (this.f13169a) {
            this.f13169a = false;
            getViewTreeObserver().removeOnPreDrawListener(this.f13168A);
        }
        this.f13179k.removeAllViews();
        setLayoutDirection(2);
        m11798s(false);
    }

    /* renamed from: fz */
    public void mo8643fz(C4130ah ahVar, boolean z, int i, int i2, C4141as asVar) {
        mo8642f();
        mo8709p(asVar);
        this.f13171c = i;
        this.f13172d = i2;
        this.f13174f = (C4149e) ahVar;
        if (!mo8647k()) {
            mo8641e();
        }
        this.f13179k.setPadding(this.f13260s, this.f13261t + mo8638b(), this.f13262u, this.f13263v + mo8637a());
    }

    /* renamed from: g */
    public final void mo8644g(int i, int i2, int i3, int i4) {
        super.mo8644g(i, i2, i3, i4);
        this.f13179k.setPadding(i, i2 + mo8638b(), i3, i4 + mo8637a());
    }

    /* renamed from: i */
    public final void mo8645i(int i) {
        this.f13257p = i;
        if (this.f13174f != null) {
            mo8642f();
            mo8641e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo8646j(SliceItem sliceItem, SliceItem sliceItem2, int i, ViewGroup viewGroup, boolean z) {
        IconCompat iconCompat;
        Drawable d;
        LinearLayout.LayoutParams layoutParams;
        int i2;
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        int i3;
        String str = sliceItem.f13092b;
        C4137ao aoVar = this.f13265x;
        boolean z2 = aoVar != null && aoVar.mo8720f();
        if (!"image".equals(str) || (iconCompat = (IconCompat) sliceItem.f13094d) == null || (d = iconCompat.mo5075d(getContext())) == null) {
            return false;
        }
        ImageView imageView = new ImageView(getContext());
        if (z2) {
            imageView.setImageDrawable(new C4102b(d, this.f13265x.f13313s));
        } else {
            imageView.setImageDrawable(d);
        }
        if (C4093a.m11737a(sliceItem.f13091a, "raw")) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            layoutParams = new LinearLayout.LayoutParams(this.f13174f.mo8738b(getContext()).x, this.f13174f.mo8738b(getContext()).y);
        } else if (C4093a.m11737a(sliceItem.f13091a, "large")) {
            if (z2) {
                scaleType2 = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType2 = ImageView.ScaleType.CENTER_CROP;
            }
            imageView.setScaleType(scaleType2);
            if (z) {
                i3 = -1;
            } else {
                i3 = this.f13175g;
            }
            layoutParams = new LinearLayout.LayoutParams(-1, i3);
        } else {
            boolean z3 = !C4093a.m11737a(sliceItem.f13091a, "no_tint");
            if (!z3) {
                i2 = this.f13176h;
            } else {
                i2 = this.f13178j;
            }
            if (z3) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            imageView.setScaleType(scaleType);
            layoutParams = new LinearLayout.LayoutParams(i2, i2);
        }
        if (i != -1 && !C4093a.m11737a(sliceItem.f13091a, "no_tint")) {
            imageView.setColorFilter(i);
        }
        if (sliceItem2 == null || this.f13179k.getChildCount() == this.f13173e - 1) {
            viewGroup.addView(imageView, layoutParams);
            return true;
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.abc_slice_grid_text_overlay_image, viewGroup, false);
        frameLayout.addView(imageView, 0, new FrameLayout.LayoutParams(-2, -2));
        ((TextView) frameLayout.findViewById(R.id.text_overlay)).setText((CharSequence) sliceItem2.f13094d);
        frameLayout.findViewById(R.id.tint_overlay).setBackground(new C4102b(C1877c.m5125a(getContext(), R.drawable.abc_slice_gradient), this.f13265x.f13313s));
        viewGroup.addView(frameLayout, layoutParams);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo8647k() {
        C4149e eVar = this.f13174f;
        if (eVar == null || !eVar.mo8711d()) {
            return true;
        }
        if (getWidth() == 0) {
            this.f13169a = true;
            getViewTreeObserver().addOnPreDrawListener(this.f13168A);
            return true;
        }
        this.f13173e = mo8639c();
        return false;
    }

    public final void onClick(View view) {
        SliceItem l;
        Pair pair = (Pair) view.getTag();
        SliceItem sliceItem = (SliceItem) pair.first;
        C4147c cVar = (C4147c) pair.second;
        if (sliceItem != null && (l = C4101h.m11759l(sliceItem, "action", (String) null)) != null) {
            try {
                l.mo8599g((Context) null, (Intent) null);
                C4141as asVar = this.f13256o;
                if (asVar != null) {
                    asVar.mo8726b(cVar, l);
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("GridRowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int a = this.f13265x.mo8715a(this.f13174f, this.f13267z) + this.f13261t + this.f13263v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
        this.f13179k.getLayoutParams().height = a;
        super.onMeasure(i, makeMeasureSpec);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f13170b.getLocationOnScreen(this.f13182n);
        this.f13170b.getBackground().setHotspot((float) ((int) (motionEvent.getRawX() - ((float) this.f13182n[0]))), (float) ((int) (motionEvent.getRawY() - ((float) this.f13182n[1]))));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13170b.setPressed(true);
        } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
            this.f13170b.setPressed(false);
        }
        return false;
    }

    public GridRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13182n = new int[2];
        this.f13173e = -1;
        this.f13168A = new C4151g(this);
        Resources resources = getContext().getResources();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f13179k = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(16);
        this.f13178j = resources.getDimensionPixelSize(R.dimen.abc_slice_icon_size);
        this.f13176h = resources.getDimensionPixelSize(R.dimen.abc_slice_small_image_size);
        this.f13175g = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_only_height);
        this.f13177i = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_min_width);
        this.f13180l = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_gutter);
        this.f13181m = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_text_padding);
        View view = new View(getContext());
        this.f13170b = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }
}
