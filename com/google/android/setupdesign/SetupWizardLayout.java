package com.google.android.setupdesign;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.p3555d.C45301i;

/* compiled from: PG */
public class SetupWizardLayout extends TemplateLayout {
    public SetupWizardLayout(Context context) {
        super(context, 0, 0);
        m80716e((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m80716e(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.isInEditMode()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.google.android.setupcompat.template.i r0 = new com.google.android.setupcompat.template.i
            r1 = 0
            r0.<init>(r8, r1)
            java.lang.Class<com.google.android.setupcompat.template.i> r2 = com.google.android.setupcompat.template.C45282i.class
            r8.mo49131l(r2, r0)
            com.google.android.setupdesign.d.c r0 = new com.google.android.setupdesign.d.c
            r0.<init>(r8, r9, r10)
            java.lang.Class<com.google.android.setupdesign.d.c> r2 = com.google.android.setupdesign.p3555d.C45295c.class
            r8.mo49131l(r2, r0)
            com.google.android.setupdesign.d.a r0 = new com.google.android.setupdesign.d.a
            r0.<init>(r8, r9, r10)
            java.lang.Class<com.google.android.setupdesign.d.a> r2 = com.google.android.setupdesign.p3555d.C45293a.class
            r8.mo49131l(r2, r0)
            com.google.android.setupdesign.d.i r0 = new com.google.android.setupdesign.d.i
            r2 = 0
            r0.<init>(r8, r1, r2)
            java.lang.Class<com.google.android.setupdesign.d.i> r3 = com.google.android.setupdesign.p3555d.C45301i.class
            r8.mo49131l(r3, r0)
            com.google.android.setupdesign.d.g r0 = new com.google.android.setupdesign.d.g
            r0.<init>()
            java.lang.Class<com.google.android.setupdesign.d.g> r3 = com.google.android.setupdesign.p3555d.C45299g.class
            r8.mo49131l(r3, r0)
            com.google.android.setupdesign.d.j r0 = new com.google.android.setupdesign.d.j
            r0.<init>()
            java.lang.Class<com.google.android.setupdesign.d.j> r3 = com.google.android.setupdesign.p3555d.C45302j.class
            r8.mo49131l(r3, r0)
            r0 = 2131436221(0x7f0b22bd, float:1.8494306E38)
            android.view.View r0 = r8.mo49127h(r0)
            boolean r3 = r0 instanceof android.widget.ScrollView
            if (r3 == 0) goto L_0x0053
            r1 = r0
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
        L_0x0053:
            if (r1 == 0) goto L_0x006b
            boolean r0 = r1 instanceof com.google.android.setupdesign.view.BottomScrollView
            if (r0 == 0) goto L_0x005c
            com.google.android.setupdesign.view.BottomScrollView r1 = (com.google.android.setupdesign.view.BottomScrollView) r1
            goto L_0x006b
        L_0x005c:
            java.lang.String r0 = "Cannot set non-BottomScrollView. Found="
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "ScrollViewDelegate"
            android.util.Log.w(r1, r0)
        L_0x006b:
            android.content.Context r0 = r8.getContext()
            int[] r1 = com.google.android.setupdesign.C45318g.f118396o
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9, r1, r10, r2)
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r2)
            r0 = 1
            if (r10 == 0) goto L_0x0080
            r8.mo49204a(r10)
            goto L_0x0097
        L_0x0080:
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r0)
            if (r10 == 0) goto L_0x0097
            boolean r1 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L_0x0094
            r1 = r10
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            r1.setTileModeXY(r3, r4)
        L_0x0094:
            r8.mo49204a(r10)
        L_0x0097:
            r10 = 3
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r1 = 2
            r3 = 2131436240(0x7f0b22d0, float:1.8494345E38)
            if (r10 == 0) goto L_0x00b0
            android.view.View r2 = r8.mo49127h(r3)
            boolean r4 = r2 instanceof com.google.android.setupdesign.view.Illustration
            if (r4 == 0) goto L_0x010c
            com.google.android.setupdesign.view.Illustration r2 = (com.google.android.setupdesign.view.Illustration) r2
            r2.mo49257a(r10)
            goto L_0x010c
        L_0x00b0:
            r10 = 6
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r4 = 5
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r4)
            if (r10 == 0) goto L_0x010c
            if (r4 == 0) goto L_0x010c
            android.view.View r5 = r8.mo49127h(r3)
            boolean r6 = r5 instanceof com.google.android.setupdesign.view.Illustration
            if (r6 == 0) goto L_0x010c
            com.google.android.setupdesign.view.Illustration r5 = (com.google.android.setupdesign.view.Illustration) r5
            android.content.Context r6 = r8.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131034186(0x7f05004a, float:1.7678882E38)
            boolean r6 = r6.getBoolean(r7)
            if (r6 == 0) goto L_0x0106
            boolean r6 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x00ea
            r6 = r4
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.REPEAT
            r6.setTileModeX(r7)
            r7 = 48
            r6.setGravity(r7)
        L_0x00ea:
            boolean r6 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x00f6
            r6 = r10
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            r7 = 51
            r6.setGravity(r7)
        L_0x00f6:
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r1]
            r7[r2] = r4
            r7[r0] = r10
            r6.<init>(r7)
            r6.setAutoMirrored(r0)
            r10 = r6
            goto L_0x0109
        L_0x0106:
            r10.setAutoMirrored(r0)
        L_0x0109:
            r5.mo49257a(r10)
        L_0x010c:
            r10 = -1
            int r1 = r9.getDimensionPixelSize(r1, r10)
            if (r1 != r10) goto L_0x011e
            android.content.res.Resources r10 = r8.getResources()
            r1 = 2131172322(0x7f071be2, float:1.7959056E38)
            int r1 = r10.getDimensionPixelSize(r1)
        L_0x011e:
            android.view.View r10 = r8.mo49127h(r3)
            if (r10 == 0) goto L_0x0133
            int r2 = r10.getPaddingLeft()
            int r4 = r10.getPaddingRight()
            int r5 = r10.getPaddingBottom()
            r10.setPadding(r2, r1, r4, r5)
        L_0x0133:
            r10 = 4
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r9.getFloat(r10, r1)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.res.Resources r1 = r8.getResources()
            r2 = 2131172402(0x7f071c32, float:1.7959218E38)
            r1.getValue(r2, r10, r0)
            float r10 = r10.getFloat()
        L_0x0151:
            android.view.View r0 = r8.mo49127h(r3)
            boolean r1 = r0 instanceof com.google.android.setupdesign.view.Illustration
            if (r1 == 0) goto L_0x0163
            com.google.android.setupdesign.view.Illustration r0 = (com.google.android.setupdesign.view.Illustration) r0
            r0.f118412a = r10
            r0.invalidate()
            r0.requestLayout()
        L_0x0163:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.SetupWizardLayout.m80716e(android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public final void mo49204a(Drawable drawable) {
        View h = mo49127h(R.id.sud_layout_decor);
        if (h != null) {
            h.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo49117b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_template;
        }
        return mo49128i(layoutInflater, 2132150224, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ViewGroup mo49118c(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return (ViewGroup) findViewById(i);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            Log.w("SetupWizardLayout", "Ignoring restore instance state ".concat(String.valueOf(String.valueOf(parcelable))));
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ((C45301i) mo49129j(C45301i.class)).mo49235c(savedState.f118318a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C45301i iVar = (C45301i) mo49129j(C45301i.class);
        boolean z = true;
        View h = iVar.f118356a.mo49127h(true != iVar.f118357b ? R.id.sud_layout_progress : R.id.sud_glif_progress_bar);
        if (h == null || h.getVisibility() != 0) {
            z = false;
        }
        savedState.f118318a = z;
        return savedState;
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C45319h();

        /* renamed from: a */
        boolean f118318a = false;

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z = false;
            this.f118318a = parcel.readInt() != 0 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f118318a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SetupWizardLayout(Context context, int i) {
        this(context, i, 0);
    }

    public SetupWizardLayout(Context context, int i, int i2) {
        super(context, i, i2);
        m80716e((AttributeSet) null, R.attr.sudLayoutTheme);
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80716e(attributeSet, R.attr.sudLayoutTheme);
    }

    public SetupWizardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80716e(attributeSet, i);
    }
}
