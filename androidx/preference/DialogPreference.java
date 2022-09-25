package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.p091b.C1875x;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class DialogPreference extends Preference {

    /* renamed from: a */
    public CharSequence f12693a;

    /* renamed from: b */
    public CharSequence f12694b;

    /* renamed from: c */
    public Drawable f12695c;

    /* renamed from: d */
    public CharSequence f12696d;

    /* renamed from: e */
    public CharSequence f12697e;

    /* renamed from: f */
    public int f12698f;

    public DialogPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8315c() {
        this.f12739k.mo8434g(this);
    }

    /* renamed from: d */
    public final void mo8316d(int i) {
        this.f12693a = this.f12738j.getString(i);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12851c, i, i2);
        String f = C1875x.m5119f(obtainStyledAttributes, 9, 0);
        this.f12693a = f;
        if (f == null) {
            this.f12693a = this.f12745q;
        }
        this.f12694b = C1875x.m5119f(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f12695c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.f12696d = C1875x.m5119f(obtainStyledAttributes, 11, 3);
        this.f12697e = C1875x.m5119f(obtainStyledAttributes, 10, 4);
        this.f12698f = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
