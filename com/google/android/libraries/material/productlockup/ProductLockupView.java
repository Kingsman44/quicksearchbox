package com.google.android.libraries.material.productlockup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: PG */
public class ProductLockupView extends ViewGroup {

    /* renamed from: d */
    private static final Pattern f77666d = Pattern.compile(String.format(" %1$s|%1$s ", new Object[]{"Google"}));

    /* renamed from: e */
    private static final int[] f77667e = {1};

    /* renamed from: f */
    private static final int[] f77668f = {2};

    /* renamed from: g */
    private static final int[] f77669g = {1, 2};

    /* renamed from: h */
    private static Typeface f77670h;

    /* renamed from: a */
    final ImageView f77671a;

    /* renamed from: b */
    final TextView f77672b;

    /* renamed from: c */
    C28573b f77673c;

    /* renamed from: i */
    private final C28573b f77674i;

    /* renamed from: j */
    private final C28573b f77675j;

    /* renamed from: k */
    private Drawable f77676k;

    /* renamed from: l */
    private int f77677l;

    /* renamed from: m */
    private String f77678m;

    /* renamed from: n */
    private boolean f77679n;

    /* renamed from: o */
    private boolean f77680o;

    /* renamed from: p */
    private boolean f77681p;

    public ProductLockupView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final int m53440a(C28573b bVar) {
        return Math.round(((float) bVar.f77688e) * (true != this.f77680o ? 0.15f : 1.0f));
    }

    /* renamed from: b */
    private final void m53441b(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        if (C2043bi.m5577f(this) == 1 && !this.f77679n) {
            z = true;
        }
        int measuredWidth = z ? getMeasuredWidth() - i3 : i;
        if (z) {
            i3 = getMeasuredWidth() - i;
        }
        view.layout(measuredWidth, i2, i3, i4);
    }

    /* renamed from: c */
    private final void m53442c() {
        this.f77671a.measure(View.MeasureSpec.makeMeasureSpec(this.f77673c.f77686c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f77673c.f77687d, 1073741824));
    }

    /* renamed from: d */
    private final void m53443d() {
        this.f77672b.setTextSize(0, this.f77673c.f77684a);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f77672b.measure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: e */
    private final void m53444e(int i) {
        C28573b bVar;
        if (i == -1) {
            bVar = null;
        } else if (i == 0 || i == 1) {
            bVar = this.f77674i;
        } else if (i == 2) {
            bVar = this.f77675j;
        } else {
            throw new IllegalStateException("Unrecognized sizingMode: " + i);
        }
        this.f77673c = bVar;
    }

    /* renamed from: f */
    private final boolean m53445f(int i, boolean z) {
        int i2;
        if (z) {
            C28573b bVar = this.f77673c;
            i2 = bVar.f77686c + m53440a(bVar);
        } else {
            i2 = 0;
        }
        m53443d();
        if (i2 + this.f77672b.getMeasuredWidth() <= i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f77671a.getVisibility() != 8) {
            int measuredWidth = (this.f77672b.getVisibility() == 8 || this.f77681p) ? 0 : this.f77672b.getMeasuredWidth() + m53440a(this.f77673c);
            int i5 = this.f77673c.f77685b;
            m53441b(this.f77671a, measuredWidth, i5, measuredWidth + this.f77671a.getMeasuredWidth(), i5 + this.f77671a.getMeasuredHeight());
        }
        if (this.f77672b.getVisibility() != 8) {
            int a = (this.f77671a.getVisibility() == 8 || !this.f77681p) ? 0 : m53440a(this.f77673c) + this.f77671a.getMeasuredWidth();
            m53441b(this.f77672b, a, 0, a + this.f77672b.getMeasuredWidth(), this.f77672b.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            android.widget.ImageView r8 = r6.f77671a
            r0 = 0
            r8.setVisibility(r0)
            android.widget.TextView r8 = r6.f77672b
            r8.setVisibility(r0)
            java.lang.String r8 = r6.f77678m
            java.lang.String r1 = "Google"
            boolean r8 = r8.startsWith(r1)
            r6.f77681p = r8
            java.lang.String r8 = r6.f77678m
            boolean r8 = r8.endsWith(r1)
            int r1 = r6.f77677l
            r2 = -1
            r3 = 1
            if (r1 == r2) goto L_0x0049
            if (r1 == 0) goto L_0x0046
            if (r1 == r3) goto L_0x0043
            r2 = 2
            if (r1 != r2) goto L_0x002f
            int[] r1 = f77668f
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Unrecognized sizingMode: "
            r8.<init>(r0)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0043:
            int[] r1 = f77667e
            goto L_0x004a
        L_0x0046:
            int[] r1 = f77669g
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            boolean r2 = r6.f77681p
            if (r2 != 0) goto L_0x0050
            if (r8 == 0) goto L_0x0069
        L_0x0050:
            int r8 = r1.length
            r2 = 0
        L_0x0052:
            if (r2 >= r8) goto L_0x0069
            r4 = r1[r2]
            r6.m53444e(r4)
            boolean r4 = r6.m53445f(r7, r3)
            if (r4 == 0) goto L_0x0066
            r6.m53442c()
            r6.m53443d()
            goto L_0x0093
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0069:
            int r8 = r1.length
            r2 = 0
        L_0x006b:
            r4 = 8
            if (r2 >= r8) goto L_0x0086
            r5 = r1[r2]
            r6.m53444e(r5)
            boolean r5 = r6.m53445f(r7, r0)
            if (r5 == 0) goto L_0x0083
            r6.m53443d()
            android.widget.ImageView r7 = r6.f77671a
            r7.setVisibility(r4)
            goto L_0x0093
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0086:
            r6.m53444e(r3)
            r6.f77681p = r3
            r6.m53442c()
            android.widget.TextView r7 = r6.f77672b
            r7.setVisibility(r4)
        L_0x0093:
            android.widget.ImageView r7 = r6.f77671a
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            android.widget.TextView r8 = r6.f77672b
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            if (r7 == 0) goto L_0x00b0
            android.widget.ImageView r8 = r6.f77671a
            int r0 = r8.getMeasuredWidth()
        L_0x00b0:
            if (r3 == 0) goto L_0x00b9
            android.widget.TextView r8 = r6.f77672b
            int r8 = r8.getMeasuredWidth()
            int r0 = r0 + r8
        L_0x00b9:
            if (r7 == 0) goto L_0x00c4
            if (r3 == 0) goto L_0x00c4
            com.google.android.libraries.material.productlockup.b r7 = r6.f77673c
            int r7 = r6.m53440a(r7)
            int r0 = r0 + r7
        L_0x00c4:
            r7 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            android.widget.ImageView r0 = r6.f77671a
            int r0 = r0.getMeasuredHeight()
            com.google.android.libraries.material.productlockup.b r1 = r6.f77673c
            int r1 = r1.f77685b
            int r0 = r0 + r1
            android.widget.TextView r1 = r6.f77672b
            int r1 = r1.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r1)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r6.setMeasuredDimension(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.productlockup.ProductLockupView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f77678m = savedState.f77682a;
        this.f77680o = savedState.f77683b;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f77682a = this.f77678m;
        savedState.f77683b = this.f77680o;
        return savedState;
    }

    public ProductLockupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C28572a();

        /* renamed from: a */
        String f77682a;

        /* renamed from: b */
        boolean f77683b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f77682a = parcel.readString();
            this.f77683b = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f77682a);
            parcel.writeInt(this.f77683b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductLockupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        int i2;
        Context context2 = context;
        if (f77670h == null) {
            f77670h = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.f77674i = new C28573b(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.f77675j = new C28573b(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.getClass();
        this.f77671a = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        textView.getClass();
        this.f77672b = textView;
        textView.setTypeface(f77670h);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C28574c.f77689a, i, 2132151378);
        if (obtainStyledAttributes.hasValue(2)) {
            this.f77676k = obtainStyledAttributes.getDrawable(2);
        } else {
            this.f77676k = C0678gm.m2375e().mo3100c(context2, R.drawable.googlelogo_standard_color_74x24);
        }
        int i3 = obtainStyledAttributes.getInt(1, 0);
        this.f77677l = i3;
        m53444e(i3);
        textView.setTextColor(obtainStyledAttributes.getColor(4, 0));
        String string = obtainStyledAttributes.getString(0);
        String trim = (string == null ? BuildConfig.FLAVOR : string).trim();
        this.f77678m = trim;
        this.f77680o = f77666d.matcher(trim).find();
        this.f77679n = TextUtils.isEmpty(string) || Charset.forName("ISO-8859-1").newEncoder().canEncode(string);
        String str2 = "Google";
        if (this.f77678m.startsWith(str2)) {
            str = this.f77678m.substring(6).trim();
        } else if (this.f77678m.endsWith(str2)) {
            String str3 = this.f77678m;
            str = str3.substring(0, str3.length() - 6).trim();
        } else {
            str = this.f77678m;
        }
        textView.setText(str);
        setContentDescription(!this.f77678m.isEmpty() ? this.f77678m : str2);
        requestLayout();
        int i4 = obtainStyledAttributes.getInt(3, 0);
        if (i4 == 0) {
            imageView.setImageDrawable(this.f77676k);
        } else {
            if (i4 == 1) {
                i2 = R.color.google_black;
            } else if (i4 == 2) {
                i2 = R.color.google_white;
            } else if (i4 == 3) {
                i2 = R.color.google_grey700;
            } else {
                throw new IllegalStateException("Unrecognized logoColor: " + i4);
            }
            Drawable mutate = this.f77676k.mutate();
            C1929b.m5225f(mutate, C1878d.m5128a(getContext(), i2));
            imageView.setImageDrawable(mutate);
        }
        obtainStyledAttributes.recycle();
    }
}
