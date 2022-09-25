package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
/* compiled from: PG */
public class AppCompatSpinner extends Spinner {

    /* renamed from: e */
    private static final int[] f1807e = {16843505};

    /* renamed from: a */
    public final Context f1808a;

    /* renamed from: b */
    public C0535be f1809b;

    /* renamed from: c */
    int f1810c;

    /* renamed from: d */
    final Rect f1811d;

    /* renamed from: f */
    private final C0779y f1812f;

    /* renamed from: g */
    private C0587dc f1813g;

    /* renamed from: h */
    private SpinnerAdapter f1814h;

    /* renamed from: i */
    private final boolean f1815i;

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo1969a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            int i3 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max2++;
            i = i3;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1811d);
        return i2 + this.f1811d.left + this.f1811d.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1970b() {
        this.f1809b.mo2538k(C0524av.m1927b(this), C0524av.m1926a(this));
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0779y yVar = this.f1812f;
        if (yVar != null) {
            yVar.mo3306c();
        }
    }

    public final int getDropDownHorizontalOffset() {
        C0535be beVar = this.f1809b;
        return beVar != null ? beVar.mo2528a() : super.getDropDownHorizontalOffset();
    }

    public final int getDropDownVerticalOffset() {
        C0535be beVar = this.f1809b;
        return beVar != null ? beVar.mo2529b() : super.getDropDownVerticalOffset();
    }

    public final int getDropDownWidth() {
        return this.f1809b != null ? this.f1810c : super.getDropDownWidth();
    }

    public final Drawable getPopupBackground() {
        C0535be beVar = this.f1809b;
        if (beVar != null) {
            return beVar.mo2530c();
        }
        return super.getPopupBackground();
    }

    public final Context getPopupContext() {
        return this.f1808a;
    }

    public final CharSequence getPrompt() {
        C0535be beVar = this.f1809b;
        return beVar != null ? beVar.mo2531d() : super.getPrompt();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0535be beVar = this.f1809b;
        if (beVar != null && beVar.mo2541x()) {
            this.f1809b.mo2539m();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1809b != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1969a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1816a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0522at(this));
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0535be beVar = this.f1809b;
        boolean z = false;
        if (beVar != null && beVar.mo2541x()) {
            z = true;
        }
        savedState.f1816a = z;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0587dc dcVar = this.f1813g;
        if (dcVar == null || !dcVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0535be beVar = this.f1809b;
        if (beVar == null) {
            return super.performClick();
        }
        if (beVar.mo2541x()) {
            return true;
        }
        mo1970b();
        return true;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0779y yVar = this.f1812f;
        if (yVar != null) {
            yVar.mo3312i();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0779y yVar = this.f1812f;
        if (yVar != null) {
            yVar.mo3308e(i);
        }
    }

    public final void setDropDownHorizontalOffset(int i) {
        C0535be beVar = this.f1809b;
        if (beVar != null) {
            beVar.mo2535h(i);
            this.f1809b.mo2534g(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public final void setDropDownVerticalOffset(int i) {
        C0535be beVar = this.f1809b;
        if (beVar != null) {
            beVar.mo2537j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public final void setDropDownWidth(int i) {
        if (this.f1809b != null) {
            this.f1810c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        C0535be beVar = this.f1809b;
        if (beVar != null) {
            beVar.mo2533f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0678gm.m2375e().mo3100c(this.f1808a, i));
    }

    public final void setPrompt(CharSequence charSequence) {
        C0535be beVar = this.f1809b;
        if (beVar != null) {
            beVar.mo2536i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.AppCompatSpinner$SavedState */
    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0534bd();

        /* renamed from: a */
        boolean f1816a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1816a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1816a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, R.attr.spinnerStyle, i);
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1815i) {
            this.f1814h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1809b != null) {
            Context context = this.f1808a;
            if (context == null) {
                context = getContext();
            }
            this.f1809b.mo2532e(new C0527ay(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1811d = r0
            android.content.Context r0 = r8.getContext()
            android.support.p033v7.widget.C0730ik.m2467d(r8, r0)
            int[] r0 = android.support.p033v7.p034a.C0338a.f1087w
            r1 = 0
            android.support.v7.widget.ip r0 = android.support.p033v7.widget.C0735ip.m2473f(r9, r10, r0, r11, r1)
            android.support.v7.widget.y r2 = new android.support.v7.widget.y
            r2.<init>(r8)
            r8.f1812f = r2
            if (r13 == 0) goto L_0x0029
            androidx.a.a.b r2 = new androidx.a.a.b
            r2.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
            r8.f1808a = r2
            goto L_0x003c
        L_0x0029:
            android.content.res.TypedArray r13 = r0.f2596b
            r2 = 4
            int r13 = r13.getResourceId(r2, r1)
            if (r13 == 0) goto L_0x003a
            androidx.a.a.b r2 = new androidx.a.a.b
            r2.<init>((android.content.Context) r9, (int) r13)
            r8.f1808a = r2
            goto L_0x003c
        L_0x003a:
            r8.f1808a = r9
        L_0x003c:
            r13 = -1
            r2 = 0
            r3 = 1
            if (r12 != r13) goto L_0x0074
            int[] r12 = f1807e     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            android.content.res.TypedArray r12 = r9.obtainStyledAttributes(r10, r12, r11, r1)     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x0058 }
            if (r4 == 0) goto L_0x0051
            int r13 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x0058 }
        L_0x0051:
            if (r12 == 0) goto L_0x0056
            r12.recycle()
        L_0x0056:
            r12 = r13
            goto L_0x0074
        L_0x0058:
            r13 = move-exception
            goto L_0x005f
        L_0x005a:
            r9 = move-exception
            goto L_0x006e
        L_0x005c:
            r12 = move-exception
            r13 = r12
            r12 = r2
        L_0x005f:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r13)     // Catch:{ all -> 0x006c }
            if (r12 == 0) goto L_0x00c3
            r12.recycle()
            goto L_0x00c3
        L_0x006c:
            r9 = move-exception
            r2 = r12
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.recycle()
        L_0x0073:
            throw r9
        L_0x0074:
            r13 = 2
            if (r12 == 0) goto L_0x00b3
            if (r12 == r3) goto L_0x007a
            goto L_0x00c3
        L_0x007a:
            android.support.v7.widget.bc r12 = new android.support.v7.widget.bc
            android.content.Context r4 = r8.f1808a
            r12.<init>(r8, r4, r10, r11)
            android.content.Context r4 = r8.f1808a
            int[] r5 = android.support.p033v7.p034a.C0338a.f1087w
            android.support.v7.widget.ip r4 = android.support.p033v7.widget.C0735ip.m2473f(r4, r10, r5, r11, r1)
            android.content.res.TypedArray r5 = r4.f2596b
            r6 = 3
            r7 = -2
            int r5 = r5.getLayoutDimension(r6, r7)
            r8.f1810c = r5
            android.graphics.drawable.Drawable r5 = r4.mo3246b(r3)
            android.widget.PopupWindow r6 = r12.f2366q
            r6.setBackgroundDrawable(r5)
            android.content.res.TypedArray r5 = r0.f2596b
            java.lang.String r13 = r5.getString(r13)
            r12.f2101a = r13
            android.content.res.TypedArray r13 = r4.f2596b
            r13.recycle()
            r8.f1809b = r12
            android.support.v7.widget.as r13 = new android.support.v7.widget.as
            r13.<init>(r8, r8, r12)
            r8.f1813g = r13
            goto L_0x00c3
        L_0x00b3:
            android.support.v7.widget.ax r12 = new android.support.v7.widget.ax
            r12.<init>(r8)
            r8.f1809b = r12
            android.content.res.TypedArray r4 = r0.f2596b
            java.lang.String r13 = r4.getString(r13)
            r12.mo2536i(r13)
        L_0x00c3:
            android.content.res.TypedArray r12 = r0.f2596b
            java.lang.CharSequence[] r12 = r12.getTextArray(r1)
            if (r12 == 0) goto L_0x00dc
            android.widget.ArrayAdapter r13 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r13.<init>(r9, r1, r12)
            r9 = 2131627034(0x7f0e0c1a, float:1.8881321E38)
            r13.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r13)
        L_0x00dc:
            android.content.res.TypedArray r9 = r0.f2596b
            r9.recycle()
            r8.f1815i = r3
            android.widget.SpinnerAdapter r9 = r8.f1814h
            if (r9 == 0) goto L_0x00ec
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.f1814h = r2
        L_0x00ec:
            android.support.v7.widget.y r9 = r8.f1812f
            r9.mo3307d(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
