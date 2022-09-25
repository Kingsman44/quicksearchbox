package android.support.p033v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.core.widget.NestedScrollView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.app.m */
/* compiled from: PG */
public class C0392m extends C0358as implements DialogInterface {

    /* renamed from: a */
    public final AlertController f1349a = new AlertController(getContext(), this, getWindow());

    protected C0392m(Context context, int i) {
        super(context, m1300a(context, i));
    }

    /* renamed from: a */
    static int m1300a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            super.onCreate(r18)
            r0 = r17
            android.support.v7.app.AlertController r1 = r0.f1349a
            int r2 = r1.f1093C
            if (r2 != 0) goto L_0x000e
            int r2 = r1.f1092B
            goto L_0x0010
        L_0x000e:
            int r2 = r1.f1092B
        L_0x0010:
            android.support.v7.app.as r3 = r1.f1102b
            r3.setContentView((int) r2)
            android.view.Window r2 = r1.f1103c
            r3 = 2131434279(0x7f0b1b27, float:1.8490367E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2131436654(0x7f0b246e, float:1.8495185E38)
            android.view.View r4 = r2.findViewById(r3)
            r5 = 2131429968(0x7f0b0a50, float:1.8481624E38)
            android.view.View r6 = r2.findViewById(r5)
            r7 = 2131429410(0x7f0b0822, float:1.8480492E38)
            android.view.View r8 = r2.findViewById(r7)
            r9 = 2131430076(0x7f0b0abc, float:1.8481843E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r9 = r1.f1107g
            r11 = 0
            if (r9 != 0) goto L_0x0053
            int r9 = r1.f1108h
            if (r9 == 0) goto L_0x0052
            android.content.Context r9 = r1.f1101a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r12 = r1.f1108h
            android.view.View r9 = r9.inflate(r12, r2, r11)
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0057
            r13 = 1
            goto L_0x0058
        L_0x0057:
            r13 = 0
        L_0x0058:
            r14 = -1
            r15 = 8
            if (r13 == 0) goto L_0x0063
            boolean r16 = android.support.p033v7.app.AlertController.m1036e(r9)
            if (r16 != 0) goto L_0x006c
        L_0x0063:
            android.view.Window r10 = r1.f1103c
            r12 = 131072(0x20000, float:1.83671E-40)
            r10.setFlags(r12, r12)
            if (r13 == 0) goto L_0x008f
        L_0x006c:
            android.view.Window r10 = r1.f1103c
            r12 = 2131430075(0x7f0b0abb, float:1.848184E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r12.<init>(r14, r14)
            r10.addView(r9, r12)
            boolean r9 = r1.f1109i
            android.widget.ListView r9 = r1.f1106f
            if (r9 == 0) goto L_0x0092
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            android.support.v7.widget.dl r9 = (android.support.p033v7.widget.C0596dl) r9
            r10 = 0
            r9.weight = r10
            goto L_0x0092
        L_0x008f:
            r2.setVisibility(r15)
        L_0x0092:
            android.view.View r3 = r2.findViewById(r3)
            android.view.View r5 = r2.findViewById(r5)
            android.view.View r7 = r2.findViewById(r7)
            android.view.ViewGroup r3 = android.support.p033v7.app.AlertController.m1038g(r3, r4)
            android.view.ViewGroup r4 = android.support.p033v7.app.AlertController.m1038g(r5, r6)
            android.view.ViewGroup r5 = android.support.p033v7.app.AlertController.m1038g(r7, r8)
            android.view.Window r6 = r1.f1103c
            r7 = 2131435517(0x7f0b1ffd, float:1.8492878E38)
            android.view.View r6 = r6.findViewById(r7)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r1.f1119s = r6
            androidx.core.widget.NestedScrollView r6 = r1.f1119s
            r6.setFocusable(r11)
            androidx.core.widget.NestedScrollView r6 = r1.f1119s
            androidx.core.j.z r6 = r6.f6033c
            r6.mo5279a(r11)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f1124x = r6
            android.widget.TextView r6 = r1.f1124x
            if (r6 != 0) goto L_0x00d3
            goto L_0x0108
        L_0x00d3:
            java.lang.CharSequence r7 = r1.f1105e
            if (r7 == 0) goto L_0x00db
            r6.setText(r7)
            goto L_0x0108
        L_0x00db:
            r6.setVisibility(r15)
            androidx.core.widget.NestedScrollView r6 = r1.f1119s
            android.widget.TextView r7 = r1.f1124x
            r6.removeView(r7)
            android.widget.ListView r6 = r1.f1106f
            if (r6 == 0) goto L_0x0105
            androidx.core.widget.NestedScrollView r6 = r1.f1119s
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.core.widget.NestedScrollView r7 = r1.f1119s
            int r7 = r6.indexOfChild(r7)
            r6.removeViewAt(r7)
            android.widget.ListView r8 = r1.f1106f
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r9.<init>(r14, r14)
            r6.addView(r8, r7, r9)
            goto L_0x0108
        L_0x0105:
            r4.setVisibility(r15)
        L_0x0108:
            r6 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1.f1110j = r6
            android.widget.Button r6 = r1.f1110j
            android.view.View$OnClickListener r7 = r1.f1100J
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r1.f1111k
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0129
            android.widget.Button r6 = r1.f1110j
            r6.setVisibility(r15)
            r6 = 0
            goto L_0x0136
        L_0x0129:
            android.widget.Button r6 = r1.f1110j
            java.lang.CharSequence r7 = r1.f1111k
            r6.setText(r7)
            android.widget.Button r6 = r1.f1110j
            r6.setVisibility(r11)
            r6 = 1
        L_0x0136:
            r7 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f1113m = r7
            android.widget.Button r7 = r1.f1113m
            android.view.View$OnClickListener r8 = r1.f1100J
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f1114n
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0156
            android.widget.Button r7 = r1.f1113m
            r7.setVisibility(r15)
            goto L_0x0164
        L_0x0156:
            android.widget.Button r7 = r1.f1113m
            java.lang.CharSequence r8 = r1.f1114n
            r7.setText(r8)
            android.widget.Button r7 = r1.f1113m
            r7.setVisibility(r11)
            r6 = r6 | 2
        L_0x0164:
            r7 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f1116p = r7
            android.widget.Button r7 = r1.f1116p
            android.view.View$OnClickListener r8 = r1.f1100J
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f1117q
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0184
            android.widget.Button r7 = r1.f1116p
            r7.setVisibility(r15)
            goto L_0x0192
        L_0x0184:
            android.widget.Button r7 = r1.f1116p
            java.lang.CharSequence r8 = r1.f1117q
            r7.setText(r8)
            android.widget.Button r7 = r1.f1116p
            r7.setVisibility(r11)
            r6 = r6 | 4
        L_0x0192:
            android.content.Context r7 = r1.f1101a
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r7 = r7.getTheme()
            r9 = 2130968657(0x7f040051, float:1.7545974E38)
            r10 = 1
            r7.resolveAttribute(r9, r8, r10)
            int r7 = r8.data
            r8 = 2
            if (r7 == 0) goto L_0x01bc
            if (r6 != r10) goto L_0x01b1
            android.widget.Button r6 = r1.f1110j
        L_0x01ad:
            android.support.p033v7.app.AlertController.m1037f(r6)
            goto L_0x01c1
        L_0x01b1:
            if (r6 != r8) goto L_0x01b6
            android.widget.Button r6 = r1.f1113m
            goto L_0x01ad
        L_0x01b6:
            r7 = 4
            if (r6 != r7) goto L_0x01bc
            android.widget.Button r6 = r1.f1116p
            goto L_0x01ad
        L_0x01bc:
            if (r6 != 0) goto L_0x01c1
            r5.setVisibility(r15)
        L_0x01c1:
            android.view.View r6 = r1.f1125y
            r7 = 2131436609(0x7f0b2441, float:1.8495093E38)
            if (r6 == 0) goto L_0x01de
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r6.<init>(r14, r9)
            android.view.View r9 = r1.f1125y
            r3.addView(r9, r11, r6)
            android.view.Window r6 = r1.f1103c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            goto L_0x0253
        L_0x01de:
            android.view.Window r6 = r1.f1103c
            r9 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r6.findViewById(r9)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f1122v = r6
            java.lang.CharSequence r6 = r1.f1104d
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0242
            boolean r6 = r1.f1098H
            if (r6 == 0) goto L_0x0242
            android.view.Window r6 = r1.f1103c
            r7 = 2131427686(0x7f0b0166, float:1.8476995E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f1123w = r6
            android.widget.TextView r6 = r1.f1123w
            java.lang.CharSequence r7 = r1.f1104d
            r6.setText(r7)
            int r6 = r1.f1120t
            if (r6 == 0) goto L_0x0215
            android.widget.ImageView r7 = r1.f1122v
            r7.setImageResource(r6)
            goto L_0x0253
        L_0x0215:
            android.graphics.drawable.Drawable r6 = r1.f1121u
            if (r6 == 0) goto L_0x021f
            android.widget.ImageView r7 = r1.f1122v
            r7.setImageDrawable(r6)
            goto L_0x0253
        L_0x021f:
            android.widget.TextView r6 = r1.f1123w
            android.widget.ImageView r7 = r1.f1122v
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r9 = r1.f1122v
            int r9 = r9.getPaddingTop()
            android.widget.ImageView r10 = r1.f1122v
            int r10 = r10.getPaddingRight()
            android.widget.ImageView r12 = r1.f1122v
            int r12 = r12.getPaddingBottom()
            r6.setPadding(r7, r9, r10, r12)
            android.widget.ImageView r6 = r1.f1122v
            r6.setVisibility(r15)
            goto L_0x0253
        L_0x0242:
            android.view.Window r6 = r1.f1103c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r1.f1122v
            r6.setVisibility(r15)
            r3.setVisibility(r15)
        L_0x0253:
            if (r2 == 0) goto L_0x025d
            int r2 = r2.getVisibility()
            if (r2 == r15) goto L_0x025d
            r2 = 1
            goto L_0x025e
        L_0x025d:
            r2 = 0
        L_0x025e:
            if (r3 == 0) goto L_0x0268
            int r6 = r3.getVisibility()
            if (r6 == r15) goto L_0x0268
            r10 = 1
            goto L_0x0269
        L_0x0268:
            r10 = 0
        L_0x0269:
            if (r5 == 0) goto L_0x0273
            int r5 = r5.getVisibility()
            if (r5 == r15) goto L_0x0273
            r5 = 1
            goto L_0x0274
        L_0x0273:
            r5 = 0
        L_0x0274:
            if (r5 != 0) goto L_0x0284
            if (r4 == 0) goto L_0x0284
            r6 = 2131436491(0x7f0b23cb, float:1.8494854E38)
            android.view.View r6 = r4.findViewById(r6)
            if (r6 == 0) goto L_0x0284
            r6.setVisibility(r11)
        L_0x0284:
            if (r10 == 0) goto L_0x02a6
            androidx.core.widget.NestedScrollView r6 = r1.f1119s
            if (r6 == 0) goto L_0x028e
            r7 = 1
            r6.setClipToPadding(r7)
        L_0x028e:
            java.lang.CharSequence r6 = r1.f1105e
            if (r6 != 0) goto L_0x0299
            android.widget.ListView r6 = r1.f1106f
            if (r6 == 0) goto L_0x0297
            goto L_0x0299
        L_0x0297:
            r3 = 0
            goto L_0x02a0
        L_0x0299:
            r6 = 2131436601(0x7f0b2439, float:1.8495077E38)
            android.view.View r3 = r3.findViewById(r6)
        L_0x02a0:
            if (r3 == 0) goto L_0x02b4
            r3.setVisibility(r11)
            goto L_0x02b4
        L_0x02a6:
            if (r4 == 0) goto L_0x02b4
            r3 = 2131436492(0x7f0b23cc, float:1.8494856E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L_0x02b4
            r3.setVisibility(r11)
        L_0x02b4:
            android.widget.ListView r3 = r1.f1106f
            boolean r6 = r3 instanceof android.support.p033v7.app.AlertController.RecycleListView
            if (r6 == 0) goto L_0x02e0
            if (r5 == 0) goto L_0x02c0
            if (r10 != 0) goto L_0x02e0
            r6 = 0
            goto L_0x02c1
        L_0x02c0:
            r6 = r10
        L_0x02c1:
            android.support.v7.app.AlertController$RecycleListView r3 = (android.support.p033v7.app.AlertController.RecycleListView) r3
            int r7 = r3.getPaddingLeft()
            if (r6 == 0) goto L_0x02ce
            int r6 = r3.getPaddingTop()
            goto L_0x02d0
        L_0x02ce:
            int r6 = r3.f1127a
        L_0x02d0:
            int r9 = r3.getPaddingRight()
            if (r5 == 0) goto L_0x02db
            int r12 = r3.getPaddingBottom()
            goto L_0x02dd
        L_0x02db:
            int r12 = r3.f1128b
        L_0x02dd:
            r3.setPadding(r7, r6, r9, r12)
        L_0x02e0:
            if (r2 != 0) goto L_0x0310
            android.widget.ListView r2 = r1.f1106f
            if (r2 != 0) goto L_0x02e8
            androidx.core.widget.NestedScrollView r2 = r1.f1119s
        L_0x02e8:
            if (r2 == 0) goto L_0x0310
            r3 = 1
            if (r3 == r5) goto L_0x02ee
            goto L_0x02ef
        L_0x02ee:
            r11 = 2
        L_0x02ef:
            android.view.Window r3 = r1.f1103c
            r5 = 2131435516(0x7f0b1ffc, float:1.8492876E38)
            android.view.View r3 = r3.findViewById(r5)
            android.view.Window r5 = r1.f1103c
            r6 = 2131435515(0x7f0b1ffb, float:1.8492874E38)
            android.view.View r5 = r5.findViewById(r6)
            r6 = r10 | r11
            androidx.core.p098j.C2043bi.m5541aH(r2, r6)
            if (r3 == 0) goto L_0x030b
            r4.removeView(r3)
        L_0x030b:
            if (r5 == 0) goto L_0x0310
            r4.removeView(r5)
        L_0x0310:
            android.widget.ListView r2 = r1.f1106f
            if (r2 == 0) goto L_0x0326
            android.widget.ListAdapter r3 = r1.f1126z
            if (r3 == 0) goto L_0x0326
            r2.setAdapter(r3)
            int r1 = r1.f1091A
            if (r1 < 0) goto L_0x0326
            r3 = 1
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0392m.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1349a.f1119s;
        if (nestedScrollView == null || !nestedScrollView.mo5317k(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1349a.f1119s;
        if (nestedScrollView == null || !nestedScrollView.mo5317k(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1349a.mo1108c(charSequence);
    }
}
