package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class FlexboxLayout extends ViewGroup implements C142636a {

    /* renamed from: a */
    private int f386974a;

    /* renamed from: b */
    private int f386975b;

    /* renamed from: c */
    private int f386976c;

    /* renamed from: d */
    private int f386977d;

    /* renamed from: e */
    private int f386978e;

    /* renamed from: f */
    private int f386979f;

    /* renamed from: g */
    private Drawable f386980g;

    /* renamed from: h */
    private Drawable f386981h;

    /* renamed from: i */
    private int f386982i;

    /* renamed from: j */
    private int f386983j;

    /* renamed from: k */
    private int f386984k;

    /* renamed from: l */
    private int f386985l;

    /* renamed from: m */
    private int[] f386986m;

    /* renamed from: n */
    private SparseIntArray f386987n;

    /* renamed from: o */
    private C142640e f386988o;

    /* renamed from: p */
    private List f386989p;

    /* renamed from: q */
    private C142638c f386990q;

    /* compiled from: PG */
    public class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator CREATOR = new C142641f();

        /* renamed from: a */
        private int f386991a = 1;

        /* renamed from: b */
        private float f386992b = 0.0f;

        /* renamed from: c */
        private float f386993c = 1.0f;

        /* renamed from: d */
        private int f386994d = -1;

        /* renamed from: e */
        private float f386995e = -1.0f;

        /* renamed from: f */
        private int f386996f;

        /* renamed from: g */
        private int f386997g;

        /* renamed from: h */
        private int f386998h = 16777215;

        /* renamed from: i */
        private int f386999i = 16777215;

        /* renamed from: j */
        private boolean f387000j;

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
        }

        /* renamed from: a */
        public final float mo117337a() {
            return this.f386995e;
        }

        /* renamed from: b */
        public final float mo117338b() {
            return this.f386992b;
        }

        /* renamed from: c */
        public final float mo117339c() {
            return this.f386993c;
        }

        /* renamed from: d */
        public final int mo117340d() {
            return this.f386994d;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final int mo117341e() {
            return this.height;
        }

        /* renamed from: f */
        public final int mo117342f() {
            return this.bottomMargin;
        }

        /* renamed from: g */
        public final int mo117343g() {
            return this.leftMargin;
        }

        /* renamed from: h */
        public final int mo117344h() {
            return this.rightMargin;
        }

        /* renamed from: i */
        public final int mo117345i() {
            return this.topMargin;
        }

        /* renamed from: j */
        public final int mo117346j() {
            return this.f386999i;
        }

        /* renamed from: k */
        public final int mo117347k() {
            return this.f386998h;
        }

        /* renamed from: l */
        public final int mo117348l() {
            return this.f386997g;
        }

        /* renamed from: m */
        public final int mo117349m() {
            return this.f386996f;
        }

        /* renamed from: n */
        public final int mo117350n() {
            return this.f386991a;
        }

        /* renamed from: o */
        public final int mo117351o() {
            return this.width;
        }

        /* renamed from: p */
        public final boolean mo117352p() {
            return this.f387000j;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f386991a);
            parcel.writeFloat(this.f386992b);
            parcel.writeFloat(this.f386993c);
            parcel.writeInt(this.f386994d);
            parcel.writeFloat(this.f386995e);
            parcel.writeInt(this.f386996f);
            parcel.writeInt(this.f386997g);
            parcel.writeInt(this.f386998h);
            parcel.writeInt(this.f386999i);
            parcel.writeByte(this.f387000j ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C142646k.f387081b);
            this.f386991a = obtainStyledAttributes.getInt(8, 1);
            this.f386992b = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f386993c = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f386994d = obtainStyledAttributes.getInt(0, -1);
            this.f386995e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f386996f = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f386997g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f386998h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f386999i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f387000j = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f386991a = parcel.readInt();
            this.f386992b = parcel.readFloat();
            this.f386993c = parcel.readFloat();
            this.f386994d = parcel.readInt();
            this.f386995e = parcel.readFloat();
            this.f386996f = parcel.readInt();
            this.f386997g = parcel.readInt();
            this.f386998h = parcel.readInt();
            this.f386999i = parcel.readInt();
            this.f387000j = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f386991a = layoutParams.f386991a;
            this.f386992b = layoutParams.f386992b;
            this.f386993c = layoutParams.f386993c;
            this.f386994d = layoutParams.f386994d;
            this.f386995e = layoutParams.f386995e;
            this.f386996f = layoutParams.f386996f;
            this.f386997g = layoutParams.f386997g;
            this.f386998h = layoutParams.f386998h;
            this.f386999i = layoutParams.f386999i;
            this.f387000j = layoutParams.f387000j;
        }
    }

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final void m231266A(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f386980g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f386984k + i2);
            this.f386980g.draw(canvas);
        }
    }

    /* renamed from: B */
    private final void m231267B(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f386981h;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f386985l + i, i3 + i2);
            this.f386981h.draw(canvas);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m231268C(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r32 - r30
            int r4 = r33 - r31
            int r5 = r28.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r28.getPaddingTop()
            java.util.List r6 = r0.f386989p
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x0214
            java.util.List r9 = r0.f386989p
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C142637b) r9
            boolean r10 = r0.m231273H(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f386984k
            int r4 = r4 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f386976c
            r15 = 4
            r14 = 2
            r11 = 0
            if (r10 == 0) goto L_0x00c7
            r12 = 1
            if (r10 == r12) goto L_0x00bd
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00b0
            r7 = 3
            if (r10 == r7) goto L_0x0097
            if (r10 == r15) goto L_0x0078
            r7 = 5
            if (r10 != r7) goto L_0x0062
            int r7 = r9.f387044h
            int r10 = r9.f387045i
            int r7 = r7 - r10
            if (r7 == 0) goto L_0x0059
            int r10 = r9.f387041e
            int r10 = r3 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r3 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cc
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.f386976c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0078:
            int r7 = r9.f387044h
            int r10 = r9.f387045i
            int r7 = r7 - r10
            if (r7 == 0) goto L_0x0087
            int r10 = r9.f387041e
            int r10 = r3 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            float r7 = r10 / r13
            float r12 = (float) r1
            float r12 = r12 + r7
            int r13 = r3 - r2
            float r13 = (float) r13
            float r7 = r13 - r7
            r27 = r12
            r12 = r7
            r7 = r27
            goto L_0x00cc
        L_0x0097:
            float r7 = (float) r1
            int r10 = r9.f387044h
            int r13 = r9.f387045i
            int r10 = r10 - r13
            if (r10 == r12) goto L_0x00a3
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a5
        L_0x00a3:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a5:
            int r12 = r9.f387041e
            int r12 = r3 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r3 - r2
            float r12 = (float) r12
            goto L_0x00cc
        L_0x00b0:
            int r7 = r9.f387041e
            int r7 = r3 - r7
            float r7 = (float) r7
            float r7 = r7 / r13
            float r10 = (float) r1
            float r10 = r10 + r7
            int r12 = r3 - r2
            float r12 = (float) r12
            float r12 = r12 - r7
            goto L_0x00c5
        L_0x00bd:
            int r7 = r9.f387041e
            int r10 = r3 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
        L_0x00c5:
            r7 = r10
            goto L_0x00cb
        L_0x00c7:
            float r7 = (float) r1
            int r10 = r3 - r2
            float r12 = (float) r10
        L_0x00cb:
            r10 = 0
        L_0x00cc:
            float r17 = java.lang.Math.max(r10, r11)
            r13 = 0
        L_0x00d1:
            int r10 = r9.f387044h
            if (r13 >= r10) goto L_0x0208
            int r10 = r9.f387051o
            int r10 = r10 + r13
            android.view.View r18 = r0.mo117380w(r10)
            if (r18 == 0) goto L_0x01f8
            int r11 = r18.getVisibility()
            r14 = 8
            if (r11 != r14) goto L_0x00e8
            goto L_0x01f8
        L_0x00e8:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r14 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r14 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r14
            int r11 = r14.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r14.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.m231272G(r10, r13)
            if (r10 == 0) goto L_0x0107
            int r10 = r0.f386985l
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x010b
        L_0x0107:
            r19 = r12
            r20 = 0
        L_0x010b:
            int r10 = r9.f387044h
            int r10 = r10 + -1
            if (r13 != r10) goto L_0x011b
            int r10 = r0.f386983j
            r10 = r10 & r15
            if (r10 <= 0) goto L_0x011b
            int r10 = r0.f386985l
            r21 = r10
            goto L_0x011d
        L_0x011b:
            r21 = 0
        L_0x011d:
            int r10 = r0.f386975b
            r12 = 2
            if (r10 != r12) goto L_0x017b
            if (r29 == 0) goto L_0x0153
            com.google.android.flexbox.e r10 = r0.f386988o
            int r11 = java.lang.Math.round(r19)
            int r16 = r18.getMeasuredWidth()
            int r16 = r11 - r16
            int r11 = r18.getMeasuredHeight()
            int r22 = r4 - r11
            int r23 = java.lang.Math.round(r19)
            r11 = r18
            r24 = 2
            r12 = r9
            r25 = r13
            r13 = r16
            r26 = r1
            r1 = r14
            r14 = r22
            r22 = 4
            r15 = r23
            r16 = r4
            r10.mo117413i(r11, r12, r13, r14, r15, r16)
            goto L_0x01c1
        L_0x0153:
            r26 = r1
            r25 = r13
            r1 = r14
            r22 = 4
            r24 = 2
            com.google.android.flexbox.e r10 = r0.f386988o
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r4 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r4
            r10.mo117413i(r11, r12, r13, r14, r15, r16)
            goto L_0x01c1
        L_0x017b:
            r26 = r1
            r25 = r13
            r1 = r14
            r22 = 4
            r24 = 2
            if (r29 == 0) goto L_0x01a4
            com.google.android.flexbox.e r10 = r0.f386988o
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo117413i(r11, r12, r13, r14, r15, r16)
            goto L_0x01c1
        L_0x01a4:
            com.google.android.flexbox.e r10 = r0.f386988o
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo117413i(r11, r12, r13, r14, r15, r16)
        L_0x01c1:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01e9
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.mo117401a(r11, r12, r13, r14, r15)
            goto L_0x01f5
        L_0x01e9:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.mo117401a(r11, r12, r13, r14, r15)
        L_0x01f5:
            r12 = r19
            goto L_0x0200
        L_0x01f8:
            r26 = r1
            r25 = r13
            r22 = 4
            r24 = 2
        L_0x0200:
            int r13 = r25 + 1
            r1 = r26
            r14 = 2
            r15 = 4
            goto L_0x00d1
        L_0x0208:
            r26 = r1
            int r1 = r9.f387043g
            int r5 = r5 + r1
            int r4 = r4 - r1
            int r8 = r8 + 1
            r1 = r26
            goto L_0x001e
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m231268C(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m231269D(boolean r29, boolean r30, int r31, int r32, int r33, int r34) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingTop()
            int r2 = r28.getPaddingBottom()
            int r3 = r28.getPaddingRight()
            int r4 = r28.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r33 - r31
            int r6 = r6 - r3
            java.util.List r3 = r0.f386989p
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x0200
            java.util.List r9 = r0.f386989p
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C142637b) r9
            boolean r10 = r0.m231273H(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f386985l
            int r4 = r4 + r10
            int r6 = r6 - r10
        L_0x0032:
            int r10 = r0.f386976c
            r15 = 4
            r11 = 0
            if (r10 == 0) goto L_0x00c7
            r12 = 1
            if (r10 == r12) goto L_0x00bd
            r13 = 2
            r14 = 1073741824(0x40000000, float:2.0)
            if (r10 == r13) goto L_0x00b0
            r13 = 3
            if (r10 == r13) goto L_0x0097
            if (r10 == r15) goto L_0x0078
            r12 = 5
            if (r10 != r12) goto L_0x0062
            int r10 = r9.f387044h
            int r12 = r9.f387045i
            int r10 = r10 - r12
            if (r10 == 0) goto L_0x0059
            int r12 = r9.f387041e
            int r12 = r5 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x005a
        L_0x0059:
            r12 = 0
        L_0x005a:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r5 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00cc
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.f386976c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0078:
            int r10 = r9.f387044h
            int r12 = r9.f387045i
            int r10 = r10 - r12
            if (r10 == 0) goto L_0x0087
            int r12 = r9.f387041e
            int r12 = r5 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0088
        L_0x0087:
            r12 = 0
        L_0x0088:
            float r10 = r12 / r14
            float r13 = (float) r1
            float r13 = r13 + r10
            int r14 = r5 - r2
            float r14 = (float) r14
            float r10 = r14 - r10
            r27 = r13
            r13 = r10
            r10 = r27
            goto L_0x00cc
        L_0x0097:
            float r10 = (float) r1
            int r13 = r9.f387044h
            int r14 = r9.f387045i
            int r13 = r13 - r14
            if (r13 == r12) goto L_0x00a3
            int r13 = r13 + -1
            float r12 = (float) r13
            goto L_0x00a5
        L_0x00a3:
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x00a5:
            int r13 = r9.f387041e
            int r13 = r5 - r13
            float r13 = (float) r13
            float r12 = r13 / r12
            int r13 = r5 - r2
            float r13 = (float) r13
            goto L_0x00cc
        L_0x00b0:
            int r10 = r9.f387041e
            int r10 = r5 - r10
            float r10 = (float) r10
            float r10 = r10 / r14
            float r12 = (float) r1
            float r12 = r12 + r10
            int r13 = r5 - r2
            float r13 = (float) r13
            float r13 = r13 - r10
            goto L_0x00c5
        L_0x00bd:
            int r10 = r9.f387041e
            int r12 = r5 - r10
            int r12 = r12 + r2
            float r12 = (float) r12
            int r10 = r10 - r1
            float r13 = (float) r10
        L_0x00c5:
            r10 = r12
            goto L_0x00cb
        L_0x00c7:
            float r10 = (float) r1
            int r12 = r5 - r2
            float r13 = (float) r12
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            float r18 = java.lang.Math.max(r12, r11)
            r14 = 0
        L_0x00d1:
            int r11 = r9.f387044h
            if (r14 >= r11) goto L_0x01f8
            int r11 = r9.f387051o
            int r11 = r11 + r14
            android.view.View r19 = r0.mo117380w(r11)
            if (r19 == 0) goto L_0x01ef
            int r12 = r19.getVisibility()
            r7 = 8
            if (r12 != r7) goto L_0x00e8
            goto L_0x01ef
        L_0x00e8:
            android.view.ViewGroup$LayoutParams r7 = r19.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r7
            int r12 = r7.topMargin
            float r12 = (float) r12
            float r10 = r10 + r12
            int r12 = r7.bottomMargin
            float r12 = (float) r12
            float r13 = r13 - r12
            boolean r11 = r0.m231272G(r11, r14)
            if (r11 == 0) goto L_0x0108
            int r11 = r0.f386984k
            float r12 = (float) r11
            float r10 = r10 + r12
            float r13 = r13 - r12
            r20 = r10
            r22 = r11
            r21 = r13
            goto L_0x010e
        L_0x0108:
            r20 = r10
            r21 = r13
            r22 = 0
        L_0x010e:
            int r10 = r9.f387044h
            int r10 = r10 + -1
            if (r14 != r10) goto L_0x011e
            int r10 = r0.f386982i
            r10 = r10 & r15
            if (r10 <= 0) goto L_0x011e
            int r10 = r0.f386984k
            r23 = r10
            goto L_0x0120
        L_0x011e:
            r23 = 0
        L_0x0120:
            if (r29 == 0) goto L_0x0172
            if (r30 == 0) goto L_0x014e
            com.google.android.flexbox.e r10 = r0.f386988o
            r13 = 1
            int r11 = r19.getMeasuredWidth()
            int r16 = r6 - r11
            int r11 = java.lang.Math.round(r21)
            int r12 = r19.getMeasuredHeight()
            int r17 = r11 - r12
            int r24 = java.lang.Math.round(r21)
            r11 = r19
            r12 = r9
            r25 = r14
            r14 = r16
            r26 = 4
            r15 = r17
            r16 = r6
            r17 = r24
            r10.mo117414j(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01b5
        L_0x014e:
            r25 = r14
            r26 = 4
            com.google.android.flexbox.e r10 = r0.f386988o
            r13 = 1
            int r11 = r19.getMeasuredWidth()
            int r14 = r6 - r11
            int r15 = java.lang.Math.round(r20)
            int r11 = java.lang.Math.round(r20)
            int r12 = r19.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r19
            r12 = r9
            r16 = r6
            r10.mo117414j(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01b5
        L_0x0172:
            r25 = r14
            r26 = 4
            if (r30 == 0) goto L_0x0197
            com.google.android.flexbox.e r10 = r0.f386988o
            r13 = 0
            int r11 = java.lang.Math.round(r21)
            int r12 = r19.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r19.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r21)
            r11 = r19
            r12 = r9
            r14 = r4
            r10.mo117414j(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01b5
        L_0x0197:
            com.google.android.flexbox.e r10 = r0.f386988o
            r13 = 0
            int r15 = java.lang.Math.round(r20)
            int r11 = r19.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r20)
            int r12 = r19.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r19
            r12 = r9
            r14 = r4
            r10.mo117414j(r11, r12, r13, r14, r15, r16, r17)
        L_0x01b5:
            int r10 = r19.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r18
            int r11 = r7.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 + r10
            int r10 = r19.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r18
            int r7 = r7.topMargin
            float r7 = (float) r7
            float r10 = r10 + r7
            float r21 = r21 - r10
            if (r30 == 0) goto L_0x01de
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r19
            r13 = r23
            r15 = r22
            r10.mo117401a(r11, r12, r13, r14, r15)
            goto L_0x01ea
        L_0x01de:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r19
            r13 = r22
            r15 = r23
            r10.mo117401a(r11, r12, r13, r14, r15)
        L_0x01ea:
            r10 = r20
            r13 = r21
            goto L_0x01f3
        L_0x01ef:
            r25 = r14
            r26 = 4
        L_0x01f3:
            int r14 = r25 + 1
            r15 = 4
            goto L_0x00d1
        L_0x01f8:
            int r7 = r9.f387043g
            int r4 = r4 + r7
            int r6 = r6 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m231269D(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: E */
    private final void m231270E(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = mo117368n() + getPaddingTop() + getPaddingBottom();
            i6 = mo117366l();
        } else if (i == 2 || i == 3) {
            i5 = mo117366l();
            i6 = mo117368n() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    /* renamed from: G */
    private final boolean m231272G(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View w = mo117380w(i - i3);
            if (w != null && w.getVisibility() != 8) {
                return mo117379v() ? (this.f386983j & 2) != 0 : (this.f386982i & 2) != 0;
            }
        }
        return mo117379v() ? (this.f386983j & 1) != 0 : (this.f386982i & 1) != 0;
    }

    /* renamed from: H */
    private final boolean m231273H(int i) {
        if (i >= 0 && i < this.f386989p.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                C142637b bVar = (C142637b) this.f386989p.get(i2);
                if (bVar.f387044h - bVar.f387045i > 0) {
                    return mo117379v() ? (this.f386982i & 2) != 0 : (this.f386983j & 2) != 0;
                }
            }
            if (mo117379v()) {
                return (this.f386982i & 1) != 0;
            }
            if ((this.f386983j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    private final boolean m231274I(int i) {
        if (i >= 0 && i < this.f386989p.size()) {
            for (int i2 = i + 1; i2 < this.f386989p.size(); i2++) {
                C142637b bVar = (C142637b) this.f386989p.get(i2);
                if (bVar.f387044h - bVar.f387045i > 0) {
                    return false;
                }
            }
            if (mo117379v()) {
                return (this.f386982i & 4) != 0;
            }
            if ((this.f386983j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m231275a(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f386989p.size();
        for (int i5 = 0; i5 < size; i5++) {
            C142637b bVar = (C142637b) this.f386989p.get(i5);
            for (int i6 = 0; i6 < bVar.f387044h; i6++) {
                int i7 = bVar.f387051o + i6;
                View w = mo117380w(i7);
                if (!(w == null || w.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) w.getLayoutParams();
                    if (m231272G(i7, i6)) {
                        if (z) {
                            i4 = w.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (w.getLeft() - layoutParams.leftMargin) - this.f386985l;
                        }
                        m231267B(canvas, i4, bVar.f387038b, bVar.f387043g);
                    }
                    if (i6 == bVar.f387044h - 1 && (this.f386983j & 4) > 0) {
                        if (z) {
                            i3 = (w.getLeft() - layoutParams.leftMargin) - this.f386985l;
                        } else {
                            i3 = w.getRight() + layoutParams.rightMargin;
                        }
                        m231267B(canvas, i3, bVar.f387038b, bVar.f387043g);
                    }
                }
            }
            if (m231273H(i5)) {
                if (z2) {
                    i2 = bVar.f387040d;
                } else {
                    i2 = bVar.f387038b - this.f386984k;
                }
                m231266A(canvas, paddingLeft, i2, max);
            }
            if (m231274I(i5) && (this.f386982i & 4) > 0) {
                if (z2) {
                    i = bVar.f387038b - this.f386984k;
                } else {
                    i = bVar.f387040d;
                }
                m231266A(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: b */
    private final void m231276b(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f386989p.size();
        for (int i5 = 0; i5 < size; i5++) {
            C142637b bVar = (C142637b) this.f386989p.get(i5);
            for (int i6 = 0; i6 < bVar.f387044h; i6++) {
                int i7 = bVar.f387051o + i6;
                View w = mo117380w(i7);
                if (!(w == null || w.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) w.getLayoutParams();
                    if (m231272G(i7, i6)) {
                        if (z2) {
                            i4 = w.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (w.getTop() - layoutParams.topMargin) - this.f386984k;
                        }
                        m231266A(canvas, bVar.f387037a, i4, bVar.f387043g);
                    }
                    if (i6 == bVar.f387044h - 1 && (this.f386982i & 4) > 0) {
                        if (z2) {
                            i3 = (w.getTop() - layoutParams.topMargin) - this.f386984k;
                        } else {
                            i3 = w.getBottom() + layoutParams.bottomMargin;
                        }
                        m231266A(canvas, bVar.f387037a, i3, bVar.f387043g);
                    }
                }
            }
            if (m231273H(i5)) {
                if (z) {
                    i2 = bVar.f387039c;
                } else {
                    i2 = bVar.f387037a - this.f386985l;
                }
                m231267B(canvas, i2, paddingTop, max);
            }
            if (m231274I(i5) && (this.f386983j & 4) > 0) {
                if (z) {
                    i = bVar.f387037a - this.f386985l;
                } else {
                    i = bVar.f387039c;
                }
                m231267B(canvas, i, paddingTop, max);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f386987n == null) {
            this.f386987n = new SparseIntArray(getChildCount());
        }
        C142640e eVar = this.f386988o;
        SparseIntArray sparseIntArray = this.f386987n;
        int j = eVar.f387057a.mo117364j();
        List a = eVar.mo117405a(j);
        C142639d dVar = new C142639d();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            dVar.f387056b = 1;
        } else {
            dVar.f387056b = ((FlexItem) layoutParams).mo117350n();
        }
        if (i == -1 || i == j) {
            dVar.f387055a = j;
        } else if (i < eVar.f387057a.mo117364j()) {
            dVar.f387055a = i;
            for (int i2 = i; i2 < j; i2++) {
                ((C142639d) a.get(i2)).f387055a++;
            }
        } else {
            dVar.f387055a = j;
        }
        a.add(dVar);
        this.f386986m = C142640e.m231409m(j + 1, a, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public final int mo117354c() {
        return this.f386978e;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final int mo117356d() {
        return this.f386977d;
    }

    /* renamed from: e */
    public final int mo117357e(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: f */
    public final int mo117358f(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: g */
    public final int mo117359g(View view) {
        return 0;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final int mo117362h(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo117379v()) {
            if (m231272G(i, i2)) {
                i4 = this.f386985l;
            }
            if ((this.f386983j & 4) > 0) {
                i3 = this.f386985l;
            }
            return i4;
        }
        if (m231272G(i, i2)) {
            i4 = this.f386984k;
        }
        if ((this.f386982i & 4) > 0) {
            i3 = this.f386984k;
        }
        return i4;
        return i4 + i3;
    }

    /* renamed from: i */
    public final int mo117363i() {
        return this.f386974a;
    }

    /* renamed from: j */
    public final int mo117364j() {
        return getChildCount();
    }

    /* renamed from: k */
    public final int mo117365k() {
        return this.f386975b;
    }

    /* renamed from: l */
    public final int mo117366l() {
        int i = LinearLayoutManager.INVALID_OFFSET;
        for (C142637b bVar : this.f386989p) {
            i = Math.max(i, bVar.f387041e);
        }
        return i;
    }

    /* renamed from: m */
    public final int mo117367m() {
        return this.f386979f;
    }

    /* renamed from: n */
    public final int mo117368n() {
        int i;
        int i2;
        int size = this.f386989p.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C142637b bVar = (C142637b) this.f386989p.get(i4);
            if (m231273H(i4)) {
                if (mo117379v()) {
                    i2 = this.f386984k;
                } else {
                    i2 = this.f386985l;
                }
                i3 += i2;
            }
            if (m231274I(i4)) {
                if (mo117379v()) {
                    i = this.f386984k;
                } else {
                    i = this.f386985l;
                }
                i3 += i;
            }
            i3 += bVar.f387043g;
        }
        return i3;
    }

    /* renamed from: o */
    public final View mo117369o(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f386981h != null || this.f386980g != null) {
            if (this.f386982i != 0 || this.f386983j != 0) {
                int f = C2043bi.m5577f(this);
                int i = this.f386974a;
                boolean z = false;
                boolean z2 = true;
                if (i == 0) {
                    boolean z3 = f == 1;
                    if (this.f386975b == 2) {
                        z = true;
                    }
                    m231275a(canvas, z3, z);
                } else if (i == 1) {
                    boolean z4 = f != 1;
                    if (this.f386975b == 2) {
                        z = true;
                    }
                    m231275a(canvas, z4, z);
                } else if (i == 2) {
                    boolean z5 = f != 1;
                    if (f != 1) {
                        z2 = false;
                    }
                    if (this.f386975b != 2) {
                        z5 = z2;
                    }
                    m231276b(canvas, z5, false);
                } else if (i == 3) {
                    boolean z6 = f != 1;
                    if (f == 1) {
                        z = true;
                    }
                    if (this.f386975b != 2) {
                        z6 = z;
                    }
                    m231276b(canvas, z6, true);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f = C2043bi.m5577f(this);
        int i5 = this.f386974a;
        boolean z2 = false;
        if (i5 == 0) {
            m231268C(f == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            m231268C(f != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            boolean z3 = f != 1;
            if (f == 1) {
                z2 = true;
            }
            if (this.f386975b != 2) {
                z3 = z2;
            }
            m231269D(z3, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            boolean z4 = f != 1;
            if (f == 1) {
                z2 = true;
            }
            if (this.f386975b != 2) {
                z4 = z2;
            }
            m231269D(z4, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f386974a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f386987n == null) {
            this.f386987n = new SparseIntArray(getChildCount());
        }
        C142640e eVar = this.f386988o;
        SparseIntArray sparseIntArray = this.f386987n;
        int j = eVar.f387057a.mo117364j();
        if (sparseIntArray.size() == j) {
            int i3 = 0;
            while (true) {
                if (i3 >= j) {
                    break;
                }
                View o = eVar.f387057a.mo117369o(i3);
                if (o != null && ((FlexItem) o.getLayoutParams()).mo117350n() != sparseIntArray.get(i3)) {
                    break;
                }
                i3++;
            }
        }
        C142640e eVar2 = this.f386988o;
        SparseIntArray sparseIntArray2 = this.f386987n;
        int j2 = eVar2.f387057a.mo117364j();
        this.f386986m = C142640e.m231409m(j2, eVar2.mo117405a(j2), sparseIntArray2);
        int i4 = this.f386974a;
        if (i4 == 0 || i4 == 1) {
            this.f386989p.clear();
            this.f386990q.mo117402a();
            this.f386988o.mo117406b(this.f386990q, i, i2, Integer.MAX_VALUE, 0, -1, (List) null);
            this.f386989p = this.f386990q.f387053a;
            this.f386988o.mo117409e(i, i2, 0);
            if (this.f386977d == 3) {
                for (C142637b bVar : this.f386989p) {
                    int i5 = LinearLayoutManager.INVALID_OFFSET;
                    for (int i6 = 0; i6 < bVar.f387044h; i6++) {
                        View w = mo117380w(bVar.f387051o + i6);
                        if (!(w == null || w.getVisibility() == 8)) {
                            LayoutParams layoutParams = (LayoutParams) w.getLayoutParams();
                            if (this.f386975b != 2) {
                                i5 = Math.max(i5, w.getMeasuredHeight() + Math.max(bVar.f387048l - w.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                            } else {
                                int i7 = bVar.f387048l;
                                int measuredHeight = w.getMeasuredHeight();
                                i5 = Math.max(i5, w.getMeasuredHeight() + layoutParams.topMargin + Math.max((i7 - measuredHeight) + w.getBaseline(), layoutParams.bottomMargin));
                            }
                        }
                    }
                    bVar.f387043g = i5;
                }
            }
            this.f386988o.mo117408d(i, i2, getPaddingTop() + getPaddingBottom());
            this.f386988o.mo117415k(0);
            m231270E(this.f386974a, i, i2, this.f386990q.f387054b);
        } else if (i4 == 2 || i4 == 3) {
            this.f386989p.clear();
            this.f386990q.mo117402a();
            this.f386988o.mo117406b(this.f386990q, i2, i, Integer.MAX_VALUE, 0, -1, (List) null);
            this.f386989p = this.f386990q.f387053a;
            this.f386988o.mo117409e(i, i2, 0);
            this.f386988o.mo117408d(i, i2, getPaddingLeft() + getPaddingRight());
            this.f386988o.mo117415k(0);
            m231270E(this.f386974a, i, i2, this.f386990q.f387054b);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f386974a);
        }
    }

    /* renamed from: p */
    public final View mo117373p(int i) {
        return mo117380w(i);
    }

    /* renamed from: q */
    public final List mo117374q() {
        return this.f386989p;
    }

    /* renamed from: r */
    public final void mo117375r(View view, int i, int i2, C142637b bVar) {
        int i3;
        int i4;
        if (m231272G(i, i2)) {
            if (mo117379v()) {
                i3 = bVar.f387041e;
                i4 = this.f386985l;
            } else {
                i3 = bVar.f387041e;
                i4 = this.f386984k;
            }
            bVar.f387041e = i3 + i4;
            bVar.f387042f += i4;
        }
    }

    /* renamed from: s */
    public final void mo117376s(C142637b bVar) {
        int i;
        int i2;
        if (mo117379v()) {
            if ((this.f386983j & 4) > 0) {
                i = bVar.f387041e;
                i2 = this.f386985l;
            } else {
                return;
            }
        } else if ((this.f386982i & 4) > 0) {
            i = bVar.f387041e;
            i2 = this.f386984k;
        } else {
            return;
        }
        bVar.f387041e = i + i2;
        bVar.f387042f += i2;
    }

    /* renamed from: t */
    public final void mo117377t(List list) {
        this.f386989p = list;
    }

    /* renamed from: u */
    public final void mo117378u(int i, View view) {
    }

    /* renamed from: v */
    public final boolean mo117379v() {
        int i = this.f386974a;
        return i == 0 || i == 1;
    }

    /* renamed from: w */
    public final View mo117380w(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f386986m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* renamed from: x */
    public final void mo117381x(Drawable drawable) {
        if (drawable != this.f386980g) {
            this.f386980g = drawable;
            this.f386984k = drawable.getIntrinsicHeight();
            m231271F();
            requestLayout();
        }
    }

    /* renamed from: y */
    public final void mo117382y(Drawable drawable) {
        if (drawable != this.f386981h) {
            this.f386981h = drawable;
            this.f386985l = drawable.getIntrinsicWidth();
            m231271F();
            requestLayout();
        }
    }

    /* renamed from: z */
    public final void mo117383z() {
        if (this.f386975b != 1) {
            this.f386975b = 1;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: F */
    private final void m231271F() {
        if (this.f386980g == null && this.f386981h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f386979f = -1;
        this.f386988o = new C142640e(this);
        this.f386989p = new ArrayList();
        this.f386990q = new C142638c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C142646k.f387080a, i, 0);
        this.f386974a = obtainStyledAttributes.getInt(5, 0);
        this.f386975b = obtainStyledAttributes.getInt(6, 0);
        this.f386976c = obtainStyledAttributes.getInt(7, 0);
        this.f386977d = obtainStyledAttributes.getInt(1, 4);
        this.f386978e = obtainStyledAttributes.getInt(0, 5);
        this.f386979f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            mo117381x(drawable);
            mo117382y(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            mo117381x(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            mo117382y(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.f386983j = i2;
            this.f386982i = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.f386983j = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.f386982i = i4;
        }
        obtainStyledAttributes.recycle();
    }
}
